package com.instagram.creation.base.p029ui.sliderview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import p000X.AnonymousClass83Q;
import p000X.C019000b;
import p000X.C06220Of;

/* renamed from: com.instagram.creation.base.ui.sliderview.RulerView */
public class RulerView extends View {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Rect A07;
    public AnonymousClass83Q A08;
    public int A09;
    public boolean A0A;
    public final int A0B;
    public final Paint A0C;
    public final Paint A0D;

    private void A00(Canvas canvas, float f, float f2, int i) {
        String Aib;
        AnonymousClass83Q r0 = this.A08;
        if (r0 != null && (Aib = r0.Aib(i)) != null) {
            this.A0D.getTextBounds(Aib, 0, Aib.length(), this.A07);
            canvas.drawText(Aib, f, f2 + ((float) this.A07.centerY()), this.A0D);
        }
    }

    public final void onDraw(Canvas canvas) {
        float height = (float) getHeight();
        float f = this.A01;
        float f2 = height * f;
        float f3 = height * ((1.0f - f) - this.A00);
        float f4 = this.A02;
        float f5 = f2 + ((1.0f - f4) * f3);
        float f6 = f3 * f4;
        for (int i = 0; i <= this.A09; i++) {
            float f7 = (float) ((this.A03 * i) + this.A05);
            Canvas canvas2 = canvas;
            if (i % this.A06 == 0) {
                this.A0C.setColor(this.A0B);
                float f8 = ((float) this.A04) / 2.0f;
                canvas2.drawRect(f7 - f8, f2, f7 + f8, f2 + f3, this.A0C);
                A00(canvas2, f7, f2, i);
            } else {
                this.A0C.setColor(this.A0B);
                canvas2.drawRect(f7, f5, f7 + 1.0f, f5 + f6, this.A0C);
                A00(canvas2, f7, f5, i);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        if (!this.A0A) {
            int i3 = this.A03;
            this.A09 = (((View.MeasureSpec.getSize(i) - this.A05) + i3) - 1) / i3;
        }
        setMeasuredDimension((this.A09 * this.A03) + (this.A05 << 1), View.MeasureSpec.getSize(i2));
    }

    public void setNumIncrements(int i) {
        this.A09 = i;
        this.A0A = true;
    }

    public void setLeftRightMarginRatio(float f) {
        this.A05 = Math.round(f * ((float) getResources().getDisplayMetrics().widthPixels));
    }

    public void setIncrementWidthPx(int i) {
        this.A03 = i;
    }

    public void setLeftRightMarginPx(int i) {
        this.A05 = i;
    }

    public void setLineLabeler(AnonymousClass83Q r1) {
        this.A08 = r1;
    }

    public void setPaddingBottomRatio(float f) {
        this.A00 = f;
    }

    public void setPaddingTopRatio(float f) {
        this.A01 = f;
    }

    public void setSmallLineRatio(float f) {
        this.A02 = f;
    }

    public void setSmallToLargeLineFrequency(int i) {
        this.A06 = i;
    }

    public RulerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public RulerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RulerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0C = new Paint();
        this.A0D = new Paint();
        this.A0B = C019000b.A00(getContext(), C0003R.color.igds_secondary_icon);
        Resources resources = getResources();
        this.A03 = Math.round(C06220Of.A05(resources.getDisplayMetrics(), 20));
        this.A04 = 2;
        this.A06 = 5;
        this.A0D.setColor(this.A0B);
        this.A0D.setTextSize((float) resources.getDimensionPixelSize(C0003R.dimen.trim_ruler_text_size));
        this.A0D.setTextAlign(Paint.Align.CENTER);
        this.A0D.setAntiAlias(true);
        this.A07 = new Rect();
        getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.sliderview_pointer_width);
        int i2 = this.A04;
        if (i2 % 2 != dimensionPixelSize % 2) {
            this.A04 = i2 + 1;
        }
    }
}
