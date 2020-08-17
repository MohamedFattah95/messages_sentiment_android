package com.mohamedfattah95.messages_sentiment.ui.main;

import com.mohamedfattah95.messages_sentiment.data.DataManager;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.Locations;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.TObject;
import com.mohamedfattah95.messages_sentiment.ui.base.BasePresenter;
import com.mohamedfattah95.messages_sentiment.utils.rx.SchedulerProvider;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created on : Feb 11, 2019
 * Author     : AndroidWave
 */
public class MainPresenter<V extends MainMvpView> extends BasePresenter<V>
        implements MainMvpPresenter<V> {
    @Inject
    public MainPresenter(DataManager manager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(manager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void getMessages() {

        getMvpView().showLoading();

        getCompositeDisposable().add(getDataManager()
                .getMessagesApiCall()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (!isViewAttached()) {
                        return;
                    }

                    getMvpView().hideLoading();

                    getMvpView().updateMessages(response.getFeed().getEntry());


                }, error -> {
                    if (!isViewAttached()) {
                        return;
                    }
                    getMvpView().hideLoading();

                    /**
                     * manage all kind of error in single place
                     */
                    handleApiError(error);
                }));

    }

    private int i = 0;
    private List<Locations> locations = new ArrayList<>();

    @Override
    public void getLocations(List<String> places, List<TObject> tObjects) {

        getCompositeDisposable().add(getDataManager()
                .getLatLongApiCall(places.get(i), "cb5fa564a2ca439dafdccf20fdfec150")
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (!isViewAttached()) {
                        return;
                    }

                    if (!response.getResults().isEmpty()) {
                        locations.add(new Locations(response.getResults().get(0).getGeometry().getLat(),
                                response.getResults().get(0).getGeometry().getLng(), tObjects.get(i).getSentiment()));
                    }

                    if (places.size() == (i + 1)) {
                        getMvpView().updateLocations(locations);
                        return;
                    }

                    i++;
                    getLocations(places, tObjects);


                }, error -> {
                    if (!isViewAttached()) {
                        return;
                    }
                    getMvpView().hideLoading();

                    /**
                     * manage all kind of error in single place
                     */
                    handleApiError(error);
                }));
    }
}
