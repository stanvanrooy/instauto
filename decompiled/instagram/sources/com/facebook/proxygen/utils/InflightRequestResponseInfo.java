package com.facebook.proxygen.utils;

public class InflightRequestResponseInfo {
    public final int mPort;
    public final String mRange;
    public final int mRequestBodyBytes;
    public final int mRequestHeaderCompBytes;
    public final String mRequestId;
    public final long mRequestSentMs;
    public final int mResponseBodyCompBytes;
    public final int mResponseHeaderCompBytes;
    public final long mServerRtx;
    public final long mServerUpstreamLatency;
    public final int mTtfb;
    public final int mTtlb;
    public final String mUrl;

    public InflightRequestResponseInfo(String str, long j, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j2, long j3, String str3) {
        this.mRequestId = str;
        this.mRequestSentMs = j;
        this.mUrl = str2;
        this.mTtfb = i;
        this.mTtlb = i2;
        this.mPort = i3;
        this.mRequestHeaderCompBytes = i4;
        this.mRequestBodyBytes = i5;
        this.mResponseHeaderCompBytes = i6;
        this.mResponseBodyCompBytes = i7;
        this.mServerRtx = j2;
        this.mServerUpstreamLatency = j3;
        this.mRange = str3;
    }
}
