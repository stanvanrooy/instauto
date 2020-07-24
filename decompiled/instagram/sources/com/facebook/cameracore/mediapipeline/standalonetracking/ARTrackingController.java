package com.facebook.cameracore.mediapipeline.standalonetracking;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.jni.HybridData;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.List;
import p000X.AnonymousClass8P7;
import p000X.C193298Oz;
import p000X.C194478Uf;

public class ARTrackingController {
    public final EffectServiceHost mEffectServiceHost;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(EffectServiceHost effectServiceHost, ManifestBuilder manifestBuilder, List list, boolean z);

    private native TrackingResult trackNewData(long j);

    public ARTrackingController(EffectServiceHost effectServiceHost, ManifestBuilder manifestBuilder, List list, boolean z) {
        this.mEffectServiceHost = effectServiceHost;
        AnonymousClass8P7.A00();
        this.mHybridData = initHybrid(effectServiceHost, manifestBuilder, list, z);
    }

    public TrackingResult updateAndTrackFrame(C194478Uf r5, int i, boolean z) {
        QuickPerformanceLoggerProvider.getQPLInstance().markerStart(16318548);
        this.mEffectServiceHost.updateFrame(r5, i, z);
        TrackingResult trackNewData = trackNewData(((C193298Oz) r5.get()).AYL());
        QuickPerformanceLoggerProvider.getQPLInstance().markerEnd(16318548, 2);
        return trackNewData;
    }
}
