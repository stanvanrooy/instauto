package com.facebook.video.videostreaming.eventlog;

import com.facebook.jni.HybridClassBase;
import com.facebook.proxygen.EventBase;
import com.facebook.xanalytics.XAnalyticsHolder;
import p000X.AnonymousClass0Y1;

public class VideoProtocolEventLog extends HybridClassBase {
    private native void initHybrid(EventBase eventBase, XAnalyticsHolder xAnalyticsHolder);

    public native String[] getLogLines();

    static {
        AnonymousClass0Y1.A08("android-video-protocol-eventlog");
    }
}
