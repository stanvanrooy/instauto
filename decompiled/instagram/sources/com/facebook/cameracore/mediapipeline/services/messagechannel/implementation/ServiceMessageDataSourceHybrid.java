package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import com.facebook.jni.HybridData;
import p000X.C30689Dhd;

public class ServiceMessageDataSourceHybrid {
    public final C30689Dhd mDataSource;
    public final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    public native void didReceiveMessageFromPlatform(int i, byte[] bArr);

    public native void setConfiguration(int i, byte[] bArr);

    public ServiceMessageDataSourceHybrid(C30689Dhd dhd) {
        this.mDataSource = dhd;
    }

    public void didReceiveFromXplat(int i, byte[] bArr) {
    }
}
