package p000X;

/* renamed from: X.1eJ  reason: invalid class name and case insensitive filesystem */
public final class C34231eJ {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 15;
            default:
                return 0;
        }
    }

    public static final boolean A01(Integer num, int i) {
        int A00 = A00(num);
        if ((i & A00) == A00) {
            return true;
        }
        return false;
    }
}
