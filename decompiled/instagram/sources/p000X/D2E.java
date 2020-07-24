package p000X;

import android.content.Context;
import android.os.Handler;
import com.facebook.video.heroplayer.ipc.VideoPlayContextualSetting;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.video.heroplayer.service.HeroService;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.D2E */
public final class D2E implements C29633D2q {
    public Handler A00;
    public D1Q A01;
    public D2X A02;
    public C29623D2f A03;
    public final Context A04;
    public final C25947Bcz A05;
    public final D21 A06;
    public final D29 A07;
    public final D40 A08;
    public final HeroPlayerSetting A09;
    public final Map A0A;
    public final AtomicReference A0B;
    public final D2M A0C;
    public final D3F A0D;
    public final AtomicBoolean A0E;

    public static long A00(VideoPlayRequest videoPlayRequest) {
        VideoSource videoSource = videoPlayRequest.A05;
        long j = (long) CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        if (videoSource != null) {
            long j2 = videoSource.A00;
            if (j2 > 0) {
                j = Math.max(j2, j);
            }
        }
        return (long) ((int) j);
    }

    public final DAW AP7(C39911nl r41, VideoPlayRequest videoPlayRequest, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, boolean z) {
        boolean z2;
        int i;
        AtomicBoolean atomicBoolean3 = atomicBoolean2;
        C39911nl r0 = r41;
        int i2 = r0.A00;
        int i3 = r0.A01;
        VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
        boolean z3 = videoPlayRequest2.A0Q;
        AtomicBoolean atomicBoolean4 = atomicBoolean3;
        C25947Bcz bcz = this.A05;
        D2M d2m = this.A0C;
        D2M d2m2 = d2m;
        D6Q d6q = new D6Q();
        C39961nq r7 = this.A09.A0U;
        AtomicBoolean atomicBoolean5 = new AtomicBoolean(false);
        if (!videoPlayRequest2.A08) {
            atomicBoolean3 = new AtomicBoolean(false);
        }
        boolean z4 = videoPlayRequest2.A08;
        if (z4) {
            z2 = videoPlayRequest2.A0O;
        } else {
            z2 = false;
        }
        if (z4) {
            i = videoPlayRequest2.A0K;
        } else {
            i = 1000;
        }
        HeroPlayerSetting heroPlayerSetting = this.A09;
        int i4 = heroPlayerSetting.A04;
        int i5 = i;
        boolean z5 = z2;
        AtomicBoolean atomicBoolean6 = atomicBoolean3;
        AtomicBoolean atomicBoolean7 = atomicBoolean5;
        C39961nq r17 = r7;
        D6B d6b = new D6B(true, r17, atomicBoolean7, atomicBoolean6, z5, i5, 1000, (int) 6000, i4, heroPlayerSetting.A03, Constants.ZERO, this.A0C);
        boolean z6 = true;
        if (d2m == null) {
            z6 = false;
        }
        D6U.A02(z6);
        return new D64(d6q, i2, i3, -1, z3, d6b, d2m2, bcz, atomicBoolean, atomicBoolean4, z, (D4G) null);
    }

    public final /* bridge */ /* synthetic */ D2X Aa2(VideoPlayRequest videoPlayRequest, C29603D1i d1i, C29623D2f d2f, D2U d2u) {
        D35 d35;
        C40781pF r0;
        if (videoPlayRequest == null) {
            d35 = new D35();
        } else {
            d35 = new D35();
            d35.A05(videoPlayRequest.A05.A0J);
            String str = videoPlayRequest.A07;
            synchronized (d35) {
                d35.A00 = str;
            }
            String str2 = videoPlayRequest.A05.A0D;
            synchronized (d35) {
                d35.A01 = str2;
            }
            boolean z = videoPlayRequest.A05.A0K;
            synchronized (d35) {
                d35.A02 = z;
            }
            d35.A03(videoPlayRequest.A05.A08);
            d35.A04(videoPlayRequest.A05.A09);
        }
        C29623D2f d2f2 = d2f;
        this.A03 = d2f2;
        D20 d20 = new D20(this.A06.A02);
        if (videoPlayRequest != null) {
            r0 = videoPlayRequest.A04;
        } else {
            r0 = C40781pF.UNKNOWN;
        }
        VideoPlayContextualSetting videoPlayContextualSetting = null;
        D3U d3u = new D3U((D1L) null, d20, r0);
        C40001nu r9 = this.A09.A0R;
        C25947Bcz bcz = this.A05;
        if (videoPlayRequest != null) {
            videoPlayContextualSetting = videoPlayRequest.A0L;
        }
        D2V d2v = new D2V(r9, bcz, videoPlayContextualSetting, d35, true);
        D1Q d1q = new D1Q(d1i, d2v);
        this.A01 = d1q;
        D2X d2x = new D2X(d1q, d35, this.A05, d2f2, d2v, this.A04, d3u);
        this.A02 = d2x;
        return d2x;
    }

