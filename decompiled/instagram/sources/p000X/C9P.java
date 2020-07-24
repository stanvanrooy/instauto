package p000X;

/* renamed from: X.C9P */
public final class C9P {
    public static Integer A00(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.equalsIgnoreCase("ERROR")) {
                return Constants.ONE;
            }
            if (str.equalsIgnoreCase("AVAILABLE")) {
                return Constants.A0C;
            }
            if (str.equalsIgnoreCase("OLD_POST")) {
                return Constants.A0N;
            }
            if (str.equalsIgnoreCase("NOT_ENOUGH_REACH")) {
                return Constants.A0Y;
            }
            if (str.equalsIgnoreCase("EXPIRED")) {
                return Constants.A0j;
            }
            if (str.equalsIgnoreCase("UNTRACKED")) {
                return Constants.A0u;
            }
        }
        return Constants.ZERO;
    }
}
