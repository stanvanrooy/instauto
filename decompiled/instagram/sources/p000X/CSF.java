package p000X;

import com.instagram.model.shopping.productfeed.ProductCollectionTile;
import java.util.Set;

/* renamed from: X.CSF */
public final class CSF implements CRB {
    public final /* synthetic */ CSE A00;

    public final boolean Aei(C27702CNw cNw) {
        return true;
    }

    public CSF(CSE cse) {
        this.A00 = cse;
    }

    public final void BFv(ProductCollectionTile productCollectionTile, C27702CNw cNw) {
        this.A00.requireActivity().setResult(1002);
        CSI csi = this.A00.A02;
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
            csi.A03.A09(productCollectionTile, crc);
            CSD csd = csi.A01;
            if (csd != null) {
                String str = crc.A01;
                C13150hy.A01(str, "disabledReason.title");
                String str2 = crc.A00;
                C13150hy.A01(str2, "disabledReason.description");
                CQA.A02(csd.A00.requireContext(), str, str2);
            }
        } else if (!csi.A02.contains(cNw.A02)) {
            Set set = csi.A02;
            String str3 = cNw.A02;
            C13150hy.A01(str3, "item.sectionId");
            set.add(str3);
            boolean z = !csi.A00.A02.contains(cNw.A02);
            CSI.A00(csi, new C27812CSe(z, cNw));
            if (z) {
                csi.A03.A05(productCollectionTile);
                csi.A04.A01(productCollectionTile, cNw);
                return;
            }
            csi.A03.A06(productCollectionTile);
            csi.A06.A01(productCollectionTile, cNw);
        }
    }
}
