package com.facebook.video.heroplayer.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.LruCache;
import android.view.Surface;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.video.heroplayer.ipc.ContextualConfigListener;
import com.facebook.video.heroplayer.ipc.DeviceOrientationFrame;
import com.facebook.video.heroplayer.ipc.DynamicPlayerSettings;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener;
import com.facebook.video.heroplayer.ipc.SpatialAudioFocusParams;
import com.facebook.video.heroplayer.ipc.TigonStatesListener;
import com.facebook.video.heroplayer.ipc.TigonTraceListener;
import com.facebook.video.heroplayer.ipc.TigonTrafficShapingListener;
import com.facebook.video.heroplayer.ipc.VideoLicenseListener;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.video.heroplayer.ipc.ZeroVideoRewriteConfig;
import com.facebook.video.heroplayer.service.live.common.HeroFbvpLiveManager;
import com.facebook.video.heroplayer.service.live.impl.HeroDashLiveManagerImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CameraVideoCapturer;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.BME;
import p000X.BW7;
import p000X.C200008hB;
import p000X.C25941Bcs;
import p000X.C25945Bcx;
import p000X.C25946Bcy;
import p000X.C25947Bcz;
import p000X.C27226C3p;
import p000X.C27229C3s;
import p000X.C29065CrI;
import p000X.C29066CrJ;
import p000X.C29279Cv5;
import p000X.C29280Cv6;
import p000X.C29570D0b;
import p000X.C29596D1b;
import p000X.C29603D1i;
import p000X.C29605D1k;
import p000X.C29608D1n;
import p000X.C29624D2g;
import p000X.C29626D2j;
import p000X.C29627D2k;
import p000X.C29634D2r;
import p000X.C29657D3q;
import p000X.C29660D3t;
import p000X.C29662D3v;
import p000X.C29672D4g;
import p000X.C29677D4l;
import p000X.C29734D6y;
import p000X.C39901nk;
import p000X.C40431oe;
import p000X.C40611ow;
import p000X.C41991rK;
import p000X.C42071rS;
import p000X.C55132a7;
import p000X.D19;
import p000X.D1L;
import p000X.D1Q;
import p000X.D21;
import p000X.D22;
import p000X.D29;
import p000X.D2D;
import p000X.D2I;
import p000X.D2J;
import p000X.D2M;
import p000X.D2R;
import p000X.D2U;
import p000X.D2V;
import p000X.D35;
import p000X.D3A;
import p000X.D3D;
import p000X.D3G;
import p000X.D3J;
import p000X.D3N;
import p000X.D41;
import p000X.D42;
import p000X.D44;
import p000X.D48;
import p000X.D49;
import p000X.D4D;
import p000X.D4F;
import p000X.D4G;
import p000X.D4L;
import p000X.D4Q;
import p000X.D4R;
import p000X.D6U;
import p000X.D70;
import p000X.D7w;
import p000X.D8A;

