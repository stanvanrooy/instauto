package com.instagram.realtimeclient;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.DirectRealtimePayload;
import com.instagram.realtimeclient.RealtimeEvent;
import java.util.ArrayList;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;

public final class RealtimeEvent__JsonHelper {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static boolean processSingleField(RealtimeEvent realtimeEvent, String str, C13080hr r6) {
        if ("event".equals(str)) {
            realtimeEvent.type = RealtimeEvent.Type.fromServerValue(r6.A0t());
            return true;
        }
        ? r2 = 0;
        if ("topic".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                r2 = r6.A0t();
            }
            realtimeEvent.topic = r2;
            return true;
        } else if ("must_refresh".equals(str)) {
            realtimeEvent.mustRefresh = r6.A0O();
            return true;
        } else if ("sequence".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                r2 = r6.A0t();
            }
            realtimeEvent.sequence = r2;
            return true;
        } else if ("interval".equals(str)) {
            realtimeEvent.interval = r6.A0H();
            return true;
        } else if ("data".equals(str)) {
            if (r6.A0g() == C13120hv.START_ARRAY) {
                ArrayList arrayList = new ArrayList();
                while (r6.A0p() != C13120hv.END_ARRAY) {
                    RealtimeOperation parseFromJson = RealtimeOperation__JsonHelper.parseFromJson(r6);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
                r2 = arrayList;
            }
            realtimeEvent.operations = r2;
            return true;
        } else if ("id".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                r2 = r6.A0t();
            }
            realtimeEvent.f151id = r2;
            return true;
        } else if (DialogModule.KEY_MESSAGE.equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                r2 = r6.A0t();
            }
            realtimeEvent.message = r2;
            return true;
        } else if ("code".equals(str)) {
            realtimeEvent.code = Integer.valueOf(r6.A0I());
            return true;
        } else if ("action".equals(str)) {
            realtimeEvent.action = DirectRealtimePayload.Action.fromServerValue(r6.A0t());
            return true;
        } else if (RealtimeProtocol.USERS_ACCOUNT_STATUS.equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                r2 = r6.A0t();
            }
            realtimeEvent.status = r2;
            return true;
        } else if (TraceFieldType.StatusCode.equals(str)) {
            realtimeEvent.statusCode = Integer.valueOf(r6.A0I());
            return true;
        } else if (!IgReactPurchaseExperienceBridgeModule.RN_AUTH_PTT_DATA_PAYLOAD_KEY.equals(str)) {
            return false;
        } else {
            realtimeEvent.payload = DirectRealtimePayload__JsonHelper.parseFromJson(r6);
            return true;
        }
    }

    public static RealtimeEvent parseFromJson(C13080hr r3) {
        RealtimeEvent realtimeEvent = new RealtimeEvent();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(realtimeEvent, A0i, r3);
            r3.A0f();
        }
        return realtimeEvent;
    }

    public static RealtimeEvent parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }
}
