package com.mohamedfattah95.messages_sentiment.data.network.pojo;

public class Locations {

    double latitude, longitude;
    String sentiment;

    public Locations(double latitude, double longitude, String sentiment) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.sentiment = sentiment;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }
}
