package p000X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.mediastreaming.opt.common.SurfaceHolder;
import com.facebook.mediastreaming.opt.source.SurfaceTextureHolder;
import com.facebook.mediastreaming.opt.source.video.AndroidExternalVideoSource;
import com.facebook.mediastreaming.opt.source.video.AndroidVideoInput;

/* renamed from: X.AWD */
public final class AWD implements AndroidVideoInput {
    public boolean A00;
    public final AnonymousClass8EE A01;
    public final AnonymousClass8NK A02;
    public final AWE A03;
    public final AW7 A04;

    public final boolean enableCaptureRenderer() {
        return true;
    }

    public final boolean enableSecondInputSurface() {
        return false;
    }

    public final void removeErrorListener(AndroidExternalVideoSource androidExternalVideoSource) {
    }

    public final void setErrorListener(AndroidExternalVideoSource androidExternalVideoSource) {
    }

    public final void setOutputSurface(int i, SurfaceHolder surfaceHolder) {
    }

    public final void startRenderingToOutput() {
        this.A03.A04 = false;
        this.A00 = true;
    }

    public final void stopRenderingToOutput() {
        this.A03.A00();
        this.A00 = false;
    }

    public AWD(AW7 aw7) {
        this.A04 = aw7;
        AnonymousClass8EE r0 = new AnonymousClass8EE();
        this.A01 = r0;
        r0.A02();
        AnonymousClass8NK r2 = new AnonymousClass8NK(1, 1, Constants.ZERO);
        this.A02 = r2;
        r2.A03();
        SurfaceTexture surfaceTexture = this.A02.A05;
        AnonymousClass0a4.A06(surfaceTexture);
        this.A03 = new AWE(new Surface(surfaceTexture));
    }

    public final AW7 getFrameSchedulerFactory() {
        return this.A04;
    }

    public final void setOutputSurface(SurfaceTextureHolder surfaceTextureHolder, boolean z) {
        AWH awh;
        this.A03.A00();
        if (surfaceTextureHolder == null) {
            AWE awe = this.A03;
            if (awe.A03 != null) {
                awe.A03.release();
            }
            awe.A00 = -1;
            awe.A01 = -1;
            return;
        }
        AWE awe2 = this.A03;
        Surface surface = new Surface(surfaceTextureHolder.getSurfaceTexture());
        int width = surfaceTextureHolder.getWidth();
        int height = surfaceTextureHolder.getHeight();
        if (awe2.A03 != null) {
            awe2.A03.release();
        }
        awe2.A00 = -1;
        awe2.A01 = -1;
        awe2.A03 = surface;
        awe2.A01 = width;
        awe2.A00 = height;
        AWI awi = awe2.A02;
        if (!(awi == null || (awh = awi.A00.A00) == null)) {
            C78783cJ r1 = (C78783cJ) awh.A01.A08.get(awh.A00);
            if (r1 != null) {
                awh.A01.A06.A08(r1);
            }
            AWQ awq = awh.A01;
            AWY awy = awh.A00;
            AXF axf = new AXF(awy, awq.A05, awq.A08.isEmpty());
            awq.A06.A07(axf);
            awq.A08.put(awy, axf);
        }
        if (this.A00) {
            this.A03.A04 = false;
        }
    }
}
