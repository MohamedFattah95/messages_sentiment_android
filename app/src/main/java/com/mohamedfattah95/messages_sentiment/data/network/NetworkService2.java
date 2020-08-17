package com.mohamedfattah95.messages_sentiment.data.network;

import com.mohamedfattah95.messages_sentiment.data.network.pojo.LocationResponse;
import com.mohamedfattah95.messages_sentiment.data.network.pojo.MessagesResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NetworkService2 {
    /**
     * @return Observable feed response
     */

    @GET("json?")
    Single<LocationResponse> getLatLongApiCall(@Query("q") String place, @Query("key") String key);

}
