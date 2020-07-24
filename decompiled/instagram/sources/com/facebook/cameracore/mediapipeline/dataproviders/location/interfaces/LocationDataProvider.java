package com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces;

import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;
import p000X.C28881CoG;

public abstract class LocationDataProvider {
    public HybridData mHybridData;

    public abstract void getCurrentCityName(NativeDataPromise nativeDataPromise);

    public abstract LocationData getCurrentLocationData();

    public abstract void setDataSource(C28881CoG coG);
}
