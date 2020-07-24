package com.instagram.common.p004ui.widget.squareframelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000X.C39121mO;

/* renamed from: com.instagram.common.ui.widget.squareframelayout.SquareFrameLayout */
public class SquareFrameLayout extends FrameLayout {
    public final void onMeasure(int i, int i2) {
        int A00 = C39121mO.A00(i, i2);
        super.onMeasure(A00, A00);
    }

    public SquareFrameLayout(Context context) {
        super(context);
    }

    public SquareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
