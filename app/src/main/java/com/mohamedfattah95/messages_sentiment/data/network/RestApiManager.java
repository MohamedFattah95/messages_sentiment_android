package com.mohamedfattah95.messages_sentiment.data.network;

import com.mohamedfattah95.messages_sentiment.data.network.pojo.LocationResponse;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.MessagesResponse;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

@Singleton
public class RestApiManager implements RestApiHelper {

    private NetworkService mService;
    private NetworkService2 mService2;

    @Inject
    public RestApiManager(NetworkService apiService, NetworkService2 apiService2) {
        mService = apiService;
        mService2 = apiService2;
    }


    @Override
    public Single<MessagesResponse> getMessagesApiCall() {
        return mService.getMessagesApiCall();
    }

    @Override
    public Single<LocationResponse> getLatLongApiCall(String place, String key) {
        return mService2.getLatLongApiCall(place, key);
    }
}
