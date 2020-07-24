package p000X;

/* renamed from: X.D6U */
public final class D6U {
    public static void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void A01(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    public static void A02(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A03(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void A04(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
