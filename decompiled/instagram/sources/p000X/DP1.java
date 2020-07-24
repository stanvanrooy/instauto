package p000X;

import android.os.Handler;
import com.facebook.cameracore.mediapipeline.recorder.RecorderCoordinatorImpl;
import java.util.Map;

/* renamed from: X.DP1 */
public final class DP1 implements C88443sQ {
    public final /* synthetic */ DKT A00;
    public final /* synthetic */ DQ6 A01;
    public final /* synthetic */ RecorderCoordinatorImpl A02;
    public final /* synthetic */ boolean A03;

    public DP1(RecorderCoordinatorImpl recorderCoordinatorImpl, DQ6 dq6, DKT dkt, boolean z) {
        this.A02 = recorderCoordinatorImpl;
        this.A01 = dq6;
        this.A00 = dkt;
        this.A03 = z;
    }

    public final void B2h(Exception exc, Map map) {
        this.A02.A0H.A00.A08.A05(11);
        this.A02.A0H.A00("prepare_recording_audio_failed", exc, "high");
        RecorderCoordinatorImpl recorderCoordinatorImpl = this.A02;
        DKT dkt = this.A00;
        Handler handler = recorderCoordinatorImpl.A0G;
        recorderCoordinatorImpl.A07 = DPU.STOPPED;
        DKO.A03(dkt, handler, exc);
        RecorderCoordinatorImpl.A00(recorderCoordinatorImpl);
    }

    public final void onSuccess() {
        this.A02.A0H.A00.A08.A06(11);
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
