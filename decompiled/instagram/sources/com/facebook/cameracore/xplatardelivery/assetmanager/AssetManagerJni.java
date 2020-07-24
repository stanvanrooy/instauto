package com.facebook.cameracore.xplatardelivery.assetmanager;

import com.facebook.cameracore.ardelivery.logging.interfaces.AssetManagerLoggingInfoProvider;
import com.facebook.cameracore.xplatardelivery.filedownloader.FileDownloaderJNI;
import com.facebook.cameracore.xplatardelivery.models.AssetIdentifier;
import com.facebook.cameracore.xplatardelivery.util.CancelableTokenJNI;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass0Y1;

public class AssetManagerJni {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, Map map, FileDownloaderJNI fileDownloaderJNI, int i, int i2, String str);

    public native void clearAllCache();

    public native long getCurrentSizeBytes(List list);

    public native String getLocalAssetIfCached(AssetIdentifier assetIdentifier, int i);

    public native long getUnusedSizeBytes(List list, long j);

    public native CancelableTokenJNI requestAssets(List list, boolean z, AssetManagerLoggingInfoProvider assetManagerLoggingInfoProvider, AssetManagerCompletionCallback assetManagerCompletionCallback);

    static {
        AnonymousClass0Y1.A08("ard-android-asset-manager");
    }

    public AssetManagerJni(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, Map map, FileDownloaderJNI fileDownloaderJNI, int i, int i2, String str) {
        this.mHybridData = initHybrid(androidAsyncExecutorFactory, map, fileDownloaderJNI, i, i2, str);
    }
}
