package p000X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.AUC */
public final class AUC implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AUB A00;

    public AUC(AUB aub) {
        this.A00 = aub;
    }

    public final void onGlobalLayout() {
        AUB aub = this.A00;
        aub.A02.getWindowVisibleDisplayFrame(aub.A05);
        int height = aub.A05.height();
        if (height != aub.A00) {
            aub.A04.height = height;
            View view = aub.A01;
            Rect rect = aub.A05;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
            aub.A01.requestLayout();
            aub.A00 = height;
        }
    }
}
