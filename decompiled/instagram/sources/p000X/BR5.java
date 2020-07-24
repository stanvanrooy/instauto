package p000X;

import android.os.HandlerThread;

/* renamed from: X.BR5 */
public final class BR5 {
    public static BR5 A01;
    public static final Object A02 = new Object();
    public final HandlerThread A00;

    public static BR5 A00() {
        BR5 br5;
        synchronized (A02) {
            if (A01 == null) {
                A01 = new BR5();
            }
            br5 = A01;
        }
        return br5;
    }

    public BR5() {
        HandlerThread handlerThread = new HandlerThread("bd_handler_thread", 10);
        this.A00 = handlerThread;
        handlerThread.start();
    }
}
