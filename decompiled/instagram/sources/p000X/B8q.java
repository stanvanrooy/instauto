package p000X;

/* renamed from: X.B8q */
public final class B8q {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "SHA-1";
            case 2:
                return "MD5";
            default:
                return "SHA-256";
        }
    }
}
