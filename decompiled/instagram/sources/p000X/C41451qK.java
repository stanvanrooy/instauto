package p000X;

import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;

/* renamed from: X.1qK  reason: invalid class name and case insensitive filesystem */
public final class C41451qK extends AnonymousClass1SZ {
    public AnonymousClass0C1 A00;
    public final C30661Us A01;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (p000X.AnonymousClass9DO.A01(r6.A00, r7.A01.A02) == false) goto L_0x001d;
     */
    /* renamed from: A03 */
    public final void A01(AnonymousClass9RB r7, AnonymousClass9OJ r8) {
        Product product;
        boolean z;
        String str;
        ProductFeedItem productFeedItem = r7.A00;
        ProductTile productTile = productFeedItem.A03;
        if (productTile != null) {
            product = productTile.A00;
        } else {
            product = productFeedItem.A00;
        }
        if (product != null && AnonymousClass9DO.A00(product)) {
            z = true;
        }
        z = false;
        if (product != null) {
            AnonymousClass9RK r3 = new AnonymousClass9RK(this.A01, productFeedItem, r8.A01, r8.A00);
            String str2 = r7.A01.A01;
            if (str2 != null) {
                r3.A00.A07("pdp_product_id", Long.valueOf(Long.parseLong(str2)));
            }
            String str3 = r7.A01.A02;
            String str4 = str3;
            if (str3 != null) {
                r3.A00.A08("submodule", str4);
            }
            if (z) {
                str = "add_to_bag";
            } else {
                str = null;
            }
            if (str != null) {
                r3.A00.A08("action", str);
            }
            AnonymousClass9RM r1 = r3.A00;
            if (r1.A0B()) {
                r1.A01();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (p000X.AnonymousClass9DO.A01(r6.A00, r7.A01.A02) == false) goto L_0x001d;
     */
    /* renamed from: A04 */
    public final void A02(AnonymousClass9RB r7, AnonymousClass9OJ r8) {
        Product product;
        boolean z;
        String str;
        ProductFeedItem productFeedItem = r7.A00;
        ProductTile productTile = productFeedItem.A03;
        if (productTile != null) {
            product = productTile.A00;
        } else {
            product = productFeedItem.A00;
        }
        if (product != null && AnonymousClass9DO.A00(product)) {
            z = true;
        }
        z = false;
        if (product != null) {
            AnonymousClass9RL r3 = new AnonymousClass9RL(this.A01, productFeedItem, r8.A01, r8.A00);
            String str2 = r7.A01.A01;
            if (str2 != null) {
                r3.A00.A07("pdp_product_id", Long.valueOf(Long.parseLong(str2)));
            }
            String str3 = r7.A01.A02;
            String str4 = str3;
            if (str3 != null) {
                r3.A00.A08("submodule", str4);
            }
            if (z) {
                str = "add_to_bag";
            } else {
                str = null;
            }
            if (str != null) {
                r3.A00.A08("action", str);
            }
            AnonymousClass9RN r1 = r3.A00;
            if (r1.A0B()) {
                r1.A01();
            }
        }
    }

    public C41451qK(AnonymousClass0C1 r2, C30661Us r3) {
        super(C28191Kt.A00(r2).A01());
        this.A00 = r2;
        this.A01 = r3;
    }
}
