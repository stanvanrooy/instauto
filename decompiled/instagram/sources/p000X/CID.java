package p000X;

/* renamed from: X.CID */
public final class CID extends C17920r1 {
    public final /* synthetic */ C466620j A00;
    public final /* synthetic */ C13300iJ A01;

    public CID(C466620j r1, C13300iJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onFail(C43791v5 r5) {
        Integer num;
        int A03 = AnonymousClass0Z0.A03(1431422427);
        C466620j r2 = this.A00;
        C13300iJ r1 = r2.A00;
        if (r1 == this.A01) {
            if (r1.A0g()) {
                num = Constants.ZERO;
            } else {
                num = Constants.ONE;
            }
            r2.A01 = num;
            C466620j.A01(r2);
        }
        AnonymousClass0Z0.A0A(1348231368, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1116807678);
        int A032 = AnonymousClass0Z0.A03(200964861);
        C13300iJ r2 = this.A01;
        r2.A0M(true);
        C466620j r1 = this.A00;
        r1.A05.A06.A0D();
        if (r1.A00 == r2) {
            r1.A01 = Constants.ZERO;
            C466620j.A01(r1);
        }
        AnonymousClass0Z0.A0A(-694890039, A032);
        AnonymousClass0Z0.A0A(1383187044, A03);
    }
}
