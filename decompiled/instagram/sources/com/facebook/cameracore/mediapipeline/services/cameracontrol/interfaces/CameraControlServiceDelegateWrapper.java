package com.facebook.cameracore.mediapipeline.services.cameracontrol.interfaces;

import p000X.AnonymousClass43B;
import p000X.C935442y;

public class CameraControlServiceDelegateWrapper {
    public final CameraControlServiceDelegate mDelegate;

    public boolean canUpdateCaptureDevicePosition(int i) {
        AnonymousClass43B r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= AnonymousClass43B.values().length) {
            r0 = AnonymousClass43B.Back;
        } else {
            r0 = AnonymousClass43B.values()[i];
        }
        return cameraControlServiceDelegate.canUpdateCaptureDevicePosition(r0);
    }

    public long getExposureTime() {
        return this.mDelegate.getExposureTime();
    }

    public int getIso() {
        return this.mDelegate.getIso();
    }

    public long getMaxExposureTime() {
        return this.mDelegate.getMaxExposureTime();
    }

    public int getMaxIso() {
        return this.mDelegate.getMaxIso();
    }

    public long getMinExposureTime() {
        return this.mDelegate.getMinExposureTime();
    }

    public int getMinIso() {
        return this.mDelegate.getMinIso();
    }

    public boolean isFocusModeSupported(int i) {
        C935442y r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= C935442y.values().length) {
            r0 = C935442y.AutoFocus;
        } else {
            r0 = C935442y.values()[i];
        }
        return cameraControlServiceDelegate.isFocusModeSupported(r0);
    }

    public boolean isLockExposureAndFocusSupported() {
        return this.mDelegate.isLockExposureAndFocusSupported();
    }

    public void lockExposureAndFocus(long j, int i) {
        this.mDelegate.lockExposureAndFocus(j, i);
    }

    public void unlockExposureAndFocus() {
        this.mDelegate.unlockExposureAndFocus();
    }

    public void updateCaptureDevicePosition(int i) {
        AnonymousClass43B r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= AnonymousClass43B.values().length) {
            r0 = AnonymousClass43B.Back;
        } else {
            r0 = AnonymousClass43B.values()[i];
        }
        cameraControlServiceDelegate.updateCaptureDevicePosition(r0);
    }

    public void updateFocusMode(int i) {
        C935442y r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= C935442y.values().length) {
            r0 = C935442y.AutoFocus;
        } else {
            r0 = C935442y.values()[i];
        }
        cameraControlServiceDelegate.updateFocusMode(r0);
    }

    public CameraControlServiceDelegateWrapper(CameraControlServiceDelegate cameraControlServiceDelegate) {
        this.mDelegate = cameraControlServiceDelegate;
    }
}
