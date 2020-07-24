package p000X;

import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.productfeed.MultiProductComponent;

/* renamed from: X.1y2  reason: invalid class name and case insensitive filesystem */
public final class C45501y2 extends C28241Ky {
    public final AnonymousClass9RH A00;

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2, long j) {
        AnonymousClass9RG r11 = (AnonymousClass9RG) obj;
        AnonymousClass9OJ r12 = (AnonymousClass9OJ) obj2;
        AnonymousClass9RH r4 = this.A00;
        MultiProductComponent multiProductComponent = r11.A01;
        String str = r11.A02;
        String str2 = r11.A03;
        FiltersLoggingInfo filtersLoggingInfo = r11.A00;
        int i = r12.A01;
        int i2 = r12.A00;
        C91583xm r3 = new C91583xm(r4.A01.A02("instagram_shopping_checker_tile_viewed_sub_impression"));
        if (r3.A0B()) {
            r3.A08("product_collection_type", multiProductComponent.ALh().toString());
            r3.A08("position", C71813Cg.A00(i, i2));
            r3.A08("prior_module", r4.A02);
            r3.A08("prior_submodule", r4.A03);
            r3.A08("submodule", str);
            r3.A08("shopping_session_id", r4.A04);
            if (str2 != null) {
                r3.A07("merchant_id", AnonymousClass5AS.A01(str2).A00);
            }
            if (filtersLoggingInfo != null) {
                r3.A08("sort_by", filtersLoggingInfo.A00());
                r3.A0A("filters", filtersLoggingInfo.A01());
            }
            AnonymousClass9OB r2 = r4.A00;
            if (r2 != null) {
                r3.A03("feed_item_info", r2);
            }
            r3.A01();
        }
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2, long j) {
        AnonymousClass9RG r11 = (AnonymousClass9RG) obj;
        AnonymousClass9OJ r12 = (AnonymousClass9OJ) obj2;
        AnonymousClass9RH r4 = this.A00;
        MultiProductComponent multiProductComponent = r11.A01;
        String str = r11.A02;
        String str2 = r11.A03;
        FiltersLoggingInfo filtersLoggingInfo = r11.A00;
        int i = r12.A01;
        int i2 = r12.A00;
        C91573xl r3 = new C91573xl(r4.A01.A02("instagram_shopping_checker_tile_viewed_impression"));
        if (r3.A0B()) {
            r3.A08("product_collection_type", multiProductComponent.ALh().toString());
            r3.A08("position", C71813Cg.A00(i, i2));
            r3.A08("prior_module", r4.A02);
            r3.A08("prior_submodule", r4.A03);
            r3.A08("submodule", str);
            r3.A08("shopping_session_id", r4.A04);
            if (str2 != null) {
                r3.A07("merchant_id", AnonymousClass5AS.A01(str2).A00);
            }
            if (filtersLoggingInfo != null) {
                r3.A08("sort_by", filtersLoggingInfo.A00());
                r3.A0A("filters", filtersLoggingInfo.A01());
            }
            AnonymousClass9OB r2 = r4.A00;
            if (r2 != null) {
                r3.A03("feed_item_info", r2);
            }
            r3.A01();
        }
    }

    public C45501y2(AnonymousClass9RH r1, AnonymousClass1L0 r2, C13740j9 r3) {
        super(r2, r3);
        this.A00 = r1;
    }
}
