package p000X;

import android.os.Process;

/* renamed from: X.0Ss  reason: invalid class name and case insensitive filesystem */
public final class C07350Ss extends Thread {
    public final int A00 = 9;

    public C07350Ss(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(this.A00);
        super.run();
    }
}
