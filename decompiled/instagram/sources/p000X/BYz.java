package p000X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.BYz */
public final /* synthetic */ class BYz implements Runnable {
    public final int A00;
    public final CameraDevice.StateCallback A01;
    public final CameraDevice A02;

    public BYz(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, int i) {
        this.A01 = stateCallback;
        this.A02 = cameraDevice;
        this.A00 = i;
    }

    public final void run() {
        this.A01.onError(this.A02, this.A00);
    }
}
