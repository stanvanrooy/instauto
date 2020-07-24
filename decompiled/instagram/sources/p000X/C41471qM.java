package p000X;

import com.instagram.model.shopping.productfeed.ProductCollectionTile;

/* renamed from: X.1qM  reason: invalid class name and case insensitive filesystem */
public final class C41471qM extends AnonymousClass1SZ {
    public final AnonymousClass9TW A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    public C41471qM(AnonymousClass0C1 r3, AnonymousClass9TW r4) {
        super(r1.A01());
        C13150hy.A02(r4, "logger");
        C28191Kt A002 = C28191Kt.A00(r3);
        C13150hy.A01(A002, "ViewpointImpressionPrefe….getInstance(userSession)");
        this.A00 = r4;
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        C216239Tz r9 = (C216239Tz) obj;
        C216309Ug r10 = (C216309Ug) obj2;
        C13150hy.A02(r9, "model");
        C13150hy.A02(r10, "state");
        AnonymousClass9TW r5 = this.A00;
        ProductCollectionTile productCollectionTile = r9.A00;
        int i = r10.A01;
        int i2 = r10.A00;
        String str = r9.A02;
        C92563zM r3 = new C92563zM(r5.A01.A02("instagram_shopping_product_collection_tile_impression"));
        if (r3.A0B()) {
            r3.A03("navigation_info", AnonymousClass9TW.A01(r5, str));
            r3.A03("collections_logging_info", AnonymousClass9TW.A00(productCollectionTile, i, i2));
            r3.A03("ads_tracking_info", r5.A00);
            String str2 = r5.A02;
            if (!(str2 == null && (str2 = AnonymousClass9TW.A02(productCollectionTile)) == null)) {
                r3.A07("merchant_id", AnonymousClass5AS.A01(str2).A00);
            }
            r3.A01();
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        C216239Tz r9 = (C216239Tz) obj;
        C216309Ug r10 = (C216309Ug) obj2;
        C13150hy.A02(r9, "model");
        C13150hy.A02(r10, "state");
        AnonymousClass9TW r5 = this.A00;
        ProductCollectionTile productCollectionTile = r9.A00;
        int i = r10.A01;
        int i2 = r10.A00;
        String str = r9.A02;
        C92553zL r3 = new C92553zL(r5.A01.A02("instagram_shopping_product_collection_tile_sub_impression"));
        if (r3.A0B()) {
            r3.A03("navigation_info", AnonymousClass9TW.A01(r5, str));
            r3.A03("collections_logging_info", AnonymousClass9TW.A00(productCollectionTile, i, i2));
            r3.A03("ads_tracking_info", r5.A00);
            String str2 = r5.A02;
            if (!(str2 == null && (str2 = AnonymousClass9TW.A02(productCollectionTile)) == null)) {
                r3.A07("merchant_id", AnonymousClass5AS.A01(str2).A00);
            }
            r3.A01();
        }
    }
}
