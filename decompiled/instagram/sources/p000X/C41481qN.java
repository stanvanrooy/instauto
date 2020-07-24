package p000X;

/* renamed from: X.1qN  reason: invalid class name and case insensitive filesystem */
public final class C41481qN extends AnonymousClass1SZ {
    public final AnonymousClass9TW A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    public C41481qN(AnonymousClass0C1 r3, AnonymousClass9TW r4) {
        super(r1.A01());
        C13150hy.A02(r4, "logger");
        C28191Kt A002 = C28191Kt.A00(r3);
        C13150hy.A01(A002, "ViewpointImpressionPrefe….getInstance(userSession)");
        this.A00 = r4;
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        AnonymousClass9UX r6 = (AnonymousClass9UX) obj;
        C13150hy.A02(r6, "model");
        AnonymousClass9TW r4 = this.A00;
        String str = r6.A00;
        C92583zO r3 = new C92583zO(r4.A01.A02("instagram_shopping_product_collection_tile_hscroll_impression"));
        if (r3.A0B()) {
            r3.A03("navigation_info", AnonymousClass9TW.A01(r4, str));
            r3.A03("ads_tracking_info", r4.A00);
            String str2 = r4.A02;
            if (str2 != null) {
                r3.A07("merchant_id", AnonymousClass5AS.A01(str2).A00);
            }
            r3.A01();
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        AnonymousClass9UX r6 = (AnonymousClass9UX) obj;
        C13150hy.A02(r6, "model");
        AnonymousClass9TW r4 = this.A00;
        String str = r6.A00;
        C92573zN r3 = new C92573zN(r4.A01.A02("instagram_shopping_product_collection_tile_hscroll_sub_impression"));
        if (r3.A0B()) {
            r3.A03("navigation_info", AnonymousClass9TW.A01(r4, str));
            r3.A03("ads_tracking_info", r4.A00);
            String str2 = r4.A02;
            if (str2 != null) {
                r3.A07("merchant_id", AnonymousClass5AS.A01(str2).A00);
            }
            r3.A01();
        }
    }
}
