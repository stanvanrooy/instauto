package p000X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.11n  reason: invalid class name and case insensitive filesystem */
public final class C237111n implements C236911l {
    public static final Integer A03 = Constants.ONE;
    public final QuickPerformanceLogger A00;
    public final C236711j A01;
    public volatile boolean A02;

    public final void shutdown() {
        this.A02 = true;
        this.A00.endAllInstancesOfMarker(AnonymousClass7Kh.A00(A03), 615);
    }

    public C237111n(QuickPerformanceLogger quickPerformanceLogger, C236711j r2) {
        this.A00 = quickPerformanceLogger;
        this.A01 = r2;
    }
}
