package com.facebook.proxygen;

import org.webrtc.CameraVideoCapturer;

public class QuicSettings {
    public int mAckIntervalAfterThresh;
    public int mAckIntervalBeforeThresh;
    public boolean mCloseConnOnReadError;
    public int mConnFlowControlWindow;
    public boolean mConnectUDP;
    public boolean mContinueOnNetworkUnreachable;
    public boolean mEnableQuicFbcdnNoVideo;
    public boolean mEnableQuicFbcdnVideo;
    public boolean mEnableQuicFnaFbcdnNoVideo;
    public boolean mEnableQuicIgcdn;
    public boolean mEnableQuicIgfna;
    public boolean mEnableSocketErrMsgCallback;
    public boolean mEndConnRaceWithQuicFirstPeerPacket;
    public String mHostsWithQuicEnabled;
    public int mIdleTimeoutInSeconds;
    public int mInitAckThresh;
    public int mMaxCwndInMss;
    public int mMaxNumRTOs;
    public int mMaxRecvPacketSize;
    public boolean mPacingEnabled;
    public boolean mPartialReliabilityEnabled;
    public int mReadLoopDetectionLimit;
    public boolean mReadLoopDetectionLimitTracksStaleData;
    public int mRecvBatchSize;
    public boolean mShouldRecvBatch;
    public boolean mShouldUseRecvmmsgForBatch;
    public int mStreamFlowControlWindowForDynamic;
    public int mStreamFlowControlWindowForImage;
    public int mStreamFlowControlWindowForVideo;
    public int mTcpQuicRaceDelayMilliseconds;
    public boolean mUseBbr;
    public int mWriteConnectionDataPacketsLimit;

    public class Builder {
        public int mAckIntervalAfterThresh = 10;
        public int mAckIntervalBeforeThresh = 2;
        public boolean mCloseConnOnReadError = false;
        public int mConnFlowControlWindow = 163840;
        public boolean mConnectUDP = false;
        public boolean mContinueOnNetworkUnreachable = false;
        public boolean mEnableQuicFbcdnNoVideo = false;
        public boolean mEnableQuicFbcdnVideo = false;
        public boolean mEnableQuicFnaFbcdnNoVideo = false;
        public boolean mEnableQuicIgcdn = false;
        public boolean mEnableQuicIgfna = false;
        public boolean mEnableSocketErrMsgCallback = true;
        public boolean mEndConnRaceWithQuicFirstPeerPacket = false;
        public String mHostsWithQuicEnabled;
        public int mIdleTimeoutInSeconds = 60;
        public int mInitAckThresh = 100;
        public int mMaxCwndInMss = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        public int mMaxNumRTOs = 20;
        public int mMaxRecvPacketSize = 1280;
        public boolean mPacingEnabled = false;
        public boolean mPartialReliabilityEnabled = false;
        public int mReadLoopDetectionLimit = 0;
        public boolean mReadLoopDetectionLimitTracksStaleData = false;
        public int mRecvBatchSize = 1;
        public boolean mShouldRecvBatch = false;
        public boolean mShouldUseRecvmmsgForBatch = false;
        public int mStreamFlowControlWindowForDynamic = 163840;
        public int mStreamFlowControlWindowForImage = 163840;
        public int mStreamFlowControlWindowForVideo = 163840;
        public int mTcpQuicRaceDelayMilliseconds = 0;
        public boolean mUseBbr = false;
        public int mWriteConnectionDataPacketsLimit = 5;

