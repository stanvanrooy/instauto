package p000X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.util.List;

/* renamed from: X.A1v */
public final class A1v extends AnonymousClass9DG implements TextureView.SurfaceTextureListener, A47 {
    public Surface A00;
    public List A01;
    public Integer A02;

    public final void onHostDestroy() {
    }

    public final void onHostPause() {
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00 = new Surface(surfaceTexture);
        A00(this);
    }

    public A1v(Context context) {
        super(context);
        Context context2 = getContext();
        if (context2 instanceof C23053A3d) {
            ((C23053A3d) context2).A06(this);
        }
    }

    public static void A00(A1v a1v) {
        int i;
        int A03 = AnonymousClass0Z0.A03(13212300);
        Surface surface = a1v.A00;
        if (surface == null || !surface.isValid()) {
            i = 19521282;
        } else {
            try {
                Canvas lockCanvas = a1v.A00.lockCanvas((Rect) null);
                lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                Integer num = a1v.A02;
                if (num != null) {
                    lockCanvas.drawColor(num.intValue());
                }
                Paint paint = new Paint();
                for (int i2 = 0; i2 < a1v.A01.size(); i2++) {
                    ((A5e) a1v.A01.get(i2)).A02(lockCanvas, paint, 1.0f);
                }
                Surface surface2 = a1v.A00;
                if (surface2 == null) {
                    i = 727882842;
                } else {
                    surface2.unlockCanvasAndPost(lockCanvas);
                    i = 1864906832;
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                AnonymousClass0CH.A06("ReactNative", AnonymousClass000.A0E(e.getClass().getSimpleName(), " in Surface.unlockCanvasAndPost"));
            }
        }
        AnonymousClass0Z0.A0A(i, A03);
    }

    public final void onHostResume() {
        A00(this);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Context context = getContext();
        if (context instanceof C23053A3d) {
            ((C23053A3d) context).A07(this);
        }
        Surface surface = this.A00;
        if (surface == null) {
            return true;
        }
        surface.release();
        this.A00 = null;
        return true;
    }

    public void setBackgroundColor(int i) {
        this.A02 = Integer.valueOf(i);
    }
}
