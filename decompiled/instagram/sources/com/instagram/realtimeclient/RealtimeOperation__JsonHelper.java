package com.instagram.realtimeclient;

import com.instagram.realtimeclient.RealtimeOperation;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;

public final class RealtimeOperation__JsonHelper {
    public static boolean processSingleField(RealtimeOperation realtimeOperation, String str, C13080hr r6) {
        if ("op".equals(str)) {
            realtimeOperation.f152op = RealtimeOperation.Type.valueOf(r6.A0t());
            return true;
        }
        String str2 = null;
        if ("path".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            realtimeOperation.path = str2;
            return true;
        } else if ("value".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            realtimeOperation.value = str2;
            return true;
        } else if (!"ts".equals(str)) {
            return false;
        } else {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            realtimeOperation.timestamp = str2;
            return true;
        }
    }

    public static RealtimeOperation parseFromJson(C13080hr r3) {
        RealtimeOperation realtimeOperation = new RealtimeOperation();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(realtimeOperation, A0i, r3);
            r3.A0f();
        }
        return realtimeOperation;
    }

    public static RealtimeOperation parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }
}
