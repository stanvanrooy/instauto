package p000X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.BZA */
public final /* synthetic */ class BZA implements Runnable {
    public final CameraCaptureSession.StateCallback A00;
    public final CameraCaptureSession A01;

    public BZA(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.A00 = stateCallback;
        this.A01 = cameraCaptureSession;
    }

    public final void run() {
        this.A00.onReady(this.A01);
    }
}
