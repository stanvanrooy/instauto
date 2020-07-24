package com.instagram.common.p004ui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass7k4;
import p000X.C26800Bsl;

/* renamed from: com.instagram.common.ui.widget.imageview.ConstrainedImageView */
public class ConstrainedImageView extends IgImageView {
    public float A00 = 1.0f;
    public C26800Bsl A01;
    public AnonymousClass7k4 A02;

    public final boolean setFrame(int i, int i2, int i3, int i4) {
        AnonymousClass7k4 r0 = this.A02;
        int i5 = i2;
        int i6 = i;
        int i7 = i4;
        int i8 = i3;
        if (r0 != null) {
            r0.BMi(this, i6, i5, i8, i7);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), Math.round(((float) getMeasuredWidth()) / this.A00));
    }

    public void setAspect(float f) {
        this.A00 = f;
    }

    public void setOnMeasureListener(C26800Bsl bsl) {
        this.A01 = bsl;
    }

    public void setOnSetFrameListener(AnonymousClass7k4 r1) {
        this.A02 = r1;
    }

    public ConstrainedImageView(Context context) {
        super(context);
    }

    public ConstrainedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0w);
        this.A00 = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    public ConstrainedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0w);
        this.A00 = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }
}
