package com.instagram.p009ui.layoutmanager;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AutoMeasureLinearLayoutManager;
import p000X.AnonymousClass1Xv;
import p000X.AnonymousClass1ZN;
import p000X.C31291Xl;

/* renamed from: com.instagram.ui.layoutmanager.BetterLinearLayoutManager */
public class BetterLinearLayoutManager extends AutoMeasureLinearLayoutManager {
    public BetterLinearLayoutManager() {
        A0w(false);
    }

    public final void A0r(C31291Xl r15, AnonymousClass1Xv r16, int i, int i2) {
        int i3;
        int i4;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (r16.A00() > 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int[] iArr = {0, 0};
            View view = r15.A02(0, Long.MAX_VALUE).itemView;
            if (view != null) {
                AnonymousClass1ZN r9 = (AnonymousClass1ZN) view.getLayoutParams();
                view.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, A0P() + A0Q(), r9.width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, A0U() + A0T(), r9.height));
                iArr[0] = view.getMeasuredWidth();
                iArr[1] = view.getMeasuredHeight();
                r15.A06(view);
            }
            i4 = iArr[0];
            i3 = iArr[1];
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (mode == 1073741824) {
            i4 = size;
        }
        if (mode2 == 1073741824) {
            i3 = size2;
        }
        this.A0A.setMeasuredDimension(i4, i3);
    }
}
