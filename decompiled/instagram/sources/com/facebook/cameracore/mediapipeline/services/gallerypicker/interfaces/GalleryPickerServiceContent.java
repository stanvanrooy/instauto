package com.facebook.cameracore.mediapipeline.services.gallerypicker.interfaces;

public class GalleryPickerServiceContent {
    public final String mFilePath;
    public final int mHeight;
    public final boolean mIsPhoto;
    public final int mOrientation;
    public final int mWidth;

    public GalleryPickerServiceContent(int i, int i2, int i3, String str, boolean z) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mOrientation = i3;
        this.mFilePath = str;
        this.mIsPhoto = z;
    }

    public String getFilePath() {
        return this.mFilePath;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isPhoto() {
        return this.mIsPhoto;
    }
}
