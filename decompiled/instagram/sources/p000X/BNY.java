package p000X;

import android.content.pm.ServiceInfo;

/* renamed from: X.BNY */
public final class BNY implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BNY(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        ServiceInfo[] serviceInfoArr = bng.A05;
        if (serviceInfoArr != null) {
            return bng.A03(serviceInfoArr.length);
        }
        return bng.A05(Constants.A0C);
    }
}
