package com.instagram.p009ui.widget.emitter;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.C41791qv;

/* renamed from: com.instagram.ui.widget.emitter.PulseEmitter */
public class PulseEmitter extends View {
    public static final float[] A08 = {0.75f, 0.95f, 1.0f};
    public static final int[] A09 = {Color.argb(255, 25, 25, 25), Color.argb(255, 69, 69, 69), Color.argb(255, 89, 89, 89)};
    public boolean A00;
    public float[] A01;
    public int[] A02;
    public final List A03;
    public final List A04;
    public final Paint A05;
    public final Picture A06;
    public final Handler A07;

    private void A00(int i, int i2) {
        float f = ((float) i) / 2.0f;
        this.A05.setShader(new RadialGradient(f, ((float) i2) / 2.0f, f, this.A02, this.A01, Shader.TileMode.CLAMP));
    }

    public final void A01() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass0ZA.A0B(this.A07, 0);
        }
    }

    public final void A02() {
        if (this.A00) {
            this.A00 = false;
            AnonymousClass0ZA.A02(this.A07, 0);
            for (Animator cancel : this.A04) {
                cancel.cancel();
            }
            this.A04.clear();
            this.A03.clear();
        }
    }

    public final void onDraw(Canvas canvas) {
        Canvas beginRecording = this.A06.beginRecording(getWidth(), getHeight());
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        beginRecording.drawCircle(width, height, width, this.A05);
        for (int i = 0; i < this.A04.size(); i++) {
            float floatValue = ((Float) ((ValueAnimator) this.A04.get(i)).getAnimatedValue()).floatValue();
            beginRecording.save();
            beginRecording.scale(floatValue, floatValue, width, height);
            beginRecording.drawCircle(width, height, width, this.A05);
            beginRecording.restore();
        }
        canvas.drawPicture(this.A06);
    }

    public void setGradientColors(int[] iArr) {
        this.A02 = iArr;
        if (getWidth() > 0 && getHeight() > 0) {
            A00(getWidth(), getHeight());
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(1526535855);
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            A01();
        }
        AnonymousClass0Z0.A0D(1282001367, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(551056016);
        super.onDetachedFromWindow();
        A02();
        AnonymousClass0Z0.A0D(1816822822, A062);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (getVisibility() == 0) {
            A01();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(216059109);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        AnonymousClass0Z0.A0D(1589603495, A062);
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        A02();
    }

    public PulseEmitter(Context context) {
        this(context, (AttributeSet) null);
    }

    public PulseEmitter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PulseEmitter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = new ArrayList();
        this.A04 = new ArrayList();
        this.A06 = new Picture();
        this.A02 = A09;
        this.A01 = A08;
        this.A07 = new C41791qv(this, Looper.getMainLooper());
        Paint paint = new Paint();
        this.A05 = paint;
        paint.setAntiAlias(true);
        this.A05.setDither(true);
        this.A05.setFilterBitmap(true);
        if (Build.VERSION.SDK_INT < 23) {
            setLayerType(1, this.A05);
        }
    }
}
