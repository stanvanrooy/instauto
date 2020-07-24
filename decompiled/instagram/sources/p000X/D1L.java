package p000X;

import android.content.Context;
import android.os.Handler;
import com.facebook.common.dextricks.DexStore;
import com.facebook.exoplayer.datasource.FbHttpProxyDataSource;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.File;
import java.util.Map;
import java.util.NavigableSet;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.D1L */
public final class D1L {
    public static final String A0G = AnonymousClass000.A0E("CacheManager", "_default");
    public C29607D1m A00;
    public C29570D0b A01;
    public D2I A02;
    public AtomicInteger A03;
    public boolean A04 = false;
    public final C29581D0m A05;
    public final int A06;
    public final Handler A07;
    public final C29608D1n A08;
    public final C29601D1g A09;
    public final D2M A0A;
    public final C29596D1b A0B;
    public final HeroPlayerSetting A0C;
    public final Map A0D;
    public final Map A0E;
    public final Context A0F;

    public final synchronized C29570D0b A04() {
        if (this.A01 == null) {
            A01();
        }
        return this.A01;
    }

    private void A01() {
        try {
            C200008hB.A01("CacheManagerInitCache");
            File A002 = A00(this.A08.A01, Constants.ZERO);
            if (!A002.exists()) {
                A002.mkdirs();
            }
            this.A01 = new C29570D0b(A00(this.A08.A01, Constants.ZERO), this.A05, this.A0C.A0T.A0B);
            if (this.A0C.A0T.A0A && A04() != null) {
                if (C29571D0c.A03 == null) {
                    C29571D0c.A03 = new C29571D0c();
                }
                C29571D0c d0c = C29571D0c.A03;
                C29570D0b A042 = A04();
                C29596D1b d1b = this.A0B;
                int i = this.A0C.A0T.A00;
                if (d1b != null) {
                    d0c.A01 = new C29590D0v(d1b, i);
                    d0c.A02 = "HeroSimpleCache";
                    d0c.A00 = new C29579D0k();
                    A042.A2e(d0c);
                }
            }
            Map map = this.A0E;
            boolean z = false;
            if (map.containsKey("dummy_default_setting") && Integer.parseInt((String) map.get("dummy_default_setting")) != 0) {
                z = true;
            }
            if (!z) {
                C29596D1b d1b2 = this.A0B;
                d1b2.A00.A0A.A00(new C41991rK("", C29634D2r.CACHE.name(), C42071rS.USE_DEFAULT_CACHE_SETTING.name(), "using default exp settings"));
            }
            if (!this.A0C.A0p) {
                C29596D1b d1b3 = this.A0B;
                d1b3.A00.A0A.A00(new C41991rK("", C29634D2r.CACHE.name(), C42071rS.USE_DEFAULT_CACHE_SETTING.name(), "using default exp settings"));
            }
            if (this.A0C.A0T.A06 > 0) {
                AnonymousClass0ZA.A09(this.A07, new C29598D1d(this), 3000, -62008637);
            }
        } finally {
            C200008hB.A00();
            C40431oe.A01(A0G, "CacheInitialized", new Object[0]);
        }
    }

    public final void A07(VideoPrefetchRequest videoPrefetchRequest) {
        C29606D1l d1l;
        String str = videoPrefetchRequest.A0B;
        VideoSource videoSource = videoPrefetchRequest.A09;
        String A002 = C40431oe.A00(str, videoSource.A0D, videoSource.A03);
        synchronized (this.A0D) {
            d1l = (C29606D1l) this.A0D.get(A002);
        }
        if (d1l != null) {
            d1l.A86();
        }
    }

    public D1L(Context context, C29608D1n d1n, Map map, HeroPlayerSetting heroPlayerSetting, D2M d2m, C29596D1b d1b, Handler handler, D2I d2i) {
        try {
            C200008hB.A01("CacheManagerLaunch");
            this.A08 = d1n;
            this.A0E = map;
            this.A0C = heroPlayerSetting;
            this.A0A = d2m;
            this.A0B = d1b;
            this.A0D = new WeakHashMap();
            this.A06 = d1n.A00;
            this.A0F = context;
            this.A02 = d2i;
            HeroPlayerSetting heroPlayerSetting2 = this.A0C;
            if (heroPlayerSetting2.A1Q) {
                this.A09 = new C29601D1g(heroPlayerSetting2.A02);
            } else {
                this.A09 = null;
            }
            this.A03 = new AtomicInteger(0);
            C29581D0m d0f = new C29574D0f((long) this.A06);
            this.A05 = d1n.A02 ? new C29582D0n(this, d0f, this.A0B) : d0f;
            this.A07 = handler;
            A01();
        } finally {
            C200008hB.A00();
        }
    }

    public static File A00(String str, Integer num) {
        String str2;
        switch (num.intValue()) {
            case 1:
                str2 = "/ExoPlayerCacheDir/videocachemetadata";
                break;
            case 2:
                str2 = "/ExoPlayerCacheDir/videoprefetchcache";
                break;
            default:
                str2 = "/ExoPlayerCacheDir/videocache";
                break;
        }
        return new File(AnonymousClass000.A0E(str, str2));
    }

