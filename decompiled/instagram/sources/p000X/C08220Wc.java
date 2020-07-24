package p000X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Wc  reason: invalid class name and case insensitive filesystem */
public final class C08220Wc {
    public int A00 = 0;
    public long A01;
    public AnonymousClass0T1 A02;
    public AnonymousClass0TS A03;
    public C08240We A04;
    public Runnable A05;
    public Future A06;
    public boolean A07;
    public C07630Tv A08;
    public final Handler A09;
    public final AnonymousClass0TQ A0A;
    public final ExecutorService A0B;
    public final ScheduledExecutorService A0C;
    public final RealtimeSinceBootClock A0D;
    public final C08250Wf A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        if (r1 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0049, code lost:
        if (r0 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0092, code lost:
        if (r2 != java.lang.Thread.currentThread()) goto L_0x0094;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:72:0x00e0=Splitter:B:72:0x00e0, B:62:0x00d7=Splitter:B:62:0x00d7} */
    public final synchronized boolean A02() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Future future;
        synchronized (this) {
            if (this.A04 == null) {
                AnonymousClass0DB.A0E("ConnectionRetryManager", "next is called before having a strategy.");
            } else if (this.A03.A8L()) {
                synchronized (this) {
                    try {
                        Future future2 = this.A06;
                        if (future2 != null) {
                            boolean isDone = future2.isDone();
                            z2 = true;
                        }
                        z2 = false;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                if (!z2) {
                    if (this.A00 == 0) {
                        this.A01 = SystemClock.elapsedRealtime();
                    }
                    if (((Boolean) this.A0A.get()).booleanValue()) {
                        synchronized (this) {
                            try {
                                boolean z5 = this.A07;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        z3 = true;
                    }
                    z3 = false;
                    C08240We r0 = this.A04;
                    boolean Abx = r0.Abx(z3);
                    if (!Abx) {
                        if (r0.AX0() == C08230Wd.BACK_TO_BACK) {
                            A01(C08230Wd.BACK_OFF);
                            Abx = this.A04.Abx(z3);
                        }
                        if (!Abx) {
                            AnonymousClass0DB.A0E("ConnectionRetryManager", "No more retry!");
                        }
                    }
                    int Apz = this.A04.Apz(z3);
                    Future future3 = this.A06;
                    if (future3 != null) {
                        future3.cancel(false);
                        this.A06 = null;
                    }
                    if (Apz <= 0) {
                        Handler handler = this.A09;
                        if (handler != null) {
                            Thread thread = handler.getLooper().getThread();
                            z4 = true;
                        }
                        z4 = false;
                        if (z4) {
                            this.A05.run();
                            future = AnonymousClass0U2.A01;
                        } else {
                            future = AnonymousClass0Z9.A01(this.A0B, this.A05, 831020264);
                        }
                        this.A06 = future;
                    } else {
                        Integer valueOf = Integer.valueOf(Apz);
                        this.A06 = this.A0C.schedule(this.A05, (long) Apz, TimeUnit.SECONDS);
                        AnonymousClass0T1 r3 = this.A02;
                        if (r3 != null) {
                            r3.Aj2(String.format((Locale) null, "retry in %d seconds", new Object[]{valueOf}));
                        }
                    }
                    this.A00++;
                }
                z = true;
            }
            z = false;
        }
        return z;
    }

    public static void A00(C08220Wc r2) {
        Future future = r2.A06;
        if (future != null) {
            future.cancel(false);
            r2.A06 = null;
        }
        r2.A01(C08230Wd.BACK_TO_BACK);
        C08250Wf r1 = r2.A0E;
        r1.A01 = -2;
        r1.A00 = r1.A02;
        r2.A00 = 0;
    }

    private void A01(C08230Wd r6) {
        Future future = this.A06;
        if (future != null) {
            future.cancel(false);
            this.A06 = null;
        }
        C07650Tx A002 = this.A08.A00();
        if (r6 == C08230Wd.BACK_TO_BACK) {
            this.A04 = new C10260cv(A002.A02, A002.A05, A002.A03);
        } else if (r6 == C08230Wd.BACK_OFF) {
            this.A04 = new C10250cu(A002.A00, A002.A04, A002.A01);
        } else {
            throw new IllegalArgumentException(String.format((Locale) null, "Invalid strategy %s specified", new Object[]{r6}));
        }
    }

    public C08220Wc(RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0TQ r5, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, Handler handler, C07630Tv r9, AnonymousClass0TS r10, AnonymousClass0T1 r11) {
        this.A0D = realtimeSinceBootClock;
        this.A0A = r5;
        this.A0B = executorService;
        this.A0C = scheduledExecutorService;
        this.A09 = handler;
        this.A08 = r9;
        this.A03 = r10;
        this.A02 = r11;
        C07650Tx A002 = r9.A00();
        this.A0E = new C08250Wf(A002.A00, A002.A01);
    }
}
