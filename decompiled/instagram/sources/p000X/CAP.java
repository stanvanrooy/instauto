package p000X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.CAP */
public final class CAP implements View.OnTouchListener {
    public final /* synthetic */ CAM A00;

    public CAP(CAM cam) {
        this.A00 = cam;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass1ZK A0O;
        if (((GridLayoutManager) this.A00.A04.A0L).A1g() > 0 || (A0O = this.A00.A04.A0O(0)) == null) {
            return false;
        }
        if (motionEvent.getY() >= ((float) A0O.itemView.getTop()) || !this.A00.A05.APn().dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
