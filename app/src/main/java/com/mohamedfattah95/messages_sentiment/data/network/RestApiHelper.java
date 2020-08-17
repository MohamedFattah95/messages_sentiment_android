package com.mohamedfattah95.messages_sentiment.data.network;

import com.mohamedfattah95.messages_sentiment.data.network.pojo.LocationResponse;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.MessagesResponse;

import io.reactivex.Single;

public interface RestApiHelper {

    Single<MessagesResponse> getMessagesApiCall();

    Single<LocationResponse> getLatLongApiCall(String place,  String key);
}
