package com.facebook.cameracore.logging.spars.xplatimpl;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.C72233Eh;

public class XplatRawEventLogger {
    public final HybridData mHybridData = initHybrid();
    public final C72233Eh mLogWriter;

    private native HybridData initHybrid();

    static {
        AnonymousClass0Y1.A08("camera-xplat-spars-jni");
    }

    public void logEvent(String str, String str2) {
        this.mLogWriter.AlC(str, str2);
    }

    public XplatRawEventLogger(C72233Eh r2) {
        this.mLogWriter = r2;
    }
}
