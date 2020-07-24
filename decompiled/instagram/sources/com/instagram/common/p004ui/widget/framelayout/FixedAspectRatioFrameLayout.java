package com.instagram.common.p004ui.widget.framelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000X.C39121mO;
import p000X.C39131mP;

/* renamed from: com.instagram.common.ui.widget.framelayout.FixedAspectRatioFrameLayout */
public class FixedAspectRatioFrameLayout extends FrameLayout {
    public float A00;

    public final void onMeasure(int i, int i2) {
        C39131mP A01 = C39121mO.A01(i, i2, this.A00, false);
        super.onMeasure(A01.A01, A01.A00);
    }

    public void setAspectRatio(float f) {
        this.A00 = f;
    }

    public FixedAspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 1.0f;
    }
}
