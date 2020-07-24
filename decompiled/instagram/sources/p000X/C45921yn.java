package p000X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.instagram.p009ui.widget.textureview.ScalingTextureView;

/* renamed from: X.1yn  reason: invalid class name and case insensitive filesystem */
public final class C45921yn extends C45911ym implements TextureView.SurfaceTextureListener {
    public final ScalingTextureView A00;

    public final Bitmap A01(int i) {
        ScalingTextureView scalingTextureView = this.A00;
        return scalingTextureView.getBitmap(scalingTextureView.getWidth() / i, this.A00.getHeight() / i);
    }

    public final View A03() {
        return this.A00;
    }

    public final void A04() {
        ScalingTextureView scalingTextureView = this.A00;
        scalingTextureView.A02 = 0;
        scalingTextureView.A01 = 0;
        scalingTextureView.setTransform((Matrix) null);
    }

    public final void A05(float f) {
        this.A00.A00 = f;
    }

    public final void A06(int i, int i2) {
        ScalingTextureView scalingTextureView = this.A00;
        scalingTextureView.A02 = i;
        scalingTextureView.A01 = i2;
        ScalingTextureView.A00(scalingTextureView);
    }

    public final void A07(C45681yK r2) {
        this.A00.setScaleType(r2);
    }

    public final void A08(Object obj) {
        ((SurfaceTexture) obj).release();
    }

    public final boolean A09() {
        return this.A00.isAvailable();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C45541y6 r0 = this.A00;
        Surface surface = new Surface(surfaceTexture);
        C45741yQ r02 = r0.A0A;
        if (r02 != null) {
            r02.A0Y(surface);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return this.A00.A0P(this, surfaceTexture);
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0C();
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C45741yQ r0;
        C45541y6 r2 = this.A00;
        if (!r2.A0G) {
            r2.A0G = true;
            AnonymousClass0ZA.A02(r2.A0V, 1);
            C45901yl r3 = r2.A0E;
            if (!(r3 == null || r2.A0A == null)) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - r3.A09;
                r2.A0D.BVa(r3.A0B);
                C45761yS A0G = r2.A0A.A0G();
                r2.A0U.Bd5(r2.A0E.A0B.A03, elapsedRealtime, A0G.A02, A0G.A01, A0G.A00);
            }
        }
        C45901yl r02 = r2.A0E;
        if (r02 != null) {
            r2.A0D.BQN(r02.A0B);
        }
        if (C45541y6.A09(r2) && (r0 = r2.A0A) != null) {
            r2.A01 = r0.A08();
        }
    }

    public C45921yn(int i, ScalingTextureView scalingTextureView) {
        super(i);
        this.A00 = scalingTextureView;
        scalingTextureView.A02(this);
    }

    public final Surface A02() {
        if (A09()) {
            return new Surface(this.A00.getSurfaceTexture());
        }
        return null;
    }
}
