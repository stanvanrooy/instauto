package p000X;

/* renamed from: X.DP2 */
public final class DP2 implements DKT {
    public final /* synthetic */ DKT A00;
    public final /* synthetic */ C30054DOj A01;

    public DP2(C30054DOj dOj, DKT dkt) {
        this.A01 = dOj;
        this.A00 = dkt;
    }

    public final void B2m(Throwable th) {
        C30073DPd dPd = new C30073DPd(th);
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
        this.A00.B2m(th);
    }

    public final void onSuccess() {
        this.A00.onSuccess();
    }
}
