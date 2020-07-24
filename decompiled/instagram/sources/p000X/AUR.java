package p000X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.AUR */
public final class AUR implements View.OnTouchListener {
    public final /* synthetic */ C24084Ahg A00;

    public AUR(C24084Ahg ahg) {
        this.A00 = ahg;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C24084Ahg ahg = this.A00;
        if (ahg.A00 == null) {
            ahg.A00 = new AUJ(ahg.getActivity(), ahg, ahg.getDialog().getWindow().getDecorView());
        }
        return ahg.A00.onTouch(view, motionEvent);
    }
}
