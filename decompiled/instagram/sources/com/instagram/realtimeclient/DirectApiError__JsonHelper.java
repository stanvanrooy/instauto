package com.instagram.realtimeclient;

import com.facebook.react.modules.dialog.DialogModule;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;

public final class DirectApiError__JsonHelper {
    public static boolean processSingleField(DirectApiError directApiError, String str, C13080hr r6) {
        String str2 = null;
        if ("error_type".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            directApiError.errorType = str2;
            return true;
        } else if ("description".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            directApiError.errorDescription = str2;
            return true;
        } else if (!DialogModule.KEY_TITLE.equals(str)) {
            return false;
        } else {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            directApiError.errorTitle = str2;
            return true;
        }
    }

    public static DirectApiError parseFromJson(C13080hr r3) {
        DirectApiError directApiError = new DirectApiError();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(directApiError, A0i, r3);
            r3.A0f();
        }
        return directApiError;
    }

    public static DirectApiError parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }
}
