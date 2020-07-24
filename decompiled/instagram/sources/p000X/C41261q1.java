package p000X;

/* renamed from: X.1q1  reason: invalid class name and case insensitive filesystem */
public final class C41261q1 extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41261q1(C37531jo r3) {
        super("maybeLogOneTapStatus", 383);
        this.A00 = r3;
    }

    public final void A00() {
        String str;
        AnonymousClass0C1 r7 = this.A00.A07;
        C16180oA A002 = C16180oA.A00(r7);
        long j = A002.A00.getLong("last_one_tap_status_logged_date", 0);
        if (j == 0 || System.currentTimeMillis() - j > 604800000) {
            String A04 = r7.A04();
            C91693xx r2 = new C91693xx(AnonymousClass0QT.A00(r7, (AnonymousClass0RN) null).A02("sso_status"));
            r2.A08("enable_igid", A04);
            if (C72813Hc.A01(r7).A0C(A04)) {
                str = "YES";
            } else {
                str = "NO";
            }
            r2.A08("enabled", str);
            r2.A08("app_device_id", C05860Mt.A02.A04());
            r2.A01();
            A002.A00.edit().putLong("last_one_tap_status_logged_date", System.currentTimeMillis()).apply();
        }
    }
}
