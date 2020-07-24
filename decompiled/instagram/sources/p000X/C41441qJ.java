package p000X;

import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.1qJ  reason: invalid class name and case insensitive filesystem */
public final class C41441qJ extends AnonymousClass1SZ {
    public final C27371Ho A00;
    public final AnonymousClass0C1 A01;
    public final C41451qK A02;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        AnonymousClass9RB r7 = (AnonymousClass9RB) obj;
        AnonymousClass9OJ r8 = (AnonymousClass9OJ) obj2;
        ProductFeedItem productFeedItem = r7.A00;
        if (productFeedItem.A04 == Constants.ONE) {
            C27371Ho r1 = this.A00;
            AnonymousClass0C1 r0 = this.A01;
            int i = r8.A01;
            int i2 = r8.A00;
            C91493xd r3 = new C91493xd(AnonymousClass0QT.A00(r0, r1).A02("instagram_collection_home_impression"));
            if (r3.A0B()) {
                String A002 = C71813Cg.A00(i, i2);
                r3.A08("collection_id", AnonymousClass2TX.PRODUCT_AUTO_COLLECTION.A01);
                r3.A08("collection_name", AnonymousClass2TX.PRODUCT_AUTO_COLLECTION.A00);
                r3.A08("position", A002);
                r3.A07("product_id", Long.valueOf(Long.parseLong(productFeedItem.getId())));
                boolean z = false;
                if (productFeedItem.A00 != null) {
                    z = true;
                }
                r3.A04("is_product_available", Boolean.valueOf(z));
                r3.A01();
            }
        }
        this.A02.A01(r7, r8);
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        this.A02.A02((AnonymousClass9RB) obj, (AnonymousClass9OJ) obj2);
    }

    public C41441qJ(C27371Ho r2, AnonymousClass0C1 r3, C30661Us r4) {
        super(C28191Kt.A00(r3).A01());
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = new C41451qK(r3, r4);
    }
}
