package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.Logger;
import java.util.HashSet;
import java.util.Random;

/* renamed from: X.0Gk  reason: invalid class name and case insensitive filesystem */
public final class C04870Gk extends Handler {
    public final C04830Gg A00 = new C04830Gg();
    public final C09640bk A01;
    public final HashSet A02 = new HashSet();
    public final Random A03 = new Random();

    public final synchronized void A00(TraceContext traceContext) {
        if (this.A02.contains(Long.valueOf(traceContext.A05))) {
            AnonymousClass0ZA.A0D(this, obtainMessage(3, traceContext));
            this.A02.remove(Long.valueOf(traceContext.A05));
        }
    }

    public final synchronized void A01(TraceContext traceContext) {
        if (this.A02.contains(Long.valueOf(traceContext.A05))) {
            AnonymousClass0ZA.A0D(this, obtainMessage(2, traceContext));
            this.A02.remove(Long.valueOf(traceContext.A05));
        }
    }

    public final void handleMessage(Message message) {
        int i;
        C04810Ge r11;
        AnonymousClass0GW[] r3;
        AnonymousClass0GW[] r4;
        int tracingProviders;
        int tracingProviders2;
        long AIb;
        AnonymousClass0GW[] r8;
        AnonymousClass0GW[] r6;
        int i2;
        AnonymousClass0GW[] r42;
        Message message2 = message;
        TraceContext traceContext = (TraceContext) message2.obj;
        switch (message2.what) {
            case 0:
                long j = traceContext.A05;
                C04850Gi r32 = C04850Gi.A07;
                if (C04850Gi.A01(r32, j) != null) {
                    Logger.postFinishTrace(42, j);
                    r32.A07(j, 4);
                    return;
                }
                return;
            case 1:
                C09640bk r5 = this.A01;
                if (r5 != null) {
                    r5.A06.BSG(traceContext);
                    synchronized (r5) {
                        try {
                            r42 = r5.A04;
                        } catch (Throwable th) {
                            while (true) {
                                th = th;
                                break;
                            }
                        }
                    }
                    for (AnonymousClass0GW A07 : r42) {
                        A07.A07(traceContext, r5);
                    }
                    r5.A06.BGa();
                    return;
                }
                return;
            case 2:
                synchronized (this) {
                    AnonymousClass0ZA.A04(this, 0, traceContext);
                    int i3 = traceContext.A03;
                    if ((i3 & 2) != 0) {
                        long j2 = traceContext.A05;
                        if (Logger.sInitialized) {
                            Logger.startWorkerThreadIfNecessary();
                            Logger.loggerWriteAndWakeupTraceWriter(Logger.sTraceWriter, j2, 41, 0, i3, j2);
                        }
                    }
                    AnonymousClass0ZA.A06(this, obtainMessage(4, traceContext), (long) traceContext.A07.A00("trace_config.post_trace_extension_ms", 0));
                }
                return;
            case 3:
                synchronized (this) {
                    try {
                        AnonymousClass0ZA.A04(this, 0, traceContext);
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                            break;
                        }
                    }
                }
                C09640bk r7 = this.A01;
                if (r7 != null) {
                    synchronized (r7) {
                        try {
                            r8 = r7.A04;
                            r6 = r7.A05;
                        } catch (Throwable th3) {
                            while (true) {
                                th = th3;
                                break;
                            }
                        }
                    }
                    r7.A06.BSD(traceContext);
                    int i4 = traceContext.A02;
                    synchronized (TraceEvents.class) {
                        TraceEvents.sProviders = TraceEvents.nativeDisableProviders(i4);
                    }
                    synchronized (r7.A07) {
                        try {
                            for (AnonymousClass0GW A06 : r6) {
                                A06.A06(traceContext, r7);
                            }
                        } catch (Throwable th4) {
                            while (true) {
                                th = th4;
                                break;
                            }
                        }
                    }
                    for (AnonymousClass0GW A062 : r8) {
                        A062.A06(traceContext, r7);
                    }
                    return;
                }
                return;
            case 4:
                C09640bk r2 = this.A01;
                if (r2 != null) {
                    synchronized (r2) {
                        try {
                            r3 = r2.A04;
                            r4 = r2.A05;
                        } catch (Throwable th5) {
                            while (true) {
                                th = th5;
                                break;
                            }
                        }
                    }
                    if (r2.A09) {
                        AnonymousClass0GC r1 = traceContext.A06;
                        if (r1 == null) {
                            AIb = 0;
                        } else {
                            AIb = r1.AIb();
                        }
                        Logger.writeStandardEntry(0, 7, 52, 0, 0, 8126470, 0, AIb);
                    }
                    int i5 = 0;
                    for (AnonymousClass0GW r52 : r3) {
                        if (r52.A01 == null || r52.A02) {
                            tracingProviders2 = r52.getTracingProviders();
                        } else {
                            tracingProviders2 = 0;
                        }
                        i5 |= tracingProviders2;
                    }
                    for (AnonymousClass0GW r53 : r4) {
                        if (r53.A01 == null || r53.A02) {
                            tracingProviders = r53.getTracingProviders();
                        } else {
                            tracingProviders = 0;
                        }
                        i5 |= tracingProviders;
                    }
                    int i6 = traceContext.A02;
                    synchronized (TraceEvents.class) {
                        TraceEvents.sProviders = TraceEvents.nativeDisableProviders(i6);
                    }
                    synchronized (r2.A07) {
                        int i7 = 0;
                        while (i7 < r10) {
                            try {
                                r4[i7].A06(traceContext, r2);
                                i7++;
                            } catch (Throwable th6) {
                                while (true) {
                                    th = th6;
                                    break;
                                }
                            }
                        }
                    }
                    for (AnonymousClass0GW A063 : r3) {
                        A063.A06(traceContext, r2);
                    }
                    r2.A06.BGb(i5);
                    r2.A06.BSI(traceContext);
                }
                Logger.postFinishTrace(39, traceContext.A05);
                return;
            case 5:
                long j3 = (long) message2.arg1;
                synchronized (this.A00) {
                    try {
                        C04820Gf r0 = (C04820Gf) this.A00.A00.get(traceContext.A05);
                        if (r0 != null) {
                            C04810Ge r33 = r0.A00;
                            if (r33 == null) {
                                throw new IllegalStateException("We should have set a duration");
                            } else if (j3 > r33.A00) {
                                r33.A00 = j3;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        break;
                    }
                }
                return;
            case 6:
                synchronized (this.A00) {
                    try {
                        C04820Gf r12 = (C04820Gf) this.A00.A00.get(traceContext.A05);
                        if (r12 == null || (r11 = r12.A00) == null) {
                            i = 1;
                        } else {
                            int i8 = 0;
                            i = 0;
                            int i9 = -1;
                            while (true) {
                                int[] iArr = r11.A01;
                                if (i8 < iArr.length) {
                                    long j4 = r11.A00;
                                    int i10 = iArr[i8];
                                    if (j4 > ((long) i10) && i10 > i9) {
                                        i = r11.A02[i8];
                                        i9 = i10;
                                    }
                                    i8++;
                                }
                            }
                        }
                    } catch (Throwable th8) {
                        while (true) {
                            th = th8;
                            break;
                        }
                    }
                }
                if (i == 0 || this.A03.nextInt(i) != 0) {
                    Logger.postFinishTrace(38, traceContext.A05);
                    A00(new TraceContext(traceContext, 6));
                } else {
                    Logger.writeStandardEntry(0, 7, 95, 0, 0, 0, 0, (long) i);
                    Logger.postFinishTrace(61, traceContext.A05);
                    A01(traceContext);
                }
                synchronized (this.A00) {
                    try {
                        this.A00.A00.delete(traceContext.A05);
                    } catch (Throwable th9) {
                        th = th9;
                        break;
                    }
                }
                return;
            default:
                return;
        }
        throw th;
    }

    public C04870Gk(C09640bk r2, Looper looper) {
        super(looper);
        this.A01 = r2;
    }
}
