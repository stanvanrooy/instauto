package p000X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.12t  reason: invalid class name and case insensitive filesystem */
public final class C239812t {
    public static C239812t A05;
    public final C08860Za A00;
    public final C09020Zs A01;
    public final C09030Zt A02;
    public final AtomicInteger A03 = new AtomicInteger(0);
    public final boolean A04;

    public static synchronized C239812t A00(Context context) {
        C239812t r0;
        synchronized (C239812t.class) {
            if (A05 == null) {
                A05 = new C239812t(context.getApplicationContext());
            }
            r0 = A05;
        }
        return r0;
    }

    public C239812t(Context context) {
        this.A01 = C09500bW.A00(context);
        C08860Za r2 = new C08860Za(context.getApplicationInfo().dataDir);
        this.A00 = r2;
        this.A02 = new C09030Zt(context, this.A01, r2);
        this.A04 = C239112l.A00(context);
    }
}
