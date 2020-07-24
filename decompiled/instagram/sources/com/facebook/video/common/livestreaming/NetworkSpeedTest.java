package com.facebook.video.common.livestreaming;

public class NetworkSpeedTest {
    public final double bandwidth;
    public final boolean speedTestPassesThreshold;
    public final Status state;
    public final long timeTaken;

    public enum Status {
        Succeeded,
        Ignored
    }

    public NetworkSpeedTest(int i, double d, long j, boolean z) {
        this.state = Status.values()[i];
        this.bandwidth = d;
        this.timeTaken = j;
        this.speedTestPassesThreshold = z;
    }
}
