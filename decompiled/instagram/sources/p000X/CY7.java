package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.CY7 */
public final class CY7 {
    public static final CY7 A02 = new CY7(Constants.ZERO, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public static final CY7 A03 = new CY7(Constants.ONE, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public final float A00;
    public final Integer A01;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(' ');
        Integer num = this.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "PIXEL";
                    break;
                case 2:
                    str = "DP";
                    break;
                default:
                    str = "UNSET";
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        return sb.toString();
    }

    public CY7(Integer num, float f) {
        this.A01 = num;
        this.A00 = f;
    }
}
