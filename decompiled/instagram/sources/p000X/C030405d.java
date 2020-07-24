package p000X;

import android.content.Context;
import com.facebook.common.dextricks.MultiDexClassLoader;

/* renamed from: X.05d  reason: invalid class name and case insensitive filesystem */
public final class C030405d extends C09470bT {
    public static C030405d A00;

    public static synchronized void A00(Context context, AnonymousClass0Ba r3) {
        synchronized (C030405d.class) {
            if (A00 == null) {
                A00 = new C030405d(context, r3);
            }
            MultiDexClassLoader.sFallbackDexLoader = A00;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public C030405d(Context context, AnonymousClass0Ba r8) {
        super(context, r0, r8);
        C09030Zt r0;
        C09500bW A002 = C09500bW.A00(context);
        C08860Za A003 = AnonymousClass0ZS.A00(context);
        Context context2 = context;
        synchronized (C09030Zt.class) {
            r0 = C09030Zt.A03;
            if (r0 == null) {
                Context applicationContext = context.getApplicationContext();
                r0 = new C09030Zt(applicationContext != null ? applicationContext : context2, A002, A003);
                C09030Zt.A03 = r0;
            } else if (r0.A02 != A002) {
                throw new RuntimeException("Different VoltronModuleLoaders detected!");
            }
        }
    }
}
