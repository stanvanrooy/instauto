package p000X;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.DI4 */
public final class DI4 extends AtomicReferenceArray implements Runnable, C27711Ix, Callable {
    public static final Object A01 = new Object();
    public static final Object A02 = new Object();
    public static final Object A03 = new Object();
    public static final Object A04 = new Object();
    public final Runnable A00;

    public DI4(Runnable runnable, C27721Iy r3) {
        super(3);
        this.A00 = runnable;
        lazySet(0, r3);
    }

    public final void A00(Future future) {
        Object obj;
        do {
            boolean z = true;
            obj = get(1);
            if (obj != A02) {
                if (obj == A04) {
                    z = false;
                } else if (obj != A01) {
                }
                future.cancel(z);
                return;
            }
            return;
        } while (!compareAndSet(1, obj, future));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        while (true) {
            Object obj4 = get(1);
            if (obj4 == A02 || obj4 == A04 || obj4 == A01) {
                break;
            }
            boolean z = false;
            if (get(2) != Thread.currentThread()) {
                z = true;
            }
            if (z) {
                obj3 = A01;
            } else {
                obj3 = A04;
            }
            if (compareAndSet(1, obj4, obj3)) {
                if (obj4 != null) {
                    ((Future) obj4).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == A02 || obj == (obj2 = A03) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((C27721Iy) obj).ABd(this);
    }

    public final Object call() {
        run();
        return null;
    }

    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.A00.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == A03 || !compareAndSet(0, obj3, A02) || obj3 == null)) {
                ((C27721Iy) obj3).ABd(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == A04 || obj2 == A01 || compareAndSet(1, obj2, A02)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, A02));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == A03 || !compareAndSet(0, obj4, A02) || obj4 == null)) {
            ((C27721Iy) obj4).ABd(this);
        }
        do {
            obj = get(1);
            if (obj == A04 || obj == A01 || compareAndSet(1, obj, A02)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, A02));
    }
}
