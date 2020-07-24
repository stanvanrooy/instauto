package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.0o4  reason: invalid class name and case insensitive filesystem */
public final class C16120o4 {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "cold_start_fetch";
            case 2:
                return "warm_start_fetch";
            case 3:
                return "pull_to_refresh";
            case 4:
                return "new_follow";
            case 5:
                return "warm_start_on_screen";
            case 6:
                return "find_new_friends";
            case 7:
                return "pagination";
            case 8:
                return "checkpoint_shown";
            case 9:
                return "pill_refresh";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE;
        }
    }
}
