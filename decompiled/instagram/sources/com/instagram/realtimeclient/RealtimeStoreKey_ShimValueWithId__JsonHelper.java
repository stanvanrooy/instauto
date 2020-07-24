package com.instagram.realtimeclient;

import com.instagram.realtimeclient.RealtimeStoreKey;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;

public final class RealtimeStoreKey_ShimValueWithId__JsonHelper {
    public static boolean processSingleField(RealtimeStoreKey.ShimValueWithId shimValueWithId, String str, C13080hr r4) {
        String A0t;
        if (!"id".equals(str) && !"pk".equals(str) && !"item_id".equals(str)) {
            return false;
        }
        if (r4.A0g() == C13120hv.VALUE_NULL) {
            A0t = null;
        } else {
            A0t = r4.A0t();
        }
        shimValueWithId.f153id = A0t;
        return true;
    }

    public static RealtimeStoreKey.ShimValueWithId parseFromJson(C13080hr r3) {
        RealtimeStoreKey.ShimValueWithId shimValueWithId = new RealtimeStoreKey.ShimValueWithId();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(shimValueWithId, A0i, r3);
            r3.A0f();
        }
        return shimValueWithId;
    }

    public static RealtimeStoreKey.ShimValueWithId parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }
}
