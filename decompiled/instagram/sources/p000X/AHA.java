package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.AHA */
public final class AHA extends AH2 {
    public final /* synthetic */ C23296AGw A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AHA(C23296AGw aGw, Context context, AnonymousClass99K r10, View view) {
        super(context, r10, view, false, C0003R.attr.actionOverflowMenuStyle, 0);
        this.A00 = aGw;
        if (!((AnonymousClass99I) r10.getItem()).A02()) {
            View view2 = aGw.A06;
            this.A01 = view2 == null ? (View) aGw.A05 : view2;
        }
        A04(aGw.A0D);
    }

    public final void A02() {
        this.A00.A03 = null;
        super.A02();
    }
}
