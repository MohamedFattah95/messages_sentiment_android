package com.mohamedfattah95.messages_sentiment.di.component;


import com.mohamedfattah95.messages_sentiment.di.PerActivity;
import com.mohamedfattah95.messages_sentiment.di.module.ActivityModule;
import com.mohamedfattah95.messages_sentiment.ui.main.MainActivity;
import com.mohamedfattah95.messages_sentiment.ui.splash.SplashActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(SplashActivity activity);

}