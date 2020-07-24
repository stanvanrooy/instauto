package p000X;

import android.content.pm.PackageInfo;

/* renamed from: X.BO0 */
public final class BO0 implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BO0(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        PackageInfo packageInfo = bng.A01;
        if (packageInfo != null) {
            return bng.A04(packageInfo.lastUpdateTime);
        }
        return bng.A05(Constants.A0C);
    }
}
