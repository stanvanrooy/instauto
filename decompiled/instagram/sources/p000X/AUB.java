package p000X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* renamed from: X.AUB */
public final class AUB {
    public int A00 = 0;
    public View A01;
    public ViewGroup A02;
    public ViewTreeObserver A03;
    public FrameLayout.LayoutParams A04;
    public final Rect A05 = new Rect();
    public final ViewTreeObserver.OnGlobalLayoutListener A06 = new AUC(this);

    public AUB(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        this.A02 = viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.A01 = childAt;
        this.A04 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
    }
}
