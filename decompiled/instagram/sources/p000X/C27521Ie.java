package p000X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.1Ie  reason: invalid class name and case insensitive filesystem */
public final class C27521Ie implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C27501Ic A00;

    public C27521Ie(C27501Ic r1) {
        this.A00 = r1;
    }

    public final void onGlobalLayout() {
        int height;
        C27501Ic r0 = this.A00;
        View view = r0.A04;
        if (view != null) {
            view.getLocationOnScreen(r0.A0B);
            C27501Ic r1 = this.A00;
            if (r1.A05) {
                height = r1.A04.getHeight() - this.A00.A00;
            } else {
                height = r1.A04.getHeight();
            }
            C27501Ic r4 = this.A00;
            int i = r4.A0B[1] + height;
            int i2 = r4.A03;
            if (i2 == -1) {
                r4.A03 = i;
                r4.A01 = i;
                r4.A02 = height;
                if (!r4.A0A.isEmpty()) {
                    C27501Ic.A01(r4, 0);
                    return;
                }
                return;
            }
            if (!(r4.A01 == i || r4.A02 == height)) {
                if (i2 < i) {
                    r4.A03 = i;
                }
                int max = Math.max(r4.A03 - i, 0);
                if (!r4.A0A.isEmpty()) {
                    C27501Ic.A01(r4, max);
                }
            }
            r4.A01 = i;
            r4.A02 = height;
        }
    }
}
