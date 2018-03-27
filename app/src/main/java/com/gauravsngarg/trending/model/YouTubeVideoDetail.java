package com.gauravsngarg.trending.model;

import java.net.URL;

/**
 * Created by GG on 26/03/18.
 */

public class YouTubeVideoDetail {
    private int videoID;
    private URL videoURL;
    private String title;
    private String description;

    public YouTubeVideoDetail(int videoID, URL videoURL, String title, String description) {
        this.videoID = videoID;
        this.videoURL = videoURL;
        this.title = title;
        this.description = description;
    }

    public int getVideoID() {
        return videoID;
    }

    public void setVideoID(int videoID) {
        this.videoID = videoID;
    }

    public URL getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(URL videoURL) {
        this.videoURL = videoURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
