package p000X;

import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;

/* renamed from: X.1qP  reason: invalid class name and case insensitive filesystem */
public final class C41501qP extends AnonymousClass1SZ {
    public final AnonymousClass0C1 A00;
    public final C213979Kn A01;

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        String str;
        C211969Ch r11 = (C211969Ch) obj;
        C213149Hd r12 = (C213149Hd) obj2;
        C213979Kn r4 = this.A01;
        Product product = r12.A03;
        String A012 = r11.A01();
        String str2 = r11.A02;
        int i = r12.A02;
        int i2 = r12.A01;
        boolean A002 = C212139Cy.A00(this.A00, r11, product.A02.A02);
        boolean z = r12.A05;
        C13150hy.A02(product, "product");
        C13150hy.A02(A012, "itemId");
        C13150hy.A02(str2, "itemType");
        C92603zQ r3 = new C92603zQ(r4.A04.A02("instagram_shopping_pdp_hero_carousel_item_impression"));
        C13150hy.A01(r3, "event");
        if (r3.A0B()) {
            r3.A08("item_id", A012);
            r3.A08("item_type", str2);
            r3.A07("item_index", Long.valueOf((long) i));
            r3.A07("item_count", Long.valueOf((long) i2));
            r3.A04("item_is_influencer_media", Boolean.valueOf(A002));
            r3.A04("is_loading", Boolean.valueOf(z));
            String id = product.getId();
            C13150hy.A01(id, "product.id");
            r3.A07("product_id", Long.valueOf(Long.parseLong(id)));
            Merchant merchant = product.A02;
            C13150hy.A01(merchant, "product.merchant");
            r3.A08("merchant_id", merchant.A02);
            r3.A04("is_checkout_enabled", Boolean.valueOf(product.A09()));
            if (product.A09()) {
                str = r4.A08;
            } else {
                str = null;
            }
            r3.A08("checkout_session_id", str);
            r3.A08("prior_module", r4.A0A);
            r3.A08("prior_submodule", r4.A09);
            AnonymousClass1NJ r0 = r4.A01;
            if (r0 != null) {
                if (r0 == null) {
                    C13150hy.A00();
                }
                r3.A08("m_pk", r0.getId());
                AnonymousClass1NJ r1 = r4.A01;
                if (r1 == null) {
                    C13150hy.A00();
                }
                C13300iJ A0c = r1.A0c(r4.A07);
                C13150hy.A01(A0c, "media!!.getUser(userSession)");
                r3.A08("media_owner_id", A0c.getId());
            }
            r3.A01();
        }
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        String str;
        C211969Ch r12 = (C211969Ch) obj;
        C213149Hd r13 = (C213149Hd) obj2;
        C213979Kn r4 = this.A01;
        Product product = r13.A03;
        String A012 = r12.A01();
        String str2 = r12.A02;
        int i = r13.A02;
        int i2 = r13.A01;
        boolean A002 = C212139Cy.A00(this.A00, r12, product.A02.A02);
        boolean z = r13.A05;
        C13150hy.A02(product, "product");
        C13150hy.A02(A012, "itemId");
        C13150hy.A02(str2, "itemType");
        C92593zP r3 = new C92593zP(r4.A04.A02("instagram_shopping_pdp_hero_carousel_item_subimpression"));
        r3.A08("item_id", A012);
        r3.A08("item_type", str2);
        r3.A07("item_index", Long.valueOf((long) i));
        r3.A07("item_count", Long.valueOf((long) i2));
        r3.A04("item_is_influencer_media", Boolean.valueOf(A002));
        r3.A04("is_loading", Boolean.valueOf(z));
        String id = product.getId();
        C13150hy.A01(id, "product.id");
        r3.A07("product_id", Long.valueOf(Long.parseLong(id)));
        Merchant merchant = product.A02;
        C13150hy.A01(merchant, "product.merchant");
        r3.A08("merchant_id", merchant.A02);
        r3.A04("is_checkout_enabled", Boolean.valueOf(product.A09()));
        if (product.A09()) {
            str = r4.A08;
        } else {
            str = null;
        }
        r3.A08("checkout_session_id", str);
        r3.A08("prior_module", r4.A0A);
        r3.A08("prior_submodule", r4.A09);
        AnonymousClass1NJ r0 = r4.A01;
        if (r0 != null) {
            if (r0 == null) {
                C13150hy.A00();
            }
            r3.A08("m_pk", r0.getId());
            AnonymousClass1NJ r1 = r4.A01;
            if (r1 == null) {
                C13150hy.A00();
            }
            C13300iJ A0c = r1.A0c(r4.A07);
            C13150hy.A01(A0c, "media!!.getUser(userSession)");
            r3.A08("media_owner_id", A0c.getId());
        }
        r3.A01();
    }

    public C41501qP(AnonymousClass0C1 r2, C213979Kn r3) {
        super(C28191Kt.A00(r2).A01());
        this.A00 = r2;
        this.A01 = r3;
    }
}
