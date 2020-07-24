package p000X;

import com.instagram.p009ui.widget.pageindicator.CirclePageIndicator;

/* renamed from: X.CX9 */
public final class CX9 extends C44581wO {
    public final /* synthetic */ CXB A00;
    public final /* synthetic */ CXG A01;

    public CX9(CXG cxg, CXB cxb) {
        this.A01 = cxg;
        this.A00 = cxb;
    }

    public final void BDU(int i, int i2) {
        this.A01.A04.A01(i, false);
        CXG cxg = this.A01;
        CirclePageIndicator circlePageIndicator = cxg.A04;
        boolean z = true;
        if (circlePageIndicator.A03 + 1 != circlePageIndicator.A02) {
            z = false;
        }
        if (z) {
            cxg.A01.setVisibility(8);
            C27934CWw cWw = this.A00.A02;
            if (cWw != null) {
                cWw.A03 = true;
                cWw.A01.end();
                return;
            }
            return;
        }
        cxg.A01.setVisibility(0);
        C27934CWw cWw2 = this.A00.A02;
        if (cWw2 != null && cWw2.A03) {
            cWw2.A03 = false;
            if (!cWw2.A01.isRunning()) {
                cWw2.A01.start();
            }
        }
    }

    public final void BDi(int i, int i2) {
        this.A00.A00 = i;
    }
}
