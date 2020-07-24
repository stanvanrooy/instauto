package p000X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.AHB */
public final class AHB implements View.OnTouchListener {
    public final /* synthetic */ AH5 A00;

    public AHB(AH5 ah5) {
        this.A00 = ah5;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && (popupWindow = this.A00.A0A) != null && popupWindow.isShowing() && x >= 0 && x < this.A00.A0A.getWidth() && y >= 0 && y < this.A00.A0A.getHeight()) {
            AH5 ah5 = this.A00;
            AnonymousClass0ZA.A09(ah5.A0K, ah5.A0L, 250, -318709501);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            AH5 ah52 = this.A00;
            AnonymousClass0ZA.A08(ah52.A0K, ah52.A0L);
            return false;
        }
    }
}
