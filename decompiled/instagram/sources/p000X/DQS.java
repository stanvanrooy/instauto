package p000X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.DQS */
public final class DQS {
    public static void A00(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } else {
                return;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static void A01(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 - j;
                if (j3 < 0) {
                    AnonymousClass1J9.A03(new IllegalStateException(AnonymousClass000.A0B("More produced than requested: ", j3)));
                    j3 = 0;
                }
            } else {
                return;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }
}
