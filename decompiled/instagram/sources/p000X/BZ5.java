package p000X;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import android.view.Surface;

/* renamed from: X.BZ5 */
public final class BZ5 extends CameraCaptureSession.StateCallback {
    public CameraCaptureSession.StateCallback A00;

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onActive(cameraCaptureSession);
        }
    }

    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null && Build.VERSION.SDK_INT >= 26) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraCaptureSession);
            this.A00 = null;
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onConfigureFailed(cameraCaptureSession);
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onConfigured(cameraCaptureSession);
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onReady(cameraCaptureSession);
        }
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null && Build.VERSION.SDK_INT >= 23) {
            stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
        }
    }

    public BZ5(CameraCaptureSession.StateCallback stateCallback) {
        this.A00 = stateCallback;
    }
}
