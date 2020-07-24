package p000X;

/* renamed from: X.A8u */
public final class A8u {
    public static String A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                return "create";
            case 1:
                return "update";
            case 2:
                return "delete";
            default:
                if (num != null) {
                    switch (intValue) {
                        case 1:
                            str = "UPDATE";
                            break;
                        case 2:
                            str = "DELETE";
                            break;
                        default:
                            str = "CREATE";
                            break;
                    }
                } else {
                    str = "null";
                }
                throw new IllegalArgumentException(AnonymousClass000.A0E("Unsupported LayoutAnimationType: ", str));
        }
    }
}
