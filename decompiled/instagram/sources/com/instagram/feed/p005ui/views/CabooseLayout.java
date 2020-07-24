package com.instagram.feed.p005ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1XI;

/* renamed from: com.instagram.feed.ui.views.CabooseLayout */
public class CabooseLayout extends FrameLayout {
    public int A00;
    public AnonymousClass1XI A01 = AnonymousClass1XI.SHOWN;
    public int A02;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            measureChild(childAt, i, View.MeasureSpec.makeMeasureSpec(0, 0));
            if (childAt.getId() == C0003R.C0005id.zoomable_view_container) {
                int measuredHeight = childAt.getMeasuredHeight() >> 1;
                this.A02 = childAt.getMeasuredHeight() - measuredHeight;
                i3 += measuredHeight;
            } else if (!(childAt.getId() == C0003R.C0005id.caboose_shadow || childAt.getId() == C0003R.C0005id.caboose_rule)) {
                i3 += childAt.getMeasuredHeight();
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.A00 = i3;
    }

    public static int getHiddenVisibility(CabooseLayout cabooseLayout) {
        if (cabooseLayout.A00 == 0 || cabooseLayout.getBottom() == 0) {
            return 4;
        }
        return 8;
    }

    public int getContentHeight() {
        return this.A00;
    }

    public AnonymousClass1XI getState() {
        return this.A01;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int measuredHeight;
        int measuredHeight2 = getMeasuredHeight() + this.A02;
        for (int childCount = getChildCount() - 1; childCount > -1; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getId() == C0003R.C0005id.caboose_shadow) {
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight();
            } else if (childAt.getId() == C0003R.C0005id.caboose_rule) {
                measuredWidth = getMeasuredWidth();
                measuredHeight = childAt.getMeasuredHeight();
            } else {
                childAt.layout(0, measuredHeight2 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight2);
                measuredHeight2 -= childAt.getMeasuredHeight();
            }
            childAt.layout(0, 0, measuredWidth, measuredHeight);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0Z0.A0C(636863703, AnonymousClass0Z0.A05(619789472));
        return false;
    }

    public CabooseLayout(Context context) {
        super(context);
    }

    public CabooseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CabooseLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
