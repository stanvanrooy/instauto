package p000X;

import java.util.List;

/* renamed from: X.CBJ */
public final class CBJ implements AnonymousClass1Et {
    public final /* synthetic */ AnonymousClass1LW A00;
    public final /* synthetic */ CBH A01;

    public CBJ(CBH cbh, AnonymousClass1LW r2) {
        this.A01 = cbh;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void BJp(Object obj) {
        List list;
        CBM cbm = (CBM) obj;
        if (cbm != null && (list = cbm.A00) != null) {
            List A03 = AnonymousClass1NG.A03(list);
            A03.size();
            CBH cbh = this.A01;
            C28741Mx.A02(cbh.A01, A03, cbh.A02);
            AnonymousClass1LW r1 = this.A00;
            if (r1 != null) {
                C28661Mp r0 = new C28661Mp();
                r0.A0A = A03;
                r1.B7O(r0);
            }
        }
    }

    public final void B2g(Exception exc) {
        AnonymousClass0QD.A05("top_item_cache_deserialize_failure", exc.getMessage(), exc);
    }
}
