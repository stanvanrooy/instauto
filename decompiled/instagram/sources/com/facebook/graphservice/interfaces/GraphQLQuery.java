package com.facebook.graphservice.interfaces;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0YD;

public class GraphQLQuery {
    public final HybridData mHybridData;

    public native int cacheTtlSeconds();

    public native int freshCacheTtlSeconds();

    public native boolean hasAnalyticsHints();

    public native String queryName();

    public native boolean terminateAfterFreshResponse();

    static {
        AnonymousClass0YD.A01("graphservice-jni");
    }

    public GraphQLQuery(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
