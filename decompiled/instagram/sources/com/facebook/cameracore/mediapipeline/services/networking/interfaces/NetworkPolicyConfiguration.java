package com.facebook.cameracore.mediapipeline.services.networking.interfaces;

public class NetworkPolicyConfiguration {
    public final NetworkPolicyDataSource mNetworkPolicyDataSource;

    public NetworkPolicyConfiguration(NetworkPolicyDataSource networkPolicyDataSource) {
        this.mNetworkPolicyDataSource = networkPolicyDataSource;
    }

    public NetworkPolicyDataSource getNetworkPolicyDataSource() {
        return this.mNetworkPolicyDataSource;
    }
}
