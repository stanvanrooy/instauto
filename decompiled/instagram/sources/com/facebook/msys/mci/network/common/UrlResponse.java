package com.facebook.msys.mci.network.common;

import android.util.Pair;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;
import p000X.AnonymousClass920;
import p000X.C208928zC;

public class UrlResponse {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(UrlRequest urlRequest, int i, String[] strArr, String[] strArr2);

    static {
        C208928zC.A00();
    }

    public UrlResponse(UrlRequest urlRequest, int i, Map map) {
        AnonymousClass920.A00(urlRequest);
        AnonymousClass920.A00(map);
        String[] strArr = new String[map.size()];
        String[] strArr2 = new String[map.size()];
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        Pair pair = new Pair(strArr, strArr2);
        this.mNativeHolder = initNativeHolder(urlRequest, i, (String[]) pair.first, (String[]) pair.second);
    }
}
