package p000X;

/* renamed from: X.1Ac  reason: invalid class name and case insensitive filesystem */
public final class C25741Ac implements Runnable {
    public final /* synthetic */ AnonymousClass1AZ A00;

    public C25741Ac(AnonymousClass1AZ r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1AZ r1 = this.A00;
        if ((r1.A01 & 1) != 0) {
            r1.A0b(0);
        }
        AnonymousClass1AZ r12 = this.A00;
        if ((r12.A01 & 4096) != 0) {
            r12.A0b(108);
        }
        AnonymousClass1AZ r0 = this.A00;
        r0.A0R = false;
        r0.A01 = 0;
    }
}
