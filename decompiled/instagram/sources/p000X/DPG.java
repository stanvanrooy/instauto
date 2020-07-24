package p000X;

/* renamed from: X.DPG */
public final class DPG implements DKT {
    public final /* synthetic */ DKT A00;
    public final /* synthetic */ C30054DOj A01;

    public DPG(C30054DOj dOj, DKT dkt) {
        this.A01 = dOj;
        this.A00 = dkt;
    }

    public final void B2m(Throwable th) {
        this.A01.release();
        this.A01.A0B.A02("start_recording_audio_failed", th, "high");
        this.A00.B2m(th);
    }

    public final void onSuccess() {
        this.A01.A0D = false;
        C30054DOj dOj = this.A01;
        dOj.A09.A3s(dOj.A0A, new DPJ(this), dOj.A08);
    }
}
