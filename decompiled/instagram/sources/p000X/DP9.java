package p000X;

import android.os.Handler;
import com.facebook.cameracore.mediapipeline.recorder.RecorderCoordinatorImpl;

/* renamed from: X.DP9 */
public final class DP9 implements DKT {
    public final /* synthetic */ RecorderCoordinatorImpl A00;

    public DP9(RecorderCoordinatorImpl recorderCoordinatorImpl) {
        this.A00 = recorderCoordinatorImpl;
    }

    public final void B2m(Throwable th) {
        C30085DPp dPp = this.A00.A0B;
        if (dPp != null) {
            dPp.Auo(new C30073DPd("Failed to start audio recording", th));
        }
        RecorderCoordinatorImpl.A00(this.A00);
    }

    public final void onSuccess() {
        RecorderCoordinatorImpl recorderCoordinatorImpl = this.A00;
        DKX dkx = recorderCoordinatorImpl.A05;
        if (dkx != null) {
            DPR dpr = new DPR(this);
            Handler handler = recorderCoordinatorImpl.A0G;
            DKX.A00(dkx, handler);
            AnonymousClass0ZA.A0E(dkx.A03, new DKV(dkx, dpr, handler), 2132382363);
        }
    }
}
