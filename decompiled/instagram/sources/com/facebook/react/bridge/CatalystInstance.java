package com.facebook.react.bridge;

import p000X.A4U;
import p000X.ACE;
import p000X.AnonymousClass90F;
import p000X.AnonymousClass90O;
import p000X.C23046A1d;
import p000X.C23061A3s;
import p000X.C23072A4q;
import p000X.C23076A4w;

public interface CatalystInstance extends AnonymousClass90F, C23072A4q, AnonymousClass90O {
    void addBridgeIdleDebugListener(ACE ace);

    void callFunction(String str, String str2, NativeArray nativeArray);

    void destroy();

    C23076A4w getJSIModule(C23061A3s a3s);

    JavaScriptModule getJSModule(Class cls);

    NativeModule getNativeModule(Class cls);

    A4U getReactQueueConfiguration();

    String getSourceURL();

    void initialize();

    void invokeCallback(int i, C23046A1d a1d);

    boolean isDestroyed();

    void removeBridgeIdleDebugListener(ACE ace);
}
