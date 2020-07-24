package com.instagram.debug.network;

import p000X.AnonymousClass12F;

public class DebugNetworkShapingRequestCallbackWrapper {
    public final NetworkShapingConfiguration mConfiguration;
    public final String mTag;

    public AnonymousClass12F maybeWrapCallback(AnonymousClass12F r4, String str) {
        if (!this.mConfiguration.isNetworkShapingOn()) {
            return r4;
        }
        return new NetworkShapingRequestCallback(r4, this.mConfiguration, str, this.mTag);
    }

    public DebugNetworkShapingRequestCallbackWrapper(NetworkShapingConfiguration networkShapingConfiguration, String str) {
        this.mTag = str;
        this.mConfiguration = networkShapingConfiguration;
    }
}
