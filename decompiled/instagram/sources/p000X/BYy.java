package p000X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.BYy */
public final /* synthetic */ class BYy implements Runnable {
    public final CameraDevice.StateCallback A00;
    public final CameraDevice A01;

    public BYy(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.A00 = stateCallback;
        this.A01 = cameraDevice;
    }

    public final void run() {
        this.A00.onClosed(this.A01);
    }
}
