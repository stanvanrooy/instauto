package p000X;

/* renamed from: X.DPM */
public final class DPM implements DKT {
    public final /* synthetic */ DQ8 A00;
    public final /* synthetic */ C30063DOt A01;

    public DPM(C30063DOt dOt, DQ8 dq8) {
        this.A01 = dOt;
        this.A00 = dq8;
    }

    public final void B2m(Throwable th) {
        C30063DOt.A01(this.A01, new C30073DPd(th));
        this.A01.A03(this.A00);
    }

    public final void onSuccess() {
        this.A01.A04.A00("recording_stop_finished");
        C30063DOt dOt = this.A01;
        C30085DPp dPp = dOt.A02;
        if (dPp != null) {
            dOt.A02 = null;
            AnonymousClass0ZA.A0E(dOt.A06, new C30088DPs(dOt, dPp), 548348490);
        }
        this.A01.A03(this.A00);
    }
}
