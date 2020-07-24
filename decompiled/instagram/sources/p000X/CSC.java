package p000X;

import com.facebook.C0003R;

/* renamed from: X.CSC */
public final class CSC {
    public final /* synthetic */ CSA A00;

    public CSC(CSA csa) {
        this.A00 = csa;
    }

    public final void A00(CSX csx) {
        CSP csp = this.A00.A02;
        C68832zy r2 = new C68832zy();
        if (csx.A04) {
            r2.A01(new CTY(csx.A00));
        } else {
            if (csx.A01.isEmpty()) {
                if (csx.A00.isEmpty()) {
                    AnonymousClass2PB r4 = new AnonymousClass2PB();
                    r4.A02 = C0003R.C0004drawable.null_state_shopping_icon;
                    r4.A0B = csp.A00.getString(C0003R.string.shop_management_no_collections_added_title);
                    r4.A07 = csp.A00.getString(C0003R.string.shop_management_no_collections_added_subtitle);
                    r4.A09 = csp.A00.getString(C0003R.string.shop_management_no_collections_added_add_button);
                    r4.A06 = new CTF(csp);
                    r4.A0C = true;
                    r2.A01(new AnonymousClass2PX(r4, AnonymousClass2Oq.EMPTY));
                } else {
                    r2.A01(new CTZ(csp.A00.getString(C0003R.string.collection_not_in_your_shop), (String) null));
                }
            } else if (csx.A00.isEmpty()) {
                r2.A01(new C27836CTc(C0003R.string.add_or_hide_products_and_collections_in_shop));
                r2.A01(new C218509bV("learn_more_section_divider_key"));
            }
            for (C27702CNw cNw : csx.A01) {
                boolean contains = csx.A02.contains(cNw.A02);
                int i = C0003R.string.shop_management_product_action_button_hide;
                boolean z = false;
                if (contains) {
                    i = C0003R.string.shop_management_product_action_button_add;
                    z = true;
                }
                Integer A002 = CNO.A00(cNw.A03);
                if (A002 != null) {
                    switch (A002.intValue()) {
                        case 0:
                            CRD crd = cNw.A00.A03;
                            AnonymousClass0a4.A06(crd);
                            r2.A01(new C220719fA(crd.A00, (Integer) null));
                            break;
                        case 3:
                            r2.A01(new CR8(cNw, i, z, true));
                            break;
                    }
                }
            }
            if (csx.A03) {
                r2.A01(new C27837CTd());
            }
        }
        csp.A01.A06(r2);
    }
}
