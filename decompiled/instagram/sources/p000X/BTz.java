package p000X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* renamed from: X.BTz */
public abstract class BTz extends BU3 implements BDB {
    public static final AtomicReferenceFieldUpdater A00;
    public static final AtomicReferenceFieldUpdater A01;
    public volatile Object _delayed = null;
    public volatile int _isCompleted = 0;
    public volatile Object _queue = null;

    static {
        Class<BTz> cls = BTz.class;
        Class<Object> cls2 = Object.class;
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return false;
     */
    private final boolean A00(Runnable runnable) {
        boolean compareAndSet;
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                break;
            }
            if (obj != null) {
                if (!(obj instanceof C50432Gh)) {
                    if (obj == BU6.A00) {
                        break;
                    }
                    C50432Gh r1 = new C50432Gh(8, true);
                    r1.A00((Runnable) obj);
                    r1.A00(runnable);
                    compareAndSet = A01.compareAndSet(this, obj, r1);
                } else {
                    C50432Gh r0 = (C50432Gh) obj;
                    int A002 = r0.A00(runnable);
                    if (A002 == 0) {
                        break;
                    } else if (A002 != 1) {
                        if (A002 == 2) {
                            break;
                        }
                    } else {
                        A01.compareAndSet(this, obj, r0.A02());
                    }
                }
            } else {
                compareAndSet = A01.compareAndSet(this, (Object) null, runnable);
            }
            if (compareAndSet) {
                break;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.BU1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.BU1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: X.BU1} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void A0A(long j, BU1 bu1) {
        BU7 bu7;
        char c;
        BU1 bu12;
        Thread A08;
        BU1 bu13;
        if (this._isCompleted != 0) {
            c = 1;
        } else {
            BU8 bu8 = (BU8) this._delayed;
            if (bu8 == null) {
                A00.compareAndSet(this, (Object) null, new BU8(j));
                Object obj = this._delayed;
                if (obj == null) {
                    C13150hy.A00();
                }
                bu8 = (BU8) obj;
            }
            long j2 = j;
            synchronized (bu1) {
                if (bu1.A01 == BU6.A01) {
                    c = 2;
                } else {
                    synchronized (bu8) {
                        BU7[] bu7Arr = bu8.A00;
                        if (bu7Arr != null) {
                            bu7 = bu7Arr[0];
                        } else {
                            bu7 = null;
                        }
                        BU1 bu14 = (BU1) bu7;
                        if (this._isCompleted != 0) {
                            c = 1;
                        } else {
                            if (bu14 == null) {
                                bu8.A00 = j;
                            } else {
                                long j3 = bu14.A00;
                                if (j3 - j < 0) {
                                    j2 = j3;
                                }
                                if (j2 - bu8.A00 > 0) {
                                    bu8.A00 = j2;
                                }
                            }
                            long j4 = bu1.A00;
                            long j5 = bu8.A00;
                            if (j4 - j5 < 0) {
                                bu1.A00 = j5;
                            }
                            if (AnonymousClass2GE.A01) {
                                boolean z = false;
                                if (bu1.AMo() == null) {
                                    z = true;
                                }
                                if (!z) {
                                    throw new AssertionError();
                                }
                            }
                            bu1.Bhq(bu8);
                            BU7[] bu7Arr2 = bu8.A00;
                            if (bu7Arr2 == null) {
                                bu7Arr2 = new BU7[4];
                                bu8.A00 = bu7Arr2;
                            } else if (bu8._size >= bu7Arr2.length) {
                                Object[] copyOf = Arrays.copyOf(bu7Arr2, bu8._size << 1);
                                C13150hy.A01(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                                bu7Arr2 = (BU7[]) copyOf;
                                bu8.A00 = bu7Arr2;
                            }
                            int i = bu8._size;
                            bu8._size = i + 1;
                            bu7Arr2[i] = bu1;
                            bu1.Bi2(i);
                            BU4.A01(bu8, i);
                            c = 0;
                        }
                    }
                }
            }
        }
        if (c == 0) {
            BU8 bu82 = (BU8) this._delayed;
            if (bu82 != null) {
                synchronized (bu82) {
                    BU7[] bu7Arr3 = bu82.A00;
                    if (bu7Arr3 != null) {
                        bu13 = bu7Arr3[0];
                    } else {
                        bu13 = null;
                    }
                }
                bu12 = bu13;
            } else {
                bu12 = null;
            }
            boolean z2 = false;
            if (bu12 == bu1) {
                z2 = true;
            }
            if (z2 && Thread.currentThread() != (A08 = A08())) {
                LockSupport.unpark(A08);
            }
        } else if (c == 1) {
            if (AnonymousClass2GE.A01) {
                boolean z3 = false;
                if (this != BU0.A00) {
                    z3 = true;
                }
                if (!z3) {
                    throw new AssertionError();
                }
            }
            BU0.A00.A0A(j, bu1);
        } else if (c != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r0 == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2 == r1) goto L_0x000b;
     */
    public final boolean A0C() {
        boolean z;
        BU9 bu9 = this.A00;
        if (bu9 != null) {
            int i = bu9.A00;
            int i2 = bu9.A01;
            z = false;
        }
        z = true;
        if (z) {
            BU8 bu8 = (BU8) this._delayed;
            if (bu8 != null) {
                int i3 = bu8._size;
                boolean z2 = false;
                if (i3 == 0) {
                    z2 = true;
                }
            }
            Object obj = this._queue;
            if (obj == null) {
                return true;
            }
            if (obj instanceof C50432Gh) {
                long j = ((C50432Gh) obj)._state;
                if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                    return true;
                }
                return false;
            } else if (obj == BU6.A00) {
                return true;
            }
        }
        return false;
    }

    public C50602Gy invokeOnTimeout(long j, Runnable runnable) {
        if (!(this instanceof BU0)) {
            return BDC.A00.invokeOnTimeout(j, runnable);
        }
        BU0 bu0 = (BU0) this;
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 >= HandlerDispatcherKt.MAX_DELAY) {
            return C50592Gx.A00;
        }
        long nanoTime = System.nanoTime();
        BE4 be4 = new BE4(j2 + nanoTime, runnable);
        bu0.A0A(nanoTime, be4);
        return be4;
    }

    public final void scheduleResumeAfterDelay(long j, C50732Hq r9) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < HandlerDispatcherKt.MAX_DELAY) {
            long nanoTime = System.nanoTime();
            BE3 be3 = new BE3(this, j2 + nanoTime, r9);
            r9.Adw(new AnonymousClass2IG(be3));
            A0A(nanoTime, be3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r5 == false) goto L_0x0031;
     */
    public final long A07() {
        BU1 bu1;
        if (super.A07() != 0) {
            Object obj = this._queue;
            if (obj != null) {
                if (obj instanceof C50432Gh) {
                    long j = ((C50432Gh) obj)._state;
                    boolean z = false;
                    if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                        z = true;
                    }
                } else if (obj == BU6.A00) {
                    return Long.MAX_VALUE;
                }
            }
            BU8 bu8 = (BU8) this._delayed;
            if (bu8 != null) {
                synchronized (bu8) {
                    BU7[] bu7Arr = bu8.A00;
                    if (bu7Arr != null) {
                        bu1 = bu7Arr[0];
                    } else {
                        bu1 = null;
                    }
                }
                BU1 bu12 = bu1;
                if (bu12 != null) {
                    long nanoTime = bu12.A00 - System.nanoTime();
                    if (nanoTime < 0) {
                        return 0;
                    }
                    return nanoTime;
                }
            }
            return Long.MAX_VALUE;
        }
        return 0;
    }

