package p000X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.C7F */
public final class C7F extends AnonymousClass1YC {
    public final /* synthetic */ Bl2 A00;

    public C7F(Bl2 bl2) {
        this.A00 = bl2;
    }

    public final boolean A06(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            Bl2 bl2 = this.A00;
            if (bl2.A00) {
                bl2.cancel();
                return true;
            }
        }
        return super.A06(view, i, bundle);
    }

    public final void A05(View view, C49532Cp r4) {
        boolean z;
        super.A05(view, r4);
        if (this.A00.A00) {
            r4.A06(1048576);
            z = true;
        } else {
            z = false;
        }
        r4.A02.setDismissable(z);
    }
}
