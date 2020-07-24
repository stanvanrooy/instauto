package p000X;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.0Ko  reason: invalid class name and case insensitive filesystem */
public final class C05450Ko implements AnonymousClass0OT {
    public boolean A00 = false;
    public final int A01;
    public final C06180Ob A02;
    public final String A03;
    public final AnonymousClass0OT A04;
    public final Queue A05 = new ConcurrentLinkedQueue();

    public static void A00(C05450Ko r2) {
        C05490Kt r1;
        synchronized (r2) {
            if (!r2.A00 && (r1 = (C05490Kt) r2.A05.poll()) != null) {
                r2.A00 = true;
                r2.A04.ADc(r1);
            }
        }
    }

    public final void ADb(AnonymousClass0OC r2) {
        throw new UnsupportedOperationException();
    }

    public final void ADc(AnonymousClass0O9 r3) {
        this.A05.add(new C05490Kt(this, r3));
        A00(this);
    }

    public C05450Ko(AnonymousClass0O1 r2) {
        this.A02 = r2.A02;
        this.A03 = r2.A01;
        this.A04 = r2.A03;
        this.A01 = r2.A00;
    }
}
