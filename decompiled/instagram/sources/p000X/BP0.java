package p000X;

import android.app.ActivityManager;

/* renamed from: X.BP0 */
public final class BP0 implements C25584BQq {
    public final /* synthetic */ BPP A00;

    public BP0(BPP bpp) {
        this.A00 = bpp;
    }

    public final C25521BOf ADg() {
        BPP bpp = this.A00;
        if (bpp.A02 == null) {
            return bpp.A05(Constants.A0C);
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.A00.A02.getMemoryInfo(memoryInfo);
        return this.A00.A04(memoryInfo.totalMem / 1048576);
    }
}
