package p000X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.instagram.tagging.search.BusinessPartnerTagSearchFragmentV2;

/* renamed from: X.AXT */
public final class AXT implements ViewTreeObserver.OnGlobalLayoutListener {
    public final Rect A00 = new Rect();
    public final /* synthetic */ BusinessPartnerTagSearchFragmentV2 A01;

    public AXT(BusinessPartnerTagSearchFragmentV2 businessPartnerTagSearchFragmentV2) {
        this.A01 = businessPartnerTagSearchFragmentV2;
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
