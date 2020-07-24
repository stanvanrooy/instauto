package p000X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.CWW */
public final class CWW implements View.OnTouchListener {
    public final /* synthetic */ CWY A00;

    public CWW(CWY cwy) {
        this.A00 = cwy;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.A00.A05;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        return gestureDetector.onTouchEvent(obtain);
    }
}
