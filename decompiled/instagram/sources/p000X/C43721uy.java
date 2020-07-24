package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.1uy  reason: invalid class name and case insensitive filesystem */
public final class C43721uy {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 0;
            case 5:
                return 10;
            case 6:
                return 11;
            case 7:
                return 12;
            case 8:
                return 13;
            default:
                return -1;
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DASH_VIDEO";
            case 2:
                return "DASH_AUDIO";
            case 3:
                return "DASH_TEXT";
            case 4:
                return "DASH_UNKNOWN";
            case 5:
                return "PROGRESSIVE";
            case 6:
                return "LIVE_VIDEO";
            case 7:
                return "LIVE_AUDIO";
            case 8:
                return "LIVE_MANIFEST";
            default:
                return NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
    }

    public static String A03(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DASH_VIDEO";
            case 2:
                return "DASH_AUDIO";
            case 3:
                return "DASH_TEXT";
            case 4:
                return "DASH_UNKNOWN";
            case 5:
                return "PROGRESSIVE";
            case 6:
                return "LIVE_VIDEO";
            case 7:
                return "LIVE_AUDIO";
            case 8:
                return "LIVE_MANIFEST";
            default:
                return NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
    }

    public static Integer A01(int i) {
        for (Integer num : Constants.ZERO(9)) {
            if (A00(num) == i) {
                return num;
            }
        }
        return Constants.ZERO;
    }
}
