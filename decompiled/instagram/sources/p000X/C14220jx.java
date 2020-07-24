package p000X;

/* renamed from: X.0jx  reason: invalid class name and case insensitive filesystem */
public abstract class C14220jx {
    public static C11590fD A00;
    public static C14220jx A01;

    public abstract C33861dc A02(AnonymousClass1C3 r1);

    public static synchronized C14220jx A00() {
        C14220jx r0;
        synchronized (C14220jx.class) {
            if (A01 == null) {
                A01 = (C14220jx) A00.get();
            }
            r0 = A01;
        }
        return r0;
    }
}
