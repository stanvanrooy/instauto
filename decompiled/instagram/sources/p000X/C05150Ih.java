package p000X;

/* renamed from: X.0Ih  reason: invalid class name and case insensitive filesystem */
public final class C05150Ih {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PUSH_REGISTRATION";
            case 2:
                return "ANALYTICS_LOGGER";
            case 3:
                return "ACCOUNT_FAMILY_FETCHING";
            case 4:
                return "ACCOUNT_UNLINKING_PASSWORD_CREATION";
            case 5:
                return "ACCOUNT_FAMILY_CREATE";
            case 6:
                return "FETCH_MAIN_ACCOUNT_CONTACT_POINT";
            case 7:
                return "SECONDARY_ACCOUNT_CREATION";
            case 8:
                return "SECONDARY_ACCOUNT_CREATION_NONLINKING";
            case 9:
                return "UPLOAD_VIDEO";
            case 10:
                return "CONFIGURE_MEDIA";
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                return "GENERIC";
            default:
                return "UNIT_TESTS_ONLY";
        }
    }
}
