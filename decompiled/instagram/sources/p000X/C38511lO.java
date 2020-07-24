package p000X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1lO  reason: invalid class name and case insensitive filesystem */
public final class C38511lO implements ScaleGestureDetector.OnScaleGestureListener {
    public final ScaleGestureDetector A00;
    public final Set A01 = new HashSet();

    public final void A00(C29831Rk r2) {
        this.A01.add(r2);
    }

    public final boolean A01(MotionEvent motionEvent) {
        return this.A00.onTouchEvent(motionEvent);
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        Iterator it = this.A01.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (((C29831Rk) it.next()).BKu(this) || z) {
                    z = true;
                }
            }
        }
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        Iterator it = this.A01.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (((C29831Rk) it.next()).BKx(this) || z) {
                    z = true;
                }
            }
        }
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        for (C29831Rk BL0 : this.A01) {
            BL0.BL0(this);
        }
    }

    public C38511lO(Context context) {
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.A00 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }
}
