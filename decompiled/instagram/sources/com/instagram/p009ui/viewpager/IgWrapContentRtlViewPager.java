package com.instagram.p009ui.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p000X.AnonymousClass3Cw;

/* renamed from: com.instagram.ui.viewpager.IgWrapContentRtlViewPager */
public class IgWrapContentRtlViewPager extends AnonymousClass3Cw {
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.measure(i, i2);
        }
        int measuredWidth = getMeasuredWidth();
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (childAt != null) {
                i3 = childAt.getMeasuredHeight();
            } else {
                i3 = 0;
            }
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(i3, size);
            } else {
                size = i3;
            }
        }
        setMeasuredDimension(measuredWidth, size);
    }

    public IgWrapContentRtlViewPager(Context context) {
        super(context);
    }

    public IgWrapContentRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
