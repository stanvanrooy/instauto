package p000X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* renamed from: X.AUF */
public final class AUF implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AUE A00;

    public AUF(AUE aue) {
        this.A00 = aue;
    }

    public final void onGlobalLayout() {
        AUE aue = this.A00;
        Rect rect = new Rect();
        aue.A01.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom - rect.top;
        if (i != aue.A00) {
            int height = aue.A01.getRootView().getHeight();
            int i2 = height - i;
            if (i2 > (height >> 2)) {
                aue.A02.height = height - i2;
            } else {
                aue.A02.height = height;
            }
            aue.A01.requestLayout();
            aue.A00 = i;
        }
    }
}
