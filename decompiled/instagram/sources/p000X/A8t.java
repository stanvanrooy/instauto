package p000X;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.A8t */
public final class A8t implements A6F {
    public ViewParent A00;
    public volatile int A01 = -1;

    public final void A00(int i, ViewParent viewParent) {
        this.A01 = i;
        ViewParent viewParent2 = this.A00;
        if (viewParent2 != null) {
            viewParent2.requestDisallowInterceptTouchEvent(false);
            this.A00 = null;
        }
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.A00 = viewParent;
        }
    }

    public final boolean B7b(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i = this.A01;
        if (i == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i) {
            return false;
        }
        return true;
    }
}
