package com.mohamedfattah95.messages_sentiment.data.network;

import com.mohamedfattah95.messages_sentiment.data.network.pojo.MessagesResponse;

import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface NetworkService {
    /**
     * @return Observable feed response
     */

    @GET("basic?alt=json")
    Single<MessagesResponse> getMessagesApiCall();

}
