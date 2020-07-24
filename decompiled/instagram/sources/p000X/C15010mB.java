package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0mB  reason: invalid class name and case insensitive filesystem */
public final class C15010mB {
    public int A00 = 10;
    public Map A01 = new HashMap();

    public final synchronized long A00(C15920nk r6) {
        long size;
        if (!this.A01.containsKey(r6)) {
            return -1;
        }
        C36141hZ r4 = (C36141hZ) this.A01.get(r6);
        synchronized (r4) {
            size = r4.A01 / ((long) r4.A02.size());
        }
        return size;
    }

    public final synchronized void A01(C15920nk r6, long j) {
        C36141hZ r4 = (C36141hZ) this.A01.get(r6);
        if (r4 == null) {
            r4 = new C36141hZ(this, this.A00);
            this.A01.put(r6, r4);
        }
        synchronized (r4) {
            if (r4.A02.size() >= r4.A00) {
                r4.A01 -= ((Long) r4.A02.remove()).longValue();
            }
            r4.A02.add(Long.valueOf(j));
            r4.A01 += j;
        }
    }
}
