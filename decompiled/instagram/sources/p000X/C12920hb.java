package p000X;

/* renamed from: X.0hb  reason: invalid class name and case insensitive filesystem */
public final class C12920hb {
    public static int A00() {
        boolean z;
        int i = 0;
        for (Integer intValue : Constants.ZERO(8)) {
            int intValue2 = intValue.intValue();
            switch (intValue2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                i |= 1 << intValue2;
            }
        }
        return i;
    }
}
