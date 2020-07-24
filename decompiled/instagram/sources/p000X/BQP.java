package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BQP */
public final class BQP {
    public static BQP A01;
    public static Object sUserSessionUpdateProviderLock = new Object();
    public final List A00 = Collections.synchronizedList(new ArrayList());

    public final synchronized void A01(BR9 br9) {
        this.A00.add(br9);
    }

    public final synchronized void A02(Object obj) {
        for (BR9 BtQ : this.A00) {
            BtQ.BtQ(obj);
        }
    }

    public static synchronized BQP A00() {
        BQP bqp;
        synchronized (BQP.class) {
            bqp = A01;
            if (bqp == null) {
                synchronized (sUserSessionUpdateProviderLock) {
                    if (A01 == null) {
                        A01 = new BQP();
                    }
                    bqp = A01;
                }
            }
        }
        return bqp;
    }
}
