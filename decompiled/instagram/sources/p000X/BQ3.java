package p000X;

import android.net.TrafficStats;

/* renamed from: X.BQ3 */
public final class BQ3 implements C25584BQq {
    public final /* synthetic */ C25577BQj A00;

    public BQ3(C25577BQj bQj) {
        this.A00 = bQj;
    }

    public final C25521BOf ADg() {
        C25577BQj bQj = this.A00;
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        return bQj.A04(totalRxBytes - (totalRxBytes % 1048576));
    }
}
