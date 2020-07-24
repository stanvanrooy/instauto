package p000X;

import android.app.ActivityManager;

/* renamed from: X.BPC */
public final class BPC implements C25584BQq {
    public final /* synthetic */ BPP A00;

    public BPC(BPP bpp) {
        this.A00 = bpp;
    }

    public final C25521BOf ADg() {
        BPP bpp = this.A00;
        if (bpp.A02 != null) {
            return bpp.A09(ActivityManager.isRunningInTestHarness());
        }
        return bpp.A05(Constants.A0C);
    }
}
