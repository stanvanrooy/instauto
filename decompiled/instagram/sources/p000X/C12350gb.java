package p000X;

/* renamed from: X.0gb  reason: invalid class name and case insensitive filesystem */
public final class C12350gb {
    public AnonymousClass29A A00;
    public AnonymousClass29A A01;
    public AnonymousClass29A A02;
    public AnonymousClass29A A03;
    public AnonymousClass29A A04;
    public AnonymousClass29A A05;
    public C12190gK A06;
    public final C12210gM A07;

    public static boolean A00(C12350gb r1) {
        C12210gM r0 = r1.A07;
        if (r0 == null || !r0.A00) {
            return true;
        }
        return false;
    }

    public final void A01(AnonymousClass29A r5, Short sh) {
        short s;
        if (r5 != null) {
            try {
                C12210gM r1 = this.A07;
                if (sh == null) {
                    s = 2;
                } else {
                    s = sh.shortValue();
                }
                r5.A00(s);
                r1.AlA(r5);
            } catch (Exception e) {
                this.A06.A00.Bp7("MobileBoost", "TrackingError", e);
            }
        }
    }

    public C12350gb(C12210gM r1, C12190gK r2) {
        this.A07 = r1;
        this.A06 = r2;
    }
}
