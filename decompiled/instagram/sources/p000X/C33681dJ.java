package p000X;

/* renamed from: X.1dJ  reason: invalid class name and case insensitive filesystem */
public final class C33681dJ implements C06570Po {
    public static C33681dJ A01;
    public C30761DjI A00;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static synchronized C33681dJ A00() {
        C33681dJ r0;
        synchronized (C33681dJ.class) {
            if (A01 == null) {
                A01 = new C33681dJ();
            }
            r0 = A01;
        }
        return r0;
    }
}
