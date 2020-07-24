package com.instagram.p009ui.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import p000X.AnonymousClass3DH;

/* renamed from: com.instagram.ui.viewpager.BakeOffViewPager */
public class BakeOffViewPager extends AnonymousClass3DH {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A03 = false;
            this.A04 = false;
            this.A00 = motionEvent.getRawX();
            this.A01 = motionEvent.getRawY();
            this.A05 = false;
        } else if (actionMasked == 2) {
            if (!this.A04 && !this.A03) {
                float rawX = this.A00 - motionEvent.getRawX();
                float rawY = this.A01 - motionEvent.getRawY();
                boolean z = false;
                if (Math.sqrt((double) ((rawX * rawX) + (rawY * rawY))) > ((double) this.A02)) {
                    z = true;
                }
                double degrees = Math.toDegrees(Math.atan((double) Math.abs(rawY / rawX)));
                if (z) {
                    if (degrees < 90.0d) {
                        this.A03 = true;
                    } else {
                        this.A04 = true;
                    }
                }
            }
            if (this.A03) {
                if (!this.A05) {
                    this.A05 = true;
                }
            }
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public BakeOffViewPager(Context context) {
        super(context);
    }

    public BakeOffViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = (float) ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }
}
