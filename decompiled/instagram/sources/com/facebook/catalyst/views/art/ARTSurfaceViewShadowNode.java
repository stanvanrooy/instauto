package com.facebook.catalyst.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import p000X.A47;
import p000X.A8K;
import p000X.A8p;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CH;
import p000X.C23053A3d;

public class ARTSurfaceViewShadowNode extends LayoutShadowNode implements TextureView.SurfaceTextureListener, A47 {
    public Surface A00;
    public Integer A01;

    private void A01(ReactShadowNode reactShadowNode) {
        for (int i = 0; i < reactShadowNode.AI5(); i++) {
            ReactShadowNode AI2 = reactShadowNode.AI2(i);
            AI2.Aoh();
            A01(AI2);
        }
    }

    public final void onHostDestroy() {
    }

    public final void onHostPause() {
    }

    public final void onHostResume() {
        A00(this, false);
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public static void A00(ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode, boolean z) {
        Surface surface = aRTSurfaceViewShadowNode.A00;
        if (surface == null || !surface.isValid()) {
            for (int i = 0; i < aRTSurfaceViewShadowNode.AI5(); i++) {
                ReactShadowNode AI2 = aRTSurfaceViewShadowNode.AI2(i);
                AI2.Aoh();
                for (int i2 = 0; i2 < AI2.AI5(); i2++) {
                    ReactShadowNode AI22 = AI2.AI2(i2);
                    AI22.Aoh();
                    aRTSurfaceViewShadowNode.A01(AI22);
                }
            }
            return;
        }
        try {
            Canvas lockCanvas = aRTSurfaceViewShadowNode.A00.lockCanvas((Rect) null);
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            Integer num = aRTSurfaceViewShadowNode.A01;
            if (num != null) {
                lockCanvas.drawColor(num.intValue());
            }
            Paint paint = new Paint();
            for (int i3 = 0; i3 < aRTSurfaceViewShadowNode.AI5(); i3++) {
                ARTVirtualNode aRTVirtualNode = (ARTVirtualNode) aRTSurfaceViewShadowNode.AI2(i3);
                aRTVirtualNode.A0D(lockCanvas, paint, 1.0f);
                if (z) {
                    aRTVirtualNode.A06();
                } else {
                    aRTVirtualNode.Aoh();
                }
            }
            Surface surface2 = aRTSurfaceViewShadowNode.A00;
            if (surface2 != null) {
                surface2.unlockCanvasAndPost(lockCanvas);
            }
        } catch (IllegalArgumentException | IllegalStateException e) {
            AnonymousClass0CH.A06("ReactNative", AnonymousClass000.A0E(e.getClass().getSimpleName(), " in Surface.unlockCanvasAndPost"));
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00 = new Surface(surfaceTexture);
        A00(this, false);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.release();
        this.A00 = null;
        return true;
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        this.A01 = num;
        A06();
    }

    public final void A09(A8K a8k) {
        super.A09(a8k);
        A00(this, false);
        a8k.A0F.add(new A8p(a8k, ATb(), this));
    }

    public final void BlA(C23053A3d a3d) {
        super.BlA(a3d);
        if (Build.VERSION.SDK_INT > 24) {
            a3d.A06(this);
        }
    }

    public final void dispose() {
        super.dispose();
        if (Build.VERSION.SDK_INT > 24) {
            AY1().A07(this);
        }
    }
}
