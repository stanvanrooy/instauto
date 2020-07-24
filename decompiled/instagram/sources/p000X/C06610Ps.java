package p000X;

/* renamed from: X.0Ps  reason: invalid class name and case insensitive filesystem */
public enum C06610Ps {
    NONE,
    ALPHA,
    BETA,
    PROD;
    
    public static AnonymousClass0IT A00;
    public static C06610Ps A01;

    public static synchronized C06610Ps A00() {
        C06610Ps r0;
        Class<C06610Ps> cls = C06610Ps.class;
        synchronized (cls) {
            AnonymousClass0IT r2 = A00;
            if (r2 == null) {
                AnonymousClass0DB.A03(cls, "Release Channel not set yet");
                r0 = NONE;
            } else {
                C06610Ps r1 = A01;
                if (r1 == null || r1 == NONE) {
                    A01 = (C06610Ps) r2.get();
                }
                r0 = A01;
            }
        }
        return r0;
    }

    public static boolean A01() {
        if (A00() == ALPHA) {
            return true;
        }
        return false;
    }

    public static boolean A02() {
        if (A00() == BETA) {
            return true;
        }
        return false;
    }
}
