package com.facebook.smartcapture.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.C174057c8;

public class RectDetectionVisualizerView extends View {
    public float A00;
    public Paint A01;
    public Path A02 = new Path();
    public Path A03 = new Path();
    public Handler A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;
    public Point[] A08;
    public Paint A09;
    public Paint A0A;
    public final Runnable A0B = new C174057c8(this);

    private void A00(Paint paint) {
        paint.setColor(0);
        paint.setDither(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(getResources().getDimension(C0003R.dimen.rect_detection_visualizer_radius)));
        paint.setAntiAlias(true);
    }

    public final void A01(int i, boolean z) {
        this.A07 = new int[]{Color.red(i), Color.green(i), Color.blue(i)};
        this.A05 = z;
        postInvalidate();
    }

    public void setProgress(int i) {
        this.A00 = ((float) i) / 100.0f;
        postInvalidate();
    }

    public RectDetectionVisualizerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.A0A = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.A01 = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.A09 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.A09.setStrokeWidth(getResources().getDimension(C0003R.dimen.rect_detection_visualizer_border_width));
        A00(this.A0A);
        A00(this.A01);
        A00(this.A09);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(-1497981615);
        super.onAttachedToWindow();
        Handler handler = new Handler();
        this.A04 = handler;
        AnonymousClass0ZA.A0E(handler, this.A0B, -1784639334);
        AnonymousClass0Z0.A0D(-428774044, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-237318060);
        super.onDetachedFromWindow();
        Handler handler = this.A04;
        if (handler != null) {
            AnonymousClass0ZA.A08(handler, this.A0B);
        }
        this.A04 = null;
        AnonymousClass0Z0.A0D(-455829498, A062);
    }

    public final void onDraw(Canvas canvas) {
        int[] iArr;
        super.onDraw(canvas);
        if (this.A08 != null && (iArr = this.A06) != null) {
            int rgb = Color.rgb(iArr[0], iArr[1], iArr[2]);
            this.A0A.setColor(rgb);
            this.A0A.setAlpha(76);
            this.A01.setColor(rgb);
            this.A01.setAlpha(120);
            this.A09.setColor(rgb);
            float height = ((float) getHeight()) / ((float) 0);
            Point[] pointArr = this.A08;
            this.A02.reset();
            for (int i = 0; i < pointArr.length; i++) {
                Point point = pointArr[i];
                float f = ((float) point.x) * height;
                float f2 = ((float) point.y) * height;
                if (i == 0) {
                    this.A02.moveTo(f, f2);
                } else {
                    this.A02.lineTo(f, f2);
                }
            }
            this.A02.close();
            canvas.drawPath(this.A02, this.A0A);
            Point[] pointArr2 = this.A08;
            if (this.A05) {
                Point point2 = pointArr2[0];
                int i2 = point2.x;
                Point point3 = pointArr2[1];
                int i3 = point3.x;
                float f3 = this.A00;
                int i4 = (int) (((float) i2) + (((float) (i3 - i2)) * f3));
                int i5 = point2.y;
                int i6 = (int) (((float) i5) + (((float) (point3.y - i5)) * f3));
                Point point4 = pointArr2[3];
                int i7 = point4.x;
                Point point5 = pointArr2[2];
                int i8 = (int) (((float) i7) + (((float) (point5.x - i7)) * f3));
                int i9 = point4.y;
                int i10 = (int) (((float) i9) + (f3 * ((float) (point5.y - i9))));
                this.A03.reset();
                Path path = this.A03;
                Point point6 = pointArr2[0];
                path.moveTo(((float) point6.x) * height, ((float) point6.y) * height);
                this.A03.lineTo(((float) i4) * height, ((float) i6) * height);
                this.A03.lineTo(((float) i8) * height, ((float) i10) * height);
                Path path2 = this.A03;
                Point point7 = pointArr2[3];
                path2.lineTo(((float) point7.x) * height, ((float) point7.y) * height);
                this.A03.close();
                canvas.drawPath(this.A03, this.A01);
            }
            canvas.drawPath(this.A02, this.A09);
        }
    }
}
