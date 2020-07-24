package com.facebook.proxygen;

import java.util.concurrent.Executor;
import p000X.AnonymousClass000;

public class HTTPClient implements NativeHandle {
    public final boolean mAttemptEarlyDataInQuicPreconnect;
    public final boolean mBidirectionalStreamingEnabled;
    public String mBypassProxyDomains;
    public final String mCdnOverride;
    public final boolean mCircularLogSinkEnabled;
    public boolean mClosed;
    public final ConnQualityConfig mConnQualityConfig;
    public final Executor mDNSResolverExecutor;
    public final boolean mDeadConnTimeoutDryRun;
    public final boolean mDnsCacheEnabled;
    public final int mDnsRequestsOutstanding;
    public final boolean mEnableBackgroundQuicConnection;
    public final boolean mEnableDzCompression;
    public final boolean mEnableHTTP2;
    public final boolean mEnableLigerPreconnect;
    public final boolean mEnableSimplePreconnectForReinit;
    public final boolean mEnableTransportCallbacks;
    public final boolean mEnableZstd;
    public final EventBase mEventBase;
    public final boolean mFBHostOnly;
    public final boolean mFizzHTTP2StaticOverride;
    public final FizzSettings mFizzSettings;
    public final String mH2PubSubHostnames;
    public final int mHTTPSessionMaxReadBufferSize;
    public final long mHappyEyeballsConnectionDelayMillis;
    public final int mIdleHTTPSessionsLowWaterMark;
    public boolean mInitialized;
    public final boolean mInlinePersistenceLoading;
    public final boolean mIsCompressionFilterEnabled;
    public final boolean mIsHTTPSEnforced;
    public final boolean mIsPerDomainLimitEnabled;
    public final boolean mIsSSLSessionCacheEnabled;
    public boolean mIsSandbox;
    public final boolean mLargerFlowControlWindow;
    public final int mMaxConcurrentOutgoingStreams;
    public final int mMaxIdleHTTP2Sessions;
    public final int mMaxPriorityLevelForSession;
    public NetworkStatusMonitor mNetworkStatusMonitor;
    public final long mNewConnTimeoutMillis;
    public final Executor mPersistentCachesExecutor;
    public final PersistentSSLCacheSettings mPersistentDNSCacheSettings;
    public final PersistentSSLCacheSettings mPersistentSSLCacheSettings;
    public final String mPingDomainBlacklist;
    public final int mPingTimeoutMaxMs;
    public final int mPingTimeoutMinMs;
    public final int mPingTimeoutRtoMultiple;
    public final int mPosixResolverPoolSize;
    public final String mPreConnects;
    public final String mPreconnectFilePath;
    public boolean mProxyFallbackEnabled;
    public String mProxyHost;
    public String mProxyPassword;
    public int mProxyPort;
    public String mProxyUsername;
    public final FizzSettings mQuicFizzSettings;
    public final QuicSettings mQuicSettings;
    public final int mQuicVersion;
    public String mReInitReason;
    public boolean mReInitToRefreshSettings;
    public final RootCACallbacks mRootCACallbacks;
    public final SSLKeyMaterialCallback mSSLKeyMaterialCallback;
    public final SSLVerificationSettings mSSLVerificationSettings;
    public String mSecureProxyHost;
    public String mSecureProxyPassword;
    public int mSecureProxyPort;
    public String mSecureProxyUsername;
    public final int mSessionFlowControlWindow;
    public final long mSessionWriteTimeoutMillis;
    public long mSettings;
    public final boolean mShouldOverrideFizzHTTP2Static;
    public final boolean mShouldOverrideTlsHTTP2;
    public final boolean mStaleAnswersEnabled;
    public final int mStreamFlowControlWindow;
    public final boolean mSupportH2PubSub;
    public final boolean mTlsHTTP2Override;
    public final long mTransactionIdleTimeoutMillis;
    public final boolean mUseInjectedPreconnect;
    public final boolean mUseLoadBalancing;
    public String mUserAgent;
    public byte[][] mUserInstalledCertificates;

