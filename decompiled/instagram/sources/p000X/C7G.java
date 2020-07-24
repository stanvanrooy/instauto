package p000X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.C7G */
public final class C7G extends AnonymousClass1YC {
    public final /* synthetic */ C28904Coe A00;

    public C7G(C28904Coe coe) {
        this.A00 = coe;
    }

    public final boolean A06(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.A06(view, i, bundle);
        }
        this.A00.A05(3);
        return true;
    }

    public final void A05(View view, C49532Cp r4) {
        super.A05(view, r4);
        r4.A06(1048576);
        r4.A02.setDismissable(true);
    }
}
