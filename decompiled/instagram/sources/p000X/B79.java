package p000X;

import android.os.Process;

/* renamed from: X.B79 */
public final class B79 implements Runnable {
    public final Runnable A00;

    public final void run() {
        Process.setThreadPriority(0);
        this.A00.run();
    }

    public B79(Runnable runnable) {
        this.A00 = runnable;
    }
}
