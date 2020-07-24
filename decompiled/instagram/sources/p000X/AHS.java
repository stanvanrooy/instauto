package p000X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.AHS */
public final class AHS implements View.OnTouchListener {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ AH7 A01;

    public AHS(AH7 ah7, Rect rect) {
        this.A01 = ah7;
        this.A00 = rect;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 4) {
            return false;
        }
        if (this.A00.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return true;
        }
        this.A01.AcV();
        return true;
    }
}
