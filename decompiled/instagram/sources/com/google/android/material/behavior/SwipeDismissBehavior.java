package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import p000X.AFk;
import p000X.AIY;
import p000X.C23271AFp;
import p000X.C28908Cok;
import p000X.C28921Cox;

public class SwipeDismissBehavior extends CoordinatorLayout.Behavior {
    public float A00 = 0.5f;
    public float A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public int A02 = 2;
    public AFk A03;
    public C28921Cox A04;
    public boolean A05;
    public final C23271AFp A06 = new C28908Cok(this);

    public boolean A0O(View view) {
        if (!(this instanceof BaseTransientBottomBar$Behavior)) {
            return true;
        }
        return view instanceof AIY;
    }

    public boolean A0H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.A05;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.A0J(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A05 = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A05 = false;
        }
        if (!z) {
            return false;
        }
        if (this.A03 == null) {
            this.A03 = new AFk(coordinatorLayout.getContext(), coordinatorLayout, this.A06);
        }
        return this.A03.A0J(motionEvent);
    }

    public final boolean A0I(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        AFk aFk = this.A03;
        if (aFk == null) {
            return false;
        }
        aFk.A0F(motionEvent);
        return true;
    }
}
