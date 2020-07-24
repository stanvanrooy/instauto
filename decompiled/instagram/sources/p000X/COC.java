package p000X;

import android.content.Context;

/* renamed from: X.COC */
public final class COC extends C18690sG implements C18720sJ {
    public final /* synthetic */ C27682CNb A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public COC(C27682CNb cNb) {
        super(0);
        this.A00 = cNb;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C27682CNb cNb = this.A00;
        COB cob = new COB(this);
        Context requireContext = cNb.requireContext();
        C13150hy.A01(requireContext, "requireContext()");
        return new C27775CQt(cNb, cob, requireContext);
    }
}
