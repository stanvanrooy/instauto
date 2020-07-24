package p000X;

/* renamed from: X.0yx  reason: invalid class name and case insensitive filesystem */
public final class C22760yx implements AnonymousClass0Q6, C06570Po, C06580Pp {
    public final C22790z0 A00;

    public static synchronized C22760yx A00(C06590Pq r2) {
        C22760yx r0;
        Class<C22760yx> cls = C22760yx.class;
        synchronized (cls) {
            r0 = (C22760yx) r2.AVA(cls, new C22770yy(r2));
        }
        return r0;
    }

    public C22760yx(C06590Pq r8) {
        this.A00 = new C22790z0(new C22810z2(r8), new C22820z3(), new C22830z4(), new C22840z5(StoredPreferences.A00, new C22780yz(this)));
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0Z0.A03(1933656652);
        C22790z0 r2 = this.A00;
        synchronized (r2) {
            C22850z6 r1 = r2.A02;
            AnonymousClass0ZA.A0D(r1, r1.obtainMessage(6));
        }
        AnonymousClass0Z0.A0A(2051085073, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0Z0.A0A(1452932522, AnonymousClass0Z0.A03(-1127691335));
    }

    public final void onSessionIsEnding() {
        AnonymousClass0Q7.A03().A0D(this);
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0Q7.A03().A0D(this);
    }
}
