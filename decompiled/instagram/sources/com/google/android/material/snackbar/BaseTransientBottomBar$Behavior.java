package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000X.C28906Cog;
import p000X.C28912Coo;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final C28912Coo A00 = new C28912Coo(this);

    public final boolean A0H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C28912Coo coo = this.A00;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C28906Cog.A00().A07(coo.A00);
            }
        } else if (coordinatorLayout.A0J(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C28906Cog.A00().A06(coo.A00);
        }
        return super.A0H(coordinatorLayout, view, motionEvent);
    }
}
