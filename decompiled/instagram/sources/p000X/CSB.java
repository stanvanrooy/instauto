package p000X;

import com.facebook.C0003R;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.CSB */
public final class CSB implements C29091Oo {
    public CSX A00 = new CSX("", AnonymousClass10U.A00, C219359cu.A00, false, false, false);
    public CSC A01;
    public Set A02 = new LinkedHashSet();
    public final CTH A03;
    public final CTS A04;
    public final AnonymousClass0C1 A05;
    public final CTP A06;
    public final CSU A07;
    public final CSK A08;
    public final CST A09;
    public final CTO A0A;

    public CSB(AnonymousClass0C1 r8, CTH cth) {
        C13150hy.A02(r8, "userSession");
        C13150hy.A02(cth, "logger");
        this.A05 = r8;
        this.A03 = cth;
        CSK csk = new CSK(this);
        this.A08 = csk;
        this.A07 = new CSU(this);
        this.A09 = new CST(this);
        this.A04 = new CTS(this.A05, csk);
        CSU csu = this.A07;
        AnonymousClass0C1 r2 = this.A05;
        this.A06 = new CTP(csu, r2);
        this.A0A = new CTO(this.A09, r2);
    }

    public static final void A00(CSB csb, AnonymousClass2GT r3) {
        CSX csx = (CSX) r3.invoke(csb.A00);
        csb.A00 = csx;
        CSC csc = csb.A01;
        if (csc != null) {
            csc.A00(csx);
        }
    }

    public final void A01(ProductCollectionTile productCollectionTile, C27702CNw cNw, boolean z) {
        C13150hy.A02(productCollectionTile, "collectionTile");
        C13150hy.A02(cNw, "item");
        C27781CQz cQz = cNw.A00;
        C13150hy.A01(cQz, "item.layoutContent");
        CR3 cr3 = cQz.A00;
        if (cr3 == null) {
            C13150hy.A00();
        }
        C13150hy.A01(cr3, "item.layoutContent.publi…ctListCollectionContent!!");
        CRA cra = cr3.A01;
        C13150hy.A01(cra, "item.layoutContent.publi…lectionContent!!.metaData");
        CRC crc = cra.A00;
        if (crc != null) {
            this.A03.A09(productCollectionTile, crc);
            CSC csc = this.A01;
            if (csc != null) {
                String str = crc.A01;
                C13150hy.A01(str, "disabledReason.title");
                String str2 = crc.A00;
                C13150hy.A01(str2, "disabledReason.description");
                CQA.A02(csc.A00.requireContext(), str, str2);
            }
        } else if (!this.A02.contains(cNw.A02)) {
            boolean z2 = !this.A00.A02.contains(cNw.A02);
            if (!z2 || C27665CMj.A00(this.A05).getBoolean("has_seen_hide_collection_from_shop_nux_dialog", false)) {
                A00(this, new C27813CSf(z2, cNw));
                Set set = this.A02;
                String str3 = cNw.A02;
                C13150hy.A01(str3, "item.sectionId");
                set.add(str3);
                if (z2) {
                    if (!z) {
                        this.A03.A06(productCollectionTile);
                    }
                    this.A0A.A01(productCollectionTile, cNw);
                    return;
                }
                this.A03.A05(productCollectionTile);
                this.A06.A01(productCollectionTile, cNw);
                return;
            }
            this.A03.A06(productCollectionTile);
            CTH cth = this.A03;
            CTL ctl = new CTL(cth.A02.A02("instagram_shopping_shop_manager_hide_collection_nux"));
            if (ctl.A0B()) {
                ctl.A08("waterfall_id", cth.A04);
                ctl.A08("prior_module", cth.A03);
                ctl.A08("product_collection_id", productCollectionTile.A05);
                ctl.A08("submodule", cth.A01);
                ctl.A01();
            }
            CSC csc2 = this.A01;
            if (csc2 != null) {
                CSA csa = csc2.A00;
                C27665CMj.A00(csa.A01).edit().putBoolean("has_seen_hide_collection_from_shop_nux_dialog", true).apply();
                CSA.A00(csa, C0003R.string.hide_collection_from_shop_nux_title, C0003R.string.hide_collection_from_shop_nux_description, new CT6(csa, productCollectionTile, cNw));
            }
        }
    }

    public final void A68() {
        this.A04.A68();
    }
}
