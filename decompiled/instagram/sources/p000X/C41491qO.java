package p000X;

import com.instagram.shopping.fragment.pdp.lightbox.LightboxFragment;

/* renamed from: X.1qO  reason: invalid class name and case insensitive filesystem */
public final class C41491qO extends AnonymousClass1SZ {
    public final LightboxFragment A00;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        C211969Ch r12 = (C211969Ch) obj;
        LightboxFragment lightboxFragment = this.A00;
        C212399Eb r4 = lightboxFragment.A05;
        String A01 = r12.A01();
        String str = r12.A02;
        int indexOf = lightboxFragment.A0C.indexOf(r12);
        int size = lightboxFragment.A0C.size();
        boolean A04 = LightboxFragment.A04(lightboxFragment, r12);
        boolean z = lightboxFragment.A0D;
        C92633zT r3 = new C92633zT(r4.A00.A02("instagram_shopping_lightbox_item_impression"));
        if (r3.A0B()) {
            r3.A07("product_id", Long.valueOf(Long.parseLong(r4.A02.getId())));
            r3.A08("merchant_id", r4.A02.A02.A02);
            r3.A04("is_checkout_enabled", Boolean.valueOf(r4.A02.A09()));
            r3.A08("item_id", A01);
            r3.A08("item_type", str);
            r3.A07("item_index", Long.valueOf((long) indexOf));
            r3.A07("item_count", Long.valueOf((long) size));
            r3.A04("item_is_influencer_media", Boolean.valueOf(A04));
            r3.A04("is_loading", Boolean.valueOf(z));
            r3.A08("checkout_session_id", r4.A04);
            r3.A08("prior_module", r4.A05);
            r3.A08("prior_submodule", r4.A06);
            AnonymousClass1NJ r0 = r4.A01;
            if (r0 != null) {
                r3.A08("m_pk", r0.getId());
                r3.A08("media_owner_id", r4.A01.A0c(r4.A03).getId());
            }
            r3.A01();
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        C211969Ch r12 = (C211969Ch) obj;
        LightboxFragment lightboxFragment = this.A00;
        C212399Eb r4 = lightboxFragment.A05;
        String A01 = r12.A01();
        String str = r12.A02;
        int indexOf = lightboxFragment.A0C.indexOf(r12);
        int size = lightboxFragment.A0C.size();
        boolean A04 = LightboxFragment.A04(lightboxFragment, r12);
        boolean z = lightboxFragment.A0D;
        C92623zS r3 = new C92623zS(r4.A00.A02("instagram_shopping_lightbox_item_subimpression"));
        if (r3.A0B()) {
            r3.A07("product_id", Long.valueOf(Long.parseLong(r4.A02.getId())));
            r3.A08("merchant_id", r4.A02.A02.A02);
            r3.A04("is_checkout_enabled", Boolean.valueOf(r4.A02.A09()));
            r3.A08("item_id", A01);
            r3.A08("item_type", str);
            r3.A07("item_index", Long.valueOf((long) indexOf));
            r3.A07("item_count", Long.valueOf((long) size));
            r3.A04("item_is_influencer_media", Boolean.valueOf(A04));
            r3.A04("is_loading", Boolean.valueOf(z));
            r3.A08("checkout_session_id", r4.A04);
            r3.A08("prior_module", r4.A05);
            r3.A08("prior_submodule", r4.A06);
            AnonymousClass1NJ r0 = r4.A01;
            if (r0 != null) {
                r3.A08("m_pk", r0.getId());
                r3.A08("media_owner_id", r4.A01.A0c(r4.A03).getId());
            }
            r3.A01();
        }
    }

    public C41491qO(AnonymousClass0C1 r2, LightboxFragment lightboxFragment) {
        super(C28191Kt.A00(r2).A01());
        this.A00 = lightboxFragment;
    }
}
