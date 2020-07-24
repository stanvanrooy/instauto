package com.facebook.cameracore.mediapipeline.services.music.interfaces;

public class MusicItem {
    public final String mArtist;
    public final String mGenre;
    public final String mTitle;

    public MusicItem(String str, String str2, String str3) {
        this.mTitle = str;
        this.mArtist = str2;
        this.mGenre = str3;
    }

    public String getArtist() {
        return this.mArtist;
    }

    public String getGenre() {
        return this.mGenre;
    }

    public String getTitle() {
        return this.mTitle;
    }
}
