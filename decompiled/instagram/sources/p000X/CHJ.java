package p000X;

/* renamed from: X.CHJ */
public final class CHJ {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "NOT_SPECIFIED";
            case 2:
                return "MIB";
            case 3:
                return "CIB";
            default:
                return "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
        }
    }
}
