package p000X;

import android.os.Process;

/* renamed from: X.BW5 */
public final class BW5 extends Thread {
    public final void run() {
        int myTid = Process.myTid();
        BW6 bw6 = BW6.A03;
        Integer valueOf = Integer.valueOf(myTid);
        synchronized (bw6) {
            if (valueOf != null) {
                bw6.A01.add(valueOf);
            }
        }
        super.run();
        synchronized (bw6) {
            if (valueOf != null) {
                bw6.A01.remove(valueOf);
                bw6.A00.remove(valueOf);
            }
        }
    }

    public BW5() {
    }

    public BW5(Runnable runnable) {
        super(runnable);
    }

    public BW5(Runnable runnable, String str) {
        super(runnable, str);
    }
}
