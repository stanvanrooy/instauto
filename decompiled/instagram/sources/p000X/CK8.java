package p000X;

import android.view.View;

/* renamed from: X.CK8 */
public final class CK8 implements View.OnClickListener {
    public final /* synthetic */ CK6 A00;

    public CK8(CK6 ck6) {
        this.A00 = ck6;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1032592026);
        CKS cks = this.A00.A01;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        CL0 cl0 = CL0.values()[this.A00.A00];
        C13150hy.A02(cl0, "businessType");
        CKX ckx = (CKX) cks.A01.A02();
        if (ckx != null) {
            ckx.A00 = cl0;
        }
        if (ckx != null) {
            ckx.A0H = null;
        }
        cks.A02.A0A(ckx);
        this.A00.getParentFragmentManager().A0W();
        AnonymousClass0Z0.A0C(292032000, A05);
    }
}
