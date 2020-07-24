package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.1s0  reason: invalid class name and case insensitive filesystem */
public final class C42241s0 {
    public static Integer A00(String str) {
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return Constants.ZERO;
        }
        if (str.equals("FACEBOOK_APPLICATION_WEB")) {
            return Constants.ONE;
        }
        if (str.equals("FACEBOOK_APPLICATION_NATIVE")) {
            return Constants.A0C;
        }
        if (str.equals("FACEBOOK_APPLICATION_SERVICE")) {
            return Constants.A0N;
        }
        if (str.equals("WEB_VIEW")) {
            return Constants.A0Y;
        }
        if (str.equals("TEST_USER")) {
            return Constants.A0j;
        }
        if (str.equals("CLIENT_TOKEN")) {
            return Constants.A0u;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FACEBOOK_APPLICATION_WEB";
            case 2:
                return "FACEBOOK_APPLICATION_NATIVE";
            case 3:
                return "FACEBOOK_APPLICATION_SERVICE";
            case 4:
                return "WEB_VIEW";
            case 5:
                return "TEST_USER";
            case 6:
                return "CLIENT_TOKEN";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
