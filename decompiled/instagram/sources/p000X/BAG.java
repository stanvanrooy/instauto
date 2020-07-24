package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.BAG */
public final class BAG {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FACEBOOK_PRELOAD_PROGRAM";
            case 2:
                return "FACEBOOK_DEVICE_OWNER";
            case 3:
                return "OCULUS";
            case 4:
                return "TRITIUM";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
