package p000X;

import com.facebook.cameracore.mediapipeline.recorder.RecorderCoordinatorImpl;
import java.util.Map;

/* renamed from: X.DPR */
public final class DPR implements C88443sQ {
    public final /* synthetic */ DP9 A00;

    public final void onSuccess() {
    }

    public DPR(DP9 dp9) {
        this.A00 = dp9;
    }

    public final void B2h(Exception exc, Map map) {
        C30085DPp dPp = this.A00.A00.A0B;
        if (dPp != null) {
            dPp.Auo(new C30073DPd("Failed to start audio recording", (Throwable) exc));
        }
        RecorderCoordinatorImpl.A00(this.A00.A00);
    }
}
