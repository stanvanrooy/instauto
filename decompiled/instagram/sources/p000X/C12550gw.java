package p000X;

import com.facebook.quicklog.PerformanceLoggingEvent;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.0gw  reason: invalid class name and case insensitive filesystem */
public final class C12550gw implements C05030Hp {
    public final boolean A00;

    public final String ABW() {
        return "dex_info";
    }

    public final long Ap8() {
        return AnonymousClass0IP.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2.A00 == false) goto L_0x0011;
     */
    public final void BFE(PerformanceLoggingEvent performanceLoggingEvent) {
        boolean z;
        if (performanceLoggingEvent.A06(AnonymousClass0IP.A01)) {
            if (AnonymousClass0Bq.A00) {
                z = true;
            }
            z = false;
            if (z) {
                performanceLoggingEvent.A01("dex_unopt");
                performanceLoggingEvent.A05("odex_scheme_name", "unknown");
                performanceLoggingEvent.A01("oatmeal");
                performanceLoggingEvent.A01("quick");
                performanceLoggingEvent.A01(BaseViewManager.STATE_MIXED);
                performanceLoggingEvent.A01("quick_attempted");
                performanceLoggingEvent.A01("mixed_attempted");
                performanceLoggingEvent.A01("dexopt_during_cold_start");
                performanceLoggingEvent.A01("disabled_rt_verifier");
            }
        }
    }

    public C12550gw(boolean z) {
        this.A00 = z;
    }

    public final boolean AfH(C09980cT r2) {
        return r2.A00();
    }
}
