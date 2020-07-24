package p000X;

/* renamed from: X.CBI */
public final class CBI implements AnonymousClass2LL {
    public final /* synthetic */ CBM A00;
    public final /* synthetic */ CBH A01;

    public CBI(CBH cbh, CBM cbm) {
        this.A01 = cbh;
        this.A00 = cbm;
    }

    public final void B2g(Exception exc) {
        CBH cbh = this.A01;
        cbh.A00.A03(AnonymousClass000.A0E("top_items_", cbh.A01.A04()));
        AnonymousClass0QD.A05("top_item_cache_serialize_failure", exc.getMessage(), exc);
    }

    public final void BJr(boolean z) {
        if (z) {
            this.A00.A00.size();
            C28741Mx.A03(this.A01.A01, AnonymousClass1NG.A03(this.A00.A00), this.A01.A02);
            return;
        }
        CBH cbh = this.A01;
        cbh.A00.A03(AnonymousClass000.A0E("top_items_", cbh.A01.A04()));
        AnonymousClass0QD.A01("top_item_cache_serialize_failure", "Failed to serialize top items feed cache.");
    }
}
