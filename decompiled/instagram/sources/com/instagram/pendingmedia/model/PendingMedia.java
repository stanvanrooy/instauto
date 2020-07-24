package com.instagram.pendingmedia.model;

import android.graphics.Rect;
import com.android.internal.util.Predicate;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.venue.Venue;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.MediaStreamTrack;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0P6;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass20G;
import p000X.AnonymousClass20J;
import p000X.AnonymousClass20M;
import p000X.AnonymousClass20O;
import p000X.AnonymousClass22C;
import p000X.AnonymousClass2CZ;
import p000X.AnonymousClass2FT;
import p000X.AnonymousClass4S9;
import p000X.AnonymousClass5NO;
import p000X.C06360Ot;
import p000X.C106644iq;
import p000X.C106894jG;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13920jT;
import p000X.C156146lf;
import p000X.C161316uR;
import p000X.C185087vV;
import p000X.C23160zf;
import p000X.C249616t;
import p000X.C32621bZ;
import p000X.C34561ew;
import p000X.C35981hF;
import p000X.C37171jE;
import p000X.C42271s4;
import p000X.C42281s6;
import p000X.C42291s7;
import p000X.C42301s8;
import p000X.C42311s9;
import p000X.C42321sA;
import p000X.C42331sB;
import p000X.C42341sC;
import p000X.C42351sD;
import p000X.C42361sE;
import p000X.C42421sK;
import p000X.C43341uF;
import p000X.C43371uI;
import p000X.C43491uV;
import p000X.C46551zw;

public final class PendingMedia implements C249616t, C42281s6 {
    public static final Class A3O = PendingMedia.class;
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public long A0S;
    public long A0T;
    public long A0U;
    public long A0V;
    public long A0W;
    public long A0X;
    public long A0Y;
    public long A0Z;
    public long A0a;
    public long A0b;
    public BackgroundGradientColors A0c;
    public AnonymousClass1NJ A0d;
    public C156146lf A0e;
    public C37171jE A0f;
    public MediaType A0g;
    public Venue A0h;
    public AnonymousClass2CZ A0i;
    public BrandedContentTag A0j;
    public C42351sD A0k;
    public ClipInfo A0l;
    public AnonymousClass4S9 A0m;
    public C42291s7 A0n;
    public AnonymousClass20J A0o;
    public AnonymousClass20G A0p;
    public C46551zw A0q;
    public C42311s9 A0r;
    public C43371uI A0s;
    public AnonymousClass5NO A0t;
    public C42421sK A0u;
    public C42421sK A0v;
    public C42361sE A0w;
    public AnonymousClass2FT A0x;
    public C42341sC A0y;
    public C43341uF A0z;
    public C185087vV A10;
    public C42331sB A11;
    public AnonymousClass20O A12;
    public C42301s8 A13;
    public C42321sA A14;
    public ShareType A15;
    public AnonymousClass22C A16;
    public C35981hF A17;
    public Boolean A18;
    public Boolean A19;
    public Boolean A1A;
    public Boolean A1B;
    public Double A1C;
    public Integer A1D;
    public Integer A1E;
    public Integer A1F;
    public Integer A1G;
    public Integer A1H;
    public Integer A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public String A1M;
    public String A1N;
    public String A1O;
    public String A1P;
    public String A1Q;
    public String A1R;
    public String A1S;
    public String A1T;
    public String A1U;
    public String A1V;
    public String A1W;
    public String A1X;
    public String A1Y;
    public String A1Z;
    public String A1a;
    public String A1b;
    public String A1c;
    public String A1d;
    public String A1e;
    public String A1f;
    public String A1g;
    public String A1h;
    public String A1i;
    public String A1j;
    public String A1k;
    public String A1l;
    public String A1m;
    public String A1n;
    public String A1o;
    public String A1p;
    public String A1q;
    public String A1r;
    public String A1s;
    public String A1t;
    public String A1u;
    public String A1v;
    public String A1w;
    public String A1x;
    public String A1y;
    public String A1z;
    public String A20;
    public String A21;
    public String A22;
    public String A23;
    public String A24;
    public String A25;
    public String A26;
    public String A27;
    public String A28;
    public String A29;
    public String A2A;
    public ArrayList A2B;
    public ArrayList A2C;
    public ArrayList A2D;
    public ArrayList A2E;
    public ArrayList A2F;
    public HashMap A2G;
    public HashMap A2H;
    public HashMap A2I;
    public List A2J;
    public List A2K;
    public List A2L;
    public List A2M;
    public List A2N;
    public List A2O;
    public List A2P;
    public List A2Q;
    public List A2R;
    public List A2S;
    public List A2T;
    public List A2U;
    public List A2V;
    public List A2W;
    public List A2X;
    public List A2Y;
    public List A2Z;
    public Set A2a;
    public Set A2b;
    public boolean A2c;
    public boolean A2d;
    public boolean A2e;
    public boolean A2f;
    public boolean A2g;
    public boolean A2h;
    public boolean A2i;
    public boolean A2j;
    public boolean A2k;
    public boolean A2l;
    public boolean A2m;
    public boolean A2n;
    public boolean A2o;
    public boolean A2p;
    public boolean A2q;
    public boolean A2r;
    public boolean A2s;
    public boolean A2t;
    public boolean A2u;
    public boolean A2v;
    public boolean A2w;
    public boolean A2x;
    public boolean A2y;
    public boolean A2z;
    public boolean A30;
    public boolean A31;
    public boolean A32;
    public boolean A33;
    public boolean A34;
    public boolean A35;
    public boolean A36;
    public boolean A37;
    public boolean A38;
    public boolean A39;
    public boolean A3A;
    public boolean A3B;
    public boolean A3C;
    public boolean A3D;
    public final Set A3E;
    public volatile C42421sK A3F;
    public volatile boolean A3G;
    public volatile boolean A3H;
    public volatile boolean A3I;
    public volatile boolean A3J;
    public transient C42361sE A3K;
    public transient Runnable A3L;
    public transient boolean A3M;
    public transient boolean A3N;

