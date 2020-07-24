package p000X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.AHC */
public final class AHC implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AH3 A00;

    public AHC(AH3 ah3) {
        this.A00 = ah3;
    }

    public final void onGlobalLayout() {
        if (this.A00.Ahh() && this.A00.A0M.size() > 0 && !((C23314AHp) this.A00.A0M.get(0)).A02.A0E) {
            View view = this.A00.A08;
            if (view == null || !view.isShown()) {
                this.A00.dismiss();
                return;
            }
            for (C23314AHp aHp : this.A00.A0M) {
                aHp.A02.show();
            }
        }
    }
}