    public final long A09() {
        Runnable runnable;
        BU1 bu1;
        BU7 bu7;
        boolean z;
        if (A06()) {
            return 0;
        }
        BU8 bu8 = (BU8) this._delayed;
        if (bu8 != null) {
            boolean z2 = false;
            if (bu8._size == 0) {
                z2 = true;
            }
            if (!z2) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (bu8) {
                        BU7[] bu7Arr = bu8.A00;
                        if (bu7Arr != null) {
                            bu1 = bu7Arr[0];
                        } else {
                            bu1 = null;
                        }
                        bu7 = null;
                        if (bu1 != null) {
                            BU1 bu12 = bu1;
                            boolean z3 = false;
                            if (nanoTime - bu12.A00 >= 0) {
                                z3 = true;
                            }
                            if (z3) {
                                z = A00(bu12);
                            } else {
                                z = false;
                            }
                            if (z) {
                                bu7 = bu8.A02(0);
                            }
                        }
                    }
                } while (((BU1) bu7) != null);
            }
        }
        while (true) {
            Object obj = this._queue;
            runnable = null;
            if (obj == null) {
                break;
            } else if (obj instanceof C50432Gh) {
                C50432Gh r2 = (C50432Gh) obj;
                Object A012 = r2.A01();
                if (A012 != C50432Gh.A07) {
                    runnable = (Runnable) A012;
                    break;
                }
                A01.compareAndSet(this, obj, r2.A02());
            } else if (obj == BU6.A00) {
                break;
            } else if (A01.compareAndSet(this, obj, (Object) null)) {
                runnable = (Runnable) obj;
                break;
            }
        }
        if (runnable == null) {
            return A07();
        }
        runnable.run();
        return 0;
    }

    public final void A0B(Runnable runnable) {
        if (A00(runnable)) {
            Thread A08 = A08();
            if (Thread.currentThread() != A08) {
                LockSupport.unpark(A08);
                return;
            }
            return;
        }
        BU0.A00.A0B(runnable);
    }

    public final void dispatch(AnonymousClass2GC r1, Runnable runnable) {
        A0B(runnable);
    }
}
