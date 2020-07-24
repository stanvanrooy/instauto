package p000X;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.mmapbuf.MmapBufferManager;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0bk  reason: invalid class name and case insensitive filesystem */
public final class C09640bk implements AnonymousClass0GU, NativeTraceWriterCallbacks, AnonymousClass0H9 {
    public static AtomicReference A0D = new AtomicReference((Object) null);
    public AnonymousClass0GD A00;
    public AnonymousClass0GV A01;
    public AnonymousClass0H6 A02;
    public MmapBufferManager A03;
    public AnonymousClass0GW[] A04;
    public AnonymousClass0GW[] A05;
    public final AnonymousClass06C A06;
    public final Object A07 = new Object();
    public final String A08;
    public final boolean A09;
    public final HashMap A0A;
    public final Random A0B;
    public volatile AnonymousClass0GC A0C;

    private void A02(File file, File file2, File file3, int i, long j) {
        AnonymousClass0H5 r5;
        synchronized (this) {
            boolean z = false;
            if ((i & 3) == 0) {
                z = true;
            }
            AnonymousClass0H6 r4 = this.A02;
            String name = file2.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf != -1) {
                name = name.substring(0, lastIndexOf);
            }
            String A0E = AnonymousClass000.A0E(name, ".log");
            if (!z) {
                A0E = AnonymousClass000.A0E("override-", A0E);
            }
            File file4 = r4.A05;
            if (file4.isDirectory() || file4.mkdirs()) {
                if (file2.renameTo(new File(file4, A0E))) {
                    r4.A02.A00++;
                } else {
                    r4.A02.A03++;
                }
                AnonymousClass0H6.A02(r4, file4, r4.A06, r4.A01);
                AnonymousClass0H6.A01(r4, r4.A06, r4.A00, AnonymousClass0H6.A07, AnonymousClass0H6.A08);
            } else {
                r4.A02.A01++;
            }
            A04();
            AnonymousClass0H6 r1 = this.A02;
            r5 = r1.A02;
            r1.A02 = new AnonymousClass0H5();
        }
        AnonymousClass8MJ.A01(file3);
        this.A06.BSE(file, j);
        this.A06.BSF(r5.A02 + r5.A03 + r5.A01 + r5.A04, r5.A06, r5.A05, r5.A00);
    }

    public final void A04() {
        AnonymousClass0GV r5;
        synchronized (this) {
            r5 = this.A01;
        }
        if (r5 != null) {
            AnonymousClass0H6 r4 = this.A02;
            File file = r4.A05;
            AnonymousClass0H6.A02(r4, file, r4.A06, r4.A01);
            List A002 = AnonymousClass0H6.A00(file, AnonymousClass0H6.A07);
            Collections.sort(A002, new AnonymousClass0H2(r4));
            r5.BtZ(A002, this);
            AnonymousClass0H6 r2 = this.A02;
            List A003 = AnonymousClass0H6.A00(r2.A05, AnonymousClass0H6.A08);
            Collections.sort(A003, new AnonymousClass0H3(r2));
            r5.Bta(A003, this);
        }
    }

    public final void A05(AnonymousClass0GD r3) {
        synchronized (this) {
            try {
                if (!r3.equals(this.A00)) {
                    this.A06.BCr();
                    synchronized (this) {
                        try {
                            this.A00 = r3;
                            A01(this, r3.AML());
                        } catch (Throwable th) {
                            while (true) {
                                th = th;
                                break;
                            }
                        }
                    }
                    this.A06.Axt();
                    return;
                }
                return;
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                }
            }
        }
        throw th;
    }

    public final synchronized void A06(AnonymousClass0GV r2) {
        if (this.A01 != r2) {
            this.A01 = r2;
            if (!(r2 == null || this.A0C == null)) {
                this.A0C.AXX();
            }
            A04();
        }
    }

    public final void BTi(File file) {
        synchronized (this) {
            AnonymousClass0H6 r5 = this.A02;
            if (AnonymousClass0H6.A03(r5, file, new File(r5.A06, file.getName()))) {
                AnonymousClass0H6.A01(r5, r5.A06, r5.A00, AnonymousClass0H6.A07, AnonymousClass0H6.A08);
            }
        }
        this.A06.BTi(file);
    }

    public C09640bk(Context context, AnonymousClass0GD r8, AnonymousClass0GW[] r9) {
        this.A00 = r8;
        this.A0C = null;
        this.A02 = new AnonymousClass0H6(context);
        this.A01 = null;
        this.A0B = new Random();
        this.A06 = new AnonymousClass06C();
        this.A08 = "main";
        this.A09 = true;
        this.A0A = new HashMap(2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AnonymousClass0GW r1 : r9) {
            if (r1.A08()) {
                arrayList.add(r1);
            } else {
                arrayList2.add(r1);
            }
        }
        this.A04 = (AnonymousClass0GW[]) arrayList2.toArray(new AnonymousClass0GW[arrayList2.size()]);
        this.A05 = (AnonymousClass0GW[]) arrayList.toArray(new AnonymousClass0GW[arrayList.size()]);
    }

    public static C09640bk A00() {
        C09640bk r0 = (C09640bk) A0D.get();
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("TraceOrchestrator has not been initialized");
    }

    public static void A01(C09640bk r3, AnonymousClass0GC r4) {
        AnonymousClass0GV r0;
        if (!r4.equals(r3.A0C)) {
            r3.A0C = r4;
            C04850Gi r2 = C04850Gi.A07;
            if (r2 != null) {
                r2.A02.compareAndSet((AnonymousClass0GC) r2.A02.get(), r4);
                synchronized (r3) {
                    r0 = r3.A01;
                }
                if (r0 != null) {
                    r4.AXX();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Performing config change before TraceControl has been initialized");
        }
    }

    public final File A03(TraceContext traceContext, AnonymousClass0GW r9) {
        File file;
        if ((traceContext.A03 & 2) == 0) {
            Set A032 = ProvidersRegistry.A00.A03(r9.getSupportedProviders());
            if (!A032.isEmpty()) {
                synchronized (this) {
                    file = this.A02.A06;
                }
                File file2 = new File(new File(file, traceContext.A0A.replaceAll("[^a-zA-Z0-9\\-_.]", "_")), "extra");
                if (!file2.isDirectory() && !file2.mkdirs()) {
                    Log.w("Profilo/TraceOrchestrator", "Failed to create extra data file! This could be because another process created it");
                    if (!file2.exists() || !file2.isDirectory()) {
                        return null;
                    }
                }
                return new File(file2, this.A08 + "-" + Process.myPid() + "-" + ((String) A032.iterator().next()));
            }
        }
        return null;
    }

    public final void B9x(Throwable th) {
        this.A06.B9x(th);
    }

    public final void BTf(File file, int i) {
        this.A06.BTf(file, i);
    }

    public final void onTraceWriteAbort(long j, int i) {
        long j2;
        AnonymousClass0HB r4;
        AnonymousClass0GC r1;
        int AYI;
        synchronized (this.A0A) {
            try {
                HashMap hashMap = this.A0A;
                j2 = j;
                Long valueOf = Long.valueOf(j);
                r4 = (AnonymousClass0HB) hashMap.get(valueOf);
                if (r4 != null) {
                    this.A0A.remove(valueOf);
                } else {
                    throw new IllegalStateException("onTraceWriteAbort can't be called without onTraceWriteStart");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
        this.A06.onTraceWriteAbort(j, i);
        Log.w("Profilo/TraceOrchestrator", AnonymousClass000.A0E("Trace is aborted with code: ", C04790Ga.A00(i)));
        C04850Gi r0 = C04850Gi.A07;
        if (r0 != null) {
            r0.A07(j, i);
            if (this.A09) {
                File file = r4.A01;
                if (file.exists()) {
                    File parentFile = file.getParentFile();
                    synchronized (this) {
                        try {
                            r1 = this.A0C;
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    boolean z = false;
                    if (r1 != null && i == 4 && (AYI = r1.AJ0().AYI()) != 0 && this.A0B.nextInt(AYI) == 0) {
                        z = true;
                    }
                    if (!z && !file.delete()) {
                        Log.e("Profilo/TraceOrchestrator", "Could not delete aborted trace");
                    }
                    if (!z) {
                        AnonymousClass8MJ.A01(parentFile);
                        return;
                    }
                    A02(file, file, parentFile, r4.A00, j2);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("No TraceControl when cleaning up aborted trace");
    }

    public final void onTraceWriteEnd(long j) {
        long j2;
        AnonymousClass0HB r5;
        File file;
        synchronized (this.A0A) {
            HashMap hashMap = this.A0A;
            j2 = j;
            Long valueOf = Long.valueOf(j);
            r5 = (AnonymousClass0HB) hashMap.get(valueOf);
            if (r5 != null) {
                this.A0A.remove(valueOf);
            } else {
                throw new IllegalStateException("onTraceWriteEnd can't be called without onTraceWriteStart");
            }
        }
        this.A06.onTraceWriteEnd(j);
        File file2 = r5.A01;
        if (file2.exists() && this.A09) {
            File parentFile = file2.getParentFile();
            boolean z = true;
            if (!parentFile.isDirectory() || parentFile.list().length <= 1) {
                z = false;
            }
            if (z) {
                file = AnonymousClass8MJ.A00(parentFile);
                File file3 = new File(file.getParentFile(), AnonymousClass000.A0J(new SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ss", Locale.US).format(new Date()), "-", file.getName()));
                if (file.renameTo(file3)) {
                    file = file3;
                }
                AnonymousClass8MJ.A01(parentFile);
            } else {
                file = file2;
            }
            A02(file2, file, parentFile, r5.A00, j2);
        }
    }

    public final void onTraceWriteStart(long j, int i, String str) {
        Long valueOf;
        AnonymousClass0HB r0;
        synchronized (this.A0A) {
            try {
                HashMap hashMap = this.A0A;
                valueOf = Long.valueOf(j);
                r0 = (AnonymousClass0HB) hashMap.get(valueOf);
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        if (r0 == null) {
            this.A06.onTraceWriteStart(j, i, str);
            synchronized (this.A0A) {
                try {
                    this.A0A.put(valueOf, new AnonymousClass0HB(i, new File(str)));
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            return;
        }
        throw new IllegalStateException("Trace already registered on start");
    }
}
