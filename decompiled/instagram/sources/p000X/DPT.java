package p000X;

/* renamed from: X.DPT */
public final class DPT implements DKT {
    public final /* synthetic */ DQ8 A00;
    public final /* synthetic */ C30063DOt A01;

    public DPT(C30063DOt dOt, DQ8 dq8) {
        this.A01 = dOt;
        this.A00 = dq8;
    }

    public final void B2m(Throwable th) {
        C30063DOt.A01(this.A01, new C30073DPd(th));
        this.A01.A03(this.A00);
    }

    public final void onSuccess() {
        C30063DOt dOt = this.A01;
        dOt.A03.A01(new DPM(dOt, this.A00));
    }
}
