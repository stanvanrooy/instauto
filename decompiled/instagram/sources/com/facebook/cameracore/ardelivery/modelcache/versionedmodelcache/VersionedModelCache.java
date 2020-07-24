package com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass0CW;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass3FS;

public class VersionedModelCache implements AnonymousClass3FS {
    public final HybridData mHybridData;

    private native boolean addModelForVersionIfInCache(int i, int i2, String str, String str2);

    private native ModelPathsHolder getModelPathsHolder(int i, int i2);

    public static native HybridData initHybrid(ARDFileCache aRDFileCache, List list);

    public native void trimExceptLatestSavedVersion(int i);

    static {
        AnonymousClass0Y1.A08("versioned-model-cache-native-android");
    }

    public VersionedModelCache(ARDFileCache aRDFileCache, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((VersionedCapability) it.next()).getXplatValue()));
        }
        this.mHybridData = initHybrid(aRDFileCache, arrayList);
    }

    public boolean addModelForVersionIfInCache(int i, String str, String str2, VersionedCapability versionedCapability) {
        Integer valueOf = Integer.valueOf(versionedCapability.getXplatValue());
        AnonymousClass0CW.A01(valueOf);
        return addModelForVersionIfInCache(valueOf.intValue(), i, str, str2);
    }

    public ModelPathsHolder getModelPathsHolder(VersionedCapability versionedCapability, int i) {
        return getModelPathsHolder(versionedCapability.getXplatValue(), i);
    }

    public void trimExceptLatestSavedVersion(VersionedCapability versionedCapability) {
        AnonymousClass0CW.A01(versionedCapability);
        trimExceptLatestSavedVersion(versionedCapability.getXplatValue());
    }
}
