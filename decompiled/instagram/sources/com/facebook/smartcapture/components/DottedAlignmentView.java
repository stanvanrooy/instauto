package com.facebook.smartcapture.components;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.C212999Gn;
import p000X.C213009Go;

public class DottedAlignmentView extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public ValueAnimator A08;
    public Bitmap A09;
    public float A0A;
    public Paint A0B;

    public DottedAlignmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.A0B = paint;
        paint.setColor(C213009Go.A00(context, C0003R.attr.sc_always_white));
        Resources resources = getResources();
        float dimension = resources.getDimension(C0003R.dimen.contour_dot_size);
        this.A02 = dimension;
        this.A03 = dimension / 2.0f;
        getResources();
        this.A01 = resources.getDimension(C0003R.dimen.contour_dot_padding);
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        int i2 = (int) this.A0A;
        int i3 = 0;
        while (true) {
            int i4 = this.A07;
            if (i3 < i4) {
                Paint paint = this.A0B;
                int i5 = this.A05;
                if (i5 <= i3) {
                    i5 += i4;
                }
                int i6 = i5 - i3;
                if (i6 >= (i4 >> 1)) {
                    i = 127;
                } else {
                    i = 255 - ((int) (((float) i6) * this.A00));
                }
                paint.setAlpha(i);
                canvas.drawBitmap(this.A09, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i2, this.A0B);
                i2 += this.A09.getHeight();
                i3++;
            } else {
                return;
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(715410182);
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.A02 + (this.A01 * 2.0f);
        int i5 = (int) f;
        int i6 = i / i5;
        this.A06 = i6;
        int i7 = i2 / i5;
        this.A07 = i7;
        float f2 = (float) i7;
        this.A00 = 127.5f / (f2 / 2.0f);
        this.A04 = (((float) i) - (((float) i6) * f)) / 2.0f;
        this.A0A = (((float) i2) - (f2 * f)) / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(i, i5, Bitmap.Config.ARGB_8888);
        this.A09 = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        float f3 = this.A04;
        float f4 = this.A01;
        float f5 = this.A03;
        float f6 = f3 + f4 + f5;
        float f7 = f4 + f5;
        Paint paint = new Paint(1);
        paint.setColor(-1);
        for (int i8 = 0; i8 < this.A06; i8++) {
            canvas.drawCircle(f6, f7, this.A03, paint);
            f6 += this.A02 + (this.A01 * 2.0f);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A08 = valueAnimator;
        valueAnimator.setRepeatMode(1);
        this.A08.setRepeatCount(-1);
        this.A08.setDuration(700);
        this.A08.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("animation_property", new int[]{0, this.A07 + 1})});
        this.A08.addUpdateListener(new C212999Gn(this));
        AnonymousClass0Z0.A0D(-2002386928, A062);
    }
}
