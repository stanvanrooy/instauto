package p000X;

import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.CQK */
public final class CQK extends C18690sG implements AnonymousClass2GT {
    public final /* synthetic */ Product A00;
    public final /* synthetic */ CQG A01;
    public final /* synthetic */ C27702CNw A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CQK(CQG cqg, C27702CNw cNw, Product product) {
        super(1);
        this.A01 = cqg;
        this.A02 = cNw;
        this.A00 = product;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Set A012;
        Set A013;
        CQN cqn = (CQN) obj;
        C13150hy.A02(cqn, "$receiver");
        if (!this.A01.A00.A03.contains(this.A02.A02)) {
            A012 = ALT.A02(cqn.A03, this.A02.A02);
        } else {
            A012 = ALT.A01(cqn.A03, this.A02.A02);
        }
        if (!this.A01.A00.A04.contains(this.A00.getId())) {
            A013 = ALT.A02(cqn.A04, this.A00.getId());
        } else {
            A013 = ALT.A01(cqn.A04, this.A00.getId());
        }
        List<C27702CNw> list = cqn.A02;
        Product product = this.A00;
        C27702CNw cNw = this.A02;
        if (C13150hy.A05(cNw.A03, CNO.A01(Constants.A0C))) {
            ArrayList arrayList = new ArrayList(AnonymousClass10K.A00(list, 10));
            for (C27702CNw cNw2 : list) {
                if (C13150hy.A05(cNw2.A02, cNw.A02)) {
                    C27781CQz cQz = cNw2.A00;
                    C13150hy.A01(cQz, "item.layoutContent");
                    C27788CRg cRg = cQz.A01;
                    if (cRg == null) {
                        C13150hy.A00();
                    }
                    C13150hy.A01(cRg, "item.layoutContent.publi…ProductListGroupContent!!");
                    ProductGroup productGroup = cRg.A00;
                    C13150hy.A01(productGroup, "item.layoutContent.publi…oupContent!!.productGroup");
                    productGroup.A01 = AnonymousClass10M.A06(product);
                }
                arrayList.add(cNw2);
            }
            list = arrayList;
        }
        return CQN.A00(cqn, (String) null, list, (ProductSource) null, A012, A013, false, false, false, 229);
    }
}
