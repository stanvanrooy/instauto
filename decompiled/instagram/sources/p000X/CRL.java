package p000X;

import android.content.Context;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductVariantDimension;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.CRL */
public final class CRL implements C29091Oo {
    public CQN A00;
    public CRS A01;
    public Set A02 = new LinkedHashSet();
    public final C27797CRp A03;
    public final CS1 A04;
    public final CRO A05;
    public final CRR A06 = new CRR(this);
    public final CRQ A07 = new CRQ(this);
    public final C27362CAh A08;
    public final CRP A09;

    public CRL(AnonymousClass0C1 r10, Context context, AnonymousClass1L8 r12, C27797CRp cRp) {
        C13150hy.A02(r10, "userSession");
        C13150hy.A02(context, "context");
        C13150hy.A02(r12, "loaderManager");
        C13150hy.A02(cRp, "logger");
        this.A03 = cRp;
        CRO cro = new CRO(this);
        this.A05 = cro;
        this.A04 = new CS1(r10, cro);
        this.A09 = new CRP(this.A07, r10, context, r12);
        this.A08 = new C27362CAh(this.A06, r10, context, r12);
        AnonymousClass10U r2 = AnonymousClass10U.A00;
        C219359cu r4 = C219359cu.A00;
        this.A00 = new CQN("", r2, (ProductSource) null, r4, r4, false, false, false);
    }

    public static final void A00(CRL crl, AnonymousClass2GT r3) {
        CQN cqn = (CQN) r3.invoke(crl.A00);
        crl.A00 = cqn;
        CRS crs = crl.A01;
        if (crs != null) {
            ProductSource productSource = cqn.A00;
            if (productSource != null) {
                crs.A00.A04.A00(productSource);
            }
            C27780CQy cQy = crs.A00.A02;
            C13150hy.A02(cqn, "state");
            cQy.A00.A00(cqn);
        }
    }

    public final void A01(Product product, C27702CNw cNw, ProductGroup productGroup) {
        C13150hy.A02(product, "product");
        C13150hy.A02(cNw, "item");
        if (!this.A02.contains(cNw.A02)) {
            boolean z = !this.A00.A03.contains(cNw.A02);
            A00(this, new CQL(z, cNw, product));
            Set set = this.A02;
            String str = cNw.A02;
            C13150hy.A01(str, "item.sectionId");
            set.add(str);
            if (z) {
                if (productGroup != null) {
                    C27797CRp cRp = this.A03;
                    C27804CRw cRw = new C27804CRw(cRp.A02.A02("instagram_shopping_shop_manager_add_product_variant_selection_tap"));
                    if (cRw.A0B()) {
                        ProductVariantDimension productVariantDimension = (ProductVariantDimension) productGroup.A01().get(0);
                        Iterator it = productGroup.A01().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ProductVariantDimension productVariantDimension2 = (ProductVariantDimension) it.next();
                            if (productVariantDimension2.A00 == AnonymousClass9JI.THUMBNAIL) {
                                productVariantDimension = productVariantDimension2;
                                break;
                            }
                        }
                        cRw.A08("waterfall_id", cRp.A04);
                        cRw.A08("prior_module", cRp.A03);
                        cRw.A04("is_halfsheet", true);
                        cRw.A08("product_id", product.getId());
                        cRw.A08("product_row_type", CRE.A00(cNw));
                        cRw.A08("product_variant_dimension", productVariantDimension.A03);
                        cRw.A08("product_variant_value", product.A05(productVariantDimension.A02));
                        cRw.A08("submodule", cRp.A01);
                        cRw.A01();
                    }
                } else {
                    this.A03.A01(product, cNw);
                }
                this.A08.A00(product, cNw);
                return;
            }
            this.A03.A02(product, cNw);
            this.A09.A00(product, cNw);
        }
    }

    public final void A68() {
        this.A04.A68();
    }
}
