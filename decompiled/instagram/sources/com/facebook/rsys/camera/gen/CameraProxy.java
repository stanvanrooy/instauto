package com.facebook.rsys.camera.gen;

public abstract class CameraProxy {
    public abstract boolean canSwitchCamera();

    public abstract boolean hasCamera();

    public abstract void setApi(CameraApi cameraApi);

    public abstract void setCameraOn(boolean z);

    public abstract void setDevicePosition(int i);

    public abstract void setTargetCaptureResolution(int i, int i2);

    public abstract void setTargetFps(int i);
}
