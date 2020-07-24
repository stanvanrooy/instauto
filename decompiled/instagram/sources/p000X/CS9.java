package p000X;

import com.facebook.C0003R;

/* renamed from: X.CS9 */
public final class CS9 {
    public final /* synthetic */ CSA A00;

    public CS9(CSA csa) {
        this.A00 = csa;
    }

    public final void A00(CSY csy) {
        CSM csm = this.A00.A03;
        C68832zy r2 = new C68832zy();
        if (csy.A00.isEmpty()) {
            r2.A01(new C27836CTc(C0003R.string.add_or_hide_products_in_shop));
            r2.A01(new C218509bV("learn_more_section_divider_key"));
            r2.A01(new C220719fA(csm.A00.getString(C0003R.string.recently_added_section_header), (Integer) null));
            if (!csm.A02) {
                r2.A01(new C27838CTe());
            }
        }
        if (csy.A04) {
            r2.A01(new CTY(csy.A00));
        } else {
            if (csy.A01.isEmpty()) {
                r2.A01(new CTZ(csm.A00.getString(C0003R.string.product_not_in_your_shop), (String) null));
            }
            for (C27702CNw cNw : csy.A01) {
                AnonymousClass96E r7 = new AnonymousClass96E(C0003R.string.shop_management_product_action_button_add, C0003R.string.shop_management_product_action_button_add_description, C0003R.string.shop_management_product_action_button_added_description, C0003R.string.shop_management_product_action_button_hide, C0003R.string.shop_management_product_action_button_hide_description, C0003R.string.shop_management_product_action_button_hidden_description);
                C27796CRo cRo = new C27796CRo(csy.A02.contains(cNw.A02), true);
                String str = cNw.A03;
                if (str.equals(CNO.A01(Constants.ONE))) {
                    r2.A01(new C27778CQw(cNw, csy.A00, r7, cRo));
                } else if (str.equals(CNO.A01(Constants.A0C))) {
                    r2.A01(new C27779CQx(cNw, csy.A00, r7, cRo));
                }
            }
            if (csy.A03) {
                r2.A01(new C27837CTd());
            }
        }
        csm.A01.A06(r2);
    }
}
