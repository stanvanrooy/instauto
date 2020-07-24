package p000X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.BZ0 */
public final /* synthetic */ class BZ0 implements Runnable {
    public final CameraDevice.StateCallback A00;
    public final CameraDevice A01;

    public BZ0(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.A00 = stateCallback;
        this.A01 = cameraDevice;
    }

    public final void run() {
        this.A00.onDisconnected(this.A01);
    }
}
