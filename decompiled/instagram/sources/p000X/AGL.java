package p000X;

/* renamed from: X.AGL */
public final class AGL {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "POST";
            case 2:
                return "ACCOUNT";
            case 3:
                return "PRODUCT";
            case 4:
                return "POST_GRID";
            case 5:
                return "STORY_GRID";
            case 6:
                return "PRODUCT_POST_GRID";
            case 7:
                return "PRODUCT_STORY_GRID";
            case 8:
                return "PRODUCT_CREATORS_LIST";
            case 9:
                return "MIXED_GRID";
            default:
                return "STORY";
        }
    }
}
