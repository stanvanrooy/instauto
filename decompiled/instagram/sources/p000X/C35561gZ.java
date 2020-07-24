package p000X;

/* renamed from: X.1gZ  reason: invalid class name and case insensitive filesystem */
public final class C35561gZ {
    public static int A00(AnonymousClass0C1 r3, C31581Yw r4) {
        if (r4.A04.A0X()) {
            return 1;
        }
        if (!AnonymousClass1OY.MAIN_FEED_TRAY.equals(r4.A05) || !C23020zP.A00(r3).A05()) {
            if (r4.A04()) {
                return 2;
            }
            AnonymousClass1OY r0 = AnonymousClass1OY.IN_FEED_STORIES_TRAY;
            AnonymousClass1OY r1 = r4.A05;
            if (!r0.equals(r1)) {
                if (AnonymousClass1OY.ADS_HISTORY.equals(r1)) {
                    return 5;
                }
                if (r4.A04.A0Z()) {
                    return 7;
                }
                return 0;
            }
        }
        return 3;
    }
}
