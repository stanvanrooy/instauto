package com.facebook.gputimer;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;
import p000X.C64302rG;

public class GPUTimerImpl implements C64302rG {
    public static final Class TAG = GPUTimerImpl.class;
    public HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native void beginFrame();

    public native void beginMarker(int i);

    public native int createTimerHandle(String str);

    public native void endFrame();

    public native void endMarker();

    static {
        try {
            AnonymousClass0Y1.A08("gputimer-jni");
        } catch (UnsatisfiedLinkError e) {
            AnonymousClass0DB.A0B(TAG, e, "Failed to load: %s", "gputimer-jni");
        }
    }
}
