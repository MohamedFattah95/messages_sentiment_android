package com.mohamedfattah95.messages_sentiment.ui.splash;

import android.os.Bundle;
import android.os.Handler;

import com.mohamedfattah95.messages_sentiment.R;
import com.mohamedfattah95.messages_sentiment.ui.base.BaseActivity;
import com.mohamedfattah95.messages_sentiment.ui.main.MainActivity;
import com.mohamedfattah95.messages_sentiment.utils.LanguageHelper;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity implements SplashMvpView {

    @Inject
    SplashMvpPresenter<SplashMvpView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LanguageHelper.setLanguage(this, LanguageHelper.getLanguage(this));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        mPresenter.onAttach(SplashActivity.this);


        new Handler().postDelayed(this::setUp, 3000);


    }

    @Override
    protected void setUp() {

        startActivity(MainActivity.getStartIntent(this));
        finish();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDetach();
    }

}

