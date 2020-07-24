package p000X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.systrace.Systrace;

/* renamed from: X.0ds  reason: invalid class name and case insensitive filesystem */
public final class C10790ds implements AnonymousClass0Yw {
    public static QuickPerformanceLogger A00;

    static {
        C08800Yq.A00(new C10790ds());
    }

    public final void BSH() {
        if (A00 != null && Systrace.A08(4)) {
            A00.updateListenerMarkers();
        }
    }

    public final void BSJ() {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.updateListenerMarkers();
        }
    }
}
