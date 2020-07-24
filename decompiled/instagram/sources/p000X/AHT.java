package p000X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.AHT */
public final class AHT implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AH3 A00;

    public final void onViewAttachedToWindow(View view) {
    }

    public AHT(AH3 ah3) {
        this.A00 = ah3;
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.A00.A00;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A00.A00 = view.getViewTreeObserver();
            }
            AH3 ah3 = this.A00;
            ah3.A00.removeGlobalOnLayoutListener(ah3.A0G);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
