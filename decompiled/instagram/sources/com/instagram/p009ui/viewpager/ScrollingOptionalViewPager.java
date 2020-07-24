package com.instagram.p009ui.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass3DH;

/* renamed from: com.instagram.ui.viewpager.ScrollingOptionalViewPager */
public class ScrollingOptionalViewPager extends AnonymousClass3DH {
    public boolean A00 = true;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A00) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void setCurrentItem(int i) {
        if (this.A00) {
            super.setCurrentItem(i);
        } else {
            A0I(i, false);
        }
    }

    public boolean getScrollingEnabled() {
        return this.A00;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int A05 = AnonymousClass0Z0.A05(-23641839);
        if (this.A00) {
            z = super.onTouchEvent(motionEvent);
            i = -1181352443;
        } else {
            z = false;
            i = -1975381279;
        }
        AnonymousClass0Z0.A0C(i, A05);
        return z;
    }

    public void setScrollingEnabled(boolean z) {
        this.A00 = z;
    }

    public ScrollingOptionalViewPager(Context context) {
        super(context);
    }

    public ScrollingOptionalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
