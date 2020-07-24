package com.facebook.cameracore.mediapipeline.arclass.common;

public interface ARClassConfigSource {
    int getDefaultARClassValue();

    long getRemoteRefreshIntervalSeconds();
}
