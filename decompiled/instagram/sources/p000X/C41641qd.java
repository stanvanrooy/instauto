package p000X;

/* renamed from: X.1qd  reason: invalid class name and case insensitive filesystem */
public final class C41641qd extends AnonymousClass1SZ {
    public final AnonymousClass0QT A00;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        B4b b4b = (B4b) obj;
        C92613zR r3 = new C92613zR(this.A00.A02("instagram_shopping_mini_shop_storefront_profile_entry_point_impression"));
        if (r3.A0B()) {
            r3.A07("merchant_id", AnonymousClass5AS.A01(b4b.A01).A00);
            AnonymousClass9QM r2 = new AnonymousClass9QM();
            r2.A03("prior_module", b4b.A00);
            r2.A03("submodule", b4b.A05);
            r2.A03("shopping_session_id", b4b.A02);
            r3.A03("navigation_info", r2);
            AnonymousClass9OB r22 = new AnonymousClass9OB();
            r22.A03("m_pk", b4b.A03);
            r22.A03("tracking_token", b4b.A04);
            r3.A03("ads_tracking_info", r22);
            r3.A01();
        }
    }

    public C41641qd(AnonymousClass1L0 r1, C13740j9 r2, AnonymousClass0QT r3) {
        super(r2, r1);
        this.A00 = r3;
    }

    public final void A02(Object obj, Object obj2) {
    }
}
