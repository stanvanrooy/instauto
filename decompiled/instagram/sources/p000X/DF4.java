package p000X;

/* renamed from: X.DF4 */
public final class DF4 {
    public static final Integer[] A00;

    static {
        Integer num = Constants.ZERO;
        Integer num2 = Constants.ONE;
        Integer num3 = Constants.A0C;
        A00 = new Integer[]{num2, num, Constants.A0N, num3};
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "M";
            case 2:
                return "Q";
            case 3:
                return "H";
            default:
                return "L";
        }
    }
}
