package p000X;

import android.content.pm.PackageManager;

/* renamed from: X.BOW */
public final class BOW implements C25584BQq {
    public final /* synthetic */ BNG A00;

    public BOW(BNG bng) {
        this.A00 = bng;
    }

    public final C25521BOf ADg() {
        BNG bng = this.A00;
        PackageManager packageManager = bng.A02;
        if (packageManager != null) {
            return bng.A09(packageManager.isSafeMode());
        }
        return bng.A05(Constants.A0C);
    }
}
