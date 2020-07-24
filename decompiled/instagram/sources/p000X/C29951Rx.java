package p000X;

/* renamed from: X.1Rx  reason: invalid class name and case insensitive filesystem */
public final class C29951Rx {
    public final AnonymousClass0C1 A00;
    public final boolean A01;
    public final AnonymousClass1I6 A02;
    public final boolean A03;

    public final C37141jB A01(C27371Ho r7, AnonymousClass1NJ r8, int i) {
        AnonymousClass1NJ r3 = r8;
        C37141jB A002 = C37591ju.A00(this.A00, "impression", this.A02, r3, r7, Integer.valueOf(i));
        if (A002 != null) {
            A002.A3q = AnonymousClass0Q7.A03().A08();
            A002.A3r = C26441Dh.A00(this.A00).A05;
            boolean z = false;
            if (C26441Dh.A00(this.A00).A03 != null) {
                z = true;
            }
            A002.A2b = Boolean.valueOf(z);
        }
        return A002;
    }

    public final C37141jB A05(String str, C27371Ho r8, AnonymousClass1NJ r9, int i) {
        return C37591ju.A00(this.A00, str, this.A02, r9, r8, Integer.valueOf(i));
    }

    public C29951Rx(AnonymousClass0C1 r5, AnonymousClass1I6 r6) {
        this.A00 = r5;
        this.A02 = r6;
        this.A01 = ((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.MI_VIEWPOINT_VIEWABILITY, "is_double_logged", false, (AnonymousClass04H) null)).booleanValue();
        this.A03 = ((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.CAROUSEL_BUMPED_ORGANIC_IMPRESSION_CLIENT, "enabled", false, (AnonymousClass04H) null)).booleanValue();
    }

    public static void A00(C37141jB r2, AnonymousClass1NJ r3, AnonymousClass0C1 r4, StringBuilder sb) {
        if (r3.Aho()) {
            C12670hC.A02();
            sb.delete(0, sb.length());
            sb.append(C30671Ut.A09(r4, r3));
            if (C30671Ut.A04(r4, r3) != null) {
                sb.append(" ");
                sb.append(C30671Ut.A04(r4, r3));
            }
            r2.A4l = sb.toString();
            if (C30671Ut.A08(r4, r3) != null) {
                r2.A36 = C30671Ut.A08(r4, r3);
            }
            if (C30671Ut.A06(r4, r3) != null) {
                r2.A3N = C30671Ut.A06(r4, r3);
                r2.A3M = C30671Ut.A05(r4, r3);
                r2.A3O = C30671Ut.A07(r4, r3);
            }
        }
    }

    public final C37141jB A02(C27371Ho r7, AnonymousClass1NJ r8, int i) {
        return C37591ju.A00(this.A00, "sub_impression", this.A02, r8, r7, Integer.valueOf(i));
    }

    public final C37141jB A03(C27371Ho r3, AnonymousClass1NJ r4, int i, long j, C39531n4 r8) {
        AnonymousClass0C1 r0 = this.A00;
        C37141jB A012 = C37591ju.A01("time_spent", r4, r3);
        A012.A0B(r0, r4);
        A012.A14 = i;
        A012.A1t = j;
        if (r8 != null) {
            A012.A20 = r8;
        }
        AnonymousClass1I6 r02 = this.A02;
        if (r02 != null) {
            A012.A4c = r02.AVo();
        }
        return A012;
    }

    public final C37141jB A04(String str, C27371Ho r5, AnonymousClass1NJ r6, int i) {
        if (!C36901in.A0M(r6, r5)) {
            return null;
        }
        AnonymousClass0C1 r2 = this.A00;
        C37141jB A012 = C37591ju.A01(AnonymousClass000.A0E("carousel_", str), r6, r5);
        A012.A0B(r2, r6);
        A012.A14 = i;
        if (this.A03) {
            A012.A2h = true;
        }
        return A012;
    }
}
