package p000X;

/* renamed from: X.BKk */
public final class BKk {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DIALOG_CANCEL";
            case 2:
                return "DIALOG_NOT_NEEDED";
            case 3:
                return "DIALOG_NOT_POSSIBLE";
            case 4:
                return "UNKNOWN_FAILURE";
            default:
                return "DIALOG_SUCCESS";
        }
    }
}
