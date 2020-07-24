package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;
import java.util.List;

/* renamed from: X.CQI */
public final class CQI implements CS4 {
    public final /* synthetic */ CQF A00;

    public CQI(CQF cqf) {
        this.A00 = cqf;
    }

    public final void BFy(View view, ProductGroup productGroup, C27702CNw cNw) {
        CQG A02 = CQF.A02(this.A00);
        ProductGroup productGroup2 = productGroup;
        C13150hy.A01(productGroup, "productGroup");
        C13150hy.A01(cNw, "item");
        C13150hy.A02(productGroup, "productGroup");
        C13150hy.A02(cNw, "item");
        List A002 = productGroup.A00();
        C13150hy.A01(A002, "productGroup.products");
        Product product = (Product) AnonymousClass10N.A08(A002);
        if (!A02.A00.A03.contains(cNw.A02)) {
            CQM cqm = A02.A01;
            if (cqm != null) {
                C13150hy.A02(productGroup, "productGroup");
                C13150hy.A02(cNw, "item");
                InlineSearchBox inlineSearchBox = cqm.A00.A02;
                if (inlineSearchBox == null) {
                    C13150hy.A03("inlineSearchBox");
                }
                inlineSearchBox.A04();
                CQF cqf = cqm.A00;
                cqf.A00 = new CQO(cqm, cNw);
                C23300zv.A00(CQF.A01(cqf)).A02(C213669Jf.class, cqm.A00.A00);
                C17510qM r4 = C17510qM.A00;
                CQF cqf2 = cqm.A00;
                r4.A0l(cqf2.getContext(), CQF.A01(cqf2), productGroup2, cqm.A00.getString(C0003R.string.choose_default), false);
                return;
            }
            return;
        }
        C13150hy.A01(product, "firstProduct");
        A02.A03(product, cNw);
    }
}
