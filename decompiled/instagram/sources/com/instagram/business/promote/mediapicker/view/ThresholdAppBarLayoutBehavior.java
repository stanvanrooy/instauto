package com.instagram.business.promote.mediapicker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.material.appbar.AppBarLayout;
import p000X.AnonymousClass0a4;

public class ThresholdAppBarLayoutBehavior extends AppBarLayout.Behavior {
    public float A00;

    public final /* bridge */ /* synthetic */ boolean A0H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        return false;
    }

    public final void A0a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(coordinatorLayout.getContext());
        AnonymousClass0a4.A06(viewConfiguration);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        float abs = this.A00 + ((float) Math.abs(i2));
        this.A00 = abs;
        if (abs > ((float) (scaledTouchSlop * 25))) {
            super.A0a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }
    }

    public ThresholdAppBarLayoutBehavior() {
    }

    public ThresholdAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
