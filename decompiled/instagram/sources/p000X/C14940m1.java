package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0m1  reason: invalid class name and case insensitive filesystem */
public final class C14940m1 {
    public Map A00 = new HashMap();

    public static synchronized void A00(C14940m1 r2, Object obj) {
        synchronized (r2) {
            Object obj2 = r2.A00.get(obj);
            AnonymousClass0FY.A00(obj2);
            AnonymousClass0m4 r1 = (AnonymousClass0m4) obj2;
            int i = r1.A00 - 1;
            r1.A00 = i;
            if (i == 0) {
                r2.A00.remove(obj);
            }
        }
    }

    public final synchronized void A01(Object obj) {
        Object obj2 = this.A00.get(obj);
        AnonymousClass0FY.A00(obj2);
        AnonymousClass0m4 r2 = (AnonymousClass0m4) obj2;
        boolean z = false;
        if (r2.A01.availablePermits() == 0) {
            z = true;
        }
        AnonymousClass0FY.A02(z);
        r2.A01.release();
        A00(this, obj);
    }

    public final synchronized boolean A02(Object obj) {
        return this.A00.containsKey(obj);
    }
}
