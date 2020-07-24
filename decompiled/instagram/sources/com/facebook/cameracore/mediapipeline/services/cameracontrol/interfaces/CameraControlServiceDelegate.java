package com.facebook.cameracore.mediapipeline.services.cameracontrol.interfaces;

import p000X.AnonymousClass43B;
import p000X.C935442y;

public interface CameraControlServiceDelegate {
    boolean canUpdateCaptureDevicePosition(AnonymousClass43B r1);

    long getExposureTime();

    int getIso();

    long getMaxExposureTime();

    int getMaxIso();

    long getMinExposureTime();

    int getMinIso();

    boolean isFocusModeSupported(C935442y r1);

    boolean isLockExposureAndFocusSupported();

    void lockExposureAndFocus(long j, int i);

    void unlockExposureAndFocus();

    void updateCaptureDevicePosition(AnonymousClass43B r1);

    void updateFocusMode(C935442y r1);
}
