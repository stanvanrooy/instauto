package p000X;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.D9R */
public final class D9R implements C29699D5l {
    public static final Format A0W = Format.A00("application/x-emsg");
    public static final D93 A0X = D5C.A00;
    public static final byte[] A0Y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public C29790D9z A0C;
    public D9X A0D;
    public D9O A0E;
    public boolean A0F;
    public boolean A0G;
    public C29687D4y[] A0H;
    public C29687D4y[] A0I;
    public final int A0J;
    public final SparseArray A0K;
    public final C29687D4y A0L;
    public final C25950Bd4 A0M = new C25950Bd4();
    public final D9O A0N = new D9O(16);
    public final D9O A0O = new D9O();
    public final D9O A0P = new D9O(5);
    public final D9O A0Q = new D9O(C29787D9w.A02);
    public final D9O A0R;
    public final ArrayDeque A0S;
    public final ArrayDeque A0T;
    public final List A0U;
    public final byte[] A0V;

    public final boolean Bp2(C29778D9m d9m) {
        return C29776D9g.A00(d9m, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03ec, code lost:
        if ((r37 & 1) == 0) goto L_0x03ee;
     */
    private void A01(long j) {
        C29773D9d d9d;
        String str;
        Object obj;
        int i;
        int i2;
        int i3;
        int i4;
        C29773D9d d9d2;
        String str2;
        long A062;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        Object obj2;
        Object obj3;
        while (true) {
            if (this.A0S.isEmpty() || ((C29772D9c) this.A0S.peek()).A00 != j) {
                this.A02 = 0;
                this.A00 = 0;
            } else {
                C29772D9c d9c = (C29772D9c) this.A0S.pop();
                C29772D9c d9c2 = d9c;
                int i11 = d9c.A00;
                if (i11 == 1836019574) {
                    boolean z3 = true;
                    int i12 = 0;
                    DrmInitData A002 = A00(d9c2.A02);
                    C29772D9c A003 = d9c2.A00(1836475768);
                    SparseArray sparseArray = new SparseArray();
                    int size = A003.A02.size();
                    long j2 = -9223372036854775807L;
                    for (int i13 = 0; i13 < size; i13++) {
                        DA2 da2 = (DA2) A003.A02.get(i13);
                        int i14 = da2.A00;
                        if (i14 == 1953654136) {
                            D9O d9o = da2.A00;
                            d9o.A0C(12);
                            Pair create = Pair.create(Integer.valueOf(d9o.A00()), new DA7(d9o.A02() - 1, d9o.A02(), d9o.A02(), d9o.A00()));
                            sparseArray.put(((Integer) create.first).intValue(), create.second);
                        } else if (i14 == 1835362404) {
                            D9O d9o2 = da2.A00;
                            d9o2.A0C(8);
                            if (((d9o2.A00() >> 24) & 255) == 0) {
                                j2 = d9o2.A05();
                            } else {
                                j2 = d9o2.A06();
                            }
                        }
                    }
                    SparseArray sparseArray2 = new SparseArray();
                    int size2 = d9c2.A01.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        C29772D9c d9c3 = (C29772D9c) d9c2.A01.get(i15);
                        if (d9c3.A00 == 1953653099) {
                            DA2 A012 = d9c2.A01(1836476516);
                            boolean z4 = false;
                            if ((this.A0J & 16) != 0) {
                                z4 = true;
                            }
                            D9k A032 = D9P.A03(d9c3, A012, j2, A002, z4, false);
                            if (A032 != null) {
                                sparseArray2.put(A032.A00, A032);
                            }
                        }
                    }
                    int size3 = sparseArray2.size();
                    if (this.A0K.size() != 0) {
                        if (this.A0K.size() != size3) {
                            z3 = false;
                        }
                        D6U.A03(z3);
                        while (i12 < size3) {
                            D9k d9k = (D9k) sparseArray2.valueAt(i12);
                            D9X d9x = (D9X) this.A0K.get(d9k.A00);
                            int i16 = d9k.A00;
                            if (sparseArray.size() == 1) {
                                obj3 = sparseArray.valueAt(0);
                            } else {
                                obj3 = sparseArray.get(i16);
                                D6U.A01(obj3);
                            }
                            DA7 da7 = (DA7) obj3;
                            D6U.A01(d9k);
                            d9x.A05 = d9k;
                            D6U.A01(da7);
                            d9x.A04 = da7;
                            d9x.A06.AEh(d9k.A07);
                            d9x.A01();
                            i12++;
                        }
                    } else {
                        while (i12 < size3) {
                            D9k d9k2 = (D9k) sparseArray2.valueAt(i12);
                            D9X d9x2 = new D9X(this.A0C.Brb(i12, d9k2.A03));
                            int i17 = d9k2.A00;
                            if (sparseArray.size() == 1) {
                                obj2 = sparseArray.valueAt(0);
                            } else {
                                obj2 = sparseArray.get(i17);
                                D6U.A01(obj2);
                            }
                            DA7 da72 = (DA7) obj2;
                            D6U.A01(d9k2);
                            d9x2.A05 = d9k2;
                            D6U.A01(da72);
                            d9x2.A04 = da72;
                            d9x2.A06.AEh(d9k2.A07);
                            d9x2.A01();
                            this.A0K.put(d9k2.A00, d9x2);
                            this.A08 = Math.max(this.A08, d9k2.A04);
                            i12++;
                        }
                        if (this.A0I == null) {
                            C29687D4y[] d4yArr = new C29687D4y[2];
                            this.A0I = d4yArr;
                            C29687D4y d4y = this.A0L;
                            if (d4y != null) {
                                d4yArr[0] = d4y;
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            if ((this.A0J & 4) != 0) {
                                d4yArr[i10] = this.A0C.Brb(this.A0K.size(), 4);
                                i10++;
                            }
                            C29687D4y[] d4yArr2 = (C29687D4y[]) Arrays.copyOf(this.A0I, i10);
                            this.A0I = d4yArr2;
                            for (C29687D4y AEh : d4yArr2) {
                                AEh.AEh(A0W);
                            }
                        }
                        if (this.A0H == null) {
                            this.A0H = new C29687D4y[this.A0U.size()];
                            for (int i18 = 0; i18 < this.A0H.length; i18++) {
                                C29687D4y Brb = this.A0C.Brb(this.A0K.size() + 1 + i18, 3);
                                Brb.AEh((Format) this.A0U.get(i18));
                                this.A0H[i18] = Brb;
                            }
                        }
                        this.A0C.ADE();
                    }
                } else if (i11 == 1836019558) {
                    SparseArray sparseArray3 = this.A0K;
                    int i19 = this.A0J;
                    byte[] bArr = this.A0V;
                    int size4 = d9c2.A01.size();
                    for (int i20 = 0; i20 < size4; i20++) {
                        C29772D9c d9c4 = (C29772D9c) d9c2.A01.get(i20);
                        C29772D9c d9c5 = d9c4;
                        if (d9c4.A00 == 1953653094) {
                            D9O d9o3 = d9c5.A01(1952868452).A00;
                            SparseArray sparseArray4 = sparseArray3;
                            d9o3.A0C(8);
                            int A004 = d9o3.A00() & 16777215;
                            int A005 = d9o3.A00();
                            if (sparseArray4.size() == 1) {
                                obj = sparseArray4.valueAt(0);
                            } else {
                                obj = sparseArray4.get(A005);
                            }
                            D9X d9x3 = (D9X) obj;
                            if (d9x3 == null) {
                                d9x3 = null;
                            } else {
                                if ((A004 & 1) != 0) {
                                    long A063 = d9o3.A06();
                                    C29771D9b d9b = d9x3.A07;
                                    d9b.A04 = A063;
                                    d9b.A03 = A063;
                                }
                                DA7 da73 = d9x3.A04;
                                if ((A004 & 2) != 0) {
                                    i = d9o3.A02() - 1;
                                } else {
                                    i = da73.A02;
                                }
                                if ((A004 & 8) != 0) {
                                    i2 = d9o3.A02();
                                } else {
                                    i2 = da73.A00;
                                }
                                if ((A004 & 16) != 0) {
                                    i3 = d9o3.A02();
                                } else {
                                    i3 = da73.A03;
                                }
                                if ((A004 & 32) != 0) {
                                    i4 = d9o3.A02();
                                } else {
                                    i4 = da73.A01;
                                }
                                d9x3.A07.A06 = new DA7(i, i2, i3, i4);
                            }
                            if (d9x3 != null) {
                                C29771D9b d9b2 = d9x3.A07;
                                C29771D9b d9b3 = d9b2;
                                long j3 = d9b2.A05;
                                d9x3.A01();
                                if (d9c5.A01(1952867444) != null && (i19 & 2) == 0) {
                                    D9O d9o4 = d9c5.A01(1952867444).A00;
                                    d9o4.A0C(8);
                                    j3 = ((d9o4.A00() >> 24) & 255) == 1 ? d9o4.A06() : d9o4.A05();
                                }
                                List list = d9c5.A02;
                                int size5 = list.size();
                                int i21 = 0;
                                int i22 = 0;
                                for (int i23 = 0; i23 < size5; i23++) {
                                    DA2 da22 = (DA2) list.get(i23);
                                    if (da22.A00 == 1953658222) {
                                        D9O d9o5 = da22.A00;
                                        d9o5.A0C(12);
                                        int A022 = d9o5.A02();
                                        if (A022 > 0) {
                                            i22 += A022;
                                            i21++;
                                        }
                                    }
                                }
                                d9x3.A02 = 0;
                                d9x3.A00 = 0;
                                d9x3.A01 = 0;
                                C29771D9b d9b4 = d9x3.A07;
                                d9b4.A02 = i21;
                                d9b4.A00 = i22;
                                int[] iArr = d9b4.A0D;
                                if (iArr == null || iArr.length < i21) {
                                    d9b4.A0F = new long[i21];
                                    d9b4.A0D = new int[i21];
                                }
                                int[] iArr2 = d9b4.A0C;
                                if (iArr2 == null || iArr2.length < i22) {
                                    int i24 = (i22 * 125) / 100;
                                    d9b4.A0C = new int[i24];
                                    d9b4.A0B = new int[i24];
                                    d9b4.A0E = new long[i24];
                                    d9b4.A0H = new boolean[i24];
                                    d9b4.A0G = new boolean[i24];
                                }
                                int i25 = 0;
                                int i26 = 0;
                                for (int i27 = 0; i27 < size5; i27++) {
                                    DA2 da23 = (DA2) list.get(i27);
                                    if (da23.A00 == 1953658222) {
                                        int i28 = i25 + 1;
                                        D9O d9o6 = da23.A00;
                                        long j4 = j3;
                                        d9o6.A0C(8);
                                        int A006 = d9o6.A00() & 16777215;
                                        D9k d9k3 = d9x3.A05;
                                        C29771D9b d9b5 = d9x3.A07;
                                        DA7 da74 = d9b5.A06;
                                        int[] iArr3 = d9b5.A0D;
                                        int A023 = d9o6.A02();
                                        iArr3[i25] = A023;
                                        long[] jArr = d9b5.A0F;
                                        long j5 = d9b5.A04;
                                        jArr[i25] = j5;
                                        if ((A006 & 1) != 0) {
                                            jArr[i25] = j5 + ((long) d9o6.A00());
                                        }
                                        boolean z5 = false;
                                        if ((A006 & 4) != 0) {
                                            z5 = true;
                                        }
                                        int i29 = da74.A01;
                                        int i30 = i29;
                                        int i31 = i29;
                                        if (z5) {
                                            i30 = d9o6.A02();
                                        }
                                        boolean z6 = false;
                                        if ((A006 & 256) != 0) {
                                            z6 = true;
                                        }
                                        boolean z7 = false;
                                        if ((A006 & 512) != 0) {
                                            z7 = true;
                                        }
                                        boolean z8 = false;
                                        if ((A006 & 1024) != 0) {
                                            z8 = true;
                                        }
                                        boolean z9 = false;
                                        if ((A006 & 2048) != 0) {
                                            z9 = true;
                                        }
                                        long[] jArr2 = d9k3.A08;
                                        long j6 = 0;
                                        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                            j6 = C25948Bd0.A04(d9k3.A09[0], 1000, d9k3.A06);
                                        }
                                        int[] iArr4 = d9b5.A0C;
                                        int[] iArr5 = d9b5.A0B;
                                        long[] jArr3 = d9b5.A0E;
                                        boolean[] zArr = d9b5.A0H;
                                        if (d9k3.A03 == 2) {
                                            z = true;
                                        }
                                        z = false;
                                        int i32 = i26 + A023;
                                        long j7 = d9k3.A06;
                                        if (i25 > 0) {
                                            j4 = d9b5.A05;
                                        }
                                        while (true) {
                                            i6 = i32;
                                            if (i26 >= i6) {
                                                break;
                                            }
                                            if (z6) {
                                                i7 = d9o6.A02();
                                            } else {
                                                i7 = da74.A00;
                                            }
                                            if (z7) {
                                                i8 = d9o6.A02();
                                            } else {
                                                i8 = da74.A03;
                                            }
                                            if (i26 == 0 && z5) {
                                                i9 = i30;
                                            } else if (z8) {
                                                i9 = d9o6.A00();
                                            } else {
                                                i9 = i31;
                                            }
                                            if (z9) {
                                                iArr5[i26] = (int) ((((long) d9o6.A00()) * 1000) / j7);
                                            } else {
                                                z9 = false;
                                                iArr5[i26] = 0;
                                            }
                                            jArr3[i26] = C25948Bd0.A04(j4, 1000, j7) - j6;
                                            iArr4[i26] = i8;
                                            if (((i9 >> 16) & 1) != 0 || (z && i26 != 0)) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            zArr[i26] = z2;
                                            j4 += (long) i7;
                                            i26++;
                                        }
                                        d9b5.A05 = j4;
                                        i26 = i6;
                                        i25 = i28;
                                    }
                                }
                                D9k d9k4 = d9x3.A05;
                                int i33 = d9b3.A06.A02;
                                C29773D9d[] d9dArr = d9k4.A0A;
                                if (d9dArr == null) {
                                    d9d2 = null;
                                } else {
                                    d9d2 = d9dArr[i33];
                                }
                                DA2 A013 = d9c5.A01(1935763834);
                                if (A013 != null) {
                                    D9O d9o7 = A013.A00;
                                    int i34 = d9d2.A00;
                                    d9o7.A0C(8);
                                    boolean z10 = true;
                                    if ((d9o7.A00() & 16777215 & 1) == 1) {
                                        d9o7.A0D(8);
                                    }
                                    int A014 = d9o7.A01();
                                    int A024 = d9o7.A02();
                                    C29771D9b d9b6 = d9b3;
                                    int i35 = d9b6.A00;
                                    if (A024 == i35) {
                                        if (A014 == 0) {
                                            boolean[] zArr2 = d9b6.A0G;
                                            i5 = 0;
                                            for (int i36 = 0; i36 < A024; i36++) {
                                                int A015 = d9o7.A01();
                                                i5 += A015;
                                                boolean z11 = false;
                                                if (A015 > i34) {
                                                    z11 = true;
                                                }
                                                zArr2[i36] = z11;
                                            }
                                        } else {
                                            if (A014 <= i34) {
                                                z10 = false;
                                            }
                                            i5 = A014 * A024;
                                            Arrays.fill(d9b6.A0G, 0, A024, z10);
                                        }
                                        C29771D9b d9b7 = d9b3;
                                        D9O d9o8 = d9b7.A08;
                                        if (d9o8 == null || d9o8.A00 < i5) {
                                            d9b7.A08 = new D9O(i5);
                                        }
                                        d9b7.A01 = i5;
                                        d9b7.A09 = true;
                                        d9b7.A0A = true;
                                    } else {
                                        throw new C2101594l(AnonymousClass000.A07("Length mismatch: ", A024, ", ", i35));
                                    }
                                }
                                DA2 A016 = d9c5.A01(1935763823);
                                if (A016 != null) {
                                    D9O d9o9 = A016.A00;
                                    d9o9.A0C(8);
                                    int A007 = d9o9.A00();
                                    if ((A007 & 16777215 & 1) == 1) {
                                        d9o9.A0D(8);
                                    }
                                    int A025 = d9o9.A02();
                                    if (A025 == 1) {
                                        int i37 = (A007 >> 24) & 255;
                                        C29771D9b d9b8 = d9b3;
                                        long j8 = d9b8.A03;
                                        if (i37 == 0) {
                                            A062 = d9o9.A05();
                                        } else {
                                            A062 = d9o9.A06();
                                        }
                                        d9b8.A03 = j8 + A062;
                                    } else {
                                        throw new C2101594l(AnonymousClass000.A05("Unexpected saio entry count: ", A025));
                                    }
                                }
                                DA2 A017 = d9c5.A01(1936027235);
                                if (A017 != null) {
                                    A02(A017.A00, 0, d9b3);
                                }
                                C29772D9c d9c6 = d9c5;
                                DA2 A018 = d9c6.A01(1935828848);
                                DA2 A019 = d9c6.A01(1936158820);
                                if (!(A018 == null || A019 == null)) {
                                    D9O d9o10 = A018.A00;
                                    D9O d9o11 = A019.A00;
                                    if (d9d2 != null) {
                                        str2 = d9d2.A02;
                                    } else {
                                        str2 = null;
                                    }
                                    C29771D9b d9b9 = d9b3;
                                    d9o10.A0C(8);
                                    int A008 = d9o10.A00();
                                    if (d9o10.A00() == 1936025959) {
                                        if (((A008 >> 24) & 255) == 1) {
                                            d9o10.A0D(4);
                                        }
                                        if (d9o10.A00() == 1) {
                                            d9o11.A0C(8);
                                            int A009 = d9o11.A00();
                                            if (d9o11.A00() == 1936025959) {
                                                int i38 = (A009 >> 24) & 255;
                                                if (i38 == 1) {
                                                    if (d9o11.A05() == 0) {
                                                        throw new C2101594l("Variable length description in sgpd found (unsupported)");
                                                    }
                                                } else if (i38 >= 2) {
                                                    d9o11.A0D(4);
                                                }
                                                if (d9o11.A05() == 1) {
                                                    d9o11.A0D(1);
                                                    int A0110 = d9o11.A01();
                                                    int i39 = (A0110 & 240) >> 4;
                                                    int i40 = A0110 & 15;
                                                    boolean z12 = false;
                                                    if (d9o11.A01() == 1) {
                                                        z12 = true;
                                                    }
                                                    if (z12) {
                                                        int A0111 = d9o11.A01();
                                                        byte[] bArr2 = new byte[16];
                                                        d9o11.A0F(bArr2, 0, 16);
                                                        byte[] bArr3 = null;
                                                        if (A0111 == 0) {
                                                            int A0112 = d9o11.A01();
                                                            bArr3 = new byte[A0112];
                                                            d9o11.A0F(bArr3, 0, A0112);
                                                        }
                                                        d9b9.A09 = true;
                                                        d9b9.A07 = new C29773D9d(z12, str2, A0111, bArr2, i39, i40, bArr3);
                                                    }
                                                } else {
                                                    throw new C2101594l("Entry count in sgpd != 1 (unsupported).");
                                                }
                                            }
                                        } else {
                                            throw new C2101594l("Entry count in sbgp != 1 (unsupported).");
                                        }
                                    }
                                }
                                int size6 = d9c5.A02.size();
                                for (int i41 = 0; i41 < size6; i41++) {
                                    DA2 da24 = (DA2) d9c5.A02.get(i41);
                                    if (da24.A00 == 1970628964) {
                                        D9O d9o12 = da24.A00;
                                        byte[] bArr4 = bArr;
                                        d9o12.A0C(8);
                                        d9o12.A0F(bArr4, 0, 16);
                                        if (Arrays.equals(bArr4, A0Y)) {
                                            A02(d9o12, 16, d9b3);
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    DrmInitData A0010 = A00(d9c2.A02);
                    if (A0010 != null) {
                        int size7 = this.A0K.size();
                        for (int i42 = 0; i42 < size7; i42++) {
                            D9X d9x4 = (D9X) this.A0K.valueAt(i42);
                            D9k d9k5 = d9x4.A05;
                            int i43 = d9x4.A07.A06.A02;
                            C29773D9d[] d9dArr2 = d9k5.A0A;
                            if (d9dArr2 == null) {
                                d9d = null;
                            } else {
                                d9d = d9dArr2[i43];
                            }
                            if (d9d != null) {
                                str = d9d.A02;
                            } else {
                                str = null;
                            }
                            d9x4.A06.AEh(d9k5.A07.A08(A0010.A00(str)));
                        }
                    }
                    if (this.A0A != -9223372036854775807L) {
                        int size8 = this.A0K.size();
                        for (int i44 = 0; i44 < size8; i44++) {
                            D9X d9x5 = (D9X) this.A0K.valueAt(i44);
                            long A0113 = C29686D4x.A01(this.A0A);
                            int i45 = d9x5.A01;
                            while (true) {
                                C29771D9b d9b10 = d9x5.A07;
                                if (i45 >= d9b10.A00 || d9b10.A0E[i45] + ((long) d9b10.A0B[i45]) >= A0113) {
                                } else {
                                    if (d9b10.A0H[i45]) {
                                        d9x5.A03 = i45;
                                    }
                                    i45++;
                                }
                            }
                        }
                        this.A0A = -9223372036854775807L;
                    }
                } else if (!this.A0S.isEmpty()) {
                    ((C29772D9c) this.A0S.peek()).A01.add(d9c2);
                }
            }
        }
        this.A02 = 0;
        this.A00 = 0;
    }

    public static void A02(D9O d9o, int i, C29771D9b d9b) {
        d9o.A0C(i + 8);
        int A002 = d9o.A00() & 16777215;
        if ((A002 & 1) == 0) {
            int i2 = A002 & 2;
            boolean z = false;
            if (i2 != 0) {
                z = true;
            }
            int A022 = d9o.A02();
            int i3 = d9b.A00;
            if (A022 == i3) {
                Arrays.fill(d9b.A0G, 0, A022, z);
                int i4 = d9o.A00 - d9o.A01;
                D9O d9o2 = d9b.A08;
                if (d9o2 == null || d9o2.A00 < i4) {
                    d9b.A08 = new D9O(i4);
                }
                d9b.A01 = i4;
                d9b.A09 = true;
                d9b.A0A = true;
                d9o.A0F(d9b.A08.A02, 0, i4);
                d9b.A08.A0C(0);
                d9b.A0A = false;
                return;
            }
            throw new C2101594l(AnonymousClass000.A07("Length mismatch: ", A022, ", ", i3));
        }
        throw new C2101594l("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v57, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v39 */
    /* JADX WARNING: type inference failed for: r3v41 */
    /* JADX WARNING: type inference failed for: r3v55 */
    /* JADX WARNING: type inference failed for: r3v56 */
    /* JADX WARNING: type inference failed for: r3v58 */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fb, code lost:
        if (r3 != 3) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0364, code lost:
        if (r4.A0G[r2] == false) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0395, code lost:
        if (r5.A0G[r2] == false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0711, code lost:
        if (r3 == 1701082227) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07a2, code lost:
        if (r3 == 1701671783) goto L_0x07a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        if (r10 == false) goto L_0x00f3;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=?, for r3v42, types: [byte, boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x062a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0313 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0000 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0000 A[SYNTHETIC] */
    public final int BYv(C29778D9m d9m, C29704D5q d5q) {
        boolean z;
        boolean z2;
        boolean z3;
        Uri AZY;
        long j;
        long j2;
        String str;
        String str2;
        long j3;
        long j4;
        long A062;
        long A063;
        boolean z4;
        C29719D6g d6g;
        boolean z5;
        int i;
        int i2;
        int i3;
        boolean z6;
        boolean z7;
        boolean z8;
        D9O d9o;
        boolean z9;
        int i4;
        while (true) {
            int i5 = this.A02;
            C29778D9m d9m2 = d9m;
            if (i5 == 0) {
                if (this.A00 == 0) {
                    if (!d9m2.BZ2(this.A0N.A02, 0, 8, true)) {
                        z3 = false;
                        if (z3) {
                            return -1;
                        }
                    } else {
                        this.A00 = 8;
                        this.A0N.A0C(0);
                        D9O d9o2 = this.A0N;
                        this.A07 = d9o2.A05();
                        this.A01 = d9o2.A00();
                    }
                }
                long j5 = this.A07;
                if (j5 == 1) {
                    d9m2.readFully(this.A0N.A02, 8, 8);
                    this.A00 += 8;
                    this.A07 = this.A0N.A06();
                } else if (j5 == 0) {
                    long length = d9m2.getLength();
                    if (length == -1 && !this.A0S.isEmpty()) {
                        length = ((C29772D9c) this.A0S.peek()).A00;
                    }
                    if (length != -1) {
                        this.A07 = (length - d9m2.ASL()) + ((long) this.A00);
                    }
                }
                long j6 = this.A07;
                long j7 = (long) this.A00;
                if (j6 >= j7) {
                    long ASL = d9m2.ASL() - j7;
                    if (this.A01 == 1836019558) {
                        int size = this.A0K.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            C29771D9b d9b = ((D9X) this.A0K.valueAt(i6)).A07;
                            d9b.A03 = ASL;
                            d9b.A04 = ASL;
                        }
                    }
                    int i7 = this.A01;
                    if (i7 == 1835295092) {
                        this.A0D = null;
                        this.A09 = this.A07 + ASL;
                        if (!this.A0F) {
                            this.A0C.Bet(new C29688D5a(this.A08, ASL));
                            this.A0F = true;
                        }
                        this.A02 = 2;
                        z3 = true;
                    } else {
                        if (!(i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1836019558 || i7 == 1953653094 || i7 == 1836475768)) {
                            z = false;
                        }
                        z = true;
                        if (z) {
                            long ASL2 = (d9m2.ASL() + this.A07) - 8;
                            this.A0S.push(new C29772D9c(i7, ASL2));
                            if (this.A07 == ((long) this.A00)) {
                                A01(ASL2);
                            } else {
                                this.A02 = 0;
                                this.A00 = 0;
                            }
                        } else {
                            if (!(i7 == 1751411826 || i7 == 1835296868 || i7 == 1836476516 || i7 == 1936286840 || i7 == 1937011556 || i7 == 1952867444 || i7 == 1952868452 || i7 == 1953196132 || i7 == 1953654136 || i7 == 1953658222 || i7 == 1886614376 || i7 == 1935763834 || i7 == 1935763823 || i7 == 1936027235 || i7 == 1970628964 || i7 == 1935828848 || i7 == 1936158820 || i7 == 1701606260 || i7 == 1835362404)) {
                                z2 = false;
                            }
                            z2 = true;
                            if (z2) {
                                if (this.A00 == 8) {
                                    long j8 = this.A07;
                                    if (j8 <= 2147483647L) {
                                        D9O d9o3 = new D9O((int) j8);
                                        this.A0E = d9o3;
                                        System.arraycopy(this.A0N.A02, 0, d9o3.A02, 0, 8);
                                        this.A02 = 1;
                                    } else {
                                        throw new C2101594l("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                } else {
                                    throw new C2101594l("Leaf atom defines extended atom size (unsupported).");
                                }
                            } else if (this.A07 <= 2147483647L) {
                                this.A0E = null;
                                this.A02 = 1;
                            } else {
                                throw new C2101594l("Skipping atom with length > 2147483647 (unsupported).");
                            }
                        }
                        z3 = true;
                    }
                    if (z3) {
                    }
                } else {
                    throw new C2101594l("Atom size less than header length (unsupported).");
                }
            } else if (i5 == 1) {
                int i8 = ((int) this.A07) - this.A00;
                D9O d9o4 = this.A0E;
                if (d9o4 != null) {
                    d9m2.readFully(d9o4.A02, 8, i8);
                    DA2 da2 = new DA2(this.A01, this.A0E);
                    if (!this.A0S.isEmpty()) {
                        ((C29772D9c) this.A0S.peek()).A02.add(da2);
                    } else {
                        int i9 = da2.A00;
                        if (i9 == 1936286840) {
                            D9O d9o5 = da2.A00;
                            long ASL3 = d9m2.ASL();
                            d9o5.A0C(8);
                            int A002 = (d9o5.A00() >> 24) & 255;
                            d9o5.A0D(4);
                            long A052 = d9o5.A05();
                            if (A002 == 0) {
                                A062 = d9o5.A05();
                                A063 = d9o5.A05();
                            } else {
                                A062 = d9o5.A06();
                                A063 = d9o5.A06();
                            }
                            long j9 = ASL3 + A063;
                            long A042 = C25948Bd0.A04(A062, 1000000, A052);
                            d9o5.A0D(2);
                            int A032 = d9o5.A03();
                            int[] iArr = new int[A032];
                            long[] jArr = new long[A032];
                            long[] jArr2 = new long[A032];
                            long[] jArr3 = new long[A032];
                            long j10 = A042;
                            int i10 = 0;
                            while (i10 < A032) {
                                int A003 = d9o5.A00();
                                if ((Integer.MIN_VALUE & A003) == 0) {
                                    long A053 = d9o5.A05();
                                    iArr[i10] = A003 & Integer.MAX_VALUE;
                                    jArr[i10] = j9;
                                    jArr3[i10] = j10;
                                    long j11 = j10;
                                    A062 += A053;
                                    j10 = C25948Bd0.A04(A062, 1000000, A052);
                                    jArr2[i10] = j10 - j11;
                                    d9o5.A0D(4);
                                    j9 += (long) iArr[i10];
                                    i10++;
                                } else {
                                    throw new C2101594l("Unhandled indirect reference");
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(A042), new D50(iArr, jArr, jArr2, jArr3));
                            this.A0B = ((Long) create.first).longValue();
                            this.A0C.Bet((D8B) create.second);
                            this.A0F = true;
                        } else if (i9 == 1701671783 && (AZY = d9m2.AZY()) != null) {
                            D9O d9o6 = da2.A00;
                            C29687D4y[] d4yArr = this.A0I;
                            if (!(d4yArr == null || d4yArr.length == 0)) {
                                d9o6.A0C(8);
                                int A004 = (d9o6.A00() >> 24) & 255;
                                if (A004 == 0) {
                                    str2 = d9o6.A08();
                                    D6U.A01(str2);
                                    str = d9o6.A08();
                                    D6U.A01(str);
                                    long A054 = d9o6.A05();
                                    j4 = C25948Bd0.A04(d9o6.A05(), 1000000, A054);
                                    long j12 = this.A0B;
                                    if (j12 != -9223372036854775807L) {
                                        j3 = j12 + j4;
                                    } else {
                                        j3 = -9223372036854775807L;
                                    }
                                    j2 = C25948Bd0.A04(d9o6.A05(), 1000, A054);
                                    j = d9o6.A05();
                                } else if (A004 != 1) {
                                    Log.w("FragmentedMp4Extractor", AnonymousClass000.A05("Skipping unsupported emsg version: ", A004));
                                } else {
                                    long A055 = d9o6.A05();
                                    j3 = C25948Bd0.A04(d9o6.A06(), 1000000, A055);
                                    j2 = C25948Bd0.A04(d9o6.A05(), 1000, A055);
                                    j = d9o6.A05();
                                    str2 = d9o6.A08();
                                    D6U.A01(str2);
                                    str = d9o6.A08();
                                    D6U.A01(str);
                                    j4 = -9223372036854775807L;
                                }
                                int i11 = d9o6.A00 - d9o6.A01;
                                byte[] bArr = new byte[i11];
                                d9o6.A0F(bArr, 0, i11);
                                D9O d9o7 = new D9O(this.A0M.A01(new EventMessage(str2, str, j2, j, bArr)));
                                int i12 = d9o7.A00 - d9o7.A01;
                                for (C29687D4y d4y : this.A0I) {
                                    d9o7.A0C(0);
                                    d4y.Btd(AZY);
                                    d4y.BeK(d9o7, i12);
                                }
                                if (j3 == -9223372036854775807L) {
                                    this.A0T.addLast(new DA9(j4, i12));
                                    this.A03 += i12;
                                } else {
                                    for (C29687D4y BeM : this.A0I) {
                                        BeM.BeM(j3, 1, i12, 0, (C29719D6g) null);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    d9m2.Bos(i8);
                }
                A01(d9m2.ASL());
            } else if (i5 != 2) {
                C29778D9m d9m3 = d9m2;
                int i13 = 4;
                int i14 = 1;
                ? r3 = 0;
                if (i5 == 3) {
                    if (this.A0D == null) {
                        SparseArray sparseArray = this.A0K;
                        int size2 = sparseArray.size();
                        D9X d9x = null;
                        long j13 = Long.MAX_VALUE;
                        for (int i15 = 0; i15 < size2; i15++) {
                            D9X d9x2 = (D9X) sparseArray.valueAt(i15);
                            int i16 = d9x2.A02;
                            C29771D9b d9b2 = d9x2.A07;
                            if (i16 != d9b2.A02) {
                                long j14 = d9b2.A0F[i16];
                                if (j14 < j13) {
                                    d9x = d9x2;
                                    j13 = j14;
                                }
                            }
                        }
                        if (d9x == null) {
                            int ASL4 = (int) (this.A09 - d9m2.ASL());
                            if (ASL4 >= 0) {
                                d9m2.Bos(ASL4);
                                this.A02 = 0;
                                this.A00 = 0;
                                z4 = false;
                                if (z4) {
                                    return r3;
                                }
                            } else {
                                throw new C2101594l("Offset to end of mdat was negative.");
                            }
                        } else {
                            int ASL5 = (int) (d9x.A07.A0F[d9x.A02] - d9m2.ASL());
                            if (ASL5 < 0) {
                                Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                ASL5 = 0;
                            }
                            d9m3.Bos(ASL5);
                            this.A0D = d9x;
                        }
                    }
                    D9X d9x3 = this.A0D;
                    int[] iArr2 = d9x3.A07.A0C;
                    int i17 = d9x3.A01;
                    int i18 = iArr2[i17];
                    this.A06 = i18;
                    if (i17 < d9x3.A03) {
                        d9m3.Bos(i18);
                        D9X d9x4 = this.A0D;
                        C29773D9d A005 = D9X.A00(d9x4);
                        if (A005 != null) {
                            D9O d9o8 = d9x4.A07.A08;
                            int i19 = A005.A00;
                            if (i19 != 0) {
                                d9o8.A0D(i19);
                            }
                            C29771D9b d9b3 = d9x4.A07;
                            int i20 = d9x4.A01;
                            if (d9b3.A09) {
                                z8 = true;
                            }
                            z8 = false;
                            if (z8) {
                                d9o8.A0D(d9o8.A03() * 6);
                            }
                        }
                        if (!this.A0D.A02()) {
                            this.A0D = null;
                        }
                        this.A02 = 3;
                        z4 = true;
                        if (z4) {
                        }
                    } else {
                        if (d9x3.A05.A02 == 1) {
                            this.A06 = i18 - 8;
                            d9m3.Bos(8);
                        }
                        D9X d9x5 = this.A0D;
                        C29773D9d A006 = D9X.A00(d9x5);
                        if (A006 == null) {
                            i4 = 0;
                        } else {
                            int i21 = A006.A00;
                            if (i21 != 0) {
                                d9o = d9x5.A07.A08;
                            } else {
                                byte[] bArr2 = A006.A04;
                                d9o = d9x5.A08;
                                i21 = bArr2.length;
                                d9o.A0E(bArr2, i21);
                            }
                            C29771D9b d9b4 = d9x5.A07;
                            int i22 = d9x5.A01;
                            if (d9b4.A09) {
                                z9 = true;
                            }
                            z9 = false;
                            D9O d9o9 = d9x5.A09;
                            byte[] bArr3 = d9o9.A02;
                            int i23 = 0;
                            if (z9) {
                                i23 = 128;
                            }
                            bArr3[0] = (byte) (i23 | i21);
                            d9o9.A0C(0);
                            d9x5.A06.BeK(d9x5.A09, 1);
                            d9x5.A06.BeK(d9o, i21);
                            if (!z9) {
                                i4 = i21 + 1;
                            } else {
                                D9O d9o10 = d9x5.A07.A08;
                                int A033 = d9o10.A03();
                                d9o10.A0D(-2);
                                int i24 = (A033 * 6) + 2;
                                d9x5.A06.BeK(d9o10, i24);
                                i4 = i21 + 1 + i24;
                            }
                        }
                        this.A04 = i4;
                        this.A06 += i4;
                        this.A02 = 4;
                        this.A05 = 0;
                    }
                }
                D9X d9x6 = this.A0D;
                C29771D9b d9b5 = d9x6.A07;
                C29771D9b d9b6 = d9b5;
                D9k d9k = d9x6.A05;
                C29687D4y d4y2 = d9x6.A06;
                int i25 = d9x6.A01;
                long j15 = (d9b5.A0E[i25] + ((long) d9b6.A0B[i25])) * 1000;
                int i26 = d9k.A01;
                if (i26 == 0) {
                    while (true) {
                        int i27 = this.A04;
                        int i28 = this.A06;
                        if (i27 >= i28) {
                            break;
                        }
                        this.A04 += d4y2.BeJ(d9m3, i28 - i27, false);
                    }
                } else {
                    byte[] bArr4 = this.A0P.A02;
                    bArr4[0] = 0;
                    bArr4[1] = 0;
                    bArr4[2] = 0;
                    int i29 = i26 + 1;
                    int i30 = 4 - i26;
                    while (this.A04 < this.A06) {
                        int i31 = this.A05;
                        if (i31 == 0) {
                            d9m3.readFully(bArr4, i30, i29);
                            this.A0P.A0C(r3);
                            int A007 = this.A0P.A00();
                            if (A007 >= i14) {
                                this.A05 = A007 - 1;
                                this.A0Q.A0C(r3);
                                d4y2.BeK(this.A0Q, i13);
                                d4y2.BeK(this.A0P, i14);
                                if (this.A0H.length > 0) {
                                    String str3 = d9k.A07.A0S;
                                    byte b = bArr4[i13];
                                    boolean z10 = true;
                                    if ((!"video/avc".equals(str3) || (b & 31) != 6) && (!"video/hevc".equals(str3) || ((b & 126) >> i14) != 39)) {
                                        z10 = false;
                                    }
                                    z7 = true;
                                }
                                z7 = false;
                                this.A0G = z7;
                                this.A04 += 5;
                                this.A06 += i30;
                                z5 = r3;
                            } else {
                                throw new C2101594l("Invalid NAL length");
                            }
                        } else {
                            if (this.A0G) {
                                D9O d9o11 = this.A0O;
                                d9o11.A0A(i31);
                                d9m3.readFully(d9o11.A02, r3, i31);
                                d4y2.BeK(this.A0O, this.A05);
                                i = this.A05;
                                D9O d9o12 = this.A0O;
                                byte[] bArr5 = d9o12.A02;
                                int i32 = d9o12.A00;
                                synchronized (C29787D9w.A01) {
                                    int i33 = 0;
                                    int i34 = 0;
                                    while (i33 < i32) {
                                        while (true) {
                                            if (i33 < i32 - 2) {
                                                if (bArr5[i33] == 0 && bArr5[i33 + 1] == 0 && bArr5[i33 + 2] == 3) {
                                                    break;
                                                }
                                                i33++;
                                            } else {
                                                i33 = i32;
                                                break;
                                            }
                                        }
                                        if (i33 < i32) {
                                            int[] iArr3 = C29787D9w.A00;
                                            int length2 = iArr3.length;
                                            if (length2 <= i34) {
                                                C29787D9w.A00 = Arrays.copyOf(iArr3, length2 << 1);
                                            }
                                            C29787D9w.A00[i34] = i33;
                                            i33 += 3;
                                            i34++;
                                        }
                                    }
                                    i2 = i32 - i34;
                                    int i35 = 0;
                                    int i36 = 0;
                                    for (int i37 = 0; i37 < i34; i37++) {
                                        int i38 = C29787D9w.A00[i37] - i36;
                                        System.arraycopy(bArr5, i36, bArr5, i35, i38);
                                        int i39 = i35 + i38;
                                        int i40 = i39 + 1;
                                        bArr5[i39] = r3;
                                        i35 = i40 + 1;
                                        bArr5[i40] = r3;
                                        i36 += i38 + 3;
                                    }
                                    System.arraycopy(bArr5, i36, bArr5, i35, i2 - i35);
                                }
                                this.A0O.A0C("video/hevc".equals(d9k.A07.A0S));
                                this.A0O.A0B(i2);
                                D9O d9o13 = this.A0O;
                                C29687D4y[] d4yArr2 = this.A0H;
                                while (true) {
                                    D9O d9o14 = d9o13;
                                    boolean z11 = true;
                                    if (d9o14.A00 - d9o14.A01 <= 1) {
                                        break;
                                    }
                                    int i41 = 0;
                                    while (true) {
                                        D9O d9o15 = d9o13;
                                        if (d9o15.A00 - d9o15.A01 != 0) {
                                            int A012 = d9o13.A01();
                                            i41 += A012;
                                            if (A012 != 255) {
                                                break;
                                            }
                                        } else {
                                            i41 = -1;
                                            break;
                                        }
                                    }
                                    int i42 = 0;
                                    while (true) {
                                        D9O d9o16 = d9o13;
                                        if (d9o16.A00 - d9o16.A01 != 0) {
                                            int A013 = d9o13.A01();
                                            i42 += A013;
                                            if (A013 != 255) {
                                                break;
                                            }
                                        } else {
                                            i42 = -1;
                                            break;
                                        }
                                    }
                                    int i43 = d9o13.A01;
                                    int i44 = i43 + i42;
                                    if (i42 == -1 || i42 > d9o13.A00 - i43) {
                                        Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                                        i44 = d9o13.A00;
                                    } else if (i41 == 4 && i42 >= 8) {
                                        int A014 = d9o13.A01();
                                        D9O d9o17 = d9o13;
                                        int A034 = d9o17.A03();
                                        if (A034 == 49) {
                                            i3 = d9o17.A00();
                                        } else {
                                            i3 = 0;
                                        }
                                        int A015 = d9o17.A01();
                                        if (A034 == 47) {
                                            d9o17.A0D(1);
                                        }
                                        if (A014 == 181 && (A034 == 49 || A034 == 47)) {
                                            z6 = true;
                                        }
                                        z6 = false;
                                        if (A034 == 49) {
                                            if (i3 != 1195456820) {
                                                z11 = false;
                                            }
                                            z6 &= z11;
                                        }
                                        if (z6) {
                                            long j16 = j15;
                                            int A016 = d9o13.A01();
                                            boolean z12 = false;
                                            if ((A016 & 64) != 0) {
                                                z12 = true;
                                            }
                                            if (z12) {
                                                d9o13.A0D(1);
                                                int i45 = (A016 & 31) * 3;
                                                int i46 = d9o13.A01;
                                                for (C29687D4y d4y3 : d4yArr2) {
                                                    d9o13.A0C(i46);
                                                    d4y3.BeK(d9o13, i45);
                                                    d4y3.BeM(j16, 1, i45, 0, (C29719D6g) null);
                                                }
                                            }
                                        }
                                    }
                                    d9o13.A0C(i44);
                                }
                            } else {
                                i = d4y2.BeJ(d9m3, i31, r3);
                            }
                            this.A04 += i;
                            this.A05 -= i;
                            i13 = 4;
                            i14 = 1;
                            z5 = false;
                        }
                        r3 = z5;
                    }
                    r3 = r3;
                }
                boolean z13 = d9b6.A0H[i25];
                C29773D9d A008 = D9X.A00(this.A0D);
                if (A008 != null) {
                    z13 |= true;
                    d6g = A008.A01;
                } else {
                    d6g = null;
                }
                d4y2.BeM(j15, z13, this.A06, 0, d6g);
                while (!this.A0T.isEmpty()) {
                    DA9 da9 = (DA9) this.A0T.removeFirst();
                    this.A03 -= da9.A00;
                    long j17 = da9.A01 + j15;
                    for (C29687D4y BeM2 : this.A0I) {
                        BeM2.BeM(j17, 1, da9.A00, this.A03, (C29719D6g) null);
                    }
                }
                if (!this.A0D.A02()) {
                    this.A0D = null;
                }
                this.A02 = 3;
                z4 = true;
                r3 = r3;
                if (z4) {
                }
            } else {
                int size3 = this.A0K.size();
                D9X d9x7 = null;
                long j18 = Long.MAX_VALUE;
                for (int i47 = 0; i47 < size3; i47++) {
                    C29771D9b d9b7 = ((D9X) this.A0K.valueAt(i47)).A07;
                    if (d9b7.A0A) {
                        long j19 = d9b7.A03;
                        if (j19 < j18) {
                            d9x7 = (D9X) this.A0K.valueAt(i47);
                            j18 = j19;
                        }
                    }
                }
                if (d9x7 == null) {
                    this.A02 = 3;
                } else {
                    int ASL6 = (int) (j18 - d9m2.ASL());
                    if (ASL6 >= 0) {
                        d9m2.Bos(ASL6);
                        C29771D9b d9b8 = d9x7.A07;
                        d9m2.readFully(d9b8.A08.A02, 0, d9b8.A01);
                        d9b8.A08.A0C(0);
                        d9b8.A0A = false;
                    } else {
                        throw new C2101594l("Offset to encryption data was negative.");
                    }
                }
            }
        }
        while (true) {
        }
    }

    public final void Ber(long j, long j2) {
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            ((D9X) this.A0K.valueAt(i)).A01();
        }
        this.A0T.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0S.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public D9R(int i, List list, C29687D4y d4y) {
        this.A0J = i | 0;
        this.A0U = Collections.unmodifiableList(list);
        this.A0L = d4y;
        byte[] bArr = new byte[16];
        this.A0V = bArr;
        this.A0R = new D9O(bArr);
        this.A0S = new ArrayDeque();
        this.A0T = new ArrayDeque();
        this.A0K = new SparseArray();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A02 = 0;
        this.A00 = 0;
    }

    public static DrmInitData A00(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            DA2 da2 = (DA2) list.get(i);
            if (da2.A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = da2.A00.A02;
                UUID A002 = D9N.A00(bArr);
                if (A002 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A002, "video/mp4", bArr, false));
                }
            }
        }
        if (arrayList != null) {
            return new DrmInitData((String) null, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[arrayList.size()]));
        }
        return null;
    }

    public final void AdH(C29790D9z d9z) {
        this.A0C = d9z;
    }
}
