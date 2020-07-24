package p000X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Yy  reason: invalid class name and case insensitive filesystem */
public final class C08840Yy {
    public static final File A03 = new File("/sys/kernel/debug/tracing/trace");
    public boolean A00;
    public final Object A01 = new Object[0];
    public final List A02 = new ArrayList();

    public static void A00(C08840Yy r2, boolean z) {
        r2.A00 = z;
        for (int i = 0; i < r2.A02.size(); i++) {
            AnonymousClass0Yw r0 = (AnonymousClass0Yw) r2.A02.get(i);
            if (z) {
                r0.BSH();
            } else {
                r0.BSJ();
            }
        }
    }

    public final void A01() {
        synchronized (this.A01) {
            AnonymousClass0ZJ.A01(1, "Run Trace Listeners", -1477611584);
            try {
                A00(this, true);
                AnonymousClass0ZJ.A00(1, 1712573857);
            } catch (Throwable th) {
                AnonymousClass0ZJ.A00(1, 283315521);
                throw th;
            }
        }
    }
}
