package p000X;

import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.BOV */
public final class BOV implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BOV(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        if (Build.VERSION.SDK_INT < 26) {
            return this.A00.A05(Constants.A0N);
        }
        BNG bng = this.A00;
        PackageManager packageManager = bng.A02;
        if (packageManager != null) {
            return bng.A09(packageManager.canRequestPackageInstalls());
        }
        return bng.A05(Constants.A0C);
    }
}
