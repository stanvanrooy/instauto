package com.instagram.igtv.p035ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import p000X.AnonymousClass0Z0;

/* renamed from: com.instagram.igtv.ui.NoSwipeViewPager */
public class NoSwipeViewPager extends ViewPager {
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0Z0.A0C(1704079875, AnonymousClass0Z0.A05(818656670));
        return false;
    }

    public NoSwipeViewPager(Context context) {
        super(context);
    }

    public NoSwipeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
