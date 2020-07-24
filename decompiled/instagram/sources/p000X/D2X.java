package p000X;

import android.content.Context;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.video.heroplayer.common.MosScoreCalculation;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D2X */
public final class D2X {
    public D31 A00;
    public D2Z A01;
    public C29620D2a A02;
    public D38 A03;
    public C29730D6u A04;
    public final C25947Bcz A05;
    public final D35 A06;
    public final D2W A07;
    public final D3U A08;
    public final D2V A09;
    public final C29623D2f A0A;
    public final C29605D1k A0B;
    public final List A0C;
    public final List A0D;
    public volatile String A0E;
    public volatile Format[] A0F;

    private List A00(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split(",")) {
                char c = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != -823214357) {
                    if (hashCode != 1938839408) {
                        if (hashCode == 2142253139 && str2.equals("VISUAL_QUALITY_SCORE")) {
                            c = 2;
                        }
                    } else if (str2.equals("MOS_AWARE")) {
                        c = 1;
                    }
                } else if (str2.equals("MAX_WIDTH")) {
                    c = 0;
                }
                if (!(c == 0 || c == 1)) {
                    if (c != 2) {
                        this.A06.A02();
                    } else {
                        D2V d2v = this.A09;
                        if (d2v.A03.A0n) {
                            arrayList.add(new D2c(d2v));
                            hashSet.add(str2);
                        }
                    }
                }
            }
        }
        if (z) {
            boolean contains = hashSet.contains("MAX_WIDTH");
        } else if (!hashSet.contains("MAX_WIDTH")) {
            return arrayList;
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r0 != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r15 >= r0) goto L_0x0069;
     */
    public static Format[] A01(D2X d2x, Format[] formatArr, List list, D4H d4h) {
        boolean z;
        boolean A012;
        float f;
        Format[] formatArr2 = formatArr;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            D2c d2c = (D2c) it.next();
            d2x.A06.A02();
            ArrayList arrayList = new ArrayList();
            Format format = formatArr2[0];
            for (Format format2 : formatArr2) {
                D4H d4h2 = d4h;
                float A002 = MosScoreCalculation.A00(format2, d4h2.A00);
                if (A002 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || A002 >= 100.0f) {
                    boolean z2 = false;
                    if (((double) Math.abs(A002 - 100.0f)) < 1.0E-4d) {
                        z2 = true;
                    }
                    z = false;
                }
                z = true;
                if (z) {
                    D2V d2v = d2c.A00;
                    C25947Bcz bcz = d2v.A00;
                    if (bcz == null) {
                        A012 = false;
                    } else {
                        A012 = bcz.A01();
                    }
                    if (A012) {
                        f = d2v.A03.A0A;
                    } else {
                        f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    }
                }
                arrayList.add(format2);
                if (z && A002 > MosScoreCalculation.A00(format, d4h2.A00)) {
                    format = format2;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(format);
            }
            Format[] formatArr3 = (Format[]) arrayList.toArray(new Format[arrayList.size()]);
            if (formatArr3 == null || formatArr3.length == 0) {
                C40431oe.A02("StitchAbrEvaluator", "FormatFilter %s returned empty format list. Skipping it", "VisualQualityScoreFormatFilter");
            } else {
                formatArr2 = formatArr3;
            }
        }
        return formatArr2;
    }

    public D2X(C29605D1k d1k, D35 d35, C25947Bcz bcz, C29623D2f d2f, D2V d2v, Context context, D3U d3u) {
        D6U.A01(d1k);
        this.A0B = d1k;
        this.A06 = d35;
        this.A05 = bcz;
        this.A0A = d2f == null ? new D3K() : d2f;
        this.A08 = d3u;
        this.A07 = new D2W(context, bcz, d35, d2v);
        this.A09 = d2v;
        this.A0C = A00(d2v.A03.A0j, true);
        this.A0D = A00(this.A09.A03.A0k, false);
    }
}
