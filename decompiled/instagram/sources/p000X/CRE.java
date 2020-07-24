package p000X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;
import java.util.List;

/* renamed from: X.CRE */
public class CRE {
    public ProductSource A00;
    public String A01;
    public final AnonymousClass0QT A02;
    public final String A03;
    public final String A04;

    public static String A00(C27702CNw cNw) {
        String str;
        Integer A002 = CNO.A00(cNw.A03);
        if (A002 != null) {
            switch (A002.intValue()) {
                case 1:
                    return "product_item";
                case 2:
                    return AnonymousClass0C5.$const$string(112);
            }
        }
        if (A002 != null) {
            switch (A002.intValue()) {
                case 1:
                    str = "SECTION_TYPE_ITEM";
                    break;
                case 2:
                    str = "SECTION_TYPE_GROUP";
                    break;
                case 3:
                    str = "SECTION_TYPE_COLLECTION";
                    break;
                default:
                    str = "SECTION_TYPE_HEADER";
                    break;
            }
        } else {
            str = "null";
        }
        throw new RuntimeException(AnonymousClass000.A0E("Unsupported product row type: ", str));
    }

    public final void A01(Product product, C27702CNw cNw) {
        C27805CRx cRx = new C27805CRx(this.A02.A02("instagram_shopping_shop_manager_add_product_tap"));
        if (cRx.A0B()) {
            cRx.A08("waterfall_id", this.A04);
            cRx.A08("prior_module", this.A03);
            cRx.A08("product_row_type", A00(cNw));
            cRx.A08("product_id", product.getId());
            cRx.A04("is_sku_match", Boolean.valueOf(CRI.A00(cNw)));
            cRx.A08("submodule", this.A01);
            cRx.A01();
        }
    }

    public final void A02(Product product, C27702CNw cNw) {
        C27798CRq cRq = new C27798CRq(this.A02.A02("instagram_shopping_shop_manager_hide_product_tap"));
        if (cRq.A0B()) {
            cRq.A08("waterfall_id", this.A04);
            cRq.A08("prior_module", this.A03);
            cRq.A08("product_row_type", A00(cNw));
            cRq.A08("product_id", product.getId());
            cRq.A04("is_sku_match", Boolean.valueOf(CRI.A00(cNw)));
            cRq.A08("submodule", this.A01);
            cRq.A01();
        }
    }