    public class Builder {
        public boolean mAttemptEarlyDataInQuicPreconnect = false;
        public boolean mBidirectionalStreamingEnabled;
        public String mBypassProxyDomains;
        public String mCdnOverride = null;
        public boolean mCircularLogSinkEnabled = true;
        public final boolean mClosed;
        public ConnQualityConfig mConnQualityConfig;
        public Executor mDNSResolverExecutor;
        public boolean mDeadConnTimeoutDryRun;
        public boolean mDnsCacheEnabled = false;
        public int mDnsRequestsOutstanding = 1;
        public boolean mEnableBackgroundQuicConnection = true;
        public boolean mEnableDzCompression = false;
        public boolean mEnableHTTP2 = true;
        public boolean mEnableLigerPreconnect = false;
        public boolean mEnableSimplePreconnectForReinit = false;
        public boolean mEnableTransportCallbacks = false;
        public boolean mEnableZstd = false;
        public EventBase mEventBase;
        public boolean mFBHostOnly = false;
        public boolean mFizzHTTP2StaticOverride = true;
        public FizzSettings mFizzSettings;
        public String mH2PubSubHostnames = "";
        public int mHTTPSessionMaxReadBufferSize = 0;
        public long mHappyEyeballsConnectionDelayMillis = 150;
        public int mIdleHTTPSessionsLowWaterMark = 0;
        public final boolean mInitialized;
        public boolean mInlinePersistenceLoading = true;
        public boolean mIsCompressionFilterEnabled = true;
        public boolean mIsHTTPSEnforced = false;
        public boolean mIsPerDomainLimitEnabled = false;
        public boolean mIsSSLSessionCacheEnabled = true;
        public boolean mIsSandbox = false;
        public boolean mLargerFlowControlWindow = false;
        public int mMaxConcurrentOutgoingStreams = 0;
        public int mMaxIdleHTTP2Sessions = 2;
        public int mMaxPriorityLevelForSession = 0;
        public NetworkStatusMonitor mNetworkStatusMonitor;
        public long mNewConnTimeoutMillis = 30000;
        public Executor mPersistentCachesExecutor;
        public PersistentSSLCacheSettings mPersistentDNSCacheSettings;
        public PersistentSSLCacheSettings mPersistentSSLCacheSettings;
        public String mPingDomainBlacklist;
        public int mPingTimeoutMaxMs;
        public int mPingTimeoutMinMs;
        public int mPingTimeoutRtoMultiple;
        public int mPosixResolverPoolSize = 4;
        public String mPreConnects;
        public String mPreconnectFilePath = "";
        public boolean mProxyFallbackEnabled;
        public String mProxyHost = "";
        public String mProxyPassword = "";
        public int mProxyPort;
        public String mProxyUsername = "";
        public FizzSettings mQuicFizzSettings;
        public QuicSettings mQuicSettings;
        public int mQuicVersion = -87117823;
        public boolean mReInitToRefreshSettings;
        public RootCACallbacks mRootCACallbacks;
        public SSLKeyMaterialCallback mSSLKeyMaterialCallback;
        public SSLVerificationSettings mSSLVerificationSettings;
        public String mSecureProxyHost = "";
        public String mSecureProxyPassword = "";
        public int mSecureProxyPort;
        public String mSecureProxyUsername = "";
        public int mSessionFlowControlWindow = 65535;
        public long mSessionWriteTimeoutMillis = 60000;
        public final long mSettings;
        public boolean mShouldOverrideFizzHTTP2Static = false;
        public boolean mShouldOverrideTlsHTTP2 = false;
        public boolean mStaleAnswersEnabled = true;
        public int mStreamFlowControlWindow = 65535;
        public boolean mSupportH2PubSub = false;
        public boolean mTlsHTTP2Override = true;
        public long mTransactionIdleTimeoutMillis = 60000;
        public boolean mUseInjectedPreconnect = false;
        public boolean mUseLoadBalancing = false;
        public String mUserAgent;
        public byte[][] mUserInstalledCertificates;

        public HTTPClient build() {
            if (this.mFBHostOnly || this.mRootCACallbacks != null) {
                return new HTTPClient(this);
            }
            throw new NullPointerException("You must call setRootCACallbacks().");
        }

        public Builder configurePingTimeout(int i, int i2, int i3, String str, boolean z) {
            this.mPingTimeoutMinMs = i;
            this.mPingTimeoutMaxMs = i2;
            this.mPingTimeoutRtoMultiple = i3;
            this.mPingDomainBlacklist = str;
            this.mDeadConnTimeoutDryRun = z;
            return this;
        }

