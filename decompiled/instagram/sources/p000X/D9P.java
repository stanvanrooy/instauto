package p000X;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.D9P */
public final class D9P {
    public static final byte[] A00 = "OpusHead".getBytes(Charset.forName("UTF-8"));

    public static Pair A01(D9O d9o, int i) {
        d9o.A0C(i + 8 + 4);
        d9o.A0D(1);
        A00(d9o);
        d9o.A0D(2);
        int A01 = d9o.A01();
        if ((A01 & 128) != 0) {
            d9o.A0D(2);
        }
        if ((A01 & 64) != 0) {
            d9o.A0D(d9o.A03());
        }
        if ((A01 & 32) != 0) {
            d9o.A0D(2);
        }
        d9o.A0D(1);
        A00(d9o);
        String A02 = C29735D6z.A02(d9o.A01());
        if ("audio/mpeg".equals(A02) || "audio/vnd.dts".equals(A02) || "audio/vnd.dts.hd".equals(A02)) {
            return Pair.create(A02, (Object) null);
        }
        d9o.A0D(12);
        d9o.A0D(1);
        int A002 = A00(d9o);
        byte[] bArr = new byte[A002];
        d9o.A0F(bArr, 0, A002);
        return Pair.create(A02, bArr);
    }

    /* JADX WARNING: type inference failed for: r15v4, types: [X.D9d] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static Pair A02(D9O d9o, int i, int i2) {
        int i3;
        int i4;
        D9O d9o2 = d9o;
        int i5 = d9o2.A01;
        while (i5 - i < i2) {
            d9o2.A0C(i5);
            int A002 = d9o2.A00();
            boolean z = false;
            if (A002 > 0) {
                z = true;
            }
            D6U.A04(z, "childAtomSize should be positive");
            if (d9o2.A00() == 1936289382) {
                int i6 = i5 + 8;
                Pair pair = null;
                String str = null;
                Integer num = null;
                int i7 = -1;
                int i8 = 0;
                while (i6 - i5 < A002) {
                    d9o2.A0C(i6);
                    int A003 = d9o2.A00();
                    int A004 = d9o2.A00();
                    if (A004 == 1718775137) {
                        num = Integer.valueOf(d9o2.A00());
                    } else if (A004 == 1935894637) {
                        d9o2.A0D(4);
                        str = new String(d9o2.A02, d9o2.A01, 4, Charset.forName("UTF-8"));
                        d9o2.A01 += 4;
                    } else if (A004 == 1935894633) {
                        i7 = i6;
                        i8 = A003;
                    }
                    i6 += A003;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    boolean z2 = true;
                    boolean z3 = false;
                    if (num != null) {
                        z3 = true;
                    }
                    D6U.A04(z3, "frma atom is mandatory");
                    boolean z4 = false;
                    if (i7 != -1) {
                        z4 = true;
                    }
                    D6U.A04(z4, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        byte[] bArr = null;
                        if (i9 - i7 >= i8) {
                            break;
                        }
                        d9o2.A0C(i9);
                        int A005 = d9o2.A00();
                        if (d9o2.A00() == 1952804451) {
                            int A006 = (d9o2.A00() >> 24) & 255;
                            d9o2.A0D(1);
                            if (A006 == 0) {
                                d9o2.A0D(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int A01 = d9o2.A01();
                                i3 = (A01 & 240) >> 4;
                                i4 = A01 & 15;
                            }
                            boolean z5 = false;
                            if (d9o2.A01() == 1) {
                                z5 = true;
                            }
                            int A012 = d9o2.A01();
                            byte[] bArr2 = new byte[16];
                            d9o2.A0F(bArr2, 0, 16);
                            if (z5 && A012 == 0) {
                                int A013 = d9o2.A01();
                                bArr = new byte[A013];
                                d9o2.A0F(bArr, 0, A013);
                            }
                            pair = new C29773D9d(z5, str, A012, bArr2, i3, i4, bArr);
                        } else {
                            i9 += A005;
                        }
                    }
                    if (pair == null) {
                        z2 = false;
                    }
                    D6U.A04(z2, "tenc atom is mandatory");
                    pair = Pair.create(num, pair);
                }
                if (pair != null) {
                    return pair;
                }
            }
            i5 += A002;
        }
        return null;
    }

    public static int A00(D9O d9o) {
        int A01 = d9o.A01();
        int i = A01 & 127;
        while ((A01 & 128) == 128) {
            A01 = d9o.A01();
            i = (i << 7) | (A01 & 127);
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:432:0x086b  */
    /* JADX WARNING: Removed duplicated region for block: B:543:0x0750 A[SYNTHETIC] */
    public static D9k A03(C29772D9c d9c, DA2 da2, long j, DrmInitData drmInitData, boolean z, boolean z2) {
        int i;
        boolean z3;
        long[] jArr;
        long[] jArr2;
        Pair pair;
        DA2 A01;
        long A05;
        long A002;
        String str;
        DAD dad;
        int i2;
        int A03;
        int i3;
        String str2;
        List singletonList;
        int i4;
        Integer num;
        Integer num2;
        int i5;
        int i6;
        String num3;
        int i7;
        String str3;
        DrmInitData drmInitData2;
        String str4;
        int i8;
        int i9;
        int i10;
        Format A04;
        long j2 = j;
        C29772D9c d9c2 = d9c;
        C29772D9c A003 = d9c2.A00(1835297121);
        D9O d9o = A003.A01(1751411826).A00;
        d9o.A0C(16);
        int A004 = d9o.A00();
        if (A004 == 1936684398) {
            i = 1;
        } else if (A004 == 1986618469) {
            i = 2;
        } else if (A004 == 1952807028 || A004 == 1935832172 || A004 == 1937072756 || A004 == 1668047728) {
            i = 3;
        } else {
            i = -1;
            if (A004 == 1835365473) {
                i = 4;
            }
        }
        if (i == -1) {
            return null;
        }
        D9O d9o2 = d9c2.A01(1953196132).A00;
        int i11 = 8;
        d9o2.A0C(8);
        int A005 = (d9o2.A00() >> 24) & 255;
        int i12 = 16;
        if (A005 == 0) {
            i12 = 8;
        }
        d9o2.A0D(i12);
        int A006 = d9o2.A00();
        d9o2.A0D(4);
        int i13 = d9o2.A01;
        if (A005 == 0) {
            i11 = 4;
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= i11) {
                z3 = true;
                break;
            } else if (d9o2.A02[i13 + i15] != -1) {
                z3 = false;
                break;
            } else {
                i15++;
            }
        }
        long j3 = -9223372036854775807L;
        if (z3) {
            d9o2.A0D(i11);
        } else {
            long A052 = A005 == 0 ? d9o2.A05() : d9o2.A06();
            if (A052 != 0) {
                j3 = A052;
            }
        }
        d9o2.A0D(16);
        int A007 = d9o2.A00();
        int A008 = d9o2.A00();
        d9o2.A0D(4);
        int A009 = d9o2.A00();
        int A0010 = d9o2.A00();
        if (A007 == 0 && A008 == 65536 && A009 == -65536 && A0010 == 0) {
            i14 = 90;
        } else if (A007 == 0 && A008 == -65536 && A009 == 65536 && A0010 == 0) {
            i14 = 270;
        } else if (A007 == -65536 && A008 == 0 && A009 == 0 && A0010 == -65536) {
            i14 = 180;
        }
        DA4 da4 = new DA4(A006, j3, i14);
        long j4 = -9223372036854775807L;
        if (j2 == -9223372036854775807L) {
            j2 = da4.A02;
        }
        D9O d9o3 = da2.A00;
        int i16 = 8;
        d9o3.A0C(8);
        if (((d9o3.A00() >> 24) & 255) != 0) {
            i16 = 16;
        }
        d9o3.A0D(i16);
        long A053 = d9o3.A05();
        if (j2 != -9223372036854775807L) {
            j4 = C25948Bd0.A04(j2, 1000000, A053);
        }
        C29772D9c A0011 = A003.A00(1835626086).A00(1937007212);
        D9O d9o4 = A003.A01(1835296868).A00;
        int i17 = 8;
        d9o4.A0C(8);
        int A0012 = (d9o4.A00() >> 24) & 255;
        int i18 = 16;
        if (A0012 == 0) {
            i18 = 8;
        }
        d9o4.A0D(i18);
        long A054 = d9o4.A05();
        if (A0012 == 0) {
            i17 = 4;
        }
        d9o4.A0D(i17);
        int A032 = d9o4.A03();
        Pair create = Pair.create(Long.valueOf(A054), "" + ((char) (((A032 >> 10) & 31) + 96)) + ((char) (((A032 >> 5) & 31) + 96)) + ((char) ((A032 & 31) + 96)));
        D9O d9o5 = A0011.A01(1937011556).A00;
        int i19 = da4.A00;
        int i20 = da4.A01;
        String str5 = (String) create.second;
        DrmInitData drmInitData3 = drmInitData;
        d9o5.A0C(12);
        int A0013 = d9o5.A00();
        C29786D9v d9v = new C29786D9v(A0013);
        for (int i21 = 0; i21 < A0013; i21++) {
            int i22 = d9o5.A01;
            int A0014 = d9o5.A00();
            boolean z4 = false;
            if (A0014 > 0) {
                z4 = true;
            }
            D6U.A04(z4, "childAtomSize should be positive");
            int A0015 = d9o5.A00();
            if (A0015 == 1635148593 || A0015 == 1635148595 || A0015 == 1701733238 || A0015 == 1836070006 || A0015 == 1752589105 || A0015 == 1751479857 || A0015 == 1932670515 || A0015 == 1987063864 || A0015 == 1987063865 || A0015 == 1635135537 || A0015 == 1685479798 || A0015 == 1685479729 || A0015 == 1685481573 || A0015 == 1685481521) {
                D9O d9o6 = d9o5;
                int i23 = i19;
                int i24 = i20;
                DrmInitData drmInitData4 = drmInitData3;
                d9o5.A0C(i22 + 8 + 8);
                d9o5.A0D(16);
                int A033 = d9o6.A03();
                int A034 = d9o6.A03();
                d9o5.A0D(50);
                int i25 = d9o5.A01;
                if (A0015 == 1701733238) {
                    Pair A02 = A02(d9o5, i22, A0014);
                    if (A02 != null) {
                        A0015 = ((Integer) A02.first).intValue();
                        if (drmInitData == null) {
                            drmInitData4 = null;
                        } else {
                            drmInitData4 = drmInitData4.A00(((C29773D9d) A02.second).A02);
                        }
                        d9v.A03[i21] = (C29773D9d) A02.second;
                    }
                    d9o5.A0C(i25);
                }
                String str6 = null;
                String str7 = null;
                List list = null;
                byte[] bArr = null;
                boolean z5 = false;
                float f = 1.0f;
                int i26 = -1;
                while (true) {
                    int i27 = A0014;
                    if (i25 - i22 >= i27) {
                        break;
                    }
                    d9o5.A0C(i25);
                    int i28 = d9o5.A01;
                    int A0016 = d9o6.A00();
                    if (A0016 == 0 && d9o5.A01 - i22 == i27) {
                        break;
                    }
                    boolean z6 = false;
                    if (A0016 > 0) {
                        z6 = true;
                    }
                    D6U.A04(z6, "childAtomSize should be positive");
                    int A0017 = d9o6.A00();
                    if (A0017 == 1635148611) {
                        boolean z7 = false;
                        if (str7 == null) {
                            z7 = true;
                        }
                        D6U.A03(z7);
                        d9o5.A0C(i28 + 8);
                        C29775D9f A0018 = C29775D9f.A00(d9o6);
                        list = A0018.A02;
                        d9v.A00 = A0018.A01;
                        if (!z5) {
                            f = A0018.A00;
                        }
                        str7 = "video/avc";
                    } else if (A0017 == 1752589123) {
                        boolean z8 = false;
                        if (str7 == null) {
                            z8 = true;
                        }
                        D6U.A03(z8);
                        d9o5.A0C(i28 + 8);
                        C29774D9e A0019 = C29774D9e.A00(d9o6);
                        list = A0019.A01;
                        d9v.A00 = A0019.A00;
                        str7 = "video/hevc";
                    } else if (A0017 == 1685480259 || A0017 == 1685485123) {
                        d9o5.A0D(2);
                        int A012 = d9o5.A01();
                        int i29 = A012 >> 1;
                        int A013 = ((d9o5.A01() >> 3) & 31) | ((A012 & 1) << 5);
                        if (i29 == 4 || i29 == 5 || i29 == 7) {
                            str = "dvhe";
                        } else if (i29 == 8) {
                            str = "hev1";
                        } else if (i29 == 9) {
                            str = "avc3";
                        } else {
                            dad = null;
                            if (dad == null) {
                                str6 = dad.A00;
                                str7 = "video/dolby-vision";
                            }
                        }
                        dad = new DAD(AnonymousClass000.A0I(str, ".0", i29, ".0", A013));
                        if (dad == null) {
                        }
                    } else if (A0017 == 1987076931) {
                        boolean z9 = false;
                        if (str7 == null) {
                            z9 = true;
                        }
                        D6U.A03(z9);
                        str7 = A0015 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else if (A0017 == 1635135811) {
                        boolean z10 = false;
                        if (str7 == null) {
                            z10 = true;
                        }
                        D6U.A03(z10);
                        str7 = "video/av01";
                    } else if (A0017 == 1681012275) {
                        boolean z11 = false;
                        if (str7 == null) {
                            z11 = true;
                        }
                        D6U.A03(z11);
                        str7 = "video/3gpp";
                    } else if (A0017 == 1702061171) {
                        boolean z12 = false;
                        if (str7 == null) {
                            z12 = true;
                        }
                        D6U.A03(z12);
                        Pair A014 = A01(d9o5, i28);
                        str7 = (String) A014.first;
                        list = Collections.singletonList(A014.second);
                    } else if (A0017 == 1885434736) {
                        d9o5.A0C(i28 + 8);
                        f = ((float) d9o5.A02()) / ((float) d9o5.A02());
                        z5 = true;
                    } else if (A0017 == 1937126244) {
                        int i30 = i28 + 8;
                        while (true) {
                            if (i30 - i28 >= A0016) {
                                bArr = null;
                                break;
                            }
                            d9o5.A0C(i30);
                            int A0020 = d9o5.A00();
                            if (d9o5.A00() == 1886547818) {
                                bArr = Arrays.copyOfRange(d9o5.A02, i30, A0020 + i30);
                                break;
                            }
                            i30 += A0020;
                        }
                    } else if (A0017 == 1936995172) {
                        int A015 = d9o6.A01();
                        d9o5.A0D(3);
                        if (A015 == 0) {
                            int A016 = d9o6.A01();
                            if (A016 == 0) {
                                i26 = 0;
                            } else if (A016 == 1) {
                                i26 = 1;
                            } else if (A016 == 2) {
                                i26 = 2;
                            } else if (A016 == 3) {
                                i26 = 3;
                            }
                        }
                    }
                    i25 += A0016;
                }
                if (str7 != null) {
                    d9v.A02 = new Format(Integer.toString(i23), (String) null, str7, str6, -1, -1, A033, A034, i24, f, bArr, i26, (ColorInfo) null, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, drmInitData4);
                }
            } else if (A0015 == 1836069985 || A0015 == 1701733217 || A0015 == 1633889587 || A0015 == 1700998451 || A0015 == 1633889588 || A0015 == 1685353315 || A0015 == 1685353317 || A0015 == 1685353320 || A0015 == 1685353324 || A0015 == 1935764850 || A0015 == 1935767394 || A0015 == 1819304813 || A0015 == 1936684916 || A0015 == 778924083 || A0015 == 1634492771 || A0015 == 1634492791 || A0015 == 1970037111 || A0015 == 1332770163 || A0015 == 1716281667) {
                D9O d9o7 = d9o5;
                int i31 = i19;
                String str8 = str5;
                DrmInitData drmInitData5 = drmInitData3;
                d9o5.A0C(i22 + 8 + 8);
                if (z2) {
                    i2 = d9o7.A03();
                    d9o5.A0D(6);
                } else {
                    d9o5.A0D(8);
                    i2 = 0;
                }
                if (i2 == 0 || i2 == 1) {
                    A03 = d9o7.A03();
                    d9o5.A0D(6);
                    byte[] bArr2 = d9o5.A02;
                    int i32 = d9o5.A01;
                    int i33 = i32 + 1;
                    d9o5.A01 = i33;
                    int i34 = (bArr2[i32] & 255) << 8;
                    int i35 = i33 + 1;
                    d9o5.A01 = i35;
                    i3 = (bArr2[i33] & 255) | i34;
                    d9o5.A01 = i35 + 2;
                    if (i2 == 1) {
                        d9o5.A0D(16);
                    }
                } else if (i2 == 2) {
                    d9o5.A0D(16);
                    i3 = (int) Math.round(Double.longBitsToDouble(d9o5.A04()));
                    A03 = d9o7.A02();
                    d9o5.A0D(20);
                }
                int i36 = d9o5.A01;
                if (A0015 == 1701733217) {
                    Pair A022 = A02(d9o5, i22, A0014);
                    if (A022 != null) {
                        A0015 = ((Integer) A022.first).intValue();
                        if (drmInitData == null) {
                            drmInitData5 = null;
                        } else {
                            drmInitData5 = drmInitData5.A00(((C29773D9d) A022.second).A02);
                        }
                        d9v.A03[i21] = (C29773D9d) A022.second;
                    }
                    d9o5.A0C(i36);
                }
                if (A0015 == 1633889587) {
                    str2 = "audio/ac3";
                } else {
                    str2 = A0015 == 1700998451 ? "audio/eac3" : A0015 == 1633889588 ? "audio/ac4" : A0015 == 1685353315 ? "audio/vnd.dts" : (A0015 == 1685353320 || A0015 == 1685353324) ? "audio/vnd.dts.hd" : A0015 == 1685353317 ? "audio/vnd.dts.hd;profile=lbr" : A0015 == 1935764850 ? "audio/3gpp" : A0015 == 1935767394 ? "audio/amr-wb" : (A0015 == 1819304813 || A0015 == 1936684916) ? "audio/raw" : A0015 == 778924083 ? "audio/mpeg" : A0015 == 1634492771 ? "audio/alac" : A0015 == 1634492791 ? "audio/g711-alaw" : A0015 == 1970037111 ? "audio/g711-mlaw" : A0015 == 1332770163 ? "audio/opus" : A0015 == 1716281667 ? "audio/flac" : null;
                }
                byte[] bArr3 = null;
                while (i36 - i22 < A0014) {
                    d9o5.A0C(i36);
                    int A0021 = d9o7.A00();
                    boolean z13 = false;
                    if (A0021 > 0) {
                        z13 = true;
                    }
                    D6U.A04(z13, "childAtomSize should be positive");
                    int A0022 = d9o7.A00();
                    if (A0022 == 1702061171 || (z2 && A0022 == 2002876005)) {
                        i4 = i36;
                        if (A0022 != 1702061171) {
                            int i37 = d9o5.A01;
                            while (true) {
                                if (i37 - i36 >= A0021) {
                                    i36 = -1;
                                    break;
                                }
                                d9o5.A0C(i37);
                                int A0023 = d9o5.A00();
                                boolean z14 = false;
                                if (A0023 > 0) {
                                    z14 = true;
                                }
                                D6U.A04(z14, "childAtomSize should be positive");
                                if (d9o5.A00() == 1702061171) {
                                    i36 = i37;
                                    break;
                                }
                                i37 += A0023;
                            }
                        }
                        if (i36 != -1) {
                            Pair A017 = A01(d9o5, i36);
                            str2 = (String) A017.first;
                            bArr3 = (byte[]) A017.second;
                            if ("audio/mp4a-latm".equals(str2)) {
                                DA0 da0 = new DA0(bArr3);
                                int A018 = da0.A01(5);
                                if (A018 == 31) {
                                    A018 = da0.A01(6) + 32;
                                }
                                int A019 = da0.A01(4);
                                if (A019 == 15) {
                                    i5 = da0.A01(24);
                                } else {
                                    boolean z15 = false;
                                    if (A019 < 13) {
                                        z15 = true;
                                    }
                                    D6U.A02(z15);
                                    i5 = DA5.A02[A019];
                                }
                                int A0110 = da0.A01(4);
                                if (A018 == 5 || A018 == 29) {
                                    int A0111 = da0.A01(4);
                                    if (A0111 == 15) {
                                        i6 = da0.A01(24);
                                    } else {
                                        boolean z16 = false;
                                        if (A0111 < 13) {
                                            z16 = true;
                                        }
                                        D6U.A02(z16);
                                        i6 = DA5.A02[A0111];
                                    }
                                    int A0112 = da0.A01(5);
                                    if (A0112 == 31) {
                                        A0112 = da0.A01(6) + 32;
                                    }
                                    if (A0112 == 22) {
                                        A0110 = da0.A01(4);
                                    }
                                }
                                boolean z17 = true;
                                int i38 = DA5.A01[A0110];
                                if (i38 == -1) {
                                    z17 = false;
                                }
                                D6U.A02(z17);
                                num = Integer.valueOf(i6);
                                num2 = Integer.valueOf(i38);
                            }
                        }
                        i36 = i4 + A0021;
                    } else {
                        if (A0022 == 1684103987) {
                            d9o5.A0C(i36 + 8);
                            num3 = Integer.toString(i31);
                            i7 = DAC.A02[(d9o5.A01() & 192) >> 6];
                            int A0113 = d9o5.A01();
                            i10 = DAC.A01[(A0113 & 56) >> 3];
                            if ((A0113 & 4) != 0) {
                                i10++;
                            }
                            str3 = "audio/ac3";
                        } else if (A0022 == 1684366131) {
                            d9o5.A0C(i36 + 8);
                            num3 = Integer.toString(i31);
                            d9o5.A0D(2);
                            i7 = DAC.A02[(d9o5.A01() & 192) >> 6];
                            int A0114 = d9o5.A01();
                            int i39 = DAC.A01[(A0114 & 14) >> 1];
                            if ((A0114 & 1) != 0) {
                                i39++;
                            }
                            if (((d9o5.A01() & 30) >> 1) > 0 && (2 & d9o5.A01()) != 0) {
                                i39 += 2;
                            }
                            str3 = (d9o5.A00 - d9o5.A01 <= 0 || (d9o5.A01() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
                        } else if (A0022 == 1684103988) {
                            d9o5.A0C(i36 + 8);
                            num3 = Integer.toString(i31);
                            d9o5.A0D(1);
                            int i40 = 44100;
                            if (((d9o5.A01() & 32) >> 5) == 1) {
                                i40 = 48000;
                            }
                            str3 = "audio/ac4";
                            drmInitData2 = drmInitData5;
                            str4 = str8;
                            i8 = -1;
                            i9 = -1;
                            i10 = 2;
                            d9v.A02 = Format.A03(num3, str3, i9, i10, i7, i8, (List) null, drmInitData2, 0, str4);
                            i4 = i36;
                            i36 = i4 + A0021;
                        } else {
                            if (A0022 == 1684305011) {
                                d9v.A02 = Format.A03(Integer.toString(i31), str2, -1, A03, i3, -1, (List) null, drmInitData5, 0, str8);
                                i4 = i36;
                            } else if (A0022 == 1682927731) {
                                int i41 = A0021 - 8;
                                byte[] bArr4 = A00;
                                int length = bArr4.length;
                                bArr3 = new byte[(length + i41)];
                                System.arraycopy(bArr4, 0, bArr3, 0, length);
                                i4 = i36;
                                d9o5.A0C(i36 + 8);
                                d9o5.A0F(bArr3, bArr4.length, i41);
                            } else {
                                i4 = i36;
                                if (A0022 == 1684425825) {
                                    int i42 = A0021 - 12;
                                    bArr3 = new byte[(i42 + 4)];
                                    bArr3[0] = 102;
                                    bArr3[1] = 76;
                                    bArr3[2] = 97;
                                    bArr3[3] = 67;
                                    d9o5.A0C(i36 + 12);
                                    d9o5.A0F(bArr3, 4, i42);
                                } else if (A0022 == 1634492771) {
                                    int i43 = A0021 - 12;
                                    bArr3 = new byte[i43];
                                    d9o5.A0C(i36 + 12);
                                    d9o5.A0F(bArr3, 0, i43);
                                    D9O d9o8 = new D9O(bArr3);
                                    d9o8.A0C(9);
                                    int A0115 = d9o8.A01();
                                    d9o8.A0C(20);
                                    num = Integer.valueOf(d9o8.A02());
                                    num2 = Integer.valueOf(A0115);
                                }
                            }
                            i36 = i4 + A0021;
                        }
                        drmInitData2 = drmInitData5;
                        str4 = str8;
                        i8 = -1;
                        i9 = -1;
                        d9v.A02 = Format.A03(num3, str3, i9, i10, i7, i8, (List) null, drmInitData2, 0, str4);
                        i4 = i36;
                        i36 = i4 + A0021;
                    }
                    Pair create2 = Pair.create(num, num2);
                    i3 = ((Integer) create2.first).intValue();
                    A03 = ((Integer) create2.second).intValue();
                    i36 = i4 + A0021;
                }
                if (d9v.A02 == null && str2 != null) {
                    int i44 = -1;
                    if ("audio/raw".equals(str2)) {
                        i44 = 2;
                    }
                    String num4 = Integer.toString(i31);
                    if (bArr3 == null) {
                        singletonList = null;
                    } else {
                        singletonList = Collections.singletonList(bArr3);
                    }
                    d9v.A02 = Format.A03(num4, str2, -1, A03, i3, i44, singletonList, drmInitData5, 0, str8);
                }
            } else {
                if (A0015 == 1414810956 || A0015 == 1954034535 || A0015 == 2004251764 || A0015 == 1937010800 || A0015 == 1664495672) {
                    int i45 = i19;
                    String str9 = str5;
                    d9o5.A0C(i22 + 8 + 8);
                    String str10 = "application/ttml+xml";
                    List list2 = null;
                    long j5 = Long.MAX_VALUE;
                    if (A0015 != 1414810956) {
                        if (A0015 == 1954034535) {
                            int i46 = (A0014 - 8) - 8;
                            byte[] bArr5 = new byte[i46];
                            d9o5.A0F(bArr5, 0, i46);
                            list2 = Collections.singletonList(bArr5);
                            str10 = "application/x-quicktime-tx3g";
                        } else if (A0015 == 2004251764) {
                            str10 = "application/x-mp4-vtt";
                        } else if (A0015 == 1937010800) {
                            j5 = 0;
                        } else if (A0015 == 1664495672) {
                            d9v.A01 = 1;
                            str10 = "application/x-mp4-cea-608";
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    A04 = Format.A04(Integer.toString(i45), str10, 0, str9, (DrmInitData) null, j5, list2);
                } else if (A0015 == 1667329389) {
                    A04 = Format.A01(Integer.toString(i19), "application/x-camera-motion");
                }
                d9v.A02 = A04;
            }
            d9o5.A0C(i22 + A0014);
        }
        if (!z) {
            C29772D9c A0024 = d9c2.A00(1701082227);
            if (A0024 == null || (A01 = A0024.A01(1701606260)) == null) {
                pair = Pair.create((Object) null, (Object) null);
            } else {
                D9O d9o9 = A01.A00;
                d9o9.A0C(8);
                int A0025 = (d9o9.A00() >> 24) & 255;
                int A023 = d9o9.A02();
                long[] jArr3 = new long[A023];
                long[] jArr4 = new long[A023];
                int i47 = 0;
                while (i47 < A023) {
                    if (A0025 == 1) {
                        A05 = d9o9.A06();
                    } else {
                        A05 = d9o9.A05();
                    }
                    jArr3[i47] = A05;
                    if (A0025 == 1) {
                        A002 = d9o9.A04();
                    } else {
                        A002 = (long) d9o9.A00();
                    }
                    jArr4[i47] = A002;
                    byte[] bArr6 = d9o9.A02;
                    int i48 = d9o9.A01;
                    int i49 = i48 + 1;
                    d9o9.A01 = i49;
                    int i50 = (bArr6[i48] & 255) << 8;
                    d9o9.A01 = i49 + 1;
                    if (((short) ((bArr6[i49] & 255) | i50)) == 1) {
                        d9o9.A0D(2);
                        i47++;
                    } else {
                        throw new IllegalArgumentException("Unsupported media rate.");
                    }
                }
                pair = Pair.create(jArr3, jArr4);
            }
            jArr = (long[]) pair.first;
            jArr2 = (long[]) pair.second;
        } else {
            jArr = null;
            jArr2 = null;
        }
        Format format = d9v.A02;
        if (format == null) {
            return null;
        }
        return new D9k(da4.A00, i, ((Long) create.first).longValue(), A053, j4, format, d9v.A01, d9v.A03, d9v.A00, jArr, jArr2);
    }
}
