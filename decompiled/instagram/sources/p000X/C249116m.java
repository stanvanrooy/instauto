package p000X;

/* renamed from: X.16m  reason: invalid class name and case insensitive filesystem */
public final class C249116m implements Runnable {
    public final /* synthetic */ AnonymousClass16W A00;

    public C249116m(AnonymousClass16W r1) {
        this.A00 = r1;
    }

    public final void run() {
        synchronized (this.A00.A00) {
            this.A00.A00.A03 = true;
        }
        AnonymousClass14Q r3 = this.A00.A00;
        for (C105814hT r1 : r3.A0H.AYx()) {
            if (!AnonymousClass14Q.A0I(r3, r1, true)) {
                r3.A0P(r1.A04);
            }
        }
        AnonymousClass14Q r2 = this.A00.A00;
        synchronized (r2) {
            for (AnonymousClass17Q B7Q : r2.A0O) {
                B7Q.B7Q(r2);
            }
            r2.A0O.clear();
        }
        AnonymousClass14Q r0 = this.A00.A00;
        AnonymousClass1CQ r12 = new AnonymousClass1CQ(this);
        r0.A00 = r12;
        AnonymousClass0KT.A08.add(r12);
        AnonymousClass14Q.A09(this.A00.A00);
    }
}
