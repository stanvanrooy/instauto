package p000X;

import java.util.Map;

/* renamed from: X.DPK */
public final class DPK implements DKT {
    public final /* synthetic */ DP3 A00;

    public DPK(DP3 dp3) {
        this.A00 = dp3;
    }

    public final void B2m(Throwable th) {
        this.A00.A01.release();
        this.A00.A01.A0B.A02("stop_recording_audio_failed", th, "high");
        this.A00.A00.B2m(th);
    }

    public final void onSuccess() {
        this.A00.A01.release();
        this.A00.A01.A0B.A00("recording_stop_audio_finished");
        this.A00.A01.A0B.A03("stop_recording_audio_finished", (Map) null);
        this.A00.A00.onSuccess();
    }
}
