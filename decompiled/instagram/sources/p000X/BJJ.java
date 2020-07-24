package p000X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.BJJ */
public final class BJJ implements BKi {
    public final /* synthetic */ BJA A00;

    public BJJ(BJA bja) {
        this.A00 = bja;
    }

    public final void BIm(ConnectionResult connectionResult) {
        if (connectionResult.A02()) {
            BJA bja = this.A00;
            bja.AU4((IAccountAccessor) null, bja.A08());
            return;
        }
        C25442BKh bKh = this.A00.A0H;
        if (bKh != null) {
            bKh.Ay4(connectionResult);
        }
    }
}
