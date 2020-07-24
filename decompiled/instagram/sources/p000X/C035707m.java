package p000X;

/* renamed from: X.07m  reason: invalid class name and case insensitive filesystem */
public abstract class C035707m {
    public static boolean A01(AnonymousClass00N r7, AnonymousClass00N r8) {
        boolean equals;
        if (r7 != r8) {
            int size = r7.size();
            if (size == r8.size()) {
                int i = 0;
                while (i < size) {
                    Object A06 = r7.A06(i);
                    Object A08 = r7.A08(i);
                    Object obj = r8.get(A06);
                    if (A08 != null) {
                        equals = A08.equals(obj);
                    } else if (obj == null) {
                        equals = r8.containsKey(A06);
                    }
                    if (equals) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Null value passed to getSnapshot!");
        }
    }
}
