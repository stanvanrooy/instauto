package p000X;

/* renamed from: X.1if  reason: invalid class name and case insensitive filesystem */
public final class C36821if {
    public static boolean A00(AnonymousClass1NG r2) {
        C29261Pf r1 = r2.A0H;
        if (r1 == C29261Pf.MEDIA) {
            return r2.A04().Aho();
        }
        if (r1 == C29261Pf.FEED_SURVEY) {
            return true;
        }
        return false;
    }

    public static boolean A01(AnonymousClass1NG r3) {
        C29261Pf r2 = r3.A0H;
        if (r2 == C29261Pf.STORIES_NETEGO) {
            return ((C42721t8) r3.A0G).A08;
        }
        if (!(r3.A0G instanceof C36321hr) || r2 == C29261Pf.FEED_SURVEY) {
            return false;
        }
        return true;
    }
}
