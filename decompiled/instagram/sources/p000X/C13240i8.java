package p000X;

/* renamed from: X.0i8  reason: invalid class name and case insensitive filesystem */
public final class C13240i8 {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    public static Integer A01(int i) {
        for (Integer num : Constants.ZERO(4)) {
            if (A00(num) == i) {
                return num;
            }
        }
        throw new IllegalArgumentException("Unsupported UserAccountType");
    }
}
