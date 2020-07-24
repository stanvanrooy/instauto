package com.instagram.p009ui.widget.textureview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1XB;
import p000X.AnonymousClass8E7;
import p000X.C190898Dy;
import p000X.C190908Dz;

/* renamed from: com.instagram.ui.widget.textureview.CircularTextureView */
public class CircularTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public float A00;
    public float A01;
    public Rect A02;
    public TextureView.SurfaceTextureListener A03;
    public C190898Dy A04;
    public boolean A05;

    private void A00(SurfaceTexture surfaceTexture, int i, int i2) {
        boolean z = false;
        if (i == i2) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        C190898Dy r1 = new C190898Dy();
        this.A04 = r1;
        r1.A04(Constants.A0Y);
        r1.A03(i, i2);
        this.A04.A0F = new AnonymousClass8E7(this, i, i2);
        C190898Dy r0 = this.A04;
        r0.A0C.obtainMessage(1, new Surface(surfaceTexture)).sendToTarget();
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C190898Dy r0 = this.A04;
        if (r0 != null) {
            C190908Dz r1 = r0.A0C;
            AnonymousClass0ZA.A05(r1, r1.obtainMessage(4));
            this.A04 = null;
        }
        this.A05 = false;
        return true;
    }

    public void setIsMirrored(boolean z) {
        this.A04.A0H = z;
    }

    public final boolean A01() {
        C190898Dy r0;
        if (!super.isAvailable() || !this.A05 || (r0 = this.A04) == null || r0.A01 == null) {
            return false;
        }
        return true;
    }

    public SurfaceTexture getSurfaceTexture() {
        if (A01()) {
            return this.A04.A01;
        }
        return null;
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0Z0.A06(-769432212);
        super.onAttachedToWindow();
        if (super.isAvailable()) {
            A00(super.getSurfaceTexture(), super.getWidth(), super.getHeight());
        } else {
            super.setSurfaceTextureListener(this);
        }
        AnonymousClass0Z0.A0D(1823821905, A06);
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.A03 = surfaceTextureListener;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        A00(surfaceTexture, i, i2);
    }

    public CircularTextureView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircularTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass1XB.A00(this);
    }

    public CircularTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = false;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        setOpaque(false);
    }
}
