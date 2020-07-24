package p000X;

import android.content.Context;
import com.facebook.proxygen.HTTPClient;
import com.facebook.proxygen.HTTPThread;
import com.facebook.proxygen.NetworkStatusMonitor;
import com.facebook.proxygen.PersistentSSLCacheSettings;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Map;

/* renamed from: X.0kT  reason: invalid class name and case insensitive filesystem */
public final class C14430kT extends C14220jx {
    public static String A0K = "";
    public static String A0L = "";
    public static String A0M = "";
    public static int A0N;
    public static int A0O;
    public static int A0P;
    public static HTTPClient A0Q;
    public static NetworkStatusMonitor A0R;
    public static C14920ly A0S;
    public static String A0T;
    public static Thread A0U;
    public static boolean A0V;
    public static final HTTPThread A0W = new HTTPThread();
    public C14980m8 A00 = null;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C14410kR A07;
    public final C14820ln A08;
    public final C14810lm A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final C13960jX A0J;

    static {
        AnonymousClass0Y1.A08("fb");
        AnonymousClass0Y1.A08("liger");
    }

    public static PersistentSSLCacheSettings A01(Context context, String str) {
        File cacheDir = context.getCacheDir();
        AnonymousClass0a4.A06(str);
        String str2 = A0T;
        if (str2 == null) {
            str2 = "";
        }
        PersistentSSLCacheSettings.Builder builder = new PersistentSSLCacheSettings.Builder(new File(cacheDir, AnonymousClass000.A0J(str, str2, ".store")).toString());
        builder.cacheCapacity = 30;
        builder.syncInterval = 150;
        return builder.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (A0N != r4) goto L_0x0082;
     */
    public final C33861dc A02(AnonymousClass1C3 r15) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (A0Q) {
            String property = System.getProperty("http.nonProxyHosts");
            String property2 = System.getProperty("http.proxyHost");
            Integer integer = Integer.getInteger("http.proxyPort");
            if (integer == null) {
                property2 = "";
                i = 0;
            } else {
                i = integer.intValue();
            }
            String property3 = System.getProperty("https.proxyHost");
            Integer integer2 = Integer.getInteger("https.proxyPort");
            if (integer2 == null) {
                property3 = "";
                i2 = 0;
            } else {
                i2 = integer2.intValue();
            }
            if (property2 == null || property2.equals("")) {
                property2 = System.getProperty("proxyHost");
                Integer integer3 = Integer.getInteger("proxyPort");
                if (integer3 == null) {
                    property2 = "";
                    i = 0;
                } else {
                    i = integer3.intValue();
                }
            }
            if (property3 == null || property3.equals("")) {
                property3 = property2;
                i2 = i;
            }
            boolean z4 = true;
            if (property == null || property.equalsIgnoreCase(A0K)) {
                z = false;
            } else {
                A0K = property;
                z = true;
            }
            if (property2 != null && !property2.equalsIgnoreCase(A0L)) {
                A0L = property2;
                z = true;
            }
            if (!z) {
                z2 = false;
            }
            z2 = true;
            A0N = i;
            if (property3 != null && !property3.equalsIgnoreCase(A0M)) {
                A0M = property3;
                z2 = true;
            }
            if (!z2 && A0O == i2) {
                z4 = false;
            }
            A0O = i2;
            if (z4) {
                HTTPClient hTTPClient = A0Q;
                hTTPClient.setProxy(A0L, i, "", "");
                hTTPClient.setSecureProxy(A0M, i2, "", "");
                hTTPClient.setBypassProxyDomains(A0K);
                hTTPClient.mProxyFallbackEnabled = true;
                hTTPClient.reInitializeIfNeeded();
            }
        }
        C33861dc A002 = this.A09.A00(this, r15);
        int i3 = 0;
        while (true) {
            switch (A002.A01) {
                case 301:
                case 302:
                case 303:
                    z3 = true;
                    break;
                default:
                    z3 = false;
                    break;
            }
            if (z3) {
                int i4 = i3 + 1;
                if (i3 < 10) {
                    AnonymousClass1C4 r2 = r15.A02;
                    C17190pp A003 = A002.A00("Location");
                    if (A003 != null) {
                        try {
                            URI create = URI.create(A003.A01);
                            if (!create.isAbsolute()) {
                                create = r2.A04.resolve(create);
                            }
                            AnonymousClass1CA r0 = A002.A00;
                            if (r0 != null) {
                                r0.close();
                            }
                            AnonymousClass1C3 r1 = new AnonymousClass1C3(new AnonymousClass1C4(create.toString(), r2.A03, r2.A02, C206258sI.restrictHeadersBasedOnDomain(create, r2.A05), r2.A01, true, (Map) null, false), r15.A03);
                            r15.A01(new C157266ne(this, r1));
                            A002 = this.A09.A00(this, r1);
                            i3 = i4;
                        } catch (IllegalArgumentException unused) {
                            throw new IOException(AnonymousClass000.A0E("Invalid redirect URI: ", A003.A01));
                        }
                    } else {
                        throw new IOException("Redirect required, but Location header missing from response");
                    }
                }
            }
        }
        if (!z3) {
            return A002;
        }
        throw new IOException("Reached redirect limit = 10");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:373)
        	at java.base/java.util.ArrayList.get(ArrayList.java:425)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public C14430kT(android.content.Context r11, java.lang.String r12, boolean r13, java.lang.String r14, boolean r15, boolean r16, p000X.C13960jX r17, p000X.C14410kR r18, boolean r19, int r20, boolean r21, boolean r22, boolean r23, boolean r24, java.lang.String r25, int r26, boolean r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33, int r34, boolean r35, boolean r36) {
        /*
            r10 = this;
            r4 = 1
            r10.<init>()
            r0 = 0
            r10.A00 = r0
            X.0lm r0 = new X.0lm
            r1 = r35
            r0.<init>(r1)
            r10.A09 = r0
            r0 = r17
            r10.A0J = r0
            X.0ln r1 = new X.0ln
            X.0lo r0 = p000X.C14820ln.A02
            r1.<init>(r0)
            r10.A08 = r1
            r10.A0B = r12
            A0T = r14
            r0 = r18
            r10.A07 = r0
            A0P = r20
            r0 = r21
            r10.A0C = r0
            r0 = r22
            r10.A0D = r0
            r0 = r23
            r10.A0H = r0
            r0 = r24
            r10.A0G = r0
            r0 = r25
            r10.A0A = r0
            r0 = r26
            r10.A03 = r0
            r0 = r27
            r10.A0I = r0
            r0 = r28
            r10.A06 = r0
            r0 = r29
            r10.A01 = r0
            r0 = r30
            r10.A05 = r0
            r0 = r31
            r10.A02 = r0
            r0 = r32
            r10.A0F = r0
            r0 = r33
            r10.A0E = r0
            r0 = r34
            r10.A04 = r0
            r2 = r10
            r1 = 0
            monitor-enter(r2)
            p000X.C12670hC.A01()     // Catch:{ all -> 0x0218 }
            java.lang.Thread r5 = new java.lang.Thread     // Catch:{ all -> 0x0218 }
            X.0lr r3 = new X.0lr     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.HTTPThread r0 = A0W     // Catch:{ all -> 0x0218 }
            r3.<init>(r0)     // Catch:{ all -> 0x0218 }
            r5.<init>(r3)     // Catch:{ all -> 0x0218 }
            A0U = r5     // Catch:{ all -> 0x0218 }
            r0 = 7
            r5.setPriority(r0)     // Catch:{ all -> 0x0218 }
            java.lang.Thread r0 = A0U     // Catch:{ all -> 0x0218 }
            r0.start()     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.HTTPThread r0 = A0W     // Catch:{ all -> 0x0218 }
            r0.waitForInitialization()     // Catch:{ all -> 0x0218 }
            boolean r0 = r0.eventBaseInitErrored()     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x0212
            A0V = r13     // Catch:{ all -> 0x0218 }
            X.0ly r5 = new X.0ly     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.HTTPThread r0 = A0W     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.EventBase r3 = r0.getEventBase()     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = A0T     // Catch:{ all -> 0x0218 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0218 }
            A0S = r5     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.HTTPClient$Builder r3 = new com.facebook.proxygen.HTTPClient$Builder     // Catch:{ all -> 0x0218 }
            r3.<init>()     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.HTTPThread r0 = A0W     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.EventBase r0 = r0.getEventBase()     // Catch:{ all -> 0x0218 }
            r3.mEventBase = r0     // Catch:{ all -> 0x0218 }
            r3.mMaxIdleHTTP2Sessions = r4     // Catch:{ all -> 0x0218 }
            r3.mIsPerDomainLimitEnabled = r1     // Catch:{ all -> 0x0218 }
            r3.mUseLoadBalancing = r4     // Catch:{ all -> 0x0218 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0218 }
            java.io.File r8 = r11.getCacheDir()     // Catch:{ all -> 0x0218 }
            java.lang.String r5 = "fbdns"
            p000X.AnonymousClass0a4.A06(r5)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = A0T     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = ""
        L_0x00bc:
            java.lang.String r9 = ".store"
            java.lang.String r0 = p000X.AnonymousClass000.A0J(r5, r0, r9)     // Catch:{ all -> 0x0218 }
            r7.<init>(r8, r0)     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.PersistentSSLCacheSettings$Builder r5 = new com.facebook.proxygen.PersistentSSLCacheSettings$Builder     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0218 }
            r5.<init>(r0)     // Catch:{ all -> 0x0218 }
            r0 = 200(0xc8, float:2.8E-43)
            r5.cacheCapacity = r0     // Catch:{ all -> 0x0218 }
            r0 = 150(0x96, float:2.1E-43)
            r5.syncInterval = r0     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.PersistentSSLCacheSettings r0 = r5.build()     // Catch:{ all -> 0x0218 }
            r3.mPersistentDNSCacheSettings = r0     // Catch:{ all -> 0x0218 }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0218 }
            java.io.File r7 = r11.getCacheDir()     // Catch:{ all -> 0x0218 }
            java.lang.String r5 = "fbtlsx"
            p000X.AnonymousClass0a4.A06(r5)     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = A0T     // Catch:{ all -> 0x0218 }
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = ""
        L_0x00ed:
            java.lang.String r0 = p000X.AnonymousClass000.A0J(r5, r0, r9)     // Catch:{ all -> 0x0218 }
            r8.<init>(r7, r0)     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.PersistentSSLCacheSettings$Builder r5 = new com.facebook.proxygen.PersistentSSLCacheSettings$Builder     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0218 }
            r5.<init>(r0)     // Catch:{ all -> 0x0218 }
            r0 = 50
            r5.cacheCapacity = r0     // Catch:{ all -> 0x0218 }
            r0 = 150(0x96, float:2.1E-43)
            r5.syncInterval = r0     // Catch:{ all -> 0x0218 }
            r5.enableCrossDomainTickets = r4     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.PersistentSSLCacheSettings r0 = r5.build()     // Catch:{ all -> 0x0218 }
            r3.mPersistentSSLCacheSettings = r0     // Catch:{ all -> 0x0218 }
            r3.mDnsCacheEnabled = r4     // Catch:{ all -> 0x0218 }
            r0 = 163840(0x28000, float:2.29589E-40)
            r3.setFlowControl(r4, r0, r0)     // Catch:{ all -> 0x0218 }
            r3.mEnableHTTP2 = r4     // Catch:{ all -> 0x0218 }
            r3.mShouldOverrideFizzHTTP2Static = r4     // Catch:{ all -> 0x0218 }
            r3.mFizzHTTP2StaticOverride = r1     // Catch:{ all -> 0x0218 }
            r3.mIsHTTPSEnforced = r4     // Catch:{ all -> 0x0218 }
            r3.setIsSandbox(r1)     // Catch:{ all -> 0x0218 }
            r0 = r36
            r3.mEnableZstd = r0     // Catch:{ all -> 0x0218 }
            if (r16 == 0) goto L_0x0139
            com.facebook.proxygen.HTTPThread r0 = A0W     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.EventBase r0 = r0.getEventBase()     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.NetworkStatusMonitor r1 = new com.facebook.proxygen.NetworkStatusMonitor     // Catch:{ all -> 0x0218 }
            r1.<init>(r0)     // Catch:{ all -> 0x0218 }
            r0 = 5
            r1.init(r0)     // Catch:{ all -> 0x0218 }
            A0R = r1     // Catch:{ all -> 0x0218 }
            r3.mNetworkStatusMonitor = r1     // Catch:{ all -> 0x0218 }
        L_0x0139:
            if (r15 == 0) goto L_0x0141
            java.lang.String r0 = "i.instagram.com"
            r3.mPreConnects = r0     // Catch:{ all -> 0x0218 }
            r3.mEnableLigerPreconnect = r4     // Catch:{ all -> 0x0218 }
        L_0x0141:
            if (r19 == 0) goto L_0x014d
            java.util.ArrayList r0 = p000X.BM5.A00()     // Catch:{ all -> 0x0218 }
            byte[][] r0 = p000X.BM5.A01(r0)     // Catch:{ all -> 0x0218 }
            r3.mUserInstalledCertificates = r0     // Catch:{ all -> 0x0218 }
        L_0x014d:
            boolean r0 = A0V     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.FizzSettings$Builder r1 = new com.facebook.proxygen.FizzSettings$Builder     // Catch:{ all -> 0x0218 }
            r1.<init>()     // Catch:{ all -> 0x0218 }
            r1.enabled = r0     // Catch:{ all -> 0x0218 }
            r1.sendEarlyData = r4     // Catch:{ all -> 0x0218 }
            r1.persistentCacheEnabled = r4     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "igfizz"
            com.facebook.proxygen.PersistentSSLCacheSettings r0 = A01(r11, r0)     // Catch:{ all -> 0x0218 }
            r1.cacheSettings = r0     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.FizzSettings r0 = r1.build()     // Catch:{ all -> 0x0218 }
            r3.mFizzSettings = r0     // Catch:{ all -> 0x0218 }
            boolean r0 = r10.A0C     // Catch:{ all -> 0x0218 }
            if (r0 == 0) goto L_0x01c8
            com.facebook.proxygen.QuicSettings$Builder r1 = new com.facebook.proxygen.QuicSettings$Builder     // Catch:{ all -> 0x0218 }
            r1.<init>()     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = r10.A0A     // Catch:{ all -> 0x0218 }
            r1.mHostsWithQuicEnabled = r0     // Catch:{ all -> 0x0218 }
            boolean r0 = r10.A0H     // Catch:{ all -> 0x0218 }
            r1.mEnableQuicIgcdn = r0     // Catch:{ all -> 0x0218 }
            r1.mEnableQuicIgfna = r0     // Catch:{ all -> 0x0218 }
            int r0 = r10.A03     // Catch:{ all -> 0x0218 }
            r1.mMaxNumRTOs = r0     // Catch:{ all -> 0x0218 }
            boolean r0 = r10.A0G     // Catch:{ all -> 0x0218 }
            r1.mEnableSocketErrMsgCallback = r0     // Catch:{ all -> 0x0218 }
            int r0 = r10.A06     // Catch:{ all -> 0x0218 }
            r1.mTcpQuicRaceDelayMilliseconds = r0     // Catch:{ all -> 0x0218 }
            int r0 = r10.A01     // Catch:{ all -> 0x0218 }
            r1.mConnFlowControlWindow = r0     // Catch:{ all -> 0x0218 }
            int r0 = r10.A05     // Catch:{ all -> 0x0218 }
            r1.setStreamFlowControlWindows(r0, r0, r0)     // Catch:{ all -> 0x0218 }
            int r0 = r10.A02     // Catch:{ all -> 0x0218 }
            r1.mIdleTimeoutInSeconds = r0     // Catch:{ all -> 0x0218 }
            boolean r0 = r10.A0F     // Catch:{ all -> 0x0218 }
            r1.mShouldUseRecvmmsgForBatch = r0     // Catch:{ all -> 0x0218 }
            boolean r0 = r10.A0E     // Catch:{ all -> 0x0218 }
            r1.mShouldRecvBatch = r0     // Catch:{ all -> 0x0218 }
            int r0 = r10.A04     // Catch:{ all -> 0x0218 }
            r1.mRecvBatchSize = r0     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.QuicSettings r0 = r1.build()     // Catch:{ all -> 0x0218 }
            r3.mQuicSettings = r0     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.FizzSettings$Builder r1 = new com.facebook.proxygen.FizzSettings$Builder     // Catch:{ all -> 0x0218 }
            r1.<init>()     // Catch:{ all -> 0x0218 }
            r1.enabled = r4     // Catch:{ all -> 0x0218 }
            r0 = 0
            r1.compatMode = r0     // Catch:{ all -> 0x0218 }
            boolean r0 = r10.A0I     // Catch:{ all -> 0x0218 }
            r1.sendEarlyData = r0     // Catch:{ all -> 0x0218 }
            r1.persistentCacheEnabled = r4     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = "igquicfizz"
            com.facebook.proxygen.PersistentSSLCacheSettings r0 = A01(r11, r0)     // Catch:{ all -> 0x0218 }
            r1.cacheSettings = r0     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.FizzSettings r0 = r1.build()     // Catch:{ all -> 0x0218 }
            r3.mQuicFizzSettings = r0     // Catch:{ all -> 0x0218 }
            boolean r0 = r10.A0D     // Catch:{ all -> 0x0218 }
            r3.mAttemptEarlyDataInQuicPreconnect = r0     // Catch:{ all -> 0x0218 }
        L_0x01c8:
            X.0m6 r0 = new X.0m6     // Catch:{ all -> 0x0218 }
            r0.<init>(r10)     // Catch:{ all -> 0x0218 }
            r3.mRootCACallbacks = r0     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.HTTPClient r1 = r3.build()     // Catch:{ all -> 0x0218 }
            A0Q = r1     // Catch:{ all -> 0x0218 }
            r0 = 0
            r1.callNativeInit(r0, r0)     // Catch:{ all -> 0x0218 }
            X.0ly r0 = A0S     // Catch:{ all -> 0x0218 }
            com.facebook.proxygen.utils.CircularEventLog r0 = r0.A01     // Catch:{ all -> 0x0218 }
            r0.nonBlockingInit()     // Catch:{ all -> 0x0218 }
            monitor-exit(r2)
            java.lang.Class<X.0m8> r2 = p000X.C14980m8.class
            monitor-enter(r2)
            X.0m8 r1 = p000X.C14980m8.A01     // Catch:{ all -> 0x020f }
            r0 = 0
            if (r1 == 0) goto L_0x01ea
            r0 = 1
        L_0x01ea:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x01f7
            monitor-enter(r2)
            X.0m8 r0 = p000X.C14980m8.A01     // Catch:{ all -> 0x01f4 }
            p000X.AnonymousClass0a4.A06(r0)     // Catch:{ all -> 0x01f4 }
            goto L_0x0208
        L_0x01f4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01f7:
            monitor-enter(r2)
            X.0m8 r1 = p000X.C14980m8.A01     // Catch:{ all -> 0x020c }
            r0 = 0
            if (r1 != 0) goto L_0x01fe
            r0 = 1
        L_0x01fe:
            p000X.AnonymousClass0a4.A09(r0)     // Catch:{ all -> 0x020c }
            X.0m8 r0 = new X.0m8     // Catch:{ all -> 0x020c }
            r0.<init>()     // Catch:{ all -> 0x020c }
            p000X.C14980m8.A01 = r0     // Catch:{ all -> 0x020c }
        L_0x0208:
            monitor-exit(r2)
            r10.A00 = r0
            return
        L_0x020c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x020f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0212:
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0218 }
            r0.<init>()     // Catch:{ all -> 0x0218 }
            throw r0     // Catch:{ all -> 0x0218 }
        L_0x0218:
            r1 = move-exception
            com.facebook.proxygen.utils.LigerInitializationException r0 = new com.facebook.proxygen.utils.LigerInitializationException     // Catch:{ all -> 0x021f }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x021f }
            throw r0     // Catch:{ all -> 0x021f }
        L_0x021f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C14430kT.<init>(android.content.Context, java.lang.String, boolean, java.lang.String, boolean, boolean, X.0jX, X.0kR, boolean, int, boolean, boolean, boolean, boolean, java.lang.String, int, boolean, int, int, int, int, boolean, boolean, int, boolean, boolean):void");
    }
}
