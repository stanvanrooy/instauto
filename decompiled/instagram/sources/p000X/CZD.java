package p000X;

import android.view.View;

/* renamed from: X.CZD */
public final class CZD implements View.OnClickListener {
    public final /* synthetic */ CZN A00;

    public CZD(CZN czn) {
        this.A00 = czn;
    }

    public final void onClick(View view) {
        Integer num;
        int A05 = AnonymousClass0Z0.A05(-1076998922);
        CZN czn = this.A00;
        CZ3 cz3 = czn.A00;
        if (C26611Ee.A00(cz3.A0M).A0K(cz3.A05)) {
            num = Constants.ONE;
        } else {
            num = Constants.ZERO;
        }
        CZ3.A04(czn.A00, num);
        CZ3 cz32 = czn.A00;
        C36841ih APu = cz32.APu(cz32.A05);
        boolean z = false;
        if (num == Constants.ONE) {
            z = true;
        }
        APu.A0P(z, false, true);
        CZ3.A02(czn.A00);
        AnonymousClass0Z0.A0C(1632391634, A05);
    }
}
