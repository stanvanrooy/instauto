package p000X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.video.heroplayer.service.HeroService;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.android.exoplayer2.Format;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.D2F */
public final class D2F implements C29633D2q {
    public C29623D2f A00;
    public C29605D1k A01;
    public D2X A02;
    public final Context A03;
    public final D2M A04;
    public final D29 A05;
    public final D3F A06;
    public final HeroPlayerSetting A07;
    public final AtomicBoolean A08;
    public final AtomicReference A09;
    public final C25947Bcz A0A;
    public final D1L A0B;
    public final D4G A0C;
    public final Map A0D;

    private D69 A00(D6R d6r, long j, VideoPlayRequest videoPlayRequest) {
        long j2;
        Format A022 = Format.A02("0", "application/x-subrip", 2);
        VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
        C29647D3e d3e = new C29647D3e(new C29616D1w(this.A06, j, videoPlayRequest2, Constants.A0N, (C29605D1k) null, (C29623D2f) null, (D2U) null, this.A08));
        Uri uri = videoPlayRequest2.A05.A02;
        if (this.A07.A1f) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = -2;
        }
        return new D69(d6r, new D67(uri, d3e.A00, A022, j2));
    }

    public final DAW AP7(C39911nl r41, VideoPlayRequest videoPlayRequest, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, boolean z) {
        boolean z2;
        int i;
        VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
        VideoSource videoSource = videoPlayRequest2.A05;
        D6B d6b = null;
        int i2 = -1;
        C39911nl r0 = r41;
        int i3 = r0.A00;
        int i4 = r0.A01;
        boolean z3 = false;
        if (videoPlayRequest2.A02 > 0) {
            z2 = false;
        } else {
            Map map = this.A0D;
            z2 = false;
            if (map.containsKey("dash.use_play_when_ready_for_load_control") && Integer.parseInt((String) map.get("dash.use_play_when_ready_for_load_control")) != 0) {
                z2 = true;
            }
        }
        C25947Bcz bcz = this.A0A;
        D2M d2m = this.A04;
        HeroPlayerSetting heroPlayerSetting = this.A07;
        C39961nq r11 = heroPlayerSetting.A0U;
        boolean z4 = videoPlayRequest2.A0O;
        int i5 = videoPlayRequest2.A0K;
        if (i5 < 0) {
            i5 = 1000;
        }
        if (!heroPlayerSetting.A0m || (i = videoPlayRequest2.A0J) < 0) {
            i = 1000;
        }
        int i6 = videoPlayRequest2.A02;
        int i7 = heroPlayerSetting.A01;
        AtomicBoolean atomicBoolean3 = atomicBoolean;
        AtomicBoolean atomicBoolean4 = atomicBoolean2;
        C39961nq r18 = r11;
        boolean z5 = z4;
        D6B d6b2 = new D6B(false, r18, atomicBoolean3, atomicBoolean4, z5, i5, i, i6, i7, heroPlayerSetting.A00, videoPlayRequest2.A06, d2m);
        if (!BM4.A00(videoSource.A03)) {
            if (videoSource.A06 != C40751pB.DASH_LIVE) {
                z3 = true;
            }
            D6U.A02(z3);
            if (videoPlayRequest2.A05.A07 != null) {
                d6b = d6b2;
            }
        }
        D6Q d6q = new D6Q();
        if (videoSource.A06 == C40751pB.PROGRESSIVE) {
            HeroPlayerSetting heroPlayerSetting2 = this.A07;
            if (heroPlayerSetting2.A1q) {
                d6b = d6b2;
            }
            if (!heroPlayerSetting2.A1m) {
                i2 = 2097152;
            }
        }
        D4G d4g = this.A0C;
        if ("fb_stories".equalsIgnoreCase(videoPlayRequest2.A05.A08)) {
        }
        boolean z6 = true;
        if (d6b == null) {
            AtomicBoolean atomicBoolean5 = new AtomicBoolean(false);
            d6b = new D6B(false, (C39961nq) null, atomicBoolean5, new AtomicBoolean(false), false, 1000, 1000, -1, 15000, 30000, Constants.ZERO, (D2M) null);
        }
        if (d2m == null) {
            z6 = false;
        }
        D6U.A02(z6);
        return new D64(d6q, i3, i4, i2, z2, d6b, d2m, bcz, atomicBoolean3, atomicBoolean4, z, d4g);
    }

    public final D2X Aa2(VideoPlayRequest videoPlayRequest, C29603D1i d1i, C29623D2f d2f, D2U d2u) {
        D35 d35;
        VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
        if (videoPlayRequest == null) {
            d35 = new D35();
        } else {
            d35 = new D35();
            d35.A05(videoPlayRequest2.A05.A0J);
            String str = videoPlayRequest2.A07;
            synchronized (d35) {
                d35.A00 = str;
            }
            String str2 = videoPlayRequest2.A05.A0D;
            synchronized (d35) {
                d35.A01 = str2;
            }
            boolean z = videoPlayRequest2.A05.A0K;
            synchronized (d35) {
                d35.A02 = z;
            }
            d35.A03(videoPlayRequest2.A05.A08);
            d35.A04(videoPlayRequest2.A05.A09);
            boolean z2 = videoPlayRequest2.A0F;
            synchronized (d35) {
                d35.A03 = z2;
            }
        }
        D1L d1l = this.A0B;
        D3U d3u = new D3U(d1l, new D3O(d1l), videoPlayRequest2.A04);
        C29623D2f d2f2 = d2f;
        this.A00 = d2f2;
        D2V d2v = new D2V(this.A07.A0R, this.A0A, videoPlayRequest2.A0L, d35, false);
        D1Q d1q = new D1Q(d1i, d2v);
        this.A01 = d1q;
        D2X d2x = new D2X(d1q, d35, this.A0A, d2f2, d2v, this.A03, d3u);
        this.A02 = d2x;
        return d2x;
    }

    public D2F(Context context, Map map, HeroPlayerSetting heroPlayerSetting, D29 d29, D2M d2m, AtomicReference atomicReference, D1L d1l, C29603D1i d1i, D4G d4g, AtomicBoolean atomicBoolean) {
        this.A03 = context;
        this.A0D = map;
        this.A07 = heroPlayerSetting;
        this.A04 = d2m;
        this.A05 = d29;
        Context context2 = context;
        this.A06 = new D3F(context2, heroPlayerSetting, d29, d2m, d1l, d1i);
        this.A0A = ((HeroService) context).A01;
        this.A09 = atomicReference;
        this.A0B = d1l;
        this.A0C = d4g;
        this.A08 = atomicBoolean;
    }

    public final C29623D2f AFG() {
        return this.A00;
    }

    public final D2X AJl() {
        return this.A02;
    }

    public final D2X AGH(VideoPlayRequest videoPlayRequest, C29603D1i d1i, C29623D2f d2f) {
        return null;
    }

    /* JADX WARNING: type inference failed for: r16v6, types: [X.D69] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r11 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x015d, code lost:
        if (r10.A01 == null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0169, code lost:
        if (r10.A01.isEmpty() == false) goto L_0x016b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final C29639D2w APr(long j, VideoPlayRequest videoPlayRequest, D7w d7w, D8A d8a, D4I d4i, D2U d2u, D2Y d2y, C29642D2z d2z, boolean z) {
        C29639D2w d2w;
        boolean z2;
        boolean z3;
        boolean z4;
        long j2;
        long j3;
        long j4;
        List list;
        String str;
        C42071rS r9;
        VideoPlayRequest videoPlayRequest2 = videoPlayRequest;
        VideoSource videoSource = videoPlayRequest2.A05;
        long j5 = j;
        if (!BM4.A00(videoSource.A03)) {
            HeroPlayerSetting heroPlayerSetting = this.A07;
            if (!videoSource.A03()) {
                z2 = true;
            } else {
                z2 = !TextUtils.isEmpty(heroPlayerSetting.A0e);
            }
            if (z2 && (!videoSource.A00() || !z)) {
                boolean z5 = false;
                if (videoSource.A06 != C40751pB.DASH_LIVE) {
                    z5 = true;
                }
                D6U.A02(z5);
                if (videoPlayRequest2.A05.A07 != null) {
                    C29639D2w d2w2 = null;
                    D2U d2u2 = d2u;
                    if (d2u == null) {
                        d2w = null;
                    } else {
                        D3F d3f = this.A06;
                        Integer num = Constants.ONE;
                        C29605D1k d1k = this.A01;
                        C29623D2f d2f = this.A00;
                        AtomicBoolean atomicBoolean = this.A08;
                        C29616D1w d1w = new C29616D1w(d3f, j5, videoPlayRequest2, num, d1k, d2f, d2u2, atomicBoolean);
                        C29616D1w d1w2 = new C29616D1w(d3f, j5, videoPlayRequest2, Constants.A0C, d1k, d2f, d2u2, atomicBoolean);
                        C29616D1w d1w3 = new C29616D1w(d3f, j5, videoPlayRequest2, Constants.A0Y, d1k, d2f, d2u2, atomicBoolean);
                        D2M d2m = this.A04;
                        D4p d4p = new D4p(d1w3, d1w, d1w2, 0, (long) 0, d2m, false, (D4I) null);
                        D4E d4e = new D4E(this.A05);
                        HeroPlayerSetting heroPlayerSetting2 = this.A07;
                        int i = 0;
                        int i2 = 0;
                        long j6 = 0;
                        D2S d2s = new D2S(d4p, (AnonymousClass96X) null, d4e, new D56(heroPlayerSetting2.A1l, 0, false, -1, -1, heroPlayerSetting2.A1J, heroPlayerSetting2.A0v));
                        int A022 = d2m.A02();
                        D6U.A03(!d2s.A05);
                        d2s.A00 = A022;
                        if (this.A07.A0v) {
                            D3L d3l = new D3L(this.A04.A02());
                            D6U.A03(!d2s.A05);
                            d2s.A03 = d3l;
                        }
                        boolean z6 = d2u2.A0G;
                        if (z6) {
                            this.A05.A00(new C41991rK(videoPlayRequest2.A05.A0D, C29634D2r.MANIFEST.name(), C42071rS.DYNAMIC_MANIFEST_FOR_VOD.name(), "Trying to play VOD with dynamic manifest"));
                            d2w = null;
                        } else {
                            D6U.A02(!z6);
                            d2s.A05 = true;
                            C29706D5s d5s = new C29706D5s(d2u2, (Uri) null, (AnonymousClass96X) null, (C25931Bci) null, d2s.A08, d2s.A02, d2s.A00, d2s.A03, d2s.A01, d2s.A07, d2s.A06);
                            boolean z7 = true;
                            D49 A012 = D2J.A01(d2u2, this.A03, true, d7w, d8a);
                            if (A012 != null) {
                                z3 = false;
                            }
                            z3 = true;
                            if (!z3) {
                                z4 = true;
                            }
                            z4 = false;
                            if (videoPlayRequest2.A00 != C40761pD.A00(Constants.ONE) && (z3 || z4)) {
                                if (z3) {
                                    str = "no valid dash representations";
                                } else {
                                    str = "all dash representation filtered out";
                                }
                                if (z3) {
                                    r9 = C42071rS.NO_VALID_VIDEO_REPRESENTATION;
                                } else {
                                    r9 = C42071rS.ALL_VALID_VIDEO_REPRESENTATION_FILTERED_OUT;
                                }
                                this.A05.A00(new C41991rK(videoPlayRequest2.A05.A0D, C29634D2r.MANIFEST.name(), r9.name(), str));
                            }
                            if (C40761pD.A00(Constants.ONE) != videoPlayRequest2.A00 && !z3 && !z4) {
                                z7 = false;
                            }
                            C29706D5s d5s2 = d5s;
                            if (videoPlayRequest2.A05.A02 != null) {
                                d5s2 = A00(d5s, j5, videoPlayRequest2);
                            }
                            Integer num2 = Constants.ONE;
                            if (!z7) {
                                i = A012.A01.size();
                            }
                            if (!(A012 == null || (list = A012.A00) == null)) {
                                i2 = list.size();
                            }
                            boolean z8 = d2u2.A0I;
                            if (z8) {
                                j2 = d2u2.A08;
                            } else {
                                j2 = 0;
                            }
                            if (z8) {
                                j6 = d2u2.A05;
                            }
                            if (z8) {
                                j3 = d2u2.A03;
                            } else {
                                j3 = 0;
                            }
                            if (z8) {
                                j4 = d2u2.A06;
                            } else {
                                j4 = 0;
                            }
                            d2w2 = new C29639D2w(d5s2, num2, i, i2, j2, j6, j3, j4, 0, z8, d2u2.A0J, D2K.A00(A012), (C29615D1v) null, (String) null, false);
                            d2w = d2w2;
                        }
                    }
                }
            }
        }
        d2w = null;
        if (d2w != null) {
            return d2w;
        }
        Uri uri = videoPlayRequest2.A05.A03;
        if (uri == null) {
            return null;
        }
        C29666D3z d3z = new C29666D3z(this);
        D6R d60 = new D60(uri, new C29616D1w(this.A06, j5, videoPlayRequest2, Constants.A0j, (C29605D1k) null, (C29623D2f) null, (D2U) null, this.A08), d3z, this.A04.A02(), 2097152);
        if (videoPlayRequest2.A05.A02 != null) {
            d60 = A00(d60, j5, videoPlayRequest2);
        }
        return new C29639D2w(d60, Constants.A0N, 0, 0, 0, 0, 0, 0, 0, false, false, "", (C29615D1v) null, "", false);
    }
}
