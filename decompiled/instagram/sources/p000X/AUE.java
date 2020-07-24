package p000X;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.AUE */
public final class AUE {
    public int A00;
    public View A01;
    public FrameLayout.LayoutParams A02;

    public AUE(Activity activity) {
        View childAt = ((FrameLayout) activity.findViewById(16908290)).getChildAt(0);
        this.A01 = childAt;
        if (childAt != null) {
            childAt.getViewTreeObserver().addOnGlobalLayoutListener(new AUF(this));
            this.A02 = (FrameLayout.LayoutParams) this.A01.getLayoutParams();
        }
    }
}
