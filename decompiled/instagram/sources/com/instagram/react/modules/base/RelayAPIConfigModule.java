package com.instagram.react.modules.base;

import com.facebook.fbreact.specs.NativeRelayConfigSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A44;
import p000X.AnonymousClass1BE;
import p000X.C06360Ot;
import p000X.C06590Pq;
import p000X.C12800hP;
import p000X.C14100jl;
import p000X.C15300mf;

@ReactModule(name = "RelayAPIConfig")
public final class RelayAPIConfigModule extends NativeRelayConfigSpec {
    public static final String API_PATH = "/api/v1/ads/";
    public static final String GRAPHQL_URL = "%s%s/?locale=%s";
    public static final String MODULE_NAME = "RelayAPIConfig";
    public final C06590Pq mSession;

    public String getName() {
        return MODULE_NAME;
    }

    public Map getTypedExportedConstants() {
        String A01 = AnonymousClass1BE.A01(API_PATH);
        String A00 = C15300mf.A00();
        HashMap hashMap = new HashMap();
        if (C12800hP.A0J(this.mSession)) {
            hashMap.put("accessToken", C14100jl.A00(this.mSession));
            hashMap.put("actorID", C14100jl.A01(this.mSession));
        }
        hashMap.put("fetchTimeout", 30000);
        hashMap.put("retryDelays", 1000);
        hashMap.put("graphBatchURI", C06360Ot.formatString(GRAPHQL_URL, A01, "graphqlbatch", A00));
        hashMap.put("graphURI", C06360Ot.formatString(GRAPHQL_URL, A01, "graphql", A00));
        return hashMap;
    }

    public RelayAPIConfigModule(A44 a44, C06590Pq r2) {
        super(a44);
        this.mSession = r2;
    }
}
