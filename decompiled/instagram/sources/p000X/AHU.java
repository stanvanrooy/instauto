package p000X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.AHU */
public final class AHU implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AH4 A00;

    public final void onViewAttachedToWindow(View view) {
    }

    public AHU(AH4 ah4) {
        this.A00 = ah4;
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.A00.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A00.A04 = view.getViewTreeObserver();
            }
            AH4 ah4 = this.A00;
            ah4.A04.removeGlobalOnLayoutListener(ah4.A0D);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
