package com.google.android.exoplayer2.extractor.mkv;

import android.util.Log;
import android.util.SparseArray;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import p000X.C2101594l;
import p000X.C25913Bc3;
import p000X.C25948Bd0;
import p000X.C25992Bdm;
import p000X.C29687D4y;
import p000X.C29699D5l;
import p000X.C29704D5q;
import p000X.C29777D9l;
import p000X.C29778D9m;
import p000X.C29781D9p;
import p000X.C29787D9w;
import p000X.C29790D9z;
import p000X.D6U;
import p000X.D93;
import p000X.D9O;
import p000X.D9S;
import p000X.D9U;
import p000X.D9Y;
import p000X.D9j;
import p000X.DA1;
import p000X.DA3;

public class MatroskaExtractor implements C29699D5l {
    public static final D93 A0q = DA3.A00;
    public static final UUID A0r = new UUID(72057594037932032L, -9223371306706625679L);
    public static final byte[] A0s = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(Charset.forName("UTF-8"));
    public static final byte[] A0t = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] A0u = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public C29790D9z A0J;
    public D9U A0K;
    public C25992Bdm A0L;
    public C25992Bdm A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int[] A0R;
    public byte A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public ByteBuffer A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final SparseArray A0c;
    public final DA1 A0d;
    public final C29777D9l A0e;
    public final D9O A0f;
    public final D9O A0g;
    public final D9O A0h;
    public final D9O A0i;
    public final D9O A0j;
    public final D9O A0k;
    public final D9O A0l;
    public final D9O A0m;
    public final D9O A0n;
    public final D9O A0o;
    public final boolean A0p;

    private void A02() {
        this.A0T = 0;
        this.A07 = 0;
        this.A0U = 0;
        this.A0Y = false;
        this.A0b = false;
        this.A0a = false;
        this.A0V = 0;
        this.A0S = 0;
        this.A0Z = false;
        D9O d9o = this.A0k;
        d9o.A01 = 0;
        d9o.A00 = 0;
    }

    private void A03(C29778D9m d9m, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        D9O d9o = this.A0n;
        byte[] bArr2 = d9o.A02;
        if (bArr2.length < i2) {
            d9o.A02 = Arrays.copyOf(bArr, i2 + i);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        d9m.readFully(this.A0n.A02, length, i);
        this.A0n.A0A(i2);
    }

    public static byte[] A06(long j, String str, long j2) {
        boolean z = false;
        if (j != -9223372036854775807L) {
            z = true;
        }
        D6U.A02(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}).getBytes(Charset.forName("UTF-8"));
    }

    public final int BYv(C29778D9m d9m, C29704D5q d5q) {
        boolean z;
        this.A0X = false;
        boolean z2 = true;
        while (z2 && !this.A0X) {
            z2 = this.A0d.BYy(d9m);
            if (z2) {
                long ASL = d9m.ASL();
                if (this.A0O) {
                    this.A0F = ASL;
                    d5q.A00 = this.A0B;
                    this.A0O = false;
                    z = true;
                } else {
                    if (this.A0Q) {
                        long j = this.A0F;
                        if (j != -1) {
                            d5q.A00 = j;
                            this.A0F = -1;
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    return 1;
                }
            }
        }
        if (z2) {
            return 0;
        }
        for (int i = 0; i < this.A0c.size(); i++) {
            D9U d9u = (D9U) this.A0c.valueAt(i);
            D9j d9j = d9u.A0c;
            if (d9j != null) {
                d9j.A00(d9u);
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ef  */
    public static int A00(MatroskaExtractor matroskaExtractor, C29778D9m d9m, D9U d9u, int i) {
        int BeJ;
        int BeJ2;
        int i2;
        int i3;
        byte[] bArr;
        String str = d9u.A0d;
        if ("S_TEXT/UTF8".equals(str)) {
            bArr = A0u;
        } else if ("S_TEXT/ASS".equals(str)) {
            bArr = A0t;
        } else {
            C29687D4y d4y = d9u.A0b;
            boolean z = true;
            if (!matroskaExtractor.A0Y) {
                if (d9u.A0j) {
                    matroskaExtractor.A01 &= -1073741825;
                    int i4 = 128;
                    if (!matroskaExtractor.A0b) {
                        d9m.readFully(matroskaExtractor.A0l.A02, 0, 1);
                        matroskaExtractor.A0T++;
                        byte b = matroskaExtractor.A0l.A02[0];
                        if ((b & 128) != 128) {
                            matroskaExtractor.A0S = b;
                            matroskaExtractor.A0b = true;
                        } else {
                            throw new C2101594l("Extension bit is set in signal byte");
                        }
                    }
                    byte b2 = matroskaExtractor.A0S;
                    boolean z2 = false;
                    if ((b2 & 1) == 1) {
                        z2 = true;
                    }
                    if (z2) {
                        boolean z3 = false;
                        if ((b2 & 2) == 2) {
                            z3 = true;
                        }
                        matroskaExtractor.A01 |= C25913Bc3.MAX_SIGNED_POWER_OF_TWO;
                        if (!matroskaExtractor.A0Z) {
                            d9m.readFully(matroskaExtractor.A0g.A02, 0, 8);
                            matroskaExtractor.A0T += 8;
                            matroskaExtractor.A0Z = true;
                            D9O d9o = matroskaExtractor.A0l;
                            byte[] bArr2 = d9o.A02;
                            if (!z3) {
                                i4 = 0;
                            }
                            bArr2[0] = (byte) (i4 | 8);
                            d9o.A0C(0);
                            d4y.BeK(matroskaExtractor.A0l, 1);
                            matroskaExtractor.A07++;
                            matroskaExtractor.A0g.A0C(0);
                            d4y.BeK(matroskaExtractor.A0g, 8);
                            matroskaExtractor.A07 += 8;
                        }
                        if (z3) {
                            if (!matroskaExtractor.A0a) {
                                d9m.readFully(matroskaExtractor.A0l.A02, 0, 1);
                                matroskaExtractor.A0T++;
                                matroskaExtractor.A0l.A0C(0);
                                matroskaExtractor.A0V = matroskaExtractor.A0l.A01();
                                matroskaExtractor.A0a = true;
                            }
                            int i5 = matroskaExtractor.A0V << 2;
                            D9O d9o2 = matroskaExtractor.A0l;
                            d9o2.A0A(i5);
                            d9m.readFully(d9o2.A02, 0, i5);
                            matroskaExtractor.A0T += i5;
                            short s = (short) ((matroskaExtractor.A0V / 2) + 1);
                            int i6 = (s * 6) + 2;
                            ByteBuffer byteBuffer = matroskaExtractor.A0W;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                matroskaExtractor.A0W = ByteBuffer.allocate(i6);
                            }
                            matroskaExtractor.A0W.position(0);
                            matroskaExtractor.A0W.putShort(s);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i3 = matroskaExtractor.A0V;
                                if (i7 >= i3) {
                                    break;
                                }
                                int A022 = matroskaExtractor.A0l.A02();
                                if (i7 % 2 == 0) {
                                    matroskaExtractor.A0W.putShort((short) (A022 - i8));
                                } else {
                                    matroskaExtractor.A0W.putInt(A022 - i8);
                                }
                                i7++;
                                i8 = A022;
                            }
                            int i9 = (i - matroskaExtractor.A0T) - i8;
                            if (i3 % 2 == 1) {
                                matroskaExtractor.A0W.putInt(i9);
                            } else {
                                matroskaExtractor.A0W.putShort((short) i9);
                                matroskaExtractor.A0W.putInt(0);
                            }
                            matroskaExtractor.A0h.A0E(matroskaExtractor.A0W.array(), i6);
                            d4y.BeK(matroskaExtractor.A0h, i6);
                            matroskaExtractor.A07 += i6;
                        }
                    }
                } else {
                    byte[] bArr3 = d9u.A0m;
                    if (bArr3 != null) {
                        matroskaExtractor.A0k.A0E(bArr3, bArr3.length);
                    }
                }
                if (d9u.A0N > 0) {
                    matroskaExtractor.A01 |= 268435456;
                    D9O d9o3 = matroskaExtractor.A0f;
                    d9o3.A01 = 0;
                    d9o3.A00 = 0;
                    D9O d9o4 = matroskaExtractor.A0l;
                    d9o4.A0A(4);
                    byte[] bArr4 = d9o4.A02;
                    bArr4[0] = (byte) ((i >> 24) & 255);
                    bArr4[1] = (byte) ((i >> 16) & 255);
                    bArr4[2] = (byte) ((i >> 8) & 255);
                    bArr4[3] = (byte) (i & 255);
                    d4y.BeK(d9o4, 4);
                    matroskaExtractor.A07 += 4;
                }
                matroskaExtractor.A0Y = true;
            }
            int i10 = matroskaExtractor.A0k.A00;
            int i11 = i + i10;
            String str2 = d9u.A0d;
            if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
                D9j d9j = d9u.A0c;
                if (d9j != null) {
                    if (i10 != 0) {
                        z = false;
                    }
                    D6U.A03(z);
                    if (!d9j.A05) {
                        d9m.BX0(d9j.A06, 0, 10);
                        d9m.Bdd();
                        byte[] bArr5 = d9j.A06;
                        boolean z4 = false;
                        if (bArr5[4] == -8 && bArr5[5] == 114 && bArr5[6] == 111) {
                            byte b3 = bArr5[7];
                            if ((b3 & 254) == 186) {
                                if ((b3 & 255) == 187) {
                                    z4 = true;
                                }
                                char c = 8;
                                if (z4) {
                                    c = 9;
                                }
                                i2 = 40 << ((bArr5[c] >> 4) & 7);
                                if (i2 != 0) {
                                    d9j.A05 = true;
                                }
                            }
                        }
                        i2 = 0;
                        if (i2 != 0) {
                        }
                    }
                }
                while (true) {
                    int i12 = matroskaExtractor.A0T;
                    if (i12 >= i11) {
                        break;
                    }
                    int i13 = i11 - i12;
                    D9O d9o5 = matroskaExtractor.A0k;
                    int i14 = d9o5.A00 - d9o5.A01;
                    if (i14 > 0) {
                        BeJ2 = Math.min(i13, i14);
                        d4y.BeK(d9o5, BeJ2);
                    } else {
                        BeJ2 = d4y.BeJ(d9m, i13, false);
                    }
                    matroskaExtractor.A0T += BeJ2;
                    matroskaExtractor.A07 += BeJ2;
                }
            } else {
                byte[] bArr6 = matroskaExtractor.A0i.A02;
                bArr6[0] = 0;
                bArr6[1] = 0;
                bArr6[2] = 0;
                int i15 = d9u.A0Q;
                int i16 = 4 - i15;
                while (matroskaExtractor.A0T < i11) {
                    int i17 = matroskaExtractor.A0U;
                    if (i17 == 0) {
                        D9O d9o6 = matroskaExtractor.A0k;
                        int min = Math.min(i15, d9o6.A00 - d9o6.A01);
                        d9m.readFully(bArr6, i16 + min, i15 - min);
                        if (min > 0) {
                            matroskaExtractor.A0k.A0F(bArr6, i16, min);
                        }
                        matroskaExtractor.A0T += i15;
                        matroskaExtractor.A0i.A0C(0);
                        matroskaExtractor.A0U = matroskaExtractor.A0i.A02();
                        matroskaExtractor.A0j.A0C(0);
                        d4y.BeK(matroskaExtractor.A0j, 4);
                        matroskaExtractor.A07 += 4;
                    } else {
                        D9O d9o7 = matroskaExtractor.A0k;
                        int i18 = d9o7.A00 - d9o7.A01;
                        if (i18 > 0) {
                            BeJ = Math.min(i17, i18);
                            d4y.BeK(d9o7, BeJ);
                        } else {
                            BeJ = d4y.BeJ(d9m, i17, false);
                        }
                        matroskaExtractor.A0T += BeJ;
                        matroskaExtractor.A07 += BeJ;
                        matroskaExtractor.A0U -= BeJ;
                    }
                }
            }
            if ("A_VORBIS".equals(d9u.A0d)) {
                matroskaExtractor.A0o.A0C(0);
                d4y.BeK(matroskaExtractor.A0o, 4);
                matroskaExtractor.A07 += 4;
            }
            int i19 = matroskaExtractor.A07;
            matroskaExtractor.A02();
            return i19;
        }
        matroskaExtractor.A03(d9m, bArr, i);
        int i192 = matroskaExtractor.A07;
        matroskaExtractor.A02();
        return i192;
    }

    public static long A01(MatroskaExtractor matroskaExtractor, long j) {
        long j2 = matroskaExtractor.A0I;
        if (j2 != -9223372036854775807L) {
            return C25948Bd0.A04(j, j2, 1000);
        }
        throw new C2101594l("Can't scale timecode prior to timecodeScale being set.");
    }

    public static void A04(MatroskaExtractor matroskaExtractor, C29778D9m d9m, int i) {
        D9O d9o = matroskaExtractor.A0l;
        if (d9o.A00 < i) {
            byte[] bArr = d9o.A02;
            int length = bArr.length;
            if (length < i) {
                d9o.A0E(Arrays.copyOf(bArr, Math.max(length << 1, i)), matroskaExtractor.A0l.A00);
            }
            D9O d9o2 = matroskaExtractor.A0l;
            byte[] bArr2 = d9o2.A02;
            int i2 = d9o2.A00;
            d9m.readFully(bArr2, i2, i - i2);
            matroskaExtractor.A0l.A0B(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a3, code lost:
        if (r12.equals("S_TEXT/UTF8") == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00da, code lost:
        if (r12.equals("S_TEXT/ASS") == false) goto L_0x00a5;
     */
    public static void A05(MatroskaExtractor matroskaExtractor, D9U d9u, long j, int i, int i2, int i3) {
        char c;
        byte[] A062;
        int i4;
        String str;
        int i5 = i;
        int i6 = i2;
        D9U d9u2 = d9u;
        D9j d9j = d9u2.A0c;
        MatroskaExtractor matroskaExtractor2 = matroskaExtractor;
        long j2 = j;
        int i7 = i3;
        if (d9j == null) {
            String str2 = d9u2.A0d;
            if ("S_TEXT/UTF8".equals(str2) || "S_TEXT/ASS".equals(str2)) {
                if (matroskaExtractor2.A02 > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j3 = matroskaExtractor2.A0D;
                    if (j3 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        byte[] bArr = matroskaExtractor2.A0n.A02;
                        int hashCode = str2.hashCode();
                        if (hashCode == 738597099) {
                            c = 1;
                        } else if (hashCode == 1422270023) {
                            c = 0;
                        }
                        c = 65535;
                        if (c == 0) {
                            A062 = A06(j3, "%02d:%02d:%02d,%03d", 1000);
                            i4 = 19;
                        } else if (c == 1) {
                            A062 = A06(j3, "%01d:%02d:%02d:%02d", 10000);
                            i4 = 21;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        System.arraycopy(A062, 0, bArr, i4, A062.length);
                        C29687D4y d4y = d9u2.A0b;
                        D9O d9o = matroskaExtractor2.A0n;
                        d4y.BeK(d9o, d9o.A00);
                        i6 = i2 + matroskaExtractor2.A0n.A00;
                    }
                }
                Log.w("MatroskaExtractor", str);
            }
            if ((268435456 & i) != 0) {
                if (matroskaExtractor2.A02 > 1) {
                    i5 = i & -268435457;
                } else {
                    D9O d9o2 = matroskaExtractor2.A0f;
                    int i8 = d9o2.A00;
                    d9u2.A0b.BeK(d9o2, i8);
                    i6 += i8;
                }
            }
            d9u2.A0b.BeM(j2, i5, i6, i7, d9u2.A0a);
        } else if (d9j.A05) {
            int i9 = d9j.A02;
            int i10 = i9 + 1;
            d9j.A02 = i10;
            if (i9 == 0) {
                d9j.A04 = j2;
                d9j.A00 = i5;
                d9j.A03 = 0;
            }
            d9j.A03 += i2;
            d9j.A01 = i7;
            if (i10 < 16) {
                d9j.A00(d9u2);
            }
        }
        matroskaExtractor2.A0X = true;
    }

    public final boolean Bp2(C29778D9m d9m) {
        C29781D9p d9p = new C29781D9p();
        C29778D9m d9m2 = d9m;
        long length = d9m2.getLength();
        long j = OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        if (length != -1 && length <= OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
            j = length;
        }
        int i = (int) j;
        d9m2.BX0(d9p.A01.A02, 0, 4);
        d9p.A00 = 4;
        for (long A052 = d9p.A01.A05(); A052 != 440786851; A052 = ((A052 << 8) & -256) | ((long) (d9p.A01.A02[0] & 255))) {
            int i2 = d9p.A00 + 1;
            d9p.A00 = i2;
            if (i2 == i) {
                return false;
            }
            d9m2.BX0(d9p.A01.A02, 0, 1);
        }
        long A002 = C29781D9p.A00(d9p, d9m2);
        long j2 = (long) d9p.A00;
        if (A002 == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j2 + A002 >= length) {
            return false;
        }
        while (true) {
            long j3 = (long) d9p.A00;
            long j4 = j2 + A002;
            if (j3 < j4) {
                if (C29781D9p.A00(d9p, d9m2) == Long.MIN_VALUE) {
                    return false;
                }
                long A003 = C29781D9p.A00(d9p, d9m2);
                if (A003 < 0 || A003 > 2147483647L) {
                    return false;
                }
                if (A003 != 0) {
                    int i3 = (int) A003;
                    d9m2.A4z(i3);
                    d9p.A00 += i3;
                }
            } else if (j3 == j4) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void AdH(C29790D9z d9z) {
        this.A0J = d9z;
    }

    public final void Ber(long j, long j2) {
        this.A0A = -9223372036854775807L;
        this.A04 = 0;
        this.A0d.reset();
        C29777D9l d9l = this.A0e;
        d9l.A01 = 0;
        d9l.A00 = 0;
        A02();
        for (int i = 0; i < this.A0c.size(); i++) {
            D9j d9j = ((D9U) this.A0c.valueAt(i)).A0c;
            if (d9j != null) {
                d9j.A05 = false;
                d9j.A02 = 0;
            }
        }
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i) {
        D9Y d9y = new D9Y();
        this.A0G = -1;
        this.A0I = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0D = -9223372036854775807L;
        this.A0B = -1;
        this.A0F = -1;
        this.A0A = -9223372036854775807L;
        this.A0d = d9y;
        d9y.AdI(new D9S(this));
        this.A0p = (i & 1) != 0 ? false : true;
        this.A0e = new C29777D9l();
        this.A0c = new SparseArray();
        this.A0l = new D9O(4);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(-1);
        this.A0o = new D9O(allocate.array());
        this.A0m = new D9O(4);
        this.A0j = new D9O(C29787D9w.A02);
        this.A0i = new D9O(4);
        this.A0k = new D9O();
        this.A0n = new D9O();
        this.A0g = new D9O(8);
        this.A0h = new D9O();
        this.A0f = new D9O();
    }
}
