package com.instagram.p009ui.widget.textureview;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.textureview.MultiListenerTextureView;
import p000X.AnonymousClass1XB;
import p000X.C190868Ds;
import p000X.C45681yK;
import p000X.C45851yg;

/* renamed from: com.instagram.ui.widget.textureview.ScalingTextureView */
public class ScalingTextureView extends MultiListenerTextureView {
    public float A00;
    public int A01;
    public int A02;
    public float A03;
    public float A04;
    public C45681yK A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r9.A01 <= 0) goto L_0x000a;
     */
    public static void A00(ScalingTextureView scalingTextureView) {
        boolean z;
        ScalingTextureView scalingTextureView2 = scalingTextureView;
        int i = scalingTextureView.A02;
        if (i > 0) {
            z = true;
        }
        z = false;
        if (z) {
            C45851yg.A01(scalingTextureView2, scalingTextureView.A05, i, scalingTextureView.A01, scalingTextureView.A04, scalingTextureView.A03, scalingTextureView.A00, (C190868Ds) null);
        }
    }

    public int getVideoHeight() {
        return this.A01;
    }

    public int getVideoWidth() {
        return this.A02;
    }

    public void setScaleType(C45681yK r2) {
        if (this.A05 != r2) {
            this.A05 = r2;
            A00(this);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this);
    }

    public void setCropTopCoordinate(float f) {
        this.A00 = f;
    }

    public ScalingTextureView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ScalingTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScalingTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = C45681yK.FILL;
        this.A04 = 0.8f;
        this.A03 = 1.91f;
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (!AnonymousClass1XB.A00) {
            AnonymousClass1XB.A00(this);
        }
    }
}
