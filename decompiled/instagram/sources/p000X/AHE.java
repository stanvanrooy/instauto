package p000X;

import android.view.View;

/* renamed from: X.AHE */
public final class AHE implements Runnable {
    public AHI A00;
    public final /* synthetic */ C23296AGw A01;

    public AHE(C23296AGw aGw, AHI ahi) {
        this.A01 = aGw;
        this.A00 = ahi;
    }

    public final void run() {
        boolean z;
        AnonymousClass1Ab r0;
        C54042Vn r1 = this.A01.A03;
        if (!(r1 == null || (r0 = r1.A03) == null)) {
            r0.BBU(r1);
        }
        View view = (View) this.A01.A05;
        if (!(view == null || view.getWindowToken() == null)) {
            AHI ahi = this.A00;
            if (ahi.A05()) {
                z = true;
            } else if (ahi.A01 == null) {
                z = false;
            } else {
                AH2.A00(ahi, 0, 0, false, false);
                z = true;
            }
            if (z) {
                this.A01.A07 = this.A00;
            }
        }
        this.A01.A05 = null;
    }
}
