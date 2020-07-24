package p000X;

/* renamed from: X.1pf  reason: invalid class name and case insensitive filesystem */
public final class C41041pf extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    public final void A00() {
        C37531jo r5 = this.A00;
        if (((Boolean) AnonymousClass0L6.A02(r5.A07, AnonymousClass0L7.LAUNCHER_BACKGROUND_WIFI_PREFETCH, "server_fetch_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass0C1 r4 = r5.A07;
            C16180oA A002 = C16180oA.A00(r4);
            A002.A00.edit().remove("bg_fetch_server_timing_ms").apply();
            C15890nh r2 = new C15890nh(r4);
            r2.A0C = "bg_prefetch/timing_config/";
            r2.A09 = Constants.A0N;
            r2.A06(AnonymousClass4PZ.class, false);
            C17850qu A03 = r2.A03();
            A03.A00 = new C95444Bg(A002);
            C12810hQ.A02(A03);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41041pf(C37531jo r3) {
        super("runServerTimingFetch", 363);
        this.A00 = r3;
    }
}
