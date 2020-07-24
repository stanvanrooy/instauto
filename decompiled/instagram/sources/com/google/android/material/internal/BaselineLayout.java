package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup {
    public int A00 = -1;

    public int getBaseline() {
        return this.A00;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i3 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((paddingRight - measuredWidth) >> 1) + paddingLeft;
                if (this.A00 == -1 || childAt.getBaseline() == -1) {
                    i5 = paddingTop;
                } else {
                    i5 = (this.A00 + paddingTop) - childAt.getBaseline();
                }
                childAt.layout(i7, i5, measuredWidth + i7, measuredHeight + i5);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i3 = Math.max(i3, baseline);
                    i4 = Math.max(i4, childAt.getMeasuredHeight() - baseline);
                }
                i6 = Math.max(i6, childAt.getMeasuredWidth());
                i5 = Math.max(i5, childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
            }
        }
        if (i3 != -1) {
            i5 = Math.max(i5, Math.max(i4, getPaddingBottom()) + i3);
            this.A00 = i3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumWidth()), i, i7), View.resolveSizeAndState(Math.max(i5, getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    public BaselineLayout(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
