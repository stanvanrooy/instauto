package p000X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.CWX */
public final class CWX implements View.OnTouchListener {
    public final /* synthetic */ CWY A00;

    public CWX(CWY cwy) {
        this.A00 = cwy;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        CWY cwy = this.A00;
        cwy.A02 = true;
        GestureDetector gestureDetector = cwy.A05;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        gestureDetector.onTouchEvent(obtain);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 1 && actionMasked != 3) || !cwy.A04) {
            return true;
        }
        if (!cwy.A03) {
            for (C27914CWc B19 : cwy.A06) {
                B19.B19(cwy, cwy.A00, cwy.A01);
            }
            cwy.A06.clear();
        }
        cwy.A04 = false;
        return true;
    }
}
