package p000X;

import android.content.Context;
import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.PerformanceLoggingEvent;

/* renamed from: X.0de  reason: invalid class name and case insensitive filesystem */
public final class C10650de implements C05030Hp {
    public final Context A00;

    public final String ABW() {
        return "network_stats";
    }

    public final long Ap8() {
        return AnonymousClass0IP.A04;
    }

    public final void BFE(PerformanceLoggingEvent performanceLoggingEvent) {
        if (performanceLoggingEvent.A06(AnonymousClass0IP.A04)) {
            Pair A02 = AnonymousClass0NT.A02(this.A00);
            performanceLoggingEvent.A05(TraceFieldType.NetworkType, (String) A02.first);
            performanceLoggingEvent.A05("network_subtype", (String) A02.second);
        }
    }

    public C10650de(Context context) {
        this.A00 = context;
    }

    public final boolean AfH(C09980cT r2) {
        return r2.A02();
    }
}
