package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.LruCache;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.service.HeroServicePlayerCallback;
import com.facebook.video.heroplayer.service.HeroServicePlayerDummyListener;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.D2I */
public final class D2I {
    public final LruCache A00;
    public final LruCache A01;
    public final D4F A02;
    public final HeroPlayerSetting A03;
    public final C29603D1i A04;
    public final AtomicLong A05 = new AtomicLong(SystemClock.elapsedRealtime());
    public final AtomicReference A06;
    public final AtomicReference A07;
    public final AtomicReference A08;

    public final void A03(long j, boolean z) {
        Long valueOf = Long.valueOf(j);
        C29624D2g.A02("id [%d]: Release player", valueOf);
        if (z && j > 0 && A01(j) != null) {
            C29626D2j A012 = A01(j);
            HeroServicePlayerDummyListener heroServicePlayerDummyListener = new HeroServicePlayerDummyListener();
            HeroServicePlayerCallback heroServicePlayerCallback = A012.A0h;
            int A032 = AnonymousClass0Z0.A03(-2139193550);
            heroServicePlayerCallback.A01 = heroServicePlayerDummyListener;
            AnonymousClass0Z0.A0A(2137508605, A032);
        }
        this.A00.remove(valueOf);
    }

    public final synchronized boolean A04(String str) {
        boolean z;
        Iterator it = this.A00.snapshot().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            VideoPlayRequest videoPlayRequest = ((C29626D2j) it.next()).A0s;
            if (videoPlayRequest != null && str.equals(videoPlayRequest.A05.A0D)) {
                z = true;
                break;
            }
        }
        return z;
    }

    public static C29626D2j A00(D2I d2i, HeroServicePlayerListener heroServicePlayerListener, Context context, Handler handler, AtomicReference atomicReference, D1L d1l, Map map, VideoPlayRequest videoPlayRequest, AtomicBoolean atomicBoolean, D4G d4g) {
        C29627D2k d2k;
        D2I d2i2 = d2i;
        long addAndGet = d2i2.A05.addAndGet(1);
        Long valueOf = Long.valueOf(addAndGet);
        C29624D2g.A02("id [%d]: Create player", valueOf);
        for (Map.Entry entry : d2i2.A00.snapshot().entrySet()) {
            if (((C29626D2j) entry.getValue()).A0w) {
                d2i2.A00.get(entry.getKey());
            }
        }
        C29624D2g.A02("id [%d]: refreshed LRUCached for playing players", valueOf);
        HeroPlayerSetting heroPlayerSetting = d2i2.A03;
        AtomicReference atomicReference2 = d2i2.A07;
        AtomicReference atomicReference3 = d2i2.A06;
        AtomicReference atomicReference4 = d2i2.A08;
        C29603D1i d1i = d2i2.A04;
        D4F d4f = d2i2.A02;
        HandlerThread handlerThread = null;
        List list = D3X.A01;
        synchronized (list) {
            if (!list.isEmpty()) {
                C29654D3n d3n = (C29654D3n) list.remove(0);
                d2k = d3n.A01;
                handlerThread = d3n.A00;
            } else {
                d2k = null;
            }
        }
        if (handlerThread == null) {
            C29624D2g.A02("id [%d]: creating handlerThread", valueOf);
            handlerThread = new HandlerThread("HeroServicePlayer");
            C29624D2g.A02("id [%d]: created handlerThread", valueOf);
            handlerThread.start();
        }
        Context context2 = context;
        HeroServicePlayerListener heroServicePlayerListener2 = heroServicePlayerListener;
        C29603D1i d1i2 = d1i;
        HandlerThread handlerThread2 = handlerThread;
        C29627D2k d2k2 = d2k;
        AtomicReference atomicReference5 = atomicReference4;
        AtomicReference atomicReference6 = atomicReference3;
        AtomicReference atomicReference7 = atomicReference2;
        HeroPlayerSetting heroPlayerSetting2 = heroPlayerSetting;
        C29626D2j d2j = new C29626D2j(addAndGet, heroServicePlayerListener2, heroPlayerSetting2, atomicReference7, atomicReference6, atomicReference5, handlerThread2, d2k2, d1i2, D3X.A00.Ai3(), context2, handler, atomicReference, d1l, map, videoPlayRequest, d4f, atomicBoolean, d4g);
        C29624D2g.A02("id [%d]: created HeroServicePlayer", valueOf);
        return d2j;
    }

    public final C29626D2j A01(long j) {
        return (C29626D2j) this.A00.get(Long.valueOf(j));
    }

    public final void A02() {
        for (C29626D2j A0J : this.A00.snapshot().values()) {
            A0J.A0J();
        }
        for (C29626D2j A0J2 : this.A01.snapshot().values()) {
            A0J2.A0J();
        }
    }

    public D2I(HeroPlayerSetting heroPlayerSetting, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, C29603D1i d1i, D4F d4f) {
        this.A03 = heroPlayerSetting;
        this.A07 = atomicReference;
        this.A06 = atomicReference2;
        this.A04 = d1i;
        this.A08 = atomicReference3;
        this.A02 = d4f;
        this.A00 = new D3C(this, heroPlayerSetting.A0A);
        this.A01 = new D3Y(this, this.A03.A0B);
    }
}
