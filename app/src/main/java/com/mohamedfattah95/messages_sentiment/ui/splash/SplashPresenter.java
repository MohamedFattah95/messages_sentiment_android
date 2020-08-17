package com.mohamedfattah95.messages_sentiment.ui.splash;

import com.mohamedfattah95.messages_sentiment.data.DataManager;
import com.mohamedfattah95.messages_sentiment.ui.base.BasePresenter;
import com.mohamedfattah95.messages_sentiment.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V>
        implements SplashMvpPresenter<V> {
    @Inject
    public SplashPresenter(DataManager manager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(manager, schedulerProvider, compositeDisposable);
    }

}
