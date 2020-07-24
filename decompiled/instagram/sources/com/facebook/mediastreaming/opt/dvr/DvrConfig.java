package com.facebook.mediastreaming.opt.dvr;

import com.facebook.jni.HybridClassBase;
import p000X.AnonymousClass0Y1;

public class DvrConfig extends HybridClassBase {

    public class Builder extends HybridClassBase {
        private native void initHybrid();

        public native DvrConfig build();

        public native Builder setAllowSeparateThreads(boolean z);

        public native Builder setAudioBitRate(int i);

        public native Builder setAudioChannels(int i);

        public native Builder setAudioEncoderProfile(int i);

        public native Builder setAudioSampleRate(int i);

        public native Builder setAvailableSpaceThresholdInMB(int i);

        public native Builder setBinFailureHandleMode(int i);

        public native Builder setCheckAvailableSpaceIntervalInSeconds(int i);

        public native Builder setMinValidDurationMs(int i);

        public native Builder setMuxerMaxPendingJobs(int i);

        public native Builder setSeparateMuxerThread(boolean z);

        public native Builder setUsePersistentStorage(boolean z);

        public native Builder setVideoBitrate(int i);

        public native Builder setVideoEncoderBitrateMode(int i);

        public native Builder setVideoEncoderProfile(int i);

        public native Builder setVideoEnforceKeyframeInterval(boolean z);

        public native Builder setVideoFps(int i);

        public native Builder setVideoHeight(int i);

        public native Builder setVideoKeyframeInterval(int i);

        public native Builder setVideoWidth(int i);

        static {
            AnonymousClass0Y1.A08("mediastreaming-dvr");
        }

        public Builder() {
            initHybrid();
        }
    }

    static {
        AnonymousClass0Y1.A08("mediastreaming-dvr");
    }
}
