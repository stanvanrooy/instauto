package p000X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.ADX */
public final class ADX {
    public static void A00(C23213ADb aDb, Object obj, boolean z) {
        Rect rect = new Rect();
        Rect rect2 = aDb.A02;
        int i = rect2.left - 0;
        rect.left = i;
        int i2 = rect2.top - 0;
        rect.top = i2;
        int i3 = rect2.right - 0;
        rect.right = i3;
        int i4 = rect2.bottom - 0;
        rect.bottom = i4;
        Rect rect3 = aDb.A03;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        if (obj instanceof View) {
            View view = (View) obj;
            int i8 = i3 - i;
            int i9 = i4 - i2;
            if (rect3 != null && !(view instanceof C23214ADc)) {
                view.setPadding(rect3.left, rect3.top, rect3.right, rect3.bottom);
            }
            if (!(!z && view.getMeasuredHeight() == i9 && view.getMeasuredWidth() == i8)) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8, C25913Bc3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(i9, C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
            }
            if (z || view.getLeft() != i || view.getTop() != i2 || view.getRight() != i3 || view.getBottom() != i4) {
                view.layout(i, i2, i3, i4);
            }
        } else if (obj instanceof Drawable) {
            if (rect3 != null) {
                i5 = i + rect3.left;
                i6 = i2 + rect3.top;
                i7 = i3 - rect3.right;
                i4 -= rect3.bottom;
            }
            ((Drawable) obj).setBounds(i5, i6, i7, i4);
        } else {
            throw new IllegalStateException("Unsupported mounted content " + obj);
        }
    }
}
