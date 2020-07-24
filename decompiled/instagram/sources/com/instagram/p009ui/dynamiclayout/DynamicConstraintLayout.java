package com.instagram.p009ui.dynamiclayout;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import p000X.AnonymousClass3A6;

/* renamed from: com.instagram.ui.dynamiclayout.DynamicConstraintLayout */
public class DynamicConstraintLayout extends ConstraintLayout {
    public AnonymousClass3A6 A00;

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        AnonymousClass3A6 r0 = this.A00;
        if (r0 != null && r0.BAY()) {
            super.onMeasure(i, i2);
        }
    }

    public void setOnMeasureListener(AnonymousClass3A6 r1) {
        this.A00 = r1;
    }

    public DynamicConstraintLayout(Context context) {
        super(context);
    }

    public DynamicConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DynamicConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
