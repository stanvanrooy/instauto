package p000X;

/* renamed from: X.1lm  reason: invalid class name and case insensitive filesystem */
public final class C38751lm {
    public static void A00(C32171ai r4, AnonymousClass1NJ r5, C36841ih r6, AnonymousClass0C1 r7, boolean z) {
        if (!C38721lj.A01(r5, r7)) {
            r4.A04.setVisibility(8);
            return;
        }
        r4.A04.setVisibility(0);
        r4.A04.removeAllViews();
        C36841ih r2 = r4.A01;
        if (r2 != null) {
            r2.A0E(r4, true, Integer.valueOf(r4.A00));
        }
        int A0B = r5.A0B(r4.A03);
        r4.A00 = A0B;
        r4.A01 = r6;
        r6.A0D(r4, true, Integer.valueOf(A0B));
        r4.A02 = z;
        if (r6.A0y) {
            r4.A01(r5, r6, r7, false);
        }
    }
}
