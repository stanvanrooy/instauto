package p000X;

import android.net.TrafficStats;

/* renamed from: X.BQ1 */
public final class BQ1 implements C25584BQq {
    public final /* synthetic */ C25577BQj A00;

    public BQ1(C25577BQj bQj) {
        this.A00 = bQj;
    }

    public final C25521BOf ADg() {
        C25577BQj bQj = this.A00;
        long mobileRxBytes = TrafficStats.getMobileRxBytes();
        return bQj.A04(mobileRxBytes - (mobileRxBytes % 1048576));
    }
}
