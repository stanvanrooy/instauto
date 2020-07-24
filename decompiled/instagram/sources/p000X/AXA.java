package p000X;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;

/* renamed from: X.AXA */
public final class AXA implements AWY {
    public Looper A00;
    public boolean A01;
    public final Surface A02;
    public final int A03;
    public final int A04;

    public final void Bic(AWH awh) {
    }

    public AXA(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A02 = new Surface(surfaceTexture);
        this.A04 = i;
        this.A03 = i2;
    }

    public final int AXQ() {
        return this.A03;
    }

    public final int AXS() {
        return this.A04;
    }

    public final boolean Agu() {
        return this.A01;
    }

    public final void BkC(Looper looper) {
        this.A00 = looper;
    }

    public final Surface getSurface() {
        return this.A02;
    }
}
