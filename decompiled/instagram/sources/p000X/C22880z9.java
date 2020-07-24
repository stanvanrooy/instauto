package p000X;

import com.facebook.common.dextricks.DexStore;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.0z9  reason: invalid class name and case insensitive filesystem */
public final class C22880z9 extends C13440iX {
    public static final byte[] A07 = C13180i1.A01();
    public static final byte[] A08 = {102, 97, 108, 115, 101};
    public static final byte[] A09 = {110, 117, 108, 108};
    public static final byte[] A0A = {116, 114, 117, 101};
    public int A00 = 0;
    public byte[] A01;
    public char[] A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final OutputStream A06;

    private final void A06(byte[] bArr) {
        int length = bArr.length;
        if (this.A00 + length > this.A04) {
            A0p();
            if (length > 512) {
                this.A06.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.A01, this.A00, length);
        this.A00 += length;
    }

    private final void A08(char[] cArr, int i, int i2) {
        int i3;
        int i4 = i2 + i;
        int i5 = this.A00;
        byte[] bArr = this.A01;
        int[] iArr = this.A02;
        while (r12 < i4) {
            char c = cArr[r12];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            bArr[i5] = (byte) c;
            i = r12 + 1;
            i5++;
        }
        this.A00 = i5;
        if (r12 < i4) {
            if (this.A00 == 0) {
                if (i5 + ((i4 - r12) * 6) > this.A04) {
                    A0p();
                }
                i3 = this.A00;
                byte[] bArr2 = this.A01;
                int[] iArr2 = this.A02;
                while (r12 < i4) {
                    int i6 = r12 + 1;
                    char c2 = cArr[r12];
                    if (c2 <= 127) {
                        int i7 = iArr2[c2];
                        if (i7 == 0) {
                            bArr2[i3] = (byte) c2;
                            r12 = i6;
                            i3++;
                        } else if (i7 > 0) {
                            int i8 = i3 + 1;
                            bArr2[i3] = 92;
                            i3 = i8 + 1;
                            bArr2[i8] = (byte) i7;
                        } else {
                            i3 = A01(c2, i3);
                        }
                    } else if (c2 <= 2047) {
                        int i9 = i3 + 1;
                        bArr2[i3] = (byte) ((c2 >> 6) | 192);
                        i3 = i9 + 1;
                        bArr2[i9] = (byte) ((c2 & '?') | 128);
                    } else {
                        i3 = A00(c2, i3);
                    }
                    r12 = i6;
                }
            } else {
                if (i5 + ((i4 - r12) * 6) > this.A04) {
                    A0p();
                }
                int i10 = this.A00;
                byte[] bArr3 = this.A01;
                int[] iArr3 = this.A02;
                int i11 = this.A00;
                while (r12 < i4) {
                    int i12 = r12 + 1;
                    char c3 = cArr[r12];
                    if (c3 <= 127) {
                        int i13 = iArr3[c3];
                        if (i13 == 0) {
                            bArr3[i3] = (byte) c3;
                            r12 = i12;
                            i10 = i3 + 1;
                        } else {
                            if (i13 > 0) {
                                int i14 = i3 + 1;
                                bArr3[i3] = 92;
                                i10 = i14 + 1;
                                bArr3[i14] = (byte) i13;
                            }
                            i10 = A01(c3, i3);
                        }
                    } else {
                        if (c3 <= i11) {
                            if (c3 <= 2047) {
                                int i15 = i3 + 1;
                                bArr3[i3] = (byte) ((c3 >> 6) | 192);
                                i10 = i15 + 1;
                                bArr3[i15] = (byte) ((c3 & '?') | 128);
                            } else {
                                i10 = A00(c3, i3);
                            }
                        }
                        i10 = A01(c3, i3);
                    }
                    r12 = i12;
                }
            }
            this.A00 = i3;
        }
    }

    private int A00(int i, int i2) {
        byte[] bArr = this.A01;
        if (i < 55296 || i > 57343) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | 224);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i5;
        }
        int i6 = i2 + 1;
        bArr[i2] = 92;
        int i7 = i6 + 1;
        bArr[i6] = 117;
        int i8 = i7 + 1;
        byte[] bArr2 = A07;
        bArr[i7] = bArr2[(i >> 12) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i >> 8) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[(i >> 4) & 15];
        int i11 = i10 + 1;
        bArr[i10] = bArr2[i & 15];
        return i11;
    }

    private int A01(int i, int i2) {
        int i3;
        byte[] bArr = this.A01;
        int i4 = i2 + 1;
        bArr[i2] = 92;
        int i5 = i4 + 1;
        bArr[i4] = 117;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = A07;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= 255;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = 48;
            i3 = i8 + 1;
            bArr[i8] = 48;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = A07;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    private void A02() {
        if (this.A00 + 4 >= this.A04) {
            A0p();
        }
        System.arraycopy(A09, 0, this.A01, this.A00, 4);
        this.A00 += 4;
    }

    private void A04(Object obj) {
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        bArr[i] = 34;
        A0f(obj.toString());
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr2 = this.A01;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        bArr2[i2] = 34;
    }

    private final void A09(char[] cArr, int i, int i2) {
        do {
            int min = Math.min(this.A05, i2);
            if (this.A00 + min > this.A04) {
                A0p();
            }
            A08(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public final void A0P() {
        C13470ia r2 = this.A00;
        boolean z = true;
        if (r2.A01 != 1) {
            z = false;
        }
        if (!z) {
            C13450iY.A07(AnonymousClass000.A0E("Current context not an ARRAY but ", r2.A00()));
        }
        C12950he r1 = this.A00;
        if (r1 != null) {
            r1.BuU(this, this.A00.A00 + 1);
        } else {
            if (this.A00 >= this.A04) {
                A0p();
            }
            byte[] bArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            bArr[i] = 93;
        }
        this.A00 = this.A00.A02;
    }

    public final void A0Q() {
        C13470ia r2 = this.A00;
        if (!r2.A01()) {
            C13450iY.A07(AnonymousClass000.A0E("Current context not an object but ", r2.A00()));
        }
        C12950he r1 = this.A00;
        if (r1 != null) {
            r1.BuV(this, this.A00.A00 + 1);
        } else {
            if (this.A00 >= this.A04) {
                A0p();
            }
            byte[] bArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            bArr[i] = 125;
        }
        this.A00 = this.A00.A02;
    }

    public final void A0U(char c) {
        if (this.A00 + 3 >= this.A04) {
            A0p();
        }
        byte[] bArr = this.A01;
        if (c <= 127) {
            int i = this.A00;
            this.A00 = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            int i2 = this.A00;
            int i3 = i2 + 1;
            this.A00 = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.A00 = i3 + 1;
            bArr[i3] = (byte) ((c & '?') | 128);
        } else {
            A03(c, (char[]) null, 0, 0);
        }
    }

    public final void A0V(double d) {
        if (this.A03 || ((Double.isNaN(d) || Double.isInfinite(d)) && A0o(C12930hc.QUOTE_NON_NUMERIC_NUMBERS))) {
            A0g(String.valueOf(d));
            return;
        }
        A0n("write number");
        A0f(String.valueOf(d));
    }

    public final void A0W(float f) {
        if (this.A03 || ((Float.isNaN(f) || Float.isInfinite(f)) && A0o(C12930hc.QUOTE_NON_NUMERIC_NUMBERS))) {
            A0g(String.valueOf(f));
            return;
        }
        A0n("write number");
        A0f(String.valueOf(f));
    }

    public final void A0b(C12970hg r6) {
        byte b;
        int A032 = this.A00.A03(r6.getValue());
        if (A032 == 4) {
            C13450iY.A07("Can not write a field name, expecting a value");
        }
        C12950he r1 = this.A00;
        boolean z = true;
        if (r1 != null) {
            if (A032 != 1) {
                z = false;
            }
            if (z) {
                r1.BuX(this);
            } else {
                r1.A6I(this);
            }
            boolean A0o = A0o(C12930hc.QUOTE_FIELD_NAMES);
            b = 34;
            if (A0o) {
                if (this.A00 >= this.A04) {
                    A0p();
                }
                byte[] bArr = this.A01;
                int i = this.A00;
                this.A00 = i + 1;
                bArr[i] = 34;
            }
            A06(r6.A5x());
            if (!A0o) {
                return;
            }
        } else {
            if (A032 == 1) {
                if (this.A00 >= this.A04) {
                    A0p();
                }
                byte[] bArr2 = this.A01;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                bArr2[i2] = 44;
            }
            if (!A0o(C12930hc.QUOTE_FIELD_NAMES)) {
                int A5S = r6.A5S(this.A01, this.A00);
                if (A5S < 0) {
                    A06(r6.A5x());
                    return;
                } else {
                    this.A00 += A5S;
                    return;
                }
            } else {
                if (this.A00 >= this.A04) {
                    A0p();
                }
                byte[] bArr3 = this.A01;
                int i3 = this.A00;
                int i4 = i3 + 1;
                this.A00 = i4;
                b = 34;
                bArr3[i3] = 34;
                int A5S2 = r6.A5S(bArr3, i4);
                if (A5S2 < 0) {
                    A06(r6.A5x());
                } else {
                    this.A00 += A5S2;
                }
            }
        }
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr4 = this.A01;
        int i5 = this.A00;
        this.A00 = i5 + 1;
        bArr4[i5] = b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (A0o(p000X.C12930hc.QUOTE_FIELD_NAMES) != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        if (A0o(p000X.C12930hc.QUOTE_FIELD_NAMES) == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        A05(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        return;
     */
    public final void A0d(String str) {
        int A032 = this.A00.A03(str);
        if (A032 == 4) {
            C13450iY.A07("Can not write a field name, expecting a value");
        }
        C12950he r1 = this.A00;
        boolean z = true;
        if (r1 != null) {
            if (A032 != 1) {
                z = false;
            }
            if (z) {
                r1.BuX(this);
            } else {
                r1.A6I(this);
            }
        } else if (A032 == 1) {
            if (this.A00 >= this.A04) {
                A0p();
            }
            byte[] bArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            bArr[i] = 44;
        }
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr2 = this.A01;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        bArr2[i2] = 34;
        int length = str.length();
        if (length <= this.A03) {
            str.getChars(0, length, this.A02, 0);
            if (length <= this.A05) {
                if (this.A00 + length > this.A04) {
                    A0p();
                }
                A08(this.A02, 0, length);
            } else {
                A09(this.A02, 0, length);
            }
        } else {
            A05(str);
        }
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr3 = this.A01;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        bArr3[i3] = 34;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r6 = r11 + 1;
        r8 = r10[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r8 >= 2048) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5 = r9.A00;
        r1 = r5 + 1;
        r9.A00 = r1;
        r2[r5] = (byte) ((r8 >> 6) | 192);
        r9.A00 = r1 + 1;
        r2[r1] = (byte) ((r8 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r11 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        A03(r8, r10, r6, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r4 >= 2048) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        r3 = r9.A01;
        r2 = r9.A00;
        r1 = r2 + 1;
        r9.A00 = r1;
        r3[r2] = (byte) ((r4 >> 6) | 192);
        r9.A00 = r1 + 1;
        r3[r1] = (byte) ((r4 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        A03(r4, r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r9.A00 + 3) < r9.A04) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        A0p();
     */
    public final void A0l(char[] cArr, int i, int i2) {
        int i3 = i2 + i2 + i2;
        int i4 = this.A00 + i3;
        int i5 = this.A04;
        if (i4 > i5) {
            if (i5 < i3) {
                byte[] bArr = this.A01;
                while (i < i2) {
                    while (true) {
                        char c = cArr[i];
                        if (c >= 128) {
                            break;
                        }
                        if (this.A00 >= i5) {
                            A0p();
                        }
                        int i6 = this.A00;
                        this.A00 = i6 + 1;
                        bArr[i6] = (byte) c;
                        i++;
                        if (i >= i2) {
                            return;
                        }
                    }
                }
                return;
            }
            A0p();
        }
        int i7 = i2 + i;
        while (i < i7) {
            while (true) {
                char c2 = cArr[i];
                if (c2 > 127) {
                    break;
                }
                byte[] bArr2 = this.A01;
                int i8 = this.A00;
                this.A00 = i8 + 1;
                bArr2[i8] = (byte) c2;
                i++;
                if (i >= i7) {
                    return;
                }
            }
        }
    }

    public final void A0n(String str) {
        byte b;
        C12970hg r0;
        int A022 = this.A00.A02();
        if (A022 == 5) {
            C13450iY.A07(AnonymousClass000.A0J("Can not ", str, ", expecting field name"));
        }
        C12950he r3 = this.A00;
        if (r3 == null) {
            if (A022 == 1) {
                b = 44;
            } else if (A022 == 2) {
                b = 58;
            } else if (A022 == 3 && (r0 = this.A01) != null) {
                byte[] A5z = r0.A5z();
                if (A5z.length > 0) {
                    A06(A5z);
                    return;
                }
                return;
            } else {
                return;
            }
            if (this.A00 >= this.A04) {
                A0p();
            }
            byte[] bArr = this.A01;
            int i = this.A00;
            bArr[i] = b;
            this.A00 = i + 1;
        } else if (A022 == 0) {
            C13470ia r2 = this.A00;
            boolean z = true;
            if (r2.A01 != 1) {
                z = false;
            }
            if (z) {
                r3.A6H(this);
            } else if (r2.A01()) {
                r3.A6I(this);
            }
        } else if (A022 == 1) {
            r3.BuR(this);
        } else if (A022 == 2) {
            r3.BuY(this);
        } else if (A022 != 3) {
            AnonymousClass2As.A03();
        } else {
            r3.Bua(this);
        }
    }

    public final void A0p() {
        int i = this.A00;
        if (i > 0) {
            this.A00 = 0;
            this.A06.write(this.A01, 0, i);
        }
    }

    public C22880z9(C13030hm r4, int i, C3U c3u, OutputStream outputStream) {
        super(r4, i, c3u);
        this.A06 = outputStream;
        C13030hm.A00(r4.A01);
        C13040hn r2 = r4.A05;
        Integer num = Constants.ONE;
        byte[] A002 = r2.A00(num);
        r4.A01 = A002;
        this.A01 = A002;
        int length = A002.length;
        this.A04 = length;
        this.A05 = length >> 3;
        C13030hm.A00(r4.A02);
        char[] A012 = r2.A01(num, 0);
        r4.A02 = A012;
        this.A02 = A012;
        this.A03 = A012.length;
        if (A0o(C12930hc.ESCAPE_NON_ASCII)) {
            A0A(127);
        }
    }

    private void A03(int i, char[] cArr, int i2, int i3) {
        byte[] bArr;
        int i4;
        int i5;
        if (i < 55296 || i > 57343) {
            bArr = this.A01;
            int i6 = this.A00;
            int i7 = i6 + 1;
            this.A00 = i7;
            bArr[i6] = (byte) ((i >> 12) | 224);
            i4 = i7 + 1;
            this.A00 = i4;
            bArr[i7] = (byte) (((i >> 6) & 63) | 128);
            this.A00 = i4 + 1;
            i5 = i & 63;
        } else {
            if (i2 >= i3) {
                C13450iY.A07("Split surrogate on writeRaw() input (last character)");
            }
            char c = cArr[i2];
            if (c < 56320 || c > 57343) {
                C13450iY.A07(AnonymousClass000.A0N("Incomplete surrogate pair: first char 0x", Integer.toHexString(i), ", second 0x", Integer.toHexString(c)));
            }
            int i8 = ((i - 55296) << 10) + DexStore.LOAD_RESULT_PGO_ATTEMPTED + (c - 56320);
            if (this.A00 + 4 > this.A04) {
                A0p();
            }
            bArr = this.A01;
            int i9 = this.A00;
            int i10 = i9 + 1;
            this.A00 = i10;
            bArr[i9] = (byte) ((i8 >> 18) | 240);
            int i11 = i10 + 1;
            this.A00 = i11;
            bArr[i10] = (byte) (((i8 >> 12) & 63) | 128);
            i4 = i11 + 1;
            this.A00 = i4;
            bArr[i11] = (byte) (((i8 >> 6) & 63) | 128);
            this.A00 = i4 + 1;
            i5 = i8 & 63;
        }
        bArr[i4] = (byte) (i5 | 128);
    }

    private final void A05(String str) {
        int length = str.length();
        char[] cArr = this.A02;
        int i = 0;
        while (length > 0) {
            int min = Math.min(this.A05, length);
            int i2 = i + min;
            str.getChars(i, i2, cArr, 0);
            if (this.A00 + min > this.A04) {
                A0p();
            }
            A08(cArr, 0, min);
            length -= min;
            i = i2;
        }
    }

    public final void A0R() {
        A0n("write null value");
        A02();
    }

    public final void A0S() {
        A0n("start an array");
        this.A00 = this.A00.A04();
        C12950he r0 = this.A00;
        if (r0 != null) {
            r0.Buc(this);
            return;
        }
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        bArr[i] = 91;
    }

    public final void A0T() {
        A0n("start an object");
        this.A00 = this.A00.A05();
        C12950he r0 = this.A00;
        if (r0 != null) {
            r0.Bud(this);
            return;
        }
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        bArr[i] = 123;
    }

    public final void A0X(int i) {
        A0n("write number");
        if (this.A00 + 11 >= this.A04) {
            A0p();
        }
        if (this.A03) {
            if (this.A00 + 13 >= this.A04) {
                A0p();
            }
            byte[] bArr = this.A01;
            int i2 = this.A00;
            int i3 = i2 + 1;
            this.A00 = i3;
            bArr[i2] = 34;
            int A002 = C13500id.A00(i, bArr, i3);
            this.A00 = A002;
            byte[] bArr2 = this.A01;
            this.A00 = A002 + 1;
            bArr2[A002] = 34;
            return;
        }
        this.A00 = C13500id.A00(i, this.A01, this.A00);
    }

    public final void A0Y(long j) {
        A0n("write number");
        if (this.A03) {
            if (this.A00 + 23 >= this.A04) {
                A0p();
            }
            byte[] bArr = this.A01;
            int i = this.A00;
            int i2 = i + 1;
            this.A00 = i2;
            bArr[i] = 34;
            int A062 = C13500id.A06(j, bArr, i2);
            this.A00 = A062;
            byte[] bArr2 = this.A01;
            this.A00 = A062 + 1;
            bArr2[A062] = 34;
            return;
        }
        if (this.A00 + 21 >= this.A04) {
            A0p();
        }
        this.A00 = C13500id.A06(j, this.A01, this.A00);
    }

    public final void A0Z(C25929Bcg bcg, byte[] bArr, int i, int i2) {
        A0n("write binary value");
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr2 = this.A01;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        bArr2[i3] = 34;
        int i4 = i2 + i;
        int i5 = i4 - 3;
        int i6 = this.A04 - 6;
        int i7 = bcg.A02 >> 2;
        while (i <= i5) {
            if (this.A00 > i6) {
                A0p();
            }
            int i8 = i + 1;
            int i9 = i8 + 1;
            i = i9 + 1;
            byte b = (((bArr[i] << 8) | (bArr[i8] & 255)) << 8) | (bArr[i9] & 255);
            byte[] bArr3 = this.A01;
            int i10 = this.A00;
            int i11 = i10 + 1;
            byte[] bArr4 = bcg.A04;
            bArr3[i10] = bArr4[(b >> 18) & 63];
            int i12 = i11 + 1;
            bArr3[i11] = bArr4[(b >> 12) & 63];
            int i13 = i12 + 1;
            bArr3[i12] = bArr4[(b >> 6) & 63];
            int i14 = i13 + 1;
            bArr3[i13] = bArr4[b & 63];
            this.A00 = i14;
            i7--;
            if (i7 <= 0) {
                int i15 = i14 + 1;
                this.A00 = i15;
                bArr3[i14] = 92;
                this.A00 = i15 + 1;
                bArr3[i15] = 110;
                i7 = bcg.A02 >> 2;
            }
        }
        int i16 = i4 - i;
        if (i16 > 0) {
            if (this.A00 > i6) {
                A0p();
            }
            int i17 = i + 1;
            int i18 = bArr[i] << 16;
            if (i16 == 2) {
                i18 |= (bArr[i17] & 255) << 8;
            }
            byte[] bArr5 = this.A01;
            int i19 = this.A00;
            int i20 = i19 + 1;
            byte[] bArr6 = bcg.A04;
            bArr5[i19] = bArr6[(i18 >> 18) & 63];
            int i21 = i20 + 1;
            bArr5[i20] = bArr6[(i18 >> 12) & 63];
            if (bcg.A03) {
                byte b2 = (byte) bcg.A01;
                int i22 = i21 + 1;
                byte b3 = b2;
                if (i16 == 2) {
                    b3 = bArr6[(i18 >> 6) & 63];
                }
                bArr5[i21] = b3;
                i21 = i22 + 1;
                bArr5[i22] = b2;
            } else if (i16 == 2) {
                bArr5[i21] = bArr6[(i18 >> 6) & 63];
                i21++;
            }
            this.A00 = i21;
        }
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr7 = this.A01;
        int i23 = this.A00;
        this.A00 = i23 + 1;
        bArr7[i23] = 34;
    }

    public final void A0a(C12970hg r3) {
        byte[] A5z = r3.A5z();
        if (A5z.length > 0) {
            A06(A5z);
        }
    }

    public final void A0c(C12970hg r5) {
        A0n("write text value");
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr = this.A01;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        bArr[i] = 34;
        int A5S = r5.A5S(bArr, i2);
        if (A5S < 0) {
            A06(r5.A5x());
        } else {
            this.A00 += A5S;
        }
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr2 = this.A01;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        bArr2[i3] = 34;
    }

    public final void A0e(String str) {
        A0n("write number");
        if (this.A03) {
            A04(str);
        } else {
            A0f(str);
        }
    }

    public final void A0f(String str) {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            char[] cArr = this.A02;
            int length2 = cArr.length;
            if (length < length2) {
                length2 = length;
            }
            int i2 = i + length2;
            str.getChars(i, i2, cArr, 0);
            A0l(cArr, 0, length2);
            length -= length2;
            i = i2;
        }
    }

    public final void A0g(String str) {
        byte b;
        A0n("write text value");
        if (str == null) {
            A02();
            return;
        }
        int length = str.length();
        if (length > this.A03) {
            if (this.A00 >= this.A04) {
                A0p();
            }
            byte[] bArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            b = 34;
            bArr[i] = 34;
            A05(str);
        } else {
            str.getChars(0, length, this.A02, 0);
            if (length > this.A05) {
                if (this.A00 >= this.A04) {
                    A0p();
                }
                byte[] bArr2 = this.A01;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                b = 34;
                bArr2[i2] = 34;
                A09(this.A02, 0, length);
            } else {
                if (this.A00 + length >= this.A04) {
                    A0p();
                }
                byte[] bArr3 = this.A01;
                int i3 = this.A00;
                this.A00 = i3 + 1;
                b = 34;
                bArr3[i3] = 34;
                A08(this.A02, 0, length);
            }
        }
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr4 = this.A01;
        int i4 = this.A00;
        this.A00 = i4 + 1;
        bArr4[i4] = b;
    }

    public final void A0h(BigDecimal bigDecimal) {
        A0n("write number");
        if (bigDecimal == null) {
            A02();
        } else if (this.A03) {
            A04(bigDecimal);
        } else {
            A0f(bigDecimal.toString());
        }
    }

    public final void A0i(BigInteger bigInteger) {
        A0n("write number");
        if (bigInteger == null) {
            A02();
        } else if (this.A03) {
            A04(bigInteger);
        } else {
            A0f(bigInteger.toString());
        }
    }

    public final void A0j(short s) {
        A0n("write number");
        if (this.A00 + 6 >= this.A04) {
            A0p();
        }
        if (this.A03) {
            if (this.A00 + 8 >= this.A04) {
                A0p();
            }
            byte[] bArr = this.A01;
            int i = this.A00;
            int i2 = i + 1;
            this.A00 = i2;
            bArr[i] = 34;
            int A002 = C13500id.A00(s, bArr, i2);
            this.A00 = A002;
            byte[] bArr2 = this.A01;
            this.A00 = A002 + 1;
            bArr2[A002] = 34;
            return;
        }
        this.A00 = C13500id.A00(s, this.A01, this.A00);
    }

    public final void A0k(boolean z) {
        byte[] bArr;
        A0n("write boolean value");
        if (this.A00 + 5 >= this.A04) {
            A0p();
        }
        if (z) {
            bArr = A0A;
        } else {
            bArr = A08;
        }
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.A01, this.A00, length);
        this.A00 += length;
    }

    public final void A0m(char[] cArr, int i, int i2) {
        A0n("write text value");
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr = this.A01;
        int i3 = this.A00;
        int i4 = i3 + 1;
        this.A00 = i4;
        bArr[i3] = 34;
        if (i2 <= this.A05) {
            if (i4 + i2 > this.A04) {
                A0p();
            }
            A08(cArr, i, i2);
        } else {
            A09(cArr, i, i2);
        }
        if (this.A00 >= this.A04) {
            A0p();
        }
        byte[] bArr2 = this.A01;
        int i5 = this.A00;
        this.A00 = i5 + 1;
        bArr2[i5] = 34;
    }

    public final void close() {
        super.close();
        if (this.A01 != null && A0o(C12930hc.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C13470ia r2 = this.A00;
                boolean z = true;
                if (r2.A01 != 1) {
                    z = false;
                }
                if (!z) {
                    if (!r2.A01()) {
                        break;
                    }
                    A0Q();
                } else {
                    A0P();
                }
            }
        }
        A0p();
        OutputStream outputStream = this.A06;
        if (outputStream != null) {
            if (this.A03.A07 || A0o(C12930hc.AUTO_CLOSE_TARGET)) {
                outputStream.close();
            } else if (A0o(C12930hc.FLUSH_PASSED_TO_STREAM)) {
                outputStream.flush();
            }
        }
        byte[] bArr = this.A01;
        if (bArr != null) {
            this.A01 = null;
            this.A03.A03(bArr);
        }
        char[] cArr = this.A02;
        if (cArr != null) {
            this.A02 = null;
            C13030hm r1 = this.A03;
            if (cArr != null) {
                C13030hm.A01(cArr, r1.A02);
                r1.A02 = null;
                r1.A05.A01[Constants.ONE.intValue()] = cArr;
            }
        }
    }

    public final void flush() {
        A0p();
        OutputStream outputStream = this.A06;
        if (outputStream != null && A0o(C12930hc.FLUSH_PASSED_TO_STREAM)) {
            outputStream.flush();
        }
    }
}
