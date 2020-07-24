package com.instagram.debug.devoptions.sandboxselector;

import java.util.ArrayList;
import p000X.AnonymousClass1N4;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;

public final class DevServersResponse__JsonHelper {
    public static boolean processSingleField(DevServersResponse devServersResponse, String str, C13080hr r6) {
        if ("devserver_infos".equals(str)) {
            ArrayList arrayList = null;
            if (r6.A0g() == C13120hv.START_ARRAY) {
                arrayList = new ArrayList();
                while (r6.A0p() != C13120hv.END_ARRAY) {
                    DevServerInfo parseFromJson = DevServerInfo__JsonHelper.parseFromJson(r6);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            devServersResponse.devServers = arrayList;
            return true;
        } else if (!"is_internal".equals(str)) {
            return AnonymousClass1N4.A01(devServersResponse, str, r6);
        } else {
            devServersResponse.isInternal = r6.A0O();
            return true;
        }
    }

    public static DevServersResponse parseFromJson(C13080hr r3) {
        DevServersResponse devServersResponse = new DevServersResponse();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(devServersResponse, A0i, r3);
            r3.A0f();
        }
        return devServersResponse;
    }

    public static DevServersResponse parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }
}
