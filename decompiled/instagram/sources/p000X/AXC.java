package p000X;

import android.graphics.SurfaceTexture;

/* renamed from: X.AXC */
public final class AXC extends AWZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AWZ A02;
    public final /* synthetic */ AYG A03;

    public AXC(AYG ayg, int i, int i2, AWZ awz) {
        this.A03 = ayg;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = awz;
    }

    public final void A03(Exception exc) {
        AWZ.A00(this.A02, exc);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        AYG ayg = this.A03;
        if (ayg.A01 != null) {
            AnonymousClass0QD.A01(ayg.A0H, "Calling resumeVideoCapture before calling pauseVideoCapture for previous capture.");
        }
        this.A03.A01 = new AXA(surfaceTexture, this.A01, this.A00);
        AWZ.A01(this.A02, this.A03.A01);
    }
}