    public static void A02(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File A022 : listFiles) {
                A02(A022);
            }
        }
        file.delete();
    }

    public static void A03(String str, Integer num) {
        String str2;
        String str3;
        File A002 = A00(str, num);
        if (A002.exists()) {
            try {
                int intValue = num.intValue();
                switch (intValue) {
                    case 1:
                        str2 = "METADATA";
                        break;
                    case 2:
                        str2 = "PREFETCH";
                        break;
                    default:
                        str2 = "GENERAL";
                        break;
                }
                C200008hB.A01(AnonymousClass000.A0E("empty", str2));
                String str4 = A0G;
                switch (intValue) {
                    case 1:
                        str3 = "METADATA";
                        break;
                    case 2:
                        str3 = "PREFETCH";
                        break;
                    default:
                        str3 = "GENERAL";
                        break;
                }
                C40431oe.A01(str4, AnonymousClass000.A0E("purging ", str3), new Object[0]);
                File[] listFiles = A002.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        File[] listFiles2 = file.listFiles();
                        if (listFiles2 != null) {
                            for (File A022 : listFiles2) {
                                A02(A022);
                            }
                        }
                        file.delete();
                    }
                }
                A002.delete();
            } finally {
                C200008hB.A00();
            }
        }
    }

    public final void A06() {
        long j;
        C29570D0b A042 = A04();
        if (A042 != null) {
            if (this.A00 == null) {
                this.A00 = new C29607D1m(BME.A00);
            }
            C29607D1m d1m = this.A00;
            long j2 = this.A0C.A0T.A06;
            for (String AHc : A042.AOS()) {
                NavigableSet<C25941Bcs> AHc2 = A042.AHc(AHc);
                if (AHc2 != null) {
                    for (C25941Bcs bcs : AHc2) {
                        if (d1m.A00.now() - bcs.A01 >= j2) {
                            A042.A06(bcs, "ttl_eviction");
                        }
                    }
                }
            }
            Handler handler = this.A07;
            C29597D1c d1c = new C29597D1c(this);
            if (this.A04) {
                j = this.A0C.A0T.A04;
            } else {
                j = this.A0C.A0T.A05;
            }
            AnonymousClass0ZA.A09(handler, d1c, j, 1861613430);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0091, code lost:
        if (r7.equals("0") != false) goto L_0x0093;
     */
    public final C29606D1l A05(C29262Cuo cuo, long j, int i, boolean z, String str, boolean z2, Map map, C29605D1k d1k, D19 d19, D29 d29, Integer num, int i2, int i3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C29603D1i d1i, boolean z8, String str2, AtomicBoolean atomicBoolean) {
        D17 A002;
        boolean z9;
        D17 d17;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z10;
        int i8;
        long j2;
        D1H d1h = new D1H();
        String str3 = "Apache";
        int i9 = i3;
        boolean z11 = z;
        boolean z12 = z8;
        C29262Cuo cuo2 = cuo;
        int i10 = i2;
        if (z8) {
            d17 = new C29257Cuj("ExoService", (C29267Cut) null, i10, i9);
        } else {
            Map map2 = this.A0E;
            boolean z13 = false;
            if (map2.containsKey("dash.use_liger_for_vod") && Integer.parseInt((String) map2.get("dash.use_liger_for_vod")) != 0) {
                z13 = true;
            }
            if (z13 || this.A0C.A0w) {
                A002 = C29279Cv5.A01.A00("ExoService", (C29267Cut) null, d1h.A00, i10, i9, cuo2);
                str3 = C29279Cv5.A01.A01();
                z9 = true;
            } else {
                C40431oe.A01(A0G, "using default data source for apache", new Object[0]);
                A002 = new C29257Cuj("ExoService", (C29267Cut) null, i10, i9);
                Map map3 = this.A0E;
                z9 = false;
                if (map3.containsKey("progressive.enable_throttling_data_source") && Integer.parseInt((String) map3.get("progressive.enable_throttling_data_source")) != 0) {
                    z9 = true;
                }
            }
            if (z9 && !z && z2) {
                Map map4 = this.A0E;
                if (map4.containsKey("progressive.throttling_buffer_low")) {
                    i4 = Integer.parseInt((String) map4.get("progressive.throttling_buffer_low"));
                } else {
                    i4 = DexStore.LOAD_RESULT_PGO;
                }
                if (i4 > 0) {
                    Map map5 = this.A0E;
                    if (map5.containsKey("progressive.throttling_buffer_high")) {
                        i5 = Integer.parseInt((String) map5.get("progressive.throttling_buffer_high"));
                    } else {
                        i5 = DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
                    }
                    if (i5 > 0) {
                        Map map6 = this.A0E;
                        if (map6.containsKey("progressive.throttling_buffer_low")) {
                            i6 = Integer.parseInt((String) map6.get("progressive.throttling_buffer_low"));
                        } else {
                            i6 = DexStore.LOAD_RESULT_PGO;
                        }
                        Map map7 = this.A0E;
                        if (map7.containsKey("progressive.throttling_buffer_high")) {
                            i7 = Integer.parseInt((String) map7.get("progressive.throttling_buffer_high"));
                        } else {
                            i7 = DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
                        }
                        d17 = new D16(A002, i6, i7);
                        C40431oe.A01(A0G, "Created %s Data Source for video %s (timeout_ms connect=%d read=%d)", str3, cuo2.A04, Integer.valueOf(i10), Integer.valueOf(i9));
                    }
                }
            }
            d17 = A002;
            C40431oe.A01(A0G, "Created %s Data Source for video %s (timeout_ms connect=%d read=%d)", str3, cuo2.A04, Integer.valueOf(i10), Integer.valueOf(i9));
        }
        File A003 = A00(this.A08.A01, Constants.ZERO);
        if (!A003.exists()) {
            A003.mkdirs();
        }
        C29605D1k d1k2 = d1k;
        if (d1k2 instanceof D1Q) {
            d1h.A00(((D1Q) d1k2).A00);
        }
        D19 d192 = d19;
        if (d19 != null) {
            d1h.A00(d192);
        }
        D29 d292 = d29;
        if (d29 != null) {
            boolean z14 = z3;
            String str4 = str;
            boolean z15 = z6;
            long j3 = j;
            boolean z16 = z7;
            C29605D1k d1k3 = d1k2;
            d1h.A00(new D1N(cuo2, j3, d292, z11, str4, false, str3, d1k3, (String) null, num, z14, z4, z5, z15, z16, false, false, d1i, str2));
        }
        if (num == null) {
            num = Constants.ZERO;
        }
        C43721uy.A00(num);
        FbHttpProxyDataSource fbHttpProxyDataSource = new FbHttpProxyDataSource(cuo2, d17, i, d1h);
        String str5 = cuo2.A04;
        if (str5 != null && !str5.equals("")) {
            z10 = false;
        }
        z10 = true;
        if (z10) {
            C40431oe.A02(A0G, "Invalid videoId is %s", str5);
        }
        C29596D1b d1b = this.A0B;
        Map map8 = this.A0E;
        if (map8.containsKey("prefetch.block_on_same_cache_key_timeout_ms")) {
            i8 = Integer.parseInt((String) map8.get("prefetch.block_on_same_cache_key_timeout_ms"));
        } else {
            i8 = CameraEnumerationAndroid.C01581.MIN_FPS_THRESHOLD;
        }
        Map map9 = this.A0E;
        if (map9.containsKey("prefetch.max_cache_file_size")) {
            j2 = Long.parseLong((String) map9.get("prefetch.max_cache_file_size"));
        } else {
            j2 = 102400;
        }
        C29584D0p d0p = new C29584D0p(cuo2, this, fbHttpProxyDataSource, z11, d1h, d1b, i8, j2, z12, this.A0C, this.A07, atomicBoolean);
        Map map10 = map;
        if (!map10.isEmpty()) {
            return new C29585D0q(d0p, map10);
        }
        return d0p;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02ad A[Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0426 A[Catch:{ EOFException -> 0x04f3, IOException | InterruptedException -> 0x04e9, all -> 0x0590 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x044e A[Catch:{ EOFException -> 0x04f3, IOException | InterruptedException -> 0x04e9, all -> 0x0590 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0520 A[Catch:{ EOFException -> 0x04f3, IOException | InterruptedException -> 0x04e9, all -> 0x0590 }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0525 A[Catch:{ EOFException -> 0x04f3, IOException | InterruptedException -> 0x04e9, all -> 0x0590 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x020f A[Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }] */
    public final void A08(com.facebook.video.heroplayer.ipc.VideoPrefetchRequest r90, p000X.C29605D1k r91, p000X.D19 r92, p000X.D29 r93, p000X.C29603D1i r94, boolean r95, boolean r96, boolean r97, p000X.C29677D4l r98, boolean r99) {
        /*
            r89 = this;
            r2 = r90
            int r0 = r2.A02
            long r3 = (long) r0
            r5 = r89
            int r0 = r5.A06
            long r0 = (long) r0
            r16 = 0
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x003c
            java.lang.String r4 = A0G
            r0 = 3
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r2.A09
            android.net.Uri r0 = r0.A03
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.toString()
        L_0x001f:
            r3[r16] = r0
            r1 = 1
            int r0 = r2.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r1] = r0
            r2 = 2
            int r0 = r5.A06
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "Attempting to prefetch more bytes than the prefetch size %s %d %d"
            p000X.C40431oe.A02(r4, r0, r3)
            return
        L_0x003a:
            r0 = 0
            goto L_0x001f
        L_0x003c:
            java.util.Map r3 = r5.A0E
            java.lang.String r1 = "video_prefetch_io_pri_enabled"
            boolean r0 = r3.containsKey(r1)
            r17 = 0
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            if (r0 == 0) goto L_0x0056
            r17 = 1
        L_0x0056:
            if (r17 == 0) goto L_0x007b
            java.util.Map r3 = r5.A0E
            java.lang.String r1 = "video_prefetch_io_pri_raw_value"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = java.lang.Integer.parseInt(r0)
        L_0x006c:
            boolean r0 = com.facebook.common.iopri.IoPriority.A00
            if (r0 == 0) goto L_0x0074
            int r16 = com.facebook.common.iopri.IoPriority.nativeGetCurrentIoPriority()
        L_0x0074:
            boolean r0 = com.facebook.common.iopri.IoPriority.A00
            if (r0 == 0) goto L_0x007b
            com.facebook.common.iopri.IoPriority.nativeSetCurrentRawIoPriority(r1)
        L_0x007b:
            goto L_0x007e
        L_0x007c:
            r1 = 0
            goto L_0x006c
        L_0x007e:
            r13 = r98
            java.lang.String r4 = r2.A0B     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r2.A09     // Catch:{ all -> 0x0590 }
            java.lang.String r1 = r0.A0D     // Catch:{ all -> 0x0590 }
            android.net.Uri r0 = r0.A03     // Catch:{ all -> 0x0590 }
            java.lang.String r7 = p000X.C40431oe.A00(r4, r1, r0)     // Catch:{ all -> 0x0590 }
            int r0 = r2.A02     // Catch:{ all -> 0x0590 }
            r11 = 0
            if (r0 == 0) goto L_0x0586
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r5.A0C     // Catch:{ all -> 0x0590 }
            boolean r0 = r0.A1d     // Catch:{ all -> 0x0590 }
            r1 = 2
            r8 = 0
            r10 = 1
            if (r0 == 0) goto L_0x00c4
            java.util.Map r0 = r5.A0D     // Catch:{ all -> 0x0590 }
            monitor-enter(r0)     // Catch:{ all -> 0x0590 }
            java.util.Map r4 = r5.A0D     // Catch:{ all -> 0x00c0 }
            boolean r4 = r4.containsKey(r7)     // Catch:{ all -> 0x00c0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            if (r4 == 0) goto L_0x00c4
            java.lang.String r3 = A0G     // Catch:{ all -> 0x0590 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r2.A09     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = r0.A0D     // Catch:{ all -> 0x0590 }
            r1[r8] = r0     // Catch:{ all -> 0x0590 }
            int r0 = r2.A02     // Catch:{ all -> 0x0590 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0590 }
            r1[r10] = r0     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = "prefetch request for Vid:%s with length:%d is skipped because a prefetch request with the same vid is already in progress"
            p000X.C40431oe.A01(r3, r0, r1)     // Catch:{ all -> 0x0590 }
            goto L_0x0586
        L_0x00c0:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            goto L_0x0585
        L_0x00c4:
            X.D0o r15 = new X.D0o     // Catch:{ all -> 0x0590 }
            int r0 = r2.A02     // Catch:{ all -> 0x0590 }
            r15.<init>(r5, r0)     // Catch:{ all -> 0x0590 }
            X.D0b r9 = r5.A04()     // Catch:{ all -> 0x0590 }
            java.lang.Integer r18 = p000X.Constants.A0j     // Catch:{ all -> 0x0590 }
            int r0 = r2.A03     // Catch:{ all -> 0x0590 }
            if (r0 != r10) goto L_0x00d8
            java.lang.Integer r18 = p000X.Constants.A0C     // Catch:{ all -> 0x0590 }
            goto L_0x00dc
        L_0x00d8:
            if (r0 != r1) goto L_0x00dc
            java.lang.Integer r18 = p000X.Constants.ONE     // Catch:{ all -> 0x0590 }
        L_0x00dc:
            if (r9 == 0) goto L_0x0116
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r5.A0C     // Catch:{ all -> 0x0590 }
            boolean r0 = r0.A1d     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0114
            long r3 = r2.A05     // Catch:{ all -> 0x0590 }
            int r0 = r2.A02     // Catch:{ all -> 0x0590 }
            long r0 = (long) r0     // Catch:{ all -> 0x0590 }
            r6 = 3
            r19 = r9
            r20 = r7
            r21 = r3
            r23 = r0
            boolean r0 = r19.AeZ(r20, r21, r23)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r3 = A0G     // Catch:{ all -> 0x0590 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r2.A09     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = r0.A0D     // Catch:{ all -> 0x0590 }
            r1[r8] = r0     // Catch:{ all -> 0x0590 }
            int r0 = r2.A02     // Catch:{ all -> 0x0590 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0590 }
            r1[r10] = r0     // Catch:{ all -> 0x0590 }
            r0 = 2
            r1[r0] = r7     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = "prefetch request for Vid:%s with length:%d is skipped because it is already in cache %s"
            p000X.C40431oe.A01(r3, r0, r1)     // Catch:{ all -> 0x0590 }
            goto L_0x0586
        L_0x0114:
            r6 = 3
            goto L_0x0118
        L_0x0116:
            r6 = 3
            goto L_0x011b
        L_0x0118:
            r9.A3O(r7, r15)     // Catch:{ all -> 0x0590 }
        L_0x011b:
            java.lang.String r4 = A0G     // Catch:{ all -> 0x0590 }
            r0 = 6
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.ipc.VideoSource r1 = r2.A09     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = r1.A0D     // Catch:{ all -> 0x0590 }
            r3[r8] = r0     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = r1.A08     // Catch:{ all -> 0x0590 }
            r3[r10] = r0     // Catch:{ all -> 0x0590 }
            X.1pB r0 = r1.A06     // Catch:{ all -> 0x0590 }
            java.lang.String r1 = r0.name()     // Catch:{ all -> 0x0590 }
            r0 = 2
            r3[r0] = r1     // Catch:{ all -> 0x0590 }
            int r0 = r2.A02     // Catch:{ all -> 0x0590 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0590 }
            r3[r6] = r0     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = r2.A0B     // Catch:{ all -> 0x0590 }
            r20 = 4
            r3[r20] = r0     // Catch:{ all -> 0x0590 }
            r0 = 5
            r3[r0] = r7     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = "Prefetch Vid:%s from %s, Format:%s, PrefetchLength:%d, RequestKey:%s, AugmentedKey: %s"
            p000X.C40431oe.A01(r4, r0, r3)     // Catch:{ all -> 0x0590 }
            boolean r0 = r2.A0F     // Catch:{ all -> 0x0590 }
            r25 = r0 ^ 1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0590 }
            r1.<init>(r8)     // Catch:{ all -> 0x0590 }
            X.Cuo r22 = new X.Cuo     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r2.A09     // Catch:{ all -> 0x0590 }
            java.lang.String r8 = r0.A0D     // Catch:{ all -> 0x0590 }
            java.lang.String r6 = r0.A08     // Catch:{ all -> 0x0590 }
            java.lang.String r4 = r0.A09     // Catch:{ all -> 0x0590 }
            X.1pF r3 = r2.A07     // Catch:{ all -> 0x0590 }
            X.1pE r0 = r0.A05     // Catch:{ all -> 0x0590 }
            r26 = r22
            r27 = r8
            r28 = r6
            r29 = r4
            r30 = r1
            r31 = r3
            r32 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0590 }
            java.lang.String r8 = r2.A0C     // Catch:{ all -> 0x0590 }
            java.lang.Integer r3 = p000X.Constants.A0j     // Catch:{ all -> 0x0590 }
            r28 = 0
            r0 = r18
            if (r0 != r3) goto L_0x017d
            r28 = 1
        L_0x017d:
            java.util.HashMap r29 = new java.util.HashMap     // Catch:{ all -> 0x0590 }
            r29.<init>()     // Catch:{ all -> 0x0590 }
            X.D2M r3 = r5.A0A     // Catch:{ all -> 0x0590 }
            r0 = 11
            int r34 = p000X.D2M.A00(r3, r0)     // Catch:{ all -> 0x0590 }
            X.D2M r3 = r5.A0A     // Catch:{ all -> 0x0590 }
            int r35 = p000X.D2M.A00(r3, r10)     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r2.A09     // Catch:{ all -> 0x0590 }
            boolean r6 = r0.A0J     // Catch:{ all -> 0x0590 }
            boolean r4 = r0.A0K     // Catch:{ all -> 0x0590 }
            r42 = 0
            r9 = 0
            if (r98 == 0) goto L_0x01e6
            com.google.android.exoplayer2.Format r0 = r13.A01     // Catch:{ all -> 0x0590 }
            java.lang.String r3 = r0.A0K     // Catch:{ all -> 0x0590 }
        L_0x019f:
            r21 = r5
            r23 = 0
            r41 = r94
            r32 = r93
            r31 = r92
            r39 = r96
            r40 = r97
            r38 = r95
            r30 = r91
            r26 = r10
            r27 = r8
            r33 = r18
            r36 = r6
            r37 = r4
            r43 = r3
            r44 = r1
            X.D1l r14 = r21.A05(r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x0590 }
            if (r99 == 0) goto L_0x01f8
            X.D2I r1 = r5.A02     // Catch:{ all -> 0x0590 }
            android.util.LruCache r1 = r1.A00     // Catch:{ all -> 0x0590 }
            java.util.Map r1 = r1.snapshot()     // Catch:{ all -> 0x0590 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0590 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0590 }
        L_0x01d5:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0590 }
            if (r1 == 0) goto L_0x01ea
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0590 }
            X.D2j r1 = (p000X.C29626D2j) r1     // Catch:{ all -> 0x0590 }
            boolean r1 = r1.A0w     // Catch:{ all -> 0x0590 }
            if (r1 == 0) goto L_0x01d5
            goto L_0x01e8
        L_0x01e6:
            r3 = r9
            goto L_0x019f
        L_0x01e8:
            r1 = 1
            goto L_0x01eb
        L_0x01ea:
            r1 = 0
        L_0x01eb:
            if (r1 != 0) goto L_0x01f8
            java.util.concurrent.atomic.AtomicInteger r1 = r5.A03     // Catch:{ all -> 0x0590 }
            int r3 = r1.decrementAndGet()     // Catch:{ all -> 0x0590 }
            r1 = 0
            if (r3 < 0) goto L_0x01fc
            r1 = 1
            goto L_0x01fc
        L_0x01f8:
            r14.Bsq(r10)     // Catch:{ all -> 0x0590 }
            goto L_0x0200
        L_0x01fc:
            r1 = r1 ^ r10
            r14.Bsq(r1)     // Catch:{ all -> 0x0590 }
        L_0x0200:
            X.D1B r21 = new X.D1B     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.ipc.VideoSource r3 = r2.A09     // Catch:{ all -> 0x0590 }
            r1 = r21
            r1.<init>(r10)     // Catch:{ all -> 0x0590 }
            int r1 = r2.A02     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            if (r1 > 0) goto L_0x020f
            goto L_0x02aa
        L_0x020f:
            X.D1M r6 = new X.D1M     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            android.net.Uri r0 = r3.A03     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            r19 = r0
            long r3 = r2.A05     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x021e
            r25 = r3
            goto L_0x0220
        L_0x021e:
            r25 = 0
        L_0x0220:
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0226
            r3 = 0
        L_0x0226:
            long r0 = (long) r1     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            r33 = r0
            java.lang.String r0 = r2.A0B     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            r13 = r0
            r32 = 0
            X.D1P r43 = new X.D1P     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            java.lang.String r8 = r2.A0D     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            int r0 = r2.A01     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            long r0 = (long) r0     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r10 = r18
            int r51 = p000X.C43721uy.A00(r10)     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            r52 = 0
            r53 = 0
            r54 = 1
            r55 = -1
            r58 = -1
            r60 = 0
            r61 = -1
            r63 = -1
            r65 = -1
            r66 = 0
            r44 = r8
            r45 = r0
            r57 = r21
            r43.<init>(r44, r45, r47, r48, r49, r50, r51, r52, r53, r54, r55, r57, r58, r60, r61, r63, r65, r66)     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            r24 = 0
            r22 = r6
            r23 = r19
            r27 = r3
            r29 = r33
            r31 = r13
            r33 = r43
            r22.<init>(r23, r24, r25, r27, r29, r31, r32, r33)     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            java.util.Map r0 = r5.A0E     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            boolean r0 = p000X.C29591D0w.A00(r0)     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            if (r0 == 0) goto L_0x0284
            if (r7 == 0) goto L_0x0284
            java.util.Map r1 = r5.A0D     // Catch:{ Cuq -> 0x02cc, IOException -> 0x02c6, all -> 0x0317 }
            monitor-enter(r1)     // Catch:{ Cuq -> 0x02cc, IOException -> 0x02c6, all -> 0x0317 }
            java.util.Map r0 = r5.A0D     // Catch:{ all -> 0x02b1 }
            r0.put(r7, r14)     // Catch:{ all -> 0x02b1 }
            monitor-exit(r1)     // Catch:{ all -> 0x02b1 }
        L_0x0284:
            long r0 = r14.BWT(r6)     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x029a
            int r4 = r2.A02     // Catch:{ Cuq -> 0x02cc, IOException -> 0x02c6, all -> 0x0317 }
            if (r4 <= 0) goto L_0x0298
            int r3 = (int) r0     // Catch:{ Cuq -> 0x02cc, IOException -> 0x02c6, all -> 0x0317 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ Cuq -> 0x02cc, IOException -> 0x02c6, all -> 0x0317 }
        L_0x0295:
            r2.A02 = r3     // Catch:{ Cuq -> 0x02cc, IOException -> 0x02c6, all -> 0x0317 }
            goto L_0x029a
        L_0x0298:
            int r3 = (int) r0     // Catch:{ Cuq -> 0x02cc, IOException -> 0x02c6, all -> 0x0317 }
            goto L_0x0295
        L_0x029a:
            int r6 = r2.A02     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            long r3 = (long) r6     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            int r0 = r5.A06     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            long r0 = (long) r0     // Catch:{ Cuq -> 0x039a, IOException -> 0x0356, all -> 0x0351 }
            int r8 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x02a5
            goto L_0x02b4
        L_0x02a5:
            r13 = 0
            r8 = 2
            if (r6 <= 0) goto L_0x02ae
            goto L_0x02f7
        L_0x02aa:
            r0 = -1
            if (r1 == r0) goto L_0x020f
            r8 = 2
        L_0x02ae:
            r3 = 0
            goto L_0x0324
        L_0x02b1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02b1 }
            throw r0     // Catch:{ Cuq -> 0x02cc, IOException -> 0x02c6, all -> 0x0317 }
        L_0x02b4:
            java.lang.String r6 = A0G     // Catch:{ Cuq -> 0x02f4, IOException -> 0x02f1, all -> 0x0317 }
            java.lang.String r4 = "Attempting to completed unbounded prefetch with more bytes than the prefetch size %s %d %d"
            r0 = 3
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Cuq -> 0x02f4, IOException -> 0x02f1, all -> 0x0317 }
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r2.A09     // Catch:{ Cuq -> 0x02f4, IOException -> 0x02f1, all -> 0x0317 }
            android.net.Uri r0 = r0.A03     // Catch:{ Cuq -> 0x02f4, IOException -> 0x02f1, all -> 0x0317 }
            if (r0 == 0) goto L_0x02d2
            java.lang.String r9 = r0.toString()     // Catch:{ Cuq -> 0x02cc, IOException -> 0x02c6, all -> 0x0317 }
            goto L_0x02d2
        L_0x02c6:
            r10 = move-exception
            r3 = 0
            r8 = 2
            goto L_0x035a
        L_0x02cc:
            r1 = move-exception
            r3 = 0
            r8 = 2
            goto L_0x03a0
        L_0x02d2:
            r3[r42] = r9     // Catch:{ Cuq -> 0x02f4, IOException -> 0x02f1, all -> 0x0317 }
            int r0 = r2.A02     // Catch:{ Cuq -> 0x02f4, IOException -> 0x02f1, all -> 0x0317 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Cuq -> 0x02f4, IOException -> 0x02f1, all -> 0x0317 }
            r3[r54] = r0     // Catch:{ Cuq -> 0x02f4, IOException -> 0x02f1, all -> 0x0317 }
            int r0 = r5.A06     // Catch:{ Cuq -> 0x02f4, IOException -> 0x02f1, all -> 0x0317 }
            long r0 = (long) r0     // Catch:{ Cuq -> 0x02f4, IOException -> 0x02f1, all -> 0x0317 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Cuq -> 0x02f4, IOException -> 0x02f1, all -> 0x0317 }
            r8 = 2
            r3[r8] = r0     // Catch:{ Cuq -> 0x0320, IOException -> 0x031c, all -> 0x0317 }
            p000X.C40431oe.A02(r6, r4, r3)     // Catch:{ Cuq -> 0x0320, IOException -> 0x031c, all -> 0x0317 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Cuq -> 0x0320, IOException -> 0x031c, all -> 0x0317 }
            java.lang.String r0 = "Attempting to cache amount greater than CacheSize"
            r1.<init>(r0)     // Catch:{ Cuq -> 0x0320, IOException -> 0x031c, all -> 0x0317 }
            throw r1     // Catch:{ Cuq -> 0x0320, IOException -> 0x031c, all -> 0x0317 }
        L_0x02f1:
            r10 = move-exception
            r8 = 2
            goto L_0x031d
        L_0x02f4:
            r1 = move-exception
            r8 = 2
            goto L_0x0321
        L_0x02f7:
            r9 = 65536(0x10000, float:9.18355E-41)
            byte[] r6 = new byte[r9]     // Catch:{ Cuq -> 0x0320, IOException -> 0x031c, all -> 0x0317 }
            r3 = 0
        L_0x02fd:
            int r10 = r2.A02     // Catch:{ Cuq -> 0x039f, IOException -> 0x0315 }
            long r0 = (long) r10     // Catch:{ Cuq -> 0x039f, IOException -> 0x0315 }
            int r19 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r19 == 0) goto L_0x0324
            int r0 = (int) r3     // Catch:{ Cuq -> 0x039f, IOException -> 0x0315 }
            int r10 = r10 - r0
            int r0 = java.lang.Math.min(r9, r10)     // Catch:{ Cuq -> 0x039f, IOException -> 0x0315 }
            int r0 = r14.read(r6, r13, r0)     // Catch:{ Cuq -> 0x039f, IOException -> 0x0315 }
            long r0 = (long) r0     // Catch:{ Cuq -> 0x039f, IOException -> 0x0315 }
            int r10 = (r0 > r55 ? 1 : (r0 == r55 ? 0 : -1))
            if (r10 == 0) goto L_0x0324
            long r3 = r3 + r0
            goto L_0x02fd
        L_0x0315:
            r10 = move-exception
            goto L_0x035a
        L_0x0317:
            r2 = move-exception
            r3 = 0
            goto L_0x055b
        L_0x031c:
            r10 = move-exception
        L_0x031d:
            r3 = 0
            goto L_0x035a
        L_0x0320:
            r1 = move-exception
        L_0x0321:
            r3 = 0
            goto L_0x03a0
        L_0x0324:
            r14.close()     // Catch:{ all -> 0x0590 }
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0338
            X.D0b r0 = r5.A04()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0338
            X.D0b r0 = r5.A04()     // Catch:{ all -> 0x0590 }
            r0.Bb4(r7, r15)     // Catch:{ all -> 0x0590 }
        L_0x0338:
            java.util.Map r0 = r5.A0E     // Catch:{ all -> 0x0590 }
            boolean r0 = p000X.C29591D0w.A00(r0)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x03d0
            if (r7 == 0) goto L_0x03d0
            java.util.Map r1 = r5.A0D     // Catch:{ all -> 0x0590 }
            monitor-enter(r1)     // Catch:{ all -> 0x0590 }
            java.util.Map r0 = r5.A0D     // Catch:{ all -> 0x034d }
            r0.remove(r7)     // Catch:{ all -> 0x034d }
            monitor-exit(r1)     // Catch:{ all -> 0x034d }
            goto L_0x03d0
        L_0x034d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x034d }
            goto L_0x0585
        L_0x0351:
            r2 = move-exception
            r3 = 0
            goto L_0x055b
        L_0x0356:
            r10 = move-exception
            r8 = 2
            r3 = 0
        L_0x035a:
            java.lang.String r9 = A0G     // Catch:{ all -> 0x055a }
            java.lang.String r6 = "IO Exception prefetching CacheKey:%s, Read:%d"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x055a }
            java.lang.String r0 = r2.A0B     // Catch:{ all -> 0x055a }
            r1[r42] = r0     // Catch:{ all -> 0x055a }
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x055a }
            r0 = 1
            r1[r0] = r13     // Catch:{ all -> 0x055a }
            p000X.C40431oe.A05(r9, r10, r6, r1)     // Catch:{ all -> 0x055a }
            r14.close()     // Catch:{ all -> 0x0590 }
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0382
            X.D0b r0 = r5.A04()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0382
            X.D0b r0 = r5.A04()     // Catch:{ all -> 0x0590 }
            r0.Bb4(r7, r15)     // Catch:{ all -> 0x0590 }
        L_0x0382:
            java.util.Map r0 = r5.A0E     // Catch:{ all -> 0x0590 }
            boolean r0 = p000X.C29591D0w.A00(r0)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x03d0
            if (r7 == 0) goto L_0x03d0
            java.util.Map r1 = r5.A0D     // Catch:{ all -> 0x0590 }
            monitor-enter(r1)     // Catch:{ all -> 0x0590 }
            java.util.Map r0 = r5.A0D     // Catch:{ all -> 0x0396 }
            r0.remove(r7)     // Catch:{ all -> 0x0396 }
            monitor-exit(r1)     // Catch:{ all -> 0x0396 }
            goto L_0x03d0
        L_0x0396:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0396 }
            goto L_0x0585
        L_0x039a:
            r1 = move-exception
            r8 = 2
            r3 = 0
            goto L_0x03a0
        L_0x039f:
            r1 = move-exception
        L_0x03a0:
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0559
            r14.close()     // Catch:{ all -> 0x0590 }
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x03b8
            X.D0b r0 = r5.A04()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x03b8
            X.D0b r0 = r5.A04()     // Catch:{ all -> 0x0590 }
            r0.Bb4(r7, r15)     // Catch:{ all -> 0x0590 }
        L_0x03b8:
            java.util.Map r0 = r5.A0E     // Catch:{ all -> 0x0590 }
            boolean r0 = p000X.C29591D0w.A00(r0)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x03d0
            if (r7 == 0) goto L_0x03d0
            java.util.Map r1 = r5.A0D     // Catch:{ all -> 0x0590 }
            monitor-enter(r1)     // Catch:{ all -> 0x0590 }
            java.util.Map r0 = r5.A0D     // Catch:{ all -> 0x03cc }
            r0.remove(r7)     // Catch:{ all -> 0x03cc }
            monitor-exit(r1)     // Catch:{ all -> 0x03cc }
            goto L_0x03d0
        L_0x03cc:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03cc }
            goto L_0x0585
        L_0x03d0:
            r13 = r98
            r43 = r5
            X.Cuo r44 = new X.Cuo     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r2.A09     // Catch:{ all -> 0x0590 }
            java.lang.String r1 = r0.A0D     // Catch:{ all -> 0x0590 }
            X.1pF r0 = r2.A07     // Catch:{ all -> 0x0590 }
            r22 = r44
            X.1pE r28 = p000X.C40771pE.GENERAL     // Catch:{ all -> 0x0590 }
            r24 = 0
            r25 = 0
            r26 = 0
            r23 = r1
            r27 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0590 }
            java.util.HashMap r51 = new java.util.HashMap     // Catch:{ all -> 0x0590 }
            r51.<init>()     // Catch:{ all -> 0x0590 }
            java.lang.Integer r55 = p000X.Constants.ONE     // Catch:{ all -> 0x0590 }
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0590 }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x0590 }
            r45 = 0
            r47 = 0
            r48 = 0
            java.lang.String r49 = "initSeg"
            r50 = 0
            r52 = 0
            r54 = r52
            r58 = 0
            r56 = 0
            r57 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 1
            r65 = 0
            r53 = r52
            r66 = r0
            X.D1l r19 = r43.A05(r44, r45, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)     // Catch:{ all -> 0x0590 }
            if (r98 == 0) goto L_0x04f3
            X.D1g r0 = r5.A09     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x044b
            X.D2e r9 = r13.A02     // Catch:{ all -> 0x0590 }
            X.D2e r6 = r13.A02()     // Catch:{ all -> 0x0590 }
            if (r9 == 0) goto L_0x044b
            if (r6 == 0) goto L_0x044b
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r2.A09     // Catch:{ all -> 0x0590 }
            X.1pB r1 = r0.A06     // Catch:{ all -> 0x0590 }
            X.1pB r0 = p000X.C40751pB.DASH_VOD     // Catch:{ all -> 0x0590 }
            if (r1 == r0) goto L_0x0441
            X.1pB r0 = p000X.C40751pB.PROGRESSIVE     // Catch:{ all -> 0x0590 }
            r10 = 0
            if (r1 != r0) goto L_0x0442
        L_0x0441:
            r10 = 1
        L_0x0442:
            if (r10 == 0) goto L_0x044b
            java.lang.String r0 = r13.A03     // Catch:{ all -> 0x0590 }
            X.D2e r6 = r9.A01(r6, r0)     // Catch:{ all -> 0x0590 }
            goto L_0x044c
        L_0x044b:
            r6 = 0
        L_0x044c:
            if (r6 == 0) goto L_0x04f3
            X.D4b r43 = new X.D4b     // Catch:{ all -> 0x0590 }
            r44 = 0
            r46 = 0
            r48 = -1
            r49 = r13
            r35 = r43
            r51 = 0
            r53 = 0
            r43.<init>(r44, r46, r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x0590 }
            X.D1M r22 = new X.D1M     // Catch:{ all -> 0x0590 }
            X.D2e r1 = r13.A02()     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = r13.A03     // Catch:{ all -> 0x0590 }
            android.net.Uri r23 = r1.A00(r0)     // Catch:{ all -> 0x0590 }
            long r0 = r6.A02     // Catch:{ all -> 0x0590 }
            r29 = r0
            long r0 = r6.A01     // Catch:{ all -> 0x0590 }
            r33 = r0
            java.lang.String r0 = r2.A0B     // Catch:{ all -> 0x0590 }
            r31 = r0
            r32 = 0
            X.D1P r65 = new X.D1P     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = r2.A0D     // Catch:{ all -> 0x0590 }
            r6 = r0
            int r0 = r2.A01     // Catch:{ all -> 0x0590 }
            long r9 = (long) r0     // Catch:{ all -> 0x0590 }
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            int r73 = p000X.C43721uy.A00(r18)     // Catch:{ all -> 0x0590 }
            r74 = 0
            r75 = 0
            r76 = 1
            r77 = -1
            long r0 = r2.A06     // Catch:{ all -> 0x0590 }
            r82 = 0
            r83 = -1
            r85 = -1
            r87 = -1
            r88 = 0
            r66 = r6
            r67 = r9
            r79 = r21
            r80 = r0
            r65.<init>(r66, r67, r69, r70, r71, r72, r73, r74, r75, r76, r77, r79, r80, r82, r83, r85, r87, r88)     // Catch:{ all -> 0x0590 }
            r27 = r29
            r25 = r29
            r29 = r33
            r33 = r65
            r22.<init>(r23, r24, r25, r27, r29, r31, r32, r33)     // Catch:{ all -> 0x0590 }
            X.D5b r6 = new X.D5b     // Catch:{ all -> 0x0590 }
            X.D1T r10 = new X.D1T     // Catch:{ all -> 0x0590 }
            r1 = 0
            r23 = r10
            r24 = r19
            r23.<init>(r24)     // Catch:{ all -> 0x0590 }
            com.google.android.exoplayer2.Format r9 = r13.A01     // Catch:{ all -> 0x0590 }
            r27 = 0
            r28 = 0
            r0 = r35
            X.D4n r0 = r0.A03     // Catch:{ all -> 0x0590 }
            r23 = r6
            r24 = r10
            r25 = r22
            r26 = r9
            r29 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0590 }
            r6.Ail()     // Catch:{ EOFException -> 0x04f3, IOException | InterruptedException -> 0x04e9 }
            X.D1g r9 = r5.A09     // Catch:{ EOFException -> 0x04f3, IOException | InterruptedException -> 0x04e9 }
            if (r9 == 0) goto L_0x04f3
            java.lang.String r0 = r2.A0B     // Catch:{ EOFException -> 0x04f3, IOException | InterruptedException -> 0x04e9 }
            r9.put(r0, r6)     // Catch:{ EOFException -> 0x04f3, IOException | InterruptedException -> 0x04e9 }
            goto L_0x04f3
        L_0x04e9:
            r9 = move-exception
            java.lang.String r6 = A0G     // Catch:{ all -> 0x0590 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = "Failed to load initialization chunk"
            p000X.C40431oe.A05(r6, r9, r0, r1)     // Catch:{ all -> 0x0590 }
        L_0x04f3:
            java.lang.String r9 = A0G     // Catch:{ all -> 0x0590 }
            r0 = 5
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r2.A09     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = r0.A0D     // Catch:{ all -> 0x0590 }
            r6[r42] = r0     // Catch:{ all -> 0x0590 }
            int r0 = r2.A02     // Catch:{ all -> 0x0590 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0590 }
            r6[r64] = r0     // Catch:{ all -> 0x0590 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0590 }
            r6[r8] = r0     // Catch:{ all -> 0x0590 }
            long r0 = r15.A00     // Catch:{ all -> 0x0590 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0590 }
            r0 = 3
            r6[r0] = r1     // Catch:{ all -> 0x0590 }
            r6[r20] = r7     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = "Prefetched VideoId %s, PrefetchLength %d, total read %d, fetched length from network %d, CacheKey %s"
            p000X.C40431oe.A01(r9, r0, r6)     // Catch:{ all -> 0x0590 }
            boolean r0 = r14 instanceof p000X.C29584D0p     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0525
            X.D0p r14 = (p000X.C29584D0p) r14     // Catch:{ all -> 0x0590 }
            long r0 = r14.A00     // Catch:{ all -> 0x0590 }
            goto L_0x0527
        L_0x0525:
            r0 = 0
        L_0x0527:
            int r6 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x0542
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0542
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.ipc.VideoSource r3 = r2.A09     // Catch:{ all -> 0x0590 }
            java.lang.String r3 = r3.A0D     // Catch:{ all -> 0x0590 }
            r4[r42] = r3     // Catch:{ all -> 0x0590 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0590 }
            r4[r64] = r0     // Catch:{ all -> 0x0590 }
            java.lang.String r0 = "resourceLength of videoId %s is %d"
            p000X.C40431oe.A01(r9, r0, r4)     // Catch:{ all -> 0x0590 }
        L_0x0542:
            X.D1b r4 = r5.A0B     // Catch:{ all -> 0x0590 }
            X.1vk r3 = new X.1vk     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r2.A09     // Catch:{ all -> 0x0590 }
            java.lang.String r1 = r0.A0D     // Catch:{ all -> 0x0590 }
            p000X.C43721uy.A03(r18)     // Catch:{ all -> 0x0590 }
            r0 = 1
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0590 }
            com.facebook.video.heroplayer.service.HeroService r0 = r4.A00     // Catch:{ all -> 0x0590 }
            X.D29 r0 = r0.A0A     // Catch:{ all -> 0x0590 }
            r0.A00(r3)     // Catch:{ all -> 0x0590 }
            goto L_0x0586
        L_0x0559:
            throw r1     // Catch:{ all -> 0x055a }
        L_0x055a:
            r2 = move-exception
        L_0x055b:
            r14.close()     // Catch:{ all -> 0x0590 }
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x056f
            X.D0b r0 = r5.A04()     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x056f
            X.D0b r0 = r5.A04()     // Catch:{ all -> 0x0590 }
            r0.Bb4(r7, r15)     // Catch:{ all -> 0x0590 }
        L_0x056f:
            java.util.Map r0 = r5.A0E     // Catch:{ all -> 0x0590 }
            boolean r0 = p000X.C29591D0w.A00(r0)     // Catch:{ all -> 0x0590 }
            if (r0 == 0) goto L_0x0585
            if (r7 == 0) goto L_0x0585
            java.util.Map r1 = r5.A0D     // Catch:{ all -> 0x0590 }
            monitor-enter(r1)     // Catch:{ all -> 0x0590 }
            java.util.Map r0 = r5.A0D     // Catch:{ all -> 0x0583 }
            r0.remove(r7)     // Catch:{ all -> 0x0583 }
            monitor-exit(r1)     // Catch:{ all -> 0x0583 }
            goto L_0x0585
        L_0x0583:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0583 }
        L_0x0585:
            throw r2     // Catch:{ all -> 0x0590 }
        L_0x0586:
            if (r17 == 0) goto L_0x058f
            boolean r0 = com.facebook.common.iopri.IoPriority.A00
            if (r0 == 0) goto L_0x058f
            com.facebook.common.iopri.IoPriority.nativeSetCurrentRawIoPriority(r16)
        L_0x058f:
            return
        L_0x0590:
            r1 = move-exception
            if (r17 == 0) goto L_0x059a
            boolean r0 = com.facebook.common.iopri.IoPriority.A00
            if (r0 == 0) goto L_0x059a
            com.facebook.common.iopri.IoPriority.nativeSetCurrentRawIoPriority(r16)
        L_0x059a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.D1L.A08(com.facebook.video.heroplayer.ipc.VideoPrefetchRequest, X.D1k, X.D19, X.D29, X.D1i, boolean, boolean, boolean, X.D4l, boolean):void");
    }
}
