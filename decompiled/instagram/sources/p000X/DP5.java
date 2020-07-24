package p000X;

import java.util.Map;

/* renamed from: X.DP5 */
public final class DP5 implements C88443sQ {
    public final /* synthetic */ DKT A00;
    public final /* synthetic */ C30057DOm A01;

    public DP5(C30057DOm dOm, DKT dkt) {
        this.A01 = dOm;
        this.A00 = dkt;
    }

    public final void B2h(Exception exc, Map map) {
        C30073DPd dPd = new C30073DPd((Throwable) exc);
        dPd.A01(map);
        this.A01.A0B.A01("stop_recording_video_failed", dPd, "high");
        this.A01.release();
        this.A00.B2m(dPd);
    }

    public final void onSuccess() {
        DPO dpo;
        this.A01.A0B.A00("recording_stop_video_finished");
        C30057DOm dOm = this.A01;
        DPA dpa = dOm.A0B;
        if (dOm.A05 != null) {
            dpo = new DPO(this);
        } else {
            dpo = null;
        }
        dpa.A03("stop_recording_video_finished", dpo);
        this.A01.release();
        this.A00.onSuccess();
    }
}
