package p000X;

import android.net.TrafficStats;

/* renamed from: X.BQ2 */
public final class BQ2 implements C25584BQq {
    public final /* synthetic */ C25577BQj A00;

    public BQ2(C25577BQj bQj) {
        this.A00 = bQj;
    }

    public final C25521BOf ADg() {
        C25577BQj bQj = this.A00;
        long mobileTxBytes = TrafficStats.getMobileTxBytes();
        return bQj.A04(mobileTxBytes - (mobileTxBytes % 1048576));
    }
}
