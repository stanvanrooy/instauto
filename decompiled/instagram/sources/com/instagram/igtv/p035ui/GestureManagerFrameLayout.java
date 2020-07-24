package com.instagram.igtv.p035ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import p000X.AnonymousClass0Z0;
import p000X.C163186xj;
import p000X.C163206xm;

/* renamed from: com.instagram.igtv.ui.GestureManagerFrameLayout */
public class GestureManagerFrameLayout extends FrameLayout {
    public C163186xj A00;
    public boolean A01;
    public boolean A02;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean A002 = this.A00.A00(true, motionEvent);
        this.A02 = A002;
        return A002;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.A01 = z;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getActionMasked() == 0) {
            this.A01 = false;
            this.A02 = false;
        }
        if (super.dispatchTouchEvent(motionEvent) || this.A02) {
            z = true;
        }
        for (C163206xm r1 : this.A00.A02) {
            if (r1.isEnabled()) {
                r1.AqJ(motionEvent, z);
            }
        }
        return z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0Z0.A05(-1474436906);
        boolean A002 = this.A00.A00(false, motionEvent);
        this.A02 = A002;
        AnonymousClass0Z0.A0C(-1837881433, A05);
        return A002;
    }

    public void setGestureManager(C163186xj r1) {
        this.A00 = r1;
    }

    public GestureManagerFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public GestureManagerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureManagerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