    public D2E(Context context, Map map, HeroPlayerSetting heroPlayerSetting, D29 d29, D2M d2m, AtomicReference atomicReference, D1L d1l, C29603D1i d1i, Handler handler, D40 d40, AtomicBoolean atomicBoolean) {
        this.A04 = context;
        this.A0A = map;
        this.A09 = heroPlayerSetting;
        this.A0C = d2m;
        this.A07 = d29;
        Context context2 = context;
        this.A0D = new D3F(context2, heroPlayerSetting, d29, d2m, d1l, d1i);
        HeroService heroService = (HeroService) context;
        this.A05 = heroService.A01;
        this.A06 = heroService.A05.A00;
        this.A0B = atomicReference;
        this.A00 = handler;
        this.A08 = d40;
        this.A0E = atomicBoolean;
    }

    public final C29623D2f AFG() {
        return this.A03;
    }

    public final D2X AJl() {
        return this.A02;
    }

    public final D2X AGH(VideoPlayRequest videoPlayRequest, C29603D1i d1i, C29623D2f d2f) {
        return null;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02e7  */
    public final p000X.C29639D2w APr(long r43, com.facebook.video.heroplayer.ipc.VideoPlayRequest r45, p000X.D7w r46, p000X.D8A r47, p000X.D4I r48, p000X.D2U r49, p000X.D2Y r50, p000X.C29642D2z r51, boolean r52) {
        /*
            r42 = this;
            r4 = r42
            r19 = r43
            r26 = r19
            r7 = r45
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r4.A09
            X.D21 r1 = r4.A06
            java.util.Map r0 = r4.A0A
            r1.A00(r0, r2)
            X.D21 r5 = r4.A06
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r7.A05
            java.lang.String r3 = r0.A0D
            android.net.Uri r2 = r0.A03
            java.util.concurrent.atomic.AtomicReference r0 = r5.A04
            java.lang.Object r1 = r0.get()
            android.util.LruCache r1 = (android.util.LruCache) r1
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0029
            java.lang.String r3 = r2.toString()
        L_0x0029:
            java.lang.Object r1 = r1.get(r3)
            X.D1u r1 = (p000X.C29614D1u) r1
            r6 = 0
            boolean r0 = r1 instanceof p000X.C29615D1v
            r5 = r49
            if (r0 == 0) goto L_0x02f3
            r6 = r1
            X.D1v r6 = (p000X.C29615D1v) r6
            boolean r0 = r6.A0M
            if (r0 == 0) goto L_0x02f0
            java.lang.Integer r1 = r6.A0L
            java.lang.Integer r0 = p000X.Constants.ZERO
            if (r1 != r0) goto L_0x0047
            X.D40 r0 = r6.A00
            if (r0 == 0) goto L_0x004d
        L_0x0047:
            java.lang.Integer r1 = r6.A0L
            java.lang.Integer r0 = p000X.Constants.ONE
            if (r1 != r0) goto L_0x02f0
        L_0x004d:
            r0 = 1
        L_0x004e:
            if (r0 == 0) goto L_0x02f3
            r0 = 0
            r6.A0M = r0
            com.facebook.video.heroplayer.ipc.VideoSource r1 = r7.A05
            java.lang.String r2 = r1.A08
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0065
            java.lang.String r1 = r1.A09
            X.D1N r0 = r6.A0B
            r0.A0T = r2
            r0.A0U = r1
        L_0x0065:
            X.D3F r8 = r4.A0D
            java.lang.Integer r26 = p000X.Constants.A0u
            X.D21 r0 = r4.A06
            X.D23 r1 = r0.A02
            X.D1Q r0 = r4.A01
            X.D2f r3 = r4.A03
            r11 = 0
            if (r3 != 0) goto L_0x02ea
            r29 = r11
        L_0x0076:
            r23 = r19
            X.D1x r21 = new X.D1x
            r25 = r7
            r28 = r0
            r30 = r5
            r27 = r1
            r22 = r8
            r21.<init>(r22, r23, r25, r26, r27, r28, r29, r30)
            java.lang.Integer r27 = p000X.Constants.A12
            r32 = 0
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r4.A09
            r24 = r19
            X.D1x r22 = new X.D1x
            r26 = r7
            r29 = r11
            r30 = r11
            r31 = r5
            r23 = r8
            r28 = r1
            r22.<init>(r23, r24, r26, r27, r28, r29, r30, r31)
            java.lang.Integer r29 = p000X.Constants.A0Y
            if (r3 == 0) goto L_0x00a8
            X.D19 r32 = r3.AYz()
        L_0x00a8:
            r26 = r19
            X.D1x r24 = new X.D1x
            r28 = r7
            r33 = r5
            r25 = r8
            r30 = r1
            r31 = r0
            r24.<init>(r25, r26, r28, r29, r30, r31, r32, r33)
            X.D4p r23 = new X.D4p
            r27 = -1
            r28 = -1
            X.D2M r0 = r4.A0C
            r15 = r23
            r31 = 1
            r3 = r48
            r32 = r3
            r25 = r21
            r26 = r22
            r30 = r0
            r23.<init>(r24, r25, r26, r27, r28, r30, r31, r32)
            r12 = 0
            if (r49 == 0) goto L_0x00da
            boolean r0 = r5.A0H
            if (r0 != 0) goto L_0x00e8
        L_0x00da:
            com.facebook.video.heroplayer.ipc.VideoSource r9 = r7.A05
            long r0 = r9.A00
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ed
            long r0 = r9.A01
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ed
        L_0x00e8:
            if (r48 == 0) goto L_0x00ed
            r0 = 1
            r3.A00 = r0
        L_0x00ed:
            X.D56 r14 = new X.D56
            boolean r12 = r2.A1l
            r0 = 0
            long r8 = (long) r0
            r16 = 0
            com.facebook.video.heroplayer.ipc.VideoSource r3 = r7.A05
            long r0 = r3.A00
            int r10 = (int) r0
            long r0 = r3.A01
            int r13 = (int) r0
            boolean r0 = r2.A1J
            r29 = 0
            r25 = 1
            r21 = r14
            r22 = r12
            r23 = r8
            r26 = r10
            r27 = r13
            r28 = r0
            r21.<init>(r22, r23, r25, r26, r27, r28, r29)
            X.D1N r0 = new X.D1N
            X.Cuo r18 = new X.Cuo
            java.lang.String r10 = r3.A0D
            java.lang.String r9 = r3.A08
            java.lang.String r8 = r3.A09
            X.1pF r2 = r7.A04
            X.1pE r1 = r3.A05
            r21 = r18
            r22 = r10
            r23 = r9
            r24 = r8
            r25 = r2
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            X.D29 r8 = r4.A07
            boolean r3 = r7.A0C
            X.Cv5 r1 = p000X.C29279Cv5.A00
            java.lang.String r25 = r1.A01()
            java.lang.Integer r28 = p000X.Constants.A14
            r2 = 0
            if (r49 == 0) goto L_0x0142
            boolean r1 = r5.A0I
            if (r1 != 0) goto L_0x0144
        L_0x0142:
            r31 = 0
        L_0x0144:
            if (r49 == 0) goto L_0x014c
            boolean r1 = r5.A0J
            r32 = 1
            if (r1 != 0) goto L_0x014e
        L_0x014c:
            r32 = 0
        L_0x014e:
            if (r49 == 0) goto L_0x0156
            boolean r1 = r5.A0K
            r33 = 1
            if (r1 != 0) goto L_0x0158
        L_0x0156:
            r33 = 0
        L_0x0158:
            if (r49 == 0) goto L_0x0160
            boolean r1 = r5.A0G
            r34 = 1
            if (r1 != 0) goto L_0x0162
        L_0x0160:
            r34 = 0
        L_0x0162:
            r36 = 0
            if (r49 == 0) goto L_0x02e7
            java.util.List r1 = r5.A0F
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x02e7
            X.D4w r1 = r5.A01(r2)
            java.util.List r1 = r1.A02
            java.lang.Object r1 = r1.get(r2)
            X.D5E r1 = (p000X.D5E) r1
            java.util.List r1 = r1.A03
            java.lang.Object r1 = r1.get(r2)
            X.D4l r1 = (p000X.C29677D4l) r1
            com.google.android.exoplayer2.Format r1 = r1.A01
            java.lang.String r1 = r1.A0K
        L_0x0186:
            r22 = 0
            java.lang.String r23 = ""
            r26 = 0
            r27 = r23
            r30 = 0
            r35 = 0
            r24 = r3
            r37 = r1
            r17 = r0
            r21 = r8
            r17.<init>(r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r4.A09
            boolean r1 = r1.A1a
            r0.A0i = r1
            X.D1X r9 = new X.D1X
            r9.<init>(r0)
            r0 = r50
            r0.A01 = r9
            X.D2S r8 = new X.D2S
            X.Cuo r10 = new X.Cuo
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r7.A05
            java.lang.String r12 = r0.A0D
            java.lang.String r3 = r0.A08
            java.lang.String r2 = r0.A09
            X.1pF r1 = r7.A04
            X.1pE r0 = r0.A05
            r17 = r10
            r18 = r12
            r19 = r3
            r20 = r2
            r21 = r1
            r22 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            X.D1V r2 = new X.D1V
            r2.<init>(r10, r9)
            X.D4E r1 = new X.D4E
            X.D29 r0 = r4.A07
            r1.<init>(r0)
            r8.<init>(r15, r2, r1, r14)
            if (r49 == 0) goto L_0x02e0
            android.content.Context r2 = r4.A04
            r0 = 1
            r1 = 0
            r9 = r46
            r3 = r47
            X.D49 r11 = p000X.D2J.A01(r5, r2, r0, r9, r3)
            if (r11 == 0) goto L_0x02d8
            java.util.List r0 = r11.A01
            if (r0 != 0) goto L_0x02d8
            r18 = 0
        L_0x01f0:
            if (r11 == 0) goto L_0x02d0
            java.util.List r0 = r11.A00
            if (r0 != 0) goto L_0x02d0
            r19 = 0
        L_0x01f8:
            if (r18 <= 0) goto L_0x021e
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x021e
            java.util.List r0 = r11.A01
            java.lang.Object r12 = r0.get(r1)
            X.D4l r12 = (p000X.C29677D4l) r12
            boolean r0 = r12 instanceof p000X.C29674D4i
            if (r0 == 0) goto L_0x021e
            X.D4i r12 = (p000X.C29674D4i) r12
            long r2 = r12.ALp()
            r0 = -1
            int r9 = r12.AVT(r0)
            long r9 = (long) r9
            long r2 = r2 + r9
            r9 = 1
            long r2 = r2 - r9
            r12.AKh(r2, r0)
        L_0x021e:
            r2 = 1
            if (r18 != 0) goto L_0x024c
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r7.A05
            java.lang.String r0 = r0.A0D
            r3[r16] = r0
            java.lang.String r1 = "HeroExo2LiveInitHelper"
            java.lang.String r0 = "No valid video representation found for live video %s"
            p000X.C40431oe.A03(r1, r0, r3)
            X.D29 r12 = r4.A07
            X.1rK r10 = new X.1rK
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r7.A05
            java.lang.String r9 = r0.A0D
            X.D2r r0 = p000X.C29634D2r.MANIFEST
            java.lang.String r3 = r0.name()
            X.1rS r0 = p000X.C42071rS.NO_VALID_VIDEO_REPRESENTATION
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "No valid video representation found for live video"
            r10.<init>(r9, r3, r1, r0)
            r12.A00(r10)
        L_0x024c:
            long r0 = A00(r7)
            boolean r3 = r8.A05
            r3 = r3 ^ 1
            p000X.D6U.A03(r3)
            r8.A01 = r0
            X.D2M r0 = r4.A0C
            int r1 = r0.A02()
            boolean r0 = r8.A05
            r0 = r0 ^ 1
            p000X.D6U.A03(r0)
            r8.A00 = r1
            X.D4g r9 = new X.D4g
            r9.<init>()
            boolean r0 = r8.A05
            r0 = r0 ^ 1
            p000X.D6U.A03(r0)
            p000X.D6U.A01(r9)
            r8.A04 = r9
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r7.A05
            android.net.Uri r0 = r0.A03
            r17 = r0
            r8.A05 = r2
            X.D5s r16 = new X.D5s
            r25 = 0
            p000X.D6U.A01(r17)
            X.96X r15 = r8.A09
            X.D54 r14 = r8.A08
            X.D8q r13 = r8.A02
            int r12 = r8.A00
            X.D8D r10 = r8.A03
            long r0 = r8.A01
            X.D56 r3 = r8.A07
            X.D4E r8 = r8.A06
            r24 = r16
            r26 = r17
            r27 = r15
            r28 = r9
            r29 = r14
            r30 = r13
            r31 = r12
            r32 = r10
            r33 = r0
            r35 = r3
            r36 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36)
            X.D2T r3 = new X.D2T
            if (r49 == 0) goto L_0x02b6
            r2 = 0
        L_0x02b6:
            r27 = r51
            r24 = r3
            r25 = r4
            r26 = r16
            r28 = r7
            r29 = r2
            r24.<init>(r25, r26, r27, r28, r29)
            java.util.concurrent.atomic.AtomicInteger r1 = r6.A0I
            r7 = 0
            r1.set(r7)
            java.lang.Object r4 = r6.A0G
            monitor-enter(r4)
            goto L_0x03a0
        L_0x02d0:
            java.util.List r0 = r11.A00
            int r19 = r0.size()
            goto L_0x01f8
        L_0x02d8:
            java.util.List r0 = r11.A01
            int r18 = r0.size()
            goto L_0x01f0
        L_0x02e0:
            r2 = 1
            r18 = 0
            r19 = 0
            goto L_0x024c
        L_0x02e7:
            r1 = 0
            goto L_0x0186
        L_0x02ea:
            X.D19 r29 = r3.AYz()
            goto L_0x0076
        L_0x02f0:
            r0 = 0
            goto L_0x004e
        L_0x02f3:
            if (r6 == 0) goto L_0x039d
            X.D2U r2 = r6.A01
            if (r2 == 0) goto L_0x039d
            if (r49 == 0) goto L_0x0303
            long r8 = r5.A01
            long r0 = r2.A01
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x039d
        L_0x0303:
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r1 = 0
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r7.A05
            java.lang.String r0 = r0.A0D
            r3[r1] = r0
            java.lang.String r1 = "HeroExo2LiveInitHelper"
            java.lang.String r0 = "Creating new fetcher with existing manifest from prev fetcher: %s"
            p000X.C40431oe.A01(r1, r0, r3)
        L_0x0314:
            X.D1v r6 = new X.D1v
            com.facebook.video.heroplayer.ipc.VideoSource r1 = r7.A05
            android.net.Uri r0 = r1.A03
            r17 = r0
            android.content.Context r0 = r4.A04
            r16 = r0
            android.os.Handler r15 = r4.A00
            X.Cuo r25 = new X.Cuo
            java.lang.String r9 = r1.A0D
            java.lang.String r10 = r1.A08
            java.lang.String r11 = r1.A09
            X.1pF r12 = r7.A04
            X.1pE r13 = r1.A05
            r8 = r25
            r8.<init>(r9, r10, r11, r12, r13)
            r29 = 0
            java.util.Map r14 = r4.A0A
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r13 = r4.A09
            X.D21 r0 = r4.A06
            X.D1y r12 = r0.A03
            X.D29 r11 = r4.A07
            r35 = 0
            X.D23 r10 = r0.A02
            java.util.concurrent.atomic.AtomicReference r0 = r4.A0B
            java.lang.Object r0 = r0.get()
            com.facebook.video.heroplayer.ipc.DynamicPlayerSettings r0 = (com.facebook.video.heroplayer.ipc.DynamicPlayerSettings) r0
            int r9 = r0.A00
            boolean r8 = r7.A0C
            long r0 = A00(r7)
            int r3 = (int) r0
            r40 = 0
            android.content.Context r0 = r4.A04
            com.facebook.video.heroplayer.service.HeroService r0 = (com.facebook.video.heroplayer.service.HeroService) r0
            X.D4L r0 = r0.A08
            java.lang.String r28 = ""
            r21 = r6
            r22 = r17
            r23 = r16
            r24 = r15
            r30 = r14
            r31 = r13
            r32 = r12
            r33 = r11
            r34 = r2
            r36 = r10
            r37 = r9
            r38 = r8
            r39 = r3
            r41 = r0
            r21.<init>(r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.D21 r8 = r4.A06
            com.facebook.video.heroplayer.ipc.VideoSource r0 = r7.A05
            java.lang.String r3 = r0.A0D
            android.net.Uri r2 = r0.A03
            java.util.concurrent.atomic.AtomicReference r0 = r8.A04
            java.lang.Object r1 = r0.get()
            android.util.LruCache r1 = (android.util.LruCache) r1
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0395
            java.lang.String r3 = r2.toString()
        L_0x0395:
            r1.put(r3, r6)
            r0 = 0
            r6.A0M = r0
            goto L_0x0065
        L_0x039d:
            r2 = r5
            goto L_0x0314
        L_0x03a0:
            java.lang.Integer r2 = r6.A0L     // Catch:{ all -> 0x0419 }
            java.lang.Integer r1 = p000X.Constants.ZERO     // Catch:{ all -> 0x0419 }
            if (r2 != r1) goto L_0x03ab
            r6.A00 = r3     // Catch:{ all -> 0x0419 }
            monitor-exit(r4)     // Catch:{ all -> 0x0419 }
            r1 = 1
            goto L_0x03ad
        L_0x03ab:
            monitor-exit(r4)     // Catch:{ all -> 0x0419 }
            r1 = 0
        L_0x03ad:
            if (r1 != 0) goto L_0x03ba
            java.lang.Integer r2 = r6.A0L
            java.lang.Integer r1 = p000X.Constants.ONE
            if (r2 != r1) goto L_0x0413
            X.D2U r1 = r6.A01
            r3.BNS(r1)
        L_0x03ba:
            X.D2w r15 = new X.D2w
            java.lang.Integer r17 = p000X.Constants.A0C
            if (r49 != 0) goto L_0x0410
            r9 = 0
        L_0x03c2:
            if (r49 != 0) goto L_0x040d
            r7 = 0
        L_0x03c6:
            if (r49 != 0) goto L_0x040a
            r1 = 0
        L_0x03ca:
            if (r49 != 0) goto L_0x0407
            r3 = 0
        L_0x03ce:
            if (r49 != 0) goto L_0x0402
            r28 = 0
        L_0x03d2:
            if (r49 != 0) goto L_0x03ff
            r13 = 0
        L_0x03d5:
            if (r49 != 0) goto L_0x03fc
            r12 = 0
        L_0x03d8:
            java.lang.String r32 = p000X.D2K.A00(r11)
            r34 = 0
            if (r49 != 0) goto L_0x03e2
            r34 = r23
        L_0x03e2:
            if (r49 != 0) goto L_0x03f9
            r0 = 0
        L_0x03e5:
            r20 = r9
            r22 = r7
            r24 = r1
            r26 = r3
            r30 = r13
            r31 = r12
            r33 = r6
            r35 = r0
            r15.<init>(r16, r17, r18, r19, r20, r22, r24, r26, r28, r30, r31, r32, r33, r34, r35)
            return r15
        L_0x03f9:
            boolean r0 = r5.A0K
            goto L_0x03e5
        L_0x03fc:
            boolean r12 = r5.A0J
            goto L_0x03d8
        L_0x03ff:
            boolean r13 = r5.A0H
            goto L_0x03d5
        L_0x0402:
            long r28 = android.os.SystemClock.elapsedRealtime()
            goto L_0x03d2
        L_0x0407:
            long r3 = r5.A06
            goto L_0x03ce
        L_0x040a:
            long r1 = r5.A03
            goto L_0x03ca
        L_0x040d:
            long r7 = r5.A05
            goto L_0x03c6
        L_0x0410:
            long r9 = r5.A08
            goto L_0x03c2
        L_0x0413:
            r6.A00 = r3
            r6.A03(r7)
            goto L_0x03ba
        L_0x0419:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0419 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.D2E.APr(long, com.facebook.video.heroplayer.ipc.VideoPlayRequest, X.D7w, X.D8A, X.D4I, X.D2U, X.D2Y, X.D2z, boolean):X.D2w");
    }
}
