package p000X;

/* renamed from: X.1hA  reason: invalid class name and case insensitive filesystem */
public final class C35931hA {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "HEADERS_ARRIVED";
            case 2:
                return "BODY_ARRIVED";
            case 3:
                return "RESPONSE_COMPLETED";
            case 4:
                return "ERROR";
            default:
                return "NO_RESPONSE";
        }
    }
}
