package p000X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.1ib  reason: invalid class name and case insensitive filesystem */
public final class C36781ib {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r2 != p000X.Constants.ONE) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r1 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r5.A0e() != false) goto L_0x0014;
     */
    public static boolean A00(AnonymousClass1NJ r6, AnonymousClass0C1 r7, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Boolean bool;
        C13300iJ A0c = r6.A0c(r7);
        if (A0c != null && !A0c.A0a()) {
            z2 = false;
        }
        z2 = true;
        Hashtag hashtag = r6.A0m;
        if (hashtag != null) {
            Integer A00 = hashtag.A00();
            z3 = true;
        }
        z3 = false;
        if (z2) {
            return false;
        }
        if (z && !z3) {
            C13410iU r0 = A0c.A0C;
            if (!(r0 == null || (bool = r0.A03) == null)) {
                boolean booleanValue = bool.booleanValue();
                z4 = true;
            }
            z4 = false;
            if (!z4) {
                return false;
            }
        }
        if (r6.A05 != 0 || C36791ic.A00(r7).A04(r6) || r6.A0V() != C36811ie.DEFAULT || C17050pb.A06(r6)) {
            return false;
        }
        return true;
    }
}
