package com.facebook.mediastreaming.opt.transport;

public class SpeedTestStatus {
    public final double bandwidth;
    public final boolean speedTestPassesThreshold;
    public final Status state;
    public final long timeTaken;

    public enum Status {
    }

    public SpeedTestStatus(int i, double d, long j, boolean z) {
        this.state = Status.values()[i];
        this.bandwidth = d;
        this.timeTaken = j;
        this.speedTestPassesThreshold = z;
    }
}
