package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.D1O */
public final class D1O implements C29659D3s {
    public static final Map A0G = new AnonymousClass6VU();
    public int A00;
    public long A01;
    public long A02;
    public HashMap A03;
    public boolean A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r10 >= 100) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        if (r10 >= 100) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e3  */
    public final long ALH(long j, int i) {
        long j2;
        float f;
        boolean z;
        boolean z2;
        long j3 = j;
        int i2 = i;
        if (j >= 0) {
            int i3 = i2;
            HashMap hashMap = this.A03;
            float f2 = 0.3f;
            if (hashMap != null && hashMap.containsKey("min_bandwidth_multiplier")) {
                try {
                    Object obj = this.A03.get("min_bandwidth_multiplier");
                    if (obj != null) {
                        f2 = ((Float) obj).floatValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            float f3 = 2.0f;
            HashMap hashMap2 = this.A03;
            if (hashMap2 != null && hashMap2.containsKey("max_bandwidth_multiplier")) {
                try {
                    Object obj2 = this.A03.get("max_bandwidth_multiplier");
                    if (obj2 != null) {
                        f3 = ((Float) obj2).floatValue();
                    }
                } catch (ClassCastException unused2) {
                }
            }
            long j4 = this.A06;
            int i4 = 1;
            if (i > 0) {
                z = true;
            }
            z = false;
            if (z && j4 > 0) {
                if (i2 < 50) {
                    i4 = -1;
                    i3 = 100 - i;
                }
                if (this.A04) {
                    long j5 = this.A07;
                    if (j5 != Long.MIN_VALUE && this.A01 >= ((long) this.A00)) {
                        float floatValue = ((float) j5) - ((((float) this.A08) * ((Float) A0G.get(Integer.valueOf(i3))).floatValue()) * ((float) i4));
                        long j6 = this.A06;
                        float f4 = (float) j6;
                        j4 = (long) (f4 * Math.min(Math.max(((float) (((long) floatValue) + j6)) / f4, f2), f3));
                    }
                }
                float f5 = (float) j4;
                j4 = (long) (f5 * Math.min(Math.max((1.0f - (((((float) i4) * ((Float) A0G.get(Integer.valueOf(i3))).floatValue()) * ((float) this.A09)) / f5)) - Math.max(1.0f - (((float) this.A0A) / 800.0f), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), f2), f3));
            }
            HashMap hashMap3 = this.A03;
            float f6 = 3.0f;
            if (hashMap3 != null && hashMap3.containsKey("max_ttfb_multiplier")) {
                try {
                    Object obj3 = this.A03.get("max_ttfb_multiplier");
                    if (obj3 != null) {
                        f6 = ((Float) obj3).floatValue();
                    }
                } catch (ClassCastException unused3) {
                }
            }
            float f7 = 0.5f;
            HashMap hashMap4 = this.A03;
            if (hashMap4 != null && hashMap4.containsKey("min_ttfb_multiplier")) {
                try {
                    Object obj4 = this.A03.get("min_ttfb_multiplier");
                    if (obj4 != null) {
                        f7 = ((Float) obj4).floatValue();
                    }
                } catch (ClassCastException unused4) {
                }
            }
            long j7 = this.A0D;
            int i5 = 1;
            if (i > 0) {
                z2 = true;
            }
            z2 = false;
            if (z2 && j7 > 0) {
                if (i2 < 50) {
                    i5 = -1;
                    i2 = 100 - i;
                }
                if (this.A04) {
                    long j8 = this.A0B;
                    if (j8 != Long.MIN_VALUE && this.A02 >= ((long) this.A00)) {
                        float floatValue2 = ((float) j8) + (((float) this.A0C) * ((Float) A0G.get(Integer.valueOf(i2))).floatValue() * ((float) i5));
                        long j9 = this.A0D;
                        float f8 = (float) j9;
                        j7 = (long) (f8 * Math.max(Math.min(((float) (((long) floatValue2) + j9)) / f8, f6), f7));
                    }
                }
                float f9 = (float) j7;
                j7 = (long) (f9 * Math.max(Math.min((((((float) i5) * ((Float) A0G.get(Integer.valueOf(i2))).floatValue()) * ((float) this.A0E)) / f9) + 1.0f + Math.max(1.0f - (((float) this.A0F) / 300.0f), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), f6), f7));
            }
            if (j4 > 0 && j7 >= 0) {
                j2 = (long) (((((double) j3) * 8000.0d) / ((double) j4)) + ((double) j7));
                if (j2 <= 0 || j <= 0) {
                    return -1;
                }
                long j10 = (j * 8000) / j2;
                HashMap hashMap5 = this.A03;
                if (hashMap5 != null && hashMap5.containsKey("bandwidth_multiplier")) {
                    try {
                        Object obj5 = this.A03.get("bandwidth_multiplier");
                        if (obj5 != null) {
                            f = ((Float) obj5).floatValue();
                            if (Float.compare(f, 1.0f) != 0) {
                                return j10;
                            }
                            return (long) (((float) j10) * f);
                        }
                    } catch (ClassCastException unused5) {
                    }
                }
                f = 1.0f;
                if (Float.compare(f, 1.0f) != 0) {
                }
            }
        }
        j2 = -1;
        if (j2 <= 0 || j <= 0) {
        }
    }

    public final void BjN(HashMap hashMap) {
        this.A03 = hashMap;
        if (hashMap != null && hashMap.containsKey("use_percentile_estimate_error")) {
            try {
                Object obj = hashMap.get("use_percentile_estimate_error");
                if (obj != null) {
                    this.A04 = ((Boolean) obj).booleanValue();
                }
            } catch (ClassCastException unused) {
            }
        }
        this.A00 = 30;
        if (hashMap != null && hashMap.containsKey("min_samples_for_percentile_estimate_error")) {
            try {
                Object obj2 = hashMap.get("min_samples_for_percentile_estimate_error");
                if (obj2 != null) {
                    this.A00 = ((Integer) obj2).intValue();
                }
            } catch (ClassCastException unused2) {
            }
        }
    }

    public final String toString() {
        return AnonymousClass000.A0Q(AnonymousClass000.A0B("ttfb=", this.A0D), AnonymousClass000.A0B(", bw=", this.A06 / 1000), AnonymousClass000.A0B(", ttfb_w=", this.A0F), AnonymousClass000.A0B(", ttfb_s=", this.A0E), AnonymousClass000.A0B(", bw_w=", this.A0A), AnonymousClass000.A0B(", bw_s=", this.A09 / 1000), AnonymousClass000.A05(", s=", this.A05));
    }

    public D1O() {
        this.A03 = null;
        this.A04 = false;
        this.A00 = 30;
        this.A0D = -1;
        this.A0F = -1;
        this.A0E = -1;
        this.A06 = -1;
        this.A0A = -1;
        this.A09 = -1;
        this.A0B = Long.MIN_VALUE;
        this.A0C = -1;
        this.A07 = Long.MIN_VALUE;
        this.A08 = -1;
        this.A05 = -1;
        this.A02 = -1;
        this.A01 = -1;
    }

    public D1O(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i, int i2, int i3) {
        this.A03 = null;
        this.A04 = false;
        this.A00 = 30;
        this.A0D = j;
        this.A0F = j2;
        this.A0E = j3;
        this.A06 = j4;
        this.A0A = j5;
        this.A09 = j6;
        this.A0B = j7;
        this.A0C = j8;
        this.A07 = j9;
        this.A08 = j10;
        this.A05 = i;
        this.A02 = (long) i2;
        this.A01 = (long) i3;
    }

    public D1O(D1O d1o, long j) {
        this.A03 = null;
        this.A04 = false;
        this.A00 = 30;
        this.A0D = d1o.A0D;
        this.A0F = d1o.A0F;
        this.A0E = d1o.A0E;
        this.A06 = j;
        this.A0A = d1o.A0A;
        this.A09 = d1o.A09;
        this.A0B = d1o.A0B;
        this.A0C = d1o.A0C;
        this.A07 = d1o.A07;
        this.A08 = d1o.A08;
        this.A05 = d1o.A05;
        this.A02 = d1o.A02;
        this.A01 = d1o.A01;
    }
}
