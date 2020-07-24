package p000X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.LruCache;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueCompleteEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueExitEvent;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Map;

/* renamed from: X.D22 */
public final class D22 implements C27228C3r {
    public final VideoPrefetchRequest A00;
    public final int A01;
    public final int A02;
    public final Handler A03;
    public final D4L A04;
    public final D21 A05;
    public final D29 A06;
    public final HeroPlayerSetting A07;
    public final Map A08;

    public final void cancel() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        if (r2.A0L == p000X.Constants.A0Y) goto L_0x0085;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    public final void ACO() {
        int i;
        C29615D1v d1v;
        boolean z;
        D29 d29;
        if (this.A07.A1H && (d29 = this.A06) != null) {
            d29.A00(new PrefetchTaskQueueExitEvent(this.A00));
        }
        D21 d21 = this.A05;
        VideoPrefetchRequest videoPrefetchRequest = this.A00;
        VideoSource videoSource = videoPrefetchRequest.A09;
        Uri uri = videoSource.A03;
        Handler handler = this.A03;
        String str = videoSource.A0D;
        String str2 = videoSource.A08;
        String str3 = videoSource.A09;
        C29262Cuo cuo = new C29262Cuo(str, str2, str3, videoPrefetchRequest.A07, videoSource.A05);
        Map map = this.A08;
        HeroPlayerSetting heroPlayerSetting = this.A07;
        D29 d292 = this.A06;
        String str4 = videoSource.A07;
        int i2 = this.A02;
        int i3 = this.A01;
        D4L d4l = this.A04;
        synchronized (d21) {
            d21.A00(map, heroPlayerSetting);
            int i4 = 0;
            if (heroPlayerSetting.A1I) {
                i4 = 1;
            }
            LruCache lruCache = (LruCache) d21.A04.get();
            String str5 = cuo.A04;
            if (!d21.A00) {
                str5 = uri.toString();
            }
            C29614D1u d1u = (C29614D1u) lruCache.get(str5);
            if (d1u != null) {
                if (!(d1u.A0L == Constants.ZERO || d1u.A0L == Constants.ONE)) {
                    z = false;
                }
                z = true;
                if (z) {
                    C40431oe.A01("DashLiveChunkSourceCache", "Video has been prefetched or currently prefetching %s", cuo.A04);
                }
            } else {
                try {
                    D2U A022 = D2J.A02(new C29672D4g(), uri, str4);
                    Context context = d21.A01;
                    Handler handler2 = handler;
                    C29262Cuo cuo2 = cuo;
                    Uri uri2 = uri;
                    Context context2 = context;
                    d1v = new C29615D1v(uri2, context2, handler2, cuo2, 0, "DashLivePrefetchTask", true, map, heroPlayerSetting, d21.A03, d292, A022, true, d21.A02, i2, false, i3, i4, d4l);
                } catch (D3N unused) {
                    if (d292 != null) {
                        C40431oe.A01("ServiceEventCallbackImpl", "skipping log because listener is null for event type: ", new Object[0]);
                    }
                    d1v = null;
                }
                if (d1v != null) {
                    LruCache lruCache2 = (LruCache) d21.A04.get();
                    String str6 = cuo.A04;
                    if (!d21.A00) {
                        str6 = uri.toString();
                    }
                    lruCache2.put(str6, d1v);
                    d1u = d1v;
                }
            }
            C40431oe.A01("DashLiveChunkSourceCache", "Start loading dash live manifest: %s", cuo.A04);
            if (map.containsKey("dash.live_prefetch_max_retries")) {
                i = Integer.parseInt((String) map.get("dash.live_prefetch_max_retries"));
            } else {
                i = 0;
            }
            if (i > 0) {
                d1u.A0I.set(i);
            }
            d1u.A03(true);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D22) || !toString().equals(obj.toString())) {
            return false;
        }
        return true;
    }

    public final void onComplete() {
        D29 d29;
        if (this.A07.A1H && (d29 = this.A06) != null) {
            d29.A00(new PrefetchTaskQueueCompleteEvent(this.A00));
        }
    }

    public final String toString() {
        return this.A00.A09.A03.toString();
    }

    public D22(D21 d21, Map map, HeroPlayerSetting heroPlayerSetting, Handler handler, int i, int i2, D29 d29, VideoPrefetchRequest videoPrefetchRequest, D4L d4l) {
        this.A05 = d21;
        this.A08 = map;
        this.A07 = heroPlayerSetting;
        this.A03 = handler;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = d29;
        this.A00 = videoPrefetchRequest;
        this.A04 = d4l;
    }

    public final Integer ASn() {
        return Constants.ONE;
    }

    public final int hashCode() {
        return toString().hashCode();
    }
}
