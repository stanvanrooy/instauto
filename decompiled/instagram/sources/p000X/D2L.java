package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.video.heroplayer.common.MosScoreCalculation;
import com.google.android.exoplayer2.Format;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.D2L */
public final class D2L {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if ("inline".equals(r6) != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if ("inline".equals(r6) != false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0023 A[SYNTHETIC] */
    public static int A00(Format[] formatArr, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = 0;
        for (int length = formatArr.length - 1; length >= 0; length--) {
            Format format = formatArr[length];
            if (str != null) {
                z = true;
            }
            z = false;
            if (!z || !format.A0U) {
                if (str != null) {
                    z2 = true;
                }
                z2 = false;
                if (z2 || !format.A0V) {
                    z3 = false;
                    if (z3) {
                        i = Math.max(i, format.A0F);
                    }
                }
            }
            z3 = true;
            if (z3) {
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (r13 >= 100) goto L_0x0080;
     */
    public static C29656D3p A01(C29605D1k d1k, D2V d2v, Format[] formatArr, long j, int i) {
        long j2;
        float f;
        boolean z;
        float f2;
        int i2 = i;
        if (formatArr == null || formatArr.length <= 0) {
            j2 = -1;
        } else {
            j2 = (long) formatArr[0].A04;
        }
        C29659D3s AGg = d1k.AGg(j2);
        HashMap hashMap = new HashMap();
        hashMap.put("min_bandwidth_multiplier", Float.valueOf(0.3f));
        hashMap.put("max_bandwidth_multiplier", Float.valueOf(2.0f));
        hashMap.put("max_ttfb_multiplier", Float.valueOf(3.0f));
        hashMap.put("min_ttfb_multiplier", Float.valueOf(0.5f));
        if (!d2v.A01.A07() || !d2v.A04) {
            f = 1.0f;
        } else {
            f = d2v.A03.A00;
        }
        if (Float.compare(f, 1.0f) != 0) {
            if (!d2v.A01.A07() || !d2v.A04) {
                f2 = 1.0f;
            } else {
                f2 = d2v.A03.A00;
            }
            hashMap.put("bandwidth_multiplier", Float.valueOf(f2));
        }
        AGg.BjN(hashMap);
        if (i != -1) {
            if (i > 0) {
                z = true;
            }
            z = false;
            if (!z) {
                i2 = 80;
            }
        }
        return new C29656D3p(AGg.ALH(j, -1), AGg.ALH(j, i2), i2);
    }

    public static Format A02(Format[] formatArr, Map map, int i, Map map2, D2V d2v, int i2, double d) {
        boolean z;
        long j;
        D3M d3m;
        Format[] formatArr2 = formatArr;
        Format format = null;
        float f = -1.0f;
        Format format2 = null;
        for (Format format3 : formatArr2) {
            D2V d2v2 = d2v;
            if (d2v2.A05) {
                z = false;
            } else {
                z = d2v2.A03.A0m;
            }
            Map map3 = map2;
            if (map2 == null || !z || (d3m = (D3M) map3.get(format3.A0Q)) == null) {
                j = (long) format3.A04;
            } else {
                j = d3m.A00;
            }
            C29656D3p d3p = (C29656D3p) map.get(format3.A0Q);
            D6U.A01(d3p);
            long j2 = d3p.A01;
            if (j2 == -1) {
                j2 = d3p.A02;
            }
            if (format3.A0F <= i) {
                double d2 = (double) j;
                double d3 = ((double) j2) * d;
                int i3 = i2;
                if (d2 <= d3) {
                    float A00 = MosScoreCalculation.A00(format3, i3);
                    if (format2 == null) {
                        format2 = format3;
                        f = A00;
                    }
                }
                if (d2 <= d3 * ((double) BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) && ((format == null || format3.A04 < format.A04) && MosScoreCalculation.A00(format3, i3) >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)) {
                    format = format3;
                }
            }
        }
        if (format2 == null) {
            return formatArr2[r12 - 1];
        }
        if (f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || format == null) {
            return format2;
        }
        return format;
    }
}
