package com.instagram.direct.p018ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EG;
import p000X.C06220Of;
import p000X.C27181Gu;

/* renamed from: com.instagram.direct.ui.DirectSmokeOverlayView */
public class DirectSmokeOverlayView extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public AnonymousClass1EG A04;
    public final float A05;
    public final float A06;
    public final Matrix A07;
    public final Paint A08;

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas2);
        AnonymousClass1EG r2 = this.A04;
        if (r2 != null && !r2.A09() && this.A00 != 0) {
            float A002 = (float) r2.A00();
            Bitmap bitmap = this.A03;
            if (bitmap != null) {
                int max = Math.max(bitmap.getWidth(), this.A03.getHeight());
                double d = (double) A002;
                float A012 = (float) C27181Gu.A01(d, 0.0d, 1.0d, 0.699999988079071d, 1.7999999523162842d);
                if (A002 < 0.5f) {
                    this.A08.setAlpha((int) C27181Gu.A01(d, 0.0d, 0.5d, 0.0d, 255.0d));
                } else {
                    this.A08.setAlpha((int) C27181Gu.A01(d, 0.5d, 1.0d, 255.0d, 0.0d));
                }
                canvas2.save();
                canvas2.scale(A012, A012, (float) this.A01, (float) this.A02);
                canvas2.translate(this.A05 * A002, A002 * this.A06);
                int i = this.A00 >> 1;
                canvas2.translate((float) (this.A01 - i), (float) (this.A02 - i));
                float f = ((float) this.A00) / ((float) max);
                this.A07.setScale(f, f);
                canvas2.drawBitmap(this.A03, this.A07, this.A08);
                canvas2.restore();
            }
        }
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-1693579366);
        super.onDetachedFromWindow();
        AnonymousClass1EG r0 = this.A04;
        if (r0 != null) {
            r0.A0D.clear();
            this.A04 = null;
            this.A03.recycle();
            this.A03 = null;
        }
        AnonymousClass0Z0.A0D(303510565, A062);
    }

    public DirectSmokeOverlayView(Context context) {
        this(context, (AttributeSet) null);
    }

    public DirectSmokeOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DirectSmokeOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = C06220Of.A00(context, 10.0f);
        this.A06 = C06220Of.A00(context, 20.0f);
        this.A08 = new Paint(5);
        this.A07 = new Matrix();
    }
}
