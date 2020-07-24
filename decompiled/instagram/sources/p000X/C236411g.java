package p000X;

/* renamed from: X.11g  reason: invalid class name and case insensitive filesystem */
public final class C236411g implements AnonymousClass0C2 {
    public static volatile C236411g A03;
    public C236711j A00;
    public C236811k A01;
    public C237111n A02;

    public static C236811k A00() {
        if (A03 != null) {
            return A03.A01;
        }
        throw new IllegalStateException("VideoQPL never initialized");
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A01.shutdown();
        this.A02.shutdown();
    }

    public C236411g(C236711j r4) {
        this.A00 = r4;
        AnonymousClass00B r2 = AnonymousClass00B.A01;
        this.A01 = new C236811k(r2, r4);
        this.A02 = new C237111n(r2, this.A00);
    }

    public final void onUserSessionStart(boolean z) {
        AnonymousClass0Z0.A0A(1504054133, AnonymousClass0Z0.A03(-1707613211));
    }
}
