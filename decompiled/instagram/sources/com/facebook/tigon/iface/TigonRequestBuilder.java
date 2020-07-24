package com.facebook.tigon.iface;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p000X.DSV;
import p000X.DSW;
import p000X.DSX;

public class TigonRequestBuilder {
    public Map A00 = new HashMap();
    public Map A01;

    public static TigonRequest create(String str, String str2, String[] strArr, int i, boolean z, FacebookLoggingRequestInfo facebookLoggingRequestInfo) {
        TigonRequestBuilder tigonRequestBuilder = new TigonRequestBuilder();
        int length = strArr.length;
        if ((length & 1) == 0) {
            for (int i2 = 0; i2 < length; i2 += 2) {
                String str3 = strArr[i2];
                String str4 = strArr[i2 + 1];
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    tigonRequestBuilder.A00.put(str3, str4);
                }
            }
            if (facebookLoggingRequestInfo != null) {
                DSX dsx = DSW.A03;
                if (tigonRequestBuilder.A01 == null) {
                    tigonRequestBuilder.A01 = new HashMap();
                }
                tigonRequestBuilder.A01.put(dsx, facebookLoggingRequestInfo);
            }
            return new DSV(tigonRequestBuilder);
        }
        throw new IllegalArgumentException("must have even number of flattened headers");
    }
}
