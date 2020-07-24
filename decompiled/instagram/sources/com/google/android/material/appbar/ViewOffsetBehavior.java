package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000X.AnonymousClass3AY;

public class ViewOffsetBehavior extends CoordinatorLayout.Behavior {
    public int A00 = 0;
    public AnonymousClass3AY A01;

    public int A0O() {
        AnonymousClass3AY r0 = this.A01;
        if (r0 != null) {
            return r0.A02;
        }
        return 0;
    }

    public boolean A0Q(int i) {
        AnonymousClass3AY r0 = this.A01;
        if (r0 != null) {
            return r0.A01(i);
        }
        this.A00 = i;
        return false;
    }

    public boolean A0M(CoordinatorLayout coordinatorLayout, View view, int i) {
        A0P(coordinatorLayout, view, i);
        if (this.A01 == null) {
            this.A01 = new AnonymousClass3AY(view);
        }
        AnonymousClass3AY r1 = this.A01;
        r1.A01 = r1.A03.getTop();
        r1.A00 = r1.A03.getLeft();
        AnonymousClass3AY.A00(r1);
        int i2 = this.A00;
        if (i2 == 0) {
            return true;
        }
        this.A01.A01(i2);
        this.A00 = 0;
        return true;
    }

    public void A0P(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.A0F(view, i);
    }

    public ViewOffsetBehavior() {
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
