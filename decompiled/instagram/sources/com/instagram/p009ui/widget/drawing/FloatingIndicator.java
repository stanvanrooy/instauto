package com.instagram.p009ui.widget.drawing;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass8AL;
import p000X.C84453lh;
import p000X.C84463li;
import p000X.C85503nU;
import p000X.C92803zk;

/* renamed from: com.instagram.ui.widget.drawing.FloatingIndicator */
public class FloatingIndicator extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public C92803zk A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public final Paint A08;
    public final Paint A09;
    public final Path A0A;
    public final RectF A0B;
    public final C84463li A0C;
    public final Runnable A0D;

    public final void A00() {
        removeCallbacks(this.A0D);
        this.A05 = false;
        this.A06 = false;
        AnonymousClass1EG r2 = (AnonymousClass1EG) this.A04.get();
        r2.A02();
        r2.A03(0.0d);
    }

    public final void A01(float f, float f2, float f3, float f4, float f5, int i, int i2, long j, boolean z) {
        C84463li r0 = this.A0C;
        r0.A00 = f;
        r0.A01 = f2;
        r0.A02 = f3;
        r0.A03 = f4;
        this.A07 = i2;
        if (this.A06) {
            if (z) {
                f3 = Math.min(Math.max(f3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), (float) getWidth());
            }
            this.A02 = f3;
            if (z) {
                f4 = Math.min(Math.max(f4, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), (float) getHeight());
            }
            this.A03 = f4;
            this.A00 = f5 / 2.0f;
        } else if (!this.A05) {
            postDelayed(this.A0D, j);
            this.A05 = true;
        }
        this.A08.setColor(i);
        this.A01 = f5;
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.A07;
        if (i == 0) {
            canvas.drawCircle(this.A02, this.A03, this.A00, this.A08);
            canvas.drawCircle(this.A02, this.A03, this.A00, this.A09);
        } else if (i == 1) {
            this.A0A.rewind();
            RectF rectF = this.A0B;
            float f = this.A02;
            float f2 = this.A00;
            float f3 = this.A03;
            rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
            this.A0A.addArc(this.A0B, 130.0f, 280.0f);
            this.A0A.lineTo(this.A02, this.A03 + (this.A00 * 1.3f));
            this.A0A.close();
            canvas.drawPath(this.A0A, this.A08);
            canvas.drawPath(this.A0A, this.A09);
        }
    }

    public FloatingIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public FloatingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = false;
        this.A05 = false;
        this.A07 = 0;
        this.A0D = new C84453lh(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1n);
        try {
            float dimension = obtainStyledAttributes.getDimension(0, 5.0f);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.A08 = paint;
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint(1);
            this.A09 = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.A09.setColor(-1);
            this.A09.setStrokeWidth(dimension);
            this.A09.setStrokeJoin(Paint.Join.ROUND);
            this.A0C = new C84463li(this);
            this.A0A = new Path();
            this.A0B = new RectF();
            this.A04 = AnonymousClass8AL.A00(new C85503nU(this));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
