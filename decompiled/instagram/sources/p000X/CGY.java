package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.CGY */
public final class CGY {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MIN_CPC_SUGGESTION";
            case 2:
                return NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
            default:
                return "NO_CONVERSION_WARNING";
        }
    }
}
