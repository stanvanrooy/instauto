package p000X;

import android.widget.PopupWindow;

/* renamed from: X.ALK */
public final class ALK implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ALS A00;
    public final /* synthetic */ ALB A01;

    public ALK(ALB alb, ALS als) {
        this.A01 = alb;
        this.A00 = als;
    }

    public final void onDismiss() {
        if (this.A01.A00.A02) {
            this.A00.B7u();
        }
    }
}
