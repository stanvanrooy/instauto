package p000X;

/* renamed from: X.BCZ */
public final class BCZ {
    public static final String A02(C233910f r3) {
        Object obj;
        if (r3 instanceof AnonymousClass2HQ) {
            return r3.toString();
        }
        try {
            obj = r3 + '@' + A01(r3);
        } catch (Throwable th) {
            obj = AnonymousClass2I2.A00(th);
        }
        if (C50632Hb.A00(obj) != null) {
            obj = AnonymousClass000.A03(r3.getClass().getName(), '@', A01(r3));
        }
        return (String) obj;
    }

    public static final String A00(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String A01(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }
}
