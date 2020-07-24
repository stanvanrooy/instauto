package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationData;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;
import p000X.C28881CoG;
import p000X.C44121vd;

public class LocationDataProviderImpl extends LocationDataProvider {
    public C28881CoG mDataSource;

    private native HybridData initHybrid();

    private native void onLocationDataUpdatedNative(LocationData locationData);

    public void getCurrentCityName(NativeDataPromise nativeDataPromise) {
        C28881CoG coG = this.mDataSource;
        if (coG != null) {
            coG.A01 = nativeDataPromise;
            coG.A03 = false;
            String str = coG.A02;
            if (str != null) {
                nativeDataPromise.setValue(str);
                coG.A03 = true;
            }
        }
    }

    public LocationData getCurrentLocationData() {
        C44121vd A01;
        C28881CoG coG = this.mDataSource;
        if (coG == null) {
            return null;
        }
        if (!coG.A02() || (A01 = coG.A06.A01(Long.MAX_VALUE, Float.MAX_VALUE, "LocationDataSource")) == null || A01.A02() == null) {
            return new LocationData(false, 0.0d, 0.0d, 0.0d);
        }
        return new LocationData(true, A01.A00.getLatitude(), A01.A00.getLongitude(), (double) A01.A02().longValue());
    }

    public void release() {
        C28881CoG coG = this.mDataSource;
        if (coG != null) {
            coG.A01((LocationDataProviderImpl) null);
        }
    }

    public void setDataSource(C28881CoG coG) {
        C28881CoG coG2 = this.mDataSource;
        if (coG != coG2) {
            if (coG2 != null) {
                coG2.A01((LocationDataProviderImpl) null);
            }
            this.mDataSource = coG;
            coG.A01(this);
        }
    }

    public LocationDataProviderImpl() {
        this.mHybridData = initHybrid();
    }

    public void onLocationDataUpdated(LocationData locationData) {
        onLocationDataUpdatedNative(locationData);
    }
}
