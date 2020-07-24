package p000X;

/* renamed from: X.0kL  reason: invalid class name and case insensitive filesystem */
public final class C14370kL {
    public static void A00(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(AnonymousClass000.A0G(str, " cannot be negative but was: ", i));
        }
    }

    public static void A01(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}
