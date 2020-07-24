package p000X;

/* renamed from: X.BU5 */
public final class BU5 {
    public static final ThreadLocal A00 = new ThreadLocal();
    public static final BU5 A01 = new BU5();

    public static final BU2 A00() {
        BU2 bu2 = (BU2) A00.get();
        if (bu2 != null) {
            return bu2;
        }
        BUA bua = new BUA(Thread.currentThread());
        A00.set(bua);
        return bua;
    }
}
