package p000X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.AHQ */
public final class AHQ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AH4 A00;

    public AHQ(AH4 ah4) {
        this.A00 = ah4;
    }

    public final void onGlobalLayout() {
        if (this.A00.Ahh()) {
            AH4 ah4 = this.A00;
            if (!ah4.A0G.A0E) {
                View view = ah4.A03;
                if (view == null || !view.isShown()) {
                    this.A00.dismiss();
                } else {
                    this.A00.A0G.show();
                }
            }
        }
    }
}
