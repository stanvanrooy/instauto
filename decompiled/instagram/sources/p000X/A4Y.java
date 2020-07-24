package p000X;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;

/* renamed from: X.A4Y */
public final class A4Y implements Runnable {
    public final /* synthetic */ A4W A00;

    public final void run() {
        Process.setThreadPriority(-4);
        Looper.prepare();
        C23078A4z a4z = new C23078A4z();
        SystemClock.uptimeMillis();
        SystemClock.currentThreadTimeMillis();
        A4W a4w = this.A00;
        Pair pair = new Pair(Looper.myLooper(), a4z);
        if (a4w.A02.getCount() != 0) {
            a4w.A01 = pair;
            a4w.A02.countDown();
            Looper.loop();
            return;
        }
        throw new RuntimeException("Result has already been set!");
    }

    public A4Y(A4W a4w) {
        this.A00 = a4w;
    }
}
