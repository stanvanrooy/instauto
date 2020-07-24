package p000X;

import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.0iW  reason: invalid class name and case insensitive filesystem */
public final class C13430iW extends C13440iX {
    public static final char[] A06 = C13180i1.A02();
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public char[] A03;
    public char[] A04;
    public final Writer A05;

    private void A03(char c, int i) {
        int i2;
        if (i >= 0) {
            int i3 = this.A02;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.A01 = i4;
                char[] cArr = this.A03;
                cArr[i4] = '\\';
                cArr[i4 + 1] = (char) i;
                return;
            }
            char[] cArr2 = this.A04;
            if (cArr2 == null) {
                cArr2 = A06();
            }
            this.A01 = i3;
            cArr2[1] = (char) i;
            this.A05.write(cArr2, 0, 2);
        } else if (i != -2) {
            int i5 = this.A02;
            if (i5 >= 6) {
                char[] cArr3 = this.A03;
                int i6 = i5 - 6;
                this.A01 = i6;
                cArr3[i6] = '\\';
                int i7 = i6 + 1;
                cArr3[i7] = 'u';
                if (c > 255) {
                    int i8 = (c >> 8) & 255;
                    int i9 = i7 + 1;
                    char[] cArr4 = A06;
                    cArr3[i9] = cArr4[i8 >> 4];
                    i2 = i9 + 1;
                    cArr3[i2] = cArr4[i8 & 15];
                    c = (char) (c & 255);
                } else {
                    int i10 = i7 + 1;
                    cArr3[i10] = '0';
                    i2 = i10 + 1;
                    cArr3[i2] = '0';
                }
                int i11 = i2 + 1;
                char[] cArr5 = A06;
                cArr3[i11] = cArr5[c >> 4];
                cArr3[i11 + 1] = cArr5[c & 15];
                return;
            }
            char[] cArr6 = this.A04;
            if (cArr6 == null) {
                cArr6 = A06();
            }
            this.A01 = i5;
            if (c > 255) {
                int i12 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr7 = A06;
                cArr6[10] = cArr7[i12 >> 4];
                cArr6[11] = cArr7[i12 & 15];
                cArr6[12] = cArr7[c2 >> 4];
                cArr6[13] = cArr7[c2 & 15];
                this.A05.write(cArr6, 8, 6);
                return;
            }
            char[] cArr8 = A06;
            cArr6[6] = cArr8[c >> 4];
            cArr6[7] = cArr8[c & 15];
            this.A05.write(cArr6, 2, 6);
        } else {
            throw null;
        }
    }

    private int A00(char[] cArr, int i, int i2, char c, int i3) {
        int i4;
        if (i3 >= 0) {
            if (i <= 1 || i >= i2) {
                char[] cArr2 = this.A04;
                if (cArr2 == null) {
                    cArr2 = A06();
                }
                cArr2[1] = (char) i3;
                this.A05.write(cArr2, 0, 2);
                return i;
            }
            int i5 = i - 2;
            cArr[i5] = '\\';
            cArr[i5 + 1] = (char) i3;
            return i5;
        } else if (i3 == -2) {
            throw null;
        } else if (i <= 5 || i >= i2) {
            char[] cArr3 = this.A04;
            if (cArr3 == null) {
                cArr3 = A06();
            }
            this.A01 = this.A02;
            if (c > 255) {
                int i6 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr4 = A06;
                cArr3[10] = cArr4[i6 >> 4];
                cArr3[11] = cArr4[i6 & 15];
                cArr3[12] = cArr4[c2 >> 4];
                cArr3[13] = cArr4[c2 & 15];
                this.A05.write(cArr3, 8, 6);
                return i;
            }
            char[] cArr5 = A06;
            cArr3[6] = cArr5[c >> 4];
            cArr3[7] = cArr5[c & 15];
            this.A05.write(cArr3, 2, 6);
            return i;
        } else {
            int i7 = i - 6;
            int i8 = i7 + 1;
            cArr[i7] = '\\';
            int i9 = i8 + 1;
            cArr[i8] = 'u';
            if (c > 255) {
                int i10 = (c >> 8) & 255;
                int i11 = i9 + 1;
                char[] cArr6 = A06;
                cArr[i9] = cArr6[i10 >> 4];
                i4 = i11 + 1;
                cArr[i11] = cArr6[i10 & 15];
                c = (char) (c & 255);
            } else {
                int i12 = i9 + 1;
                cArr[i9] = '0';
                i4 = i12 + 1;
                cArr[i12] = '0';
            }
            int i13 = i4 + 1;
            char[] cArr7 = A06;
            cArr[i4] = cArr7[c >> 4];
            cArr[i13] = cArr7[c & 15];
            return i13 - 5;
        }
    }

    private void A01() {
        if (this.A02 + 4 >= this.A00) {
            A0p();
        }
        int i = this.A02;
        char[] cArr = this.A03;
        cArr[i] = 'n';
        int i2 = i + 1;
        cArr[i2] = 'u';
        int i3 = i2 + 1;
        cArr[i3] = 'l';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        this.A02 = i4 + 1;
    }

    private void A02(char c, int i) {
        int i2;
        if (i >= 0) {
            if (this.A02 + 2 > this.A00) {
                A0p();
            }
            char[] cArr = this.A03;
            int i3 = this.A02;
            int i4 = i3 + 1;
            this.A02 = i4;
            cArr[i3] = '\\';
            this.A02 = i4 + 1;
            cArr[i4] = (char) i;
        } else if (i != -2) {
            if (this.A02 + 2 > this.A00) {
                A0p();
            }
            int i5 = this.A02;
            char[] cArr2 = this.A03;
            int i6 = i5 + 1;
            cArr2[i5] = '\\';
            int i7 = i6 + 1;
            cArr2[i6] = 'u';
            if (c > 255) {
                int i8 = 255 & (c >> 8);
                int i9 = i7 + 1;
                char[] cArr3 = A06;
                cArr2[i7] = cArr3[i8 >> 4];
                i2 = i9 + 1;
                cArr2[i9] = cArr3[i8 & 15];
                c = (char) (c & 255);
            } else {
                int i10 = i7 + 1;
                cArr2[i7] = '0';
                i2 = i10 + 1;
                cArr2[i10] = '0';
            }
            int i11 = i2 + 1;
            char[] cArr4 = A06;
            cArr2[i2] = cArr4[c >> 4];
            cArr2[i11] = cArr4[c & 15];
            this.A02 = i11;
        } else {
            throw null;
        }
    }

    private void A04(Object obj) {
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr = this.A03;
        int i = this.A02;
        this.A02 = i + 1;
        cArr[i] = '\"';
        A0f(obj.toString());
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr2 = this.A03;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        cArr2[i2] = '\"';
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f4, code lost:
        r1 = r3.A01;
        r2 = r2 - r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f7, code lost:
        if (r2 <= 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f9, code lost:
        r3.A05.write(r4, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fe, code lost:
        r2 = r3.A03;
        r1 = r3.A02;
        r3.A02 = r1 + 1;
        r1 = r2[r1];
        A03(r1, r6[r1]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x003e A[EDGE_INSN: B:79:0x003e->B:14:0x003e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00dd A[SYNTHETIC] */
    private void A05(String str) {
        char[] cArr;
        int i;
        char c;
        int i2;
        int i3;
        char[] cArr2;
        char c2;
        char[] cArr3;
        char c3;
        String str2 = str;
        int length = str2.length();
        int i4 = this.A00;
        if (length > i4) {
            A0p();
            int i5 = 0;
            while (true) {
                int i6 = this.A00;
                if (i5 + i6 > length) {
                    i6 = length - i5;
                }
                int i7 = i5 + i6;
                str2.getChars(i5, i7, this.A03, 0);
                int i8 = this.A00;
                if (i8 != 0) {
                    char c4 = i8;
                    int[] iArr = this.A02;
                    int min = Math.min(iArr.length, i8 + 1);
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    while (i9 < i6) {
                        while (true) {
                            cArr3 = this.A03;
                            c3 = cArr3[i9];
                            if (c3 < min) {
                                i11 = iArr[c3];
                                if (i11 != 0) {
                                    break;
                                }
                                i9++;
                                if (i9 >= i6) {
                                    break;
                                }
                            } else {
                                if (c3 > c4) {
                                    i11 = -1;
                                    break;
                                }
                                i9++;
                                if (i9 >= i6) {
                                }
                            }
                        }
                        int i12 = i9 - i10;
                        if (i12 > 0) {
                            this.A05.write(cArr3, i10, i12);
                            if (i9 >= i6) {
                                break;
                            }
                        }
                        i9++;
                        i10 = A00(this.A03, i9, i6, c3, i11);
                    }
                } else {
                    int[] iArr2 = this.A02;
                    int length2 = iArr2.length;
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < i6) {
                        do {
                            cArr2 = this.A03;
                            c2 = cArr2[i13];
                            if ((c2 < length2 && iArr2[c2] != 0) || (i13 = i13 + 1) >= i6) {
                                int i15 = i13 - i14;
                            }
                            cArr2 = this.A03;
                            c2 = cArr2[i13];
                            break;
                        } while ((i13 = i13 + 1) >= i6);
                        int i152 = i13 - i14;
                        if (i152 > 0) {
                            this.A05.write(cArr2, i14, i152);
                            if (i13 >= i6) {
                                break;
                            }
                        }
                        i13++;
                        i14 = A00(this.A03, i13, i6, c2, iArr2[c2]);
                    }
                }
                if (i7 < length) {
                    i5 = i7;
                } else {
                    return;
                }
            }
        } else {
            if (this.A02 + length > i4) {
                A0p();
            }
            str2.getChars(0, length, this.A03, this.A02);
            int i16 = this.A00;
            if (i16 != 0) {
                int i17 = this.A02 + length;
                int[] iArr3 = this.A02;
                int min2 = Math.min(iArr3.length, i16 + 1);
                while (this.A02 < i17) {
                    while (true) {
                        cArr = this.A03;
                        i = this.A02;
                        c = cArr[i];
                        if (c < min2) {
                            i3 = iArr3[c];
                            if (i3 != 0) {
                                break;
                            }
                            i2 = i + 1;
                            this.A02 = i2;
                            if (i2 >= i17) {
                                return;
                            }
                        } else {
                            if (c > i16) {
                                i3 = -1;
                                break;
                            }
                            i2 = i + 1;
                            this.A02 = i2;
                            if (i2 >= i17) {
                            }
                        }
                    }
                    int i18 = this.A01;
                    int i19 = i - i18;
                    if (i19 > 0) {
                        this.A05.write(cArr, i18, i19);
                    }
                    this.A02++;
                    A03(c, i3);
                }
                return;
            }
            int i20 = this.A02 + length;
            int[] iArr4 = this.A02;
            int length3 = iArr4.length;
            while (this.A02 < i20) {
                while (true) {
                    char[] cArr4 = this.A03;
                    int i21 = this.A02;
                    char c5 = cArr4[i21];
                    if (c5 < length3 && iArr4[c5] != 0) {
                        break;
                    }
                    int i22 = i21 + 1;
                    this.A02 = i22;
                    if (i22 >= i20) {
                        return;
                    }
                }
            }
        }
    }

    private char[] A06() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this.A04 = cArr;
        return cArr;
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
            if (this.A02 >= this.A00) {
                A0p();
            }
            char[] cArr = this.A03;
            int i = this.A02;
            this.A02 = i + 1;
            cArr[i] = ']';
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
            if (this.A02 >= this.A00) {
                A0p();
            }
            char[] cArr = this.A03;
            int i = this.A02;
            this.A02 = i + 1;
            cArr[i] = '}';
        }
        this.A00 = this.A00.A02;
    }

    public final void A0U(char c) {
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr = this.A03;
        int i = this.A02;
        this.A02 = i + 1;
        cArr[i] = c;
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

    public final void A0b(C12970hg r9) {
        int A032 = this.A00.A03(r9.getValue());
        if (A032 == 4) {
            C13450iY.A07("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (A032 != 1) {
            z = false;
        }
        C12950he r0 = this.A00;
        if (r0 != null) {
            if (z) {
                r0.BuX(this);
            } else {
                r0.A6I(this);
            }
            char[] A5w = r9.A5w();
            if (A0o(C12930hc.QUOTE_FIELD_NAMES)) {
                if (this.A02 >= this.A00) {
                    A0p();
                }
                char[] cArr = this.A03;
                int i = this.A02;
                this.A02 = i + 1;
                cArr[i] = '\"';
                A0l(A5w, 0, A5w.length);
                if (this.A02 >= this.A00) {
                    A0p();
                }
                char[] cArr2 = this.A03;
                int i2 = this.A02;
                this.A02 = i2 + 1;
                cArr2[i2] = '\"';
                return;
            }
            A0l(A5w, 0, A5w.length);
            return;
        }
        if (this.A02 + 1 >= this.A00) {
            A0p();
        }
        if (z) {
            char[] cArr3 = this.A03;
            int i3 = this.A02;
            this.A02 = i3 + 1;
            cArr3[i3] = ',';
        }
        char[] A5w2 = r9.A5w();
        if (!A0o(C12930hc.QUOTE_FIELD_NAMES)) {
            A0l(A5w2, 0, A5w2.length);
            return;
        }
        char[] cArr4 = this.A03;
        int i4 = this.A02;
        int i5 = i4 + 1;
        this.A02 = i5;
        cArr4[i4] = '\"';
        int length = A5w2.length;
        if (i5 + length + 1 >= this.A00) {
            A0l(A5w2, 0, length);
            if (this.A02 >= this.A00) {
                A0p();
            }
            char[] cArr5 = this.A03;
            int i6 = this.A02;
            this.A02 = i6 + 1;
            cArr5[i6] = '\"';
            return;
        }
        System.arraycopy(A5w2, 0, cArr4, i5, length);
        int i7 = this.A02 + length;
        this.A02 = i7;
        char[] cArr6 = this.A03;
        this.A02 = i7 + 1;
        cArr6[i7] = '\"';
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (A0o(p000X.C12930hc.QUOTE_FIELD_NAMES) == false) goto L_0x0074;
     */
    public final void A0d(String str) {
        int A032 = this.A00.A03(str);
        if (A032 == 4) {
            C13450iY.A07("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (A032 != 1) {
            z = false;
        }
        C12950he r0 = this.A00;
        if (r0 != null) {
            if (z) {
                r0.BuX(this);
            } else {
                r0.A6I(this);
            }
            if (A0o(C12930hc.QUOTE_FIELD_NAMES)) {
                if (this.A02 >= this.A00) {
                    A0p();
                }
            }
            A05(str);
            return;
        }
        if (this.A02 + 1 >= this.A00) {
            A0p();
        }
        if (z) {
            char[] cArr = this.A03;
            int i = this.A02;
            this.A02 = i + 1;
            cArr[i] = ',';
        }
        char[] cArr2 = this.A03;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        cArr2[i2] = '\"';
        A05(str);
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr3 = this.A03;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        cArr3[i3] = '\"';
    }

    public final void A0l(char[] cArr, int i, int i2) {
        if (i2 < 32) {
            if (i2 > this.A00 - this.A02) {
                A0p();
            }
            System.arraycopy(cArr, i, this.A03, this.A02, i2);
            this.A02 += i2;
            return;
        }
        A0p();
        this.A05.write(cArr, i, i2);
    }

    public final void A0n(String str) {
        char c;
        C12970hg r0;
        int A022 = this.A00.A02();
        if (A022 == 5) {
            C13450iY.A07(AnonymousClass000.A0J("Can not ", str, ", expecting field name"));
        }
        C12950he r3 = this.A00;
        if (r3 == null) {
            if (A022 == 1) {
                c = ',';
            } else if (A022 == 2) {
                c = ':';
            } else if (A022 == 3 && (r0 = this.A01) != null) {
                A0f(r0.getValue());
                return;
            } else {
                return;
            }
            if (this.A02 >= this.A00) {
                A0p();
            }
            char[] cArr = this.A03;
            int i = this.A02;
            cArr[i] = c;
            this.A02 = i + 1;
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
        int i = this.A02;
        int i2 = this.A01;
        int i3 = i - i2;
        if (i3 > 0) {
            this.A01 = 0;
            this.A02 = 0;
            this.A05.write(this.A03, i2, i3);
        }
    }

    public C13430iW(C13030hm r4, int i, C3U c3u, Writer writer) {
        super(r4, i, c3u);
        this.A05 = writer;
        C13030hm.A00(r4.A02);
        char[] A012 = r4.A05.A01(Constants.ONE, 0);
        r4.A02 = A012;
        this.A03 = A012;
        this.A00 = A012.length;
    }

    public final void A0R() {
        A0n("write null value");
        A01();
    }

    public final void A0S() {
        A0n("start an array");
        this.A00 = this.A00.A04();
        C12950he r0 = this.A00;
        if (r0 != null) {
            r0.Buc(this);
            return;
        }
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr = this.A03;
        int i = this.A02;
        this.A02 = i + 1;
        cArr[i] = '[';
    }

    public final void A0T() {
        A0n("start an object");
        this.A00 = this.A00.A05();
        C12950he r0 = this.A00;
        if (r0 != null) {
            r0.Bud(this);
            return;
        }
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr = this.A03;
        int i = this.A02;
        this.A02 = i + 1;
        cArr[i] = '{';
    }

    public final void A0X(int i) {
        A0n("write number");
        if (this.A03) {
            if (this.A02 + 13 >= this.A00) {
                A0p();
            }
            char[] cArr = this.A03;
            int i2 = this.A02;
            int i3 = i2 + 1;
            this.A02 = i3;
            cArr[i2] = '\"';
            int A032 = C13500id.A03(i, cArr, i3);
            this.A02 = A032;
            char[] cArr2 = this.A03;
            this.A02 = A032 + 1;
            cArr2[A032] = '\"';
            return;
        }
        if (this.A02 + 11 >= this.A00) {
            A0p();
        }
        this.A02 = C13500id.A03(i, this.A03, this.A02);
    }

    public final void A0Y(long j) {
        A0n("write number");
        if (this.A03) {
            if (this.A02 + 23 >= this.A00) {
                A0p();
            }
            char[] cArr = this.A03;
            int i = this.A02;
            int i2 = i + 1;
            this.A02 = i2;
            cArr[i] = '\"';
            int A07 = C13500id.A07(j, cArr, i2);
            this.A02 = A07;
            char[] cArr2 = this.A03;
            this.A02 = A07 + 1;
            cArr2[A07] = '\"';
            return;
        }
        if (this.A02 + 21 >= this.A00) {
            A0p();
        }
        this.A02 = C13500id.A07(j, this.A03, this.A02);
    }

    public final void A0Z(C25929Bcg bcg, byte[] bArr, int i, int i2) {
        char c;
        A0n("write binary value");
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr = this.A03;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        cArr[i3] = '\"';
        int i4 = i2 + i;
        int i5 = i4 - 3;
        int i6 = this.A00 - 6;
        int i7 = bcg.A02 >> 2;
        while (i <= i5) {
            if (this.A02 > i6) {
                A0p();
            }
            int i8 = i + 1;
            int i9 = i8 + 1;
            i = i9 + 1;
            byte b = (((bArr[i] << 8) | (bArr[i8] & 255)) << 8) | (bArr[i9] & 255);
            char[] cArr2 = this.A03;
            int i10 = this.A02;
            int i11 = i10 + 1;
            char[] cArr3 = bcg.A05;
            cArr2[i10] = cArr3[(b >> 18) & 63];
            int i12 = i11 + 1;
            cArr2[i11] = cArr3[(b >> 12) & 63];
            int i13 = i12 + 1;
            cArr2[i12] = cArr3[(b >> 6) & 63];
            int i14 = i13 + 1;
            cArr2[i13] = cArr3[b & 63];
            this.A02 = i14;
            i7--;
            if (i7 <= 0) {
                int i15 = i14 + 1;
                this.A02 = i15;
                cArr2[i14] = '\\';
                this.A02 = i15 + 1;
                cArr2[i15] = 'n';
                i7 = bcg.A02 >> 2;
            }
        }
        int i16 = i4 - i;
        if (i16 > 0) {
            if (this.A02 > i6) {
                A0p();
            }
            int i17 = i + 1;
            int i18 = bArr[i] << 16;
            if (i16 == 2) {
                i18 |= (bArr[i17] & 255) << 8;
            }
            char[] cArr4 = this.A03;
            int i19 = this.A02;
            int i20 = i19 + 1;
            char[] cArr5 = bcg.A05;
            cArr4[i19] = cArr5[(i18 >> 18) & 63];
            int i21 = i20 + 1;
            cArr4[i20] = cArr5[(i18 >> 12) & 63];
            if (bcg.A03) {
                int i22 = i21 + 1;
                if (i16 == 2) {
                    c = cArr5[(i18 >> 6) & 63];
                } else {
                    c = bcg.A01;
                }
                cArr4[i21] = c;
                i21 = i22 + 1;
                cArr4[i22] = bcg.A01;
            } else if (i16 == 2) {
                cArr4[i21] = cArr5[(i18 >> 6) & 63];
                i21++;
            }
            this.A02 = i21;
        }
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr6 = this.A03;
        int i23 = this.A02;
        this.A02 = i23 + 1;
        cArr6[i23] = '\"';
    }

    public final void A0a(C12970hg r2) {
        A0f(r2.getValue());
    }

    public final void A0c(C12970hg r7) {
        A0n("write text value");
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr = this.A03;
        int i = this.A02;
        this.A02 = i + 1;
        cArr[i] = '\"';
        char[] A5w = r7.A5w();
        int length = A5w.length;
        if (length < 32) {
            if (length > this.A00 - this.A02) {
                A0p();
            }
            System.arraycopy(A5w, 0, this.A03, this.A02, length);
            this.A02 += length;
        } else {
            A0p();
            this.A05.write(A5w, 0, length);
        }
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr2 = this.A03;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        cArr2[i2] = '\"';
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
        int i = this.A00 - this.A02;
        if (i == 0) {
            A0p();
            i = this.A00 - this.A02;
        }
        if (i >= length) {
            str.getChars(0, length, this.A03, this.A02);
            this.A02 += length;
            return;
        }
        int i2 = this.A00;
        int i3 = this.A02;
        int i4 = i2 - i3;
        str.getChars(0, i4, this.A03, i3);
        this.A02 += i4;
        A0p();
        int i5 = length - i4;
        while (true) {
            int i6 = this.A00;
            if (i5 > i6) {
                int i7 = i4 + i6;
                str.getChars(i4, i7, this.A03, 0);
                this.A01 = 0;
                this.A02 = i6;
                A0p();
                i5 -= i6;
                i4 = i7;
            } else {
                str.getChars(i4, i4 + i5, this.A03, 0);
                this.A01 = 0;
                this.A02 = i5;
                return;
            }
        }
    }

    public final void A0g(String str) {
        A0n("write text value");
        if (str == null) {
            A01();
            return;
        }
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr = this.A03;
        int i = this.A02;
        this.A02 = i + 1;
        cArr[i] = '\"';
        A05(str);
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr2 = this.A03;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        cArr2[i2] = '\"';
    }

    public final void A0h(BigDecimal bigDecimal) {
        A0n("write number");
        if (bigDecimal == null) {
            A01();
        } else if (this.A03) {
            A04(bigDecimal);
        } else {
            A0f(bigDecimal.toString());
        }
    }

    public final void A0i(BigInteger bigInteger) {
        A0n("write number");
        if (bigInteger == null) {
            A01();
        } else if (this.A03) {
            A04(bigInteger);
        } else {
            A0f(bigInteger.toString());
        }
    }

    public final void A0j(short s) {
        A0n("write number");
        if (this.A03) {
            if (this.A02 + 8 >= this.A00) {
                A0p();
            }
            char[] cArr = this.A03;
            int i = this.A02;
            int i2 = i + 1;
            this.A02 = i2;
            cArr[i] = '\"';
            int A032 = C13500id.A03(s, cArr, i2);
            this.A02 = A032;
            char[] cArr2 = this.A03;
            this.A02 = A032 + 1;
            cArr2[A032] = '\"';
            return;
        }
        if (this.A02 + 6 >= this.A00) {
            A0p();
        }
        this.A02 = C13500id.A03(s, this.A03, this.A02);
    }

    public final void A0k(boolean z) {
        int i;
        char c;
        A0n("write boolean value");
        if (this.A02 + 5 >= this.A00) {
            A0p();
        }
        int i2 = this.A02;
        char[] cArr = this.A03;
        if (z) {
            cArr[i2] = 't';
            int i3 = i2 + 1;
            cArr[i3] = 'r';
            i = i3 + 1;
            c = 'u';
        } else {
            cArr[i2] = 'f';
            int i4 = i2 + 1;
            cArr[i4] = 'a';
            int i5 = i4 + 1;
            cArr[i5] = 'l';
            i = i5 + 1;
            c = 's';
        }
        cArr[i] = c;
        int i6 = i + 1;
        cArr[i6] = 'e';
        this.A02 = i6 + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0035 A[EDGE_INSN: B:54:0x0035->B:12:0x0035 ?: BREAK  , SYNTHETIC] */
    public final void A0m(char[] cArr, int i, int i2) {
        char c;
        A0n("write text value");
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr2 = this.A03;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        cArr2[i3] = '\"';
        int i4 = this.A00;
        if (i4 == 0) {
            int i5 = i2 + i;
            int[] iArr = this.A02;
            int length = iArr.length;
            while (i < i5) {
                int i6 = i;
                do {
                    char c2 = cArr[i6];
                    if ((c2 < length && iArr[c2] != 0) || (i6 = i6 + 1) >= i5) {
                        int i7 = i6 - i;
                    }
                    char c22 = cArr[i6];
                    break;
                } while ((i6 = i6 + 1) >= i5);
                int i72 = i6 - i;
                if (i72 < 32) {
                    if (this.A02 + i72 > this.A00) {
                        A0p();
                    }
                    if (i72 > 0) {
                        System.arraycopy(cArr, i, this.A03, this.A02, i72);
                        this.A02 += i72;
                    }
                } else {
                    A0p();
                    this.A05.write(cArr, i, i72);
                }
                if (i6 >= i5) {
                    break;
                }
                i = i6 + 1;
                char c3 = cArr[i6];
                A02(c3, iArr[c3]);
            }
        } else {
            int i8 = i2 + i;
            int[] iArr2 = this.A02;
            int min = Math.min(iArr2.length, i4 + 1);
            int i9 = 0;
            while (i < i8) {
                int i10 = i;
                while (true) {
                    c = cArr[i10];
                    if (c < min) {
                        i9 = iArr2[c];
                        if (i9 != 0) {
                            break;
                        }
                        i10++;
                        if (i10 >= i8) {
                            break;
                        }
                    } else {
                        if (c > i4) {
                            i9 = -1;
                            break;
                        }
                        i10++;
                        if (i10 >= i8) {
                        }
                    }
                }
                int i11 = i10 - i;
                if (i11 < 32) {
                    if (this.A02 + i11 > this.A00) {
                        A0p();
                    }
                    if (i11 > 0) {
                        System.arraycopy(cArr, i, this.A03, this.A02, i11);
                        this.A02 += i11;
                    }
                } else {
                    A0p();
                    this.A05.write(cArr, i, i11);
                }
                if (i10 >= i8) {
                    break;
                }
                i = i10 + 1;
                A02(c, i9);
            }
        }
        if (this.A02 >= this.A00) {
            A0p();
        }
        char[] cArr3 = this.A03;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        cArr3[i12] = '\"';
    }

    public final void close() {
        super.close();
        if (this.A03 != null && A0o(C12930hc.AUTO_CLOSE_JSON_CONTENT)) {
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
        Writer writer = this.A05;
        if (writer != null) {
            if (this.A03.A07 || A0o(C12930hc.AUTO_CLOSE_TARGET)) {
                writer.close();
            } else if (A0o(C12930hc.FLUSH_PASSED_TO_STREAM)) {
                writer.flush();
            }
        }
        char[] cArr = this.A03;
        if (cArr != null) {
            this.A03 = null;
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
        Writer writer = this.A05;
        if (writer != null && A0o(C12930hc.FLUSH_PASSED_TO_STREAM)) {
            writer.flush();
        }
    }
}
