package p000X;

/* renamed from: X.BAF */
public final class BAF {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DISABLED";
            case 2:
                return "ACTIVE";
            default:
                return "MISSING";
        }
    }
}
