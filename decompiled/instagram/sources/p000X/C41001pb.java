package p000X;

/* renamed from: X.1pb  reason: invalid class name and case insensitive filesystem */
public final class C41001pb extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41001pb(C37531jo r3) {
        super("prefetchNewsfeed", 359);
        this.A00 = r3;
    }

    public final void A00() {
        C37531jo r5 = this.A00;
        if (!((Boolean) AnonymousClass0L6.A02(r5.A07, AnonymousClass0L7.LAUNCHER_DISABLE_NEWSFEED_PREFETCH, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C33921di A002 = C33921di.A00(r5.A07);
            boolean z = false;
            if (A002.A0C != null) {
                z = true;
            }
            if (!z && !A002.A0T) {
                C17850qu A01 = C483327o.A01(A002.A0W, (String) null, (String) null, true);
                A01.A00 = new AnonymousClass288(A002, false, true);
                C12810hQ.A02(A01);
            }
        }
    }
}
