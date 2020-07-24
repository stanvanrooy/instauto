package p000X;

/* renamed from: X.1qG  reason: invalid class name and case insensitive filesystem */
public final class C41411qG extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41411qG(C37531jo r3) {
        super("maybeFetchRemoteFontsDownload", 593);
        this.A00 = r3;
    }

    public final void A00() {
        C37531jo r5 = this.A00;
        if (((Boolean) AnonymousClass0L6.A03(r5.A07, AnonymousClass0L7.TEXT_TOOL_V2, "font_updates_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C05900Mx A002 = C05900Mx.A05.A00(r5.A06);
            for (AnonymousClass0N4 r52 : AnonymousClass0N4.values()) {
                C179927mF A003 = r52.A00();
                if (A003 != null) {
                    C204748pV r3 = new C204748pV(new C197038bt(A002.A00, A003, C196918bh.A00), true);
                    r3.A00();
                    A002.A02.put(r52, r3);
                }
            }
        }
    }
}
