package p000X;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.ViewGroup;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.heroplayer.ipc.HttpTransferEndEvent;
import com.facebook.video.heroplayer.ipc.LiveState;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import com.facebook.video.heroplayer.ipc.VideoPlayContextualSetting;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.video.player.common.LiveVideoDebugStatsView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;

/* renamed from: X.1yP  reason: invalid class name and case insensitive filesystem */
public final class C45731yP extends C45741yQ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ParcelableFormat A04;
    public VideoPlayContextualSetting A05 = new VideoPlayContextualSetting();
    public VideoSource A06;
    public C40581ot A07;
    public C40441of A08;
    public C29075CrS A09;
    public C29070CrN A0A;
    public Integer A0B;
    public Runnable A0C;
    public boolean A0D;
    public Context A0E;
    public Uri A0F;
    public final Handler A0G = new Handler(Looper.getMainLooper());
    public final C45791yV A0H;
    public final AnonymousClass0C1 A0I;
    public final C45761yS A0J = new C45761yS();
    public final C45751yR A0K = new C45751yR();
    public final List A0L = new ArrayList();
    public final HeroPlayerSetting A0M;
    public final C45771yT A0N;
    public volatile long A0O;

    public final SurfaceTexture A0F(C37671k2 r16, String str, int i) {
        C45931yr r2;
        Uri uri = null;
        C37671k2 r22 = r16;
        if (r16 == null) {
            return null;
        }
        String str2 = r22.A06;
        if (str2 != null) {
            uri = Uri.parse(str2);
        }
        boolean A042 = C26171By.A01(this.A0I).A04();
        VideoSource A012 = C39701nL.A01(r22, uri, str);
        C40781pF r6 = C40781pF.IN_PLAY;
        int i2 = this.A03;
        VideoPlayContextualSetting videoPlayContextualSetting = this.A05;
        Integer num = Constants.ZERO;
        VideoPlayRequest videoPlayRequest = new VideoPlayRequest(A012, r6, C40761pD.A00(num), A042, num, i, i2, videoPlayContextualSetting, -1, C39701nL.A02);
        C45791yV r3 = this.A0H;
        C45791yV.A03(r3, "trySwitchToWarmupPlayer", new Object[0]);
        r3.A0N = null;
        C39731nP r23 = C39731nP.A0W;
        if (r23.A0J != null) {
            r2 = (C45931yr) r23.A0J.A01.remove(videoPlayRequest.A05.A0D);
        } else {
            r2 = null;
        }
        if (r2 == null) {
            return null;
        }
        C45791yV.A01(r3, r3.A04.obtainMessage(21, r2));
        r3.A0N = videoPlayRequest.A05.A0D;
        return r2.A01;
    }

    public final void A0L() {
        Uri uri;
        Uri uri2;
        C40751pB r4;
        this.A0D = false;
        VideoSource videoSource = this.A06;
        if (videoSource != null) {
            boolean A042 = C26171By.A01(this.A0I).A04();
            C40781pF r11 = C40781pF.IN_PLAY;
            int i = this.A00;
            int i2 = this.A03;
            VideoPlayContextualSetting videoPlayContextualSetting = this.A05;
            Integer num = Constants.ZERO;
            int i3 = i2;
            VideoPlayRequest videoPlayRequest = new VideoPlayRequest(videoSource, r11, C40761pD.A00(num), A042, num, i, i3, videoPlayContextualSetting, -1, C39701nL.A02);
            C45791yV r112 = this.A0H;
            C45791yV.A03(r112, "setVideoPlaybackParams: %s", videoPlayRequest.A05);
            VideoSource videoSource2 = videoPlayRequest.A05;
            boolean z = false;
            Uri uri3 = videoSource2.A03;
            if ((uri3 == null || !uri3.toString().contains("live-dash") || (r4 = videoSource2.A06) == C40751pB.DASH_LIVE || r4 == C40751pB.VIDEO_PROTOCOL_LIVE) && (!videoSource2.A01() || ((uri2 = videoSource2.A03) != null && !TextUtils.isEmpty(uri2.toString())))) {
                boolean z2 = false;
                if (videoSource2.A06 == C40751pB.PROGRESSIVE) {
                    z2 = true;
                }
                if ((!z2 || ((uri = videoSource2.A03) != null && !uri.getPath().endsWith(".mpd"))) && (videoSource2.A03 != null || !TextUtils.isEmpty(videoSource2.A07))) {
                    z = true;
                }
            }
            if (!z) {
                C45791yV.A04(r112, new IllegalArgumentException("Invalid video source"), C29634D2r.NETWORK_SOURCE, C42071rS.INVALID_VIDEO_SOURCE, "NO_SOURCE", "Invalid video source");
            } else {
                C45791yV.A03(r112, "dash manifest: %s", videoPlayRequest.A05.A07);
                C45791yV.A01(r112, r112.A04.obtainMessage(1, videoPlayRequest));
            }
            if (videoSource.A01() && videoSource.A0I) {
                this.A07 = new C40581ot(this.A0I, videoSource.A0D);
            }
        }
        C29070CrN crN = this.A0A;
        if (crN != null) {
            crN.A04(Constants.ZERO);
        }
    }

    private void A00() {
        VideoSource videoSource = this.A06;
        if (videoSource != null && videoSource.A01()) {
            this.A09 = null;
        }
        this.A06 = null;
        this.A05 = new VideoPlayContextualSetting();
        this.A0F = null;
        this.A02 = -1;
        this.A01 = -1;
        this.A04 = null;
        C45761yS r1 = this.A0J;
        r1.A02 = null;
        r1.A01 = null;
        r1.A00 = -1;
        this.A00 = 0;
    }

    public static void A02(C45731yP r6, ParcelableFormat parcelableFormat, List list) {
        if (parcelableFormat != null) {
            C45731yP r1 = r6;
            C45611yD r0 = r6.A05;
            if (r0 != null) {
                r0.B0x(r1, parcelableFormat.A0B, parcelableFormat.A05, parcelableFormat.A04, parcelableFormat.A03, parcelableFormat.A0D);
            }
            C29070CrN crN = r1.A0A;
            if (crN != null) {
                crN.setFormat(parcelableFormat);
                r1.A0A.setCustomQualities(list);
            }
        }
    }

    public static void A03(C45731yP r7, String str, String str2) {
        String str3;
        VideoSource videoSource = r7.A06;
        if (!(videoSource == null || (str3 = videoSource.A0D) == null)) {
            C40541op r5 = r7.A08.A03;
            if (r5.A03.A00()) {
                int hashCode = str3.hashCode();
                r5.A01.markerStart(28180483, hashCode);
                HashMap hashMap = new HashMap();
                hashMap.put("state", C24682Ark.A00(Constants.A04));
                hashMap.put("time_ms", Long.toString(SystemClock.elapsedRealtime()));
                hashMap.put(TraceFieldType.VideoId, str3);
                hashMap.put("player_id", "0");
                if (str != null) {
                    hashMap.put(TraceFieldType.ErrorDomain, str);
                }
                if (str2 != null) {
                    hashMap.put("error_details", str2);
                }
                C40441of.A00(28180483, hashCode, hashMap);
                r5.A01.markerEnd(28180483, hashCode, 2);
            }
        }
        C45561y8 r0 = r7.A07;
        if (r0 != null) {
            r0.BWG(r7, str, str2);
        }
        C29070CrN crN = r7.A0A;
        if (crN != null) {
            crN.setErrorOrWarningCause(str, str2);
        }
    }

    public static void A04(C45731yP r0, String str, Object... objArr) {
        if (r0.A0M.A0t) {
            AnonymousClass0DB.A0K("IgHeroPlayer", str, objArr);
        }
    }

    public final int A05() {
        return (int) (this.A0O / 1000);
    }

    public final int A06() {
        long j;
        C45791yV r1 = this.A0H;
        if (r1.A0C()) {
            j = ((ServicePlayerState) r1.A0F.get()).A06;
        } else {
            j = 0;
        }
        return (int) j;
    }

    public final int A07() {
        return (int) this.A0H.A06();
    }

    public final int A08() {
        long j;
        VideoSource videoSource = this.A06;
        if (videoSource == null) {
            return 0;
        }
        if (!videoSource.A01()) {
            return (int) this.A0H.A07();
        }
        C45791yV r6 = this.A0H;
        long j2 = 0;
        if (r6.A0C()) {
            long A062 = r6.A06();
            LiveState liveState = (LiveState) r6.A0E.get();
            if (r6.A0C()) {
                j = liveState.A06;
            } else {
                j = 0;
            }
            j2 = Math.max(0, A062 - j);
        }
        return (int) j2;
    }

    public final int A09() {
        long j = ((ServicePlayerState) this.A0H.A0F.get()).A0G;
        if (j < 0) {
            j = -1;
        }
        return (int) j;
    }

    public final int A0A() {
        ParcelableFormat parcelableFormat = this.A04;
        if (parcelableFormat != null) {
            return parcelableFormat.A03;
        }
        return 0;
    }

    public final int A0B() {
        long j;
        C45791yV r2 = this.A0H;
        LiveState liveState = (LiveState) r2.A0E.get();
        if (r2.A0C()) {
            j = liveState.A02;
        } else {
            j = 0;
        }
        return (int) j;
    }

    public final int A0C() {
        int i;
        C45751yR r10 = this.A0K;
        synchronized (r10) {
            if (r10.A00 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                r10.A01 += elapsedRealtime - r10.A00;
                r10.A00 = elapsedRealtime;
            }
            i = (int) r10.A01;
            r10.A01 = 0;
        }
        return i;
    }

    public final int A0D() {
        return (int) this.A0H.A07();
    }

    public final int A0E() {
        C45791yV r2 = this.A0H;
        LiveState liveState = (LiveState) r2.A0E.get();
        if (r2.A0C()) {
            return liveState.A00;
        }
        return 0;
    }

    public final C45761yS A0G() {
        return this.A0J;
    }

    public final C29070CrN A0H() {
        C29070CrN crN = this.A0A;
        if (crN != null) {
            return crN;
        }
        Context context = this.A0E;
        if (context != null) {
            C29070CrN crN2 = new C29070CrN(context, this);
            this.A0A = crN2;
            crN2.A0J.show();
            LiveVideoDebugStatsView liveVideoDebugStatsView = crN2.A0I;
            Timer timer = liveVideoDebugStatsView.A07;
            if (timer != null) {
                timer.cancel();
                liveVideoDebugStatsView.A07 = null;
            }
            Timer timer2 = new Timer();
            liveVideoDebugStatsView.A07 = timer2;
            timer2.scheduleAtFixedRate(new AGb(liveVideoDebugStatsView), 0, 100);
            C29071CrO crO = new C29071CrO(this);
            this.A0C = crO;
            AnonymousClass0ZA.A0E(this.A0G, crO, 1216144255);
        }
        return this.A0A;
    }

    public final String A0I() {
        return String.valueOf(this.A0H.A0J);
    }

    public final List A0J() {
        ArrayList arrayList;
        synchronized (this.A0L) {
            arrayList = new ArrayList(this.A0L.size());
            for (HttpTransferEndEvent httpTransferEndEvent : this.A0L) {
                arrayList.add(new C51002Is(httpTransferEndEvent.A05, httpTransferEndEvent.A09, httpTransferEndEvent.A07));
            }
        }
        return arrayList;
    }

    public final void A0K() {
        C45791yV r2 = this.A0H;
        C45791yV.A03(r2, "pause", new Object[0]);
        C45791yV.A01(r2, r2.A04.obtainMessage(3));
    }

    public final void A0N() {
        if (this.A07 != null) {
            AnonymousClass2J3 A082 = this.A0H.A08();
            this.A07.A00(A08(), this.A06, this.A0B, A082.A00, (int) A082.A03);
        }
        C39701nL.A03.A00.A03.remove(this);
        this.A0E = null;
        A00();
        AnonymousClass0ZA.A07(this.A0G, (Object) null);
        C29070CrN crN = this.A0A;
        if (crN != null) {
            LiveVideoDebugStatsView liveVideoDebugStatsView = crN.A0I;
            liveVideoDebugStatsView.A07.cancel();
            liveVideoDebugStatsView.A07 = null;
            crN.A0J.dismiss();
            ViewGroup viewGroup = (ViewGroup) crN.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(crN);
            }
            this.A0A = null;
        }
        this.A0H.A0A();
        C45791yV r2 = this.A0H;
        C45791yV.A03(r2, "release", new Object[0]);
        C45791yV.A01(r2, r2.A04.obtainMessage(8));
        C45791yV r0 = this.A0H;
        r0.A09.A00.remove(this.A0N);
    }

    public final void A0P() {
        C45791yV r2 = this.A0H;
        C45791yV.A03(r2, "retry video playback", new Object[0]);
        C45791yV.A01(r2, r2.A04.obtainMessage(28));
    }

    public final void A0Q() {
        C45791yV r3 = this.A0H;
        C45791yV.A03(r3, "play", new Object[0]);
        C45791yV.A01(r3, r3.A04.obtainMessage(2, -1L));
    }

    public final void A0R(float f) {
        C45791yV r3 = this.A0H;
        C45791yV.A03(r3, "setPlaybackSpeed", new Object[0]);
        C45791yV.A01(r3, r3.A04.obtainMessage(26, Float.valueOf(f)));
    }

    public final void A0S(float f) {
        C45791yV r8 = this.A0H;
        Float valueOf = Float.valueOf(f);
        C45791yV.A03(r8, "setVolume %f, trigger: %s", valueOf, "unknown");
        C45791yV.A01(r8, r8.A04.obtainMessage(5, new Object[]{valueOf, "unknown"}));
    }

    public final void A0T(int i) {
        C45791yV r5 = this.A0H;
        C45791yV.A03(r5, "seekTo: seekTimeMsWithPreview: %d", Integer.valueOf(i));
        r5.A0K = (long) i;
        r5.A0L = C45791yV.A0T.incrementAndGet();
        r5.A0M = SystemClock.elapsedRealtime();
        C45791yV.A01(r5, r5.A04.obtainMessage(4, new long[]{r5.A0K, r5.A0L, 0}));
    }

    public final void A0U(int i) {
        C45791yV r3 = this.A0H;
        Integer valueOf = Integer.valueOf(i);
        C45791yV.A03(r3, "setAudioUsage: %d", valueOf);
        C45791yV.A01(r3, r3.A04.obtainMessage(23, valueOf));
    }

    public final void A0W(Uri uri) {
        this.A0F = uri;
        if (uri != null && !C12670hC.A08()) {
            Uri A012 = AnonymousClass1A0.A02.A01(uri);
            if (A012 != null) {
                this.A0F = A012;
                return;
            }
            C1894387n r2 = (C1894387n) this.A0I.AVA(C1894387n.class, new C1894487o());
            r2.A00.ADc(new C205698rH(r2, uri));
        }
    }

    public final void A0X(Uri uri, String str, boolean z, String str2, boolean z2) {
        String str3 = str;
        String str4 = str2;
        Uri uri2 = uri;
        if (str == null) {
            str3 = uri2.toString();
        }
        if (str2 == null) {
            str4 = "";
        }
        A01(new VideoSource(uri2, str3, (String) null, (String) null, (Uri) null, str4, (String) null, C40751pB.PROGRESSIVE, (String) null, false, false, false, z2, Collections.EMPTY_MAP, C40761pD.A01(Constants.ZERO), C40771pE.GENERAL));
        this.A0B = null;
        this.A00 = 0;
    }

    public final void A0Y(Surface surface) {
        int hashCode;
        C45791yV r3 = this.A0H;
        Object[] objArr = new Object[1];
        if (surface == null) {
            hashCode = 0;
        } else {
            hashCode = surface.hashCode();
        }
        objArr[0] = Integer.valueOf(hashCode);
        C45791yV.A03(r3, "setSurface %x", objArr);
        C45791yV.A01(r3, r3.A04.obtainMessage(6, surface));
        C45791yV.A0R.add(surface);
    }

    public final void A0Z(C37671k2 r2, String str, int i) {
        A01(C39701nL.A01(r2, this.A0F, str));
        this.A05 = C39701nL.A00(r2, this.A0I);
        this.A0B = r2.A03;
        this.A00 = i;
    }

    public final void A0a(Runnable runnable) {
        if (runnable == null) {
            this.A0H.A0A();
        } else {
            this.A0H.A0B(new AnonymousClass23Y(this, runnable));
        }
    }

    public final boolean A0c() {
        return this.A0H.A0O;
    }

    public final boolean A0d() {
        C45791yV r1 = this.A0H;
        if (!r1.A0C() || !((ServicePlayerState) r1.A0F.get()).A0E) {
            return false;
        }
        return true;
    }

    public final boolean A0e() {
        VideoPlayRequest videoPlayRequest;
        C45791yV r0 = this.A0H;
        String str = r0.A0N;
        if (str == null || (videoPlayRequest = r0.A07.A06) == null || !str.equals(videoPlayRequest.A05.A0D)) {
            return false;
        }
        return true;
    }

    public C45731yP(Context context, AnonymousClass0C1 r7) {
        C39701nL r3 = C39701nL.A03;
        r3.A05(context.getApplicationContext(), r7);
        Activity activity = null;
        if (C05770Lw.A00().A00.getBoolean("show_player_debug", false) || ((Boolean) C05640Lj.A00(AnonymousClass0L7.VIDEO_DEBUG_OVERLAY, "is_enabled", false)).booleanValue()) {
            this.A0E = context instanceof Activity ? (Activity) context : activity;
        }
        this.A0I = r7;
        this.A0N = new C45771yT(this);
        this.A08 = new C40441of(r7);
        HeroPlayerSetting A002 = C39871nh.A00(context, r7);
        this.A0M = A002;
        this.A0H = new C45791yV(this.A0N, A002);
        r3.A00.A03.add(this);
    }

    private void A01(VideoSource videoSource) {
        A00();
        this.A06 = videoSource;
        if (videoSource.A01()) {
            this.A09 = new C29075CrS();
        }
        AnonymousClass0Ba A002 = AnonymousClass0QD.A00();
        VideoSource videoSource2 = this.A06;
        A002.BYg("last_video_player_source", C06360Ot.formatString("type:%s, key:%s", videoSource2.A06, videoSource2.A0D));
        C29070CrN crN = this.A0A;
        if (crN != null) {
            crN.A01();
        }
    }

    public final void A0M() {
        A0L();
    }

    public final void A0O() {
        A00();
        C45791yV r2 = this.A0H;
        C45791yV.A03(r2, "reset", new Object[0]);
        C45791yV.A01(r2, r2.A04.obtainMessage(14));
    }

    public final void A0b(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        C45791yV r2 = this.A0H;
        C45791yV.A03(r2, "setLooping: %s", valueOf);
        C45791yV.A01(r2, r2.A04.obtainMessage(19, valueOf));
    }

    public final void A0V(int i) {
        this.A03 = i;
    }
}
