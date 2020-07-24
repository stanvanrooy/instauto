package p000X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.AUQ */
public final class AUQ implements View.OnTouchListener {
    public final /* synthetic */ C24080Ahb A00;

    public AUQ(C24080Ahb ahb) {
        this.A00 = ahb;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C24080Ahb ahb = this.A00;
        if (ahb.A00 == null) {
            ahb.A00 = new AUJ(ahb.getActivity(), ahb, ahb.getDialog().getWindow().getDecorView());
        }
        return ahb.A00.onTouch(view, motionEvent);
    }
}
