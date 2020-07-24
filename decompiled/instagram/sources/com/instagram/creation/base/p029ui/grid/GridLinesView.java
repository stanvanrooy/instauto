package com.instagram.creation.base.p029ui.grid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.C183407sP;
import p000X.C183567sh;

/* renamed from: com.instagram.creation.base.ui.grid.GridLinesView */
public class GridLinesView extends View {
    public C183567sh A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final int A06;
    public final Rect A07;
    public final C183407sP A08;

    public void setGridlinesRect(Rect rect) {
        this.A08.A03(rect);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.A08.A02(canvas);
    }

    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        super.onMeasure(i, i2);
        if (this.A01) {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredWidth();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(-1527950090);
        super.onSizeChanged(i, i2, i3, i4);
        this.A07.set(0, 0, i, i2);
        this.A08.A03(this.A07);
        C183567sh r0 = this.A00;
        if (r0 != null) {
            r0.BNk(this, i, i2);
        }
        AnonymousClass0Z0.A0D(1069032219, A062);
    }

    public void setShouldGridBeSquare(boolean z) {
        this.A01 = z;
    }

    public void setSizeChangedListener(C183567sh r1) {
        this.A00 = r1;
    }

    public GridLinesView(Context context) {
        this(context, (AttributeSet) null);
    }

    public GridLinesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLinesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = 3;
        this.A02 = 3;
        int i2 = 1;
        this.A01 = true;
        this.A06 = ((double) getResources().getDisplayMetrics().density) >= 1.5d ? 2 : i2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A28);
            this.A05 = obtainStyledAttributes.getInteger(3, this.A05);
            this.A02 = obtainStyledAttributes.getInteger(0, this.A02);
            this.A04 = obtainStyledAttributes.getInteger(2, this.A04);
            this.A03 = obtainStyledAttributes.getInteger(1, this.A03);
            obtainStyledAttributes.recycle();
        }
        this.A07 = new Rect();
        this.A08 = new C183407sP(this.A05, this.A02, (float) this.A06, this.A04, this.A03);
    }
}
