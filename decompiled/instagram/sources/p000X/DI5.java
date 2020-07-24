package p000X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.DI5 */
public final class DI5 extends AtomicReferenceArray implements AnonymousClass1KI {
    public static final Integer A05 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public long A00;
    public final int A01;
    public final int A02 = (length() - 1);
    public final AtomicLong A03 = new AtomicLong();
    public final AtomicLong A04 = new AtomicLong();

    public DI5(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.A01 = Math.min(i >> 2, A05.intValue());
    }

    public final boolean isEmpty() {
        if (this.A04.get() == this.A03.get()) {
            return true;
        }
        return false;
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            int i = this.A02;
            long j = this.A04.get();
            int i2 = ((int) j) & i;
            if (j >= this.A00) {
                long j2 = ((long) this.A01) + j;
                if (get(((int) j2) & i) == null) {
                    this.A00 = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, obj);
            this.A04.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final Object poll() {
        long j = this.A03.get();
        int i = this.A02 & ((int) j);
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        this.A03.lazySet(j + 1);
        lazySet(i, (Object) null);
        return obj;
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }
}
