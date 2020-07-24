package p000X;

/* renamed from: X.AR2 */
public final class AR2 implements Runnable {
    public final /* synthetic */ AnonymousClass7E0 A00;

    public AR2(AnonymousClass7E0 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass7E0 r5 = this.A00;
        AnonymousClass0P4 A01 = AnonymousClass7E0.A01(r5, Constants.A0Y);
        long j = r5.A00 + 1;
        r5.A00 = j;
        A01.A0F("update_counter", Long.valueOf(j));
        AnonymousClass0WN.A01(r5.A0A).BcG(A01);
        AnonymousClass7E0.A03(this.A00);
    }
}