        public QuicSettings build() {
            String str = this.mHostsWithQuicEnabled;
            boolean z = this.mEnableQuicFbcdnVideo;
            boolean z2 = this.mEnableQuicFbcdnNoVideo;
            return new QuicSettings(str, z, z2, this.mEnableQuicFnaFbcdnNoVideo, this.mEnableQuicIgcdn, this.mEnableQuicIgfna, this.mMaxRecvPacketSize, this.mConnectUDP, this.mMaxNumRTOs, this.mEnableSocketErrMsgCallback, this.mConnFlowControlWindow, this.mStreamFlowControlWindowForDynamic, this.mStreamFlowControlWindowForVideo, this.mStreamFlowControlWindowForImage, this.mTcpQuicRaceDelayMilliseconds, this.mMaxCwndInMss, this.mIdleTimeoutInSeconds, this.mPacingEnabled, this.mWriteConnectionDataPacketsLimit, this.mContinueOnNetworkUnreachable, this.mUseBbr, this.mPartialReliabilityEnabled, this.mShouldRecvBatch, this.mRecvBatchSize, this.mAckIntervalBeforeThresh, this.mAckIntervalAfterThresh, this.mInitAckThresh, this.mEndConnRaceWithQuicFirstPeerPacket, this.mReadLoopDetectionLimit, this.mReadLoopDetectionLimitTracksStaleData, this.mCloseConnOnReadError, this.mShouldUseRecvmmsgForBatch);
        }

        public Builder setStreamFlowControlWindows(int i, int i2, int i3) {
            this.mStreamFlowControlWindowForDynamic = i;
            this.mStreamFlowControlWindowForVideo = i2;
            this.mStreamFlowControlWindowForImage = i3;
            return this;
        }

        public Builder setAckIntervalAfterThresh(int i) {
            this.mAckIntervalAfterThresh = i;
            return this;
        }

        public Builder setAckIntervalBeforeThresh(int i) {
            this.mAckIntervalBeforeThresh = i;
            return this;
        }

        public Builder setCloseConnOnReadError(boolean z) {
            this.mCloseConnOnReadError = z;
            return this;
        }

        public Builder setConnFlowControlWindow(int i) {
            this.mConnFlowControlWindow = i;
            return this;
        }

        public Builder setConnectUDP(boolean z) {
            this.mConnectUDP = z;
            return this;
        }

        public Builder setContinueOnNetworkUnreachable(boolean z) {
            this.mContinueOnNetworkUnreachable = z;
            return this;
        }

        public Builder setEnableQuicFbcdnNoVideo(boolean z) {
            this.mEnableQuicFbcdnNoVideo = z;
            return this;
        }

        public Builder setEnableQuicFbcdnVideo(boolean z) {
            this.mEnableQuicFbcdnVideo = z;
            return this;
        }

        public Builder setEnableQuicFnaFbcdnNoVideo(boolean z) {
            this.mEnableQuicFnaFbcdnNoVideo = z;
            return this;
        }

        public Builder setEnableQuicIgcdn(boolean z) {
            this.mEnableQuicIgcdn = z;
            return this;
        }

        public Builder setEnableQuicIgfna(boolean z) {
            this.mEnableQuicIgfna = z;
            return this;
        }

        public Builder setEnableSocketErrMsgCallback(boolean z) {
            this.mEnableSocketErrMsgCallback = z;
            return this;
        }

        public Builder setEndConnRaceWithQuicFirstPeerPacket(boolean z) {
            this.mEndConnRaceWithQuicFirstPeerPacket = z;
            return this;
        }

        public Builder setHostsWithQuicEnabled(String str) {
            this.mHostsWithQuicEnabled = str;
            return this;
        }

        public Builder setIdleTimeoutInSeconds(int i) {
            this.mIdleTimeoutInSeconds = i;
            return this;
        }

        public Builder setInitAckThresh(int i) {
            this.mInitAckThresh = i;
            return this;
        }

        public Builder setMaxCwndInMss(int i) {
            this.mMaxCwndInMss = i;
            return this;
        }

        public Builder setMaxRTOs(int i) {
            this.mMaxNumRTOs = i;
            return this;
        }

        public Builder setMaxRecvPacketSize(int i) {
            this.mMaxRecvPacketSize = i;
            return this;
        }

        public Builder setPacingEnabled(boolean z) {
            this.mPacingEnabled = z;
            return this;
        }

        public Builder setPartialReliabilityEnabled(boolean z) {
            this.mPartialReliabilityEnabled = z;
            return this;
        }

        public Builder setReadLoopDetectionLimit(int i) {
            this.mReadLoopDetectionLimit = i;
            return this;
        }

        public Builder setReadLoopDetectionLimitTracksStaleData(boolean z) {
            this.mReadLoopDetectionLimitTracksStaleData = z;
            return this;
        }

