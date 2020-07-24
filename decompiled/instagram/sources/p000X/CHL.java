package p000X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.CHL */
public final class CHL implements C53682Tu {
    public final /* synthetic */ C6X A00;
    public final /* synthetic */ List A01;

    public final void BN5() {
    }

    public CHL(C6X c6x, List list) {
        this.A00 = c6x;
        this.A01 = list;
    }

    public final void Au4() {
        C6X c6x = this.A00;
        if (!c6x.A0F) {
            c6x.A03.A0B = true;
            CHP chp = c6x.A04;
            List list = this.A01;
            if (chp.A01) {
                chp.A06.A02(list);
                CHR chr = chp.A07;
                C25007Axz axz = chr.A00;
                C17850qu A02 = C25007Axz.A02(axz.A01, axz.A00, Constants.ONE, AnonymousClass17A.A01(list, new CHM(chr)), Collections.EMPTY_LIST);
                A02.A00 = new CHN(chr);
                CHR.A04(chr, A02);
                CHP.A01(chp);
            }
        }
    }

    public final void onDismiss() {
        this.A00.A09 = null;
    }
}
