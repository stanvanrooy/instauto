package p000X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.AIN */
public final class AIN implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AIM A00;

    public AIN(AIM aim) {
        this.A00 = aim;
    }

    public final void onGlobalLayout() {
        AIM aim = this.A00;
        View view = aim.A03;
        if (view != null) {
            view.getLocationOnScreen(aim.A09);
            AIM aim2 = this.A00;
            int height = aim2.A03.getHeight();
            int i = this.A00.A09[1] + height;
            int i2 = aim2.A02;
            if (i2 == -1) {
                aim2.A02 = i;
                aim2.A00 = i;
                aim2.A01 = height;
                if (!aim2.A08.isEmpty()) {
                    AIM.A00(aim2, 0);
                    return;
                }
                return;
            }
            if (!(aim2.A00 == i || aim2.A01 == height)) {
                if (i2 < i) {
                    aim2.A02 = i;
                }
                int max = Math.max(aim2.A02 - i, 0);
                if (!aim2.A08.isEmpty()) {
                    AIM.A00(aim2, max);
                }
            }
            aim2.A00 = i;
            aim2.A01 = height;
        }
    }
}
