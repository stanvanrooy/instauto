package com.facebook.cameracore.mediapipeline.services.locale.interfaces;

public interface LocaleDataSource {
    String getDeviceLocaleIdentifier();

    void setDeviceLocaleIdentifier(String str);
}
