package com.instagram.p009ui.widget.textureview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.instagram.filterkit.filter.MaskingTextureFilter;
import java.nio.FloatBuffer;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass1XB;
import p000X.AnonymousClass8E6;
import p000X.AnonymousClass8EC;
import p000X.C190898Dy;
import p000X.C190908Dz;
import p000X.C89453uF;
import p000X.C89463uG;

/* renamed from: com.instagram.ui.widget.textureview.MaskingTextureView */
public class MaskingTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public TextureView.SurfaceTextureListener A04;
    public C190898Dy A05;
    public boolean A06;
    public MaskingTextureFilter A07;
    public final C89463uG A08;

    private void A00(SurfaceTexture surfaceTexture, int i, int i2) {
        C190898Dy r0 = this.A05;
        if (r0 != null) {
            C190908Dz r1 = r0.A0C;
            AnonymousClass0ZA.A05(r1, r1.obtainMessage(4));
            this.A05 = null;
        }
        this.A06 = false;
        this.A01 = i;
        this.A00 = i2;
        A01(this);
        C190898Dy r12 = new C190898Dy();
        this.A05 = r12;
        r12.A04(Constants.ONE);
        r12.A03(i, i2);
        C190898Dy r02 = this.A05;
        r02.A0C.obtainMessage(2, this.A07).sendToTarget();
        this.A05.A0F = new AnonymousClass8E6(this, i, i2);
        C190898Dy r03 = this.A05;
        r03.A0C.obtainMessage(1, new Surface(surfaceTexture)).sendToTarget();
    }

    public static void A01(MaskingTextureView maskingTextureView) {
        int i;
        int i2;
        int i3;
        float[] fArr;
        MaskingTextureView maskingTextureView2 = maskingTextureView;
        int i4 = maskingTextureView2.A03;
        if (i4 > 0 && (i = maskingTextureView2.A02) > 0 && (i2 = maskingTextureView2.A01) > 0 && (i3 = maskingTextureView2.A00) > 0) {
            float f = ((float) i4) / ((float) i);
            float f2 = ((float) i2) / ((float) i3);
            FloatBuffer floatBuffer = maskingTextureView2.A08.A02;
            if (f >= f2) {
                float f3 = (f - f2) / 2.0f;
                float f4 = 1.0f - f3;
                fArr = new float[]{f3, 1.0f, f4, 1.0f, f3, 0.0f, f4, 0.0f};
            } else {
                float f5 = (f2 - f) / 2.0f;
                float f6 = 1.0f - f5;
                fArr = new float[]{0.0f, f6, 1.0f, f6, 0.0f, f5, 1.0f, f5};
            }
            floatBuffer.put(fArr);
            maskingTextureView2.A08.A02.position(0);
        }
        MaskingTextureFilter maskingTextureFilter = maskingTextureView2.A07;
        if (maskingTextureFilter != null) {
            maskingTextureFilter.A0D = maskingTextureView2.A08;
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C190898Dy r0 = this.A05;
        if (r0 != null) {
            C190908Dz r1 = r0.A0C;
            AnonymousClass0ZA.A05(r1, r1.obtainMessage(4));
            this.A05 = null;
        }
        this.A06 = false;
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        A01(this);
        C190898Dy r0 = this.A05;
        if (r0 != null) {
            r0.A03(i, i2);
            C190898Dy r02 = this.A05;
            r02.A0C.obtainMessage(1, new Surface(surfaceTexture)).sendToTarget();
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.A04 != null && A02(this)) {
            this.A04.onSurfaceTextureUpdated(getSurfaceTexture());
        }
    }

    public void setFilter(MaskingTextureFilter maskingTextureFilter) {
        this.A07 = maskingTextureFilter;
        A01(this);
        C190898Dy r0 = this.A05;
        if (r0 != null) {
            r0.A0C.obtainMessage(2, this.A07).sendToTarget();
        }
    }

    public void setRenderDelegate(AnonymousClass8EC r2) {
        C190898Dy r0 = this.A05;
        if (r0 != null) {
            r0.A0G = r2;
        }
    }

    public static boolean A02(MaskingTextureView maskingTextureView) {
        C190898Dy r0;
        if (!super.isAvailable() || !maskingTextureView.A06 || (r0 = maskingTextureView.A05) == null || r0.A01 == null) {
            return false;
        }
        return true;
    }

    public SurfaceTexture getSurfaceTexture() {
        if (A02(this)) {
            return this.A05.A01;
        }
        return null;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(581367302);
        super.onAttachedToWindow();
        if (super.isAvailable()) {
            A00(super.getSurfaceTexture(), getWidth(), getHeight());
        } else {
            super.setSurfaceTextureListener(this);
        }
        AnonymousClass0Z0.A0D(-1545961521, A062);
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.A04 = surfaceTextureListener;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        A00(surfaceTexture, i, i2);
    }

    public MaskingTextureView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaskingTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskingTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A08 = C89453uF.A00();
        AnonymousClass1XB.A00(this);
        setOpaque(false);
    }
}
