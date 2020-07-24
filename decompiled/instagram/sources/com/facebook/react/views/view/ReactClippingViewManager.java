package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0FY;
import p000X.C228039ra;
import p000X.C23081A5s;

public abstract class ReactClippingViewManager extends ViewGroupManager {
    @ReactProp(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(C23081A5s a5s, boolean z) {
        C228039ra.A00();
        a5s.setRemoveClippedSubviews(z);
    }

    public void addView(C23081A5s a5s, View view, int i) {
        C228039ra.A00();
        if (a5s.getRemoveClippedSubviews()) {
            AnonymousClass0FY.A02(a5s.A0A);
            AnonymousClass0FY.A00(a5s.A03);
            AnonymousClass0FY.A00(a5s.A0B);
            View[] viewArr = a5s.A0B;
            AnonymousClass0FY.A00(viewArr);
            int i2 = a5s.A00;
            int length = viewArr.length;
            if (i == i2) {
                if (length == i2) {
                    View[] viewArr2 = new View[(length + 12)];
                    a5s.A0B = viewArr2;
                    System.arraycopy(viewArr, 0, viewArr2, 0, length);
                    viewArr = a5s.A0B;
                }
                int i3 = a5s.A00;
                a5s.A00 = i3 + 1;
                viewArr[i3] = view;
            } else if (i < i2) {
                if (length == i2) {
                    View[] viewArr3 = new View[(length + 12)];
                    a5s.A0B = viewArr3;
                    System.arraycopy(viewArr, 0, viewArr3, 0, i);
                    System.arraycopy(viewArr, i, a5s.A0B, i + 1, i2 - i);
                    viewArr = a5s.A0B;
                } else {
                    System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
                }
                viewArr[i] = view;
                a5s.A00++;
            } else {
                throw new IndexOutOfBoundsException(AnonymousClass000.A07("index=", i, " count=", i2));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                if (a5s.A0B[i5].getParent() == null) {
                    i4++;
                }
            }
            C23081A5s.A02(a5s, a5s.A03, i, i4);
            view.addOnLayoutChangeListener(a5s.A07);
            return;
        }
        a5s.addView(view, i);
    }

    public View getChildAt(C23081A5s a5s, int i) {
        if (!a5s.getRemoveClippedSubviews()) {
            return a5s.getChildAt(i);
        }
        View[] viewArr = a5s.A0B;
        AnonymousClass0FY.A00(viewArr);
        return viewArr[i];
    }

    public int getChildCount(C23081A5s a5s) {
        if (a5s.getRemoveClippedSubviews()) {
            return a5s.A00;
        }
        return a5s.getChildCount();
    }

    public void removeAllViews(C23081A5s a5s) {
        C228039ra.A00();
        if (a5s.getRemoveClippedSubviews()) {
            AnonymousClass0FY.A02(a5s.A0A);
            AnonymousClass0FY.A00(a5s.A0B);
            for (int i = 0; i < a5s.A00; i++) {
                a5s.A0B[i].removeOnLayoutChangeListener(a5s.A07);
            }
            a5s.removeAllViewsInLayout();
            a5s.A00 = 0;
            return;
        }
        a5s.removeAllViews();
    }

    public void removeViewAt(C23081A5s a5s, int i) {
        C228039ra.A00();
        if (a5s.getRemoveClippedSubviews()) {
            View childAt = getChildAt(a5s, i);
            if (childAt.getParent() != null) {
                a5s.removeView(childAt);
            }
            a5s.A07(childAt);
            return;
        }
        a5s.removeViewAt(i);
    }
}
