package com.instagram.p009ui.widget.flowlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.forker.Process;
import p000X.C06400Ox;

/* renamed from: com.instagram.ui.widget.flowlayout.HorizontalFlowLayout */
public class HorizontalFlowLayout extends ViewGroup {
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A00(i3 - i, true);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = i;
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int i4 = 0;
        while (true) {
            int i5 = i2;
            if (i4 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i3, 0, i5, 0);
            }
            i4++;
        }
        if (View.MeasureSpec.getMode(i) == 0) {
            size = -1;
        }
        int[] A00 = A00(size, false);
        setMeasuredDimension(resolveSize(A00[0], i), resolveSize(A00[1], i2));
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a3, code lost:
        if ((r12 - r13) >= r11) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    private int[] A00(int i, boolean z) {
        int i2;
        boolean z2;
        int i3;
        boolean A02 = C06400Ox.A02(getContext());
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int i4 = paddingStart;
        if (A02) {
            i4 = i - paddingStart;
        }
        int paddingTop = getPaddingTop();
        int i5 = Process.WAIT_RESULT_TIMEOUT;
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int marginStart = marginLayoutParams.getMarginStart();
                int measuredWidth = childAt.getMeasuredWidth() + marginStart + marginLayoutParams.getMarginEnd();
                int measuredHeight = marginLayoutParams.topMargin + childAt.getMeasuredHeight() + marginLayoutParams.bottomMargin;
                if (A02 || i4 + measuredWidth <= paddingStart + i) {
                    if (A02) {
                        i2 = paddingEnd + i;
                    }
                    i2 = i4;
                    z2 = false;
                    if (z2) {
                        paddingTop += i6;
                        i6 = 0;
                    }
                    if (z) {
                        if (!A02) {
                            int i8 = marginStart + i2;
                            childAt.layout(i8, marginLayoutParams.topMargin + paddingTop, childAt.getMeasuredWidth() + i8, marginLayoutParams.topMargin + paddingTop + childAt.getMeasuredHeight());
                        } else {
                            int i9 = marginLayoutParams.topMargin + paddingTop;
                            childAt.layout((i2 - childAt.getMeasuredWidth()) - marginStart, i9, i2 - marginStart, childAt.getMeasuredHeight() + i9);
                        }
                    }
                    i6 = Math.max(i6, measuredHeight);
                    if (A02) {
                        i3 = i2 + measuredWidth;
                    } else {
                        i3 = i2 - measuredWidth;
                    }
                    i4 = i3;
                    i5 = Math.max(i5, i3);
                } else {
                    i2 = paddingStart;
                }
                z2 = true;
                if (z2) {
                }
                if (z) {
                }
                i6 = Math.max(i6, measuredHeight);
                if (A02) {
                }
                i4 = i3;
                i5 = Math.max(i5, i3);
            }
        }
        return new int[]{Math.max(getPaddingLeft(), i5) + getPaddingRight(), Math.max(getPaddingTop(), paddingTop + i6) + getPaddingBottom()};
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public HorizontalFlowLayout(Context context) {
        super(context);
    }

    public HorizontalFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
