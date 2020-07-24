package p000X;

import android.content.Context;
import android.util.LruCache;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.D21 */
public final class D21 {
    public boolean A00;
    public final Context A01;
    public final D23 A02;
    public final C29618D1y A03;
    public final AtomicReference A04 = new AtomicReference(new LruCache(10));

    public D21(Context context, C40001nu r9, C25947Bcz bcz, HeroPlayerSetting heroPlayerSetting, D4F d4f, C29603D1i d1i) {
        this.A01 = context;
        D23 d23 = new D23();
        this.A02 = d23;
        this.A03 = new C29618D1y(context, d23, r9, bcz, d4f, d1i);
    }

    public final void A00(Map map, HeroPlayerSetting heroPlayerSetting) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        D23 d23 = this.A02;
        if (map.containsKey("dash.live_max_dash_segments_per_video_buffered")) {
            i = Integer.parseInt((String) map.get("dash.live_max_dash_segments_per_video_buffered"));
        } else {
            i = 12;
        }
        int i7 = i << 1;
        int i8 = d23.A00.get();
        if (i7 > 0 && d23.A00.compareAndSet(i8, i7)) {
            C40431oe.A01("DashChunkMemoryCache", "Max buffer size is updated: old=%d, new=%d", Integer.valueOf(i8), Integer.valueOf(i7));
        }
        synchronized (d23.A01) {
            try {
                C40431oe.A06(d23.A01, "DashChunkMemoryCache");
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        C29618D1y d1y = this.A03;
        boolean z = false;
        if (map.containsKey("prefetch.reload_manifest_on_segment_not_found") && Integer.parseInt((String) map.get("prefetch.reload_manifest_on_segment_not_found")) != 0) {
            z = true;
        }
        d1y.A08 = z;
        if (map.containsKey("prefetch.http_retry")) {
            i2 = Integer.parseInt((String) map.get("prefetch.http_retry"));
        } else {
            i2 = 0;
        }
        if (i2 <= 0) {
            i3 = 3;
        } else if (map.containsKey("prefetch.http_retry")) {
            i3 = Integer.parseInt((String) map.get("prefetch.http_retry"));
        } else {
            i3 = 0;
        }
        d1y.A00 = i3;
        boolean z2 = false;
        if (map.containsKey("prefetch.enable_vps_http_transfer_enable_end_event_debug_info") && Integer.parseInt((String) map.get("prefetch.enable_vps_http_transfer_enable_end_event_debug_info")) != 0) {
            z2 = true;
        }
        d1y.A06 = z2;
        boolean z3 = false;
        if (map.containsKey("prefetch.prevent_reprefetch_cached_segments") && Integer.parseInt((String) map.get("prefetch.prevent_reprefetch_cached_segments")) != 0) {
            z3 = true;
        }
        d1y.A07 = z3;
        d1y.A05 = heroPlayerSetting.A0k;
        d1y.A03 = "ExoService";
        synchronized (this) {
            C40431oe.A06(this.A04, "DashLiveChunkSourceCache");
        }
        if (map.containsKey("dash.live_max_dash_segments_per_video_buffered")) {
            i4 = Integer.parseInt((String) map.get("dash.live_max_dash_segments_per_video_buffered"));
        } else {
            i4 = 12;
        }
        int i9 = i4 << 1;
        int i10 = i9 * 10;
        if (map.containsKey("prefetch.http_connection_timeout_ms")) {
            i5 = Integer.parseInt((String) map.get("prefetch.http_connection_timeout_ms"));
        } else {
            i5 = 0;
        }
        if (map.containsKey("prefetch.http_read_timeout_ms")) {
            i6 = Integer.parseInt((String) map.get("prefetch.http_read_timeout_ms"));
        } else {
            i6 = 0;
        }
        if (map.containsKey("user_auth_token")) {
            str = (String) map.get("user_auth_token");
        } else {
            str = null;
        }
        C40431oe.A01("PrefetchableDataSource", "updateParam: totalSegments=%d, segmentsPerVideo=%d, connectionTimeoutMs=%d, readTimeoutMs=%d", Integer.valueOf(i10), Integer.valueOf(i9), Integer.valueOf(i5), Integer.valueOf(i6));
        D24 d24 = D1J.A0C;
        synchronized (d24) {
            try {
                D24 d242 = D1J.A0C;
                if (i10 <= 0) {
                    i10 = 120;
                }
                if (i9 <= 0) {
                    i9 = 12;
                }
                synchronized (d242) {
                    if (i9 != d24.A00) {
                        for (Map.Entry entry : d24.A03.entrySet()) {
                            D27 d27 = new D27(d24, i9);
                            Map snapshot = ((LruCache) entry.getValue()).snapshot();
                            for (D1W d1w : snapshot.keySet()) {
                                d27.put(d1w, snapshot.get(d1w));
                            }
                            d24.A03.put(entry.getKey(), d27);
                        }
                        d24.A00 = i9;
                    }
                    if (i10 != d24.A01) {
                        D2A d2a = new D2A(d24, i10);
                        Map snapshot2 = d24.A02.snapshot();
                        for (D1W d1w2 : snapshot2.keySet()) {
                            d2a.put(d1w2, snapshot2.get(d1w2));
                        }
                        d24.A02 = d2a;
                        d24.A01 = i10;
                    }
                }
                int i11 = CameraEnumerationAndroid.C01581.MIN_FPS_THRESHOLD;
                if (i5 <= 0) {
                    i5 = CameraEnumerationAndroid.C01581.MIN_FPS_THRESHOLD;
                }
                D1J.A09 = i5;
                if (i6 > 0) {
                    i11 = i6;
                }
                D1J.A0A = i11;
                D1J.A0B = str;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
        boolean z4 = false;
        if (map.containsKey("dash.live_use_video_key_for_cache") && Integer.parseInt((String) map.get("dash.live_use_video_key_for_cache")) != 0) {
            z4 = true;
        }
        this.A00 = z4;
    }
}
