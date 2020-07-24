package p000X;

import com.instagram.model.shopping.Merchant;

/* renamed from: X.1qS  reason: invalid class name and case insensitive filesystem */
public final class C41531qS extends AnonymousClass1SZ {
    public final AnonymousClass9TO A00;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        Merchant merchant = (Merchant) obj;
        Integer num = (Integer) obj2;
        AnonymousClass9TO r3 = this.A00;
        C92123ye r2 = new C92123ye(r3.A00.A02("instagram_shopping_merchant_hscroll_tile_impression"));
        if (r2.A0B()) {
            r2.A07("merchant_id", AnonymousClass5AS.A01(merchant.A02).A00);
            r2.A07("position", Long.valueOf((long) num.intValue()));
            r2.A03("navigation_info", AnonymousClass9TO.A02(r3, (String) null));
            r2.A03("collections_logging_info", AnonymousClass9TO.A00(r3, num));
            r2.A03("explore_logging_info", AnonymousClass9TO.A01(r3));
            r2.A01();
        }
    }

    public C41531qS(C13740j9 r1, AnonymousClass9TO r2) {
        super(r1);
        this.A00 = r2;
    }

    public final void A02(Object obj, Object obj2) {
    }
}
