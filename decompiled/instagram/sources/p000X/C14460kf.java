package p000X;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.0kf  reason: invalid class name and case insensitive filesystem */
public abstract class C14460kf extends C14470kh {
    public static final C14510kq A00;
    public static final boolean A01 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Object A02 = new Object();
    public static final Logger A03;
    public volatile C14540kv listeners;
    public volatile Object value;
    public volatile C14530ku waiters;

    private void A02(C14530ku r6) {
        r6.thread = null;
        while (true) {
            C14530ku r3 = this.waiters;
            if (r3 != C14530ku.A00) {
                C14530ku r2 = null;
                while (r3 != null) {
                    C14530ku r1 = r3.next;
                    if (r3.thread != null) {
                        r2 = r3;
                    } else if (r2 != null) {
                        r2.next = r1;
                        if (r2.thread == null) {
                        }
                    } else if (!A00.A03(this, r3, r1)) {
                    }
                    r3 = r1;
                }
                return;
            }
            return;
        }
    }

    public static void A03(C14460kf r4) {
        C14540kv r2;
        C14540kv r3 = null;
        while (true) {
            C14530ku r22 = r4.waiters;
            if (A00.A03(r4, r22, C14530ku.A00)) {
                while (r22 != null) {
                    Thread thread = r22.thread;
                    if (thread != null) {
                        r22.thread = null;
                        LockSupport.unpark(thread);
                    }
                    r22 = r22.next;
                }
                r4.A06();
                do {
                    r2 = r4.listeners;
                } while (!A00.A02(r4, r2, C14540kv.A03));
                while (r2 != null) {
                    C14540kv r0 = r2.A00;
                    r2.A00 = r3;
                    r3 = r2;
                    r2 = r0;
                }
                while (true) {
                    C14540kv r1 = r3;
                    if (r3 != null) {
                        r3 = r3.A00;
                        Runnable runnable = r1.A01;
                        if (runnable instanceof C26031Bi) {
                            C26031Bi r23 = (C26031Bi) runnable;
                            r4 = r23.A00;
                            if (r4.value == r23) {
                                if (A00.A04(r4, r23, A00(r23.A01))) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            A04(runnable, r1.A02);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void A06() {
    }

    public final void A08(Future future) {
        boolean z = false;
        if (future != null) {
            z = true;
        }
        if (z && isCancelled()) {
            future.cancel(A09());
        }
    }

    static {
        C14510kq r6;
        Class<C14460kf> cls = C14460kf.class;
        A03 = Logger.getLogger(cls.getName());
        Throwable th = null;
        try {
            r6 = new C14500kp();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            r6 = new BUC();
        }
        A00 = r6;
        if (th != null) {
            Logger logger = A03;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    public static Object A00(C14490kj r4) {
        if (r4 instanceof C14450ke) {
            Object obj = ((C14460kf) r4).value;
            if (!(obj instanceof C26041Bj)) {
                return obj;
            }
            C26041Bj r1 = (C26041Bj) obj;
            if (!r1.A01) {
                return obj;
            }
            Throwable th = r1.A00;
            if (th != null) {
                return new C26041Bj(false, th);
            }
            return C26041Bj.A02;
        }
        try {
            Object A022 = AnonymousClass2MU.A02(r4);
            if (A022 == null) {
                return A02;
            }
            return A022;
        } catch (ExecutionException e) {
            return new C26051Bk(e.getCause());
        } catch (CancellationException e2) {
            return new C26041Bj(false, e2);
        } catch (Throwable th2) {
            return new C26051Bk(th2);
        }
    }

    public static Object A01(Object obj) {
        if (obj instanceof C26041Bj) {
            Throwable th = ((C26041Bj) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C26051Bk) {
            throw new ExecutionException(((C26051Bk) obj).A00);
        } else if (obj == A02) {
            return null;
        } else {
            return obj;
        }
    }

    public String A05() {
        String valueOf;
        Object obj = this.value;
        if (obj instanceof C26031Bi) {
            C14490kj r0 = ((C26031Bi) obj).A01;
            if (r0 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(r0);
            }
            return AnonymousClass000.A0J("setFuture=[", valueOf, "]");
        } else if (this instanceof ScheduledFuture) {
            return AnonymousClass000.A0C("remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
        } else {
            return null;
        }
    }

    public final boolean A09() {
        Object obj = this.value;
        if (!(obj instanceof C26041Bj) || !((C26041Bj) obj).A01) {
            return false;
        }
        return true;
    }

    public boolean A0A(Object obj) {
        if (obj == null) {
            obj = A02;
        }
        if (!A00.A04(this, (Object) null, obj)) {
            return false;
        }
        A03(this);
        return true;
    }

    public boolean A0B(Throwable th) {
        AnonymousClass0a4.A06(th);
        if (!A00.A04(this, (Object) null, new C26051Bk(th))) {
            return false;
        }
        A03(this);
        return true;
    }

    public void A3T(Runnable runnable, Executor executor) {
        AnonymousClass0a4.A07(runnable, "Runnable was null.");
        AnonymousClass0a4.A07(executor, "Executor was null.");
        C14540kv r2 = this.listeners;
        if (r2 != C14540kv.A03) {
            C14540kv r1 = new C14540kv(runnable, executor);
            do {
                r1.A00 = r2;
                if (!A00.A02(this, r2, r1)) {
                    r2 = this.listeners;
                } else {
                    return;
                }
            } while (r2 != C14540kv.A03);
        }
        A04(runnable, executor);
    }

    public boolean cancel(boolean z) {
        C26041Bj r3;
        Object obj = this.value;
        boolean z2 = false;
        if (obj == null) {
            z2 = true;
        }
        if (!z2 && !(obj instanceof C26031Bi)) {
            return false;
        }
        if (A01) {
            r3 = new C26041Bj(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            r3 = C26041Bj.A03;
        } else {
            r3 = C26041Bj.A02;
        }
        boolean z3 = false;
        C14460kf r2 = this;
        while (true) {
            if (A00.A04(r2, obj, r3)) {
                A03(r2);
                if (!(obj instanceof C26031Bi)) {
                    break;
                }
                C14490kj r22 = ((C26031Bi) obj).A01;
                if (!(r22 instanceof C14450ke)) {
                    r22.cancel(z);
                    break;
                }
                r2 = (C14460kf) r22;
                obj = r2.value;
                boolean z4 = false;
                if (obj == null) {
                    z4 = true;
                }
                if (!z4 && !(obj instanceof C26031Bi)) {
                    break;
                }
                z3 = true;
            } else {
                obj = r2.value;
                if (!(obj instanceof C26031Bi)) {
                    return z3;
                }
            }
        }
        return true;
    }

    public boolean isCancelled() {
        return this.value instanceof C26041Bj;
    }

    public boolean isDone() {
        Object obj = this.value;
        boolean z = true;
        boolean z2 = false;
        if (obj != null) {
            z2 = true;
        }
        if (obj instanceof C26031Bi) {
            z = false;
        }
        return z2 & z;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str3 = A05();
                } catch (RuntimeException e) {
                    str3 = "Exception thrown from implementation: " + e.getClass();
                }
                if (!AnonymousClass1BX.A00(str3)) {
                    sb.append("PENDING, info=[");
                    sb.append(str3);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str = "PENDING";
                }
            }
            try {
                Object A022 = AnonymousClass2MU.A02(this);
                sb.append("SUCCESS, result=[");
                if (A022 == this) {
                    str2 = "this future";
                } else {
                    str2 = String.valueOf(A022);
                }
                sb.append(str2);
                sb.append("]");
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
            } catch (CancellationException unused) {
                str = "CANCELLED";
            } catch (RuntimeException e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                str = " thrown from get()]";
            }
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public static void A04(Runnable runnable, Executor executor) {
        try {
            AnonymousClass0Z9.A03(executor, runnable, 1385640313);
        } catch (RuntimeException e) {
            Logger logger = A03;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    public void A07(C14490kj r6) {
        C26031Bi r3;
        C14510kq r2;
        C26051Bk r0;
        AnonymousClass0a4.A06(r6);
        Object obj = this.value;
        if (obj == null) {
            if (r6.isDone()) {
                if (A00.A04(this, (Object) null, A00(r6))) {
                    A03(this);
                    return;
                }
                return;
            }
            r3 = new C26031Bi(this, r6);
            r2 = A00;
            if (r2.A04(this, (Object) null, r3)) {
                try {
                    r6.A3T(r3, C197618cv.A01);
                    return;
                } catch (Throwable unused) {
                    r0 = C26051Bk.A01;
                }
            } else {
                obj = this.value;
            }
        }
        if (obj instanceof C26041Bj) {
            r6.cancel(((C26041Bj) obj).A01);
            return;
        }
        return;
        r2.A04(this, r3, r0);
    }

    public Object get() {
        boolean z;
        boolean z2;
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z3 = false;
            if (obj != null) {
                z3 = true;
            }
            boolean z4 = false;
            if (!(obj instanceof C26031Bi)) {
                z4 = true;
            }
            if (!z3 || !z4) {
                C14530ku r1 = this.waiters;
                if (r1 != C14530ku.A00) {
                    C14530ku r3 = new C14530ku();
                    while (true) {
                        C14510kq r0 = A00;
                        r0.A00(r3, r1);
                        if (!r0.A03(this, r1, r3)) {
                            r1 = this.waiters;
                            if (r1 == C14530ku.A00) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                    z = false;
                                    if (obj != null) {
                                        z = true;
                                    }
                                    z2 = false;
                                    if (!(obj instanceof C26031Bi)) {
                                        z2 = true;
                                    }
                                } else {
                                    A02(r3);
                                }
                            } while (!(z & z2));
                        }
                    }
                    obj = this.value;
                } else {
                    obj = this.value;
                }
            }
            return A01(obj);
        }
        throw new InterruptedException();
    }

    public Object get(long j, TimeUnit timeUnit) {
        long j2;
        Object obj;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            boolean z = false;
            if (obj2 != null) {
                z = true;
            }
            boolean z2 = false;
            if (!(obj2 instanceof C26031Bi)) {
                z2 = true;
            }
            if (z && z2) {
                return A01(obj2);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                C14530ku r1 = this.waiters;
                if (r1 != C14530ku.A00) {
                    C14530ku r5 = new C14530ku();
                    do {
                        C14510kq r0 = A00;
                        r0.A00(r5, r1);
                        if (r0.A03(this, r1, r5)) {
                            while (true) {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    A02(r5);
                                    break;
                                }
                                obj = this.value;
                                boolean z3 = false;
                                if (obj != null) {
                                    z3 = true;
                                }
                                boolean z4 = false;
                                if (!(obj instanceof C26031Bi)) {
                                    z4 = true;
                                }
                                if (z3 && z4) {
                                    break;
                                }
                                nanos = j2 - System.nanoTime();
                                if (nanos < 1000) {
                                    A02(r5);
                                    break;
                                }
                            }
                        } else {
                            r1 = this.waiters;
                        }
                    } while (r1 != C14530ku.A00);
                }
                return A01(this.value);
            }
            while (nanos > 0) {
                obj = this.value;
                boolean z5 = false;
                if (obj != null) {
                    z5 = true;
                }
                boolean z6 = false;
                if (!(obj instanceof C26031Bi)) {
                    z6 = true;
                }
                if (z5 && z6) {
                    return A01(obj);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                }
            }
            String r4 = toString();
            if (isDone()) {
                throw new TimeoutException("Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT) + " but future completed as timeout expired");
            }
            throw new TimeoutException("Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT) + " for " + r4);
        }
        throw new InterruptedException();
    }
}
