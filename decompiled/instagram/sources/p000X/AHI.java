package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.AHI */
public final class AHI extends AH2 {
    public final /* synthetic */ C23296AGw A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AHI(C23296AGw aGw, Context context, C54042Vn r10, View view) {
        super(context, r10, view, true, C0003R.attr.actionOverflowMenuStyle, 0);
        this.A00 = aGw;
        this.A00 = 8388613;
        A04(aGw.A0D);
    }

    public final void A02() {
        C54042Vn r0 = this.A00.A03;
        if (r0 != null) {
            r0.close();
        }
        this.A00.A07 = null;
        super.A02();
    }
}
