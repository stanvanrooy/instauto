package p000X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D1H */
public final class D1H implements D19 {
    public C29276Cv2 A00 = new C29604D1j(this);
    public List A01 = new ArrayList();

    public final synchronized void A00(D19 d19) {
        this.A01.add(d19);
    }

    public final synchronized void Au8(int i) {
        for (D19 Au8 : this.A01) {
            Au8.Au8(i);
        }
    }

    public final synchronized void BSR() {
        for (D19 BSR : this.A01) {
            BSR.BSR();
        }
    }

    public final synchronized void BSS(IOException iOException) {
        for (D19 BSS : this.A01) {
            BSS.BSS(iOException);
        }
    }

    public final synchronized void BSY(boolean z) {
        for (D19 BSY : this.A01) {
            BSY.BSY(z);
        }
    }

    public final void BSQ() {
        for (D19 BSQ : this.A01) {
            BSQ.BSQ();
        }
    }

    public final void BSU(String str, Object obj) {
        for (D19 BSU : this.A01) {
            BSU.BSU(str, obj);
        }
    }

    public final void BSW(D1M d1m, C43711ux r4) {
        for (D19 BSW : this.A01) {
            BSW.BSW(d1m, r4);
        }
    }
}
