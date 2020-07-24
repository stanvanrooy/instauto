package p000X;

/* renamed from: X.CO0 */
public final class CO0 extends C17920r1 {
    public final /* synthetic */ C27705CNz A00;

    public CO0(C27705CNz cNz) {
        this.A00 = cNz;
    }

    public final void onFail(C43791v5 r4) {
        Throwable th;
        int A03 = AnonymousClass0Z0.A03(-1697125317);
        super.onFail(r4);
        C27705CNz cNz = this.A00;
        cNz.A00 = Constants.ONE;
        CO7 co7 = cNz.A05;
        if (r4.A02()) {
            th = r4.A01;
        } else {
            th = null;
        }
        co7.B3p(th);
        AnonymousClass0Z0.A0A(1092763563, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(-568573294);
        super.onStart();
        C27705CNz cNz = this.A00;
        cNz.A00 = Constants.ZERO;
        cNz.A05.onStart();
        AnonymousClass0Z0.A0A(584315845, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-2139651225);
        CO1 co1 = (CO1) obj;
        int A032 = AnonymousClass0Z0.A03(-1043083473);
        super.onSuccess(co1);
        C27705CNz cNz = this.A00;
        cNz.A00 = Constants.A0C;
        cNz.A03 = co1.Abr();
        cNz.A02 = co1.AQs();
        cNz.A05.BPe(co1);
        AnonymousClass0Z0.A0A(-798875406, A032);
        AnonymousClass0Z0.A0A(32169472, A03);
    }
}
