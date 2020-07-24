package p000X;

import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.Logger;
import com.facebook.profilo.mmapbuf.MmapBufferManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.0Gi  reason: invalid class name and case insensitive filesystem */
public final class C04850Gi {
    public static final ThreadLocal A06 = new C04840Gh();
    public static volatile C04850Gi A07;
    public C04870Gk A00;
    public final AtomicInteger A01 = new AtomicInteger(0);
    public final AtomicReference A02;
    public final AtomicReferenceArray A03 = new AtomicReferenceArray(2);
    public final SparseArray A04;
    public final C09640bk A05;

    public static TraceContext A00(C04850Gi r10, int i, long j) {
        if (r10.A01.get() != 0) {
            for (int i2 = 0; i2 < 2; i2++) {
                TraceContext traceContext = (TraceContext) r10.A03.get(i2);
                if (traceContext != null && (traceContext.A01 & i) != 0 && ((AnonymousClass0Gm) traceContext.A09).A9h(traceContext.A04, traceContext.A08, j, (Object) null)) {
                    return traceContext;
                }
            }
        }
        return null;
    }

    public static void A04(C04850Gi r5, TraceContext traceContext) {
        int i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < 2) {
                if (r5.A03.compareAndSet(i2, traceContext, (Object) null)) {
                    do {
                        i = r5.A01.get();
                    } while (!r5.A01.compareAndSet(i, (1 << i2) ^ i));
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (!z) {
            Log.w("Profilo/TraceControl", "Could not reset Trace Context to null");
        }
    }

    public final boolean A08(int i, int i2, long j) {
        int ADR;
        long abs;
        TraceContext.TraceConfigExtras AYl;
        int i3;
        int i4;
        int A002;
        AnonymousClass0GW[] r7;
        ArrayList<String> arrayList;
        int i5 = this.A01.get();
        int i6 = i2;
        int i7 = i2 & 2;
        int i8 = 1;
        if (i7 != 0) {
            i8 = 65534;
        }
        int i9 = i5 | i8;
        int i10 = (1 << 2) - 1;
        if (((i9 ^ -1) & (i9 + 1) & i10) != 0) {
            int i11 = i;
            AnonymousClass0Gm r8 = (AnonymousClass0Gm) this.A04.get(i11);
            if (r8 != null) {
                AnonymousClass0GC r72 = (AnonymousClass0GC) this.A02.get();
                if (r72 != null) {
                    AnonymousClass0GE r5 = null;
                    if (!r8.Aek() || (r5 = r72.AJ0().AIa(i11)) != null) {
                        long j2 = j;
                        if (A00(this, i11, j2) == null && (ADR = r8.ADR(j2, (Object) null, r5)) != 0) {
                            do {
                                abs = Math.abs(((Random) A06.get()).nextLong());
                            } while (abs <= 0);
                            Log.w("Profilo/TraceControl", AnonymousClass000.A0E("START PROFILO_TRACEID: ", AnonymousClass0FO.A00(abs)));
                            String A003 = AnonymousClass0FO.A00(abs);
                            if (r5 == null) {
                                AYl = TraceContext.TraceConfigExtras.A03;
                            } else {
                                AYl = r8.AYl(j2, (Object) null, r5);
                            }
                            TraceContext traceContext = new TraceContext(abs, A003, r72, i11, r8, j2, ADR, i6, AYl);
                            do {
                                i3 = this.A01.get();
                                int i12 = 1;
                                if (i7 != 0) {
                                    i12 = 65534;
                                }
                                int i13 = i3 | i12;
                                i4 = (i13 ^ -1) & (i13 + 1) & i10;
                                if (i4 == 0) {
                                    return false;
                                }
                            } while (!this.A01.compareAndSet(i3, i3 | i4));
                            AtomicReferenceArray atomicReferenceArray = this.A03;
                            int i14 = -1;
                            while (i4 != 0) {
                                i14++;
                                i4 >>= 1;
                            }
                            if (atomicReferenceArray.compareAndSet(i14, (Object) null, traceContext)) {
                                if ((i2 & 3) != 0) {
                                    A002 = Integer.MAX_VALUE;
                                } else {
                                    A002 = traceContext.A07.A00("trace_config.trace_timeout_ms", 30000);
                                }
                                long j3 = traceContext.A05;
                                if (Logger.sInitialized) {
                                    MmapBufferManager mmapBufferManager = Logger.sMmapBufferManager;
                                    boolean z = true;
                                    if (mmapBufferManager != null) {
                                        z = !mmapBufferManager.allocateBuffer(Logger.sRingBufferSize);
                                    }
                                    if (z) {
                                        Logger.nativeInitRingBuffer(Logger.sRingBufferSize);
                                    }
                                    if (i7 == 0) {
                                        Logger.startWorkerThreadIfNecessary();
                                        Logger.loggerWriteAndWakeupTraceWriter(Logger.sTraceWriter, j3, 40, A002, i6, j3);
                                    }
                                }
                                Logger.writeStandardEntry(0, 7, 94, 0, 0, traceContext.A07.A00("trace_config.logger_priority", 5), 0, traceContext.A05);
                                synchronized (this) {
                                    A02(this);
                                    if (A01(this, traceContext.A05) != null) {
                                        C04870Gk r4 = this.A00;
                                        synchronized (r4) {
                                            synchronized (r4.A00) {
                                                try {
                                                    C04830Gg r3 = r4.A00;
                                                    C04820Gf r6 = new C04820Gf(traceContext);
                                                    if (r6.A01) {
                                                        r3.A00.put(traceContext.A05, r6);
                                                    }
                                                } catch (Throwable th) {
                                                    while (true) {
                                                        th = th;
                                                        break;
                                                    }
                                                }
                                            }
                                            r4.A02.add(Long.valueOf(traceContext.A05));
                                            C09640bk r82 = r4.A01;
                                            if (r82 != null) {
                                                Class<TraceEvents> cls = TraceEvents.class;
                                                synchronized (cls) {
                                                    try {
                                                        if (TraceEvents.sInitialized) {
                                                            AnonymousClass0GY r32 = ProvidersRegistry.A00;
                                                            int A004 = r32.A00(r32.A01);
                                                            if (A004 != TraceEvents.sLastNameRefreshProvidersState) {
                                                                TraceEvents.sLastNameRefreshProvidersState = A004;
                                                                AnonymousClass0GY r2 = ProvidersRegistry.A00;
                                                                synchronized (r2.A01) {
                                                                    arrayList = new ArrayList<>(r2.A01);
                                                                }
                                                                int size = arrayList.size();
                                                                int[] iArr = new int[size];
                                                                String[] strArr = new String[size];
                                                                int i15 = 0;
                                                                for (String str : arrayList) {
                                                                    strArr[i15] = str;
                                                                    iArr[i15] = ProvidersRegistry.A00.A01(str);
                                                                    i15++;
                                                                }
                                                                TraceEvents.nativeRefreshProviderNames(iArr, strArr);
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Native library is not initialized.");
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        throw th;
                                                    }
                                                }
                                                int i16 = traceContext.A02;
                                                synchronized (cls) {
                                                    TraceEvents.sProviders = TraceEvents.nativeEnableProviders(i16);
                                                }
                                                synchronized (r82) {
                                                    try {
                                                        r7 = r82.A05;
                                                    } catch (Throwable th3) {
                                                        while (true) {
                                                            th = th3;
                                                            break;
                                                        }
                                                    }
                                                }
                                                synchronized (r82.A07) {
                                                    try {
                                                        for (AnonymousClass0GW A072 : r7) {
                                                            A072.A07(traceContext, r82);
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        throw th;
                                                    }
                                                }
                                            }
                                            AnonymousClass0ZA.A0D(r4, r4.obtainMessage(1, traceContext));
                                            AnonymousClass0ZA.A06(r4, r4.obtainMessage(0, traceContext), (long) A002);
                                        }
                                    }
                                }
                                return true;
                            }
                            throw new RuntimeException("ORDERING VIOLATION - ACQUIRED SLOT BUT SLOT NOT EMPTY");
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(AnonymousClass000.A05("Unregistered controller for id = ", i11));
            }
        }
        return false;
    }

    public static TraceContext A01(C04850Gi r6, long j) {
        if (r6.A01.get() != 0) {
            for (int i = 0; i < 2; i++) {
                TraceContext traceContext = (TraceContext) r6.A03.get(i);
                if (traceContext != null && traceContext.A05 == j) {
                    return traceContext;
                }
            }
        }
        return null;
    }

    public static void A02(C04850Gi r5) {
        AnonymousClass0Gl r2;
        HandlerThread handlerThread;
        if (r5.A00 == null) {
            C09640bk r3 = r5.A05;
            synchronized (AnonymousClass0Gl.class) {
                if (AnonymousClass0Gl.A01 == null) {
                    AnonymousClass0Gl.A01 = new AnonymousClass0Gl();
                }
                r2 = AnonymousClass0Gl.A01;
            }
            synchronized (r2) {
                if (r2.A00 == null) {
                    HandlerThread handlerThread2 = new HandlerThread("Prflo:TraceCtl");
                    r2.A00 = handlerThread2;
                    handlerThread2.start();
                }
                handlerThread = r2.A00;
            }
            r5.A00 = new C04870Gk(r3, handlerThread.getLooper());
        }
    }

    public final String A05(int i) {
        if (this.A01.get() != 0) {
            for (int i2 = 0; i2 < 2; i2++) {
                TraceContext traceContext = (TraceContext) this.A03.get(i2);
                if (traceContext != null) {
                    Object obj = traceContext.A09;
                    if ((obj instanceof AnonymousClass0GX) && ((AnonymousClass0GX) obj).Afx(traceContext.A04, traceContext.A08, i)) {
                        return traceContext.A0A;
                    }
                }
            }
        }
        return null;
    }

    public final List A06() {
        if (this.A01.get() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            TraceContext traceContext = (TraceContext) this.A03.get(i);
            if (traceContext != null) {
                arrayList.add(new TraceContext(traceContext));
            }
        }
        return arrayList;
    }

    public C04850Gi(SparseArray sparseArray, AnonymousClass0GC r4, C09640bk r5) {
        this.A04 = sparseArray;
        this.A02 = new AtomicReference(r4);
        this.A05 = r5;
    }

    public static void A03(C04850Gi r4, int i, int i2, long j, int i3) {
        TraceContext A002 = A00(r4, i, j);
        if (A002 != null) {
            A04(r4, A002);
            Log.w("Profilo/TraceControl", AnonymousClass000.A0E("STOP PROFILO_TRACEID: ", AnonymousClass0FO.A00(A002.A05)));
            synchronized (r4) {
                A02(r4);
                if (i2 == 0) {
                    Logger.postFinishTrace(38, A002.A05);
                    r4.A00.A00(new TraceContext(A002, i3));
                } else if (i2 == 1) {
                    Logger.postFinishTrace(61, A002.A05);
                    r4.A00.A01(A002);
                }
            }
        }
    }

    public final void A07(long j, int i) {
        TraceContext A012 = A01(this, j);
        if (A012 != null && A012.A05 == j) {
            A04(this, A012);
            synchronized (this) {
                A02(this);
                this.A00.A00(new TraceContext(A012, i));
            }
        }
    }
}
