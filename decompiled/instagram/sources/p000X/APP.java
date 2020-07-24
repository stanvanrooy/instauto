package p000X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.APP */
public final class APP extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ APQ A00;

    public APP(APQ apq) {
        this.A00 = apq;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return !this.A00.A03.A0H.A0Q();
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f2) <= Math.abs(f)) {
            return false;
        }
        if (motionEvent2.getRawY() >= motionEvent.getRawY()) {
            return true;
        }
        APQ apq = this.A00;
        C2103495h r2 = apq.A03;
        if (r2.A0H.A0Q()) {
            return true;
        }
        C2103495h.A01(r2, r2.A09, apq.A01, apq.A07, apq.A05, apq.A08, apq.A02, apq.A06, apq.A04);
        return true;
    }
}
