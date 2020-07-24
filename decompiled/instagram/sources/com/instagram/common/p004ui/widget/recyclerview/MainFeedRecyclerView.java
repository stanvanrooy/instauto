package com.instagram.common.p004ui.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import p000X.C46101z8;

/* renamed from: com.instagram.common.ui.widget.recyclerview.MainFeedRecyclerView */
public class MainFeedRecyclerView extends RecyclerView {
    public double A00 = 1.0d;
    public C46101z8 A01;

    public final boolean A14(int i, int i2) {
        OverScroller overScroller;
        int i3;
        int i4 = (int) (((double) i2) * this.A00);
        C46101z8 r6 = this.A01;
        if (r6 != null) {
            int i5 = r6.A00;
            r6.A00 = i4;
            if (Math.abs(i4 << 1) >= Math.abs(i5) && Math.signum((float) i4) == Math.signum((float) i5) && System.currentTimeMillis() - r6.A01 <= ((long) r6.A02) && (overScroller = r6.A03.A0Q.A03) != null) {
                int currVelocity = (int) overScroller.getCurrVelocity();
                if (i4 > 0) {
                    i3 = currVelocity + i4;
                } else {
                    i3 = i4 - currVelocity;
                }
                i4 = i3;
            }
        }
        return super.A14(i, i4);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C46101z8 r2 = this.A01;
        if (r2 != null && motionEvent.getAction() == 0) {
            r2.A01 = System.currentTimeMillis();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setCustomFlingVelocityFactor(double d) {
        this.A00 = d;
    }

    public MainFeedRecyclerView(Context context) {
        super(context);
    }

    public MainFeedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MainFeedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
