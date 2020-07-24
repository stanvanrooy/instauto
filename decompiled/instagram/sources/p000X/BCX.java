package p000X;

/* renamed from: X.BCX */
public final class BCX {
    public static final Object A01(Object obj, C233910f r2) {
        if (!(obj instanceof AnonymousClass2Hn)) {
            return obj;
        }
        Throwable th = ((AnonymousClass2Hn) obj).A00;
        if (AnonymousClass2GE.A03 && (r2 instanceof C234010g)) {
            th = BCW.A03(th, (C234010g) r2);
        }
        return AnonymousClass2I2.A00(th);
    }

    public static final Object A00(Object obj) {
        Throwable A00 = C50632Hb.A00(obj);
        if (A00 != null) {
            return new AnonymousClass2Hn(A00, false);
        }
        return obj;
    }
}
