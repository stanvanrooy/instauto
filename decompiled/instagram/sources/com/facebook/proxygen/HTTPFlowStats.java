package com.facebook.proxygen;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HTTPFlowStats {
    public final boolean mCertCacheHit;
    public final boolean mConnEstablished;
    public final ConnQuality mConnQuality;
    public final long mDnsLatency;
    public final long mFirstByteFlushed;
    public String mHostname;
    public final boolean mIsPush;
    public final long mLastByteFlushed;
    public final int mLocalPort;
    public final boolean mNewConnection;
    public final String mProtocol;
    public final int mReqBodyBytes;
    public final int mReqHeaderBytes;
    public final int mReqHeaderCompBytes;
    public final boolean mReqSent;
    public final long mRequestSendTime;
    public final int mRspBodyBytes;
    public final long mRspBodyBytesTime;
    public final int mRspBodyCompBytes;
    public final int mRspHeaderBytes;
    public final int mRspHeaderCompBytes;
    public final boolean mRspReceived;
    public final long mRtt;
    public InetAddress mServerAddr = null;
    public final String mServerQuality;
    public final long mTcpLatency;
    public final long mTimeToFirstByte;
    public final long mTimeToLastByte;
    public final long mTlsLatency;
    public final long mTotalConnect;

    public boolean getCertCacheHit() {
        return this.mCertCacheHit;
    }

    public ConnQuality getConnQuality() {
        return this.mConnQuality;
    }

    public long getDnsLatency() {
        return this.mDnsLatency;
    }

    public long getFirstByteFlushed() {
        return this.mFirstByteFlushed;
    }

    public String getHostname() {
        return this.mHostname;
    }

    public boolean getIsConnectionEstablished() {
        return this.mConnEstablished;
    }

    public boolean getIsNewConnection() {
        return this.mNewConnection;
    }

    public long getLastByteFlushed() {
        return this.mLastByteFlushed;
    }

    public int getLocalPort() {
        return this.mLocalPort;
    }

    public String getNegotiatedProtocol() {
        return this.mProtocol;
    }

    public int getRequestBodyBytes() {
        return this.mReqBodyBytes;
    }

    public int getRequestHeaderBytes() {
        return this.mReqHeaderBytes;
    }

    public int getRequestHeaderCompressedBytes() {
        return this.mReqHeaderCompBytes;
    }

    public long getRequestSendTime() {
        return this.mRequestSendTime;
    }

    public boolean getRequestSent() {
        return this.mReqSent;
    }

    public int getResponseBodyBytes() {
        return this.mRspBodyBytes;
    }

    public int getResponseBodyCompressedBytes() {
        return this.mRspBodyCompBytes;
    }

    public int getResponseHeaderBytes() {
        return this.mRspHeaderBytes;
    }

    public int getResponseHeaderCompressedBytes() {
        return this.mRspHeaderCompBytes;
    }

    public boolean getResponseReceived() {
        return this.mRspReceived;
    }

    public long getRspBodyBytesTime() {
        return this.mRspBodyBytesTime;
    }

    public long getRtt() {
        return this.mRtt;
    }

    public InetAddress getServerAddress() {
        return this.mServerAddr;
    }

    public String getServerQuality() {
        return this.mServerQuality;
    }

    public long getTcpLatency() {
        return this.mTcpLatency;
    }

    public long getTimeToFirstByte() {
        return this.mTimeToFirstByte;
    }

    public long getTimeToLastByte() {
        return this.mTimeToLastByte;
    }

    public long getTlsLatency() {
        return this.mTlsLatency;
    }

    public long getTotalConnectTime() {
        return this.mTotalConnect;
    }

    public long getTotalRequestTime() {
        return this.mTimeToLastByte + this.mTotalConnect;
    }

    public boolean isPush() {
        return this.mIsPush;
    }

    public HTTPFlowStats(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, String str4, ConnQuality connQuality, long j9, boolean z6, long j10, long j11) {
        this.mHostname = str;
        if (!str2.equals("")) {
            try {
                this.mServerAddr = InetAddress.getByName(str2);
            } catch (UnknownHostException unused) {
            }
        }
        this.mLocalPort = i;
        this.mConnEstablished = z;
        this.mNewConnection = z2;
        this.mReqSent = z3;
        this.mRspReceived = z4;
        this.mCertCacheHit = z5;
        this.mProtocol = str3;
        this.mReqHeaderBytes = i2;
        this.mReqHeaderCompBytes = i3;
        this.mReqBodyBytes = i4;
        this.mRspHeaderBytes = i5;
        this.mRspHeaderCompBytes = i6;
        this.mRspBodyBytes = i7;
        this.mRspBodyCompBytes = i8;
        this.mDnsLatency = j;
        this.mTcpLatency = j2;
        this.mTlsLatency = j3;
        this.mRtt = j4;
        this.mTimeToFirstByte = j5;
        this.mTimeToLastByte = j6;
        this.mTotalConnect = j7;
        this.mRspBodyBytesTime = j8;
        this.mServerQuality = str4;
        this.mConnQuality = connQuality;
        this.mRequestSendTime = j9;
        this.mIsPush = z6;
        this.mFirstByteFlushed = j10;
        this.mLastByteFlushed = j11;
    }
}
