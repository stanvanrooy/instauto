package p000X;

import android.app.ActivityManager;

/* renamed from: X.BPB */
public final class BPB implements C25584BQq {
    public final /* synthetic */ BPP A00;

    public BPB(BPP bpp) {
        this.A00 = bpp;
    }

    public final C25521BOf ADg() {
        BPP bpp = this.A00;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = bpp.A01;
        if (runningAppProcessInfo != null) {
            return bpp.A06(runningAppProcessInfo.processName);
        }
        return bpp.A05(Constants.A0C);
    }
}
