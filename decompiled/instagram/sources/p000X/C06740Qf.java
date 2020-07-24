package p000X;

import android.content.Context;
import java.util.Random;

/* renamed from: X.0Qf  reason: invalid class name and case insensitive filesystem */
public final class C06740Qf {
    public static C06740Qf A03;
    public C06730Qe A00;
    public Random A01 = new Random();
    public final Context A02;

    public static synchronized C06730Qe A02(C06740Qf r2) {
        C06730Qe r0;
        synchronized (r2) {
            if (r2.A00 == null) {
                r2.A00 = new C06730Qe(r2.A02);
            }
            r0 = r2.A00;
        }
        return r0;
    }

    public static synchronized C06740Qf A00() {
        C06740Qf r0;
        synchronized (C06740Qf.class) {
            r0 = A03;
        }
        return r0;
    }

    public static synchronized C06740Qf A01(Context context) {
        C06740Qf r0;
        synchronized (C06740Qf.class) {
            boolean z = false;
            if (A03 == null) {
                z = true;
            }
            AnonymousClass0a4.A09(z);
            r0 = new C06740Qf(context);
            A03 = r0;
        }
        return r0;
    }

    public final boolean A03(AnonymousClass0P4 r5, String str) {
        C06730Qe A022;
        if (!r5.A05 && (A022 = A02(this)) != null) {
            String str2 = r5.A04;
            if (!str2.equals("perf")) {
                int A012 = A022.A01(str2, (String) null, (String) null, str);
                r5.A01 = Integer.valueOf(A012);
                if (A012 == 0) {
                    return false;
                }
                if (A012 == 1 || this.A01.nextInt(A012) == 0) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public C06740Qf(Context context) {
        this.A02 = context;
    }

    public void setTestPigeonSamplingPolicy(C06730Qe r1) {
        this.A00 = r1;
    }
}
