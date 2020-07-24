package com.facebook.hermes.reactexecutor;

import com.facebook.hermes.instrumentation.HermesMemoryDumper;
import com.facebook.hermes.instrumentation.HermesSynthTraceSupport;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.concurrent.ScheduledExecutorService;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass91q;

public class HermesExecutor extends JavaScriptExecutor {
    public HermesExecutor(ScheduledExecutorService scheduledExecutorService, double d, AnonymousClass91q r7) {
        super(initHybridDefaultConfig((ScheduledExecutorService) null, 0.0d));
    }

    public static native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService, double d, long j, boolean z, boolean z2, boolean z3, int i, boolean z4, HermesSynthTraceSupport hermesSynthTraceSupport, long j2, boolean z5, HermesMemoryDumper hermesMemoryDumper, long j3, XAnalyticsHolder xAnalyticsHolder, boolean z6);

    public static native HybridData initHybridDefaultConfig(ScheduledExecutorService scheduledExecutorService, double d);

    public String getName() {
        return "HermesExecutor";
    }

    static {
        AnonymousClass0Y1.A08("hermes-executor");
    }
}
