package p000X;

import android.os.Looper;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.0Iy  reason: invalid class name and case insensitive filesystem */
public final class C05290Iy implements Runnable {
    public final /* synthetic */ QuickPerformanceLogger A00;
    public final /* synthetic */ C024402j A01;
    public final /* synthetic */ AnonymousClass0C1 A02;
    public final /* synthetic */ C13300iJ A03;
    public final /* synthetic */ String A04;

    public C05290Iy(C024402j r1, AnonymousClass0C1 r2, QuickPerformanceLogger quickPerformanceLogger, C13300iJ r4, String str) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = quickPerformanceLogger;
        this.A03 = r4;
        this.A04 = str;
    }

    public final void run() {
        Looper.myQueue().addIdleHandler(new C05300Iz(this));
    }
}
