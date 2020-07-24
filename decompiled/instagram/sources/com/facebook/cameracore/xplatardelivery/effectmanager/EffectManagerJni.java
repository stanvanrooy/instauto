package com.facebook.cameracore.xplatardelivery.effectmanager;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.xplatardelivery.assetmanager.AssetManagerCompletionCallback;
import com.facebook.cameracore.xplatardelivery.filedownloader.FileDownloaderJNI;
import com.facebook.cameracore.xplatardelivery.modelmanager.ModelManagerConfig;
import com.facebook.cameracore.xplatardelivery.modelmanager.ModelMetadataDownloaderAdapter;
import com.facebook.cameracore.xplatardelivery.models.AssetIdentifier;
import com.facebook.cameracore.xplatardelivery.models.EffectLoggingInfoAdapter;
import com.facebook.cameracore.xplatardelivery.models.EffectModelAdapter;
import com.facebook.cameracore.xplatardelivery.models.RemoteAssetAdapter;
import com.facebook.cameracore.xplatardelivery.util.CancelableTokenJNI;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass0Y1;
import p000X.C239512q;

public class EffectManagerJni {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, Map map, FileDownloaderJNI fileDownloaderJNI, String str, ModelManagerConfig modelManagerConfig, ModelMetadataDownloaderAdapter modelMetadataDownloaderAdapter, List list, int i, int i2, int i3, int i4, int i5, int i6);

    public native void abortAllPendingLoggingEvents();

    public native void clearAllCaches();

    public native void effectRenderFailed(EffectLoggingInfoAdapter effectLoggingInfoAdapter);

    public native void effectRenderedFirstFrame(EffectLoggingInfoAdapter effectLoggingInfoAdapter);

    public native void effectRenderedFirstFrameFullResolution(EffectLoggingInfoAdapter effectLoggingInfoAdapter);

    public native void effectStopped(EffectLoggingInfoAdapter effectLoggingInfoAdapter);

    public native CancelableTokenJNI fetchAsyncAsset(RemoteAssetAdapter remoteAssetAdapter, AssetManagerCompletionCallback assetManagerCompletionCallback);

    public native CancelableTokenJNI fetchLatestModels(List list, EffectLoggingInfoAdapter effectLoggingInfoAdapter, boolean z, EffectManagerCompletionCallback effectManagerCompletionCallback);

    public native long getCurrentSizeBytes(List list);

    public native String getLocalAssetIfCached(AssetIdentifier assetIdentifier, int i);

    public native long getUnusedSizeBytes(List list, long j);

    public native boolean isEffectCached(RemoteAssetAdapter remoteAssetAdapter);

    public native boolean isEffectModelCached(int i, int i2);

    public native CancelableTokenJNI loadEffect(EffectModelAdapter effectModelAdapter, EffectLoggingInfoAdapter effectLoggingInfoAdapter, EffectManagerCompletionCallback effectManagerCompletionCallback);

    static {
        AnonymousClass0Y1.A08("ard-android-effect-manager");
    }

    public EffectManagerJni(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, Map map, FileDownloaderJNI fileDownloaderJNI, String str, ModelManagerConfig modelManagerConfig, ModelMetadataDownloaderAdapter modelMetadataDownloaderAdapter, ImmutableList immutableList, int i, int i2, int i3, int i4, int i5, int i6) {
        ArrayList arrayList = new ArrayList();
        if (immutableList != null) {
            C239512q A0I = immutableList.iterator();
            while (A0I.hasNext()) {
                arrayList.add(Integer.valueOf(((VersionedCapability) A0I.next()).getXplatValue()));
            }
        }
        String str2 = str;
        FileDownloaderJNI fileDownloaderJNI2 = fileDownloaderJNI;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = androidAsyncExecutorFactory;
        Map map2 = map;
        int i7 = i3;
        int i8 = i2;
        int i9 = i;
        this.mHybridData = initHybrid(androidAsyncExecutorFactory2, map2, fileDownloaderJNI2, str2, modelManagerConfig, modelMetadataDownloaderAdapter, arrayList, i9, i8, i7, i4, i5, i6);
    }
}
