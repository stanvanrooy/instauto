package p000X;

import java.util.Map;

/* renamed from: X.DP0 */
public final class DP0 implements C88443sQ {
    public final /* synthetic */ DKT A00;
    public final /* synthetic */ C30054DOj A01;

    public DP0(C30054DOj dOj, DKT dkt) {
        this.A01 = dOj;
        this.A00 = dkt;
    }

    public final void B2h(Exception exc, Map map) {
        C30073DPd dPd = new C30073DPd((Throwable) exc);
        dPd.A01(map);
        C30047DOb dOb = this.A01.A03;
        if (dOb != null) {
            dPd.A01(dOb.A00());
        }
        this.A01.release();
        try {
            dPd.A00("supported_configs", B9N.A00(B9N.A01()));
        } catch (Exception unused) {
        }
        this.A01.A0B.A01("prepare_recording_audio_failed", dPd, "high");
        this.A00.B2m(dPd);
    }

    public final void onSuccess() {
        this.A00.onSuccess();
    }
}
