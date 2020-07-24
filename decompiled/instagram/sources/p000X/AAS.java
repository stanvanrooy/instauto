package p000X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.AAS */
public final class AAS implements View.OnTouchListener {
    public final /* synthetic */ C23965AeQ A00;

    public AAS(C23965AeQ aeQ) {
        this.A00 = aeQ;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }
}
