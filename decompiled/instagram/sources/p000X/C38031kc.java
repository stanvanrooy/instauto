package p000X;

import android.os.Environment;
import android.os.SystemClock;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.1kc  reason: invalid class name and case insensitive filesystem */
public final class C38031kc extends C28691Ms {
    public static final String A0c = (Environment.getExternalStorageDirectory() + "/.InstagramLive");
    public String A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public ImageUrl A06;
    public C38091ki A07;
    public C38051ke A08;
    public C23520APq A09;
    public AnonymousClass7LM A0A;
    public C23495AOr A0B;
    public C13300iJ A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public List A0T = new ArrayList();
    public List A0U = new ArrayList();
    public Set A0V = new HashSet();
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y = false;
    public boolean A0Z;
    public final C38041kd A0a = new C38041kd(this);
    public final Set A0b = new HashSet();

    public static String A00(String str) {
        return String.format("%s/tmp_live_%s_thumb.jpg", new Object[]{A0c, str});
    }

    public final ImageUrl A01() {
        ImageUrl imageUrl = this.A06;
        if (!C46361zc.A02(imageUrl)) {
            return imageUrl;
        }
        File file = new File(A00(this.A0I));
        if (!file.exists()) {
            return null;
        }
        C46361zc.A01(file);
        return null;
    }

    public final C37671k2 A02(AnonymousClass0C1 r17) {
        AnonymousClass0C1 r5 = r17;
        String A032 = A03(r5);
        if (A032 != null) {
            if (this.A0N != null && ((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.LOW_LATENCY_CONSUMPTION, "is_client_cdn_log_enabled", false, (AnonymousClass04H) null)).booleanValue() && this.A00 == null) {
                this.A00 = UUID.nameUUIDFromBytes(AnonymousClass000.A0E(this.A0I, this.A0C.getId()).getBytes()).toString();
            }
            return new C37671k2(Constants.A0N, (AnonymousClass1YR) null, this.A0I, (C37661k1[]) null, (String) null, A032, (String) null, (Integer) null, (String) null, this.A00, false, (C37691k4) null, false, this.A0Z, false);
        }
        String str = this.A0L;
        if (str == null) {
            return null;
        }
        return new C37671k2(Constants.A0Y, (AnonymousClass1YR) null, this.A0I, (C37661k1[]) null, (String) null, (String) null, str, (Integer) null, (String) null, (String) null, false, (C37691k4) null, false, false, false);
    }

    public final String A03(AnonymousClass0C1 r6) {
        String str;
        String str2;
        if (this.A0N != null && ((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.LOW_LATENCY_CONSUMPTION, "is_prediction_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return this.A0N;
        }
        if (this.A0K == null || ((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.LOW_LATENCY_CONSUMPTION, "is_abr_disabled", false, (AnonymousClass04H) null)).booleanValue()) {
            str = this.A0M;
        } else {
            str = this.A0K;
        }
        if (str == null || str.contains("&ms=") || (str2 = (String) AnonymousClass0L6.A02(r6, AnonymousClass0L7.VIDEO_EXOPLAYER_2, "group_id", "", (AnonymousClass04H) null)) == null || str2.isEmpty()) {
            return str;
        }
        return C06360Ot.formatString("%s&ms=%s", str, str2);
    }

    public final Set A04() {
        return Collections.unmodifiableSet(this.A0V);
    }

    public final void A05(C38031kc r3) {
        AnonymousClass0a4.A0A(this.A0I.equals(r3.A0I));
        AnonymousClass0a4.A09(this.A0C.equals(r3.A0C));
        AnonymousClass0a4.A09(this.A0P.equals(r3.A0P));
        if (!C46361zc.A02(r3.A01())) {
            this.A06 = r3.A01();
            SystemClock.elapsedRealtime();
        }
        this.A0M = r3.A0M;
        this.A0K = r3.A0K;
        this.A0N = r3.A0N;
        this.A0L = r3.A0L;
        this.A03 = r3.A03;
        this.A02 = r3.A02;
        this.A05 = r3.A05;
        this.A04 = r3.A04;
        this.A0E = r3.A0E;
        this.A0X = r3.A0X;
        this.A08 = r3.A08;
        this.A0G = r3.A0G;
        this.A0H = r3.A0H;
        this.A0Q = r3.A0Q;
        this.A0O = r3.A0O;
        this.A01 = r3.A01;
        this.A0R = r3.A0R;
        this.A0W = r3.A0W;
        if (!r3.A0T.isEmpty()) {
            this.A0T = r3.A0T;
        }
        if (!r3.A0U.isEmpty()) {
            this.A0U = r3.A0U;
        }
        Set set = r3.A0V;
        this.A0V.clear();
        this.A0V.addAll(set);
        this.A0F = r3.A0F;
        this.A0Z = r3.A0Z;
        this.A07 = r3.A07;
        this.A0Y = r3.A0Y;
        this.A09 = r3.A09;
        this.A0B = r3.A0B;
        this.A0S = r3.A0S;
        this.A0J = r3.A0J;
    }

    public final boolean A07(AnonymousClass0C1 r5) {
        C38091ki r0 = this.A07;
        if (r0 == null || r0.A00 != C49042Am.SENSITIVE || this.A0Y || !((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.LIVE_SENSITIVITY_GATING, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A06(AnonymousClass0C1 r7) {
        if (!C16180oA.A00(r7).A00.getBoolean("allow_expired_replays", false) && (this.A05 * 1000) + 86400000 < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}
