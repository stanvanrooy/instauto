package p000X;

import android.net.TrafficStats;

/* renamed from: X.BQ4 */
public final class BQ4 implements C25584BQq {
    public final /* synthetic */ C25577BQj A00;

    public BQ4(C25577BQj bQj) {
        this.A00 = bQj;
    }

    public final C25521BOf ADg() {
        C25577BQj bQj = this.A00;
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        return bQj.A04(totalTxBytes - (totalTxBytes % 1048576));
    }
}
