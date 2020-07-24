package p000X;

/* renamed from: X.BU3 */
public abstract class BU3 extends BU2 {
    public Thread A08() {
        Thread thread;
        if (!(this instanceof BU0)) {
            return ((BUA) this).A00;
        }
        BU0 bu0 = (BU0) this;
        Thread thread2 = BU0._thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (bu0) {
            thread = BU0._thread;
            if (thread == null) {
                thread = new Thread(bu0, "kotlinx.coroutines.DefaultExecutor");
                BU0._thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }
}
