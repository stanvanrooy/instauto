package com.instagram.p009ui.widget.roundedcornerlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import p000X.C34171eC;

/* renamed from: com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout */
public class RoundedCornerConstraintLayout extends ConstraintLayout {
    public C34171eC A00;

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A00.A04(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00.A03(getMeasuredWidth(), getMeasuredHeight());
    }

    public RoundedCornerConstraintLayout(Context context) {
        super(context);
        this.A00 = C34171eC.A00(getContext(), (AttributeSet) null);
        setLayerType(2, (Paint) null);
    }

    public RoundedCornerConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = C34171eC.A00(getContext(), attributeSet);
        setLayerType(2, (Paint) null);
    }

    public RoundedCornerConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = C34171eC.A00(getContext(), attributeSet);
        setLayerType(2, (Paint) null);
    }
}
