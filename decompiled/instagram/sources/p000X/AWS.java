package p000X;

import android.graphics.SurfaceTexture;

/* renamed from: X.AWS */
public final class AWS implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ AWU A01;

    public AWS(AWU awu, SurfaceTexture surfaceTexture) {
        this.A01 = awu;
        this.A00 = surfaceTexture;
    }

    public final void run() {
        AWU awu = this.A01;
        if (awu != null) {
            awu.B7X(this.A00);
        }
    }
}
