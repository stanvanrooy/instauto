package p000X;

import android.content.pm.PackageManager;

/* renamed from: X.BNV */
public final class BNV implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BNV(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        PackageManager packageManager = bng.A02;
        if (packageManager != null) {
            return bng.A06(packageManager.getInstallerPackageName(bng.A00.getPackageName()));
        }
        return bng.A05(Constants.A0C);
    }
}
