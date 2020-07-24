package p000X;

/* renamed from: X.CIC */
public final class CIC extends C17920r1 {
    public final /* synthetic */ C466620j A00;
    public final /* synthetic */ C13300iJ A01;

    public CIC(C466620j r1, C13300iJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onFail(C43791v5 r5) {
        Integer num;
        int A03 = AnonymousClass0Z0.A03(-972682902);
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
        AnonymousClass0Z0.A0A(-2005920645, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-210585741);
        int A032 = AnonymousClass0Z0.A03(-342140581);
        C13300iJ r3 = this.A01;
        r3.A0M(false);
        C466620j r2 = this.A00;
        C13300iJ r1 = r2.A05.A06;
        if (r1.A0Y()) {
            r1.A1e = Integer.valueOf(r1.A1e.intValue() - 1);
        }
        if (r2.A00 == r3) {
            r2.A01 = Constants.ONE;
            C466620j.A01(r2);
        }
        AnonymousClass0Z0.A0A(-1179935901, A032);
        AnonymousClass0Z0.A0A(-1471181298, A03);
    }
}
