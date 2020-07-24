package p000X;

/* renamed from: X.1qE  reason: invalid class name and case insensitive filesystem */
public final class C41391qE extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41391qE(C37531jo r3) {
        super("appStartupCountry", 399);
        this.A00 = r3;
    }

    public final void A00() {
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.APP_STARTUP_STICKY_COUNTRY, "is_enabled", false)).booleanValue()) {
            C12600h4 A002 = C12600h4.A00();
            if (A002.A02 == null) {
                String string = C05770Lw.A00().A00.getString("device_app_startup_country", (String) null);
                if (string == null) {
                    string = "";
                }
                A002.A02 = string;
            }
            if (A002.A02.isEmpty() || A002.A06 || A002.A07) {
                String str = (String) C05640Lj.A00(AnonymousClass0L7.APP_STARTUP_STICKY_COUNTRY, "request_country", "unknown");
                A002.A02 = str;
                C05770Lw.A00().A00.edit().putString("device_app_startup_country", str).apply();
            }
        }
    }
}
