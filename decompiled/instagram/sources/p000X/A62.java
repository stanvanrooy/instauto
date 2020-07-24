package p000X;

/* renamed from: X.A62 */
public final class A62 {
    public static String A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                return "topScrollBeginDrag";
            case 1:
                return "topScrollEndDrag";
            case 2:
                return "topScroll";
            case 3:
                return "topMomentumScrollBegin";
            case 4:
                return "topMomentumScrollEnd";
            default:
                if (num != null) {
                    switch (intValue) {
                        case 1:
                            str = "END_DRAG";
                            break;
                        case 2:
                            str = "SCROLL";
                            break;
                        case 3:
                            str = "MOMENTUM_BEGIN";
                            break;
                        case 4:
                            str = "MOMENTUM_END";
                            break;
                        default:
                            str = "BEGIN_DRAG";
                            break;
                    }
                } else {
                    str = "null";
                }
                throw new IllegalArgumentException(AnonymousClass000.A0E("Unsupported ScrollEventType: ", str));
        }
    }
}
