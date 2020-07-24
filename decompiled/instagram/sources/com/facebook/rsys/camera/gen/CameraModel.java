package com.facebook.rsys.camera.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.AnonymousClass92M;

public class CameraModel {
    public static AnonymousClass921 CONVERTER = new AnonymousClass92M();
    public final int cameraDevicePosition;
    public final boolean cameraEverOn;
    public final boolean cameraOn;
    public final boolean cameraPaused;
    public final int cameraState;
    public final boolean canSwitchCamera;
    public final boolean deviceHasCamera;
    public final int targetCaptureResolutionHeight;
    public final int targetCaptureResolutionWidth;
    public final int targetFps;
    public final boolean userHasDeclinedVideoPrompt;

    public static native CameraModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CameraModel)) {
            return false;
        }
        CameraModel cameraModel = (CameraModel) obj;
        if (this.cameraOn == cameraModel.cameraOn && this.cameraState == cameraModel.cameraState && this.cameraPaused == cameraModel.cameraPaused && this.deviceHasCamera == cameraModel.deviceHasCamera && this.canSwitchCamera == cameraModel.canSwitchCamera && this.cameraDevicePosition == cameraModel.cameraDevicePosition && this.cameraEverOn == cameraModel.cameraEverOn && this.userHasDeclinedVideoPrompt == cameraModel.userHasDeclinedVideoPrompt && this.targetFps == cameraModel.targetFps && this.targetCaptureResolutionWidth == cameraModel.targetCaptureResolutionWidth && this.targetCaptureResolutionHeight == cameraModel.targetCaptureResolutionHeight) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((true + (this.cameraOn ? 1 : 0)) * 31) + this.cameraState) * 31) + (this.cameraPaused ? 1 : 0)) * 31) + (this.deviceHasCamera ? 1 : 0)) * 31) + (this.canSwitchCamera ? 1 : 0)) * 31) + this.cameraDevicePosition) * 31) + (this.cameraEverOn ? 1 : 0)) * 31) + (this.userHasDeclinedVideoPrompt ? 1 : 0)) * 31) + this.targetFps) * 31) + this.targetCaptureResolutionWidth) * 31) + this.targetCaptureResolutionHeight;
    }

    public String toString() {
        return "CameraModel{cameraOn=" + this.cameraOn + "," + "cameraState=" + this.cameraState + "," + "cameraPaused=" + this.cameraPaused + "," + "deviceHasCamera=" + this.deviceHasCamera + "," + "canSwitchCamera=" + this.canSwitchCamera + "," + "cameraDevicePosition=" + this.cameraDevicePosition + "," + "cameraEverOn=" + this.cameraEverOn + "," + "userHasDeclinedVideoPrompt=" + this.userHasDeclinedVideoPrompt + "," + "targetFps=" + this.targetFps + "," + "targetCaptureResolutionWidth=" + this.targetCaptureResolutionWidth + "," + "targetCaptureResolutionHeight=" + this.targetCaptureResolutionHeight + "}";
    }

    public CameraModel(boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, boolean z5, boolean z6, int i3, int i4, int i5) {
        AnonymousClass920.A00(Boolean.valueOf(z));
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Boolean.valueOf(z2));
        AnonymousClass920.A00(Boolean.valueOf(z3));
        AnonymousClass920.A00(Boolean.valueOf(z4));
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(Boolean.valueOf(z5));
        AnonymousClass920.A00(Boolean.valueOf(z6));
        AnonymousClass920.A00(Integer.valueOf(i3));
        AnonymousClass920.A00(Integer.valueOf(i4));
        AnonymousClass920.A00(Integer.valueOf(i5));
        this.cameraOn = z;
        this.cameraState = i;
        this.cameraPaused = z2;
        this.deviceHasCamera = z3;
        this.canSwitchCamera = z4;
        this.cameraDevicePosition = i2;
        this.cameraEverOn = z5;
        this.userHasDeclinedVideoPrompt = z6;
        this.targetFps = i3;
        this.targetCaptureResolutionWidth = i4;
        this.targetCaptureResolutionHeight = i5;
    }
}
