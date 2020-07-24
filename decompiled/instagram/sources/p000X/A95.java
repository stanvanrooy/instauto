package p000X;

/* renamed from: X.A95 */
public final class A95 {
    public Thread A00 = null;

    public final void A00() {
        Thread currentThread = Thread.currentThread();
        if (this.A00 == null) {
            this.A00 = currentThread;
        }
        boolean z = false;
        if (this.A00 == currentThread) {
            z = true;
        }
        AnonymousClass0FY.A02(z);
    }
}
