package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass89X;

public class ServiceMessageChannelHybrid extends ServiceConfiguration {
    public final AnonymousClass89X mServiceMessageChannel;

    public static native HybridData initHybrid(ServiceMessageDataSourceHybrid serviceMessageDataSourceHybrid, int i);

    public ServiceMessageChannelHybrid(AnonymousClass89X r2, ServiceMessageDataSourceHybrid serviceMessageDataSourceHybrid) {
        super(initHybrid(serviceMessageDataSourceHybrid, r2.A00.A00));
        this.mServiceMessageChannel = r2;
    }
}
