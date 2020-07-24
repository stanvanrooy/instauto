package p000X;

/* renamed from: X.0Ej  reason: invalid class name and case insensitive filesystem */
public final class C04540Ej {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "anr_app_death";
            case 2:
                return "app_lifecycle";
            case 3:
                return "attribution_id";
            case 4:
                return "broadcast";
            case 5:
                return "java";
            case 6:
                return "crashloop";
            case 7:
                return "native";
            case 8:
                return "navigation";
            case 9:
                return "periodic";
            case 10:
                return "post_startup";
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                return "report_source";
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                return "soft_error";
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return "startup";
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return "unexplained";
            case 15:
                return "test";
            case 16:
                return "bug_report";
            default:
                return "anr";
        }
    }

    public static final boolean A01(Integer num) {
        switch (num.intValue()) {
            case 2:
            case 3:
            case 4:
            case 8:
            case 9:
            case 10:
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return true;
            default:
                return false;
        }
    }
}
