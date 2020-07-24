package p000X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.DT4 */
public final class DT4 extends GestureDetector.SimpleOnGestureListener implements C29831Rk {
    public final /* synthetic */ C30152DSz A00;

    public final boolean BKu(C38511lO r2) {
        return true;
    }

    public DT4(C30152DSz dSz) {
        this.A00 = dSz;
    }

    public final boolean BKx(C38511lO r2) {
        this.A00.A05.BKv(r2);
        return true;
    }

    public final void BL0(C38511lO r2) {
        this.A00.A05.BL0(r2);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C30152DSz.A00(this.A00);
        this.A00.A05.B0a(motionEvent);
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C30152DSz.A00(this.A00);
        this.A00.A05.BNa(motionEvent);
        return true;
    }
}
