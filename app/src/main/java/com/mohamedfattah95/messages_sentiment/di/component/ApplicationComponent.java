package com.mohamedfattah95.messages_sentiment.di.component;

import android.app.Application;
import android.content.Context;

import com.mohamedfattah95.messages_sentiment.data.DataManager;
import com.mohamedfattah95.messages_sentiment.di.ApplicationContext;
import com.mohamedfattah95.messages_sentiment.di.module.ApplicationModule;
import com.mohamedfattah95.messages_sentiment.root.WaveApp;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(WaveApp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
//    @Component.Builder
//    interface Builder {
//        ApplicationComponent build();
//
//        Builder applicationModule(ApplicationModule applicationModule);
//
//        DataManager getDataManager();
//    }


}
