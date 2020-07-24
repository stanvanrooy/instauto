package p000X;

import java.io.File;

/* renamed from: X.DPW */
public final class DPW implements DKT {
    public final /* synthetic */ C30085DPp A00;
    public final /* synthetic */ DQ8 A01;
    public final /* synthetic */ C30063DOt A02;
    public final /* synthetic */ File A03;

    public DPW(C30063DOt dOt, DQ8 dq8, File file, C30085DPp dPp) {
        this.A02 = dOt;
        this.A01 = dq8;
        this.A03 = file;
        this.A00 = dPp;
    }

    public final void B2m(Throwable th) {
        C30063DOt dOt = this.A02;
        dOt.A02 = this.A00;
        C30063DOt.A01(dOt, new C30073DPd(th));
        this.A01.B4s();
    }

    public final void onSuccess() {
        this.A02.A05(this.A01, this.A03, this.A00);
    }
}
