package com.instagram.p009ui.widget.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p000X.AnonymousClass0Z0;

/* renamed from: com.instagram.ui.widget.refresh.SwipeRefreshWithHScrollLayout */
public class SwipeRefreshWithHScrollLayout extends SwipeRefreshLayout {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public final int A05;

    private void A00(MotionEvent motionEvent) {
        if (!this.A03 && !this.A02) {
            float rawX = this.A00 - motionEvent.getRawX();
            float rawY = this.A01 - motionEvent.getRawY();
            double sqrt = Math.sqrt((double) ((rawX * rawX) + (rawY * rawY)));
            double degrees = Math.toDegrees(Math.atan((double) Math.abs(rawY / rawX)));
            if (sqrt <= ((double) this.A05)) {
                return;
            }
            if (degrees < ((double) this.A04)) {
                this.A02 = true;
            } else {
                this.A03 = true;
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A00 = motionEvent.getX();
            this.A01 = motionEvent.getY();
            this.A02 = false;
            this.A03 = false;
        } else if (actionMasked == 2) {
            A00(motionEvent);
            float abs = Math.abs(this.A00 - motionEvent.getX());
            float abs2 = Math.abs(this.A01 - motionEvent.getY());
            if (this.A02 || abs > abs2) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A052 = AnonymousClass0Z0.A05(-1542521501);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                A00(motionEvent);
                if (this.A02) {
                    onTouchEvent = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    i = -1880111144;
                }
            }
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -562577372;
        } else {
            this.A00 = motionEvent.getX();
            this.A01 = motionEvent.getY();
            this.A02 = false;
            this.A03 = false;
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -562577372;
        }
        AnonymousClass0Z0.A0C(i, A052);
        return onTouchEvent;
    }

    public void setXDraggingAngleRange(int i) {
        this.A04 = i;
    }

    public SwipeRefreshWithHScrollLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SwipeRefreshWithHScrollLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = 85;
        this.A05 = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