        public Builder setRecvBatchSize(int i) {
            this.mRecvBatchSize = i;
            return this;
        }

        public Builder setShouldRecvBatch(boolean z) {
            this.mShouldRecvBatch = z;
            return this;
        }

        public Builder setShouldUseRecvmmsgForBatch(boolean z) {
            this.mShouldUseRecvmmsgForBatch = z;
            return this;
        }

        public Builder setTcpQuicRaceDelayMilliseconds(int i) {
            this.mTcpQuicRaceDelayMilliseconds = i;
            return this;
        }

        public Builder setUseBbr(boolean z) {
            this.mUseBbr = z;
            return this;
        }

        public Builder setWriteConnectionDataPacketsLimit(int i) {
            this.mWriteConnectionDataPacketsLimit = i;
            return this;
        }
    }

    public QuicSettings(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, int i2, boolean z7, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z8, int i10, boolean z9, boolean z10, boolean z11, boolean z12, int i11, int i12, int i13, int i14, boolean z13, int i15, boolean z14, boolean z15, boolean z16) {
        this.mEnableQuicFbcdnVideo = false;
        this.mEnableQuicFbcdnNoVideo = false;
        this.mEnableQuicFnaFbcdnNoVideo = false;
        this.mEnableQuicIgcdn = false;
        this.mEnableQuicIgfna = false;
        this.mMaxRecvPacketSize = 1500;
        this.mConnectUDP = false;
        this.mMaxNumRTOs = 11;
        this.mEnableSocketErrMsgCallback = false;
        this.mMaxCwndInMss = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        this.mPacingEnabled = false;
        this.mWriteConnectionDataPacketsLimit = 5;
        this.mContinueOnNetworkUnreachable = false;
        this.mUseBbr = false;
        this.mPartialReliabilityEnabled = false;
        this.mShouldRecvBatch = false;
        this.mRecvBatchSize = 1;
        this.mAckIntervalBeforeThresh = 2;
        this.mAckIntervalAfterThresh = 10;
        this.mInitAckThresh = 100;
        this.mEndConnRaceWithQuicFirstPeerPacket = false;
        this.mReadLoopDetectionLimit = 0;
        this.mReadLoopDetectionLimitTracksStaleData = false;
        this.mCloseConnOnReadError = false;
        this.mShouldUseRecvmmsgForBatch = false;
        this.mHostsWithQuicEnabled = str;
        this.mEnableQuicFbcdnVideo = z;
        this.mEnableQuicFbcdnNoVideo = z2;
        this.mEnableQuicFnaFbcdnNoVideo = z3;
        this.mEnableQuicIgcdn = z4;
        this.mEnableQuicIgfna = z5;
        this.mMaxRecvPacketSize = i;
        this.mConnectUDP = z6;
        this.mMaxNumRTOs = i2;
        this.mEnableSocketErrMsgCallback = z7;
        this.mConnFlowControlWindow = i3;
        this.mStreamFlowControlWindowForDynamic = i4;
        this.mStreamFlowControlWindowForVideo = i5;
        this.mStreamFlowControlWindowForImage = i6;
        this.mTcpQuicRaceDelayMilliseconds = i7;
        this.mMaxCwndInMss = i8;
        this.mIdleTimeoutInSeconds = i9;
        this.mPacingEnabled = z8;
        this.mWriteConnectionDataPacketsLimit = i10;
        this.mContinueOnNetworkUnreachable = z9;
        this.mUseBbr = z10;
        this.mPartialReliabilityEnabled = z11;
        this.mShouldRecvBatch = z12;
        this.mRecvBatchSize = i11;
        this.mAckIntervalBeforeThresh = i12;
        this.mAckIntervalAfterThresh = i13;
        this.mInitAckThresh = i14;
        this.mEndConnRaceWithQuicFirstPeerPacket = z13;
        this.mReadLoopDetectionLimit = i15;
        this.mReadLoopDetectionLimitTracksStaleData = z14;
        this.mCloseConnOnReadError = z15;
        this.mShouldUseRecvmmsgForBatch = z16;
    }
}
