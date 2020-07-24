package p000X;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.video.heroplayer.common.MosScoreCalculation;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueStartEvent;
import com.facebook.video.heroplayer.ipc.VideoPlayContextualSetting;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.D2D */
public final class D2D {
    public D2X A00;
    public AtomicReference A01;
    public D4F A02;
    public final Context A03;
    public final C25947Bcz A04;
    public final C27226C3p A05;
    public final D4L A06;
    public final D1L A07;
    public final D48 A08;
    public final HeroPlayerSetting A09;
    public final C29603D1i A0A;
    public final Object A0B = new Object();
    public final Map A0C;

    private int A00(C29677D4l d4l, int i) {
        boolean A012;
        int i2;
        long j;
        if (d4l == null) {
            return 0;
        }
        C25947Bcz bcz = this.A04;
        if (bcz == null) {
            A012 = false;
        } else {
            A012 = bcz.A01();
        }
        if (A012) {
            i2 = this.A09.A06;
        } else {
            i2 = this.A09.A05;
        }
        C29622D2e A022 = d4l.A02();
        if (A022 == null) {
            j = 0;
        } else {
            j = A022.A02 + A022.A01;
        }
        return Math.min((int) (j + ((long) (((((double) d4l.A01.A04) / 8.0d) * ((double) i)) / 1000.0d))), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r2.A09.A0J != false) goto L_0x0035;
     */
    private D2Q A01(D29 d29, VideoPrefetchRequest videoPrefetchRequest, String str, boolean z, Integer num, D49 d49, D2U d2u, C29605D1k d1k, D35 d35, D2V d2v, int i) {
        List list;
        D49 d492 = d49;
        int i2 = i;
        VideoPrefetchRequest videoPrefetchRequest2 = videoPrefetchRequest;
        if (i2 == 1) {
            List list2 = d492.A00;
            if (list2 != null) {
                if (!list2.isEmpty()) {
                    if (this.A09.A1b) {
                        if (!videoPrefetchRequest2.A0E) {
                        }
                    }
                    VideoPrefetchRequest videoPrefetchRequest3 = new VideoPrefetchRequest(videoPrefetchRequest2);
                    videoPrefetchRequest3.A03 = i2;
                    return new D2Q(this.A09, this, this.A07, d29, videoPrefetchRequest3, str, z, num, d492, d2u, d1k, d35, d2v, ((Boolean) this.A01.get()).booleanValue());
                }
            }
        } else {
            if (i2 != 2 || (list = d492.A01) == null || list.isEmpty()) {
                return null;
            }
            VideoPrefetchRequest videoPrefetchRequest32 = new VideoPrefetchRequest(videoPrefetchRequest2);
            videoPrefetchRequest32.A03 = i2;
            return new D2Q(this.A09, this, this.A07, d29, videoPrefetchRequest32, str, z, num, d492, d2u, d1k, d35, d2v, ((Boolean) this.A01.get()).booleanValue());
        }
        return null;
    }

    public static void A02(D2D d2d, D2P d2p, Integer num) {
        D48 d48;
        if (d2d.A09.A1H && (d48 = d2d.A08) != null) {
            d48.A00.A0A.A00(new PrefetchTaskQueueStartEvent(d2p.A00));
        }
        boolean z = d2d.A09.A1P;
        if (num != Constants.ZERO) {
            z = false;
            if (num == Constants.ONE) {
                z = true;
            }
        }
        C27226C3p.A00(d2d.A05, new C27229C3s(d2p, 1), z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if ((r11 instanceof p000X.C29683D4s) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006b, code lost:
        if ((r12 instanceof p000X.C29683D4s) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if ((r12 instanceof p000X.C29683D4s) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if ((r11 instanceof p000X.C29683D4s) == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b8, code lost:
        if ((r12 instanceof p000X.C29683D4s) == false) goto L_0x00ba;
     */
    public final D4A A03(String str, int i, C29677D4l d4l, C29677D4l d4l2, boolean z, String str2, D29 d29) {
        int i2;
        int i3;
        long j;
        C29622D2e A022;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        C25947Bcz bcz;
        boolean z5;
        int i5;
        boolean z6;
        D4A d4a;
        int i6 = 0;
        if (this.A09.A1p) {
            if (d4l != null) {
                z5 = true;
            }
            z5 = false;
            int i7 = -1;
            if (!z5) {
                i5 = -1;
            } else {
                i5 = (int) ((C29683D4s) d4l).A01;
            }
            if (i5 <= 0) {
                d4a = null;
            } else {
                if (d4l2 != null) {
                    z6 = true;
                }
                z6 = false;
                if (z6) {
                    i7 = (int) ((C29683D4s) d4l2).A01;
                }
                d4a = new D4A(i5 + 1, i7 + 1);
            }
            if (d4a != null) {
                return d4a;
            }
            C40431oe.A03("UnifiedPrefetchManager", "Manifest for videoId %s is missing prefetch segment range", str);
            d29.A00(new C41991rK(str, C29634D2r.MANIFEST.name(), C42071rS.MANIFEST_MISSING_PREFETCH_SEGMENT_RANGE.name(), "Manifest is missing prefetch segment range"));
        }
        if (i <= 0) {
            if (z && (bcz = this.A04) != null) {
                bcz.A01();
            }
            if (d4l != null) {
                z2 = true;
            }
            z2 = false;
            int i8 = -1;
            int i9 = -1;
            if (z2) {
                i9 = (int) ((C29683D4s) d4l).A02;
            }
            boolean z7 = false;
            if (i9 > 0) {
                z7 = true;
            }
            if (!z7 && this.A09.A19) {
                if (!z2) {
                    i4 = -1;
                } else {
                    i4 = (int) ((C29683D4s) d4l).A00;
                }
                if (d4l2 != null) {
                    z4 = true;
                }
                z4 = false;
                int i10 = -1;
                if (z4) {
                    i10 = (int) ((C29683D4s) d4l2).A00;
                }
                if (i4 > 0) {
                    return new D4A(i4 + 1, i10 + 1);
                }
            }
            HeroPlayerSetting heroPlayerSetting = this.A09;
            if (!heroPlayerSetting.A1Z || !z7) {
                return new D4A(A00(d4l, heroPlayerSetting.A09), A00(d4l2, this.A09.A09));
            }
            if (d4l2 != null) {
                z3 = true;
            }
            z3 = false;
            if (z3) {
                i8 = (int) ((C29683D4s) d4l2).A02;
            }
            return new D4A(i9 + 1, i8 + 1);
        }
        if (d4l != null) {
            i2 = d4l.A01.A04;
        } else {
            i2 = 0;
        }
        if (d4l2 != null) {
            i3 = d4l2.A01.A04;
        } else {
            i3 = 0;
        }
        int i11 = i2 + i3;
        if (i11 <= 0) {
            if (d29 != null) {
                d29.A00(new C41991rK(str, C29634D2r.PREFETCH_MANAGER.name(), C42071rS.ZERO_AUDIO_VIDEO_BITRATE.name(), "The sum of bitrates from all representations must be greater than 0, videoId: " + str + " ,prefetchOrigin: " + str2 + " ,sponsored: " + z + " ,optionalPrefetchBudgetInBytes: " + i));
            }
            if (d4l2 != null) {
                i6 = i / 10;
            }
            return new D4A(i - i6, i6);
        }
        if (d4l2 == null || (A022 = d4l2.A02()) == null) {
            j = 0;
        } else {
            j = A022.A02 + A022.A01;
        }
        int i12 = ((int) ((((float) i3) * ((float) i)) / ((float) i11))) + ((int) j);
        return new D4A(i - i12, i12);
    }

    public D2D(D1L d1l, C25947Bcz bcz, Map map, HeroPlayerSetting heroPlayerSetting, D4L d4l, C29603D1i d1i, D48 d48, Context context, D4F d4f) {
        this.A05 = new C27226C3p(new C27230C3t(this, heroPlayerSetting));
        this.A07 = d1l;
        this.A04 = bcz;
        this.A0C = map;
        this.A09 = heroPlayerSetting;
        this.A06 = d4l;
        this.A0A = d1i;
        this.A08 = d48;
        this.A03 = context;
        this.A02 = d4f;
        AtomicReference atomicReference = new AtomicReference();
        this.A01 = atomicReference;
        atomicReference.set(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v155, resolved type: X.D4l} */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03a3, code lost:
        if (r1 != false) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0485, code lost:
        if (r8.A03 != 2) goto L_0x0487;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x049b, code lost:
        if (r8.A09.A0J != false) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04bc, code lost:
        if (r8.A03 != 1) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04e9, code lost:
        if ("ig_stories".equals(r1.A09) != false) goto L_0x04eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017d, code lost:
        if ((r2 instanceof p000X.C29683D4s) == false) goto L_0x017f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x00c8 A[SYNTHETIC] */
    public final void A04(VideoPrefetchRequest videoPrefetchRequest, D29 d29, D2U d2u, List list, List list2, C29605D1k d1k, D35 d35, D2V d2v) {
        int size;
        C29677D4l d4l;
        int i;
        C29677D4l d4l2;
        C29677D4l d4l3;
        D3W d3w;
        boolean z;
        boolean z2;
        boolean z3;
        Format format;
        int A012;
        int i2;
        int i3;
        float f;
        boolean z4;
        String str;
        float f2;
        long j;
        C27228C3r c3r;
        String str2;
        String A002;
        C29570D0b A042;
        long j2;
        boolean z5;
        long j3;
        long j4;
        C27226C3p c3p = this.A05;
        synchronized (c3p.A05) {
            try {
                size = c3p.A05.size();
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        DCI dci = null;
        List list3 = list;
        if (list == null || list3.isEmpty()) {
            d4l = null;
        } else {
            d4l = list3.get(0);
        }
        VideoPrefetchRequest videoPrefetchRequest2 = videoPrefetchRequest;
        VideoSource videoSource = videoPrefetchRequest2.A09;
        String str3 = videoSource.A08;
        String str4 = videoSource.A09;
        C29605D1k d1k2 = d1k;
        List list4 = list2;
        D35 d352 = d35;
        D2V d2v2 = d2v;
        D29 d292 = d29;
        D2U d2u2 = d2u;
        if (list2 == null || list4.isEmpty()) {
            d4l2 = null;
            d4l3 = null;
            d3w = null;
            i = 0;
        } else {
            VideoSource videoSource2 = videoPrefetchRequest2.A09;
            String str5 = videoSource2.A0D;
            int i4 = videoPrefetchRequest2.A02;
            long j5 = d2u2.A04;
            boolean z6 = videoSource2.A0K;
            List<C29677D4l> list5 = list4;
            D1L d1l = this.A07;
            d4l3 = null;
            if (!(d1l == null || d1l.A04() == null)) {
                D2P d2p = new D2P((VideoPrefetchRequest) null, str5, (String) null, true, Constants.ZERO, false);
                C27226C3p c3p2 = this.A05;
                C27229C3s c3s = new C27229C3s(d2p, 0);
                synchronized (c3p2.A05) {
                    try {
                        Iterator it = c3p2.A04.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                Iterator it2 = c3p2.A05.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        c3r = null;
                                        break;
                                    }
                                    C27229C3s c3s2 = (C27229C3s) it2.next();
                                    if (c3s2.equals(c3s)) {
                                        c3r = c3s2.A00;
                                        break;
                                    }
                                }
                            } else {
                                C27229C3s c3s3 = (C27229C3s) it.next();
                                if (c3s3.equals(c3s)) {
                                    c3r = c3s3.A00;
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                            break;
                        }
                    }
                }
                D2P d2p2 = (D2P) c3r;
                if (d2p2 != null) {
                    str2 = d2p2.A01;
                } else {
                    str2 = null;
                }
                for (C29677D4l d4l4 : list5) {
                    if (!d4l4.A01.A0Q.equals(str2)) {
                        C29622D2e A022 = d4l4.A02();
                        if (!(A022 == null || A022.A00(d4l4.A03) == null)) {
                            new C29644D3b(this);
                            long j6 = (long) A03(str5, i4, d4l4, d4l, z6, str3, d292).A01;
                            if (((double) this.A09.A09) > ((double) j5)) {
                                j6 = 100;
                            }
                            D3T A013 = d4l4.A01();
                            if (A013 != null) {
                                C29622D2e d2e = d4l4.A02;
                                j2 = 0;
                                if (this.A07.A04().AeZ(C40431oe.A00(d4l4.A03(), str5, d2e.A00(d4l4.A03)), 0, d2e.A01)) {
                                    A002 = C40431oe.A00(d4l4.A03(), str5, A013.AVW(A013.ALp()).A00(d4l4.A03));
                                    A042 = this.A07.A04();
                                }
                            } else {
                                A002 = C40431oe.A00(d4l4.A03(), str5, d4l4.A02.A00(d4l4.A03));
                                if (this.A09.A1O) {
                                    if (d4l4 != null) {
                                        z5 = true;
                                    }
                                    z5 = false;
                                    if (z5) {
                                        j3 = ((C29683D4s) d4l4).A00;
                                    } else {
                                        j3 = -1;
                                    }
                                    if (j3 < 0) {
                                        j3 = 100;
                                    }
                                    A042 = this.A07.A04();
                                    j2 = 0;
                                    j4 = j3;
                                    if (!A042.AeZ(A002, j2, j4)) {
                                    }
                                } else {
                                    A042 = this.A07.A04();
                                    j2 = 0;
                                }
                            }
                            j4 = j6;
                            if (!A042.AeZ(A002, j2, j4)) {
                            }
                        }
                    }
                    if (d4l3 == null || d4l3.A01.A04 < d4l4.A01.A04) {
                        d4l3 = d4l4;
                    }
                }
            }
            Format format2 = null;
            D2X d2x = new D2X(d1k2, d352, this.A04, (C29623D2f) null, d2v2, this.A03, (D3U) null);
            this.A00 = d2x;
            List list6 = list4;
            Format[] formatArr = new Format[list6.size()];
            for (int i5 = 0; i5 < list6.size(); i5++) {
                formatArr[i5] = ((C29677D4l) list6.get(i5)).A01;
            }
            i = d2x.A07.A01(formatArr);
            if (d4l3 != null) {
                format = d4l3.A01;
            } else {
                format = null;
            }
            int A023 = d2x.A07.A02(formatArr, arrayList, str3, str4);
            D4H d4h = new D4H();
            d4h.A00 = d2x.A07.A01(formatArr);
            Format[] A014 = D2X.A01(d2x, formatArr, d2x.A0D, d4h);
            D2V d2v3 = d2x.A09;
            C29605D1k d1k3 = d2x.A0B;
            Format[] formatArr2 = A014;
            if (A014 == null) {
                A012 = 0;
            } else {
                A012 = d2x.A07.A01(formatArr2);
            }
            int i6 = A012;
            ArrayList arrayList2 = new ArrayList();
            int length = A014.length;
            int i7 = length;
            if (length == 1) {
                arrayList2.add(D2b.SINGLE_FORMAT);
                d3w = new D3W(A014[0], 0, 0, 0, arrayList2);
            } else {
                boolean z7 = d2v3.A05;
                if (z7) {
                    i2 = d2v3.A03.A0M;
                } else {
                    i2 = 3;
                }
                if (size > i2) {
                    if (!z7) {
                        C40001nu r7 = d2v3.A03;
                        if (D2V.A00(d2v3, r7.A0s)) {
                            i3 = d2v3.A02.A01.A08;
                        } else {
                            i3 = r7.A0e;
                        }
                    }
                    i3 = -1;
                } else {
                    if (!z7) {
                        C40001nu r72 = d2v3.A03;
                        if (D2V.A00(d2v3, r72.A0s)) {
                            i3 = d2v3.A02.A01.A09;
                        } else {
                            i3 = r72.A0f;
                        }
                    }
                    i3 = -1;
                }
                if (i3 != -1) {
                    f = 1.0f;
                } else if (size > i2) {
                    if (z7) {
                        f = d2v3.A03.A03;
                    } else {
                        f = d2v3.A03.A0B;
                    }
                } else if (z7) {
                    f = d2v3.A03.A04;
                } else {
                    f = d2v3.A03.A0C;
                }
                Format format3 = null;
                long j7 = 0;
                long j8 = 0;
                long j9 = 0;
                long j10 = 0;
                long j11 = -1;
                long j12 = -1;
                Format format4 = null;
                int i8 = 0;
                while (i8 < i7) {
                    Format format5 = A014[i8];
                    long j13 = (long) format5.A04;
                    float f3 = (float) j13;
                    if (d2v3.A05) {
                        f2 = d2v3.A03.A07;
                    } else {
                        f2 = d2v3.A03.A0F;
                    }
                    C29656D3p A015 = D2L.A01(d1k3, d2v3, A014, ((long) (f3 * f2)) / 8, i3);
                    long j14 = A015.A02;
                    if (j14 == -1) {
                        j = (long) d2v3.A04();
                    } else if (i3 == -1) {
                        j = (long) (((float) j14) * f);
                    } else {
                        j = A015.A01;
                    }
                    if (format3 == null || format5.A04 < format3.A04) {
                        j8 = j;
                        j7 = j14;
                        format3 = format5;
                    }
                    if (format5.A0F <= A023) {
                        if (j13 <= j && (format2 == null || format2.A04 < format5.A04)) {
                            j11 = j;
                            j12 = j14;
                            format2 = format5;
                        }
                        if (f3 <= ((float) j) * BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && ((format4 == null || format5.A04 < format4.A04) && MosScoreCalculation.A00(format5, A012) >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)) {
                            j9 = A015.A02;
                            j10 = j;
                            format4 = format5;
                        }
                    }
                    i8++;
                    i6 = A012;
                }
                if (d2v3.A05) {
                    z4 = false;
                } else {
                    z4 = d2v3.A03.A0o;
                }
                if (format != null) {
                    int i9 = format.A04;
                    if (format2 != null) {
                        if (format2.A04 > i9) {
                        }
                    }
                    if (!(format2 == null || format == null || (str = format2.A0Q) == null || str.equals(format.A0Q)) || (format2 == null && format != null)) {
                        arrayList2.add(D2b.PREFETCHING);
                    }
                    if (format != null) {
                        arrayList2.add(D2b.FORCE_LOWEST);
                        d3w = new D3W(format3, j7, j8, i3, arrayList2);
                    } else if (MosScoreCalculation.A00(format, i6) >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || format4 == null) {
                        arrayList2.add(D2b.CHOOSE_BASED_ON_BANDWIDTH);
                        d3w = new D3W(format, j12, j11, i3, arrayList2);
                    } else {
                        arrayList2.add(D2b.SOFT_MOS);
                        d3w = new D3W(format4, j9, j10, i3, arrayList2);
                    }
                }
                format = format2;
                arrayList2.add(D2b.PREFETCHING);
                if (format != null) {
                }
            }
            Format format6 = d3w.A03;
            List list7 = list4;
            d4l2 = null;
            if (format6 != null) {
                Iterator it3 = list7.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    C29677D4l d4l5 = (C29677D4l) it3.next();
                    if (d4l5.A01.A0Q.equals(format6.A0Q)) {
                        d4l2 = d4l5;
                        break;
                    }
                }
            }
        }
        C29644D3b d3b = new C29644D3b(this);
        VideoSource videoSource3 = videoPrefetchRequest2.A09;
        D4A A032 = A03(videoSource3.A0D, videoPrefetchRequest2.A02, d4l2, d4l, videoSource3.A0K, str3, d292);
        HeroPlayerSetting heroPlayerSetting = this.A09;
        if (this.A06.Ai3() || heroPlayerSetting.A0k) {
            VideoSource videoSource4 = videoPrefetchRequest2.A09;
            dci = new DCI(videoSource4.A0D, BME.A00, d292, 1, false, videoSource4.A0J, videoSource4.A0K, str3, heroPlayerSetting.A1U);
        }
        HeroPlayerSetting heroPlayerSetting2 = this.A09;
        boolean z8 = heroPlayerSetting2.A1X;
        if (z8 && videoPrefetchRequest2.A02 > 0) {
            z = true;
        }
        z = false;
        boolean z9 = false;
        if (d4l != null) {
            z9 = true;
        }
        if (heroPlayerSetting2.A1b && !videoPrefetchRequest2.A0E) {
            z2 = true;
        }
        z2 = false;
        D2N d2n = new D2N(this, z9, z, z2, str3, videoPrefetchRequest2, d292, d2u2, d4l, A032);
        if (z8 && videoPrefetchRequest2.A02 > 0) {
            z3 = true;
        }
        z3 = false;
        D2H d2h = new D2H(this, d4l2, z3, dci, d1k2, d352, d2v2, list4, d4l3, size, d3b, i, arrayList, str3, d3w, videoPrefetchRequest2, d292, d2u2, A032, z9);
        if (!heroPlayerSetting2.A1M) {
            if (heroPlayerSetting2.A1N) {
                VideoSource videoSource5 = videoPrefetchRequest2.A09;
                if (videoSource5.A0K) {
                }
            }
            d2h.run();
            d2n.run();
            return;
        }
        if (videoPrefetchRequest2.A0A != Constants.ONE) {
            d2n.run();
            d2h.run();
            return;
        }
        d2h.run();
        d2n.run();
        return;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
        if ("ig_stories".equals(r1.A09) != false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    public final void A05(C29605D1k d1k, D19 d19, D29 d29, VideoPrefetchRequest videoPrefetchRequest, String str, String str2, boolean z, Integer num, boolean z2, boolean z3, boolean z4, D2U d2u, C29677D4l d4l, D49 d49, D35 d35, D2V d2v) {
        boolean A012;
        int i;
        String str3 = str;
        VideoPrefetchRequest videoPrefetchRequest2 = videoPrefetchRequest;
        D29 d292 = d29;
        C29605D1k d1k2 = d1k;
        Integer num2 = num;
        if (!this.A09.A1X || C40751pB.PROGRESSIVE == videoPrefetchRequest2.A09.A06) {
            if (C40751pB.PROGRESSIVE == videoPrefetchRequest2.A09.A06 && videoPrefetchRequest2.A02 == 0) {
                C25947Bcz bcz = this.A04;
                if (bcz == null) {
                    A012 = false;
                } else {
                    A012 = bcz.A01();
                }
                if (A012) {
                    i = this.A09.A0G;
                } else {
                    i = this.A09.A0F;
                }
                videoPrefetchRequest2.A02 = i;
            }
            HeroPlayerSetting heroPlayerSetting = this.A09;
            D1L d1l = this.A07;
            D19 d192 = d19;
            boolean z5 = z4;
            C29603D1i d1i = this.A0A;
            D2O d2o = new D2O(heroPlayerSetting, d1l, d1k2, d192, d292, videoPrefetchRequest2, str3, str2, z, num2, d1i, z2, z3, z5, d4l, ((Boolean) this.A01.get()).booleanValue());
            C40431oe.A01("UnifiedPrefetchManager", "video: %s queuing prefetch task", str);
            A02(this, d2o, videoPrefetchRequest2.A0A);
            return;
        }
        D35 d352 = d35;
        D2V d2v2 = d2v;
        D49 d492 = d49;
        D2U d2u2 = d2u;
        D29 d293 = d292;
        VideoPrefetchRequest videoPrefetchRequest3 = videoPrefetchRequest2;
        Integer num3 = num2;
        C29605D1k d1k3 = d1k2;
        D2Q A013 = A01(d293, videoPrefetchRequest3, str3, false, num3, d492, d2u2, d1k3, d352, d2v2, 1);
        D2Q A014 = A01(d293, videoPrefetchRequest3, str3, true, num3, d492, d2u2, d1k3, d352, d2v2, 2);
        HeroPlayerSetting heroPlayerSetting2 = this.A09;
        if (!heroPlayerSetting2.A1M) {
            if (heroPlayerSetting2.A1N) {
                VideoSource videoSource = videoPrefetchRequest2.A09;
                if (videoSource.A0K) {
                }
            }
            if (A014 != null) {
                C40431oe.A01("UnifiedPrefetchManager", "video: %s queuing dash video prefetch task", str);
                A02(this, A014, videoPrefetchRequest2.A0A);
            }
            if (A013 == null) {
                C40431oe.A01("UnifiedPrefetchManager", "video: %s queuing dash audio prefetch task", str);
                A02(this, A013, videoPrefetchRequest2.A0A);
                return;
            }
            return;
        }
        if (videoPrefetchRequest2.A0A != Constants.ONE) {
            if (A013 != null) {
                C40431oe.A01("UnifiedPrefetchManager", "video: %s queuing dash audio prefetch task", str);
                A02(this, A013, videoPrefetchRequest2.A0A);
            }
            if (A014 != null) {
                C40431oe.A01("UnifiedPrefetchManager", "video: %s queuing dash video prefetch task", str);
                A02(this, A014, videoPrefetchRequest2.A0A);
                return;
            }
            return;
        }
        if (A014 != null) {
        }
        if (A013 == null) {
        }
    }

    public final void A06(String str, String str2, C29605D1k d1k, D19 d19, D29 d29, String str3, int i, int i2, C29677D4l d4l, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, Integer num2, VideoPlayContextualSetting videoPlayContextualSetting, long j, boolean z6) {
        int i4;
        String str4 = str3;
        C29677D4l d4l2 = d4l;
        Format format = d4l2.A01;
        C40431oe.A01("UnifiedPrefetchManager", "video: %s representation id: %s, width: %d is being prefetched", str3, format.A0Q, Integer.valueOf(format.A0F));
        ArrayList<Pair> arrayList = new ArrayList<>();
        int i5 = i;
        if (d4l2.A01() != null) {
            C29622D2e d2e = d4l2.A02;
            arrayList.add(new Pair(d2e.A00(d4l2.A03), Integer.valueOf((int) d2e.A01)));
            D3T A012 = d4l2.A01();
            int ALp = (int) A012.ALp();
            int AVT = (A012.AVT((long) i5) + ALp) - 1;
            if (AVT == -1) {
                AVT = ALp;
            }
            int i6 = i3;
            while (ALp <= AVT) {
                long j2 = (long) ALp;
                C29622D2e AVW = A012.AVW(j2);
                int i7 = (int) AVW.A01;
                long AKh = A012.AKh(j2, -9223372036854775807L);
                if (i7 < 0) {
                    i7 = (int) (((((float) AKh) / 1000000.0f) * ((float) d4l2.A01.A04)) / 8.0f);
                }
                if (AKh <= 0) {
                    i4 = -1;
                } else {
                    i4 = i3;
                    if (i6 < i7) {
                        i4 = i6;
                    }
                }
                arrayList.add(new Pair(AVW.A00(d4l2.A03), Integer.valueOf(i4)));
                i6 -= i7;
                if (i6 < 0) {
                    break;
                }
                ALp++;
            }
        } else {
            arrayList.add(new Pair(d4l2.A02.A00(d4l2.A03), Integer.valueOf(i3)));
        }
        for (Pair pair : arrayList) {
            int intValue = ((Integer) pair.second).intValue();
            C40431oe.A01("UnifiedPrefetchManager", "video: %s url: %s %d", str3, pair.first, Integer.valueOf(intValue));
            VideoSource videoSource = new VideoSource((Uri) pair.first, str4, (String) null, (String) null, (Uri) null, str, str2, C40751pB.DASH_VOD, (String) null, z, z2, false, false, Collections.emptyMap(), C40761pD.A01(num2), C40771pE.GENERAL);
            String A032 = d4l2.A03();
            Format format2 = d4l2.A01;
            int i8 = i2;
            Integer num3 = num;
            VideoPrefetchRequest videoPrefetchRequest = new VideoPrefetchRequest(videoSource, A032, intValue, i8, 0, format2.A04, format2.A0P, i5, "UnifiedPrefetchManager", C40781pF.PREFETCH, num3, videoPlayContextualSetting, j, true, z6);
            D29 d292 = d29;
            D19 d192 = d19;
            C29605D1k d1k2 = d1k;
            boolean z7 = z5;
            boolean z8 = z4;
            boolean z9 = z3;
            if (!this.A09.A1X) {
                String str5 = format2.A0Q;
                boolean z10 = false;
                if (i8 == 2) {
                    z10 = true;
                }
                A05(d1k2, d192, d292, videoPrefetchRequest, str4, str5, z10, num3 == Constants.A0N ? Constants.A0C : Constants.ONE, z9, z8, z7, (D2U) null, d4l2, (D49) null, (D35) null, (D2V) null);
            } else {
                try {
                    this.A07.A08(videoPrefetchRequest, d1k2, d192, d292, this.A0A, z9, z8, z7, d4l2, ((Boolean) this.A01.get()).booleanValue());
                } catch (Exception e) {
                    C40431oe.A05("UnifiedPrefetchManager", e, "prefetch sync failed with exception", new Object[0]);
                }
            }
        }
    }
}
