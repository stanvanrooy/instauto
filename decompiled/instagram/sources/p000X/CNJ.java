package p000X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductUntaggableReason;
import com.instagram.model.shopping.ProductVariantDimension;

/* renamed from: X.CNJ */
public final class CNJ {
    public ProductSource A00;
    public final AnonymousClass0C1 A01;
    public final C27371Ho A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public static C37141jB A00(CNJ cnj, String str) {
        C37141jB A032 = C37591ju.A03(str, cnj.A02);
        A032.A33 = cnj.A01.A04();
        ProductSource productSource = cnj.A00;
        A032.A23 = productSource;
        A032.A4F = cnj.A04;
        String str2 = cnj.A05;
        if (str2 != null) {
            A032.A5A = str2;
        }
        String str3 = cnj.A03;
        if (str3 != null) {
            A032.A4E = str3;
        }
        if (productSource != null) {
            boolean z = false;
            if (productSource.A00 == C53502Ta.BRAND) {
                z = true;
            }
            A032.A2X = Boolean.valueOf(z);
            A032.A23 = productSource;
        }
        return A032;
    }

    public final void A02(Product product, C27702CNw cNw, ProductSource productSource) {
        C37141jB A002 = A00(this, "instagram_shopping_product_tagging_product_selected");
        A002.A4G = product.getId();
        A002.A4a = cNw.A01;
        A002.A4b = cNw.A03;
        A002.A0F(product.A02.A02);
        C27788CRg cRg = cNw.A00.A01;
        if (cRg != null) {
            A002.A56 = ((ProductVariantDimension) cRg.A00.A01().get(0)).A02;
        }
        ProductUntaggableReason productUntaggableReason = product.A08;
        if (productUntaggableReason != null) {
            A002.A4J = productUntaggableReason.A04;
        }
        C06270Ok A003 = C06270Ok.A00();
        A003.A05("is_sku_match", Boolean.valueOf(CRI.A00(cNw)));
        if (productSource != null) {
            A003.A09("selected_source_id", productSource.A01);
            A003.A09("selected_source_type", productSource.A00.toString());
            String str = productSource.A03;
            if (str == null) {
                str = productSource.A04;
            }
            A003.A09("selected_source_name", str);
        }
        A002.A07(A003);
        A01(this.A01, A002);
    }

    public final void A03(C27671CMp cMp, boolean z, Integer num, String str, Boolean bool, Boolean bool2) {
        String str2;
        C37141jB A002 = A00(this, "instagram_shopping_product_search");
        A002.A4H = cMp.name();
        if (z) {
            str2 = "success";
        } else {
            str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
        }
        A002.A42 = str2;
        C06270Ok A003 = C06270Ok.A00();
        A003.A07("result_count", num);
        A003.A09("search_text", str);
        A003.A05("is_initial_load", bool);
        A003.A05("has_more_results", bool2);
        A002.A07(A003);
        A01(this.A01, A002);
    }

    public final void A04(Integer num, Boolean bool, Boolean bool2) {
        C37141jB A002 = A00(this, "instagram_shopping_product_tagging_load_success");
        C06270Ok A003 = C06270Ok.A00();
        A003.A07("result_count", num);
        A003.A05("is_initial_load", bool);
        A003.A05("has_more_results", bool2);
        A002.A07(A003);
        A01(this.A01, A002);
    }

    public CNJ(AnonymousClass0C1 r1, String str, String str2, String str3, C27371Ho r5) {
        this.A01 = r1;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = r5;
    }

    public static void A01(AnonymousClass0C1 r2, C37141jB r3) {
        C36901in.A03(AnonymousClass0WN.A01(r2), r3.A03(), Constants.ZERO);
    }
}
