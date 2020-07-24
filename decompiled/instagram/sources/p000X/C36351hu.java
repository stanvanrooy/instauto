package p000X;

/* renamed from: X.1hu  reason: invalid class name and case insensitive filesystem */
public final class C36351hu implements C06570Po {
    public AnonymousClass0C1 A00;
    public long A01;
    public boolean A02;
    public boolean A03;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C36351hu A00(AnonymousClass0C1 r2) {
        return (C36351hu) r2.AVA(C36351hu.class, new C36361hv(r2));
    }

    public final boolean A01() {
        if (this.A02) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A01 > 500) {
            this.A03 = !AnonymousClass1YN.A00(this.A00);
            this.A01 = currentTimeMillis;
        }
        return this.A03;
    }

    public C36351hu(AnonymousClass0C1 r6) {
        boolean booleanValue;
        this.A00 = r6;
        AnonymousClass0NI A012 = AnonymousClass0NI.A01();
        AnonymousClass0L7 r2 = AnonymousClass0L7.LOWRAM_AUTOPLAY;
        if (((Boolean) AnonymousClass0L6.A02(r6, r2, "is_autoplay_disabled", false, (AnonymousClass04H) null)).booleanValue()) {
            booleanValue = true;
        } else {
            int A032 = A012.A03();
            if (A032 == 1 || A032 == 2) {
                booleanValue = ((Boolean) AnonymousClass0L6.A02(r6, r2, "is_autoplay_disabled_below_two_cores", false, (AnonymousClass04H) null)).booleanValue();
            } else {
                booleanValue = false;
            }
        }
        this.A02 = booleanValue;
    }
}
