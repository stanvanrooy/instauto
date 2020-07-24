package com.facebook.msys.mci.network.common;

import com.facebook.simplejni.NativeHolder;
import java.util.HashMap;
import java.util.Map;
import p000X.C208928zC;

public class UrlRequest {
    public final NativeHolder mNativeHolder;

    private native String[] getHeaderKeys();

    private native String[] getHeaderValues();

    public native byte[] getHttpBody();

    public native String getHttpMethod();

    public native String getUrl();

    public Map getHttpHeaders() {
        HashMap hashMap = new HashMap();
        String[] headerKeys = getHeaderKeys();
        String[] headerValues = getHeaderValues();
        if (!(headerKeys == null || headerValues == null)) {
            for (int i = 0; i < headerKeys.length; i++) {
                hashMap.put(headerKeys[i], headerValues[i]);
            }
        }
        return hashMap;
    }

    static {
        C208928zC.A00();
    }

    public UrlRequest(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
