package p000X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.instagram.tagging.search.BusinessPartnerTagSearchFragment;

/* renamed from: X.AXU */
public final class AXU implements ViewTreeObserver.OnGlobalLayoutListener {
    public final Rect A00 = new Rect();
    public final /* synthetic */ BusinessPartnerTagSearchFragment A01;

    public AXU(BusinessPartnerTagSearchFragment businessPartnerTagSearchFragment) {
        this.A01 = businessPartnerTagSearchFragment;
    }

    public final void onGlobalLayout() {
        int height = this.A00.height();
        this.A01.A00.getWindowVisibleDisplayFrame(this.A00);
        if (height != this.A00.height()) {
            this.A01.A00.getLayoutParams().height = this.A00.height();
            this.A01.A00.requestLayout();
        }
    }
}
