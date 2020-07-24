package com.instagram.p009ui.recyclerpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.p009ui.layoutmanager.BetterLinearLayoutManager;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1ZN;
import p000X.C06400Ox;
import p000X.C31321Xp;

/* renamed from: com.instagram.ui.recyclerpager.HorizontalRecyclerPager */
public class HorizontalRecyclerPager extends RecyclerView {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03 = 0;
    public boolean A04 = false;
    public boolean A05;

    public final boolean A14(int i, int i2) {
        this.A03 = i;
        return true;
    }

    public final void A17() {
        int right;
        int i;
        boolean z = this.A05;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A0L;
        View A0Z = linearLayoutManager.A0Z(linearLayoutManager.A1i());
        if (A0Z != null) {
            if (z) {
                right = A0Z.getLeft() - ((AnonymousClass1ZN) A0Z.getLayoutParams()).A03.left;
            } else {
                right = A0Z.getRight() + ((AnonymousClass1ZN) A0Z.getLayoutParams()).A03.right;
            }
            if (z) {
                i = (right - getWidth()) + this.A02;
            } else {
                i = right - this.A02;
            }
            A0l(i, 0);
        }
    }

    private void A03() {
        this.A05 = C06400Ox.A02(getContext());
        getContext();
        setLayoutManager(new BetterLinearLayoutManager());
        setHasFixedSize(true);
        setItemAnimator(new C31321Xp());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int A052 = AnonymousClass0Z0.A05(1078189374);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A03 = 0;
        } else if (action == 1) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A0L;
            View A0Z = linearLayoutManager.A0Z(linearLayoutManager.A1g());
            if (A0Z != null) {
                int right = A0Z.getRight() + ((AnonymousClass1ZN) A0Z.getLayoutParams()).A03.right;
                int left = A0Z.getLeft() - ((AnonymousClass1ZN) A0Z.getLayoutParams()).A03.left;
                int measuredWidth = (getMeasuredWidth() - A0Z.getMeasuredWidth()) >> 1;
                int i3 = this.A01;
                int i4 = this.A02;
                int i5 = measuredWidth - (i3 + i4);
                if (!this.A04) {
                    i5 = 0;
                }
                int i6 = this.A03;
                if (i6 > 0 || (i6 == 0 && Math.abs(right) < Math.abs(left))) {
                    if (this.A05) {
                        i = (right - getWidth()) + this.A00 + this.A02;
                    } else {
                        i = (right + this.A00) - i4;
                    }
                    A0l(i - i5, 0);
                } else {
                    if (this.A05) {
                        i2 = ((left - getWidth()) - this.A00) + this.A02;
                    } else {
                        i2 = (left - this.A00) - i4;
                    }
                    A0l(i2 - i5, 0);
                    if (this.A0B == 1) {
                        A0d();
                    }
                }
            }
        }
        AnonymousClass0Z0.A0C(-96762475, A052);
        return onTouchEvent;
    }

    public void setExtraScroll(int i) {
        this.A00 = i;
    }

    public void setHorizontalPeekOffset(int i) {
        this.A02 = i;
    }

    public HorizontalRecyclerPager(Context context) {
        super(context);
        A03();
    }

    public HorizontalRecyclerPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }

    public HorizontalRecyclerPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }
}
