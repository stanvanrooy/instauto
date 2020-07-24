package p000X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.CWM */
public class CWM extends CWO {
    private void A00(AnonymousClass1EG r16) {
        View view = this.A02;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) C27181Gu.A01(r16.A00(), 0.0d, 1.0d, (double) this.A00, (double) this.A01);
        view.setLayoutParams(layoutParams);
    }

    public void BOH(AnonymousClass1EG r1) {
        A00(r1);
    }

    public final void BOK(AnonymousClass1EG r1) {
        A00(r1);
    }

    public CWM(ViewGroup viewGroup, View view, float f, float f2) {
        super(viewGroup, view, f, f2);
    }
}
