package p000X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.model.shopping.ProductSource;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;

/* renamed from: X.CQH */
public final class CQH implements CN0 {
    public final /* synthetic */ CQF A00;

    public CQH(CQF cqf) {
        this.A00 = cqf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r1.A00 == p000X.C53502Ta.CATALOG) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r3 != false) goto L_0x0050;
     */
    public final void BG3() {
        boolean z;
        ProductSource productSource;
        ProductSourceOverrideStatus A01 = CQF.A02(this.A00).A01();
        if (A01 == ProductSourceOverrideStatus.A05) {
            CQF cqf = this.A00;
            if (cqf.A0A) {
                AnonymousClass0C1 r1 = cqf.A03;
                if (r1 == null) {
                    C13150hy.A03("userSession");
                }
                if (r1.A06.A0T()) {
                    CQG cqg = cqf.A07;
                    if (cqg == null) {
                        C13150hy.A03("productsStateManager");
                    }
                    boolean z2 = true;
                    if ((!cqg.A00.A04.isEmpty()) && (productSource = cqg.A00.A00) != null) {
                        if (productSource == null) {
                            C13150hy.A00();
                        }
                    }
                    z2 = false;
                    z = true;
                }
            }
            z = false;
            boolean A0E = C52952Qw.A0E(CQF.A01(this.A00));
            if (z || A0E) {
                C17510qM r3 = C17510qM.A00;
                FragmentActivity requireActivity = this.A00.requireActivity();
                AnonymousClass0C1 A012 = CQF.A01(this.A00);
                CQF cqf2 = this.A00;
                r3.A1H(requireActivity, A012, false, cqf2.getModuleName(), (String) null, (String) null, (String) null, 1001, cqf2, (FragmentActivity) null, z, false, A0E, (ProductSourceOverrideState) null);
                return;
            }
            AnonymousClass0QD.A01("MultiProductPickerFragment", "Product source row clicked with no product source type enabled");
            return;
        }
        A01.A00(this.A00.requireContext(), CQF.A02(this.A00).A00.A00);
    }
}