        public Builder setBypassProxyDomains(String str) {
            if (HTTPClient.stringEquals(str, this.mBypassProxyDomains)) {
                return this;
            }
            this.mBypassProxyDomains = str;
            this.mReInitToRefreshSettings = true;
            return this;
        }

        public Builder setFizzHTTP2StaticOverride(boolean z, boolean z2) {
            this.mShouldOverrideFizzHTTP2Static = z;
            this.mFizzHTTP2StaticOverride = z2;
            return this;
        }

        public Builder setFlowControl(boolean z, int i, int i2) {
            this.mLargerFlowControlWindow = z;
            this.mSessionFlowControlWindow = i;
            this.mStreamFlowControlWindow = i2;
            return this;
        }

        public Builder setIsSandbox(boolean z) {
            if (this.mIsSandbox != z) {
                this.mReInitToRefreshSettings = true;
                this.mIsSandbox = z;
            }
            return this;
        }

        public Builder setProxy(String str, int i, String str2, String str3) {
            if (HTTPClient.stringEquals(str, this.mProxyHost) && i == this.mProxyPort && HTTPClient.stringEquals(str2, this.mProxyUsername) && HTTPClient.stringEquals(str3, this.mProxyPassword)) {
                return this;
            }
            this.mProxyHost = str;
            this.mProxyPort = i;
            this.mProxyUsername = str2;
            this.mProxyPassword = str3;
            this.mReInitToRefreshSettings = true;
            return this;
        }

        public Builder setSecureProxy(String str, int i, String str2, String str3) {
            if (HTTPClient.stringEquals(str, this.mSecureProxyHost) && i == this.mSecureProxyPort && HTTPClient.stringEquals(str2, this.mSecureProxyUsername) && HTTPClient.stringEquals(str3, this.mSecureProxyPassword)) {
                return this;
            }
            this.mSecureProxyHost = str;
            this.mSecureProxyPort = i;
            this.mSecureProxyUsername = str2;
            this.mSecureProxyPassword = str3;
            this.mReInitToRefreshSettings = true;
            return this;
        }

        public Builder setTlsHTTP2Override(boolean z, boolean z2) {
            this.mShouldOverrideTlsHTTP2 = z;
            this.mTlsHTTP2Override = z2;
            return this;
        }

        public Builder setAttemptEarlyDataInQuicPreconnect(boolean z) {
            this.mAttemptEarlyDataInQuicPreconnect = z;
            return this;
        }

        public Builder setBidirectionalStreamingEnabled(boolean z) {
            this.mBidirectionalStreamingEnabled = z;
            return this;
        }

        public Builder setCdnOverride(String str) {
            this.mCdnOverride = str;
            return this;
        }

        public Builder setCircularLogSinkEnabled(boolean z) {
            this.mCircularLogSinkEnabled = z;
            return this;
        }

        public Builder setCompressionFilter(boolean z) {
            this.mIsCompressionFilterEnabled = z;
            return this;
        }

        public Builder setConnQualityConfig(ConnQualityConfig connQualityConfig) {
            this.mConnQualityConfig = connQualityConfig;
            return this;
        }

        public Builder setDNSCacheEnabled(boolean z) {
            this.mDnsCacheEnabled = z;
            return this;
        }

        public Builder setDNSResolverExecutor(Executor executor) {
            this.mDNSResolverExecutor = executor;
            return this;
        }

        public Builder setDnsRequestsOutstanding(int i) {
            this.mDnsRequestsOutstanding = i;
            return this;
        }

        public Builder setEnableBackgroundQuicConnection(boolean z) {
            this.mEnableBackgroundQuicConnection = z;
            return this;
        }

        public Builder setEnableDzCompression(boolean z) {
            this.mEnableDzCompression = z;
            return this;
        }

        public Builder setEnableHTTP2(boolean z) {
            this.mEnableHTTP2 = z;
            return this;
        }

        public Builder setEnableLigerPreconnect(boolean z) {
            this.mEnableLigerPreconnect = z;
            return this;
        }

        public Builder setEnableSimplePreconnectForReinit(boolean z) {
            this.mEnableSimplePreconnectForReinit = z;
            return this;
        }

        public Builder setEnableZstd(boolean z) {
            this.mEnableZstd = z;
            return this;
        }

        public Builder setEventBase(EventBase eventBase) {
            this.mEventBase = eventBase;
            return this;
        }

