package p000X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.CSI */
public final class CSI implements C29091Oo {
    public CSQ A00 = new CSQ("", AnonymousClass10U.A00, C219359cu.A00, false, false, false);
    public CSD A01;
    public Set A02 = new LinkedHashSet();
    public final CTJ A03;
    public final CTP A04;
    public final CTR A05;
    public final CTO A06;
    public final CSJ A07;
    public final CSW A08;
    public final CSV A09;

    public CSI(AnonymousClass0C1 r8, CTJ ctj) {
        C13150hy.A02(r8, "userSession");
        C13150hy.A02(ctj, "logger");
        this.A03 = ctj;
        CSJ csj = new CSJ(this);
        this.A07 = csj;
        this.A08 = new CSW(this);
        this.A09 = new CSV(this);
        this.A05 = new CTR(r8, csj);
        this.A04 = new CTP(this.A08, r8);
        this.A06 = new CTO(this.A09, r8);
    }

    public static final void A00(CSI csi, AnonymousClass2GT r3) {
        CSQ csq = (CSQ) r3.invoke(csi.A00);
        csi.A00 = csq;
        CSD csd = csi.A01;
        if (csd != null) {
            csd.A00(csq);
        }
    }

    public final void A68() {
        this.A05.A68();
    }
}
