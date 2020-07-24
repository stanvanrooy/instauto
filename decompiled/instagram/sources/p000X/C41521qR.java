package p000X;

/* renamed from: X.1qR  reason: invalid class name and case insensitive filesystem */
public final class C41521qR extends AnonymousClass1SZ {
    public final AnonymousClass9TO A00;
    public final C30611Un A01;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        AnonymousClass9VY r6 = (AnonymousClass9VY) obj;
        Integer num = (Integer) obj2;
        AnonymousClass9VP r2 = r6.A00;
        if (r2 != null) {
            C30611Un r1 = this.A01;
            AnonymousClass0a4.A06(r1);
            AnonymousClass0a4.A06(num);
            r1.A00(r2, (String) null, num);
            return;
        }
        AnonymousClass9TO r4 = this.A00;
        String str = r6.A01;
        C92113yd r3 = new C92113yd(r4.A00.A02("instagram_shopping_merchant_hscroll_impression"));
        if (r3.A0B()) {
            r3.A03("navigation_info", AnonymousClass9TO.A02(r4, str));
            r3.A03("collections_logging_info", AnonymousClass9TO.A00(r4, (Integer) null));
            r3.A01();
        }
    }

    public C41521qR(C13740j9 r1, AnonymousClass9TO r2, C30611Un r3) {
        super(r1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A02(Object obj, Object obj2) {
    }
}
