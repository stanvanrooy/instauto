package p000X;

import com.facebook.cameracore.mediapipeline.recorder.RecorderCoordinatorImpl;

/* renamed from: X.DPY */
public final class DPY implements Runnable {
    public final /* synthetic */ C30055DOk A00;

    public DPY(C30055DOk dOk) {
        this.A00 = dOk;
    }

    public final void run() {
        C30055DOk dOk = this.A00;
        C30061DOr dOr = dOk.A0B;
        if (dOr != null) {
            dOr.A01();
            return;
        }
        RecorderCoordinatorImpl recorderCoordinatorImpl = dOk.A09;
        recorderCoordinatorImpl.A0N = true;
        RecorderCoordinatorImpl.A07(recorderCoordinatorImpl, new C30051DOg(recorderCoordinatorImpl));
    }
}
