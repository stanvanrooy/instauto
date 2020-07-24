package p000X;

import com.instagram.model.shopping.Merchant;

/* renamed from: X.1qW  reason: invalid class name and case insensitive filesystem */
public final class C41571qW extends AnonymousClass1SZ {
    public final AnonymousClass9TP A00;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        Merchant merchant = (Merchant) obj;
        C13150hy.A02(merchant, "model");
        AnonymousClass9TP r4 = this.A00;
        C13150hy.A02(merchant, "merchant");
        C92103yc r3 = new C92103yc(r4.A03.A02("instagram_shopping_continue_shopping_row_impression"));
        C13150hy.A01(r3, "it");
        if (!r3.A0B()) {
            r3 = null;
        }
        if (r3 != null) {
            r3.A03("navigation_info", r4.A02);
            if (r3 != null) {
                r3.A07("merchant_id", AnonymousClass5AS.A01(merchant.A02).A00);
                if (r3 != null) {
                    r3.A03("collections_logging_info", r4.A00);
                    if (r3 != null) {
                        r3.A03("feed_item_info", r4.A01);
                        if (r3 != null) {
                            r3.A01();
                        }
                    }
                }
            }
        }
    }

    public final void A02(Object obj, Object obj2) {
        C13150hy.A02((Merchant) obj, "model");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public C41571qW(AnonymousClass0C1 r3, AnonymousClass9TP r4) {
        super(r1.A01());
        C13150hy.A02(r3, "userSession");
        C13150hy.A02(r4, "logger");
        C28191Kt A002 = C28191Kt.A00(r3);
        C13150hy.A01(A002, "ViewpointImpressionPrefe….getInstance(userSession)");
        this.A00 = r4;
    }
}
