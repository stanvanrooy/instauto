package com.instagram.debug.devoptions.sandboxselector;

import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;

public final class DevServerInfo__JsonHelper {
    public static boolean processSingleField(DevServerInfo devServerInfo, String str, C13080hr r6) {
        String str2 = null;
        if ("description".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            devServerInfo.setDescription(str2);
            return true;
        } else if ("host_type".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            devServerInfo.setHostType(str2);
            return true;
        } else if (!IgReactNavigatorModule.URL.equals(str)) {
            return false;
        } else {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            devServerInfo.setUrl(str2);
            return true;
        }
    }

    public static DevServerInfo parseFromJson(C13080hr r3) {
        DevServerInfo devServerInfo = new DevServerInfo();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(devServerInfo, A0i, r3);
            r3.A0f();
        }
        return devServerInfo;
    }

    public static DevServerInfo parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }
}
