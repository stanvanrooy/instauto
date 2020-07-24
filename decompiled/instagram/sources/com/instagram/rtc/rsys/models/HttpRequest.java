package com.instagram.rtc.rsys.models;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C2097091z;

public class HttpRequest {
    public static AnonymousClass921 CONVERTER = new C2097091z();
    public final String path;
    public final Map payload;
    public final String requestId;
    public final int requestType;

    public static native HttpRequest createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        if (!this.requestId.equals(httpRequest.requestId) || !this.path.equals(httpRequest.path) || this.requestType != httpRequest.requestType || !this.payload.equals(httpRequest.payload)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.requestId.hashCode()) * 31) + this.path.hashCode()) * 31) + this.requestType) * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "HttpRequest{requestId=" + this.requestId + "," + "path=" + this.path + "," + "requestType=" + this.requestType + "," + "payload=" + this.payload + "}";
    }

    public HttpRequest(String str, String str2, int i, Map map) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str2);
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(map);
        this.requestId = str;
        this.path = str2;
        this.requestType = i;
        this.payload = map;
    }
}