        public Builder setFBHostOnly(boolean z) {
            this.mFBHostOnly = z;
            return this;
        }

        public Builder setFizzSettings(FizzSettings fizzSettings) {
            this.mFizzSettings = fizzSettings;
            return this;
        }

        public Builder setH2PubSubHostnames(String str) {
            this.mH2PubSubHostnames = str;
            return this;
        }

        public Builder setHTTPSEnforced(boolean z) {
            this.mIsHTTPSEnforced = z;
            return this;
        }

        public Builder setHTTPSessionMaxReadBufferSize(int i) {
            this.mHTTPSessionMaxReadBufferSize = i;
            return this;
        }

        public Builder setHappyEyeballsConnectionDelayMillis(long j) {
            this.mHappyEyeballsConnectionDelayMillis = j;
            return this;
        }

        public Builder setIdleHTTPSessionsLowWaterMark(int i) {
            this.mIdleHTTPSessionsLowWaterMark = i;
            return this;
        }

        public Builder setInlinePersistenceLoading(boolean z) {
            this.mInlinePersistenceLoading = z;
            return this;
        }

        public Builder setLoadBalancing(boolean z) {
            this.mUseLoadBalancing = z;
            return this;
        }

        public Builder setMaxConcurrentOutgoingStreams(int i) {
            this.mMaxConcurrentOutgoingStreams = i;
            return this;
        }

        public Builder setMaxIdleHTTP2Sessions(int i) {
            this.mMaxIdleHTTP2Sessions = i;
            return this;
        }

        public Builder setMaxPriorityLevelForSession(int i) {
            this.mMaxPriorityLevelForSession = i;
            return this;
        }

        public Builder setNetworkStatusMonitor(NetworkStatusMonitor networkStatusMonitor) {
            this.mNetworkStatusMonitor = networkStatusMonitor;
            return this;
        }

        public Builder setNewConnectionTimeoutMillis(long j) {
            this.mNewConnTimeoutMillis = j;
            return this;
        }

        public Builder setPerDomainLimitEnabled(boolean z) {
            this.mIsPerDomainLimitEnabled = z;
            return this;
        }

        public Builder setPersistentCachesExecutor(Executor executor) {
            this.mPersistentCachesExecutor = executor;
            return this;
        }

        public Builder setPersistentDNSCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
            this.mPersistentDNSCacheSettings = persistentSSLCacheSettings;
            return this;
        }

