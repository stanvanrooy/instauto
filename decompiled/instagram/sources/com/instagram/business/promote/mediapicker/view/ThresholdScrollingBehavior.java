package com.instagram.business.promote.mediapicker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p000X.AnonymousClass0a4;
import p000X.C51052Iz;

public class ThresholdScrollingBehavior extends AppBarLayout.ScrollingViewBehavior {
    public final boolean A0G(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.A0G(coordinatorLayout, view, view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        AnonymousClass0a4.A06(layoutParams);
        if (!(((C51052Iz) layoutParams).A0B instanceof AppBarLayout.Behavior)) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        AnonymousClass0a4.A06(layoutParams2);
        layoutParams2.height = coordinatorLayout.getHeight() - view.getTop();
        view.requestLayout();
        return false;
    }

    public ThresholdScrollingBehavior() {
    }

    public ThresholdScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
