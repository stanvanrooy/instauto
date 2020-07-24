package com.facebook.flipper.android;

import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.jni.HybridData;

public class FlipperConnectionImpl {
    public final HybridData mHybridData;

    public native void receive(String str, FlipperReceiver flipperReceiver);

    public native void reportError(Throwable th);

    public native void reportErrorWithMetadata(String str, String str2);

    public native void sendArray(String str, FlipperArray flipperArray);

    public native void sendObject(String str, FlipperObject flipperObject);

    public FlipperConnectionImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
