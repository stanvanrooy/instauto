package p000X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.1lN  reason: invalid class name and case insensitive filesystem */
public abstract class C38501lN extends GestureDetector.SimpleOnGestureListener {
    public int A00;
    public boolean A01;

    public void A00(MotionEvent motionEvent) {
    }

    public void A01(MotionEvent motionEvent) {
    }

    public boolean A02() {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.A01 = false;
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        if (A02()) {
            int i = this.A00 + 1;
            this.A00 = i;
            if (i == 3) {
                A00(motionEvent);
                this.A00 = 0;
                this.A01 = true;
                return true;
            }
        }
        A01(motionEvent);
        this.A01 = true;
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.A01 || motionEvent.getEventTime() - motionEvent.getDownTime() <= ((long) ViewConfiguration.getDoubleTapTimeout())) {
            return false;
        }
        A01(motionEvent);
        this.A01 = true;
        return true;
    }
}
