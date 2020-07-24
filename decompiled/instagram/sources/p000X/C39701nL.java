package p000X;

import android.net.Uri;
import android.os.RemoteException;
import com.facebook.video.heroplayer.ipc.AbrContextualSetting;
import com.facebook.video.heroplayer.ipc.DynamicPlayerSettings;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import com.facebook.video.heroplayer.ipc.VideoPlayContextualSetting;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.instagram.video.player.hero.IgHttpConnectionForProxy;
import com.instagram.video.player.hero.IgServiceResultReceiver;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1nL  reason: invalid class name and case insensitive filesystem */
public final class C39701nL implements AnonymousClass12D {
    public static boolean A02;
    public static final C39701nL A03 = new C39701nL();
    public final IgServiceResultReceiver A00 = new IgServiceResultReceiver();
    public final AtomicBoolean A01 = new AtomicBoolean(false);

    public static VideoPlayContextualSetting A00(C37671k2 r12, AnonymousClass0C1 r13) {
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        AnonymousClass0L7 r2;
        int i;
        int intValue6;
        String str;
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r13, AnonymousClass0L7.DASH_STORY_ADS_WARMUP_WATERMARK, "context_aware_abr_enabled", false, (AnonymousClass04H) null)).booleanValue();
        if (!booleanValue && !((Boolean) AnonymousClass0L6.A02(r13, AnonymousClass0L7.VIDEO_SOURCE_ABR_TUNING, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return new VideoPlayContextualSetting();
        }
        Integer num = r12.A03;
        if (num == Constants.ZERO) {
            intValue = C40221oI.A00(r13).intValue();
            intValue2 = C40191oF.A00(r13).intValue();
            intValue3 = C40201oG.A00(r13).intValue();
            r2 = AnonymousClass0L7.VIDEO_SOURCE_ABR_TUNING;
            intValue4 = ((Integer) AnonymousClass0L6.A02(r13, r2, "feed_low_buffer_bw_conf", 90, (AnonymousClass04H) null)).intValue();
            i = 60;
            intValue5 = ((Integer) AnonymousClass0L6.A02(r13, r2, "feed_high_buffer_bw_conf", 60, (AnonymousClass04H) null)).intValue();
            intValue6 = ((Integer) AnonymousClass0L6.A02(r13, r2, "feed_long_queue_conf_pct", 90, (AnonymousClass04H) null)).intValue();
            str = "feed_short_queue_conf_pct";
        } else if (num != Constants.ONE) {
            intValue = C40221oI.A00(r13).intValue();
            intValue2 = C40191oF.A00(r13).intValue();
            intValue3 = C40201oG.A00(r13).intValue();
            AnonymousClass0L7 r3 = AnonymousClass0L7.VIDEO_ABR;
            intValue4 = ((Integer) AnonymousClass0L6.A02(r13, r3, "low_buffer_bandwidth_confidence_pct", 90, (AnonymousClass04H) null)).intValue();
            intValue5 = ((Integer) AnonymousClass0L6.A02(r13, r3, "high_buffer_bandwidth_confidence_pct", 60, (AnonymousClass04H) null)).intValue();
            r2 = AnonymousClass0L7.PREFETCH_CONF_PCT;
            i = -1;
            intValue6 = ((Integer) AnonymousClass0L6.A02(r13, r2, "prefetch_long_queue_bandwidth_confidence_pct", -1, (AnonymousClass04H) null)).intValue();
            str = "prefetch_short_queue_bandwidth_confidence_pct";
        } else if (!r12.A0D || !booleanValue) {
            intValue = C40221oI.A00(r13).intValue();
            intValue2 = C40191oF.A00(r13).intValue();
            intValue3 = C40201oG.A00(r13).intValue();
            r2 = AnonymousClass0L7.VIDEO_SOURCE_ABR_TUNING;
            intValue4 = ((Integer) AnonymousClass0L6.A02(r13, r2, "story_low_buffer_bw_conf", 90, (AnonymousClass04H) null)).intValue();
            i = 60;
            intValue5 = ((Integer) AnonymousClass0L6.A02(r13, r2, "story_high_buffer_bw_conf", 60, (AnonymousClass04H) null)).intValue();
            intValue6 = ((Integer) AnonymousClass0L6.A02(r13, r2, "story_long_queue_conf_pct", 90, (AnonymousClass04H) null)).intValue();
            str = "story_short_queue_conf_pct";
        } else {
            intValue = C40221oI.A00(r13).intValue();
            intValue2 = C40191oF.A00(r13).intValue();
            intValue3 = C40201oG.A00(r13).intValue();
            r2 = AnonymousClass0L7.DASH_STORY_ADS_WARMUP_WATERMARK;
            intValue4 = ((Integer) AnonymousClass0L6.A02(r13, r2, "low_buffer_bw_conf", 90, (AnonymousClass04H) null)).intValue();
            i = 60;
            intValue5 = ((Integer) AnonymousClass0L6.A02(r13, r2, "high_buffer_bw_conf", 60, (AnonymousClass04H) null)).intValue();
            intValue6 = ((Integer) AnonymousClass0L6.A02(r13, r2, "long_queue_conf_pct", 90, (AnonymousClass04H) null)).intValue();
            str = "short_queue_conf_pct";
        }
        return new VideoPlayContextualSetting(new AbrContextualSetting(C40211oH.A00(r13).intValue(), C40231oJ.A00(r13).intValue(), C40241oK.A00(r13).intValue(), intValue, intValue2, intValue3, intValue4, intValue5, intValue6, ((Integer) AnonymousClass0L6.A02(r13, r2, str, i, (AnonymousClass04H) null)).intValue()));
    }

    public static VideoSource A01(C37671k2 r19, Uri uri, String str) {
        Uri parse;
        C40751pB r11;
        String str2;
        String str3 = str;
        C37671k2 r1 = r19;
        String str4 = r1.A09;
        String str5 = null;
        if (str4 == null) {
            parse = null;
        } else {
            parse = Uri.parse(str4);
        }
        Integer num = r1.A03;
        switch (num.intValue()) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (r1.A06()) {
                    r11 = C40751pB.DASH_VOD;
                } else {
                    r11 = C40751pB.PROGRESSIVE;
                }
                if (parse == null) {
                    boolean z = false;
                    if (num == Constants.A0Y) {
                        z = true;
                    }
                    if (!z) {
                        String A04 = r1.A04();
                        parse = Uri.parse(A04);
                        if (A04.length() == 0) {
                            AnonymousClass0QD.A01("IgHeroServiceController", "Received invalid video url");
                            break;
                        }
                    }
                }
                break;
            case 3:
                r11 = C40751pB.DASH_LIVE;
                break;
            default:
                throw new IllegalArgumentException("Illegal SourceType");
        }
        Integer num2 = r1.A03;
        if (num2.equals(Constants.ONE)) {
            str5 = "ig_stories";
        }
        String str6 = r1.A05;
        String str7 = r1.A04;
        String str8 = r1.A08;
        if (str == null) {
            str3 = "";
        }
        if (num2 == Constants.A0N) {
            str2 = r1.A07;
        } else {
            str2 = null;
        }
        return new VideoSource(parse, str6, str7, str8, uri, str3, str5, r11, str2, false, r1.A0D, r1.A0B, r1.A0A, Collections.EMPTY_MAP, C40761pD.A01(Constants.ZERO), C40771pE.GENERAL);
    }

    public static void A03(DynamicPlayerSettings dynamicPlayerSettings) {
        try {
            C39731nP r3 = C39731nP.A0W;
            if (C39731nP.A05(r3)) {
                AnonymousClass0ZA.A0E(r3.A05, new BLT(r3, dynamicPlayerSettings), -61707137);
                return;
            }
            HeroPlayerServiceApi heroPlayerServiceApi = r3.A0K;
            if (heroPlayerServiceApi != null) {
                heroPlayerServiceApi.BhC(dynamicPlayerSettings);
            }
        } catch (RemoteException unused) {
        }
    }

    public static void A04(String str, boolean z) {
        C39771nW r3 = C39731nP.A0W.A07;
        if (C39771nW.A02(r3)) {
            AnonymousClass0ZA.A0E(r3.A01, new C30630Dgf(r3, str, z), 1632911440);
        } else {
            C39771nW.A00(r3, str, z);
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A05(android.content.Context r15, p000X.AnonymousClass0C1 r16) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicBoolean r1 = r14.A01
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x0226
            boolean r0 = p000X.C06530Pk.A00
            if (r0 == 0) goto L_0x0016
            r1 = -792776627(0xffffffffd0bf304d, float:-2.56609096E10)
            java.lang.String r0 = "startHeroService"
            p000X.AnonymousClass0ZB.A01(r0, r1)
        L_0x0016:
            X.1nP r3 = p000X.C39731nP.A0W     // Catch:{ all -> 0x021a }
            X.1ne r1 = new X.1ne     // Catch:{ all -> 0x021a }
            r1.<init>()     // Catch:{ all -> 0x021a }
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.A0B     // Catch:{ all -> 0x021a }
            r0.add(r1)     // Catch:{ all -> 0x021a }
            X.1ng r1 = new X.1ng     // Catch:{ all -> 0x021a }
            r1.<init>()     // Catch:{ all -> 0x021a }
            X.1nW r0 = r3.A07     // Catch:{ all -> 0x021a }
            r0.A00 = r1     // Catch:{ all -> 0x021a }
            r4 = r16
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = p000X.C39871nh.A00(r15, r4)     // Catch:{ all -> 0x021a }
            com.instagram.video.player.hero.IgServiceResultReceiver r6 = r14.A00     // Catch:{ all -> 0x021a }
            X.1nk r5 = r2.A0T     // Catch:{ all -> 0x021a }
            boolean r0 = r5.A0A     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x004a
            X.CAy r1 = new X.CAy     // Catch:{ all -> 0x021a }
            android.content.Context r0 = p000X.AnonymousClass0QO.A00     // Catch:{ all -> 0x021a }
            boolean r0 = p000X.C06110Nu.A01(r0)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x00ef
            int r0 = r5.A02     // Catch:{ all -> 0x021a }
        L_0x0045:
            r1.<init>(r0)     // Catch:{ all -> 0x021a }
            r6.A00 = r1     // Catch:{ all -> 0x021a }
        L_0x004a:
            A02()     // Catch:{ all -> 0x021a }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x021a }
            r8.<init>()     // Catch:{ all -> 0x021a }
            java.lang.String r7 = "prefetch.max_cache_file_size"
            X.0L7 r6 = p000X.AnonymousClass0L7.PREFETCH_VIDEO_CACHE_FILESIZE_LAUNCHER     // Catch:{ all -> 0x021a }
            r0 = 102400(0x19000, float:1.43493E-40)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r1 = "cachefile_limit"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r4, r6, r1, r5, r0)     // Catch:{ all -> 0x021a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x021a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x021a }
            r8.put(r7, r0)     // Catch:{ all -> 0x021a }
            java.lang.String r7 = "prefetch.block_on_same_cache_key_timeout_ms"
            X.0L7 r6 = p000X.AnonymousClass0L7.VIDEO_DUP_REQUEST_TIMEOUT     // Catch:{ all -> 0x021a }
            r0 = 5000(0x1388, float:7.006E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r1 = "timeout_ms"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r4, r6, r1, r5, r0)     // Catch:{ all -> 0x021a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x021a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x021a }
            r8.put(r7, r0)     // Catch:{ all -> 0x021a }
            java.lang.String r7 = "dash.live_num_segments_prefetch"
            X.0L7 r6 = p000X.AnonymousClass0L7.LIVE_PERFORMANCE_IMPROVEMENT_LAUNCHER     // Catch:{ all -> 0x021a }
            r0 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r1 = "max_live_num_segement_prefetch"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r4, r6, r1, r5, r0)     // Catch:{ all -> 0x021a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x021a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x021a }
            r8.put(r7, r0)     // Catch:{ all -> 0x021a }
            java.lang.String r5 = "dash.live_prefetch_max_retries"
            r0 = 8
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x021a }
            r8.put(r5, r0)     // Catch:{ all -> 0x021a }
            java.lang.String r1 = "dash.live_use_video_key_for_cache"
            java.lang.String r5 = "1"
            r8.put(r1, r5)     // Catch:{ all -> 0x021a }
            java.lang.String r1 = "progressive.enable_throttling_data_source"
            r8.put(r1, r5)     // Catch:{ all -> 0x021a }
            java.lang.String r5 = "progressive.throttling_buffer_low"
            r0 = 131100(0x2001c, float:1.8371E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x021a }
            r8.put(r5, r0)     // Catch:{ all -> 0x021a }
            java.lang.String r5 = "progressive.throttling_buffer_high"
            r0 = 524300(0x8000c, float:7.34701E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x021a }
            r8.put(r5, r0)     // Catch:{ all -> 0x021a }
            java.lang.String r1 = "dummy_default_setting"
            r0 = 1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x021a }
            r8.put(r1, r0)     // Catch:{ all -> 0x021a }
            X.1od r7 = new X.1od     // Catch:{ all -> 0x021a }
            r7.<init>(r4)     // Catch:{ all -> 0x021a }
            com.instagram.video.player.hero.IgServiceResultReceiver r6 = r14.A00     // Catch:{ all -> 0x021a }
            monitor-enter(r3)     // Catch:{ all -> 0x021a }
            goto L_0x00f3
        L_0x00ef:
            int r0 = r5.A01     // Catch:{ all -> 0x021a }
            goto L_0x0045
        L_0x00f3:
            java.lang.String r12 = "HeroServiceClient"
            java.lang.String r1 = "bindService()"
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ all -> 0x0217 }
            p000X.C40431oe.A01(r12, r1, r0)     // Catch:{ all -> 0x0217 }
            android.content.ServiceConnection r0 = r3.A0H     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x010a
            java.lang.String r1 = "mConnection is not null. Skipping bindService"
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ all -> 0x0217 }
            p000X.C40431oe.A01(r12, r1, r0)     // Catch:{ all -> 0x0217 }
            goto L_0x01d1
        L_0x010a:
            r3.A0O = r2     // Catch:{ all -> 0x0217 }
            android.content.Context r0 = r15.getApplicationContext()     // Catch:{ all -> 0x0217 }
            r3.A00 = r0     // Catch:{ all -> 0x0217 }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A0O     // Catch:{ all -> 0x0217 }
            boolean r0 = r0.A0n     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x0119
            r10 = 1
        L_0x0119:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A0O     // Catch:{ all -> 0x0217 }
            boolean r11 = r0.A1W     // Catch:{ all -> 0x0217 }
            monitor-enter(r3)     // Catch:{ all -> 0x0217 }
            android.content.Intent r0 = r3.A01     // Catch:{ all -> 0x0214 }
            if (r0 != 0) goto L_0x0191
            r13 = 1
            android.content.Context r0 = r3.A00     // Catch:{ IllegalArgumentException -> 0x013b }
            android.content.pm.PackageManager r9 = r0.getPackageManager()     // Catch:{ IllegalArgumentException -> 0x013b }
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ IllegalArgumentException -> 0x013b }
            android.content.Context r1 = r3.A00     // Catch:{ IllegalArgumentException -> 0x013b }
            java.lang.String r0 = "com.facebook.video.heroplayer.service.MainProcHeroService"
            r5.<init>(r1, r0)     // Catch:{ IllegalArgumentException -> 0x013b }
            r0 = 2
            if (r11 == 0) goto L_0x0136
            r0 = 1
        L_0x0136:
            r9.setComponentEnabledSetting(r5, r0, r13)     // Catch:{ IllegalArgumentException -> 0x013b }
            r0 = 1
            goto L_0x014f
        L_0x013b:
            r9 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ ClassNotFoundException -> 0x0186 }
            if (r11 == 0) goto L_0x014b
            java.lang.String r1 = "enable"
        L_0x0142:
            r0 = 0
            r5[r0] = r1     // Catch:{ ClassNotFoundException -> 0x0186 }
            java.lang.String r0 = "Could not %s main proc"
            p000X.C40431oe.A05(r12, r9, r0, r5)     // Catch:{ ClassNotFoundException -> 0x0186 }
            goto L_0x014e
        L_0x014b:
            java.lang.String r1 = "disable"
            goto L_0x0142
        L_0x014e:
            r0 = 0
        L_0x014f:
            if (r0 == 0) goto L_0x0154
            r0 = 1
            if (r11 != 0) goto L_0x0155
        L_0x0154:
            r0 = 0
        L_0x0155:
            if (r0 == 0) goto L_0x015a
            java.lang.String r9 = "com.facebook.video.heroplayer.service.MainProcHeroService"
            goto L_0x015c
        L_0x015a:
            java.lang.String r9 = "com.facebook.video.heroplayer.service.HeroService"
        L_0x015c:
            if (r10 == 0) goto L_0x0174
            java.lang.Class r0 = r3.A02     // Catch:{ ClassNotFoundException -> 0x0186 }
            if (r0 != 0) goto L_0x0168
            java.lang.Class r0 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x0186 }
            r3.A02 = r0     // Catch:{ ClassNotFoundException -> 0x0186 }
        L_0x0168:
            android.content.Intent r5 = new android.content.Intent     // Catch:{ ClassNotFoundException -> 0x0186 }
            android.content.Context r1 = r3.A00     // Catch:{ ClassNotFoundException -> 0x0186 }
            java.lang.Class r0 = r3.A02     // Catch:{ ClassNotFoundException -> 0x0186 }
            r5.<init>(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0186 }
            r3.A01 = r5     // Catch:{ ClassNotFoundException -> 0x0186 }
            goto L_0x0191
        L_0x0174:
            android.content.Intent r5 = new android.content.Intent     // Catch:{ ClassNotFoundException -> 0x0186 }
            r5.<init>()     // Catch:{ ClassNotFoundException -> 0x0186 }
            r3.A01 = r5     // Catch:{ ClassNotFoundException -> 0x0186 }
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ ClassNotFoundException -> 0x0186 }
            android.content.Context r0 = r3.A00     // Catch:{ ClassNotFoundException -> 0x0186 }
            r1.<init>(r0, r9)     // Catch:{ ClassNotFoundException -> 0x0186 }
            r5.setComponent(r1)     // Catch:{ ClassNotFoundException -> 0x0186 }
            goto L_0x0191
        L_0x0186:
            r2 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "Hero Service class not found"
            r1.<init>(r0, r2)     // Catch:{ all -> 0x018f }
            throw r1     // Catch:{ all -> 0x018f }
        L_0x018f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0214 }
        L_0x0191:
            monitor-exit(r3)     // Catch:{ all -> 0x0217 }
            X.1oy r0 = new X.1oy     // Catch:{ all -> 0x0217 }
            r0.<init>(r3)     // Catch:{ all -> 0x0217 }
            r3.A0H = r0     // Catch:{ all -> 0x0217 }
            r3.A03 = r8     // Catch:{ all -> 0x0217 }
            r3.A0P = r7     // Catch:{ all -> 0x0217 }
            r3.A0I = r6     // Catch:{ all -> 0x0217 }
            X.1nW r0 = r3.A07     // Catch:{ all -> 0x0217 }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r3.A0O     // Catch:{ all -> 0x0217 }
            java.util.concurrent.atomic.AtomicReference r0 = r0.A05     // Catch:{ all -> 0x0217 }
            r0.set(r1)     // Catch:{ all -> 0x0217 }
            X.1oz r0 = r3.A0J     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x01bc
            boolean r0 = r2.A1j     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x01bc
            X.1oz r1 = new X.1oz     // Catch:{ all -> 0x0217 }
            X.1p0 r0 = new X.1p0     // Catch:{ all -> 0x0217 }
            r0.<init>(r3)     // Catch:{ all -> 0x0217 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0217 }
            r3.A0J = r1     // Catch:{ all -> 0x0217 }
        L_0x01bc:
            p000X.C40691p4.A01 = r2     // Catch:{ all -> 0x0217 }
            p000X.C40701p5.A01 = r2     // Catch:{ all -> 0x0217 }
            android.os.Handler r0 = r3.A05     // Catch:{ all -> 0x0217 }
            p000X.C40711p6.A03 = r2     // Catch:{ all -> 0x0217 }
            p000X.C40711p6.A02 = r0     // Catch:{ all -> 0x0217 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0217 }
            p000X.C39731nP.A01(r3)     // Catch:{ all -> 0x0217 }
            android.content.Context r0 = r3.A00     // Catch:{ all -> 0x0217 }
            p000X.C40611ow.A00(r0)     // Catch:{ all -> 0x0217 }
        L_0x01d1:
            monitor-exit(r3)     // Catch:{ all -> 0x021a }
            X.1p7 r1 = new X.1p7     // Catch:{ all -> 0x021a }
            r1.<init>()     // Catch:{ all -> 0x021a }
            X.1oz r0 = r3.A0J     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x01dd
            r0.A00 = r1     // Catch:{ all -> 0x021a }
        L_0x01dd:
            X.0Q7 r1 = p000X.AnonymousClass0Q7.A03()     // Catch:{ all -> 0x021a }
            X.1p8 r0 = new X.1p8     // Catch:{ all -> 0x021a }
            r0.<init>(r14)     // Catch:{ all -> 0x021a }
            r1.A0B(r0)     // Catch:{ all -> 0x021a }
            X.1p9 r1 = new X.1p9     // Catch:{ all -> 0x021a }
            r1.<init>(r14)     // Catch:{ all -> 0x021a }
            java.util.Collection r0 = p000X.AnonymousClass0KT.A08     // Catch:{ all -> 0x021a }
            r0.add(r1)     // Catch:{ all -> 0x021a }
            X.0L7 r3 = p000X.AnonymousClass0L7.DISABLE_LAZY_AUDIO     // Catch:{ all -> 0x021a }
            r0 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r1 = "enable_lazy_audio"
            r0 = 0
            java.lang.Object r0 = p000X.AnonymousClass0L6.A02(r4, r3, r1, r2, r0)     // Catch:{ all -> 0x021a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x021a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x021a }
            A02 = r0     // Catch:{ all -> 0x021a }
            boolean r0 = p000X.C06530Pk.A00
            if (r0 == 0) goto L_0x0226
            r0 = -1503408622(0xffffffffa663ce12, float:-7.9035723E-16)
            p000X.AnonymousClass0ZB.A00(r0)
            return
        L_0x0214:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0217 }
            throw r0     // Catch:{ all -> 0x0217 }
        L_0x0217:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x021a }
            throw r0     // Catch:{ all -> 0x021a }
        L_0x021a:
            r1 = move-exception
            boolean r0 = p000X.C06530Pk.A00
            if (r0 == 0) goto L_0x0225
            r0 = -838910363(0xffffffffcdff3e65, float:-5.35284896E8)
            p000X.AnonymousClass0ZB.A00(r0)
        L_0x0225:
            throw r1
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C39701nL.A05(android.content.Context, X.0C1):void");
    }

    public final void Brn() {
        C39731nP.A0W.A06();
    }

    public final void Bro() {
        C39731nP.A0W.A06();
    }

    public static void A02() {
        C40121o7 A002 = C40121o7.A00();
        AnonymousClass0OR r6 = new AnonymousClass0OR(C05700Lp.A00(), 206, 3, false, false);
        IgHttpConnectionForProxy igHttpConnectionForProxy = new IgHttpConnectionForProxy();
        C40301oR r3 = new C40301oR();
        synchronized (A002) {
            if (!A002.A07) {
                A002.A01 = 7;
                new Thread(new C40311oS(A002, r6, igHttpConnectionForProxy, r3), "LocalSocketVideoProxy").start();
                A002.A07 = true;
            }
        }
    }
}
