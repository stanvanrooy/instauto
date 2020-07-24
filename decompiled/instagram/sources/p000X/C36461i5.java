package p000X;

/* renamed from: X.1i5  reason: invalid class name and case insensitive filesystem */
public final class C36461i5 implements C06570Po {
    public static C36461i5 A01;
    public final boolean A00;

    public final void onUserSessionWillEnd(boolean z) {
        A01 = null;
    }

    public static synchronized C36461i5 A00(AnonymousClass0C1 r2) {
        C36461i5 r0;
        Class<C36461i5> cls = C36461i5.class;
        synchronized (cls) {
            if (A01 == null) {
                C36461i5 r02 = new C36461i5(r2);
                A01 = r02;
                r2.BYi(cls, r02);
            }
            r0 = A01;
        }
        return r0;
    }

    public final Integer A01(AnonymousClass1OU r2) {
        if (r2.A02 || !this.A00) {
            return r2.A01;
        }
        return Constants.ZERO;
    }

    public final boolean A02(AnonymousClass1OU r3) {
        if (r3.A02 || this.A00) {
            return true;
        }
        return false;
    }

    public C36461i5(AnonymousClass0C1 r5) {
        this.A00 = ((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.PURE_DAISY_OVERRIDE, "show_pure_daisy", false, (AnonymousClass04H) null)).booleanValue();
    }
}
