package p000X;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import com.google.p013ar.core.SharedCamera;

/* renamed from: X.BZ3 */
public final class BZ3 extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ CameraCaptureSession.StateCallback A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ SharedCamera A02;

    public BZ3(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.A02 = sharedCamera;
        this.A01 = handler;
        this.A00 = stateCallback;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        AnonymousClass0ZA.A0E(this.A01, new BZ9(this.A00, cameraCaptureSession), -324596760);
        SharedCamera.A03(this.A02, cameraCaptureSession);
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        AnonymousClass0ZA.A0E(this.A01, new BZ6(this.A00, cameraCaptureSession), 1598753497);
        SharedCamera.A04(this.A02, cameraCaptureSession);
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AnonymousClass0ZA.A0E(this.A01, new BZ7(this.A00, cameraCaptureSession), -1357505723);
        SharedCamera.A05(this.A02, cameraCaptureSession);
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        AnonymousClass0ZA.A0E(this.A01, new BZ8(this.A00, cameraCaptureSession), 1441139462);
        SharedCamera.A06(this.A02, cameraCaptureSession);
        SharedCamera sharedCamera = this.A02;
        if (sharedCamera.A02.A01 != null) {
            SharedCamera.A02(sharedCamera);
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        AnonymousClass0ZA.A0E(this.A01, new BZA(this.A00, cameraCaptureSession), -1505466769);
        SharedCamera.A07(this.A02, cameraCaptureSession);
    }
}
