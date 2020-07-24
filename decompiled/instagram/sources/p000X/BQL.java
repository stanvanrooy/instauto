package p000X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.BQL */
public final class BQL {
    public static long A01;
    public static BQL A02;
    public final Map A00;

    public final synchronized void A01(int i, BQM bqm, int i2) {
        int remainingCapacity;
        boolean z;
        int i3;
        Object obj;
        this.A00.put(Integer.valueOf(i), bqm);
        synchronized (this) {
            synchronized (bqm) {
                remainingCapacity = bqm.A00.remainingCapacity();
            }
            int i4 = 0;
            if (remainingCapacity == 0) {
                z = true;
                synchronized (bqm) {
                    if (!bqm.A00.isEmpty()) {
                        obj = bqm.A00.peekFirst();
                    } else {
                        obj = null;
                    }
                }
                i3 = ((C25521BOf) obj).A01();
            } else {
                i3 = 0;
                z = false;
            }
            int i5 = i2 - i3;
            long j = A01;
            if (!z) {
                i4 = 4;
            }
            A01 = j + ((long) (i5 + i4));
        }
    }

    public static BQL A00() {
        if (A02 == null) {
            A02 = new BQL(Collections.synchronizedMap(new HashMap()));
        }
        return A02;
    }

    public BQL(Map map) {
        this.A00 = map;
    }
}
