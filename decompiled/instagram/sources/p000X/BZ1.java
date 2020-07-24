package p000X;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import com.google.p013ar.core.SharedCamera;

/* renamed from: X.BZ1 */
public final class BZ1 extends CameraDevice.StateCallback {
    public final /* synthetic */ CameraDevice.StateCallback A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ SharedCamera A02;

    public BZ1(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.A02 = sharedCamera;
        this.A01 = handler;
        this.A00 = stateCallback;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        AnonymousClass0ZA.A0E(this.A01, new BYy(this.A00, cameraDevice), -205200166);
        SharedCamera.A08(this.A02, cameraDevice);
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        AnonymousClass0ZA.A0E(this.A01, new BZ0(this.A00, cameraDevice), -1028729494);
        SharedCamera.A09(this.A02, cameraDevice);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        if (AnonymousClass07M.A04()) {
            AnonymousClass07M.A02(cameraDevice);
        }
        AnonymousClass0ZA.A0E(this.A01, new BYz(this.A00, cameraDevice, i), 1897057947);
        SharedCamera sharedCamera = this.A02;
        AnonymousClass0ZA.A07(sharedCamera.A00, (Object) null);
        sharedCamera.A00.getLooper().quit();
        sharedCamera.A00 = null;
    }

    public final void onOpened(CameraDevice cameraDevice) {
        if (AnonymousClass07M.A04()) {
            AnonymousClass07M.A03(cameraDevice);
        }
        this.A02.A02.A01 = cameraDevice;
        AnonymousClass0ZA.A0E(this.A01, new BZB(this.A00, cameraDevice), 412488860);
        SharedCamera.A0A(this.A02, cameraDevice);
        SharedCamera sharedCamera = this.A02;
        sharedCamera.A02.A00 = SharedCamera.A00(sharedCamera);
        SharedCamera sharedCamera2 = this.A02;
        sharedCamera2.A02.A02 = SharedCamera.A01(sharedCamera2);
    }
}
