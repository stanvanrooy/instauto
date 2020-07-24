package p000X;

/* renamed from: X.BR6 */
public final class BR6 implements Runnable {
    public final Runnable A00;

    public final void run() {
        try {
            this.A00.run();
        } catch (Throwable th) {
            C54802Yz.A00(th);
        }
    }

    public BR6(Runnable runnable) {
        this.A00 = runnable;
    }
}
