package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import p000X.C51052Iz;
import p000X.C712039k;

public class FloatingActionButton$BaseBehavior extends CoordinatorLayout.Behavior {
    public final /* bridge */ /* synthetic */ boolean A0G(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z;
        if (!(view2 instanceof AppBarLayout)) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof C51052Iz) {
                z = ((C51052Iz) layoutParams).A0B instanceof BottomSheetBehavior;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        throw null;
    }

    public final /* bridge */ /* synthetic */ boolean A0M(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean z;
        List A0D = coordinatorLayout.A0D((View) null);
        int size = A0D.size();
        int i2 = 0;
        while (i2 < size) {
            View view2 = (View) A0D.get(i2);
            if (!(view2 instanceof AppBarLayout)) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof C51052Iz) {
                    z = ((C51052Iz) layoutParams).A0B instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (!z) {
                    i2++;
                }
            }
            throw null;
        }
        coordinatorLayout.A0F((View) null, i);
        return true;
    }

    public FloatingActionButton$BaseBehavior() {
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C712039k.A0C);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
