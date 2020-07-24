package p000X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.CXM */
public final class CXM extends C92 {
    public ImageInfo A00;
    public C37671k2 A01;
    public boolean A02;
    public final CYV A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    public CXM(CXZ cxz) {
        super(r0.A06, r0.A09, new CY4(r0.A03, r0.A0F), 100);
        String str;
        String str2;
        CXZ cxz2 = cxz;
        C27962CXy cXy = cxz2.A02;
        List list = cXy.A02;
        C37661k1[] r9 = new C37661k1[list.size()];
        for (int i = 0; i < list.size(); i++) {
            CY2 cy2 = (CY2) list.get(i);
            r9[i] = new C37661k1(cy2.A01, cy2.A03, (String) null, cy2.A02, cy2.A00);
        }
        this.A01 = new C37671k2(Constants.ZERO, (AnonymousClass1YR) null, cXy.A01, r9, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, false, (C37691k4) null, true, false, false);
        C27962CXy cXy2 = cxz2.A02;
        this.A02 = cXy2.A03;
        this.A00 = CYI.A01(cXy2.A00);
        switch (cxz2.A05.intValue()) {
            case 1:
                str = "AUTOPLAY";
                break;
            case 2:
                str = "NO_AUTOPLAY";
                break;
            default:
                str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                break;
        }
        C24113AiN.A01.get(str);
        switch (cxz2.A07.intValue()) {
            case 1:
                str2 = "NO_LOOPING";
                break;
            case 2:
                str2 = "LOOPING";
                break;
            case 3:
                str2 = "LOOPING_WITH_CROSS_FADE";
                break;
            default:
                str2 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                break;
        }
        C27938CXa.A01.get(str2);
        this.A03 = new CYV(cxz2.A09);
    }
}
