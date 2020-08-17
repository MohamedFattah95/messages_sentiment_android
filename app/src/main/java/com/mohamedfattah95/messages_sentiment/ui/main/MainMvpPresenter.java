package com.mohamedfattah95.messages_sentiment.ui.main;


import com.mohamedfattah95.messages_sentiment.data.network.pojo.TObject;
import com.mohamedfattah95.messages_sentiment.ui.base.MvpPresenter;

import java.util.List;

/**
 * Created on : Feb 11, 2019
 * Author     : AndroidWave
 */
public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {


    void getMessages();

    void getLocations(List<String> places, List<TObject> tObjects);
}
