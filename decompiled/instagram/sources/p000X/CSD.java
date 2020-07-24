package p000X;

import com.facebook.C0003R;

/* renamed from: X.CSD */
public final class CSD {
    public final /* synthetic */ CSE A00;

    public CSD(CSE cse) {
        this.A00 = cse;
    }

    public final void A00(CSQ csq) {
        CSO cso = this.A00.A01;
        C68832zy r3 = new C68832zy();
        if (csq.A04) {
            r3.A01(new CTY(csq.A00));
        } else {
            if (!csq.A01.isEmpty()) {
                if (csq.A00.isEmpty()) {
                    r3.A01(new C27836CTc(C0003R.string.f66x8a2b6d1));
                    r3.A01(new C218509bV("learn_more_section_divider_key"));
                }
                r3.A01(new C223269jU("learn_of_items_gap_key", cso.A00.getResources().getDimensionPixelSize(C0003R.dimen.row_padding)));
            } else if (csq.A00.isEmpty()) {
                AnonymousClass2PB r2 = new AnonymousClass2PB();
                r2.A02 = C0003R.C0004drawable.null_state_shopping_icon;
                r2.A0B = cso.A00.getString(C0003R.string.shop_management_add_screen_no_collections_title);
                r2.A07 = cso.A00.getString(C0003R.string.shop_management_add_screen_no_collections_subtitle);
                r2.A09 = cso.A00.getString(C0003R.string.default_link_text);
                r2.A06 = new CT9(cso);
                r2.A0C = true;
                r3.A01(new AnonymousClass2PX(r2, AnonymousClass2Oq.EMPTY));
            } else {
                r3.A01(new CTZ(cso.A00.getString(C0003R.string.shop_management_no_collections_found_title), cso.A00.getString(C0003R.string.shop_management_no_collections_found_subtitle)));
            }
            for (C27702CNw cNw : csq.A01) {
                boolean contains = csq.A02.contains(cNw.A02);
                int i = C0003R.string.shop_management_product_action_button_add;
                boolean z = true;
                if (contains) {
                    i = C0003R.string.shop_management_product_action_button_added;
                    z = false;
                }
                Integer A002 = CNO.A00(cNw.A03);
                if (A002 != null) {
                    switch (A002.intValue()) {
                        case 0:
                            CRD crd = cNw.A00.A03;
                            AnonymousClass0a4.A06(crd);
                            r3.A01(new C220719fA(crd.A00, (Integer) null));
                            break;
                        case 3:
                            r3.A01(new CR8(cNw, i, z, true));
                            break;
                    }
                }
            }
            if (csq.A03) {
                r3.A01(new C27837CTd());
            }
        }
        cso.A01.A06(r3);
    }
}
