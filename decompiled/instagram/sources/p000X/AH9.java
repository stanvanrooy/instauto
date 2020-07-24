package p000X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.AH9 */
public final class AH9 extends C23272AFq {
    public int A00 = 0;

    public AH9() {
        this.A00 = 8388627;
    }

    public AH9(C23272AFq aFq) {
        super(aFq);
    }

    public AH9(AH9 ah9) {
        super((C23272AFq) ah9);
        this.A00 = ah9.A00;
    }

    public AH9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AH9(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AH9(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super((ViewGroup.LayoutParams) marginLayoutParams);
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }
}
