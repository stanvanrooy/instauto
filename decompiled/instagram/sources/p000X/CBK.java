package p000X;

/* renamed from: X.CBK */
public final class CBK implements AnonymousClass2LL {
    public final /* synthetic */ AnonymousClass22P A00;
    public final /* synthetic */ AnonymousClass1LY A01;

    public CBK(AnonymousClass1LY r1, AnonymousClass22P r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void B2g(Exception exc) {
        AnonymousClass1LY r0 = this.A01;
        r0.A02.A03(AnonymousClass1LY.A00(r0));
        AnonymousClass0QD.A05("feed_item_cache_serialize_failure", exc.getMessage(), exc);
    }

    public final void BJr(boolean z) {
        if (z) {
            this.A00.A00.size();
            C28741Mx.A03(this.A01.A05, AnonymousClass1NG.A03(this.A00.A00), this.A01.A06);
            return;
        }
        AnonymousClass1LY r0 = this.A01;
        r0.A02.A03(AnonymousClass1LY.A00(r0));
        AnonymousClass0QD.A01("feed_item_cache_serialize_failure", "Failed to serialize feed cache.");
    }
}
