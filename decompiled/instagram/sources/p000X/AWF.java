package p000X;

import android.os.Looper;
import android.view.Surface;

/* renamed from: X.AWF */
public final class AWF implements AWY {
    public AWH A00;
    public final AWE A01;

    public final int AXQ() {
        return this.A01.A00;
    }

    public final int AXS() {
        return this.A01.A01;
    }

    public final boolean Agu() {
        return this.A01.A04;
    }

    public final void BkC(Looper looper) {
        this.A01.A01(looper);
    }

    public final Surface getSurface() {
        return this.A01.A03;
    }

    public AWF(AWE awe) {
        this.A01 = awe;
        awe.A02 = new AWI(this);
    }

    public final void Bic(AWH awh) {
        this.A00 = awh;
    }
}
