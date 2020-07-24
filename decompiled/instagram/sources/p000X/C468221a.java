package p000X;

/* renamed from: X.21a  reason: invalid class name and case insensitive filesystem */
public final class C468221a {
    public static Integer A00() {
        char c;
        for (Integer num : Constants.ZERO(4)) {
            switch (num.intValue()) {
                case 1:
                    c = 1;
                    break;
                case 2:
                    c = 4;
                    break;
                case 3:
                    c = 5;
                    break;
                default:
                    c = 0;
                    break;
            }
            if (c == 0) {
                return num;
            }
        }
        return Constants.ZERO;
    }
}
