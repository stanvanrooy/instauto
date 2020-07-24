package com.instagram.arlink.p027ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;

/* renamed from: com.instagram.arlink.ui.GradientOverlay */
public class GradientOverlay extends View {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final Paint A05 = new Paint();

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A04, (float) this.A02, this.A05);
    }

    public void setAlpha(float f) {
        this.A05.setAlpha((int) (f * 255.0f));
        invalidate();
    }

    private void A00(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A21);
        this.A03 = obtainStyledAttributes.getColor(2, 0);
        this.A00 = obtainStyledAttributes.getColor(0, 0);
        this.A01 = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0Z0.A06(571548991);
        int i5 = i2;
        super.onSizeChanged(i, i5, i3, i4);
        this.A04 = i;
        this.A02 = i5;
        this.A05.setShader(new LinearGradient((float) i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i5, new int[]{this.A03, this.A00, this.A01}, new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.A05.setDither(true);
        AnonymousClass0Z0.A0D(406477006, A06);
    }

    public GradientOverlay(Context context) {
        super(context);
    }

    public GradientOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
    }

    public GradientOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }
}
