package p000X;

import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;

/* renamed from: X.CIR */
public class CIR implements C44611wS {
    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        String A01;
        if (this instanceof CIK) {
            CIK cik = (CIK) this;
            String str = "accounts";
            if (i == 0) {
                str = "products";
            }
            C27371Ho r2 = cik.A00;
            CIJ cij = cik.A01;
            AnonymousClass0C1 r0 = cij.A04;
            String str2 = cij.A06;
            String str3 = cij.A07;
            CIQ ciq = new CIQ(AnonymousClass0QT.A00(r0, r2).A02("instagram_shopping_tags_list_navigated_to_tab"));
            if (ciq.A0B()) {
                ciq.A08("prior_module", str2);
                ciq.A08("tags_list_tab_destination", str);
                ciq.A08(AnonymousClass0C5.$const$string(12), str3);
                ciq.A01();
            }
            CIJ cij2 = cik.A01;
            CIN cin = cij2.A05;
            if (cin != null) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -2137146394) {
                    if (hashCode == -1003761308 && str.equals("products")) {
                        c = 0;
                    }
                } else if (str.equals("accounts")) {
                    c = 1;
                }
                if (c == 0) {
                    AnonymousClass1HD r1 = cij2.A01;
                    if (r1 instanceof ShoppingMoreProductsFragment) {
                        A01 = ((ShoppingMoreProductsFragment) r1).A01();
                    } else {
                        return;
                    }
                } else if (c == 1) {
                    A01 = ShoppingMoreProductsFragment.A00(cij2.requireContext(), cik.A01.A02);
                } else {
                    return;
                }
                cin.A02.A0C(A01);
            }
        }
    }
}