    public static synchronized void A06(PendingMedia pendingMedia) {
        synchronized (pendingMedia) {
            if (!pendingMedia.A3N) {
                for (C32621bZ BGJ : new ArrayList(pendingMedia.A3E)) {
                    BGJ.BGJ(pendingMedia);
                }
            }
        }
    }

    public final synchronized int A08() {
        int i;
        i = 0;
        for (C23160zf Aem : this.A2T) {
            if (Aem.Aem()) {
                i++;
            }
        }
        return i;
    }

    public final C43371uI A0C() {
        synchronized (this) {
            if (this.A0s == null) {
                this.A0s = new C43371uI();
            }
        }
        return this.A0s;
    }

    public final synchronized C23160zf A0D(Class cls) {
        for (C23160zf r1 : this.A2T) {
            if (!r1.Aem() && cls.isAssignableFrom(r1.getClass())) {
                return (C23160zf) cls.cast(r1);
            }
        }
        return null;
    }

    public final synchronized List A0J() {
        return this.A2J;
    }

    public final synchronized List A0K() {
        return this.A2K;
    }

    public final synchronized List A0L(Predicate predicate) {
        return A0N(C23160zf.class, predicate);
    }

    public final synchronized List A0M(Class cls) {
        return A0N(cls, (Predicate) null);
    }

