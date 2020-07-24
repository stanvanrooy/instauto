package p000X;

import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;

/* renamed from: X.CQM */
public final class CQM {
    public final /* synthetic */ CQF A00;

    public CQM(CQF cqf) {
        this.A00 = cqf;
    }

    public final void A00(CQN cqn) {
        C13150hy.A02(cqn, "state");
        if (cqn.A00 != null) {
            C27679CMy cMy = this.A00.A08;
            if (cMy == null) {
                C13150hy.A03("productSourceRowController");
            }
            cMy.A00(cqn.A00);
            C27679CMy cMy2 = this.A00.A08;
            if (cMy2 == null) {
                C13150hy.A03("productSourceRowController");
            }
            boolean z = false;
            if (CQF.A02(this.A00).A01() == ProductSourceOverrideStatus.A05) {
                z = true;
            }
            cMy2.A01(z);
        }
        CQZ cqz = this.A00.A05;
        if (cqz == null) {
            C13150hy.A03("productsAdapterWrapper");
        }
        C13150hy.A02(cqn, "state");
        cqz.A00.A00(cqn);
    }
}
