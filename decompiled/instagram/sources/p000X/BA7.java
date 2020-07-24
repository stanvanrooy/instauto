package p000X;

/* renamed from: X.BA7 */
public final class BA7 {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TosFlow{shouldAcceptTos=");
        sb.append(this.A01);
        sb.append(", shouldShowExplicitTos=");
        sb.append(this.A02);
        sb.append(", reason=");
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "EXPLICIT_COMPONENT_STATE";
                    break;
                case 2:
                    str = "DEFAULT_COMPONENT_STATE";
                    break;
                case 3:
                    str = "UNEXPECTED_SIGNATURES_STATE";
                    break;
                case 4:
                    str = "APPMANAGER_NOT_INSTALLED";
                    break;
                case 5:
                    str = "FALLBACK_V13_NO_SIM";
                    break;
                case 6:
                    str = "FALLBACK_V13_EU_CANADA";
                    break;
                case 7:
                    str = "FALLBACK_V13_OUTSIDE_EU_CANADA";
                    break;
                case 8:
                    str = "EXPLICIT_DECISION";
                    break;
                default:
                    str = "PACKAGE_MANAGER_ERROR";
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public BA7(boolean z, boolean z2, Integer num) {
        this.A01 = z;
        this.A02 = z2;
        this.A00 = num;
    }
}
