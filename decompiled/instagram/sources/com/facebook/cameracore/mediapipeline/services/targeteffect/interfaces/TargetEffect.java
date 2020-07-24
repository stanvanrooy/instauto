package com.facebook.cameracore.mediapipeline.services.targeteffect.interfaces;

public interface TargetEffect {
    double getDownloadProgress();

    String getEffectPath();

    String getFailureReason();

    int getStatusCode();

    void startDownload(String str);
}
