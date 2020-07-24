package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import p000X.C25913Bc3;
import p000X.C35491gS;
import p000X.C51052Iz;
import p000X.C57632eW;

public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public int A00;
    public int A01 = 0;
    public final Rect A02 = new Rect();
    public final Rect A03 = new Rect();

    public boolean A0N(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View view2 = view;
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        View A0T = A0T(coordinatorLayout.A0D(view));
        if (A0T == null) {
            return false;
        }
        if (A0T.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
            if (view.getFitsSystemWindows()) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        int measuredHeight = (size - A0T.getMeasuredHeight()) + A0S(A0T);
        int i6 = Process.WAIT_RESULT_TIMEOUT;
        if (i5 == -1) {
            i6 = C25913Bc3.MAX_SIGNED_POWER_OF_TWO;
        }
        coordinatorLayout2.A0G(view2, i, i2, View.MeasureSpec.makeMeasureSpec(measuredHeight, i6), i4);
        return true;
    }

    public float A0R(View view) {
        int i;
        if (!(this instanceof AppBarLayout.ScrollingViewBehavior)) {
            return 1.0f;
        }
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.Behavior behavior = ((C51052Iz) appBarLayout.getLayoutParams()).A0B;
            int A0R = behavior instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) behavior).A0R() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + A0R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                return (((float) A0R) / ((float) i)) + 1.0f;
            }
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public View A0T(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            if (view instanceof AppBarLayout) {
                return (AppBarLayout) view;
            }
        }
        return null;
    }

    public final void A0P(CoordinatorLayout coordinatorLayout, View view, int i) {
        View A0T = A0T(coordinatorLayout.A0D(view));
        int i2 = i;
        if (A0T != null) {
            C51052Iz r4 = (C51052Iz) view.getLayoutParams();
            Rect rect = this.A03;
            rect.set(coordinatorLayout.getPaddingLeft() + r4.leftMargin, A0T.getBottom() + r4.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - r4.rightMargin, ((coordinatorLayout.getHeight() + A0T.getBottom()) - coordinatorLayout.getPaddingBottom()) - r4.bottomMargin);
            C35491gS r2 = coordinatorLayout.A02;
            if (r2 != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left += r2.A04();
                rect.right -= r2.A05();
            }
            Rect rect2 = this.A02;
            int i3 = r4.A03;
            if (i3 == 0) {
                i3 = 8388659;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
            int i4 = 0;
            if (this.A00 != 0) {
                float A0R = A0R(A0T);
                int i5 = this.A00;
                i4 = C57632eW.A00((int) (A0R * ((float) i5)), 0, i5);
            }
            view.layout(rect2.left, rect2.top - i4, rect2.right, rect2.bottom - i4);
            this.A01 = rect2.top - A0T.getBottom();
            return;
        }
        super.A0P(coordinatorLayout, view, i);
        this.A01 = 0;
    }

    public int A0S(View view) {
        return view.getMeasuredHeight();
    }

    public HeaderScrollingViewBehavior() {
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
