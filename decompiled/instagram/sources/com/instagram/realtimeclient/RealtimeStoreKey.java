package com.instagram.realtimeclient;

import p000X.AnonymousClass000;

public class RealtimeStoreKey {

    public class ShimValueWithId {

        /* renamed from: id */
        public String f153id;
    }

    public static String getKey(RealtimeOperation realtimeOperation) {
        String str;
        String str2 = realtimeOperation.path;
        if (!str2.startsWith(RealtimeProtocol.DIRECT_V2)) {
            ShimValueWithId shimValueWithId = null;
            try {
                shimValueWithId = RealtimeStoreKey_ShimValueWithId__JsonHelper.parseFromJson(realtimeOperation.value);
            } catch (Exception unused) {
            }
            if (!(shimValueWithId == null || (str = shimValueWithId.f153id) == null)) {
                return AnonymousClass000.A0J(str2, "/", str);
            }
        }
        return str2;
    }
}
