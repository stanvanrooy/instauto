package com.facebook.proxygen;

public class NetworkStatus {
    public final String mDownloadBwQuality;
    public final long mFlowControlHit;
    public final String mLatencyQuality;
    public final boolean mMayHaveNetwork;
    public final long mOpenedConn;
    public long mReqBwEgressAvg;
    public double mReqBwEgressStdDev;
    public long mReqBwIngressAvg;
    public double mReqBwIngressStdDev;
    public final long mRttAvg;
    public final double mRttStdDev;
    public final String mUploadBwQuality;

    private String describeNetworkQuality(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "excellent" : "good" : "moderate" : "poor";
    }

    public String getDownloadBwQuality() {
        return this.mDownloadBwQuality;
    }

    public long getFlowControlHit() {
        return this.mFlowControlHit;
    }

    public String getLatencyQuality() {
        return this.mLatencyQuality;
    }

    public boolean getMayHaveNetwork() {
        return this.mMayHaveNetwork;
    }

    public long getOpenedConn() {
        return this.mOpenedConn;
    }

    public long getReqBwEgressAvg() {
        return this.mReqBwEgressAvg;
    }

    public double getReqBwEgressStdDev() {
        return this.mReqBwEgressStdDev;
    }

    public long getReqBwIngressAvg() {
        return this.mReqBwIngressAvg;
    }

    public double getReqBwIngressStdDev() {
        return this.mReqBwIngressStdDev;
    }

    public long getRttAvg() {
        return this.mRttAvg;
    }

    public double getRttStdDev() {
        return this.mRttStdDev;
    }

    public String getUploadBwQuality() {
        return this.mUploadBwQuality;
    }

    public NetworkStatus(long j, double d, long j2, double d2, long j3, double d3, long j4, long j5, boolean z, int i, int i2, int i3) {
        this.mReqBwIngressAvg = j;
        this.mReqBwIngressStdDev = d;
        this.mReqBwEgressAvg = j2;
        this.mReqBwEgressStdDev = d2;
        this.mRttAvg = j3;
        this.mRttStdDev = d3;
        this.mOpenedConn = j4;
        this.mFlowControlHit = j5;
        this.mMayHaveNetwork = z;
        this.mLatencyQuality = describeNetworkQuality(i);
        this.mUploadBwQuality = describeNetworkQuality(i2);
        this.mDownloadBwQuality = describeNetworkQuality(i3);
    }
}
