package p000X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.11k  reason: invalid class name and case insensitive filesystem */
public final class C236811k implements C236911l {
    public final QuickPerformanceLogger A00;
    public final C237011m A01;
    public final C236711j A02;
    public volatile boolean A03 = false;

    public static boolean A00(C236811k r1) {
        if (r1.A03 || !r1.A02.A01) {
            return false;
        }
        return true;
    }

    public C236811k(QuickPerformanceLogger quickPerformanceLogger, C236711j r4) {
        this.A00 = quickPerformanceLogger;
        this.A02 = r4;
        this.A01 = new C237011m(Constants.ZERO, quickPerformanceLogger, r4);
    }

    public final void shutdown() {
        if (A00(this)) {
            this.A03 = true;
            C237011m r3 = this.A01;
            if (C237011m.A01(r3)) {
                r3.A05 = true;
                AnonymousClass0ZA.A0E(r3.A00, new AnonymousClass7Kg(r3), -325944579);
            }
        }
    }
}
