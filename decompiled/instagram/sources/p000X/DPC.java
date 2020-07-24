package p000X;

import java.util.Map;

/* renamed from: X.DPC */
public final class DPC implements C88443sQ {
    public final /* synthetic */ DKT A00;
    public final /* synthetic */ C30057DOm A01;

    public DPC(C30057DOm dOm, DKT dkt) {
        this.A01 = dOm;
        this.A00 = dkt;
    }

    public final void B2h(Exception exc, Map map) {
        C30073DPd dPd = new C30073DPd((Throwable) exc);
        dPd.A01(map);
        this.A01.A0B.A01("prepare_recording_video_failed", dPd, "high");
        this.A01.release();
        this.A00.B2m(dPd);
    }

    public final void onSuccess() {
        C30057DOm dOm = this.A01;
        dOm.A08 = true;
        dOm.A0B.A00("recording_prepare_video_finished");
        this.A00.onSuccess();
    }
}
