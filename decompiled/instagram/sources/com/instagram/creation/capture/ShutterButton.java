package com.instagram.creation.capture;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.Constants;
import p000X.AnonymousClass1BA;
import p000X.C33781dU;

public class ShutterButton extends View {
    public float A00;
    public Integer A01;
    public Integer A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final ArgbEvaluator A0G;
    public final Paint A0H;

    public void setProgress(float f) {
        this.A00 = f;
        A00(f);
        invalidate();
    }

    public final void A00(float f) {
        ArgbEvaluator argbEvaluator;
        Integer valueOf;
        int i;
        if (isPressed() || isActivated()) {
            this.A01 = (Integer) this.A0G.evaluate(f, Integer.valueOf(this.A0B), Integer.valueOf(this.A05));
            argbEvaluator = this.A0G;
            valueOf = Integer.valueOf(this.A0E);
            i = this.A08;
        } else if (!isEnabled()) {
            this.A01 = (Integer) this.A0G.evaluate(f, Integer.valueOf(this.A0A), Integer.valueOf(this.A04));
            argbEvaluator = this.A0G;
            valueOf = Integer.valueOf(this.A0D);
            i = this.A07;
        } else {
            this.A01 = (Integer) this.A0G.evaluate(f, Integer.valueOf(this.A09), Integer.valueOf(this.A03));
            argbEvaluator = this.A0G;
            valueOf = Integer.valueOf(this.A0C);
            i = this.A06;
        }
        this.A02 = (Integer) argbEvaluator.evaluate(f, valueOf, Integer.valueOf(i));
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A00(this.A00);
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = ((float) canvas.getWidth()) / 2.0f;
        float height = ((float) canvas.getHeight()) / 2.0f;
        float height2 = ((float) canvas.getHeight()) / 2.0f;
        this.A0H.setColor(this.A0F);
        canvas.drawCircle(width, height, height2, this.A0H);
        this.A0H.setColor(this.A01.intValue());
        canvas.drawCircle(width, height, (float) Math.round(0.90909094f * height2), this.A0H);
        this.A0H.setColor(this.A02.intValue());
        canvas.drawCircle(width, height, (float) Math.round(height2 * 0.54545456f), this.A0H);
    }

    public ShutterButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public ShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0G = new ArgbEvaluator();
        this.A0H = new Paint(1);
        Context context2 = getContext();
        this.A0F = AnonymousClass1BA.A01(context2, C0003R.attr.captureStrokeRing);
        getContext();
        this.A09 = AnonymousClass1BA.A01(context2, C0003R.attr.captureCameraOuterRing);
        getContext();
        this.A0C = AnonymousClass1BA.A01(context2, C0003R.attr.captureCameraInnerRing);
        getContext();
        this.A0B = AnonymousClass1BA.A01(context2, C0003R.attr.captureCameraOuterRingPressed);
        getContext();
        this.A0E = AnonymousClass1BA.A01(context2, C0003R.attr.captureCameraInnerRingPressed);
        getContext();
        this.A0A = AnonymousClass1BA.A01(context2, C0003R.attr.captureCameraOuterRing);
        getContext();
        this.A0D = AnonymousClass1BA.A01(context2, C0003R.attr.captureCameraInnerRing);
        getContext();
        this.A03 = AnonymousClass1BA.A01(context2, C0003R.attr.captureCamcorderOuterRing);
        getContext();
        this.A06 = AnonymousClass1BA.A01(context2, C0003R.attr.captureCamcorderInnerRing);
        getContext();
        this.A05 = AnonymousClass1BA.A01(context2, C0003R.attr.captureCamcorderOuterRingPressed);
        getContext();
        this.A08 = AnonymousClass1BA.A01(context2, C0003R.attr.captureCamcorderInnerRingPressed);
        getContext();
        this.A04 = AnonymousClass1BA.A01(context2, C0003R.attr.captureCamcorderOuterRingDisable);
        getContext();
        this.A07 = AnonymousClass1BA.A01(context2, C0003R.attr.captureCamcorderInnerRingDisable);
        A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        C33781dU.A00(this, Constants.ONE);
    }
}
