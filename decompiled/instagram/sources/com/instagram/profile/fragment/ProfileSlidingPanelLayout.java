package com.instagram.profile.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import p000X.AnonymousClass0Z0;
import p000X.C05680Ln;

public final class ProfileSlidingPanelLayout extends SlidingPaneLayout {
    public boolean A00 = ((Boolean) C05680Ln.A1X.A00()).booleanValue();
    public float A01;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A00 && A06()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.A01 = motionEvent.getX();
            } else if ((action == 1 || action == 2) && motionEvent.getX() - this.A01 > 50.0f) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0Z0.A05(465917595);
        if (this.A00 && A06()) {
            A02();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0Z0.A0C(1436135295, A05);
        return onTouchEvent;
    }

    public ProfileSlidingPanelLayout(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public ProfileSlidingPanelLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public ProfileSlidingPanelLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
