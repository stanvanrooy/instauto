package p000X;

/* renamed from: X.DPF */
public final class DPF implements DQ8 {
    public final /* synthetic */ DQ8 A00;
    public final /* synthetic */ C30063DOt A01;

    public DPF(C30063DOt dOt, DQ8 dq8) {
        this.A01 = dOt;
        this.A00 = dq8;
    }

    public final void B4s() {
        C30063DOt.A00(this.A01, DPU.STOPPED);
        for (DPP release : this.A01.A05.values()) {
            release.release();
        }
        this.A01.A02 = null;
        DQ8 dq8 = this.A00;
        if (dq8 != null) {
            dq8.B4s();
        }
    }
}
