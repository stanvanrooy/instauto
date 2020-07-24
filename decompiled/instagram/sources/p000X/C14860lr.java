package p000X;

import android.os.Process;

/* renamed from: X.0lr  reason: invalid class name and case insensitive filesystem */
public final class C14860lr implements Runnable {
    public final Runnable A00;

    public final void run() {
        Process.setThreadPriority(10);
        this.A00.run();
    }

    public C14860lr(Runnable runnable) {
        this.A00 = runnable;
    }
}
