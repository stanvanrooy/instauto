package com.facebook.common.jniexecutors;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.debug.tracer.Tracer;
import com.facebook.jni.HybridData;
import com.facebook.profilo.core.TraceEvents;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0YD;
import p000X.AnonymousClass0ZN;
import p000X.C09680bp;

public class NativeRunnable implements Runnable {
    public HybridData mHybridData;
    public volatile String mNativeExecutor;

    private native void nativeRun();

    static {
        AnonymousClass0YD.A01("jniexecutors");
    }

    public void run() {
        if (!TraceEvents.isEnabled(C09680bp.A06)) {
            Tracer.A00("%s", 1, this, (Object) null, (Object) null);
        } else {
            AnonymousClass0ZN.A02(StringFormatUtil.formatStrLocaleSafe("%s", (Object) this), -693752208);
        }
        try {
            nativeRun();
        } finally {
            AnonymousClass0ZN.A00(570492259);
        }
    }

    public String toString() {
        String str = this.mNativeExecutor;
        if (str == null) {
            return "NativeRunnable";
        }
        return AnonymousClass000.A0E("NativeRunnable - ", str);
    }

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
