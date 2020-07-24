package p000X;

/* renamed from: X.Ac8 */
public final class Ac8 {
    public static String A00(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "GUEST_INITIATED";
            case 2:
                return "BROADCASTER_INITIATED";
            case 3:
                return "COBROADCAST_FINISH";
            case 4:
                return "BROADCAST_ENDED";
            case 5:
                return "USER_INITIATED";
            case 6:
                return C193418Ps.$const$string(25);
            case 7:
                return "INVALID_INVITATION";
            default:
                return "ERROR";
        }
    }
}
