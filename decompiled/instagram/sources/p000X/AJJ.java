package p000X;

/* renamed from: X.AJJ */
public final class AJJ {
    public static final int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    public static final String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "nux";
            case 2:
                return "single_user_joined";
            case 3:
                return "multiple_users_joined";
            case 4:
                return "r2j_prompt";
            case 5:
                return "r2j_pending";
            case 6:
                return "guest_r2j";
            case 7:
                return "new_supporter";
            default:
                return "normal";
        }
    }
}
