package p000X;

/* renamed from: X.1j2  reason: invalid class name and case insensitive filesystem */
public final class C37051j2 implements Runnable {
    public final /* synthetic */ C15880ng A00;
    public final /* synthetic */ C28431Ls A01;

    public C37051j2(C28431Ls r1, C15880ng r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void run() {
        C28431Ls r0 = this.A01;
        if (r0.A00.containsKey(this.A00)) {
            C28431Ls r02 = this.A01;
            r02.A01.markerEnd(((Integer) r02.A00.get(this.A00)).intValue(), this.A00.A02, 344);
            this.A01.A00.remove(this.A00);
        }
    }
}
