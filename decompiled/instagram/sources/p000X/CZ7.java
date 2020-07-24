package p000X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* renamed from: X.CZ7 */
public final class CZ7 implements GestureDetector.OnGestureListener {
    public static final int A05 = (ViewConfiguration.getTapTimeout() << 1);
    public MotionEvent A00;
    public boolean A01;
    public final CZO A02;
    public final CZ4 A03 = new CZ4(new WeakReference(this));
    public final GestureDetector A04;

    public final boolean onDown(MotionEvent motionEvent) {
        this.A01 = true;
        MotionEvent motionEvent2 = this.A00;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.A00 = MotionEvent.obtain(motionEvent);
        AnonymousClass0ZA.A02(this.A03, 0);
        AnonymousClass0ZA.A0C(this.A03, 0, motionEvent.getDownTime() + ((long) A05));
        CZ3 cz3 = this.A02.A00;
        cz3.A0A = Constants.ONE;
        cz3.A02.setVisibility(4);
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void A00(MotionEvent motionEvent) {
        this.A04.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            AnonymousClass0ZA.A02(this.A03, 0);
            if (!this.A01) {
                CZ3 cz3 = this.A02.A00;
                if (cz3.A0A == Constants.A0C) {
                    CZ3.A01(cz3);
                } else {
                    cz3.A08.BS5(motionEvent);
                }
            }
        } else if (actionMasked == 3) {
            AnonymousClass0ZA.A07(this.A03, (Object) null);
            this.A01 = false;
            CZ3 cz32 = this.A02.A00;
            cz32.A0A = Constants.ZERO;
            cz32.A0F.A03(0.0d);
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        CZ3 cz3 = this.A02.A00;
        if (cz3.A0A != Constants.A0N) {
            return false;
        }
        cz3.A08.onScroll(motionEvent, motionEvent2, f, f2);
        return false;
    }

    public CZ7(Context context, CZO czo) {
        AnonymousClass11J.A00(czo);
        this.A02 = czo;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A04 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }
}
