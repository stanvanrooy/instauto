package com.instagram.p009ui.widget.roundedcornerlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import p000X.C34171eC;

/* renamed from: com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout */
public class RoundedCornerMediaFrameLayout extends MediaFrameLayout {
    public C34171eC A00;

    public void setRadius(int i) {
        if (this.A00.A05(i)) {
            invalidate();
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A00.A04(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00.A03(getMeasuredWidth(), getMeasuredHeight());
    }

    public RoundedCornerMediaFrameLayout(Context context) {
        super(context);
        this.A00 = C34171eC.A00(getContext(), (AttributeSet) null);
        setLayerType(2, (Paint) null);
    }

    public RoundedCornerMediaFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = C34171eC.A00(getContext(), attributeSet);
        setLayerType(2, (Paint) null);
    }

    public RoundedCornerMediaFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = C34171eC.A00(getContext(), attributeSet);
        setLayerType(2, (Paint) null);
    }
}
