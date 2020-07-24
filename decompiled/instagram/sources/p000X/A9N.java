package p000X;

/* renamed from: X.A9N */
public final class A9N {
    public static A9E A00;
    public static final Object A01 = new Object();

    public static A9E A00() {
        A9E a9e;
        A9E a9e2 = A00;
        if (a9e2 != null) {
            return a9e2;
        }
        synchronized (A01) {
            if (A00 == null) {
                A00 = new A9E();
            }
            a9e = A00;
        }
        return a9e;
    }
}
