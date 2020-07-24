package p000X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.0hN  reason: invalid class name and case insensitive filesystem */
public final class C12780hN extends C12790hO {
    public static C12780hN A03;
    public final QuickPerformanceLogger A00;
    public final AnonymousClass0OT A01;
    public final Context A02;

    public static synchronized C12780hN A00() {
        C12780hN r0;
        synchronized (C12780hN.class) {
            r0 = A03;
            if (r0 == null) {
                throw new IllegalStateException("IgStashFactory not initialized");
            }
        }
        return r0;
    }

    public final QuickPerformanceLogger A02() {
        return this.A00;
    }

    public final C12720hH A03() {
        C12700hF r0 = C12700hF.A03;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("IgPathProvider hasn't been initialized yet.");
    }

    public final AnonymousClass2BB A04() {
        return AnonymousClass2BA.A00(this.A02);
    }

    public final void A05(Runnable runnable) {
        this.A01.ADc(new AnonymousClass2BJ(this, runnable));
    }

    public C12780hN(Context context, QuickPerformanceLogger quickPerformanceLogger, AnonymousClass0OT r4) {
        this.A02 = context.getApplicationContext();
        this.A00 = quickPerformanceLogger;
        this.A01 = r4;
    }
}
