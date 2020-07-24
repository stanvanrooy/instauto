package p000X;

/* renamed from: X.1n1  reason: invalid class name and case insensitive filesystem */
public final class C39501n1 implements Runnable {
    public final /* synthetic */ C39491n0 A00;

    public C39501n1(C39491n0 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C39491n0 r1 = this.A00;
        r1.A00 = true;
        r1.invalidateSelf();
    }
}
