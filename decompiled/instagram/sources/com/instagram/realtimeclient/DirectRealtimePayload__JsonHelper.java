package com.instagram.realtimeclient;

import com.facebook.react.modules.dialog.DialogModule;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;

public final class DirectRealtimePayload__JsonHelper {
    public static boolean processSingleField(DirectRealtimePayload directRealtimePayload, String str, C13080hr r6) {
        String str2 = null;
        if ("client_request_id".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            directRealtimePayload.clientRequestId = str2;
            return true;
        } else if ("client_context".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            directRealtimePayload.clientContext = str2;
            return true;
        } else if ("item_id".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            directRealtimePayload.itemId = str2;
            return true;
        } else if ("thread_id".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            directRealtimePayload.threadId = str2;
            return true;
        } else if ("timestamp".equals(str)) {
            directRealtimePayload.timestamp = r6.A0J();
            return true;
        } else if ("count".equals(str)) {
            directRealtimePayload.count = Integer.valueOf(r6.A0I());
            return true;
        } else if (DialogModule.KEY_MESSAGE.equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            directRealtimePayload.message = str2;
            return true;
        } else if ("ttl".equals(str)) {
            directRealtimePayload.ttlMs = Long.valueOf(r6.A0J());
            return true;
        } else if (!"error".equals(str)) {
            return false;
        } else {
            directRealtimePayload.error = DirectApiError__JsonHelper.parseFromJson(r6);
            return true;
        }
    }

    public static DirectRealtimePayload parseFromJson(C13080hr r3) {
        DirectRealtimePayload directRealtimePayload = new DirectRealtimePayload();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(directRealtimePayload, A0i, r3);
            r3.A0f();
        }
        return directRealtimePayload;
    }

    public static DirectRealtimePayload parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }
}
