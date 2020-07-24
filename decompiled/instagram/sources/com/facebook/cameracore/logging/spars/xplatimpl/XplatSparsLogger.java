package com.facebook.cameracore.logging.spars.xplatimpl;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass3CM;
import p000X.C1898289g;
import p000X.C72233Eh;
import p000X.C72243Ej;
import p000X.C72253El;
import p000X.C72263Em;
import p000X.C72273En;

public class XplatSparsLogger implements C72243Ej {
    public static Boolean sEnabled;
    public final HybridData mHybridData = initHybrid();

    public static native boolean consistencyHelperHasError();

    public static native int consistencyHelperNumProcessedSessions();

    public static native void debugExpectSessionOpen(String str);

    public static native void flushConsistencyHelper();

    public static native HybridData initHybrid();

    public static native void toggleConsistencyHelper(boolean z);

    public native void logSessionClosureNative(String str, boolean z);

    public native void logSessionCreationNative(String str, String str2, String str3, String str4, String str5, boolean z, String str6);

    public native void setRawEventLogger(XplatRawEventLogger xplatRawEventLogger);

    static {
        AnonymousClass0Y1.A08("camera-xplat-spars-jni");
    }

    public static C72243Ej makeInstanceImpl(XplatRawEventLogger xplatRawEventLogger) {
        if (!sEnabled.booleanValue()) {
            return new C1898289g();
        }
        if (xplatRawEventLogger == null) {
            return new XplatSparsLogger();
        }
        return new XplatSparsLogger(xplatRawEventLogger);
    }

    public void logSessionClosure(String str, boolean z) {
        logSessionClosureNative(str, z);
    }

    public void logSessionCreation(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        logSessionCreationNative(str, str2, str3, str4, str5, z, str6);
    }

    public XplatSparsLogger() {
    }

    public XplatSparsLogger(XplatRawEventLogger xplatRawEventLogger) {
        setRawEventLogger(xplatRawEventLogger);
    }

    public static C72243Ej makeInstance(AnonymousClass3CM r0) {
        setupQuickExperiment(r0);
        return makeInstanceImpl((XplatRawEventLogger) null);
    }

    public static C72243Ej makeInstance(AnonymousClass3CM r0, C72233Eh r1) {
        setupQuickExperiment(r0);
        return makeInstanceImpl(new XplatRawEventLogger(r1));
    }

    public static C72243Ej makeInstance(AnonymousClass3CM r0, XplatRawEventLogger xplatRawEventLogger) {
        setupQuickExperiment(r0);
        return makeInstanceImpl(xplatRawEventLogger);
    }

    public static C72243Ej makeInstance(C72273En r0) {
        setupQuickExperiment(r0);
        return makeInstanceImpl((XplatRawEventLogger) null);
    }

    public static C72243Ej makeInstance(C72273En r0, C72233Eh r1) {
        setupQuickExperiment(r0);
        return makeInstanceImpl(new XplatRawEventLogger(r1));
    }

    public static C72243Ej makeInstance(C72273En r0, XplatRawEventLogger xplatRawEventLogger) {
        setupQuickExperiment(r0);
        return makeInstanceImpl(xplatRawEventLogger);
    }

    public static void setupQuickExperiment(AnonymousClass3CM r2) {
        if (sEnabled == null) {
            sEnabled = Boolean.valueOf(new C72273En(new C72253El(r2, new C72263Em())).A00.AiT());
        }
    }

    public static void setupQuickExperiment(C72273En r1) {
        if (sEnabled == null) {
            sEnabled = Boolean.valueOf(r1.A00.AiT());
        }
    }
}
