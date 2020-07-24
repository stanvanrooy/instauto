package com.instagram.p009ui.widget.nestablescrollingview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import p000X.AnonymousClass0Z0;
import p000X.C712939w;

/* renamed from: com.instagram.ui.widget.nestablescrollingview.NestableViewPager */
public class NestableViewPager extends ViewPager {
    public C712939w A00 = new C712939w(this);
    public boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r3 == false) goto L_0x0007;
     */
    public final void A0I(int i, boolean z) {
        boolean z2;
        if (!this.A01) {
            z2 = true;
        }
        z2 = false;
        super.A0I(i, z2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        this.A00.A00(motionEvent, getParent(), true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setCurrentItem(int i) {
        if (this.A01) {
            A0I(i, false);
        } else {
            super.setCurrentItem(i);
        }
    }

    public void setPassThroughEdge(int i) {
        this.A00.A00 = i;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A05 = AnonymousClass0Z0.A05(141079147);
        if (this.A01) {
            onTouchEvent = false;
            i = 1948225680;
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -907873473;
        }
        AnonymousClass0Z0.A0C(i, A05);
        return onTouchEvent;
    }

    public void setSwipingDisabled(boolean z) {
        this.A01 = z;
    }

    public NestableViewPager(Context context) {
        super(context);
    }

    public NestableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
