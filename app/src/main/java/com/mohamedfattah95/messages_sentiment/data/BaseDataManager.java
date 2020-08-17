package com.mohamedfattah95.messages_sentiment.data;

import android.content.Context;

import com.mohamedfattah95.messages_sentiment.data.network.RestApiHelper;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.LocationResponse;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.MessagesResponse;
import com.mohamedfattah95.messages_sentiment.di.ApplicationContext;

import javax.inject.Inject;

import io.reactivex.Single;

public class BaseDataManager implements DataManager {
    private static final String TAG = "BaseDataManager";


    private final Context mContext;
    private final RestApiHelper mApiHelper;

    @Inject
    public BaseDataManager(@ApplicationContext Context context,
                           RestApiHelper apiHelper) {
        mContext = context;
        mApiHelper = apiHelper;
    }


    @Override
    public Single<MessagesResponse> getMessagesApiCall() {
        return mApiHelper.getMessagesApiCall();
    }

    @Override
    public Single<LocationResponse> getLatLongApiCall(String place, String key) {
        return mApiHelper.getLatLongApiCall(place, key);
    }
}
