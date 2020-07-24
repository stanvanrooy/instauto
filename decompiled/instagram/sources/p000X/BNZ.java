package p000X;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: X.BNZ */
public final class BNZ implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BNZ(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        PackageInfo packageInfo = bng.A01;
        if (packageInfo == null) {
            return bng.A05(Constants.A0C);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return bng.A04(packageInfo.getLongVersionCode());
        }
        return bng.A03(packageInfo.versionCode);
    }
}
