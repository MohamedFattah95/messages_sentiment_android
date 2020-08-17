package com.mohamedfattah95.messages_sentiment.data.network.pojo;

import com.google.gson.annotations.SerializedName;

public class TObject {


    private int messageid;
    private String message;
    private String sentiment;

    public TObject(String message, String sentiment) {
        this.message = message;
        this.sentiment = sentiment;
    }

    public int getMessageid() {
        return messageid;
    }

    public void setMessageid(int messageid) {
        this.messageid = messageid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }
}
