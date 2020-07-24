package p000X;

/* renamed from: X.B88 */
public final class B88 {
    public static Integer A00(int i) {
        int i2;
        for (Integer num : Constants.ZERO(3)) {
            switch (num.intValue()) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return num;
            }
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("Unexpected value for native TrackingState, value=");
        sb.append(i);
        throw new B84(sb.toString());
    }
}
