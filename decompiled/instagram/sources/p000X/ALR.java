package p000X;

/* renamed from: X.ALR */
public final class ALR {
    public static final String A00(Integer num) {
        if (1 - num.intValue() != 0) {
            return "host_invite";
        }
        return "guest_request";
    }
}