public class HeroService extends Service {
    public HandlerThread A00;
    public C25947Bcz A01;
    public D1L A02;
    public C29608D1n A03;
    public HeroFbvpLiveManager A04;
    public HeroDashLiveManagerImpl A05;
    public D2D A06;
    public Handler A07;
    public final D4L A08 = new D4D();
    public final D4Q A09 = new D4Q();
    public final D29 A0A = new D29(this.A0I, (D4L) null);
    public final C29603D1i A0B = new C29660D3t();
    public final Object A0C = new Object();
    public final Map A0D = Collections.synchronizedMap(new HashMap());
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public final AtomicReference A0F = new AtomicReference();
    public final AtomicReference A0G = new AtomicReference();
    public final AtomicReference A0H = new AtomicReference(new DynamicPlayerSettings(-1, false));
    public final AtomicReference A0I = new AtomicReference((Object) null);
    public final AtomicReference A0J = new AtomicReference((Object) null);
    public final AtomicReference A0K = new AtomicReference();
    public final AtomicReference A0L = new AtomicReference();
    public final AtomicReference A0M = new AtomicReference();
    public final D4R A0N = new D4R();
    public final HeroPlayerServiceApi.Stub A0O = new HeroPlayerServiceApi.Stub() {
        {
            AnonymousClass0Z0.A0A(1329181407, AnonymousClass0Z0.A03(247699838));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
            A00(r0);
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        public final void Bu8(VideoPlayRequest videoPlayRequest, Surface surface, float f) {
            C29626D2j d2j;
            int A03 = AnonymousClass0Z0.A03(-1518347549);
            VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
            C29624D2g.A02("warmUpPlayer, %s", videoPlayRequest2.A05);
            D6U.A01(videoPlayRequest2.A05.A0D);
            D2I d2i = HeroService.this.A0Q;
            String str = videoPlayRequest2.A05.A0D;
            HeroService heroService = HeroService.this;
            Handler A002 = HeroService.A00(heroService);
            HeroService heroService2 = HeroService.this;
            AtomicReference atomicReference = heroService2.A0I;
            D1L d1l = heroService2.A02;
            Map map = heroService2.A0D;
            AtomicBoolean atomicBoolean = heroService2.A0E;
            D4G d4g = heroService2.A0R;
            synchronized (d2i) {
                d2j = null;
                if (!d2i.A04(str) && d2i.A01.get(str) == null) {
                    VideoPlayRequest videoPlayRequest3 = videoPlayRequest2;
                    Map map2 = map;
                    D1L d1l2 = d1l;
                    AtomicReference atomicReference2 = atomicReference;
                    d2j = D2I.A00(d2i, new WarmUpPlayerListener(), heroService, A002, atomicReference2, d1l2, map2, videoPlayRequest3, atomicBoolean, d4g);
                    d2i.A01.put(str, d2j);
                }
            }
            if (d2j != null) {
                C29624D2g.A02("warm up a new player", new Object[0]);
                d2j.A0K(f);
                d2j.A0O(videoPlayRequest2, (DynamicPlayerSettings) HeroService.this.A0H.get());
                Surface surface2 = surface;
                if (surface != null) {
                    d2j.A0M(surface2);
                }
            }
            AnonymousClass0Z0.A0A(739563789, A03);
        }

        private void A00(RuntimeException runtimeException) {
            int A03 = AnonymousClass0Z0.A03(-787828613);
            Error error = new Error(runtimeException);
            AnonymousClass0Z0.A0A(407751358, A03);
            throw error;
        }

        public final void A4i(TigonStatesListener tigonStatesListener) {
            AnonymousClass0Z0.A0A(-762556398, AnonymousClass0Z0.A03(1322299516));
        }

        public final void A4j(TigonTraceListener tigonTraceListener) {
            AnonymousClass0Z0.A0A(-1977696095, AnonymousClass0Z0.A03(666075903));
        }

        public final void A4k(TigonTrafficShapingListener tigonTrafficShapingListener) {
            AnonymousClass0Z0.A0A(1895780289, AnonymousClass0Z0.A03(2147418165));
        }

        public final void A89(String str, boolean z) {
            int A03 = AnonymousClass0Z0.A03(-806573095);
            try {
                HeroService heroService = HeroService.this;
                C29624D2g.A02("cancelPrefetchForOrigin %s, exclude ads:%b", str, Boolean.valueOf(z));
                D2D d2d = heroService.A06;
                if (str != null) {
                    d2d.A05.A01(new D3A(d2d, str, z));
                }
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(-302023173, A03);
        }

        public final void A8A(String str, boolean z) {
            int A03 = AnonymousClass0Z0.A03(-942033317);
            try {
                HeroService heroService = HeroService.this;
                C29624D2g.A02("cancelPrefetchForVideo %s, %b", str, Boolean.valueOf(z));
                D2D d2d = heroService.A06;
                int A01 = d2d.A05.A01(new D3D(d2d, str));
                D48 d48 = d2d.A08;
                if (d48 != null) {
                    boolean z2 = false;
                    if (A01 > 0) {
                        z2 = true;
                    }
                    d48.A00.A0A.A00(new C55132a7(str, z2));
                }
                if (z) {
                    C27226C3p c3p = d2d.A05;
                    D3D d3d = new D3D(d2d, str);
                    synchronized (c3p.A05) {
                        Iterator it = c3p.A04.iterator();
                        while (it.hasNext()) {
                            C27229C3s c3s = (C27229C3s) it.next();
                            if (d3d.equals(c3s.A00)) {
                                c3s.A00.cancel();
                            }
                        }
                    }
                }
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(1079171207, A03);
        }

        public final void A8a() {
            VideoPlayRequest videoPlayRequest;
            int A03 = AnonymousClass0Z0.A03(-951320255);
            D2I d2i = HeroService.this.A0Q;
            if (d2i != null) {
                Map snapshot = d2i.A00.snapshot();
                ArrayList arrayList = new ArrayList(snapshot.size());
                for (Map.Entry entry : snapshot.entrySet()) {
                    if (!(entry == null || entry.getValue() == null || (videoPlayRequest = ((C29626D2j) entry.getValue()).A0s) == null || videoPlayRequest.A0B)) {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    if (l != null) {
                        d2i.A00.remove(l);
                    }
                }
                d2i.A01.evictAll();
            }
            AnonymousClass0Z0.A0A(1369835389, A03);
        }

        public final void A8b() {
            int A03 = AnonymousClass0Z0.A03(1272816223);
            D2I d2i = HeroService.this.A0Q;
            if (d2i != null) {
                d2i.A00.evictAll();
                d2i.A01.evictAll();
            }
            AnonymousClass0Z0.A0A(26926571, A03);
        }

        public final void A8c() {
            int A03 = AnonymousClass0Z0.A03(-292857147);
            try {
                D1L d1l = HeroService.this.A02;
                if (d1l != null) {
                    D1L.A03(d1l.A08.A01, Constants.ZERO);
                    D1L.A03(d1l.A08.A01, Constants.A0C);
                    D1L.A03(d1l.A08.A01, Constants.ONE);
                }
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(206579, A03);
        }

        public final void A8h(String str, String str2) {
            int A03 = AnonymousClass0Z0.A03(-2113650938);
            try {
                HeroService heroService = HeroService.this;
                HeroDashLiveManagerImpl heroDashLiveManagerImpl = heroService.A05;
                Uri parse = Uri.parse(str2);
                D21 d21 = heroDashLiveManagerImpl.A00;
                C40431oe.A01("DashLiveChunkSourceCache", "clearLiveCache: %s", str);
                LruCache lruCache = (LruCache) d21.A04.get();
                if (!d21.A00) {
                    str = parse.toString();
                }
                lruCache.remove(str);
                if (heroService.A04 != null) {
                }
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(-904537125, A03);
        }

        public final void A8p() {
            int A03 = AnonymousClass0Z0.A03(674773159);
            try {
                C29624D2g.A02("clearWarmUpPool", new Object[0]);
                HeroService.this.A0Q.A01.evictAll();
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(546331268, A03);
        }

        public final void A9l(String str, boolean z, String str2) {
            int A03 = AnonymousClass0Z0.A03(-143190912);
            try {
                AnonymousClass0ZA.A0E(HeroService.A00(HeroService.this), new D44(this), -1295188422);
            } catch (RuntimeException e) {
                C40431oe.A05("HeroService", e, "Unable to enable TA Provider!", new Object[0]);
                A00(e);
            }
            AnonymousClass0Z0.A0A(-332215963, A03);
        }

        public final void ABP(String str) {
            int A03 = AnonymousClass0Z0.A03(-1697123315);
            C29624D2g.A02("data connection quality changed to: %s", str);
            try {
                C25947Bcz bcz = HeroService.this.A01;
                if (bcz != null) {
                    bcz.A01 = str;
                }
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(943341428, A03);
        }

        public final long ADT(List list) {
            long j;
            C29570D0b A04;
            C29570D0b A042;
            int indexOf;
            int A03 = AnonymousClass0Z0.A03(1736878768);
            try {
                D1L d1l = HeroService.this.A02;
                if (d1l == null || (A04 = d1l.A04()) == null) {
                    j = -1;
                    AnonymousClass0Z0.A0A(-1640057198, A03);
                    return j;
                }
                long AHW = A04.AHW();
                Set<String> AOS = A04.AOS();
                HashSet hashSet = new HashSet(list);
                for (String str : AOS) {
                    String str2 = null;
                    if (str != null && (indexOf = str.indexOf(46)) > 0) {
                        str2 = str.substring(0, indexOf);
                    }
                    if (hashSet.contains(str2) && (A042 = d1l.A04()) != null) {
                        for (C25941Bcs A06 : A042.AHc(str)) {
                            A042.A06(A06, "api_eviction");
                        }
                    }
                }
                j = AHW - A04.AHW();
                AnonymousClass0Z0.A0A(-1640057198, A03);
                return j;
            } catch (RuntimeException e) {
                A00(e);
                j = -1;
            }
        }

        public final Map AHK(String str) {
            int A03 = AnonymousClass0Z0.A03(1455256755);
            try {
                Map A02 = C29279Cv5.A00.A02(str);
                AnonymousClass0Z0.A0A(63064583, A03);
                return A02;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(799820114, A03);
                return null;
            }
        }

        public final boolean AeY(VideoPrefetchRequest videoPrefetchRequest) {
            boolean z;
            int A03 = AnonymousClass0Z0.A03(1032306359);
            try {
                D1L d1l = HeroService.this.A02;
                if (d1l != null) {
                    C29570D0b A04 = d1l.A04();
                    if (A04 != null) {
                        String str = videoPrefetchRequest.A0B;
                        VideoSource videoSource = videoPrefetchRequest.A09;
                        z = A04.AeZ(C40431oe.A00(str, videoSource.A0D, videoSource.A03), 0, (long) videoPrefetchRequest.A02);
                    } else {
                        z = false;
                    }
                    AnonymousClass0Z0.A0A(-1370774192, A03);
                    return z;
                }
                AnonymousClass0Z0.A0A(228546397, A03);
                return false;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-1984596082, A03);
                return false;
            }
        }

        public final void Aop() {
            int A03 = AnonymousClass0Z0.A03(628238125);
            try {
                C29624D2g.A02("maybeInitCache due to app idle", new Object[0]);
                HeroService.this.A02.A04();
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(-1771625629, A03);
        }

        public final void Apl(String str) {
            int A03 = AnonymousClass0Z0.A03(-1211737488);
            try {
                C29624D2g.A02("network type changed to: %s", str);
                C25947Bcz bcz = HeroService.this.A01;
                if (bcz != null) {
                    bcz.A02 = str.toUpperCase(Locale.US);
                }
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(1659465493, A03);
        }

        public final void As1(boolean z, boolean z2, HeroScrollSetting heroScrollSetting) {
            int A03 = AnonymousClass0Z0.A03(1363891560);
            try {
                C29624D2g.A02("App is scrolling %s", String.valueOf(z));
                if (heroScrollSetting.A02) {
                    if (!heroScrollSetting.A01) {
                        HeroService.this.A0E.set(z);
                    }
                    D2I d2i = HeroService.this.A0Q;
                    int i = heroScrollSetting.A00;
                    for (C29626D2j A0Q : d2i.A00.snapshot().values()) {
                        A0Q.A0Q(z, i);
                    }
                    for (C29626D2j A0Q2 : d2i.A01.snapshot().values()) {
                        A0Q2.A0Q(z, i);
                    }
                }
                if (heroScrollSetting.A03) {
                    AnonymousClass0ZA.A0E(HeroService.A00(HeroService.this), new BW7(this, z), 776106647);
                }
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(-304490640, A03);
        }

        public final void As4(boolean z) {
            int A03 = AnonymousClass0Z0.A03(42941513);
            if (z) {
                try {
                    C29624D2g.A02("onAppStateChanged backgrounded", new Object[0]);
                    C29065CrI.A02.A02();
                } catch (RuntimeException e) {
                    A00(e);
                }
            }
            D1L d1l = HeroService.this.A02;
            if (d1l != null) {
                d1l.A04 = z;
            }
            AnonymousClass0Z0.A0A(842095526, A03);
        }

        public final void BAT(String str, long j) {
            int A03 = AnonymousClass0Z0.A03(-1412773347);
            HeroService.this.A0M.get();
            AnonymousClass0Z0.A0A(-1173595150, A03);
        }

        public final void BCh(int i) {
            int A03 = AnonymousClass0Z0.A03(1013337527);
            HeroService.this.A0M.get();
            AnonymousClass0Z0.A0A(328958445, A03);
        }

        public final void BCo(String str, String str2, String str3, long j, long j2, long j3) {
            int A03 = AnonymousClass0Z0.A03(1995706817);
            HeroService.this.A0L.get();
            AnonymousClass0Z0.A0A(-2023831792, A03);
        }

        public final boolean BWv(long j, boolean z) {
            int A03 = AnonymousClass0Z0.A03(-1436199631);
            try {
                Boolean valueOf = Boolean.valueOf(z);
                C29624D2g.A02("id [%d]: pause, finishPlayback: %b", Long.valueOf(j), valueOf);
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(-1779704065, A03);
                    return false;
                }
                C29626D2j.A0E(A01, "Pause: finishPlayback=%b", valueOf);
                C29626D2j.A0B(A01, A01.A0C.obtainMessage(3, valueOf));
                AnonymousClass0Z0.A0A(1876196756, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(123145624, A03);
                return false;
            }
        }

        public final boolean BXG(long j, long j2, String str) {
            int A03 = AnonymousClass0Z0.A03(1243790969);
            try {
                C29624D2g.A02("id [%d]: play", Long.valueOf(j));
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(894633409, A03);
                    return false;
                }
                A01.A0L(j2, str);
                AnonymousClass0Z0.A0A(1346384001, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-755082953, A03);
                return false;
            }
        }

        public final boolean BXb(long j, long j2) {
            int A03 = AnonymousClass0Z0.A03(140525129);
            try {
                Long valueOf = Long.valueOf(j2);
                C29624D2g.A02("id [%d]: preSeekTo %d", Long.valueOf(j), valueOf);
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(-1124838510, A03);
                    return false;
                }
                C29626D2j.A0E(A01, "preSeekTo %d", valueOf);
                C29626D2j.A0B(A01, A01.A0C.obtainMessage(26, valueOf));
                AnonymousClass0Z0.A0A(-572293656, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-961710138, A03);
                return false;
            }
        }

        public final void BXe() {
            int i;
            int A03 = AnonymousClass0Z0.A03(647689715);
            HeroService heroService = HeroService.this;
            C29657D3q d3q = new C29657D3q();
            d3q.A03 = true;
            d3q.A02 = true;
            d3q.A00 = heroService.A0S.A07;
            d3q.A01 = heroService.A0S.A08;
            D3G d3g = new D3G(d3q);
            String[] strArr = {"video/avc"};
            C29065CrI crI = C29065CrI.A02;
            synchronized (crI) {
                i = crI.A00;
            }
            if (i <= 0 && C29065CrI.A00(true, d3g)) {
                int i2 = 0;
                while (i2 < 1) {
                    try {
                        D70 A01 = C29734D6y.A01(strArr[i2]);
                        if (A01 != null) {
                            crI.A03(true, d3g, A01.A02, crI.A01(true, d3g, A01.A02));
                        }
                        i2++;
                    } catch (C29066CrJ | D42 unused) {
                    }
                }
                D70 A012 = C29734D6y.A01("audio/mp4a-latm");
                if (A012 != null) {
                    crI.A03(false, d3g, A012.A02, crI.A01(false, d3g, A012.A02));
                }
            }
            AnonymousClass0Z0.A0A(-898569812, A03);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        public final void BXh(VideoPrefetchRequest videoPrefetchRequest) {
            Integer num;
            D2U d2u;
            Context context;
            Integer num2;
            int A03 = AnonymousClass0Z0.A03(563566439);
            try {
                HeroService heroService = HeroService.this;
                VideoPrefetchRequest videoPrefetchRequest2 = videoPrefetchRequest;
                C29624D2g.A02("Prefetch %s\n\tBytes: %d", videoPrefetchRequest2.A09, Integer.valueOf(videoPrefetchRequest2.A02));
                VideoSource videoSource = videoPrefetchRequest2.A09;
                switch (videoSource.A06.ordinal()) {
                    case 0:
                        D2D d2d = heroService.A06;
                        D29 d29 = heroService.A0A;
                        try {
                            C29672D4g d4g = new C29672D4g();
                            VideoSource videoSource2 = videoPrefetchRequest2.A09;
                            d2u = D2J.A02(d4g, videoSource2.A03, videoSource2.A07);
                        } catch (D3N unused) {
                            if (d29 != null) {
                                C40431oe.A01("ServiceEventCallbackImpl", "skipping log because listener is null for event type: ", new Object[0]);
                            }
                            d2u = null;
                        }
                        if (d2u != null) {
                            String str = videoPrefetchRequest2.A09.A0D;
                            try {
                                throw new D41();
                            } catch (D41 e) {
                                if (d29 != null) {
                                    d29.A00(new C41991rK(str, C29634D2r.DRM.name(), C42071rS.CANT_INITIALIZE_DRM_WITH_MANIFEST.name(), AnonymousClass000.A0N("Device: ", Build.MODEL, "; Exception: ", e.getMessage())));
                                }
                                if (d2d.A09.A0R.A0q) {
                                    context = d2d.A03;
                                } else {
                                    context = null;
                                }
                                D49 A01 = D2J.A01(d2u, context, false, D7w.A00, (D8A) null);
                                if (A01 != null) {
                                    List list = A01.A01;
                                    if (list != null) {
                                        list.isEmpty();
                                    }
                                    D35 d35 = new D35();
                                    d35.A05(videoPrefetchRequest2.A09.A0J);
                                    D2V d2v = new D2V(d2d.A09.A0R, d2d.A04, videoPrefetchRequest2.A08, d35, false);
                                    D1Q d1q = new D1Q(d2d.A0A, d2v);
                                    if (!d2d.A09.A1X) {
                                        d2d.A04(videoPrefetchRequest2, d29, d2u, A01.A00, A01.A01, d1q, d35, d2v);
                                        break;
                                    } else {
                                        C40431oe.A01("UnifiedPrefetchManager", "video: %s queueing dash prefetch right away. Will select quality later", videoPrefetchRequest2.A09.A0D);
                                        String str2 = videoPrefetchRequest2.A09.A0D;
                                        if (videoPrefetchRequest2.A0A == Constants.A0N) {
                                            num2 = Constants.A0C;
                                        } else {
                                            num2 = Constants.ONE;
                                        }
                                        d2d.A05(d1q, (D19) null, d29, videoPrefetchRequest2, str2, (String) null, false, num2, false, false, false, d2u, (C29677D4l) null, A01, d35, d2v);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        int i = ((DynamicPlayerSettings) heroService.A0H.get()).A00;
                        VideoSource videoSource3 = videoPrefetchRequest2.A09;
                        long j = (long) CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
                        if (videoSource3 != null) {
                            long j2 = videoSource3.A00;
                            if (j2 > 0) {
                                j = Math.max(j2, j);
                            }
                        }
                        int i2 = (int) j;
                        C29624D2g.A02("dashLiveEdgeLatencyMs %d", Integer.valueOf(i2));
                        HeroDashLiveManagerImpl heroDashLiveManagerImpl = heroService.A05;
                        Handler A002 = HeroService.A00(heroService);
                        D2D d2d2 = heroService.A06;
                        D29 d292 = heroDashLiveManagerImpl.A01;
                        D21 d21 = heroDashLiveManagerImpl.A00;
                        C27226C3p c3p = d2d2.A05;
                        Map map = d2d2.A0C;
                        HeroPlayerSetting heroPlayerSetting = d2d2.A09;
                        D22 d22 = new D22(d21, map, heroPlayerSetting, A002, i, i2, d292, videoPrefetchRequest2, d2d2.A06);
                        C27226C3p.A00(c3p, new C27229C3s(d22, 1), heroPlayerSetting.A1P);
                        break;
                    case 2:
                        D2D d2d3 = heroService.A06;
                        D29 d293 = heroService.A0A;
                        String str3 = videoSource.A0D;
                        if (videoPrefetchRequest2.A0A == Constants.A0N) {
                            num = Constants.A0C;
                        } else {
                            num = Constants.ONE;
                        }
                        D29 d294 = d293;
                        d2d3.A05((C29605D1k) null, (D19) null, d294, videoPrefetchRequest2, str3, (String) null, false, num, false, false, false, (D2U) null, (C29677D4l) null, (D49) null, (D35) null, (D2V) null);
                        break;
                    case 4:
                        break;
                    default:
                        throw new IllegalArgumentException("Illegal video type");
                }
            } catch (RuntimeException e2) {
                A00(e2);
            }
            AnonymousClass0Z0.A0A(1616090112, A03);
        }

        public final boolean BXu(long j, VideoPlayRequest videoPlayRequest) {
            int A03 = AnonymousClass0Z0.A03(444716965);
            try {
                C29624D2g.A02("id [%d]: prepare, %s", Long.valueOf(j), videoPlayRequest.A05);
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(-1603130616, A03);
                    return false;
                }
                A01.A0O(videoPlayRequest, (DynamicPlayerSettings) HeroService.this.A0H.get());
                AnonymousClass0Z0.A0A(-1077448133, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-686033007, A03);
                return false;
            }
        }

        public final boolean BXv(long j, VideoPlayRequest videoPlayRequest, boolean z, float f, boolean z2, String str) {
            int A03 = AnonymousClass0Z0.A03(-2012069053);
            try {
                Long valueOf = Long.valueOf(j);
                C29624D2g.A02("id [%d]: prepareAndMayPlay, shouldPlay=%b, videoSource=%s", valueOf, Boolean.valueOf(z), videoPlayRequest.A05);
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(2057684028, A03);
                    return false;
                }
                DynamicPlayerSettings dynamicPlayerSettings = (DynamicPlayerSettings) HeroService.this.A0H.get();
                Map map = (Map) HeroService.this.A0G.get();
                if (map != null) {
                    C29624D2g.A02("id [%d]: prepareAndMayPlay, contextualDps", valueOf);
                    if (map.containsKey(videoPlayRequest.A05.A08)) {
                        dynamicPlayerSettings = (DynamicPlayerSettings) map.get(videoPlayRequest.A05.A08);
                    } else {
                        dynamicPlayerSettings = (DynamicPlayerSettings) map.get("unknown");
                    }
                }
                A01.A0K(f);
                A01.A0O(videoPlayRequest, dynamicPlayerSettings);
                C29626D2j.A0E(A01, "Set Looping", new Object[0]);
                C29626D2j.A0B(A01, A01.A0C.obtainMessage(18, Boolean.valueOf(z2)));
                if (z) {
                    A01.A0L(-1, str);
                } else {
                    C29626D2j.A0E(A01, "Pause: finishPlayback=%b", false);
                    C29626D2j.A0B(A01, A01.A0C.obtainMessage(3, false));
                }
                AnonymousClass0Z0.A0A(-1785407983, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(2047831253, A03);
                return false;
            }
        }

        public final void BaF(long j, boolean z) {
            int A03 = AnonymousClass0Z0.A03(255527128);
            try {
                C29624D2g.A02("id [%d]: release", Long.valueOf(j));
                HeroService.this.A0Q.A03(j, z);
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(-1476396227, A03);
        }

        public final boolean BaW(long j, ResultReceiver resultReceiver) {
            int A03 = AnonymousClass0Z0.A03(-1844924806);
            try {
                C29624D2g.A02("id [%d]: releaseSurface", Long.valueOf(j));
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(-1810796814, A03);
                    return false;
                }
                C29626D2j.A0E(A01, "Release surface", new Object[0]);
                C29626D2j.A0B(A01, A01.A0C.obtainMessage(7, resultReceiver));
                AnonymousClass0Z0.A0A(1865370990, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-1701974437, A03);
                return false;
            }
        }

        public final boolean Bda(long j) {
            int A03 = AnonymousClass0Z0.A03(126026691);
            try {
                C29624D2g.A02("id [%d]: reset", Long.valueOf(j));
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(-2028698874, A03);
                    return false;
                }
                C29626D2j.A0E(A01, "Reset", new Object[0]);
                C29626D2j.A0B(A01, A01.A0C.obtainMessage(11));
                AnonymousClass0Z0.A0A(398514275, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-1212834369, A03);
                return false;
            }
        }

        public final long Be3(long j) {
            long j2;
            int A03 = AnonymousClass0Z0.A03(749862879);
            try {
                C29624D2g.A02("id [%d]: retrieveCurrentPosition", Long.valueOf(j));
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(1164149976, A03);
                    return 0;
                }
                C29626D2j.A0E(A01, "Retrieve service player current position", new Object[0]);
                if (A01.A0t == null) {
                    j2 = 0;
                } else {
                    Integer num = Constants.A0C;
                    Integer num2 = A01.A0N;
                    if (num == num2 || Constants.A0u == num2) {
                        j2 = A01.A0t.A07.AU1();
                    } else {
                        j2 = A01.A0t.A01();
                    }
                }
                AnonymousClass0Z0.A0A(2001998508, A03);
                return j2;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-967811, A03);
                return 0;
            }
        }

        public final void Be5(long j) {
            int A03 = AnonymousClass0Z0.A03(-1372840576);
            try {
                C29624D2g.A02("id [%d]: retry playback", Long.valueOf(j));
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 != null) {
                    C29626D2j.A0E(A01, "retry", new Object[0]);
                    C29626D2j.A0B(A01, A01.A0C.obtainMessage(28));
                }
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(-758178102, A03);
        }

        public final boolean Bew(long j, long j2, long j3, boolean z) {
            long j4;
            int A03 = AnonymousClass0Z0.A03(-283243898);
            try {
                Long valueOf = Long.valueOf(j2);
                C29624D2g.A02("id [%d]: seekTo %d", Long.valueOf(j), valueOf);
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(-656992065, A03);
                    return false;
                }
                C29626D2j.A0E(A01, "Seek to %d", valueOf);
                Handler handler = A01.A0C;
                long[] jArr = new long[3];
                jArr[0] = j2;
                jArr[1] = j3;
                if (z) {
                    j4 = 1;
                } else {
                    j4 = 0;
                }
                jArr[2] = j4;
                C29626D2j.A0B(A01, handler.obtainMessage(4, jArr));
                AnonymousClass0Z0.A0A(-1086575157, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-2063939235, A03);
                return false;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
            if (r10 != 2) goto L_0x0040;
         */
        public final boolean Bg5(long j, int i) {
            int i2;
            int A03 = AnonymousClass0Z0.A03(-649936865);
            try {
                Integer valueOf = Integer.valueOf(i);
                C29624D2g.A02("id [%d]: setAudioUsage %d", Long.valueOf(j), valueOf);
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(-1494856551, A03);
                    return false;
                }
                C29626D2j.A0E(A01, "Set audioUsage: %d", valueOf);
                if (i != 0) {
                    if (i != 1) {
                        i2 = 2;
                    }
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                C29626D2j.A0B(A01, A01.A0C.obtainMessage(23, Integer.valueOf(i2)));
                AnonymousClass0Z0.A0A(1231063864, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(558808137, A03);
                return false;
            }
        }

        public final void Bgk(ContextualConfigListener contextualConfigListener) {
            int A03 = AnonymousClass0Z0.A03(406629072);
            try {
                HeroService.this.A0F.set(contextualConfigListener);
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(692534035, A03);
        }

        public final void Bgy(long j, String str) {
            int A03 = AnonymousClass0Z0.A03(-1601630729);
            try {
                C29624D2g.A02("id [%d]: setCustomQuality: %s", Long.valueOf(j), str);
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 != null) {
                    C29626D2j.A0B(A01, A01.A0C.obtainMessage(25, str));
                }
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(-2045181782, A03);
        }

        public final void BhA(long j, DeviceOrientationFrame deviceOrientationFrame) {
            int A03 = AnonymousClass0Z0.A03(-273250176);
            try {
                C29624D2g.A02("id [%d]: setDeviceOrientationFrame", Long.valueOf(j));
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 != null) {
                    C29626D2j.A0B(A01, A01.A0C.obtainMessage(13, deviceOrientationFrame));
                }
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(-653071346, A03);
        }

        public final void BhC(DynamicPlayerSettings dynamicPlayerSettings) {
            int A03 = AnonymousClass0Z0.A03(-1096742076);
            try {
                HeroService.this.A0H.set(dynamicPlayerSettings);
                HeroService.this.A0Q.A02();
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(-19497253, A03);
        }

        public final void BhD(Map map) {
            int A03 = AnonymousClass0Z0.A03(-1890086169);
            try {
                HeroService.this.A0G.set(map);
                HeroService.this.A0Q.A02();
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(-1287811498, A03);
        }

        public final boolean Bif(long j, boolean z) {
            int A03 = AnonymousClass0Z0.A03(10753974);
            try {
                Object[] objArr = new Object[2];
                objArr[0] = Long.valueOf(j);
                int i = 0;
                if (z) {
                    i = 1;
                }
                objArr[1] = Integer.valueOf(i);
                C29624D2g.A02("id [%d]: liveLatencyMode %d", objArr);
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(780511269, A03);
                    return false;
                }
                C29626D2j.A0E(A01, "Set rewindableVideoMode: %d", Integer.valueOf(z ? 1 : 0));
                C29626D2j.A0B(A01, A01.A0C.obtainMessage(22, Boolean.valueOf(z)));
                AnonymousClass0Z0.A0A(-56502001, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(1361306257, A03);
                return false;
            }
        }

        public final boolean Bil(long j, boolean z) {
            int A03 = AnonymousClass0Z0.A03(797697777);
            try {
                Boolean valueOf = Boolean.valueOf(z);
                C29624D2g.A02("id [%d]: setLooping %s", Long.valueOf(j), valueOf);
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(-969852238, A03);
                    return false;
                }
                C29626D2j.A0E(A01, "Set Looping", new Object[0]);
                C29626D2j.A0B(A01, A01.A0C.obtainMessage(18, valueOf));
                AnonymousClass0Z0.A0A(-1643275468, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-1611602808, A03);
                return false;
            }
        }

        public final boolean BjX(long j, float f) {
            int A03 = AnonymousClass0Z0.A03(95274673);
            try {
                C29624D2g.A02("id [%d]: setPlaybackSpeed", Long.valueOf(j));
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(127671965, A03);
                    return false;
                }
                C29626D2j.A0E(A01, "Set playback speed", new Object[0]);
                C29626D2j.A0B(A01, A01.A0C.obtainMessage(27, Float.valueOf(f)));
                AnonymousClass0Z0.A0A(977080179, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-428997831, A03);
                return false;
            }
        }

        public final void Bju(String str) {
            int A03 = AnonymousClass0Z0.A03(1920143665);
            try {
                C29624D2g.A02("setProxyAddress", new Object[0]);
                C29280Cv6.A00(str, HeroService.this.A0S, HeroService.this.A0H);
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(-1523804532, A03);
        }

        public final boolean Bk7(long j, long j2) {
            int A03 = AnonymousClass0Z0.A03(-762755600);
            try {
                Long valueOf = Long.valueOf(j2);
                C29624D2g.A02("id [%d]: setRelativePosition %d", Long.valueOf(j), valueOf);
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(832142365, A03);
                    return false;
                }
                C29626D2j.A0E(A01, "Set relative position to %d", valueOf);
                C29626D2j.A0B(A01, A01.A0C.obtainMessage(16, valueOf));
                AnonymousClass0Z0.A0A(-1500116311, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-129723360, A03);
                return false;
            }
        }

        public final void Bkd(long j, SpatialAudioFocusParams spatialAudioFocusParams) {
            int A03 = AnonymousClass0Z0.A03(-597295393);
            try {
                C29624D2g.A02("id [%d]: setSpatialAudioFocus", Long.valueOf(j));
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 != null) {
                    C29626D2j.A0B(A01, A01.A0C.obtainMessage(14, spatialAudioFocusParams));
                }
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(559345222, A03);
        }

        public final boolean Bkx(long j, Surface surface) {
            int A03 = AnonymousClass0Z0.A03(1329329420);
            try {
                C29624D2g.A02("id [%d]: setSurface: %s", Long.valueOf(j), surface);
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(1023065899, A03);
                    return false;
                }
                A01.A0M(surface);
                AnonymousClass0Z0.A0A(-454218854, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(851893321, A03);
                return false;
            }
        }

        public final void BlE(byte[] bArr, int i) {
            AnonymousClass0Z0.A0A(322779781, AnonymousClass0Z0.A03(10548894));
        }

        public final void Blk(VideoLicenseListener videoLicenseListener) {
            int A03 = AnonymousClass0Z0.A03(-982195898);
            try {
                HeroService.this.A0K.set(videoLicenseListener);
            } catch (RuntimeException e) {
                A00(e);
            }
            AnonymousClass0Z0.A0A(1307689284, A03);
        }

        public final boolean Blu(long j, float f) {
            int A03 = AnonymousClass0Z0.A03(1710337360);
            try {
                C29624D2g.A02("id [%d]: setVolume", Long.valueOf(j));
                C29626D2j A01 = HeroService.this.A0Q.A01(j);
                if (A01 == null) {
                    AnonymousClass0Z0.A0A(-984806781, A03);
                    return false;
                }
                A01.A0K(f);
                AnonymousClass0Z0.A0A(1446048015, A03);
                return true;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(540514187, A03);
                return false;
            }
        }

        public final void Bm0(ZeroVideoRewriteConfig zeroVideoRewriteConfig) {
            AnonymousClass0Z0.A0A(-1199914300, AnonymousClass0Z0.A03(415805517));
        }

        public final void Bpz() {
            int A03 = AnonymousClass0Z0.A03(-1874603379);
            HeroService.this.A0M.get();
            AnonymousClass0Z0.A0A(-1933654005, A03);
        }

        public final void BqU() {
            int A03 = AnonymousClass0Z0.A03(-876222648);
            HeroService.this.A0M.get();
            AnonymousClass0Z0.A0A(1203925956, A03);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
            if (r1 == null) goto L_0x0091;
         */
        public final long Btk(long j, VideoPlayRequest videoPlayRequest, HeroServicePlayerListener heroServicePlayerListener) {
            String str;
            boolean z;
            int A03 = AnonymousClass0Z0.A03(-718720809);
            try {
                D2I d2i = HeroService.this.A0Q;
                HeroService heroService = HeroService.this;
                Handler A002 = HeroService.A00(heroService);
                HeroService heroService2 = HeroService.this;
                AtomicReference atomicReference = heroService2.A0I;
                D1L d1l = heroService2.A02;
                Map map = heroService2.A0D;
                AtomicBoolean atomicBoolean = heroService2.A0E;
                D4G d4g = heroService2.A0R;
                long j2 = j;
                VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
                VideoPlayRequest videoPlayRequest3 = videoPlayRequest2;
                synchronized (d2i) {
                    C29626D2j d2j = null;
                    if (videoPlayRequest == null) {
                        str = null;
                    } else {
                        str = videoPlayRequest2.A05.A0D;
                    }
                    C29624D2g.A02("id [%d]: verifyOrCreatePlayer, videoId: %s", Long.valueOf(j2), str);
                    if (str != null) {
                        d2j = (C29626D2j) d2i.A01.remove(str);
                    }
                    HeroServicePlayerListener heroServicePlayerListener2 = heroServicePlayerListener;
                    if (d2j != null) {
                        d2i.A03(j2, true);
                        d2j.A0N(heroServicePlayerListener2);
                        d2i.A00.put(Long.valueOf(d2j.A0e), d2j);
                        C29624D2g.A02("id [%d]: usingWarmUpPlayer, videoId: %s", Long.valueOf(d2j.A0e), str);
                        j2 = d2j.A0e;
                    } else {
                        if (j > 0 && d2i.A01(j2) != null) {
                            C29626D2j A01 = d2i.A01(j2);
                            if (A01 != null) {
                                C29627D2k d2k = A01.A0t;
                                z = false;
                            }
                            z = true;
                            if (!z) {
                                d2i.A01(j2).A0N(heroServicePlayerListener2);
                            }
                        }
                        if (j > 0) {
                            d2i.A03(j2, true);
                        }
                        C29626D2j A003 = D2I.A00(d2i, heroServicePlayerListener2, heroService, A002, atomicReference, d1l, map, videoPlayRequest3, atomicBoolean, d4g);
                        d2i.A00.put(Long.valueOf(A003.A0e), A003);
                        j2 = A003.A0e;
                    }
                }
                AnonymousClass0Z0.A0A(167362026, A03);
                return j2;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(-2042531594, A03);
                return 0;
            }
        }

        public final long Bu9(VideoPlayRequest videoPlayRequest, Surface surface, float f) {
            int i;
            int A03 = AnonymousClass0Z0.A03(-648033228);
            try {
                C29624D2g.A02("warmupPlayerAndReturn, %s", videoPlayRequest.A05.A0D);
                D6U.A01(videoPlayRequest.A05.A0D);
                if (HeroService.this.A0Q.A04(videoPlayRequest.A05.A0D)) {
                    C29624D2g.A02("Found a player in pool, skip warmup", new Object[0]);
                    i = -2096488881;
                } else {
                    long Btk = Btk(0, videoPlayRequest, new WarmUpPlayerListener());
                    C29626D2j A01 = HeroService.this.A0Q.A01(Btk);
                    if (A01 != null) {
                        A01.A0K(f);
                        A01.A0O(videoPlayRequest, (DynamicPlayerSettings) HeroService.this.A0H.get());
                        if (surface != null) {
                            A01.A0M(surface);
                        }
                        AnonymousClass0Z0.A0A(212722332, A03);
                        return Btk;
                    }
                    i = -2012657955;
                }
                AnonymousClass0Z0.A0A(i, A03);
                return 0;
            } catch (RuntimeException e) {
                A00(e);
                AnonymousClass0Z0.A0A(741122424, A03);
                return 0;
            }
        }
    };
    public final AtomicBoolean A0P = new AtomicBoolean(false);
    public volatile D2I A0Q;
    public volatile D4G A0R;
    public volatile HeroPlayerSetting A0S = HeroPlayerSetting.A1t;

    public final IBinder onBind(Intent intent) {
        HashMap hashMap;
        HeroPlayerSetting heroPlayerSetting;
        ResultReceiver resultReceiver;
        HeroPlayerSetting heroPlayerSetting2;
        Intent intent2 = intent;
        try {
            hashMap = (HashMap) intent2.getSerializableExtra("ExperimentationSetting");
        } catch (RuntimeException e) {
            C40431oe.A03("HeroService", "Exception when getting configMap serializable. Fallback to empty map.\n %s", e);
            hashMap = new HashMap();
        }
        try {
            heroPlayerSetting = (HeroPlayerSetting) intent2.getSerializableExtra("HeroPlayerSetting");
        } catch (RuntimeException e2) {
            C40431oe.A03("HeroService", "Exception when getting HeroPlayerSetting serializable. Fallback to default value.\n %s", e2);
            heroPlayerSetting = HeroPlayerSetting.A1t;
        }
        D48 d48 = null;
        try {
            resultReceiver = (ResultReceiver) intent2.getParcelableExtra("ServiceEvent");
        } catch (BadParcelableException e3) {
            C40431oe.A03("HeroService", "Failed to get ResultReceiver parcelable: %s", e3);
            resultReceiver = null;
        }
        try {
            C200008hB.A01("initHeroService");
            if (hashMap != null) {
                this.A0D.putAll(hashMap);
            }
            if (heroPlayerSetting == null) {
                C40431oe.A03("HeroService", "heroPlayerSetting is null. fallback to default HeroPlayerSetting", new Object[0]);
            }
            if (heroPlayerSetting != null) {
                heroPlayerSetting2 = heroPlayerSetting;
            } else {
                heroPlayerSetting2 = HeroPlayerSetting.A1t;
            }
            this.A0S = heroPlayerSetting2;
            if (heroPlayerSetting != null) {
                this.A0R = new D4G(heroPlayerSetting.A0X);
            }
            this.A0Q = new D2I(this.A0S, this.A0H, this.A0G, this.A0J, this.A0B, new D4F(this.A0K));
            C40431oe.A00 = this.A0S.A0t;
            this.A0J.set(new D2M(this.A0S, this.A0B, this.A09));
            this.A0I.set(new C29662D3v(resultReceiver, this.A0S));
            if (this.A0S.A0t) {
                C29624D2g.A02("Experimentation Settings:", new Object[0]);
                for (Map.Entry entry : this.A0D.entrySet()) {
                    C29624D2g.A02("\tkey: %s, value: %s", entry.getKey(), entry.getValue());
                }
            }
            this.A01 = new C25947Bcz(getApplicationContext());
            synchronized (C25945Bcx.class) {
                C25945Bcx.A03 = new C25945Bcx(BME.A00);
            }
            AnonymousClass0ZA.A0E(A00(this), new C25946Bcy(this), 837386258);
            if (this.A0S.A0w) {
                C29624D2g.A02("LocalSocketProxy is enabled, address: %s", this.A0S.A0d);
                C29280Cv6.A00(this.A0S.A0d, this.A0S, this.A0H);
            }
            if (this.A02 == null) {
                C39901nk r4 = this.A0S.A0T;
                String str = r4.A07;
                if (str == null) {
                    str = getFilesDir().toString();
                }
                C29608D1n d1n = new C29608D1n(str, r4.A03, r4.A0C);
                this.A03 = d1n;
                D1L d1l = new D1L(this, d1n, this.A0D, this.A0S, (D2M) this.A0J.get(), new C29596D1b(this), A00(this), this.A0Q);
                this.A02 = d1l;
                C25947Bcz bcz = this.A01;
                Map map = this.A0D;
                HeroPlayerSetting heroPlayerSetting3 = this.A0S;
                D4L d4l = this.A08;
                C29603D1i d1i = this.A0B;
                if (this.A0S.A12) {
                    d48 = new D48(this);
                }
                this.A06 = new D2D(d1l, bcz, map, heroPlayerSetting3, d4l, d1i, d48, this, new D4F(this.A0K));
                this.A05 = new HeroDashLiveManagerImpl(this, this.A0S, this.A08, this.A0I, this.A01, this.A0B);
                HeroFbvpLiveManager heroFbvpLiveManager = new HeroFbvpLiveManager(this, this.A0S);
                this.A04 = heroFbvpLiveManager;
                heroFbvpLiveManager.createFbvpPrefetchObjectMemoryCache();
                C40611ow.A00(this);
                if (this.A0S.A15) {
                    HandlerThread handlerThread = new HandlerThread("HeroWarmupThread");
                    handlerThread.start();
                    Looper looper = handlerThread.getLooper();
                    AnonymousClass0ZA.A0E(new Handler(looper), new D3J(this, looper), 1448824904);
                }
            }
            C200008hB.A00();
            return this.A0O;
        } catch (Throwable th) {
            C200008hB.A00();
            throw th;
        }
    }

    public final boolean onUnbind(Intent intent) {
        C29624D2g.A02("HeroService unbind", new Object[0]);
        return super.onUnbind(intent);
    }

    public static Handler A00(HeroService heroService) {
        if (heroService.A07 == null) {
            synchronized (heroService.A0C) {
                if (heroService.A07 == null) {
                    if (heroService.A00 == null) {
                        HandlerThread handlerThread = new HandlerThread("HeroPlayerServiceBackgroundHandlerThread", 10);
                        heroService.A00 = handlerThread;
                        handlerThread.start();
                    }
                    heroService.A07 = new Handler(heroService.A00.getLooper());
                }
            }
        }
        return heroService.A07;
    }

    public final void onCreate() {
        int A042 = AnonymousClass0Z0.A04(-1597937731);
        super.onCreate();
        C29624D2g.A02("HeroService creating", new Object[0]);
        if (BreakpadManager.isActive()) {
            long minidumpFlags = BreakpadManager.getMinidumpFlags();
            if ((minidumpFlags & 8) == 0) {
                BreakpadManager.setMinidumpFlags(minidumpFlags | 8);
            }
        }
        AnonymousClass0Z0.A0B(-992673908, A042);
    }

    public final void onDestroy() {
        int A042 = AnonymousClass0Z0.A04(765784710);
        super.onDestroy();
        C29624D2g.A02("HeroService destroy", new Object[0]);
        AnonymousClass0ZA.A0E(A00(this), new D2R(this, this.A0Q), 964957385);
        AnonymousClass0Z0.A0B(-279322306, A042);
    }
}
