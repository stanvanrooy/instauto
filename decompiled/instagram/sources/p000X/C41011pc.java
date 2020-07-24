package p000X;

/* renamed from: X.1pc  reason: invalid class name and case insensitive filesystem */
public final class C41011pc extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41011pc(C37531jo r3) {
        super("maybeLogResurrection", 360);
        this.A00 = r3;
    }

    public final void A00() {
        AnonymousClass0C1 r7 = this.A00.A07;
        C16180oA A002 = C16180oA.A00(r7);
        long j = A002.A00.getLong("last_resurrection_logged_date", 0);
        if (j == 0 || System.currentTimeMillis() - j > 2419200000L) {
            String A01 = C05760Lv.A01.A01();
            C15890nh r2 = new C15890nh(r7);
            r2.A09 = Constants.ONE;
            r2.A0C = "attribution/log_resurrect_attribution/";
            r2.A09("adid", A01);
            r2.A06(AnonymousClass1N4.class, false);
            r2.A0G = true;
            C12810hQ.A02(r2.A03());
            A002.A00.edit().putLong("last_resurrection_logged_date", System.currentTimeMillis()).apply();
        }
    }
}
