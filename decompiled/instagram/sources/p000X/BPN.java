package p000X;

import android.telephony.TelephonyManager;

/* renamed from: X.BPN */
public final class BPN implements C25584BQq {
    public final /* synthetic */ C25526BOk A00;

    public BPN(C25526BOk bOk) {
        this.A00 = bOk;
    }

    public final C25521BOf ADg() {
        C25526BOk bOk = this.A00;
        TelephonyManager telephonyManager = bOk.A00;
        if (telephonyManager != null) {
            return bOk.A06(telephonyManager.getNetworkOperatorName());
        }
        return bOk.A05(Constants.A0C);
    }
}
