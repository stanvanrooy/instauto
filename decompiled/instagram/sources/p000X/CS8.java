package p000X;

import android.content.Context;
import com.facebook.C0003R;
import com.instagram.model.shopping.Product;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.CS8 */
public final class CS8 implements C29091Oo {
    public CSY A00;
    public CS9 A01;
    public Set A02 = new LinkedHashSet();
    public final CTH A03;
    public final CTN A04;
    public final AnonymousClass0C1 A05;
    public final C27362CAh A06;
    public final CSS A07 = new CSS(this);
    public final CSL A08;
    public final CSR A09 = new CSR(this);
    public final CRP A0A;

    public CS8(AnonymousClass0C1 r8, Context context, AnonymousClass1L8 r10, CTH cth) {
        C13150hy.A02(r8, "userSession");
        C13150hy.A02(context, "context");
        C13150hy.A02(r10, "loaderManager");
        C13150hy.A02(cth, "logger");
        this.A05 = r8;
        this.A03 = cth;
        CSL csl = new CSL(this);
        this.A08 = csl;
        this.A04 = new CTN(this.A05, csl);
        CSR csr = this.A09;
        AnonymousClass0C1 r2 = this.A05;
        this.A0A = new CRP(csr, r2, context, r10);
        this.A06 = new C27362CAh(this.A07, r2, context, r10);
        this.A00 = new CSY("", AnonymousClass10U.A00, C219359cu.A00, false, false, false);
    }

    public static final void A00(CS8 cs8, AnonymousClass2GT r3) {
        CSY csy = (CSY) r3.invoke(cs8.A00);
        cs8.A00 = csy;
        CS9 cs9 = cs8.A01;
        if (cs9 != null) {
            cs9.A00(csy);
        }
    }

    public final void A01(Product product, C27702CNw cNw, boolean z) {
        C13150hy.A02(product, "product");
        C13150hy.A02(cNw, "item");
        if (!this.A02.contains(cNw.A02)) {
            boolean z2 = !this.A00.A02.contains(cNw.A02);
            if (!z2 || C27665CMj.A00(this.A05).getBoolean("has_seen_hide_from_shop_nux_dialog", false)) {
                A00(this, new C27814CSg(z2, cNw));
                Set set = this.A02;
                String str = cNw.A02;
                C13150hy.A01(str, "item.sectionId");
                set.add(str);
                if (z2) {
                    if (!z) {
                        this.A03.A02(product, cNw);
                    }
                    this.A0A.A00(product, cNw);
                    return;
                }
                this.A03.A01(product, cNw);
                this.A06.A00(product, cNw);
                return;
            }
            this.A03.A02(product, cNw);
            CTH cth = this.A03;
            CTK ctk = new CTK(cth.A02.A02("instagram_shopping_shop_manager_hide_product_nux"));
            if (ctk.A0B()) {
                ctk.A08("waterfall_id", cth.A04);
                ctk.A08("prior_module", cth.A03);
                ctk.A08("product_row_type", CRE.A00(cNw));
                ctk.A08("product_id", product.getId());
                ctk.A08("submodule", cth.A01);
                ctk.A01();
            }
            CS9 cs9 = this.A01;
            if (cs9 != null) {
                CSA csa = cs9.A00;
                C27665CMj.A00(csa.A01).edit().putBoolean("has_seen_hide_from_shop_nux_dialog", true).apply();
                CSA.A00(csa, C0003R.string.hide_product_from_shop_nux_title, C0003R.string.hide_product_from_shop_nux_description, new CT5(csa, product, cNw));
            }
        }
    }

    public final void A68() {
        this.A04.A68();
    }
}
