package com.facebook.video.videoprotocol.common.interfaces;

public interface EventLogger {
    void logEvent(String str, String str2);

    void logLiveTraceFrameDownloaded(long j, long j2, String str, long j3);
}
