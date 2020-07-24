package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000X.AnonymousClass5AZ;
import p000X.C2111898z;

public class HideBottomViewOnScrollBehavior extends CoordinatorLayout.Behavior {
    public int A00 = 2;
    public ViewPropertyAnimator A01;
    public int A02 = 0;

    public void A0O(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.A01;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.A00 = 1;
        int i = this.A02;
        this.A01 = view.animate().translationY((float) i).setInterpolator(C2111898z.A01).setDuration(175).setListener(new AnonymousClass5AZ(this));
    }

    public void A0P(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.A01;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.A00 = 2;
        this.A01 = view.animate().translationY((float) 0).setInterpolator(C2111898z.A04).setDuration(225).setListener(new AnonymousClass5AZ(this));
    }

    public boolean A0M(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.A02 = view.getMeasuredHeight();
        return super.A0M(coordinatorLayout, view, i);
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
