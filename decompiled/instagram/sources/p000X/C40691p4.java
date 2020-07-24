package p000X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.1p4  reason: invalid class name and case insensitive filesystem */
public final class C40691p4 extends SurfaceTexture {
    public static volatile HeroPlayerSetting A01 = HeroPlayerSetting.A1t;
    public final Surface A00 = new Surface(this);

    public C40691p4() {
        super(0);
        detachFromGLContext();
    }

    public final void release() {
        this.A00.release();
        super.release();
    }

    public final void detachFromGLContext() {
        try {
            super.detachFromGLContext();
        } catch (RuntimeException e) {
            if (A01.A1g) {
                C40431oe.A05("HeroSurfaceTexture", e, "Error when detach from GL context", new Object[0]);
                return;
            }
            throw e;
        }
    }
}
