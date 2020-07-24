package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyDataSource;
import com.facebook.jni.HybridData;

public class NetworkPolicyConfigurationHybrid extends ServiceConfiguration {
    public final NetworkPolicyConfiguration mConfiguration;

    public static native HybridData initHybrid(NetworkPolicyDataSource networkPolicyDataSource);

    public NetworkPolicyConfigurationHybrid(NetworkPolicyConfiguration networkPolicyConfiguration) {
        super(initHybrid(networkPolicyConfiguration.mNetworkPolicyDataSource));
        this.mConfiguration = networkPolicyConfiguration;
    }
}
