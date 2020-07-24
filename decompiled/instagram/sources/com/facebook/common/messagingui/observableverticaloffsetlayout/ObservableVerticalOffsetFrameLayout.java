package com.facebook.common.messagingui.observableverticaloffsetlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000X.AnonymousClass3NW;
import p000X.C102754c2;

public class ObservableVerticalOffsetFrameLayout extends FrameLayout implements AnonymousClass3NW {
    public C102754c2 A00;

    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        C102754c2 r0 = this.A00;
        if (r0 != null) {
            r0.BDC();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C102754c2 r0 = this.A00;
        if (r0 != null) {
            r0.BDC();
        }
    }

    public void setOffsetListener(C102754c2 r1) {
        this.A00 = r1;
    }

    public ObservableVerticalOffsetFrameLayout(Context context) {
        super(context);
    }

    public ObservableVerticalOffsetFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableVerticalOffsetFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
