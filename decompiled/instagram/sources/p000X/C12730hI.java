package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.0hI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12730hI implements AnonymousClass0IT {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SharedPreferences A01;
    public final /* synthetic */ C12700hF A02;

    public /* synthetic */ C12730hI(C12700hF r1, Context context, SharedPreferences sharedPreferences) {
        this.A02 = r1;
        this.A00 = context;
        this.A01 = sharedPreferences;
    }

    public final Object get() {
        boolean z;
        C56842d9 r1;
        C12700hF r0 = this.A02;
        Context context = this.A00;
        SharedPreferences sharedPreferences = this.A01;
        QuickPerformanceLogger quickPerformanceLogger = r0.A01;
        C71853Ck r12 = new C71853Ck("eviction", sharedPreferences);
        if (C56792d4.A05 == null) {
            C56792d4.A05 = new C56792d4(context, quickPerformanceLogger, r12);
            AnonymousClass0Q7.A03().A0B(C56792d4.A05);
            Class<C56842d9> cls = C56842d9.class;
            synchronized (cls) {
                z = false;
                if (C56842d9.A01 != null) {
                    z = true;
                }
            }
            if (z) {
                synchronized (cls) {
                    r1 = C56842d9.A01;
                    if (r1 == null) {
                        throw new IllegalStateException("getInstance() called before initialize()");
                    }
                }
                r1.BZa(C56792d4.A05);
            }
        }
        return C56792d4.A05;
    }
}