    public final synchronized List A0N(Class cls, Predicate predicate) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C23160zf r1 : this.A2T) {
            if (cls.isAssignableFrom(r1.getClass())) {
                C23160zf r12 = (C23160zf) cls.cast(r1);
                if (predicate == null || predicate.apply(r12)) {
                    arrayList.add(r12);
                }
            }
        }
        return arrayList;
    }

    public final synchronized void A0T() {
        if (this.A3N) {
            this.A3N = false;
            A06(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r6 == false) goto L_0x000c;
     */
    public final synchronized void A0V(long j, boolean z) {
        boolean z2;
        this.A0W = j;
        if (j > 0) {
            z2 = true;
        }
        z2 = false;
        this.A3J = z2;
        A06(this);
    }

    public final synchronized void A0X(C32621bZ r2) {
        this.A3E.add(r2);
    }

    public final synchronized void A0Y(C32621bZ r2) {
        this.A3E.remove(r2);
    }

    public final synchronized void A0a(C42421sK r2) {
        C42421sK r0 = this.A0u;
        if (r0 == null || r2.A00(r0)) {
            this.A0u = r2;
        }
    }

    public final synchronized void A0b(C23160zf r2) {
        this.A2T.add(r2);
    }

    public final synchronized boolean A0y() {
        boolean z;
        z = false;
        if (A0D(C23160zf.class) != null) {
            z = true;
        }
        return z;
    }

    public final synchronized boolean A0z() {
        boolean z;
        z = false;
        if (this.A0W > 0) {
            z = true;
        }
        return z;
    }

    public final synchronized boolean A10() {
        boolean z;
        z = true;
        if (A0q() && A0J() != null) {
            Iterator it = A0J().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((PendingMedia) it.next()).A10()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!(this.A0v == this.A3F && this.A0u == null)) {
            if (this.A2c && this.A3F == C42421sK.CONFIGURED && !A0y()) {
                if (this.A2s) {
                }
            }
        }
        z = false;
        return z;
    }

    public final String AWS(AnonymousClass0C1 r2) {
        return null;
    }

    public final boolean Afk() {
        return false;
    }

    public final boolean Agp() {
        return false;
    }

    public final boolean Aho() {
        return false;
    }

    public synchronized C42421sK getReturnToServerStatusRequest() {
        return this.A0u;
    }

    public static PendingMedia A02(String str) {
        PendingMedia pendingMedia = new PendingMedia(str);
        pendingMedia.A0g = MediaType.PHOTO;
        return pendingMedia;
    }

    public static PendingMedia A03(String str) {
        PendingMedia pendingMedia = new PendingMedia(str);
        pendingMedia.A0g = MediaType.VIDEO;
        return pendingMedia;
    }

    public static String A04(MediaType mediaType) {
        if (mediaType == MediaType.PHOTO) {
            return "photo";
        }
        if (mediaType == MediaType.VIDEO) {
            return MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        if (mediaType == MediaType.CAROUSEL) {
            return "album";
        }
        if (mediaType == MediaType.AUDIO) {
            return MediaStreamTrack.AUDIO_TRACK_KIND;
        }
        throw new RuntimeException(AnonymousClass000.A0E("Unknown MediaType ", mediaType.toString()));
    }

    public static void A05(PendingMedia pendingMedia) {
        ShareType shareType;
        Boolean bool = pendingMedia.A18;
        if (bool != null && bool.booleanValue()) {
            shareType = ShareType.DIRECT_SHARE;
        } else if (pendingMedia.A2v) {
            shareType = ShareType.REEL_SHARE;
        } else {
            shareType = ShareType.UNKNOWN;
        }
        pendingMedia.A15 = shareType;
    }

    public final Rect A09() {
        return new Rect(((Integer) this.A2O.get(0)).intValue(), ((Integer) this.A2O.get(1)).intValue(), ((Integer) this.A2O.get(2)).intValue(), ((Integer) this.A2O.get(3)).intValue());
    }

    public final AnonymousClass20J A0B() {
        AnonymousClass20G r1 = this.A0p;
        if (r1 == null) {
            return null;
        }
        AnonymousClass20J r0 = r1.A00;
        if (r0 != null || (r0 = r1.A01) != null || (r0 = r1.A02) != null) {
            return r0;
        }
        throw new IllegalStateException("No configuration set");
    }

    public final ShareType A0E() {
        if (this.A15 == null) {
            A05(this);
            AnonymousClass0QD.A03("sharetype_null", C06360Ot.formatString("uploadid:%s,new mShareType:%s,waterfall:%s", this.A24, this.A15, A0G()), HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
        }
        return this.A15;
    }

    public final Integer A0F(String str) {
        ArrayList arrayList = this.A2F;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C161316uR r1 = (C161316uR) it.next();
                if (r1.A01.equals(str)) {
                    return r1.A00;
                }
            }
        }
        AnonymousClass0QD.A02(A3O.getSimpleName(), AnonymousClass000.A0J("Target user id ", str, "does not exist in cross posting configure target list!"));
        return Constants.A0N;
    }

    public final String A0G() {
        if (this.A1U == null) {
            this.A1U = C13920jT.A00("capture_flow_v2").A05();
        }
        return this.A1U;
    }

    public final String A0H() {
        C42331sB r5 = this.A11;
        Integer A002 = C42331sB.A00(this.A0v, A0x());
        HashMap hashMap = new HashMap();
        hashMap.put("num_reupload", Integer.valueOf(r5.A00));
        List list = r5.A02;
        int intValue = A002.intValue();
        hashMap.put("num_step_manual_retry", list.get(intValue));
        hashMap.put("num_step_auto_retry", r5.A01.get(intValue));
        return new JSONObject(hashMap).toString();
    }

    public final List A0I() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.A2F;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C161316uR) it.next()).A01);
            }
        }
        return arrayList;
    }

    public final void A0O() {
        this.A0C++;
        C42331sB r3 = this.A11;
        Integer A002 = C42331sB.A00(this.A0v, A0x());
        List list = r3.A01;
        int intValue = A002.intValue();
        r3.A01.set(intValue, Integer.valueOf(((Integer) list.get(intValue)).intValue() + 1));
    }

    public final void A0P() {
        this.A0N++;
        this.A0H += this.A0C;
        this.A0C = 0;
        C42331sB r3 = this.A11;
        Integer A002 = C42331sB.A00(this.A0v, A0x());
        List list = r3.A02;
        int intValue = A002.intValue();
        r3.A02.set(intValue, Integer.valueOf(((Integer) list.get(intValue)).intValue() + 1));
    }

    public final void A0R() {
        Runnable runnable = this.A3L;
        if (runnable != null) {
            runnable.run();
        } else {
            AnonymousClass0QD.A02("pendingmedia_no_serializer", "PendingMedia.serialize was invoked without a serializer set.");
        }
    }

    public final synchronized void A0S() {
        if (this.A2a == null) {
            this.A2a = new HashSet();
        }
        this.A2a.add("has-overlay");
    }

    public final void A0U(int i, int i2) {
        this.A0P = i;
        this.A0O = i2;
    }

    public final void A0W(AnonymousClass20J r2) {
        if (r2 == null) {
            this.A0p = null;
        } else {
            this.A0p = new AnonymousClass20G(r2);
        }
    }

    public final void A0Z(C42421sK r3) {
        this.A0v = r3;
        if (r3 == C42421sK.CONFIGURED) {
            this.A0S = System.currentTimeMillis();
        }
        A06(this);
    }

    public final void A0d(AnonymousClass20M r5, double d) {
        double max = Math.max(0.0d, Math.min(d, 1.0d));
        int A002 = this.A0y.A00();
        this.A0y.A01(r5, max);
        if (this.A0y.A00() != A002) {
            A06(this);
        }
    }

    public final void A0e(String str) {
        if (str == null) {
            this.A14.A03 = null;
            return;
        }
        C42321sA r3 = this.A14;
        AnonymousClass0a4.A07(str, "ssim compare video path cannot be null");
        String str2 = r3.A03;
        if (str2 != null && !str2.equals(str)) {
            AnonymousClass0QD.A02("overwriting_ssim_compare_video_path", AnonymousClass000.A0N("old ", str2, " new ", str));
        }
        r3.A03 = str;
    }

    public final void A0f(String str) {
        if (str == null || str.matches("\\d+")) {
            this.A1r = str;
            return;
        }
        AnonymousClass0QD.A02(A3O.toString(), AnonymousClass000.A0E("setPostCaptureAREffectId() effectId in wrong format: ", str));
        this.A1r = null;
    }

    public final void A0g(String str) {
        long A022;
        this.A1t = str;
        if (str == null) {
            A022 = -1;
        } else {
            A022 = AnonymousClass0P6.A02(str);
        }
        this.A0Y = A022;
    }

    public final void A0h(String str, int i) {
        float f;
        if (this.A0g == MediaType.PHOTO) {
            this.A0g = MediaType.VIDEO;
            if (this.A1r == null) {
                f = ((float) this.A0G) / ((float) this.A0F);
            } else {
                f = this.A0l.A02;
            }
            this.A28 = str;
            this.A04 = f;
            this.A33 = true;
            ClipInfo clipInfo = new ClipInfo();
            clipInfo.A05 = -1;
            clipInfo.A02(this.A0G, this.A0F);
            clipInfo.A0D = 0;
            clipInfo.A02 = f;
            clipInfo.A08 = 0;
            clipInfo.A06 = i;
            long j = (long) i;
            clipInfo.A0B = j;
            clipInfo.A04(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(clipInfo);
            this.A2L = arrayList;
            if (this.A1r == null) {
                this.A0l = clipInfo;
            } else {
                ClipInfo clipInfo2 = this.A0l;
                clipInfo2.A05 = -1;
                clipInfo2.A0D = 0;
                clipInfo2.A08 = 0;
                clipInfo2.A06 = i;
                clipInfo2.A0B = j;
                clipInfo2.A04(str);
            }
            this.A37 = true;
            this.A1g = null;
            return;
        }
        throw new IllegalStateException("convertPhotoToVideo can only be called on PHOTO pending media");
    }

    public final void A0i(String str, Integer num) {
        ArrayList arrayList = this.A2F;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C161316uR r1 = (C161316uR) it.next();
                if (r1.A01.equals(str)) {
                    r1.A00 = num;
                }
            }
        }
    }

    public final void A0j(List list) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PendingMedia pendingMedia = (PendingMedia) it.next();
            arrayList2.add(pendingMedia.A1h);
            pendingMedia.A0X(new C106894jG(this));
        }
        synchronized (this) {
            this.A2J = Collections.unmodifiableList(arrayList);
            this.A2K = Collections.unmodifiableList(arrayList2);
        }
    }

    public final void A0k(boolean z) {
        C42421sK r0;
        C42421sK r02;
        this.A2u = z;
        if (z) {
            r0 = C42421sK.DRAFT;
        } else {
            r0 = C42421sK.NOT_UPLOADED;
        }
        this.A0v = r0;
        if (z) {
            r02 = C42421sK.DRAFT;
        } else {
            r02 = C42421sK.NOT_UPLOADED;
        }
        this.A3F = r02;
    }

    public final boolean A0l() {
        if (this.A3H || this.A2x) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r6.A03 == 0.0d) goto L_0x0019;
     */
    public final boolean A0m() {
        boolean z;
        String str = this.A1T;
        if (str == null || str.isEmpty()) {
            if (this.A02 != 0.0d) {
                z = true;
            }
            z = false;
            if (!z) {
                boolean z2 = false;
                if (this.A0h != null) {
                    z2 = true;
                }
                if (!z2 && !(!this.A2B.isEmpty()) && !A0o() && !Abe()) {
                    boolean z3 = false;
                    if (this.A1Y != null) {
                        z3 = true;
                    }
                    if (z3) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean A0n() {
        if (C106644iq.A00(this.A2S) != null) {
            return true;
        }
        return false;
    }

    public final boolean A0p() {
        List list = this.A2R;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean A0q() {
        if (this.A0g == MediaType.CAROUSEL) {
            return true;
        }
        return false;
    }

    public final boolean A0r() {
        if (this.A1q != null) {
            return true;
        }
        return false;
    }

    public final boolean A0s() {
        if (this.A15 == ShareType.CLIPS) {
            return true;
        }
        return false;
    }

    public final boolean A0t() {
        ShareType shareType = ShareType.IGTV;
        ShareType shareType2 = this.A15;
        if (shareType.equals(shareType2) || ShareType.IGTV_REACTION.equals(shareType2)) {
            return true;
        }
        return false;
    }

    public final boolean A0u() {
        if (this.A0g == MediaType.PHOTO) {
            return true;
        }
        return false;
    }

    public final boolean A0v() {
        if (this.A0g != MediaType.PHOTO) {
            return false;
        }
        if (this.A2k || A0n() || this.A1r != null) {
            return true;
        }
        return false;
    }

    public final boolean A0w() {
        C34561ew A002 = C106644iq.A00(this.A2S);
        C156146lf r1 = this.A0e;
        if (A002 != null && (!A002.A04.A01())) {
            return true;
        }
        if (r1 == null || !r1.A02) {
            return false;
        }
        return true;
    }

    public final boolean A0x() {
        if (this.A0g == MediaType.VIDEO) {
            return true;
        }
        return false;
    }

    public final boolean A11(Set set) {
        if (this.A2c) {
            return !A0N(C23160zf.class, new C43491uV(this, set)).isEmpty();
        }
        return set.contains(A0E());
    }

    public final C37171jE AGF() {
        C37171jE r0 = this.A0f;
        if (r0 != null) {
            return r0;
        }
        return C37171jE.DEFAULT;
    }

    public final boolean Abe() {
        if (this.A0j != null) {
            return true;
        }
        return false;
    }

    public final boolean Ae9() {
        return this.A2d;
    }

    public final boolean AfQ() {
        return this.A2j;
    }

    public final boolean Agk() {
        return this.A35;
    }

    public final boolean AiE() {
        return this.A3C;
    }

    public final boolean AiF() {
        return this.A3D;
    }

    public final boolean ApG() {
        return ShareType.IGTV.equals(this.A15);
    }

    public final String getId() {
        return this.A24;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Media type:");
        sb.append(this.A0g);
        sb.append("\tkey: ");
        sb.append(this.A1h);
        sb.append("\nServer Status: ");
        sb.append(this.A0v);
        sb.append("\nTarget Status: ");
        sb.append(this.A3F);
        if (this.A0g == MediaType.VIDEO) {
            sb.append("\nSession name: ");
            sb.append(this.A28);
            sb.append("\nRendered Video Path: ");
            sb.append(this.A1t);
        }
        String str = this.A1j;
        if (str != null) {
            sb.append("\nLast uploaded error: ");
            sb.append(str);
            sb.append("\nLast uploaded error code: ");
            sb.append(this.A0D);
        }
        if (!this.A0r.A03.isEmpty()) {
            sb.append("\nseg children media: ");
            sb.append(this.A0r.A00());
        }
        sb.append("\nUploadJobData: ");
        sb.append(this.A25);
        return sb.toString();
    }

    public static MediaType A00(C13080hr r2) {
        String A0t2 = r2.A0t();
        if ("photo".equals(A0t2)) {
            return MediaType.PHOTO;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A0t2)) {
            return MediaType.VIDEO;
        }
        if ("album".equals(A0t2)) {
            return MediaType.CAROUSEL;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A0t2)) {
            return MediaType.AUDIO;
        }
        throw new RuntimeException(AnonymousClass000.A0E("Unknown MediaType ", A0t2));
    }

    public static PendingMedia A01(PendingMedia pendingMedia, String str) {
        try {
            C13080hr A0A2 = C12890hY.A00.A0A(C42271s4.A00(pendingMedia));
            A0A2.A0p();
            PendingMedia parseFromJson = C42271s4.parseFromJson(A0A2);
            parseFromJson.A24 = str;
            parseFromJson.A0r.A02 = str;
            parseFromJson.A1h = str;
            return parseFromJson;
        } catch (IOException unused) {
            throw new IllegalStateException("Failed to copy pending media");
        }
    }

    public final int A07() {
        if (!A0q()) {
            return this.A0y.A00();
        }
        int i = 0;
        List<PendingMedia> A0J2 = A0J();
        for (PendingMedia A072 : A0J2) {
            i += A072.A07();
        }
        return Math.round((float) (i / A0J2.size()));
    }

    public final MediaType A0A() {
        if (A0v()) {
            return MediaType.VIDEO;
        }
        return this.A0g;
    }

    public final void A0Q() {
        this.A0Z = System.currentTimeMillis() / 1000;
    }

    public final boolean A0o() {
        if (!A0q()) {
            return !this.A2D.isEmpty();
        }
        for (PendingMedia A0o2 : A0J()) {
            if (A0o2.A0o()) {
                return true;
            }
        }
        return false;
    }

    public final boolean Abg() {
        for (PendingMedia A0x2 : A0J()) {
            if (A0x2.A0x()) {
                return true;
            }
        }
        return false;
    }

    public final void A0c(ShareType shareType) {
        this.A15 = shareType;
    }

    public final void Bi7(boolean z) {
        this.A2d = z;
    }

    public final void Bi8(boolean z) {
        this.A2j = z;
    }

    public final void BiE(boolean z) {
        this.A35 = z;
    }

    public final void BiH(boolean z) {
        this.A3C = z;
    }

    public final void BiI(boolean z) {
        this.A3D = z;
    }

    public PendingMedia() {
        this.A3E = new HashSet();
        this.A0n = new C42291s7();
        this.A2y = false;
        this.A2B = new ArrayList();
        this.A2D = new ArrayList();
        this.A2C = new ArrayList();
        this.A0j = null;
        this.A2H = new HashMap();
        this.A0V = 0;
        this.A13 = new C42301s8();
        this.A0Y = -1;
        this.A2L = new ArrayList();
        this.A2q = false;
        this.A0Q = 100;
        this.A3A = true;
        this.A2T = new CopyOnWriteArrayList();
        this.A2b = new HashSet();
        this.A2J = Collections.emptyList();
        this.A2K = Collections.emptyList();
        this.A0r = new C42311s9();
        this.A14 = new C42321sA();
        this.A07 = 0;
        this.A11 = new C42331sB();
        this.A0S = -1;
        this.A0b = -1;
        this.A0y = new C42341sC();
        this.A0k = new C42351sD();
    }

    public PendingMedia(String str) {
        this.A3E = new HashSet();
        this.A0n = new C42291s7();
        this.A2y = false;
        this.A2B = new ArrayList();
        this.A2D = new ArrayList();
        this.A2C = new ArrayList();
        this.A0j = null;
        this.A2H = new HashMap();
        this.A0V = 0;
        this.A13 = new C42301s8();
        this.A0Y = -1;
        this.A2L = new ArrayList();
        this.A2q = false;
        this.A0Q = 100;
        this.A3A = true;
        this.A2T = new CopyOnWriteArrayList();
        this.A2b = new HashSet();
        this.A2J = Collections.emptyList();
        this.A2K = Collections.emptyList();
        this.A0r = new C42311s9();
        this.A14 = new C42321sA();
        this.A07 = 0;
        this.A11 = new C42331sB();
        this.A0S = -1;
        this.A0b = -1;
        this.A0y = new C42341sC();
        this.A0k = new C42351sD();
        this.A0w = C42361sE.values()[C42361sE.values().length - 1];
        this.A1h = str;
        this.A24 = str;
        C42421sK r0 = C42421sK.NOT_UPLOADED;
        this.A0v = r0;
        this.A3F = r0;
        this.A0u = null;
        this.A3I = true;
        this.A0a = System.currentTimeMillis();
        if (this.A0B == 0) {
            this.A0B = (int) System.currentTimeMillis();
        }
    }
}
