package p000X;

import android.os.Handler;
import com.facebook.cameracore.mediapipeline.recorder.RecorderCoordinatorImpl;

/* renamed from: X.DPN */
public final class DPN implements DKT {
    public final /* synthetic */ DKT A00;
    public final /* synthetic */ DQ6 A01;
    public final /* synthetic */ RecorderCoordinatorImpl A02;
    public final /* synthetic */ boolean A03;

    public DPN(RecorderCoordinatorImpl recorderCoordinatorImpl, DQ6 dq6, DKT dkt, boolean z) {
        this.A02 = recorderCoordinatorImpl;
        this.A01 = dq6;
        this.A00 = dkt;
        this.A03 = z;
    }

    public final void B2m(Throwable th) {
        RecorderCoordinatorImpl recorderCoordinatorImpl = this.A02;
        DKT dkt = this.A00;
        Handler handler = recorderCoordinatorImpl.A0G;
        recorderCoordinatorImpl.A07 = DPU.STOPPED;
        DKO.A03(dkt, handler, th);
        RecorderCoordinatorImpl.A00(recorderCoordinatorImpl);
    }

    public final void onSuccess() {
        DQ6 dq6 = this.A01;
        int i = dq6.A00 - 1;
        dq6.A00 = i;
        if (i == 0) {
            RecorderCoordinatorImpl recorderCoordinatorImpl = this.A02;
            DKT dkt = this.A00;
            Handler handler = recorderCoordinatorImpl.A0G;
            boolean z = this.A03;
            recorderCoordinatorImpl.A07 = DPU.PREPARED;
            DKO.A02(dkt, handler);
            if (z) {
                RecorderCoordinatorImpl.A01(recorderCoordinatorImpl);
            }
        }
    }
}
