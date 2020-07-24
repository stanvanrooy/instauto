package com.facebook.cameracore.ardelivery.modelcache.singlemodelcache;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass3FS;

public class SingleModelCache implements AnonymousClass3FS {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(int i, ARDFileCache aRDFileCache);

    public native boolean addModelForVersionIfInCache(int i, String str, String str2);

    public native ModelPathsHolder getModelPathsHolder(int i);

    public native void trimExceptLatestSavedVersion();

    static {
        AnonymousClass0Y1.A08("single-model-cache-native-android");
    }

    public SingleModelCache(VersionedCapability versionedCapability, ARDFileCache aRDFileCache) {
        this.mHybridData = initHybrid(versionedCapability.getXplatValue(), aRDFileCache);
    }

    public boolean addModelForVersionIfInCache(int i, String str, String str2, VersionedCapability versionedCapability) {
        return addModelForVersionIfInCache(i, str, str2);
    }

    public ModelPathsHolder getModelPathsHolder(VersionedCapability versionedCapability, int i) {
        return getModelPathsHolder(i);
    }

    public void trimExceptLatestSavedVersion(VersionedCapability versionedCapability) {
        trimExceptLatestSavedVersion();
    }
}
