package p000X;

import android.content.Context;

/* renamed from: X.CQE */
public final class CQE extends C18690sG implements C18720sJ {
    public final /* synthetic */ CQ8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CQE(CQ8 cq8) {
        super(0);
        this.A00 = cq8;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        CQ8 cq8 = this.A00;
        CQS cqs = new CQS(this);
        Context requireContext = cq8.requireContext();
        C13150hy.A01(requireContext, "requireContext()");
        return new C27773CQr(cq8, cqs, requireContext);
    }
}
