package p000X;

/* renamed from: X.1py  reason: invalid class name and case insensitive filesystem */
public final class C41231py extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41231py(C37531jo r3) {
        super("maybeSyncAccountLinkage", 380);
        this.A00 = r3;
    }

    public final void A00() {
        C235910z A002 = C235910z.A00(this.A00.A07);
        if (!A002.A03.Abj()) {
            if (!A002.A00.getBoolean("pref_key_force_sync", false)) {
                boolean z = false;
                if (System.currentTimeMillis() - A002.A00.getLong(A002.getPrefKeyPrefixLastSyncedMsForUser(), 0) < 10800000) {
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            A002.A01();
        }
    }
}
