package com.facebook.mediastreaming.client.livestreaming.config;

import com.facebook.jni.HybridClassBase;
import p000X.AnonymousClass0Y1;

public class LiveStreamingConfig extends HybridClassBase {

    public class Builder extends HybridClassBase {
        private native void initHybrid(long j);

        private native void setBooleanParam(int i, boolean z);

        private native void setDoubleParam(int i, double d);

        private native void setEnumParam(int i, int i2);

        private native void setIntParam(int i, int i2);

        private native void setLongParam(int i, long j);

        private native void setStringParam(int i, String str);

        public native LiveStreamingConfig build();

        public Builder setABRResolutionMappingBpp(double d) {
            setDoubleParam(3, d);
            return this;
        }

        public Builder setAllowSeparateThreads(boolean z) {
            setBooleanParam(0, z);
            return this;
        }

        public Builder setEnableABRResize(boolean z) {
            setBooleanParam(3, z);
            return this;
        }

        public Builder setEnableClientCounter(boolean z) {
            setBooleanParam(4, false);
            return this;
        }

        public Builder setEnableQuic(boolean z) {
            setBooleanParam(12, true);
            return this;
        }

        public Builder setLiveTraceSamplingSource(int i) {
            setIntParam(0, i);
            return this;
        }

        public Builder setPublishQuicURL(String str) {
            setStringParam(4, str);
            return this;
        }

        public Builder setPublishURL(String str) {
            setStringParam(1, str);
            return this;
        }

        public Builder setQuicTcpRacingEnabled(boolean z) {
            setBooleanParam(6, true);
            return this;
        }

        public Builder setUseAdaptiveBppResolutionAlgorithm(boolean z) {
            setBooleanParam(18, true);
            return this;
        }

        public Builder setVideoEncoderBitrateMode(int i) {
            setEnumParam(1, i);
            return this;
        }

        public Builder setVideoEncoderProfile(int i) {
            setEnumParam(0, i);
            return this;
        }

        public Builder setVideoHeight(int i) {
            setIntParam(4, i);
            return this;
        }

        public Builder setVideoWidth(int i) {
            setIntParam(5, i);
            return this;
        }

        static {
            AnonymousClass0Y1.A08("mediastreaming-config");
        }

        public Builder setABRBitrateIncreaseFromLastGood(int i) {
            setIntParam(42, i);
            return this;
        }

        public Builder setABRMaxBitrate(int i) {
            setIntParam(33, i);
            return this;
        }

        public Builder setABRMaxBitrateOnWifi(int i) {
            setIntParam(16, i);
            return this;
        }

        public Builder setABRMinDecreaseBitrateForLargeQueue(int i) {
            setIntParam(20, i);
            return this;
        }

        public Builder setABRTimeSinceLastBitrateIncreaseThresholdMs(int i) {
            setIntParam(11, i);
            return this;
        }

        public Builder setABRUpscaleDelayMs(int i) {
            setIntParam(25, i);
            return this;
        }

        public Builder setAudioBitRate(int i) {
            setIntParam(9, i);
            return this;
        }

        public Builder setAudioChannels(int i) {
            setIntParam(39, i);
            return this;
        }

        public Builder setAudioEncoderProfile(int i) {
            setIntParam(26, i);
            return this;
        }

        public Builder setAudioSampleRate(int i) {
            setIntParam(12, i);
            return this;
        }

        public Builder setConnectionRetryCount(int i) {
            setIntParam(19, i);
            return this;
        }

        public Builder setConnectionRetryDelayInSeconds(int i) {
            setIntParam(23, i);
            return this;
        }

        public Builder setLiveTraceEnabled(boolean z) {
            setBooleanParam(16, z);
            return this;
        }

        public Builder setLiveTraceSampleIntervalInSeconds(int i) {
            setIntParam(35, i);
            return this;
        }

        public Builder setQuicCongestionControlType(String str) {
            setStringParam(0, "copa");
            return this;
        }

        public Builder setTcpConnectDelayMs(int i) {
            setIntParam(38, 1500);
            return this;
        }

        public Builder setVideoBitrate(int i) {
            setIntParam(22, i);
            return this;
        }

        public Builder setVideoEnforceKeyframeInterval(boolean z) {
            setBooleanParam(24, z);
            return this;
        }

        public Builder setVideoFps(int i) {
            setIntParam(21, i);
            return this;
        }

        public Builder setVideoKeyframeInterval(int i) {
            setIntParam(13, i);
            return this;
        }

        public Builder(long j) {
            initHybrid(j);
        }

        public Builder setCopaLatencyFactor(double d) {
            setDoubleParam(4, 0.05d);
            return this;
        }
    }

    static {
        AnonymousClass0Y1.A08("mediastreaming-config");
    }
}