        public Builder setPersistentSSLCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
            this.mPersistentSSLCacheSettings = persistentSSLCacheSettings;
            return this;
        }

        public Builder setPosixDnsResolverPoolSize(int i) {
            this.mPosixResolverPoolSize = i;
            return this;
        }

        public Builder setPreConnects(String str) {
            this.mPreConnects = str;
            return this;
        }

        public Builder setPreconnectFilePath(String str) {
            this.mPreconnectFilePath = str;
            return this;
        }

        public Builder setProxyFallbackEnabled(boolean z) {
            this.mProxyFallbackEnabled = z;
            return this;
        }

        public Builder setQuicFizzSettings(FizzSettings fizzSettings) {
            this.mQuicFizzSettings = fizzSettings;
            return this;
        }

        public Builder setQuicSettings(QuicSettings quicSettings) {
            this.mQuicSettings = quicSettings;
            return this;
        }

        public Builder setQuicVersion(int i) {
            this.mQuicVersion = i;
            return this;
        }

        public Builder setRootCACallbacks(RootCACallbacks rootCACallbacks) {
            this.mRootCACallbacks = rootCACallbacks;
            return this;
        }

        public Builder setSSLKeyMaterialCallback(SSLKeyMaterialCallback sSLKeyMaterialCallback) {
            this.mSSLKeyMaterialCallback = sSLKeyMaterialCallback;
            return this;
        }

        public Builder setSSLSessionCache(boolean z) {
            this.mIsSSLSessionCacheEnabled = z;
            return this;
        }

        public Builder setSSLVerificationSettings(SSLVerificationSettings sSLVerificationSettings) {
            this.mSSLVerificationSettings = sSLVerificationSettings;
            return this;
        }

        public Builder setSessionWriteTimeoutMillis(long j) {
            this.mSessionWriteTimeoutMillis = j;
            return this;
        }

        public Builder setStaleAnswersEnabled(boolean z) {
            this.mStaleAnswersEnabled = z;
            return this;
        }

        public Builder setSupportH2PubSub(boolean z) {
            this.mSupportH2PubSub = z;
            return this;
        }

        public Builder setTransactionIdleTimeoutMillis(long j) {
            this.mTransactionIdleTimeoutMillis = j;
            return this;
        }

        public Builder setTransportCallbackEnabled(boolean z) {
            this.mEnableTransportCallbacks = z;
            return this;
        }

        public Builder setUseInjectedPreconnect(boolean z) {
            this.mUseInjectedPreconnect = z;
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mUserAgent = str;
            return this;
        }

        public Builder setUserInstalledCertificates(byte[][] bArr) {
            this.mUserInstalledCertificates = bArr;
            return this;
        }

        public Builder setZlibFilter(boolean z) {
            this.mIsCompressionFilterEnabled = z;
            return this;
        }
    }

    private native void close(EventBase eventBase);

    private native void connect(EventBase eventBase, String[] strArr);

    private native void init(EventBase eventBase, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, int i, boolean z6, boolean z7, String str2, int i2, String str3, String str4, String str5, int i3, String str6, String str7, String str8, boolean z8, PersistentSSLCacheSettings persistentSSLCacheSettings, SSLVerificationSettings sSLVerificationSettings, byte[][] bArr, long j, long j2, long j3, long j4, PersistentSSLCacheSettings persistentSSLCacheSettings2, boolean z9, boolean z10, int i4, NetworkStatusMonitor networkStatusMonitor, String str9, boolean z11, int i5, int i6, int i7, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, FizzSettings fizzSettings, int i8, int i9, int i10, RootCACallbacks rootCACallbacks, SSLKeyMaterialCallback sSLKeyMaterialCallback, int i11, FizzSettings fizzSettings2, QuicSettings quicSettings, int i12, boolean z20, String str10, boolean z21, boolean z22, String str11, boolean z23, Executor executor, Executor executor2, boolean z24, boolean z25, int i13, int i14, int i15, String str12, boolean z26, ConnQualityConfig connQualityConfig, boolean z27);

    public native synchronized void make(JniHandler jniHandler, NativeReadBuffer nativeReadBuffer, boolean z, TraceEventContext traceEventContext, boolean z2, NetworkStatusMonitor networkStatusMonitor, int i);

    public void nonBlockingInit() {
        callNativeInit(false, false);
    }

    public void reinit() {
        callNativeInit(true, true);
    }

    public static boolean stringEquals(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    private String workaroundSamsungLocalProxyBug(String str) {
        if (stringEquals(str, "[::1]")) {
            return "::1";
        }
        return str;
    }

    public synchronized void callNativeInit(boolean z, boolean z2) {
        synchronized (this) {
            EventBase eventBase = this.mEventBase;
            boolean z3 = this.mIsCompressionFilterEnabled;
            boolean z4 = this.mIsSSLSessionCacheEnabled;
            String str = this.mPreConnects;
            boolean z5 = this.mIsPerDomainLimitEnabled;
            int i = this.mMaxIdleHTTP2Sessions;
            boolean z6 = this.mIsHTTPSEnforced;
            boolean z7 = this.mIsSandbox;
            String str2 = this.mProxyHost;
            int i2 = this.mProxyPort;
            String str3 = this.mProxyUsername;
            String str4 = this.mProxyPassword;
            EventBase eventBase2 = eventBase;
            boolean z8 = z3;
            boolean z9 = z4;
            String str5 = str;
            boolean z10 = z5;
            int i3 = i;
            boolean z11 = z6;
            boolean z12 = z7;
            String str6 = str2;
            int i4 = i2;
            String str7 = str3;
            String str8 = str4;
            init(eventBase2, z, z2, z8, z9, str5, z10, i3, z11, z12, str6, i4, str7, str8, this.mSecureProxyHost, this.mSecureProxyPort, this.mSecureProxyUsername, this.mSecureProxyPassword, this.mBypassProxyDomains, this.mProxyFallbackEnabled, this.mPersistentSSLCacheSettings, this.mSSLVerificationSettings, this.mUserInstalledCertificates, this.mHappyEyeballsConnectionDelayMillis, this.mNewConnTimeoutMillis, this.mSessionWriteTimeoutMillis, this.mTransactionIdleTimeoutMillis, this.mPersistentDNSCacheSettings, this.mDnsCacheEnabled, this.mStaleAnswersEnabled, this.mDnsRequestsOutstanding, this.mNetworkStatusMonitor, this.mUserAgent, this.mLargerFlowControlWindow, this.mSessionFlowControlWindow, this.mStreamFlowControlWindow, this.mMaxPriorityLevelForSession, this.mUseLoadBalancing, this.mEnableLigerPreconnect, this.mEnableSimplePreconnectForReinit, this.mEnableHTTP2, this.mShouldOverrideTlsHTTP2, this.mTlsHTTP2Override, this.mShouldOverrideFizzHTTP2Static, this.mFizzHTTP2StaticOverride, this.mFizzSettings, this.mHTTPSessionMaxReadBufferSize, this.mPosixResolverPoolSize, this.mMaxConcurrentOutgoingStreams, this.mRootCACallbacks, this.mSSLKeyMaterialCallback, this.mIdleHTTPSessionsLowWaterMark, this.mQuicFizzSettings, this.mQuicSettings, this.mQuicVersion, this.mSupportH2PubSub, this.mH2PubSubHostnames, this.mEnableBackgroundQuicConnection, this.mAttemptEarlyDataInQuicPreconnect, this.mCdnOverride, this.mInlinePersistenceLoading, this.mPersistentCachesExecutor, this.mDNSResolverExecutor, this.mEnableZstd, this.mEnableDzCompression, this.mPingTimeoutMinMs, this.mPingTimeoutMaxMs, this.mPingTimeoutRtoMultiple, this.mPingDomainBlacklist, this.mDeadConnTimeoutDryRun, this.mConnQualityConfig, this.mBidirectionalStreamingEnabled);
            this.mInitialized = true;
            this.mReInitToRefreshSettings = false;
        }
    }

    public void connectToPreconnectHostnames() {
        String str;
        if (this.mInitialized && !this.mClosed && (str = this.mPreConnects) != null && str.length() > 0) {
            connect(this.mEventBase, str.split(","));
        }
    }

    public EventBase getEventBase() {
        return this.mEventBase;
    }

    public long getNativeHandle() {
        return this.mSettings;
    }

    public String getReInitReason() {
        return this.mReInitReason;
    }

    public boolean isSandbox() {
        return this.mIsSandbox;
    }

    public boolean reInitializeIfNeeded() {
        if (!this.mReInitToRefreshSettings || !this.mInitialized) {
            this.mReInitToRefreshSettings = false;
            return false;
        }
        callNativeInit(true, true);
        this.mClosed = false;
        this.mReInitToRefreshSettings = false;
        return true;
    }

    public HTTPClient setBypassProxyDomains(String str) {
        if (stringEquals(str, this.mBypassProxyDomains)) {
            return this;
        }
        this.mBypassProxyDomains = str;
        this.mReInitToRefreshSettings = true;
        this.mReInitReason = AnonymousClass000.A0E("secure bypass proxy domains changed: ", str);
        return this;
    }

    public HTTPClient setIsSandbox(boolean z) {
        if (this.mIsSandbox != z) {
            this.mReInitToRefreshSettings = true;
            this.mIsSandbox = z;
            this.mReInitReason = AnonymousClass000.A0S("sandbox setting changed: ", z);
        }
        return this;
    }

    public HTTPClient(Builder builder) {
        this.mEventBase = builder.mEventBase;
        this.mIsCompressionFilterEnabled = builder.mIsCompressionFilterEnabled;
        this.mIsSSLSessionCacheEnabled = builder.mIsSSLSessionCacheEnabled;
        this.mPreConnects = builder.mPreConnects;
        this.mIsPerDomainLimitEnabled = builder.mIsPerDomainLimitEnabled;
        this.mMaxIdleHTTP2Sessions = builder.mMaxIdleHTTP2Sessions;
        this.mIsHTTPSEnforced = builder.mIsHTTPSEnforced;
        this.mIsSandbox = builder.mIsSandbox;
        this.mProxyHost = builder.mProxyHost;
        this.mProxyPort = builder.mProxyPort;
        this.mProxyUsername = builder.mProxyUsername;
        this.mProxyPassword = builder.mProxyPassword;
        this.mSecureProxyHost = builder.mSecureProxyHost;
        this.mSecureProxyPort = builder.mSecureProxyPort;
        this.mSecureProxyUsername = builder.mSecureProxyUsername;
        this.mSecureProxyPassword = builder.mSecureProxyPassword;
        this.mUserAgent = builder.mUserAgent;
        this.mBypassProxyDomains = builder.mBypassProxyDomains;
        this.mProxyFallbackEnabled = builder.mProxyFallbackEnabled;
        this.mPersistentSSLCacheSettings = builder.mPersistentSSLCacheSettings;
        this.mSSLVerificationSettings = builder.mSSLVerificationSettings;
        this.mDnsCacheEnabled = builder.mDnsCacheEnabled;
        this.mStaleAnswersEnabled = builder.mStaleAnswersEnabled;
        this.mDnsRequestsOutstanding = builder.mDnsRequestsOutstanding;
        this.mUserInstalledCertificates = builder.mUserInstalledCertificates;
        this.mHappyEyeballsConnectionDelayMillis = builder.mHappyEyeballsConnectionDelayMillis;
        this.mNewConnTimeoutMillis = builder.mNewConnTimeoutMillis;
        this.mSessionWriteTimeoutMillis = builder.mSessionWriteTimeoutMillis;
        this.mTransactionIdleTimeoutMillis = builder.mTransactionIdleTimeoutMillis;
        this.mPersistentDNSCacheSettings = builder.mPersistentDNSCacheSettings;
        this.mCircularLogSinkEnabled = builder.mCircularLogSinkEnabled;
        this.mNetworkStatusMonitor = builder.mNetworkStatusMonitor;
        this.mEnableTransportCallbacks = builder.mEnableTransportCallbacks;
        this.mLargerFlowControlWindow = builder.mLargerFlowControlWindow;
        this.mSessionFlowControlWindow = builder.mSessionFlowControlWindow;
        this.mStreamFlowControlWindow = builder.mStreamFlowControlWindow;
        this.mUseLoadBalancing = builder.mUseLoadBalancing;
        this.mEnableLigerPreconnect = builder.mEnableLigerPreconnect;
        this.mEnableSimplePreconnectForReinit = builder.mEnableSimplePreconnectForReinit;
        this.mUseInjectedPreconnect = builder.mUseInjectedPreconnect;
        this.mPreconnectFilePath = builder.mPreconnectFilePath;
        this.mEnableHTTP2 = builder.mEnableHTTP2;
        this.mFizzSettings = builder.mFizzSettings;
        this.mHTTPSessionMaxReadBufferSize = builder.mHTTPSessionMaxReadBufferSize;
        this.mQuicFizzSettings = builder.mQuicFizzSettings;
        this.mQuicSettings = builder.mQuicSettings;
        this.mQuicVersion = builder.mQuicVersion;
        this.mReInitToRefreshSettings = builder.mReInitToRefreshSettings;
        this.mInitialized = builder.mInitialized;
        this.mClosed = builder.mClosed;
        this.mSettings = builder.mSettings;
        this.mMaxPriorityLevelForSession = builder.mMaxPriorityLevelForSession;
        this.mMaxConcurrentOutgoingStreams = builder.mMaxConcurrentOutgoingStreams;
        this.mIdleHTTPSessionsLowWaterMark = builder.mIdleHTTPSessionsLowWaterMark;
        this.mShouldOverrideTlsHTTP2 = builder.mShouldOverrideTlsHTTP2;
        this.mTlsHTTP2Override = builder.mTlsHTTP2Override;
        this.mShouldOverrideFizzHTTP2Static = builder.mShouldOverrideFizzHTTP2Static;
        this.mFizzHTTP2StaticOverride = builder.mFizzHTTP2StaticOverride;
        this.mPosixResolverPoolSize = builder.mPosixResolverPoolSize;
        this.mFBHostOnly = builder.mFBHostOnly;
        this.mRootCACallbacks = builder.mRootCACallbacks;
        this.mSSLKeyMaterialCallback = builder.mSSLKeyMaterialCallback;
        this.mSupportH2PubSub = builder.mSupportH2PubSub;
        this.mH2PubSubHostnames = builder.mH2PubSubHostnames;
        this.mEnableBackgroundQuicConnection = builder.mEnableBackgroundQuicConnection;
        this.mAttemptEarlyDataInQuicPreconnect = builder.mAttemptEarlyDataInQuicPreconnect;
        this.mCdnOverride = builder.mCdnOverride;
        this.mInlinePersistenceLoading = builder.mInlinePersistenceLoading;
        this.mPersistentCachesExecutor = builder.mPersistentCachesExecutor;
        this.mDNSResolverExecutor = builder.mDNSResolverExecutor;
        this.mEnableZstd = builder.mEnableZstd;
        this.mEnableDzCompression = builder.mEnableDzCompression;
        this.mPingTimeoutMinMs = builder.mPingTimeoutMinMs;
        this.mPingTimeoutMaxMs = builder.mPingTimeoutMaxMs;
        this.mPingTimeoutRtoMultiple = builder.mPingTimeoutRtoMultiple;
        this.mPingDomainBlacklist = builder.mPingDomainBlacklist;
        this.mDeadConnTimeoutDryRun = builder.mDeadConnTimeoutDryRun;
        this.mConnQualityConfig = builder.mConnQualityConfig;
        this.mBidirectionalStreamingEnabled = builder.mBidirectionalStreamingEnabled;
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public HTTPClient setProxy(String str, int i, String str2, String str3) {
        String workaroundSamsungLocalProxyBug = workaroundSamsungLocalProxyBug(str);
        if (stringEquals(workaroundSamsungLocalProxyBug, this.mProxyHost) && i == this.mProxyPort && stringEquals(str2, this.mProxyUsername) && stringEquals(str3, this.mProxyPassword)) {
            return this;
        }
        this.mProxyHost = workaroundSamsungLocalProxyBug;
        this.mProxyPort = i;
        this.mProxyUsername = str2;
        this.mProxyPassword = str3;
        this.mReInitToRefreshSettings = true;
        this.mReInitReason = "proxy settings changed: proxy host: " + workaroundSamsungLocalProxyBug + ", proxy port: " + i + ", proxy username: " + str2;
        return this;
    }

    public HTTPClient setSecureProxy(String str, int i, String str2, String str3) {
        String workaroundSamsungLocalProxyBug = workaroundSamsungLocalProxyBug(str);
        if (stringEquals(workaroundSamsungLocalProxyBug, this.mSecureProxyHost) && i == this.mSecureProxyPort && stringEquals(str2, this.mSecureProxyUsername) && stringEquals(str3, this.mSecureProxyPassword)) {
            return this;
        }
        this.mSecureProxyHost = workaroundSamsungLocalProxyBug;
        this.mSecureProxyPort = i;
        this.mSecureProxyUsername = str2;
        this.mSecureProxyPassword = str3;
        this.mReInitToRefreshSettings = true;
        this.mReInitReason = "secure proxy settings changed: proxy host: " + workaroundSamsungLocalProxyBug + ", proxy port: " + i + ", proxy username: " + str2;
        return this;
    }

    public void setNativeHandle(long j) {
        this.mSettings = j;
    }

    public HTTPClient setNetworkStatusMonitor(NetworkStatusMonitor networkStatusMonitor) {
        this.mNetworkStatusMonitor = networkStatusMonitor;
        return this;
    }

    public HTTPClient setProxyFallbackEnabled(boolean z) {
        this.mProxyFallbackEnabled = z;
        return this;
    }

    public HTTPClient setUserAgent(String str) {
        this.mUserAgent = str;
        return this;
    }

    public HTTPClient setUserInstalledCertificates(byte[][] bArr) {
        this.mUserInstalledCertificates = bArr;
        return this;
    }

    public void close() {
        if (this.mInitialized && !this.mClosed) {
            close(this.mEventBase);
            this.mClosed = true;
        }
    }

    public void connect(String[] strArr) {
        if (this.mInitialized && !this.mClosed) {
            connect(this.mEventBase, strArr);
        }
    }

    public void init() {
        callNativeInit(false, true);
    }

    public void make(JniHandler jniHandler, NativeReadBuffer nativeReadBuffer, TraceEventContext traceEventContext) {
        int i;
        JniHandler jniHandler2 = jniHandler;
        if (this.mEnableTransportCallbacks) {
            i = jniHandler.getEnabledCallbackFlag();
        } else {
            i = 0;
        }
        NativeReadBuffer nativeReadBuffer2 = nativeReadBuffer;
        make(jniHandler2, nativeReadBuffer2, traceEventContext.mSamplePolicy.isSampled(), traceEventContext, this.mCircularLogSinkEnabled, this.mNetworkStatusMonitor, i);
    }
}
