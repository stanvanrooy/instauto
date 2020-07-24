package p000X;

/* renamed from: X.0Sl  reason: invalid class name and case insensitive filesystem */
public final class C07280Sl implements Runnable {
    public final /* synthetic */ C10990eF A00;

    public C07280Sl(C10990eF r1) {
        this.A00 = r1;
    }

    public final void run() {
        this.A00.A0A.set(false);
        while (!this.A00.A09.isEmpty()) {
            ((Runnable) this.A00.A09.remove()).run();
        }
    }
}
