package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p000X.C157676oN;
import p000X.C157836od;

public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior {
    public int A00 = 0;

    public boolean A0F(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public abstract boolean A0O(View view, View view2, boolean z, boolean z2);

    public final boolean A0G(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        C157836od r7 = (C157836od) view2;
        boolean isExpanded = r7.isExpanded();
        boolean z = false;
        if (!isExpanded ? this.A00 == 1 : (i = this.A00) == 0 || i == 2) {
            z = true;
        }
        if (!z) {
            return false;
        }
        int i2 = 2;
        if (isExpanded) {
            i2 = 1;
        }
        this.A00 = i2;
        return A0O((View) r7, view, isExpanded, true);
    }

    public final boolean A0M(CoordinatorLayout coordinatorLayout, View view, int i) {
        C157836od r4;
        int i2;
        if (view.isLaidOut()) {
            return false;
        }
        List A0D = coordinatorLayout.A0D(view);
        int size = A0D.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                r4 = null;
                break;
            }
            View view2 = (View) A0D.get(i3);
            if (A0F(coordinatorLayout, view, view2)) {
                r4 = (C157836od) view2;
                break;
            }
            i3++;
        }
        if (r4 == null) {
            return false;
        }
        boolean isExpanded = r4.isExpanded();
        boolean z = false;
        if (!isExpanded ? this.A00 == 1 : (i2 = this.A00) == 0 || i2 == 2) {
            z = true;
        }
        if (!z) {
            return false;
        }
        int i4 = 2;
        if (isExpanded) {
            i4 = 1;
        }
        this.A00 = i4;
        view.getViewTreeObserver().addOnPreDrawListener(new C157676oN(this, view, i4, r4));
        return false;
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
