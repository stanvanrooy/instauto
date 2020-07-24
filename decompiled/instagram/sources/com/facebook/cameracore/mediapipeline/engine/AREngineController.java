package com.facebook.cameracore.mediapipeline.engine;

import android.content.res.AssetManager;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.cameracore.mediapipeline.effectasyncassetfetcher.AsyncAssetFetcher;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces.ComponentSyncListener;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.hybridlogsink.HybridLogSink;
import com.facebook.jni.HybridData;
import java.util.List;
import p000X.AnonymousClass0Y1;
import p000X.C64302rG;

public class AREngineController {
    public static volatile boolean sIsLibraryLoaded;
    public static volatile boolean sIsLibraryStartLoading;
    public final HybridData mHybridData;
    public final ScriptThreadExecutor scriptExcutor = new ScriptThreadExecutor("AREngineScript");

    public static native HybridData initHybrid(AssetManager assetManager, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, AndroidAsyncExecutorFactory androidAsyncExecutorFactory2, ScriptThreadExecutor scriptThreadExecutor, PluginConfigProvider pluginConfigProvider);

    private native void renderSessionInit(boolean z, boolean z2, int i, GPUTimerImpl gPUTimerImpl, boolean z3, HybridLogSink hybridLogSink, boolean z4);

    public native void cycleDebugOverlaySetup(boolean z);

    public native int doFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, float[] fArr, float[] fArr2, float[] fArr3, long j, long j2, int i8, int i9, boolean z, int i10);

    public native float getFPS();

    public native int getFacesCount();

    public native boolean isFirstFrameFullyRendered();

    public native void onEffectStopped();

    public native void preloadServices(List list);

    public native void releaseGl();

    public native void resetCurrentEffect();

    public native void resize(int i, int i2);

    public native void setCameraFacing(int i);

    public native void setEffect(String str, String str2, String str3, String str4, boolean z, List list, List list2, ProductFeatureConfig productFeatureConfig, AsyncAssetFetcher asyncAssetFetcher, ComponentSyncListener componentSyncListener);

    public native void setFieldOfViewRadians(float f);

    public native void setupImageSourceFacet(int i, int i2, int i3, int i4, boolean z);

    public native void setupServiceHost(EffectServiceHost effectServiceHost);

    public native void updatePerEffectDebugConfiguration(boolean z, boolean z2, boolean z3, boolean z4);

    public native void updatePerSessionDebugConfiguration(int i, boolean z, boolean z2, boolean z3);

    public AREngineController(AssetManager assetManager, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, AndroidAsyncExecutorFactory androidAsyncExecutorFactory2, PluginConfigProvider pluginConfigProvider) {
        synchronized (AREngineController.class) {
            if (!sIsLibraryLoaded) {
                sIsLibraryStartLoading = true;
                AnonymousClass0Y1.A08("filters-native-android");
                sIsLibraryLoaded = true;
            }
        }
        this.mHybridData = initHybrid(assetManager, androidAsyncExecutorFactory, androidAsyncExecutorFactory2, this.scriptExcutor, pluginConfigProvider);
    }

    public void renderSessionInit(boolean z, boolean z2, int i, C64302rG r12, boolean z3, HybridLogSink hybridLogSink, boolean z4) {
        GPUTimerImpl gPUTimerImpl;
        C64302rG r4 = r12;
        if (r12 instanceof GPUTimerImpl) {
            gPUTimerImpl = (GPUTimerImpl) r4;
        } else {
            gPUTimerImpl = null;
        }
        renderSessionInit(z, z2, 0, gPUTimerImpl, false, (HybridLogSink) null, false);
    }
}
