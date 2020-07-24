package p000X;

/* renamed from: X.B32 */
public final class B32 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "android.test.canceled";
            case 2:
                return "android.test.refunded";
            case 3:
                return "android.test.item_unavailable";
            default:
                return "android.test.purchased";
        }
    }
}
