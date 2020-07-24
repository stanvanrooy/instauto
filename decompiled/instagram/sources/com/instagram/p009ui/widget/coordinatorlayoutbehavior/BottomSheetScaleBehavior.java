package com.instagram.p009ui.widget.coordinatorlayoutbehavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p000X.C51052Iz;

/* renamed from: com.instagram.ui.widget.coordinatorlayoutbehavior.BottomSheetScaleBehavior */
public class BottomSheetScaleBehavior extends CoordinatorLayout.Behavior {
    public int A00 = 0;

    public static BottomSheetScaleBehavior A00(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C51052Iz) {
            CoordinatorLayout.Behavior behavior = ((C51052Iz) layoutParams).A0B;
            if (behavior instanceof BottomSheetScaleBehavior) {
                return (BottomSheetScaleBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetScaleBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final boolean A0F(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return ((C51052Iz) view2.getLayoutParams()).A0B instanceof BottomSheetBehavior;
    }

    public final boolean A0G(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8 || view.getBottom() - this.A00 == 0) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return false;
        }
        view.setPivotX((float) (view.getWidth() >> 1));
        view.setPivotY((float) this.A00);
        float min = Math.min(1.0f, (((float) (view2.getTop() + view2.getPaddingTop())) - ((float) this.A00)) / ((float) (view.getBottom() - this.A00)));
        view.setScaleY(min);
        view.setScaleX(min);
        return false;
    }

    public BottomSheetScaleBehavior() {
    }

    public BottomSheetScaleBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
