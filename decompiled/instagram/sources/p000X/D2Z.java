package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.android.exoplayer2.Format;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.D2Z */
public final class D2Z implements D3Q {
    public D4K A00;
    public D4K A01;
    public final D2V A02;
    public final C29623D2f A03;
    public final C29605D1k A04;
    public final String A05;

    public final boolean Afi() {
        return false;
    }

    public final boolean BnY() {
        return false;
    }

    private long A00(Format format, Map map) {
        boolean z;
        D3M d3m = (D3M) map.get(format.A0Q);
        if (d3m != null) {
            D2V d2v = this.A02;
            if (d2v.A05) {
                z = false;
            } else {
                z = d2v.A03.A0m;
            }
            if (z) {
                return d3m.A00;
            }
        }
        return (long) format.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0205, code lost:
        if (r1.equalsIgnoreCase("fb_stories") == false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021f, code lost:
        if (((long) r9) < r0) goto L_0x0221;
     */
    public final C29655D3o ADP(C29663D3w d3w, Format[] formatArr, Map map, Format format, int i, int i2) {
        D4K d4k;
        Map map2;
        int i3;
        double d;
        Format A022;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        Format format2 = format;
        C29663D3w d3w2 = d3w;
        long j = d3w2.A00;
        int i6 = (int) (j / 1000);
        D2V d2v = this.A02;
        long A042 = (long) d2v.A04();
        boolean z4 = false;
        if (d3w2.A01 > j) {
            z4 = true;
        }
        this.A03.BsU(z4);
        if (z4) {
            d4k = this.A00;
        } else {
            d4k = this.A01;
        }
        int AGV = d4k.AGV(i6);
        if (format == null) {
            AGV = d2v.A01();
        }
        Format[] formatArr2 = formatArr;
        int length = formatArr2.length;
        HashMap hashMap = new HashMap(length);
        int i7 = 0;
        while (true) {
            map2 = map;
            if (i7 >= length) {
                break;
            }
            Format format3 = formatArr[i7];
            C29605D1k d1k = this.A04;
            D2V d2v2 = this.A02;
            long j2 = ((D3M) map2.get(format3.A0Q)).A02;
            C29656D3p A012 = D2L.A01(d1k, d2v2, formatArr2, j2, AGV);
            if (A012.A02 < 0) {
                A012.A01 = A042;
            }
            hashMap.put(format3.A0Q, A012);
            i7++;
        }
        for (int i8 = 0; i8 < length; i8++) {
            Format format4 = formatArr[i8];
            C29656D3p d3p = (C29656D3p) hashMap.get(format4.A0Q);
            long j3 = (long) format4.A04;
            D3M d3m = (D3M) map2.get(format4.A0Q);
            if (d3m != null) {
                D2V d2v3 = this.A02;
                if (d2v3.A05) {
                    z3 = false;
                } else {
                    z3 = d2v3.A03.A0m;
                }
                if (z3) {
                    j3 = d3m.A00;
                }
            }
            D6U.A01(d3p);
            C29623D2f d2f = this.A03;
            long j4 = d3p.A02;
            long j5 = d3p.A01;
            long j6 = j4;
            long j7 = j5;
            d2f.A38(j6, j7, d3p.A00, j3, (long) format4.A04, format4.A0P);
        }
        boolean z5 = false;
        if (i6 <= this.A02.A02()) {
            z5 = true;
        }
        this.A03.BsS(AGV);
        Format format5 = format2;
        if (format == null) {
            format5 = formatArr[length - 1];
        }
        hashMap.get(format5.A0Q);
        C29656D3p d3p2 = (C29656D3p) hashMap.get(format5.A0Q);
        long j8 = d3p2.A01;
        if (j8 == -1) {
            j8 = d3p2.A02;
        }
        String str = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        String str2 = "HIGH";
        int i9 = i;
        int i10 = i2;
        if (format == null) {
            this.A03.A2Z(D2b.NO_CURRENT);
            A022 = D2L.A02(formatArr2, hashMap, i9, map2, this.A02, i10, 1.0d);
            str2 = str;
        } else {
            if (z5) {
                this.A03.A2Z(D2b.LOW_BUFFER);
                if (j8 < A00(format2, map2)) {
                    this.A03.A2Z(D2b.LOW_BANDWIDTH);
                    int i11 = i9;
                    A022 = D2L.A02(formatArr2, hashMap, i11, map2, this.A02, i10, 1.0d);
                    str2 = "LOW";
                } else {
                    this.A03.A2Z(D2b.HIGH_BANDWIDTH);
                    String str3 = this.A05;
                    if (str3 != null) {
                        z = true;
                    }
                    z = false;
                    if (z) {
                        D2V d2v4 = this.A02;
                        if (!d2v4.A05) {
                            i5 = d2v4.A03.A0h;
                        }
                        i5 = -1;
                    } else {
                        D2V d2v5 = this.A02;
                        if (!d2v5.A05) {
                            i5 = d2v5.A03.A0d;
                        }
                        i5 = -1;
                    }
                    long j9 = (long) i5;
                    if (j9 >= 0) {
                        z2 = true;
                    }
                    z2 = false;
                    D2V d2v6 = this.A02;
                    boolean z6 = false;
                    if (z2) {
                        z6 = true;
                    }
                    if (z6) {
                        Format A023 = D2L.A02(formatArr2, hashMap, i9, map2, d2v6, i10, 1.0d);
                        if (A023.A04 > format2.A04) {
                            this.A03.A2Z(D2b.HIGHER_QUALITY_CONF_BASED);
                            if (!z2) {
                                this.A03.A2Z(D2b.ABR_UP_WATCHABLE);
                            }
                            format2 = A023;
                        }
                    }
                    str = "LOW";
                }
            } else {
                this.A03.A2Z(D2b.HIGH_BUFFER);
                D2V d2v7 = this.A02;
                if (d2v7.A03.A0i < 0 || !d2v7.A01.A07() || !d2v7.A04) {
                    i3 = -1;
                } else {
                    i3 = d2v7.A03.A0i;
                }
                if (i6 < i3 || i3 <= 0) {
                    d = 1.0d;
                } else {
                    d = Math.min(1.5d, (((double) (i6 - i3)) / ((double) i3)) + 1.0d);
                    this.A03.A2Z(D2b.VERY_HIGH_BUFFER_BANDWIDTH_BOOST);
                    j8 = (long) (((double) j8) * d);
                }
                if (j8 < A00(format2, map2)) {
                    this.A03.A2Z(D2b.LOW_BANDWIDTH);
                    double d2 = ((double) d3w2.A00) / 1000.0d;
                    D2V d2v8 = this.A02;
                    if (d2v8.A05) {
                        i4 = d2v8.A03.A0P;
                    } else {
                        i4 = d2v8.A03.A0X;
                    }
                    if (d2 >= ((double) ((long) i4))) {
                        this.A03.A2Z(D2b.FORCE_CURRENT_WITH_VERY_HIGH_BUFFER);
                    } else {
                        this.A03.A2Z(D2b.TRY_LOWER_QUALITY);
                        format2 = D2L.A02(formatArr2, hashMap, i9, map2, this.A02, i10, d);
                    }
                    str = str2;
                    str2 = "LOW";
                } else {
                    this.A03.A2Z(D2b.TRY_HIGHER_QUALITY);
                    A022 = D2L.A02(formatArr2, hashMap, i9, map2, this.A02, i10, d);
                }
            }
            str = str2;
        }
        D6U.A01(A022);
        return new C29655D3o(A022, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r11.equalsIgnoreCase("fb_stories") == false) goto L_0x0016;
     */
    public D2Z(C29623D2f d2f, D2V d2v, C29605D1k d1k, String str) {
        int i;
        float f;
        float f2;
        this.A03 = d2f;
        this.A02 = d2v;
        this.A04 = d1k;
        this.A05 = str;
        boolean z = str != null ? true : z;
        z = false;
        if (z) {
            if (d2v.A05) {
                i = d2v.A03.A0U;
            } else {
                i = d2v.A03.A0g;
            }
        } else if (d2v.A05) {
            i = d2v.A03.A0O;
        } else {
            i = d2v.A03.A0W;
        }
        int i2 = (int) ((long) i);
        int A022 = d2v.A02();
        boolean z2 = d2v.A05;
        if (z2) {
            f = d2v.A03.A05;
        } else {
            f = d2v.A03.A01;
        }
        double d = (double) f;
        if (z2) {
            f2 = d2v.A03.A06;
        } else {
            f2 = d2v.A03.A02;
        }
        this.A00 = new D3R(d2v, i2, d);
        this.A01 = new D3S(d2v, A022, (double) f2);
    }
}
