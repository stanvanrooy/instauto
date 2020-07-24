package p000X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CXQ */
public final class CXQ extends C92 {
    public ImageInfo A00;
    public List A01 = new ArrayList();
    public final CYV A02;

    public CXQ(CXZ cxz) {
        super(cxz.A06, cxz.A09, new CY4(cxz.A03, cxz.A0F), 100);
        this.A00 = CYI.A01(cxz.A01);
        this.A01.addAll(CYI.A02(cxz.A0A));
        this.A02 = new CYV(cxz.A09);
    }

    public CXQ(C27946CXi cXi, int i) {
        super(cXi.A03, cXi.A04, new CY4(cXi.A01, cXi.A06), i);
        this.A00 = CYI.A01(cXi.A00);
        this.A01.addAll(CYI.A02(cXi.A05));
        this.A02 = new CYV(cXi.A04);
    }

    public CXQ(C27953CXp cXp) {
        super(cXp.A02, cXp.A03, new CY4(cXp.A01, cXp.A05), 100);
        this.A00 = CYI.A01(cXp.A00);
        this.A01.addAll(CYI.A02(cXp.A04));
        this.A02 = new CYV(cXp.A03);
    }
}
