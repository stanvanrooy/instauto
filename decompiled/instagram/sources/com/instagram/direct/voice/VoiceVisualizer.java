package com.instagram.direct.voice;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.C06220Of;

public class VoiceVisualizer extends View {
    public float A00;
    public boolean A01;
    public final float A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final float A06;
    public final Paint A07;
    public final Paint A08;

    private void A00(Canvas canvas, Paint paint, int i, float f) {
        Canvas canvas2 = canvas;
        float height = (float) ((canvas.getHeight() - getPaddingTop()) - getPaddingBottom());
        float min = Math.min((((float) canvas.getWidth()) - (f * this.A02)) - ((float) getPaddingRight()), (((float) i) * this.A02) - ((float) getPaddingRight()));
        Paint paint2 = paint;
        if (!this.A03.isEmpty()) {
            int i2 = 0;
            for (int i3 = i - 1; i3 >= 0; i3--) {
                A01(1.0f, ((Float) this.A03.get(i3)).floatValue(), height, min, i2, paint2, canvas2);
                i2++;
            }
            return;
        }
        int i4 = i - 1;
        int i5 = 0;
        while (i4 >= 0) {
            if (A01(((Float) ((ValueAnimator) ((Pair) this.A04.get(i4)).second).getAnimatedValue()).floatValue(), ((Float) ((Pair) this.A04.get(i4)).first).floatValue(), height, min, i5, paint2, canvas2)) {
                i5++;
                i4--;
            } else {
                return;
            }
        }
    }

    public int getDesiredWidth() {
        return (int) (((float) this.A03.size()) * this.A02);
    }

    public void setPlaybackPercentage(float f) {
        this.A00 = f;
        postInvalidateOnAnimation();
    }

    public void setSegmentColor(int i) {
        this.A08.setColor(i);
        this.A08.setAlpha(77);
        this.A07.setColor(i);
    }

    private boolean A01(float f, float f2, float f3, float f4, int i, Paint paint, Canvas canvas) {
        float max = Math.max(0.01f, f2) * f3 * f;
        float f5 = f4 - (this.A02 * ((float) i));
        float paddingTop = ((float) getPaddingTop()) + ((f3 - max) / 2.0f);
        float f6 = this.A06;
        if (f5 < ((float) getPaddingLeft()) - f6) {
            return false;
        }
        paint.setStrokeWidth(f6 * f);
        float f7 = paddingTop + max;
        canvas.drawLine(f5, paddingTop, f5, f7, paint);
        return true;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(998622087);
        super.onDetachedFromWindow();
        for (Pair pair : this.A04) {
            ((ValueAnimator) pair.second).end();
        }
        AnonymousClass0Z0.A0D(1057510060, A062);
    }

    public final void onDraw(Canvas canvas) {
        int size;
        float f;
        Paint paint;
        super.onDraw(canvas);
        if (!this.A04.isEmpty() || !this.A03.isEmpty()) {
            if (this.A03.isEmpty()) {
                size = this.A04.size();
                f = ((Float) ((ValueAnimator) ((Pair) this.A04.get(size - 1)).second).getAnimatedValue()).floatValue();
            } else {
                size = this.A03.size();
                f = 1.0f;
            }
            if (this.A03.isEmpty() || this.A01) {
                paint = this.A07;
            } else {
                paint = this.A08;
            }
            A00(canvas, paint, size, f);
            if (this.A00 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                canvas.clipRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((float) getWidth()) * this.A00, (float) getHeight());
                A00(canvas, this.A07, size, f);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int desiredWidth;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (this.A05.isEmpty()) {
            desiredWidth = size;
        } else {
            desiredWidth = getDesiredWidth();
        }
        if (desiredWidth > size && !this.A05.isEmpty()) {
            int floor = (int) Math.floor((double) (((float) size) / this.A02));
            List list = this.A05;
            List list2 = this.A03;
            float size2 = ((float) list.size()) / ((float) floor);
            list2.clear();
            if (floor >= 1) {
                list2.add(list.get(0));
            }
            for (int i3 = 1; i3 < floor - 1; i3++) {
                double d = (double) (((float) i3) * size2);
                double floor2 = Math.floor(d);
                float floatValue = ((Float) list.get((int) floor2)).floatValue();
                list2.add(Float.valueOf(floatValue + ((((Float) list.get((int) Math.ceil(d))).floatValue() - floatValue) * ((float) (d - floor2)))));
            }
            if (floor >= 2) {
                list2.add(list.get(list.size() - 1));
            }
            desiredWidth = getDesiredWidth();
        }
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(desiredWidth, size);
            } else {
                size = desiredWidth;
            }
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
    }

    public void setShouldAlwaysUseProgressPaint(boolean z) {
        this.A01 = z;
    }

    public VoiceVisualizer(Context context) {
        this(context, (AttributeSet) null);
    }

    public VoiceVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public VoiceVisualizer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = new ArrayList();
        this.A05 = new ArrayList();
        this.A03 = new ArrayList();
        this.A07 = new Paint(5);
        this.A08 = new Paint(5);
        Paint paint = this.A07;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.A08.setStrokeCap(cap);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A41, 0, 0);
        try {
            int color = obtainStyledAttributes.getColor(0, -1);
            this.A02 = (float) obtainStyledAttributes.getDimensionPixelOffset(1, (int) C06220Of.A03(context, 5));
            this.A06 = (float) obtainStyledAttributes.getDimensionPixelOffset(2, (int) C06220Of.A03(context, 3));
            obtainStyledAttributes.recycle();
            setSegmentColor(color);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
