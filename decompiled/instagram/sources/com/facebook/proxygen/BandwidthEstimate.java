package com.facebook.proxygen;

public class BandwidthEstimate {
    public final long bandwidthBps;
    public final long bandwidthStdDev;
    public final long bandwidthWeight;
    public final long ttfbMs;
    public final long ttfbStdDev;
    public final long ttfbWeight;

    public BandwidthEstimate(long j, long j2, long j3, long j4, long j5, long j6) {
        this.ttfbMs = j;
        this.ttfbWeight = j2;
        this.ttfbStdDev = j3;
        this.bandwidthBps = j4;
        this.bandwidthWeight = j5;
        this.bandwidthStdDev = j6;
    }
}
