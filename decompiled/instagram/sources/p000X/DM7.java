package p000X;

import android.os.Build;
import android.os.Debug;

/* renamed from: X.DM7 */
public final class DM7 implements BTH {
    public final BTN AQG() {
        DM9 dm9 = new DM9();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                dm9.A07 = Debug.getRuntimeStat("art.gc.gc-count-rate-histogram");
                dm9.A06 = Debug.getRuntimeStat("art.gc.blocking-gc-count-rate-histogram");
                String runtimeStat = Debug.getRuntimeStat("art.gc.bytes-allocated");
                if (runtimeStat != null) {
                    dm9.A04 = Long.valueOf(Long.parseLong(runtimeStat));
                }
                String runtimeStat2 = Debug.getRuntimeStat("art.gc.bytes-freed");
                if (runtimeStat2 != null) {
                    dm9.A05 = Long.valueOf(Long.parseLong(runtimeStat2));
                }
                String runtimeStat3 = Debug.getRuntimeStat("art.gc.gc-count");
                if (runtimeStat3 != null) {
                    dm9.A02 = Long.valueOf(Long.parseLong(runtimeStat3));
                }
                String runtimeStat4 = Debug.getRuntimeStat("art.gc.gc-time");
                if (runtimeStat4 != null) {
                    dm9.A03 = Long.valueOf(Long.parseLong(runtimeStat4));
                }
                String runtimeStat5 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
                if (runtimeStat5 != null) {
                    dm9.A00 = Long.valueOf(Long.parseLong(runtimeStat5));
                }
                String runtimeStat6 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
                if (runtimeStat6 != null) {
                    dm9.A01 = Long.valueOf(Long.parseLong(runtimeStat6));
                    return dm9;
                }
            } catch (NumberFormatException e) {
                AnonymousClass0DB.A0I("GCStatsMetricsCollector", e.getMessage(), e);
            }
        }
        return dm9;
    }
}