    public final void A03(Product product, C27702CNw cNw, long j, long j2, boolean z, String str) {
        String str2;
        C27803CRv cRv = new C27803CRv(this.A02.A02("instagram_shopping_shop_manager_add_to_shop_request_completed"));
        if (cRv.A0B()) {
            cRv.A08("waterfall_id", this.A04);
            cRv.A08("prior_module", this.A03);
            cRv.A08("product_row_type", A00(cNw));
            cRv.A08("product_id", product.getId());
            cRv.A07("network_start_time", Long.valueOf(j));
            cRv.A07("network_end_time", Long.valueOf(j2));
            if (z) {
                str2 = "success";
            } else {
                str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            cRv.A08("network_result", str2);
            cRv.A08("error_message", str);
            cRv.A01();
        }
    }

    public final void A04(Product product, C27702CNw cNw, long j, long j2, boolean z, String str) {
        String str2;
        C27799CRr cRr = new C27799CRr(this.A02.A02("instagram_shopping_shop_manager_hide_product_request_completed"));
        if (cRr.A0B()) {
            cRr.A08("waterfall_id", this.A04);
            cRr.A08("prior_module", this.A03);
            cRr.A08("product_row_type", A00(cNw));
            cRr.A08("product_id", product.getId());
            cRr.A07("network_start_time", Long.valueOf(j));
            cRr.A07("network_end_time", Long.valueOf(j2));
            if (z) {
                str2 = "success";
            } else {
                str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            cRr.A08("network_result", str2);
            cRr.A08("error_message", str);
            cRr.A08("submodule", this.A01);
            cRr.A01();
        }
    }

    public final void A05(ProductCollectionTile productCollectionTile) {
        C27806CRy cRy = new C27806CRy(this.A02.A02("instagram_shopping_shop_manager_add_collection_tap"));
        if (cRy.A0B()) {
            cRy.A08("waterfall_id", this.A04);
            cRy.A08("prior_module", this.A03);
            cRy.A08("product_collection_id", productCollectionTile.A05);
            cRy.A08("submodule", this.A01);
            cRy.A01();
        }
    }

    public final void A06(ProductCollectionTile productCollectionTile) {
        C27800CRs cRs = new C27800CRs(this.A02.A02("instagram_shopping_shop_manager_hide_collection_tap"));
        if (cRs.A0B()) {
            cRs.A08("waterfall_id", this.A04);
            cRs.A08("prior_module", this.A03);
            cRs.A08("product_collection_id", productCollectionTile.A05);
            cRs.A08("submodule", this.A01);
            cRs.A01();
        }
    }

    public final void A07(ProductCollectionTile productCollectionTile, long j, long j2, boolean z, String str) {
        String str2;
        C27807CRz cRz = new C27807CRz(this.A02.A02("instagram_shopping_shop_manager_add_collection_request_completed"));
        if (cRz.A0B()) {
            cRz.A08("waterfall_id", this.A04);
            cRz.A08("prior_module", this.A03);
            cRz.A08("product_collection_id", productCollectionTile.A05);
            cRz.A07("network_start_time", Long.valueOf(j));
            cRz.A07("network_end_time", Long.valueOf(j2));
            if (z) {
                str2 = "success";
            } else {
                str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            cRz.A08("network_result", str2);
            cRz.A08("error_message", str);
            cRz.A08("submodule", this.A01);
            cRz.A01();
        }
    }

    public final void A08(ProductCollectionTile productCollectionTile, long j, long j2, boolean z, String str) {
        String str2;
        C27801CRt cRt = new C27801CRt(this.A02.A02("instagram_shopping_shop_manager_hide_collection_request_completed"));
        if (cRt.A0B()) {
            cRt.A08("waterfall_id", this.A04);
            cRt.A08("prior_module", this.A03);
            cRt.A08("product_collection_id", productCollectionTile.A05);
            cRt.A07("network_start_time", Long.valueOf(j));
            cRt.A07("network_end_time", Long.valueOf(j2));
            if (z) {
                str2 = "success";
            } else {
                str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            cRt.A08("network_result", str2);
            cRt.A08("error_message", str);
            cRt.A08("submodule", this.A01);
            cRt.A01();
        }
    }

    public final void A09(ProductCollectionTile productCollectionTile, CRC crc) {
        C27802CRu cRu = new C27802CRu(this.A02.A02("instagram_shopping_shop_manager_disabled_collection_tap"));
        if (cRu.A0B()) {
            cRu.A08("waterfall_id", this.A04);
            cRu.A08("prior_module", this.A03);
            cRu.A08("product_collection_id", productCollectionTile.A05);
            cRu.A08("disabled_reason", crc.A01);
            cRu.A08("submodule", this.A01);
            cRu.A01();
        }
    }

    public final void A0A(String str, List list, Boolean bool, Boolean bool2, Boolean bool3) {
        long j;
        String str2;
        C27759CQd cQd = new C27759CQd(this.A02.A02("instagram_shopping_collection_search"));
        if (cQd.A0B()) {
            if (list != null) {
                j = (long) CNM.A00(list);
            } else {
                j = 0;
            }
            cQd.A08("product_search_context", "shop_manager");
            if (bool3.booleanValue()) {
                str2 = "success";
            } else {
                str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            cQd.A08("network_result", str2);
            cQd.A08("search_text", str);
            cQd.A08("prior_module", this.A03);
            cQd.A08("waterfall_id", this.A04);
            cQd.A07("result_count", Long.valueOf(j));
            cQd.A04("is_initial_load", bool);
            cQd.A04("has_more_results", bool2);
            cQd.A08("submodule", this.A01);
            cQd.A01();
        }
    }

    public final void A0B(boolean z) {
        String str;
        CS0 cs0 = new CS0(this.A02.A02("instagram_shopping_product_search"));
        if (cs0.A0B()) {
            cs0.A08("waterfall_id", this.A04);
            cs0.A08("prior_module", this.A03);
            cs0.A07("is_marketer", 0L);
            if (z) {
                str = "success";
            } else {
                str = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            cs0.A08("network_result", str);
            cs0.A08("product_search_context", "shop_manager");
            cs0.A08("submodule", this.A01);
            ProductSource productSource = this.A00;
            if (productSource != null) {
                cs0.A08("selected_source_id", productSource.A01);
                cs0.A08("selected_source_name", this.A00.A04);
                cs0.A08("selected_source_type", this.A00.A00.toString());
            }
            cs0.A01();
        }
    }

    public CRE(AnonymousClass0C1 r2, C27371Ho r3, String str, String str2) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = AnonymousClass0QT.A00(r2, r3);
    }
}
