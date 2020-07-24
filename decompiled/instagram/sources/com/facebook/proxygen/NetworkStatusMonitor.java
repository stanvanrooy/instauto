package com.facebook.proxygen;

import java.util.HashMap;

public class NetworkStatusMonitor extends NativeHandleImpl {
    public BandwidthEstimate mBandwidthEstimate;
    public int mBandwidthSplitSize = 10000;
    public int mCacheDurationInSeconds = 2;
    public final NetworkStatus mCacheStatus;
    public boolean mCalcBandwidthOnEvbThreadEnabled = true;
    public final EventBase mEventBase;
    public int mGoodDL = 2000000;
    public int mGoodRtt = 50;
    public int mGoodUL = 400000;
    public boolean mInitialized;
    public int mMaxPriority = 7;
    public int mModerateDL = 550000;
    public int mModerateRtt = 150;
    public int mModerateUL = 110000;
    public int mPoorDL = 150000;
    public int mPoorRtt = 1500;
    public int mPoorUL = 30000;
    public ProxygenRadioMeter mRadioMeter;

    private native BandwidthEstimate getBandwidthEstimateNative();

    private native void getNetworkStatusNative();

    public native void close();

    public native HashMap getAccumulativeRadioCounterData();

    public native long getConnectionLevelTraceDurationNative();

    public native SocketData[] getInboundConnectionLevelTraceDataNative();

    public native SocketData[] getOutboundConnectionLevelTraceDataNative();

    public native HashMap getRadioData();

    public native void init(EventBase eventBase, ProxygenRadioMeter proxygenRadioMeter, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z);

    public native void setNetworkType(int i, int i2);

    public native long startConnectionLevelTracingNative(String str);

    public native void stopConnectionLevelTracingNative();

    public BandwidthEstimate getBandwidthEstimate() {
        if (!this.mInitialized) {
            return null;
        }
        BandwidthEstimate bandwidthEstimateNative = getBandwidthEstimateNative();
        this.mBandwidthEstimate = bandwidthEstimateNative;
        return bandwidthEstimateNative;
    }

    public NetworkStatus getNetworkStatus() {
        if (!this.mInitialized) {
            return null;
        }
        getNetworkStatusNative();
        return this.mCacheStatus;
    }

    public NetworkStatusMonitor(EventBase eventBase) {
        this.mEventBase = eventBase;
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public void setCacheDuration(int i) {
        this.mCacheDurationInSeconds = i;
    }

    public void setCalcBandwidthOnEvbThreadEnabled(boolean z) {
        this.mCalcBandwidthOnEvbThreadEnabled = z;
    }

    public void setRadioMeter(ProxygenRadioMeter proxygenRadioMeter) {
        this.mRadioMeter = proxygenRadioMeter;
    }

    public void init(int i) {
        EventBase eventBase = this.mEventBase;
        ProxygenRadioMeter proxygenRadioMeter = this.mRadioMeter;
        int i2 = this.mMaxPriority;
        int i3 = this.mBandwidthSplitSize;
        int i4 = this.mCacheDurationInSeconds;
        int i5 = this.mPoorRtt;
        int i6 = this.mModerateRtt;
        int i7 = this.mGoodRtt;
        int i8 = this.mPoorUL;
        int i9 = this.mModerateUL;
        int i10 = this.mGoodUL;
        int i11 = this.mPoorDL;
        int i12 = this.mModerateDL;
        int i13 = i12;
        int i14 = i11;
        int i15 = i10;
        int i16 = i9;
        int i17 = i8;
        int i18 = i7;
        int i19 = i6;
        int i20 = i5;
        int i21 = i4;
        int i22 = i3;
        int i23 = i2;
        init(eventBase, proxygenRadioMeter, i, i23, i22, i21, i20, i19, i18, i17, i16, i15, i14, i13, this.mGoodDL, this.mCalcBandwidthOnEvbThreadEnabled);
        this.mInitialized = true;
    }
}
