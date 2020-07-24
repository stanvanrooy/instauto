package p000X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Au3 */
public final class Au3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C24813Aty A01;

    public Au3(C24813Aty aty, View view) {
        this.A01 = aty;
        this.A00 = view;
    }

    public final void onGlobalLayout() {
        int i;
        View A02 = C24813Aty.A02(this.A01);
        C13150hy.A01(A02, "topControlsTray");
        int i2 = 0;
        if (A02.getVisibility() == 0) {
            View A022 = C24813Aty.A02(this.A01);
            C13150hy.A01(A022, "topControlsTray");
            i = A022.getMeasuredHeight();
        } else {
            i = 0;
        }
        View A012 = C24813Aty.A01(this.A01);
        C13150hy.A01(A012, "bottomControlsTray");
        if (A012.getVisibility() == 0) {
            View A013 = C24813Aty.A01(this.A01);
            C13150hy.A01(A013, "bottomControlsTray");
            i2 = A013.getMeasuredHeight();
        }
        C24835AuP auP = this.A01.A00;
        if (auP == null) {
            C13150hy.A03("layoutChangeListener");
        }
        auP.A00.A06.A02(new C24366AmV(i, i2, this.A00.getPaddingTop(), this.A00.getPaddingBottom()));
    }
}
