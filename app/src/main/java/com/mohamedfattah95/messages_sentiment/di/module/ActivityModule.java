package com.mohamedfattah95.messages_sentiment.di.module;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.mohamedfattah95.messages_sentiment.di.ActivityContext;
import com.mohamedfattah95.messages_sentiment.di.PerActivity;
import com.mohamedfattah95.messages_sentiment.ui.main.MainMvpPresenter;
import com.mohamedfattah95.messages_sentiment.ui.main.MainMvpView;
import com.mohamedfattah95.messages_sentiment.ui.main.MainPresenter;
import com.mohamedfattah95.messages_sentiment.ui.main.MessagesAdapter;
import com.mohamedfattah95.messages_sentiment.ui.splash.SplashMvpPresenter;
import com.mohamedfattah95.messages_sentiment.ui.splash.SplashMvpView;
import com.mohamedfattah95.messages_sentiment.ui.splash.SplashPresenter;
import com.mohamedfattah95.messages_sentiment.utils.rx.AppSchedulerProvider;
import com.mohamedfattah95.messages_sentiment.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }


    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    MessagesAdapter provideMessagesAdapter() {
        return new MessagesAdapter(new ArrayList<>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager() {
        return new LinearLayoutManager(mActivity);
    }

}