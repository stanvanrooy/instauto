package p000X;

/* renamed from: X.BCY */
public final class BCY {
    public static final void A00(AnonymousClass2HR r4, C233910f r5, int i) {
        Object A07;
        Object A06 = r4.A06();
        Object obj = A06;
        Throwable th = null;
        if (!(A06 instanceof AnonymousClass2Hn)) {
            obj = null;
        }
        AnonymousClass2Hn r2 = (AnonymousClass2Hn) obj;
        if (r2 != null) {
            th = r2.A00;
        }
        if (th == null) {
            th = null;
        } else if (AnonymousClass2GE.A03 && (r5 instanceof C234010g)) {
            th = BCW.A03(th, (C234010g) r5);
        }
        if (th != null) {
            A07 = AnonymousClass2I2.A00(th);
        } else {
            A07 = r4.A07(A06);
        }
        if (i == 0) {
            r5.Be0(A07);
        } else if (i == 1) {
            AnonymousClass2HU.A00(r5, A07);
        } else if (i != 2) {
            throw new IllegalStateException(AnonymousClass000.A05("Invalid mode ", i).toString());
        } else if (r5 != null) {
            AnonymousClass2HQ r52 = (AnonymousClass2HQ) r5;
            AnonymousClass2GC AIs = r52.AIs();
            Object A01 = AnonymousClass2HV.A01(AIs, r52.A01);
            try {
                r52.A02.Be0(A07);
            } finally {
                AnonymousClass2HV.A02(AIs, A01);
            }
        } else {
            throw new C183227s6("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        }
    }
}
