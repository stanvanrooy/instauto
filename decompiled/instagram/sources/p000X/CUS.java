package p000X;

/* renamed from: X.CUS */
public final class CUS {
    public static Integer A00(String str) {
        String str2;
        for (Integer num : Constants.ZERO(3)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "BUSINESS_MANAGER";
                    break;
                case 2:
                    str2 = "SHARED_WITH_BUSINESS";
                    break;
                default:
                    str2 = "FACEBOOK_PAGE";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        AnonymousClass0QD.A02("CatalogSource", AnonymousClass000.A0E("Unexpected review status: ", str));
        return Constants.ZERO;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "BUSINESS_MANAGER";
            case 2:
                return "SHARED_WITH_BUSINESS";
            default:
                return "FACEBOOK_PAGE";
        }
    }
}
