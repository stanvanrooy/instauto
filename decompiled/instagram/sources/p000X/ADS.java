package p000X;

import android.content.Context;
import android.os.Process;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.ADS */
public final class ADS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C23159AAn A03;
    public final C23166AAu A04;
    public final FutureTask A05;
    public final AtomicInteger A06 = new AtomicInteger(-1);

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r2 == false) goto L_0x0041;
     */
    public final C23159AAn A00() {
        boolean z;
        RuntimeException runtimeException;
        if (this.A06.compareAndSet(-1, Process.myTid())) {
            this.A05.run();
            try {
                return (C23159AAn) this.A05.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        } else {
            FutureTask futureTask = this.A05;
            int i = this.A06.get();
            boolean z2 = true;
            int i2 = 0;
            boolean z3 = false;
            if (i != Process.myTid()) {
                z3 = true;
            }
            if (!futureTask.isDone()) {
                z = true;
            }
            z = false;
            if (!AnonymousClass2U1.A00() || !z) {
                z2 = false;
            } else {
                int threadPriority = Process.getThreadPriority(Process.myTid());
                i2 = Process.getThreadPriority(i);
                boolean z4 = false;
                while (!z4 && threadPriority < i2) {
                    try {
                        Process.setThreadPriority(i, threadPriority);
                        z4 = true;
                    } catch (SecurityException unused) {
                        threadPriority++;
                    }
                }
            }
            try {
                Object obj = futureTask.get();
                if (z2) {
                    try {
                        Process.setThreadPriority(i, i2);
                    } catch (IllegalArgumentException | SecurityException e2) {
                        throw new RuntimeException(AnonymousClass000.A07("Unable to restore priority: ", i, ", ", i2), e2);
                    }
                }
                return (C23159AAn) obj;
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                runtimeException = new RuntimeException(e3.getMessage(), e3);
            } catch (InterruptedException | CancellationException e4) {
                runtimeException = new RuntimeException(e4.getMessage(), e4);
            } catch (Throwable th) {
                if (z2) {
                    Process.setThreadPriority(i, i2);
                }
                throw th;
            }
        }
        throw runtimeException;
    }

    public ADS(Context context, Object obj, C23166AAu aAu, C23159AAn aAn, int i, int i2, int i3) {
        this.A04 = aAu;
        this.A03 = aAn;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A05 = new FutureTask(new C23212ADa(this, context, obj));
    }
}
