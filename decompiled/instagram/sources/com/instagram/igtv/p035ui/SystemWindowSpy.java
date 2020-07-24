package com.instagram.igtv.p035ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import p000X.C25913Bc3;

/* renamed from: com.instagram.igtv.ui.SystemWindowSpy */
public class SystemWindowSpy extends View {
    public final Rect A00;

    public final boolean fitSystemWindows(Rect rect) {
        this.A00.set(rect);
        requestLayout();
        return false;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(resolveSize(this.A00.bottom, i2), C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
    }

    public SystemWindowSpy(Context context) {
        this(context, (AttributeSet) null);
    }

    public SystemWindowSpy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SystemWindowSpy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new Rect();
        setFitsSystemWindows(true);
    }
}
