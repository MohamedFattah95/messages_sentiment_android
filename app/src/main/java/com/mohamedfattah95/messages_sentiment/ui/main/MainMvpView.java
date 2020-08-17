package com.mohamedfattah95.messages_sentiment.ui.main;


import com.mohamedfattah95.messages_sentiment.data.network.pojo.Locations;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.MessagesResponse;
import com.mohamedfattah95.messages_sentiment.ui.base.MvpView;

import java.util.List;

/**
 * Created on : Feb 11, 2019
 * Author     : AndroidWave
 */
public interface MainMvpView extends MvpView {

    void updateMessages(List<MessagesResponse.FeedBean.EntryBean> entry);

    void updateLocations(List<Locations> locations);
}
