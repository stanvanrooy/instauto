package p000X;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.0yX  reason: invalid class name and case insensitive filesystem */
public final class C22500yX implements C06560Pn {
    public final AnonymousClass0WC A00;

    public C22500yX(AnonymousClass0WC r1) {
        this.A00 = r1;
    }

    public final void Arz(C06590Pq r5) {
        AnonymousClass0RU A01 = AnonymousClass0WN.A01(r5);
        AnonymousClass0WC r2 = this.A00;
        if (A01 instanceof C06510Pi) {
            C06510Pi r1 = (C06510Pi) A01;
            r1.Bch(Constants.A0C);
            r1.BYt();
        }
        Iterator it = r2.A01.iterator();
        while (it.hasNext()) {
            C06510Pi r0 = (C06510Pi) ((WeakReference) it.next()).get();
            if (!(r0 == null || r0 == A01)) {
                r0.BYt();
            }
        }
    }

    public final void As0(C06590Pq r4) {
        AnonymousClass0RU A01 = AnonymousClass0WN.A01(r4);
        AnonymousClass0WC r1 = this.A00;
        if (!r1.A00) {
            r1.A00 = true;
            return;
        }
        Iterator it = r1.A01.iterator();
        while (it.hasNext()) {
            C06510Pi r0 = (C06510Pi) ((WeakReference) it.next()).get();
            if (!(r0 == null || r0 == A01)) {
                r0.BYs();
            }
        }
        if (A01 instanceof C06510Pi) {
            C06510Pi r2 = (C06510Pi) A01;
            r2.BYs();
            r2.Bch(Constants.ZERO);
        }
    }
}
