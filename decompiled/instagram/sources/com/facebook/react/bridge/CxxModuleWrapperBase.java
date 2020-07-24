package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000X.A3K;

public class CxxModuleWrapperBase implements NativeModule {
    public HybridData mHybridData;

    public boolean canOverrideExistingModule() {
        return false;
    }

    public native String getName();

    public void initialize() {
    }

    public void onCatalystInstanceDestroy() {
        this.mHybridData.resetNative();
    }

    public void resetModule(HybridData hybridData) {
        HybridData hybridData2 = this.mHybridData;
        if (hybridData != hybridData2) {
            hybridData2.resetNative();
            this.mHybridData = hybridData;
        }
    }

    static {
        A3K.A00();
    }

    public CxxModuleWrapperBase(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
