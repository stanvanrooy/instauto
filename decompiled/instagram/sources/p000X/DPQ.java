package p000X;

import java.util.Locale;

/* renamed from: X.DPQ */
public final class DPQ implements DKT {
    public final /* synthetic */ DPP A00;
    public final /* synthetic */ DQ8 A01;
    public final /* synthetic */ C30063DOt A02;

    public final void onSuccess() {
        String.format((Locale) null, "Track %s started", new Object[]{this.A00.AZ7()});
    }

    public DPQ(C30063DOt dOt, DPP dpp, DQ8 dq8) {
        this.A02 = dOt;
        this.A00 = dpp;
        this.A01 = dq8;
    }

    public final void B2m(Throwable th) {
        C30063DOt.A01(this.A02, new C30073DPd(th));
        this.A02.A03(this.A01);
    }
}
