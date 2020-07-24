package p000X;

import android.content.pm.PackageInfo;

/* renamed from: X.BNX */
public final class BNX implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BNX(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        PackageInfo packageInfo = bng.A01;
        if (packageInfo != null) {
            return bng.A06(packageInfo.packageName);
        }
        return bng.A05(Constants.A0C);
    }
}
