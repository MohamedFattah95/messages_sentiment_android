package com.mohamedfattah95.messages_sentiment.ui.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.mohamedfattah95.messages_sentiment.R;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.Locations;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.MessagesResponse;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.TObject;
import com.mohamedfattah95.messages_sentiment.ui.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MainMvpView, OnMapReadyCallback, MessagesAdapter.Callback {

    @Inject
    MainMvpPresenter<MainMvpView> mPresenter;
    @Inject
    LinearLayoutManager linearLayoutManager;
    @Inject
    MessagesAdapter messagesAdapter;

    @BindView(R.id.rv_messages)
    RecyclerView rvMessages;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    private GoogleMap mMap;
    List<Locations> locations;


    public static Intent getStartIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        mPresenter.onAttach(MainActivity.this);
        messagesAdapter.setCallback(this);

        setSupportActionBar(toolbar);

        setUp();

    }

    @Override
    protected void setUp() {


        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        rvMessages.setLayoutManager(linearLayoutManager);
        rvMessages.setAdapter(messagesAdapter);

        mPresenter.getMessages();


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        googleMap.getUiSettings().setZoomControlsEnabled(true);

        // Clears the previously touched position
        mMap.clear();

        if (locations != null && !locations.isEmpty()) {

            final LatLngBounds.Builder builder = new LatLngBounds.Builder();

            for (int i = 0; i < locations.size(); i++) {

                MarkerOptions markerOptions = new MarkerOptions()
                        .position(new LatLng(locations.get(i).getLatitude(), locations.get(i).getLongitude()))
                        .title(locations.get(i).getSentiment());

                if (locations.get(i).getSentiment().equalsIgnoreCase("Neutral"))
                    googleMap.addMarker(markerOptions.icon(bitmapDescriptorFromVector(this, R.drawable.ic_pin_green)));

                if (locations.get(i).getSentiment().equalsIgnoreCase("Negative"))
                    googleMap.addMarker(markerOptions.icon(bitmapDescriptorFromVector(this, R.drawable.ic_pin_red)));

                if (locations.get(i).getSentiment().equalsIgnoreCase("Positive"))
                    googleMap.addMarker(markerOptions.icon(bitmapDescriptorFromVector(this, R.drawable.ic_pin_blue)));


                LatLng objLatLng = new LatLng(locations.get(i).getLatitude(), locations.get(i).getLongitude());
                builder.include(objLatLng);

            }

            mMap.setOnMapLoadedCallback(() -> {

                LatLngBounds bounds = builder.build();

                googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, 100));

            });


        }

    }

    @Override
    public void updateMessages(List<MessagesResponse.FeedBean.EntryBean> entry) {

        List<TObject> tObjects = new ArrayList<>();
        List<String> places = new ArrayList<>();
        for (int i = 0; i < entry.size(); i++) {

            String[] split1 = entry.get(i).getContent().get_$T().split(",");
            String[] split2 = split1[1].split(":");
            tObjects.add(new TObject(split2[1],
                    entry.get(i).getContent().get_$T().substring(entry.get(i).getContent().get_$T().lastIndexOf(" ") + 1)));

            places.add(split2[1]);
        }

        mPresenter.getLocations(places, tObjects);

        messagesAdapter.addItems(tObjects);


    }

    @Override
    public void updateLocations(List<Locations> locations) {

        this.locations = locations;

        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_frag);
        supportMapFragment.getMapAsync(this);

    }

    private BitmapDescriptor bitmapDescriptorFromVector(Context context, int vectorResId) {
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorResId);
        vectorDrawable.setBounds(0, 0, vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight());
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.refresh) {
            setUp();
        }
        return true;
    }
}
