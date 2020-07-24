package p000X;

import android.content.Context;
import com.facebook.C0003R;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductSource;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;
import java.util.Set;

/* renamed from: X.CQG */
public final class CQG implements C29091Oo {
    public CQN A00;
    public CQM A01;
    public final ProductSource A02;
    public final CN1 A03;
    public final int A04;
    public final CQJ A05 = new CQJ(this);

    public CQG(AnonymousClass0C1 r10, Set set, ProductSource productSource, int i, Integer num) {
        C13150hy.A02(r10, "userSession");
        C13150hy.A02(set, "addedProductIds");
        C13150hy.A02(productSource, "initialProductSource");
        C13150hy.A02(num, "pickerSurface");
        this.A02 = productSource;
        this.A04 = i;
        AnonymousClass10U r2 = AnonymousClass10U.A00;
        this.A00 = new CQN("", r2, productSource, C219359cu.A00, set, false, false, false);
        CN1 cn1 = new CN1(r10, this.A05);
        cn1.A01 = num;
        cn1.A03(this.A00.A00);
        this.A03 = cn1;
    }

    public static final void A00(CQG cqg, AnonymousClass2GT r3) {
        CQN cqn = (CQN) r3.invoke(cqg.A00);
        cqg.A00 = cqn;
        CQM cqm = cqg.A01;
        if (cqm != null) {
            cqm.A00(cqn);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r1 == p000X.C53502Ta.BRAND) goto L_0x0018;
     */
    public final ProductSourceOverrideStatus A01() {
        C53502Ta r1;
        boolean z = true;
        if (!this.A00.A04.isEmpty()) {
            ProductSource productSource = this.A00.A00;
            if (productSource != null) {
                r1 = productSource.A00;
            } else {
                r1 = null;
            }
        }
        z = false;
        if (z) {
            return ProductSourceOverrideStatus.ALREADY_TAGGED;
        }
        return ProductSourceOverrideStatus.A05;
    }

    public final String A02(AnonymousClass0C1 r4) {
        C53502Ta r1;
        C13150hy.A02(r4, "userSession");
        ProductSource productSource = this.A00.A00;
        if (productSource != null) {
            r1 = productSource.A00;
        } else {
            r1 = null;
        }
        if (r1 != C53502Ta.BRAND) {
            String A042 = r4.A04();
            C13150hy.A01(A042, "userSession.userId");
            return A042;
        }
        if (productSource == null) {
            C13150hy.A00();
        }
        String str = productSource.A01;
        if (str == null) {
            C13150hy.A00();
        }
        return str;
    }

    public final void A03(Product product, C27702CNw cNw) {
        C13150hy.A02(product, "product");
        C13150hy.A02(cNw, "item");
        if (this.A04 == -1 || this.A00.A04.size() != this.A04 || this.A00.A04.contains(product.getId())) {
            A00(this, new CQK(this, cNw, product));
            return;
        }
        CQM cqm = this.A01;
        if (cqm != null) {
            CQF cqf = cqm.A00;
            Context context = cqf.getContext();
            if (context == null) {
                C13150hy.A00();
            }
            C13150hy.A01(context, "context!!");
            if (cqf.isResumed()) {
                AnonymousClass5F9.A00(context, C0003R.string.added_products_over_limit);
            }
        }
    }

    public final void A68() {
        this.A03.A68();
    }
}
