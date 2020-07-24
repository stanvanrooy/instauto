package p000X;

import com.facebook.common.dextricks.DexStore;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: X.0hw  reason: invalid class name and case insensitive filesystem */
public final class C13130hw extends C13060hp {
    public static final int[] A07 = C13180i1.A01;
    public static final int[] A08 = C13180i1.A04;
    public boolean A00 = false;
    public byte[] A01;
    public int[] A02 = new int[16];
    public C3U A03;
    public InputStream A04;
    public boolean A05;
    public final C13000hj A06;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04f3, code lost:
        r4 = r8.length;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x04f4, code lost:
        if (r12 < r4) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x04f6, code lost:
        r8 = A0F(r8, r4);
        r0.A02 = r8;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x04fc, code lost:
        r6 = r12 + 1;
        r8[r12] = r5;
        r4 = r0.A06.A02(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0506, code lost:
        if (r4 != null) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0508, code lost:
        r4 = A0A(r8, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x058b, code lost:
        if (r10 == 34) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x058f, code lost:
        if (r10 == 34) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0593, code lost:
        if (r10 == 34) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x059b, code lost:
        r7 = r0.A02;
        r8 = 0;
        r6 = r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04b3  */
    public final C13120hv A0p() {
        int i;
        C13020hl r4;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        C13130hw r5;
        int i5;
        int i6;
        int[] iArr2;
        int i7;
        int i8;
        C13130hw r10;
        int i9;
        int i10;
        int[] iArr3;
        int[] iArr4;
        int i11;
        C13130hw r9;
        int i12;
        C13120hv A1L;
        int i13;
        int i14;
        int i15;
        int i16;
        C13120hv A1L2;
        C13100ht A032;
        this.A06 = 0;
        if (this.A00 == C13120hv.FIELD_NAME) {
            this.A0G = false;
            C13120hv r42 = this.A0C;
            this.A0C = null;
            if (r42 == C13120hv.START_ARRAY) {
                A032 = this.A0D.A02(this.A09, this.A08);
            } else {
                if (r42 == C13120hv.START_OBJECT) {
                    A032 = this.A0D.A03(this.A09, this.A08);
                }
                this.A00 = r42;
                return r42;
            }
            this.A0D = A032;
            this.A00 = r42;
            return r42;
        }
        if (this.A00) {
            this.A00 = false;
            int[] iArr5 = A08;
            byte[] bArr = this.A01;
            while (true) {
                int i17 = this.A04;
                int i18 = this.A03;
                if (i17 >= i18) {
                    A1B();
                    i17 = this.A04;
                    i18 = this.A03;
                }
                while (true) {
                    if (i17 >= i18) {
                        this.A04 = i17;
                        break;
                    }
                    int i19 = i17 + 1;
                    byte b = bArr[i17] & 255;
                    int i20 = iArr5[b];
                    if (i20 != 0) {
                        this.A04 = i19;
                        if (b == 34) {
                            break;
                        } else if (i20 == 1) {
                            A15();
                        } else if (i20 == 2) {
                            A0C();
                        } else if (i20 == 3) {
                            A0D();
                        } else if (i20 == 4) {
                            A0E();
                        } else if (b < 32) {
                            A11(b, "string value");
                        } else {
                            A1Q(b);
                        }
                    } else {
                        i17 = i19;
                    }
                }
            }
        }
        while (true) {
            if (this.A04 >= this.A03 && !A1I()) {
                A0x();
                i = -1;
                break;
            }
            byte[] bArr2 = this.A01;
            int i21 = this.A04;
            int i22 = i21 + 1;
            this.A04 = i22;
            i = bArr2[i21] & 255;
            if (i > 32) {
                if (i != 47) {
                    break;
                }
                A0B();
            } else if (i != 32) {
                if (i == 10) {
                    this.A01++;
                    this.A02 = i22;
                } else if (i == 13) {
                    A1P();
                } else if (i != 9) {
                    A0z(i);
                }
            }
        }
        if (i < 0) {
            close();
            this.A00 = null;
            return null;
        }
        long j = this.A0I;
        int i23 = this.A04;
        this.A0B = (j + ((long) i23)) - 1;
        this.A09 = this.A01;
        this.A08 = (i23 - this.A02) - 1;
        this.A0L = null;
        if (i == 93) {
            boolean z = true;
            if (this.A0D.A01 != 1) {
                z = false;
            }
            if (!z) {
                A1G(i, '}');
            }
            this.A0D = this.A0D.A04;
            A1L2 = C13120hv.END_ARRAY;
        } else if (i == 125) {
            if (!this.A0D.A01()) {
                A1G(i, ']');
            }
            this.A0D = this.A0D.A04;
            A1L2 = C13120hv.END_OBJECT;
        } else {
            C13100ht r7 = this.A0D;
            boolean z2 = true;
            int i24 = r7.A00 + 1;
            r7.A00 = i24;
            if (r7.A01 == 0 || i24 <= 0) {
                z2 = false;
            }
            if (z2) {
                if (i != 44) {
                    A10(i, AnonymousClass000.A0J("was expecting comma to separate ", r7.A00(), " entries"));
                }
                i = A00();
            }
            C13100ht r43 = this.A0D;
            if (r43.A01()) {
                if (i == 34) {
                    int i25 = this.A04;
                    int i26 = i25 + 9;
                    int i27 = this.A03;
                    if (i26 > i27) {
                        if (i25 >= i27 && !A1I()) {
                            A13(": was expecting closing '\"' for name");
                        }
                        byte[] bArr3 = this.A01;
                        int i28 = this.A04;
                        this.A04 = i28 + 1;
                        byte b2 = bArr3[i28] & 255;
                        if (b2 != 34) {
                            r4 = A1N(this.A02, 0, 0, b2, 0);
                        }
                        r4 = C13720j7.A01;
                    } else {
                        byte[] bArr4 = this.A01;
                        int[] iArr6 = A07;
                        int i29 = i25 + 1;
                        this.A04 = i29;
                        int i30 = bArr4[i25] & 255;
                        if (iArr6[i30] == 0) {
                            int i31 = i29 + 1;
                            this.A04 = i31;
                            int i32 = bArr4[i29] & 255;
                            if (iArr6[i32] == 0) {
                                i30 = (i30 << 8) | i32;
                                int i33 = i31 + 1;
                                this.A04 = i33;
                                i32 = bArr4[i31] & 255;
                                if (iArr6[i32] == 0) {
                                    i30 = (i30 << 8) | i32;
                                    int i34 = i33 + 1;
                                    this.A04 = i34;
                                    i32 = bArr4[i33] & 255;
                                    if (iArr6[i32] == 0) {
                                        int i35 = (i30 << 8) | i32;
                                        int i36 = i34 + 1;
                                        this.A04 = i36;
                                        i3 = bArr4[i34] & 255;
                                        if (iArr6[i3] == 0) {
                                            int i37 = i36 + 1;
                                            this.A04 = i37;
                                            i30 = bArr4[i36] & 255;
                                            if (iArr6[i30] == 0) {
                                                int i38 = (i3 << 8) | i30;
                                                int i39 = i37 + 1;
                                                this.A04 = i39;
                                                int i40 = bArr4[i37] & 255;
                                                if (iArr6[i40] != 0) {
                                                    i6 = 2;
                                                    if (i40 != 34) {
                                                        iArr4 = this.A02;
                                                        iArr4[0] = i35;
                                                        i11 = 1;
                                                        r9 = this;
                                                        i12 = 2;
                                                    }
                                                    r4 = this.A06.A01(i35, i38);
                                                    if (r4 == null) {
                                                        int[] iArr7 = this.A02;
                                                        iArr7[0] = i35;
                                                        iArr7[1] = i38;
                                                        r4 = A0A(iArr7, 2, i6);
                                                    }
                                                } else {
                                                    i38 = (i38 << 8) | i40;
                                                    int i41 = i39 + 1;
                                                    this.A04 = i41;
                                                    i40 = bArr4[i39] & 255;
                                                    if (iArr6[i40] != 0) {
                                                        i6 = 3;
                                                        if (i40 != 34) {
                                                            iArr4 = this.A02;
                                                            iArr4[0] = i35;
                                                            i11 = 1;
                                                            r9 = this;
                                                            i12 = 3;
                                                        }
                                                    } else {
                                                        i38 = (i38 << 8) | i40;
                                                        this.A04 = i41 + 1;
                                                        int i42 = bArr4[i41] & 255;
                                                        if (iArr6[i42] != 0) {
                                                            i6 = 4;
                                                            if (i42 != 34) {
                                                                int[] iArr8 = this.A02;
                                                                iArr8[0] = i35;
                                                                int i43 = 1;
                                                                C13130hw r6 = this;
                                                                i5 = 4;
                                                                i30 = i38;
                                                                i32 = i42;
                                                                r4 = r6.A1N(iArr8, i43, i30, i32, i5);
                                                            }
                                                        } else {
                                                            int[] iArr9 = this.A02;
                                                            iArr9[0] = i35;
                                                            iArr9[1] = i38;
                                                            int i44 = 2;
                                                            int i45 = 2;
                                                            while (true) {
                                                                int i46 = this.A03;
                                                                int i47 = this.A04;
                                                                if (i46 - i47 < 4) {
                                                                    iArr2 = this.A02;
                                                                    i7 = 0;
                                                                    i8 = 0;
                                                                    r10 = this;
                                                                    i9 = i42;
                                                                    break;
                                                                }
                                                                byte[] bArr5 = this.A01;
                                                                int i48 = i47 + 1;
                                                                this.A04 = i48;
                                                                i9 = bArr5[i47] & 255;
                                                                if (iArr6[i9] == 0) {
                                                                    i10 = (i42 << 8) | i9;
                                                                    int i49 = i48 + 1;
                                                                    this.A04 = i49;
                                                                    i9 = bArr5[i48] & 255;
                                                                    if (iArr6[i9] == 0) {
                                                                        i10 = (i10 << 8) | i9;
                                                                        int i50 = i49 + 1;
                                                                        this.A04 = i50;
                                                                        i9 = bArr5[i49] & 255;
                                                                        if (iArr6[i9] == 0) {
                                                                            i10 = (i10 << 8) | i9;
                                                                            this.A04 = i50 + 1;
                                                                            i9 = bArr5[i50] & 255;
                                                                            if (iArr6[i9] == 0) {
                                                                                int[] iArr10 = this.A02;
                                                                                if (i45 >= iArr10.length) {
                                                                                    this.A02 = A0F(iArr10, i45);
                                                                                }
                                                                                this.A02[i45] = i10;
                                                                                i45++;
                                                                                i42 = i9;
                                                                            } else if (i9 == 34) {
                                                                                i44 = 4;
                                                                                iArr3 = this.A02;
                                                                            } else {
                                                                                iArr2 = this.A02;
                                                                                i8 = 4;
                                                                            }
                                                                        } else if (i9 == 34) {
                                                                            i44 = 3;
                                                                            iArr3 = this.A02;
                                                                        } else {
                                                                            iArr2 = this.A02;
                                                                            i8 = 3;
                                                                        }
                                                                    } else if (i9 == 34) {
                                                                        iArr3 = this.A02;
                                                                    } else {
                                                                        iArr2 = this.A02;
                                                                        i8 = 2;
                                                                    }
                                                                } else if (i9 == 34) {
                                                                    i44 = 1;
                                                                    i10 = i42;
                                                                    iArr3 = this.A02;
                                                                } else {
                                                                    iArr2 = this.A02;
                                                                    i8 = 1;
                                                                    i10 = i42;
                                                                }
                                                            }
                                                            r10 = this;
                                                            i7 = i10;
                                                            r4 = r10.A1N(iArr2, i45, i7, i9, i8);
                                                        }
                                                    }
                                                    r4 = this.A06.A01(i35, i38);
                                                    if (r4 == null) {
                                                    }
                                                }
                                                r4 = r9.A1N(iArr4, i11, i38, i40, i12);
                                            } else if (i30 == 34) {
                                                r4 = this.A06.A01(i35, i3);
                                                if (r4 == null) {
                                                    int[] iArr11 = this.A02;
                                                    iArr11[0] = i35;
                                                    iArr11[1] = i3;
                                                    r4 = A0A(iArr11, 2, 1);
                                                }
                                            } else {
                                                iArr = this.A02;
                                                iArr[0] = i35;
                                                i4 = 1;
                                                r5 = this;
                                                i2 = 1;
                                            }
                                        } else if (i3 == 34) {
                                            r4 = A09(i35, 4);
                                        } else {
                                            r4 = A1N(this.A02, 0, i35, i3, 4);
                                        }
                                    } else {
                                        i5 = 3;
                                    }
                                } else {
                                    i5 = 2;
                                }
                            } else {
                                i5 = 1;
                            }
                            r4 = A09(i30, i5);
                        } else {
                            if (i30 != 34) {
                                iArr = this.A02;
                                i4 = 0;
                                r5 = this;
                                i3 = 0;
                                i2 = 0;
                            }
                            r4 = C13720j7.A01;
                        }
                        r4 = r5.A1N(iArr, i4, i3, i30, i2);
                    }
                } else if (i != 39 || !A0Q(Constants.A0N)) {
                    if (!A0Q(Constants.A0C)) {
                        A10(i, "was expecting double-quote to start field name");
                    }
                    int[] iArr12 = C13180i1.A05;
                    if (iArr12[i] != 0) {
                        A10(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                    }
                    int[] iArr13 = this.A02;
                    int i51 = 0;
                    int i52 = 0;
                    int i53 = 0;
                    int i54 = i;
                    while (true) {
                        if (i51 < 4) {
                            i51++;
                            i53 = (i53 << 8) | i54;
                        } else {
                            int length = iArr13.length;
                            if (i52 >= length) {
                                iArr13 = A0F(iArr13, length);
                                this.A02 = iArr13;
                            }
                            iArr13[i52] = i53;
                            i52++;
                            i53 = i54;
                            i51 = 1;
                        }
                        if (this.A04 >= this.A03 && !A1I()) {
                            A13(" in field name");
                        }
                        byte[] bArr6 = this.A01;
                        int i55 = this.A04;
                        i54 = bArr6[i55] & 255;
                        if (iArr12[i54] != 0) {
                            break;
                        }
                        this.A04 = i55 + 1;
                    }
                    if (i51 > 0) {
                        int length2 = iArr13.length;
                        if (i52 >= length2) {
                            iArr13 = A0F(iArr13, length2);
                            this.A02 = iArr13;
                        }
                        iArr13[i52] = i53;
                        i52++;
                    }
                    r4 = this.A06.A02(iArr13, i52);
                    if (r4 == null) {
                        r4 = A0A(iArr13, i52, i51);
                    }
                } else {
                    if (this.A04 >= this.A03 && !A1I()) {
                        A13(": was expecting closing ''' for name");
                    }
                    byte[] bArr7 = this.A01;
                    int i56 = this.A04;
                    this.A04 = i56 + 1;
                    int i57 = bArr7[i56] & 255;
                    if (i57 != 39) {
                        int[] iArr14 = this.A02;
                        int[] iArr15 = A07;
                        int i58 = 0;
                        int i59 = 0;
                        int i60 = 0;
                        while (i57 != 39) {
                            if (!(i57 == 34 || iArr15[i57] == 0)) {
                                if (i57 != 92) {
                                    A11(i57, "name");
                                } else {
                                    i57 = A15();
                                }
                                if (i57 > 127) {
                                    if (i14 >= 4) {
                                        int length3 = iArr14.length;
                                        if (i59 >= length3) {
                                            iArr14 = A0F(iArr14, length3);
                                            this.A02 = iArr14;
                                        }
                                        iArr14[i59] = i13;
                                        i59++;
                                        i14 = 0;
                                        i13 = 0;
                                    }
                                    if (i57 < 2048) {
                                        i13 = (i13 << 8) | (i57 >> 6) | 192;
                                        i14++;
                                    } else {
                                        int i61 = (i13 << 8) | (i57 >> 12) | 224;
                                        int i62 = i14 + 1;
                                        if (i62 >= 4) {
                                            int length4 = iArr14.length;
                                            if (i59 >= length4) {
                                                iArr14 = A0F(iArr14, length4);
                                                this.A02 = iArr14;
                                            }
                                            iArr14[i59] = i61;
                                            i59++;
                                            i62 = 0;
                                            i61 = 0;
                                        }
                                        i13 = (i61 << 8) | ((i57 >> 6) & 63) | 128;
                                        i14 = i62 + 1;
                                    }
                                    i57 = (i57 & 63) | 128;
                                }
                            }
                            if (i14 < 4) {
                                i58 = i14 + 1;
                                i16 = i57 | (i13 << 8);
                            } else {
                                int length5 = iArr14.length;
                                if (i59 >= length5) {
                                    iArr14 = A0F(iArr14, length5);
                                    this.A02 = iArr14;
                                }
                                iArr14[i59] = i13;
                                i16 = i57;
                                i59++;
                                i58 = 1;
                            }
                            if (this.A04 >= this.A03 && !A1I()) {
                                A13(" in field name");
                            }
                            byte[] bArr8 = this.A01;
                            int i63 = this.A04;
                            this.A04 = i63 + 1;
                            i57 = bArr8[i63] & 255;
                            i60 = i16;
                        }
                        if (i14 > 0) {
                            int length6 = iArr14.length;
                            if (i59 >= length6) {
                                iArr14 = A0F(iArr14, length6);
                                this.A02 = iArr14;
                            }
                            i15 = i59 + 1;
                            iArr14[i59] = i13;
                        } else {
                            i15 = i59;
                        }
                        r4 = this.A06.A02(iArr14, i15);
                        if (r4 == null) {
                            r4 = A0A(iArr14, i15, i14);
                        }
                    }
                    r4 = C13720j7.A01;
                }
                this.A0D.A02 = r4.A00;
                this.A00 = C13120hv.FIELD_NAME;
                int A002 = A00();
                if (A002 != 58) {
                    A10(A002, "was expecting a colon to separate field name and value");
                }
                int A003 = A00();
                if (A003 == 34) {
                    this.A00 = true;
                    A1L = C13120hv.VALUE_STRING;
                } else {
                    if (A003 != 45) {
                        if (A003 != 91) {
                            if (A003 != 93) {
                                if (A003 == 102) {
                                    A1T("false", 1);
                                    A1L = C13120hv.VALUE_FALSE;
                                } else if (A003 != 110) {
                                    if (A003 != 116) {
                                        if (A003 != 123) {
                                            if (A003 != 125) {
                                                switch (A003) {
                                                    case 48:
                                                    case 49:
                                                    case AMD.MAX_LIKES_PER_FETCH /*50*/:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                        break;
                                                    default:
                                                        A1L = A1K(A003);
                                                        break;
                                                }
                                            }
                                        } else {
                                            A1L = C13120hv.START_OBJECT;
                                        }
                                    }
                                    A1T("true", 1);
                                    A1L = C13120hv.VALUE_TRUE;
                                } else {
                                    A1T("null", 1);
                                    A1L = C13120hv.VALUE_NULL;
                                }
                            }
                            A10(A003, "expected a value");
                            A1T("true", 1);
                            A1L = C13120hv.VALUE_TRUE;
                        } else {
                            A1L = C13120hv.START_ARRAY;
                        }
                    }
                    A1L = A1L(A003);
                }
                this.A0C = A1L;
                return this.A00;
            } else if (i == 34) {
                this.A00 = true;
                A1L2 = C13120hv.VALUE_STRING;
            } else {
                if (i != 45) {
                    if (i != 91) {
                        if (i != 93) {
                            if (i == 102) {
                                A1T("false", 1);
                                A1L2 = C13120hv.VALUE_FALSE;
                            } else if (i != 110) {
                                if (i != 116) {
                                    if (i != 123) {
                                        if (i != 125) {
                                            switch (i) {
                                                case 48:
                                                case 49:
                                                case AMD.MAX_LIKES_PER_FETCH /*50*/:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                    break;
                                                default:
                                                    A1L2 = A1K(i);
                                                    break;
                                            }
                                        }
                                    } else {
                                        this.A0D = r43.A03(this.A09, this.A08);
                                        A1L2 = C13120hv.START_OBJECT;
                                    }
                                }
                                A1T("true", 1);
                                A1L2 = C13120hv.VALUE_TRUE;
                            } else {
                                A1T("null", 1);
                                A1L2 = C13120hv.VALUE_NULL;
                            }
                        }
                        A10(i, "expected a value");
                        A1T("true", 1);
                        A1L2 = C13120hv.VALUE_TRUE;
                    } else {
                        this.A0D = r43.A02(this.A09, this.A08);
                        A1L2 = C13120hv.START_ARRAY;
                    }
                }
                A1L2 = A1L(i);
            }
        }
        this.A00 = A1L2;
        return A1L2;
    }

    private int A00() {
        while (true) {
            if (this.A04 < this.A03 || A1I()) {
                byte[] bArr = this.A01;
                int i = this.A04;
                int i2 = i + 1;
                this.A04 = i2;
                byte b = bArr[i] & 255;
                if (b > 32) {
                    if (b != 47) {
                        return b;
                    }
                    A0B();
                } else if (b != 32) {
                    if (b == 10) {
                        this.A01++;
                        this.A02 = i2;
                    } else if (b == 13) {
                        A1P();
                    } else if (b != 9) {
                        A0z(b);
                    }
                }
            } else {
                throw A0K(AnonymousClass000.A0J("Unexpected end-of-input within/between ", this.A0D.A00(), " entries"));
            }
        }
    }

    private int A01() {
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr = this.A01;
        int i = this.A04;
        this.A04 = i + 1;
        return bArr[i] & 255;
    }

    private int A02(int i) {
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr = this.A01;
        int i2 = this.A04;
        int i3 = i2 + 1;
        this.A04 = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            this.A04 = i3;
            A1R(b & 255);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private int A05(int i) {
        if (this.A04 >= this.A03) {
            A1B();
        }
        int i2 = i & 15;
        byte[] bArr = this.A01;
        int i3 = this.A04;
        int i4 = i3 + 1;
        this.A04 = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            this.A04 = i4;
            A1R(b & 255);
        }
        byte b2 = (i2 << 6) | (b & 63);
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr2 = this.A01;
        int i5 = this.A04;
        int i6 = i5 + 1;
        this.A04 = i6;
        byte b3 = bArr2[i5];
        if ((b3 & 192) != 128) {
            this.A04 = i6;
            A1R(b3 & 255);
        }
        return (b2 << 6) | (b3 & 63);
    }

    private int A06(int i) {
        int i2 = i & 15;
        byte[] bArr = this.A01;
        int i3 = this.A04;
        int i4 = i3 + 1;
        this.A04 = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            this.A04 = i4;
            A1R(b & 255);
        }
        byte b2 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this.A01;
        int i5 = this.A04;
        int i6 = i5 + 1;
        this.A04 = i6;
        byte b3 = bArr2[i5];
        if ((b3 & 192) != 128) {
            this.A04 = i6;
            A1R(b3 & 255);
        }
        return (b2 << 6) | (b3 & 63);
    }

    private int A07(int i) {
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr = this.A01;
        int i2 = this.A04;
        int i3 = i2 + 1;
        this.A04 = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            this.A04 = i3;
            A1R(b & 255);
        }
        byte b2 = ((i & 7) << 6) | (b & 63);
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr2 = this.A01;
        int i4 = this.A04;
        int i5 = i4 + 1;
        this.A04 = i5;
        byte b3 = bArr2[i4];
        if ((b3 & 192) != 128) {
            this.A04 = i5;
            A1R(b3 & 255);
        }
        byte b4 = (b2 << 6) | (b3 & 63);
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr3 = this.A01;
        int i6 = this.A04;
        int i7 = i6 + 1;
        this.A04 = i7;
        byte b5 = bArr3[i6];
        if ((b5 & 192) != 128) {
            this.A04 = i7;
            A1R(b5 & 255);
        }
        return ((b4 << 6) | (b5 & 63)) - DexStore.LOAD_RESULT_PGO_ATTEMPTED;
    }

    private C13120hv A08(char[] cArr, int i, byte b, boolean z, int i2) {
        boolean z2 = false;
        if (b == 46) {
            cArr[i] = (char) b;
            i++;
            b = 46;
            int i3 = 0;
            while (true) {
                if (this.A04 >= this.A03 && !A1I()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.A01;
                int i4 = this.A04;
                this.A04 = i4 + 1;
                b = bArr[i4] & 255;
                if (b < 48 || b > 57) {
                    break;
                }
                i3++;
                if (i >= cArr.length) {
                    cArr = this.A0N.A0D();
                    i = 0;
                }
                cArr[i] = (char) b;
                i++;
            }
            if (i3 == 0) {
                A1H(b, "Decimal point not followed by a digit");
            }
        }
        if (b == 101 || b == 69) {
            if (i >= cArr.length) {
                cArr = this.A0N.A0D();
                i = 0;
            }
            int i5 = i + 1;
            cArr[i] = (char) b;
            if (this.A04 >= this.A03) {
                A1B();
            }
            byte[] bArr2 = this.A01;
            int i6 = this.A04;
            this.A04 = i6 + 1;
            byte b2 = bArr2[i6] & 255;
            if (b2 == 45 || b2 == 43) {
                if (i5 >= cArr.length) {
                    cArr = this.A0N.A0D();
                    i5 = 0;
                }
                r11 = i5 + 1;
                cArr[i5] = (char) b2;
                if (this.A04 >= this.A03) {
                    A1B();
                }
                byte[] bArr3 = this.A01;
                int i7 = this.A04;
                this.A04 = i7 + 1;
                b2 = bArr3[i7] & 255;
            } else {
                r11 = i5;
            }
            int i8 = 0;
            while (true) {
                if (b2 > 57 || b2 < 48) {
                    break;
                }
                i8++;
                if (r11 >= cArr.length) {
                    cArr = this.A0N.A0D();
                    r11 = 0;
                }
                int i9 = r11 + 1;
                cArr[r11] = (char) b2;
                if (this.A04 >= this.A03 && !A1I()) {
                    r11 = i9;
                    z2 = true;
                    break;
                }
                byte[] bArr4 = this.A01;
                int i10 = this.A04;
                this.A04 = i10 + 1;
                b2 = bArr4[i10] & 255;
                r11 = i9;
            }
            if (i8 == 0) {
                A1H(b2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.A04--;
        }
        this.A0N.A00 = i;
        this.A0H = z;
        this.A05 = i2;
        this.A06 = 0;
        return C13120hv.VALUE_NUMBER_FLOAT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r3 == 0) goto L_0x0028;
     */
    private C13020hl A09(int i, int i2) {
        C13730j8 r1;
        C13000hj r5 = this.A06;
        int i3 = i ^ r5.A0B;
        int i4 = i3 + (i3 >>> 15);
        int i5 = i4 ^ (i4 >>> 9);
        int i6 = r5.A04 & i5;
        int i7 = r5.A08[i6];
        C13020hl r2 = null;
        if ((((i7 >> 8) ^ i5) << 8) == 0) {
            C13020hl r12 = r5.A0A[i6];
            if (r12 != null) {
                if (r12.A00(i)) {
                    r2 = r12;
                }
                int i8 = i7 & 255;
                if (i8 > 0 && (r1 = r5.A09[i8 - 1]) != null) {
                    r2 = r1.A00(i5, i, 0);
                }
            }
        }
        if (r2 != null) {
            return r2;
        }
        int[] iArr = this.A02;
        iArr[0] = i;
        return A0A(iArr, 1, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.0j4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.0j3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.0j7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.0j6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.0j3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.0j3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.0j3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: X.0j3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b3  */
    private C13020hl A0A(int[] iArr, int i, int i2) {
        int i3;
        int A002;
        C13680j3 r5;
        int i4;
        C13020hl[] r4;
        int i5;
        int length;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i;
        int i12 = i2;
        int i13 = ((i << 2) - 4) + i2;
        if (i12 < 4) {
            int i14 = i - 1;
            i3 = iArr[i14];
            iArr[i14] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        char[] A0B = this.A0N.A0B();
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            int i17 = (iArr[i15 >> 2] >> ((3 - (i15 & 3)) << 3)) & 255;
            i15++;
            if (i17 > 127) {
                if ((i17 & 224) == 192) {
                    i9 = i17 & 31;
                    i8 = 1;
                } else if ((i17 & 240) == 224) {
                    i9 = i17 & 15;
                    i8 = 2;
                } else if ((i17 & 248) == 240) {
                    i9 = i17 & 7;
                    i8 = 3;
                } else {
                    A12(AnonymousClass000.A0E("Invalid UTF-8 start byte 0x", Integer.toHexString(i17)));
                    i8 = 1;
                    i9 = 1;
                }
                if (i15 + i8 > i13) {
                    A13(" in field name");
                }
                int i18 = iArr[i15 >> 2] >> ((3 - (i15 & 3)) << 3);
                i15++;
                if ((i18 & 192) != 128) {
                    A1R(i18);
                }
                i17 = (i9 << 6) | (i18 & 63);
                if (i8 > 1) {
                    int i19 = iArr[i15 >> 2] >> ((3 - (i15 & 3)) << 3);
                    i15++;
                    if ((i19 & 192) != 128) {
                        A1R(i19);
                    }
                    i17 = (i19 & 63) | (i17 << 6);
                    i10 = 2;
                    if (i8 > 2) {
                        int i20 = iArr[i15 >> 2] >> ((3 - (i15 & 3)) << 3);
                        i15++;
                        if ((i20 & 192) != 128) {
                            A1R(i20 & 255);
                        }
                        i17 = (i17 << 6) | (i20 & 63);
                    }
                    if (i8 > i10) {
                        int i21 = i17 - DexStore.LOAD_RESULT_PGO_ATTEMPTED;
                        if (i16 >= A0B.length) {
                            A0B = this.A0N.A0C();
                        }
                        A0B[i16] = (char) ((i21 >> 10) + 55296);
                        i17 = (i21 & 1023) | 56320;
                        i16++;
                    }
                }
                i10 = 2;
                if (i8 > i10) {
                }
            }
            if (i16 >= A0B.length) {
                A0B = this.A0N.A0C();
            }
            A0B[i16] = (char) i17;
            i16++;
        }
        String str = new String(A0B, 0, i16);
        if (i12 < 4) {
            iArr[i - 1] = i3;
        }
        C13000hj r7 = this.A06;
        int[] iArr2 = iArr;
        if (r7.A0E) {
            str = C13190i2.A00.A00(str);
        }
        if (i11 >= 3) {
            A002 = r7.A00(iArr2, i11);
        } else if (i11 == 1) {
            int i22 = iArr[0] ^ r7.A0B;
            int i23 = i22 + (i22 >>> 15);
            A002 = i23 ^ (i23 >>> 9);
        } else {
            int i24 = iArr[0];
            int i25 = ((i24 ^ (i24 >>> 15)) + (iArr[1] * 33)) ^ r7.A0B;
            A002 = i25 + (i25 >>> 7);
        }
        if (i11 < 4) {
            if (i11 == 1) {
                r5 = new C13720j7(str, A002, iArr[0]);
            } else if (i11 == 2) {
                r5 = new C13710j6(str, A002, iArr[0], iArr[1]);
            } else if (i11 == 3) {
                r5 = new C13680j3(str, A002, iArr[0], iArr[1], iArr[2]);
            }
            if (r7.A06) {
                int[] iArr3 = r7.A08;
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                r7.A08 = iArr4;
                System.arraycopy(iArr3, 0, iArr4, 0, length2);
                r7.A06 = false;
            }
            if (r7.A0F) {
                r7.A0F = false;
                r7.A07 = false;
                int[] iArr5 = r7.A08;
                int length3 = iArr5.length;
                int i26 = length3 + length3;
                if (i26 > 65536) {
                    r7.A02 = 0;
                    r7.A03 = 0;
                    Arrays.fill(iArr5, 0);
                    Arrays.fill(r7.A0A, (Object) null);
                    Arrays.fill(r7.A09, (Object) null);
                    r7.A00 = 0;
                    r7.A01 = 0;
                } else {
                    int[] iArr6 = new int[i26];
                    r7.A08 = iArr6;
                    int i27 = i26 - 1;
                    r7.A04 = i27;
                    C13020hl[] r9 = r7.A0A;
                    C13020hl[] r42 = new C13020hl[i26];
                    r7.A0A = r42;
                    int i28 = 0;
                    for (int i29 = 0; i29 < length3; i29++) {
                        C13020hl r2 = r9[i29];
                        if (r2 != null) {
                            i28++;
                            int hashCode = r2.hashCode();
                            int i30 = i27 & hashCode;
                            r42[i30] = r2;
                            iArr6[i30] = hashCode << 8;
                        }
                    }
                    int i31 = r7.A01;
                    if (i31 == 0) {
                        r7.A03 = 0;
                    } else {
                        r7.A00 = 0;
                        r7.A01 = 0;
                        r7.A05 = false;
                        C13730j8[] r10 = r7.A09;
                        r7.A09 = new C13730j8[r10.length];
                        int i32 = 0;
                        for (int i33 = 0; i33 < i31; i33++) {
                            for (C13730j8 r43 = r10[i33]; r43 != null; r43 = r43.A00) {
                                i28++;
                                C13020hl r13 = r43.A01;
                                int hashCode2 = r13.hashCode();
                                int i34 = r7.A04 & hashCode2;
                                int[] iArr7 = r7.A08;
                                int i35 = iArr7[i34];
                                C13020hl[] r1 = r7.A0A;
                                if (r1[i34] == null) {
                                    iArr7[i34] = hashCode2 << 8;
                                    r1[i34] = r13;
                                } else {
                                    r7.A00++;
                                    int i36 = i35 & 255;
                                    if (i36 == 0) {
                                        i7 = r7.A01;
                                        if (i7 <= 254) {
                                            r7.A01 = i7 + 1;
                                            C13730j8[] r14 = r7.A09;
                                            int length4 = r14.length;
                                            if (i7 >= length4) {
                                                C13730j8[] r12 = new C13730j8[(length4 + length4)];
                                                r7.A09 = r12;
                                                System.arraycopy(r14, 0, r12, 0, length4);
                                            }
                                        } else {
                                            int i37 = i7;
                                            i7 = -1;
                                            if (0 < i37) {
                                                i7 = 0;
                                            }
                                        }
                                        r7.A08[i34] = (i35 & -256) | (i7 + 1);
                                    } else {
                                        i7 = i36 - 1;
                                    }
                                    C13730j8[] r15 = r7.A09;
                                    r15[i7] = new C13730j8(r13, r15[i7]);
                                    i32 = Math.max(i32, 1);
                                }
                            }
                        }
                        r7.A03 = i32;
                        int i38 = r7.A02;
                        if (i28 != i38) {
                            throw new RuntimeException(AnonymousClass000.A07("Internal error: count after rehash ", i28, "; should be ", i38));
                        }
                    }
                }
            }
            r7.A02++;
            i4 = r7.A04 & A002;
            r4 = r7.A0A;
            if (r4[i4] != null) {
                r7.A08[i4] = A002 << 8;
                if (r7.A07) {
                    int length5 = r4.length;
                    C13020hl[] r16 = new C13020hl[length5];
                    r7.A0A = r16;
                    System.arraycopy(r4, 0, r16, 0, length5);
                    r7.A07 = false;
                }
                r7.A0A[i4] = r5;
            } else {
                if (r7.A05) {
                    C13730j8[] r44 = r7.A09;
                    if (r44 == null) {
                        r7.A09 = new C13730j8[32];
                    } else {
                        int length6 = r44.length;
                        C13730j8[] r0 = new C13730j8[length6];
                        r7.A09 = r0;
                        System.arraycopy(r44, 0, r0, 0, length6);
                    }
                    r7.A05 = false;
                }
                r7.A00++;
                int i39 = r7.A08[i4];
                int i40 = i39 & 255;
                if (i40 == 0) {
                    i5 = r7.A01;
                    if (i5 <= 254) {
                        r7.A01 = i5 + 1;
                        C13730j8[] r6 = r7.A09;
                        int length7 = r6.length;
                        if (i5 >= length7) {
                            C13730j8[] r17 = new C13730j8[(length7 + length7)];
                            r7.A09 = r17;
                            System.arraycopy(r6, 0, r17, 0, length7);
                        }
                    } else {
                        int i41 = i5;
                        i5 = -1;
                        if (0 < i41) {
                            i5 = 0;
                        }
                    }
                    r7.A08[i4] = (i39 & -256) | (i5 + 1);
                } else {
                    i5 = i40 - 1;
                }
                C13730j8[] r18 = r7.A09;
                r18[i5] = new C13730j8(r5, r18[i5]);
                int max = Math.max(1, r7.A03);
                r7.A03 = max;
                if (max > 255) {
                    throw new IllegalStateException(AnonymousClass000.A08("Longest collision chain in symbol table (of size ", r7.A02, ") now exceeds maximum, ", 255, " -- suspect a DoS attack based on hash collisions"));
                }
            }
            length = r7.A08.length;
            i6 = r7.A02;
            if (i6 > (length >> 1)) {
                int i42 = length >> 2;
                if (i6 > length - i42 || r7.A00 >= i42) {
                    r7.A0F = true;
                }
            }
            return r5;
        }
        int[] iArr8 = new int[i11];
        for (int i43 = 0; i43 < i11; i43++) {
            iArr8[i43] = iArr[i43];
        }
        r5 = new C13690j4(str, A002, iArr8, i11);
        if (r7.A06) {
        }
        if (r7.A0F) {
        }
        r7.A02++;
        i4 = r7.A04 & A002;
        r4 = r7.A0A;
        if (r4[i4] != null) {
        }
        length = r7.A08.length;
        i6 = r7.A02;
        if (i6 > (length >> 1)) {
        }
        return r5;
    }

    private void A0B() {
        if (!A0Q(Constants.ONE)) {
            A10(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.A04 >= this.A03 && !A1I()) {
            A13(" in a comment");
        }
        byte[] bArr = this.A01;
        int i = this.A04;
        this.A04 = i + 1;
        byte b = bArr[i] & 255;
        if (b == 47) {
            int[] iArr = C13180i1.A02;
            while (true) {
                if (this.A04 < this.A03 || A1I()) {
                    byte[] bArr2 = this.A01;
                    int i2 = this.A04;
                    int i3 = i2 + 1;
                    this.A04 = i3;
                    byte b2 = bArr2[i2] & 255;
                    int i4 = iArr[b2];
                    if (i4 != 0) {
                        if (i4 == 2) {
                            A0C();
                        } else if (i4 == 3) {
                            A0D();
                        } else if (i4 == 4) {
                            A0E();
                        } else if (i4 == 10) {
                            this.A01++;
                            this.A02 = i3;
                            return;
                        } else if (i4 == 13) {
                            A1P();
                            return;
                        } else if (i4 != 42) {
                            A1Q(b2);
                        }
                    }
                } else {
                    return;
                }
            }
        } else if (b == 42) {
            int[] iArr2 = C13180i1.A02;
            while (true) {
                if (this.A04 >= this.A03 && !A1I()) {
                    break;
                }
                byte[] bArr3 = this.A01;
                int i5 = this.A04;
                int i6 = i5 + 1;
                this.A04 = i6;
                byte b3 = bArr3[i5] & 255;
                int i7 = iArr2[b3];
                if (i7 != 0) {
                    if (i7 == 2) {
                        A0C();
                    } else if (i7 == 3) {
                        A0D();
                    } else if (i7 == 4) {
                        A0E();
                    } else if (i7 == 10) {
                        this.A01++;
                        this.A02 = i6;
                    } else if (i7 != 13) {
                        if (i7 == 42) {
                            if (i6 >= this.A03 && !A1I()) {
                                break;
                            }
                            byte[] bArr4 = this.A01;
                            int i8 = this.A04;
                            if (bArr4[i8] == 47) {
                                this.A04 = i8 + 1;
                                return;
                            }
                        } else {
                            A1Q(b3);
                        }
                    } else {
                        A1P();
                    }
                }
            }
            A13(" in a comment");
        } else {
            A10(b, "was expecting either '*' or '/' for a comment");
        }
    }

    private void A0C() {
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr = this.A01;
        int i = this.A04;
        int i2 = i + 1;
        this.A04 = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            this.A04 = i2;
            A1R(b & 255);
        }
    }

    private void A0D() {
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr = this.A01;
        int i = this.A04;
        int i2 = i + 1;
        this.A04 = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            this.A04 = i2;
            A1R(b & 255);
        }
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr2 = this.A01;
        int i3 = this.A04;
        int i4 = i3 + 1;
        this.A04 = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            this.A04 = i4;
            A1R(b2 & 255);
        }
    }

    private void A0E() {
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr = this.A01;
        int i = this.A04;
        int i2 = i + 1;
        this.A04 = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            this.A04 = i2;
            A1R(b & 255);
        }
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr2 = this.A01;
        int i3 = this.A04;
        int i4 = i3 + 1;
        this.A04 = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            this.A04 = i4;
            A1R(b2 & 255);
        }
        if (this.A04 >= this.A03) {
            A1B();
        }
        byte[] bArr3 = this.A01;
        int i5 = this.A04;
        int i6 = i5 + 1;
        this.A04 = i6;
        byte b3 = bArr3[i5];
        if ((b3 & 192) != 128) {
            this.A04 = i6;
            A1R(b3 & 255);
        }
    }

    public static int[] A0F(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        int[] iArr2 = new int[(i + length)];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public final int A0n() {
        C13120hv r3 = this.A00;
        if (r3 == null) {
            return 0;
        }
        int i = C13700j5.A00[r3.ordinal()];
        if (i == 1) {
            return this.A0D.A02.length();
        }
        if (i != 2) {
            if (!(i == 3 || i == 4)) {
                return r3.A02.length;
            }
        } else if (this.A00) {
            this.A00 = false;
            A1O();
        }
        return this.A0N.A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r1 != 4) goto L_0x0019;
     */
    public final int A0o() {
        int i;
        C13120hv r0 = this.A00;
        if (!(r0 == null || (i = C13700j5.A00[r0.ordinal()]) == 1)) {
            if (i != 2) {
                if (i != 3) {
                }
            } else if (this.A00) {
                this.A00 = false;
                A1O();
            }
            int i2 = this.A0N.A02;
            if (i2 < 0) {
                return 0;
            }
            return i2;
        }
        return 0;
    }

    public final C3U A0q() {
        return this.A03;
    }

    public final String A0r() {
        if (this.A00 != C13120hv.VALUE_STRING) {
            return super.A0u((String) null);
        }
        if (this.A00) {
            this.A00 = false;
            A1O();
        }
        return this.A0N.A05();
    }

    public final String A0s() {
        C13100ht A032;
        if (this.A00 == C13120hv.FIELD_NAME) {
            this.A0G = false;
            C13120hv r1 = this.A0C;
            this.A0C = null;
            this.A00 = r1;
            if (r1 == C13120hv.VALUE_STRING) {
                if (this.A00) {
                    this.A00 = false;
                    A1O();
                }
                return this.A0N.A05();
            }
            if (r1 == C13120hv.START_ARRAY) {
                A032 = this.A0D.A02(this.A09, this.A08);
            } else if (r1 != C13120hv.START_OBJECT) {
                return null;
            } else {
                A032 = this.A0D.A03(this.A09, this.A08);
            }
            this.A0D = A032;
            return null;
        } else if (A0p() == C13120hv.VALUE_STRING) {
            return A0t();
        } else {
            return null;
        }
    }

    public final String A0t() {
        C13120hv r2 = this.A00;
        if (r2 == C13120hv.VALUE_STRING) {
            if (this.A00) {
                this.A00 = false;
                A1O();
            }
            return this.A0N.A05();
        } else if (r2 == null) {
            return null;
        } else {
            int i = C13700j5.A00[r2.ordinal()];
            if (i == 1) {
                return this.A0D.A02;
            }
            if (i == 2 || i == 3 || i == 4) {
                return this.A0N.A05();
            }
            return r2.A01;
        }
    }

    public final String A0u(String str) {
        if (this.A00 != C13120hv.VALUE_STRING) {
            return super.A0u(str);
        }
        if (this.A00) {
            this.A00 = false;
            A1O();
        }
        return this.A0N.A05();
    }

    public final byte[] A0v(C25929Bcg bcg) {
        byte[] bArr;
        C13120hv r2 = this.A00;
        if (r2 != C13120hv.VALUE_STRING && (r2 != C13120hv.VALUE_EMBEDDED_OBJECT || this.A0L == null)) {
            A12("Current token (" + r2 + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.A00) {
            try {
                BZR A19 = A19();
                while (true) {
                    if (this.A04 >= this.A03) {
                        A1B();
                    }
                    byte[] bArr2 = this.A01;
                    int i = this.A04;
                    this.A04 = i + 1;
                    byte b = bArr2[i] & 255;
                    if (b > 32) {
                        int A012 = bcg.A01(b);
                        if (A012 < 0) {
                            if (b == 34) {
                                bArr = A19.A05();
                                break;
                            }
                            A012 = A17(bcg, b, 0);
                            if (A012 < 0) {
                            }
                        }
                        if (this.A04 >= this.A03) {
                            A1B();
                        }
                        byte[] bArr3 = this.A01;
                        int i2 = this.A04;
                        this.A04 = i2 + 1;
                        byte b2 = bArr3[i2] & 255;
                        int A013 = bcg.A01(b2);
                        if (A013 < 0) {
                            A013 = A17(bcg, b2, 1);
                        }
                        int i3 = (A012 << 6) | A013;
                        if (this.A04 >= this.A03) {
                            A1B();
                        }
                        byte[] bArr4 = this.A01;
                        int i4 = this.A04;
                        this.A04 = i4 + 1;
                        byte b3 = bArr4[i4] & 255;
                        int A014 = bcg.A01(b3);
                        if (A014 < 0) {
                            if (A014 != -2) {
                                if (b3 == 34 && !bcg.A03) {
                                    A19.A02(i3 >> 4);
                                    bArr = A19.A05();
                                    break;
                                }
                                A014 = A17(bcg, b3, 2);
                            }
                            if (A014 == -2) {
                                if (this.A04 >= this.A03) {
                                    A1B();
                                }
                                byte[] bArr5 = this.A01;
                                int i5 = this.A04;
                                this.A04 = i5 + 1;
                                char c = bArr5[i5] & 255;
                                char c2 = bcg.A01;
                                boolean z = false;
                                if (c == c2) {
                                    z = true;
                                }
                                if (z) {
                                    A19.A02(i3 >> 4);
                                } else {
                                    throw C13060hp.A03(bcg, c, 3, AnonymousClass000.A03("expected padding character '", c2, "'"));
                                }
                            }
                        }
                        int i6 = (i3 << 6) | A014;
                        if (this.A04 >= this.A03) {
                            A1B();
                        }
                        byte[] bArr6 = this.A01;
                        int i7 = this.A04;
                        this.A04 = i7 + 1;
                        byte b4 = bArr6[i7] & 255;
                        int A015 = bcg.A01(b4);
                        if (A015 < 0) {
                            if (A015 != -2) {
                                if (b4 == 34 && !bcg.A03) {
                                    A19.A04(i6 >> 2);
                                    bArr = A19.A05();
                                    break;
                                }
                                A015 = A17(bcg, b4, 3);
                            }
                            if (A015 == -2) {
                                A19.A04(i6 >> 2);
                            }
                        }
                        A19.A03((i6 << 6) | A015);
                    }
                }
                this.A0L = bArr;
                this.A00 = false;
            } catch (IllegalArgumentException e) {
                throw A0K("Failed to decode VALUE_STRING as base64 (" + bcg + "): " + e.getMessage());
            }
        } else if (this.A0L == null) {
            BZR A192 = A19();
            A14(A0t(), A192, bcg);
            this.A0L = A192.A05();
        }
        return this.A0L;
    }

    public final char[] A0w() {
        C13120hv r2 = this.A00;
        if (r2 == null) {
            return null;
        }
        int i = C13700j5.A00[r2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (!(i == 3 || i == 4)) {
                    return r2.A02;
                }
            } else if (this.A00) {
                this.A00 = false;
                A1O();
            }
            return this.A0N.A0F();
        }
        if (!this.A0G) {
            String str = this.A0D.A02;
            int length = str.length();
            char[] cArr = this.A0M;
            if (cArr == null) {
                C13030hm r22 = this.A0O;
                C13030hm.A00(r22.A03);
                char[] A012 = r22.A05.A01(Constants.A0N, length);
                r22.A03 = A012;
                this.A0M = A012;
            } else if (cArr.length < length) {
                this.A0M = new char[length];
            }
            str.getChars(0, length, this.A0M, 0);
            this.A0G = true;
        }
        return this.A0M;
    }

    public final char A15() {
        int i;
        if (this.A04 >= this.A03 && !A1I()) {
            A13(" in character escape sequence");
        }
        byte[] bArr = this.A01;
        int i2 = this.A04;
        this.A04 = i2 + 1;
        byte b = bArr[i2];
        if (!(b == 34 || b == 47 || b == 92)) {
            if (b == 98) {
                return 8;
            }
            if (b == 102) {
                return 12;
            }
            if (b == 110) {
                return 10;
            }
            if (b == 114) {
                return 13;
            }
            if (b == 116) {
                return 9;
            }
            if (b != 117) {
                char A1J = (char) A1J(b);
                A0y(A1J);
                return A1J;
            }
            b = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                if (this.A04 >= this.A03 && !A1I()) {
                    A13(" in character escape sequence");
                }
                byte[] bArr2 = this.A01;
                int i4 = this.A04;
                this.A04 = i4 + 1;
                byte b2 = bArr2[i4];
                if (b2 > Byte.MAX_VALUE) {
                    i = -1;
                } else {
                    i = C13180i1.A00[b2];
                }
                if (i < 0) {
                    A10(b2, "expected a hex-digit for character escape sequence");
                }
                b = (b << 4) | i;
            }
        }
        return (char) b;
    }

    public final void A1E() {
        InputStream inputStream = this.A04;
        if (inputStream != null) {
            if (this.A0O.A07 || A0Q(Constants.ZERO)) {
                inputStream.close();
            }
            this.A04 = null;
        }
    }

    public final boolean A1I() {
        long j = this.A0I;
        int i = this.A03;
        this.A0I = j + ((long) i);
        this.A02 -= i;
        InputStream inputStream = this.A04;
        if (inputStream != null) {
            byte[] bArr = this.A01;
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read > 0) {
                this.A04 = 0;
                this.A03 = read;
                return true;
            }
            A1E();
            if (read == 0) {
                throw new IOException(AnonymousClass000.A06("InputStream.read() returned 0 characters when trying to read ", this.A01.length, " bytes"));
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    public final int A1J(int i) {
        char c;
        int A012;
        if (i >= 0) {
            return i;
        }
        if ((i & 224) == 192) {
            i &= 31;
        } else {
            if ((i & 240) == 224) {
                i &= 15;
                c = 2;
            } else if ((i & 248) == 240) {
                i &= 7;
                c = 3;
            } else {
                A12(AnonymousClass000.A0E("Invalid UTF-8 start byte 0x", Integer.toHexString(i & 255)));
            }
            A012 = A01();
            if ((A012 & 192) != 128) {
                A1R(A012 & 255);
            }
            int i2 = (i << 6) | (A012 & 63);
            if (c > 1) {
                return i2;
            }
            int A013 = A01();
            if ((A013 & 192) != 128) {
                A1R(A013 & 255);
            }
            int i3 = (i2 << 6) | (A013 & 63);
            if (c <= 2) {
                return i3;
            }
            int A014 = A01();
            if ((A014 & 192) != 128) {
                A1R(A014 & 255);
            }
            return (i3 << 6) | (A014 & 63);
        }
        c = 1;
        A012 = A01();
        if ((A012 & 192) != 128) {
        }
        int i22 = (i << 6) | (A012 & 63);
        if (c > 1) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ab A[SYNTHETIC] */
    public final C13120hv A1K(int i) {
        int i2;
        String str;
        String str2;
        double d;
        if (i != 39) {
            if (i != 43) {
                if (i == 73) {
                    str2 = "Infinity";
                    A1T(str2, 1);
                    if (A0Q(Constants.A12)) {
                        d = Double.POSITIVE_INFINITY;
                    } else {
                        str = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
                        A12(str);
                    }
                } else if (i == 78) {
                    str2 = "NaN";
                    A1T(str2, 1);
                    if (A0Q(Constants.A12)) {
                        d = Double.NaN;
                    } else {
                        str = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
                        A12(str);
                    }
                }
                return A18(str2, d);
            }
            if (this.A04 >= this.A03 && !A1I()) {
                A13(" in a value");
            }
            byte[] bArr = this.A01;
            int i3 = this.A04;
            this.A04 = i3 + 1;
            return A1M(bArr[i3] & 255, false);
        } else if (A0Q(Constants.A0N)) {
            char[] A0B = this.A0N.A0B();
            int[] iArr = A08;
            byte[] bArr2 = this.A01;
            int i4 = 0;
            while (true) {
                if (this.A04 >= this.A03) {
                    A1B();
                }
                if (i4 >= A0B.length) {
                    A0B = this.A0N.A0D();
                    i4 = 0;
                }
                int i5 = this.A03;
                int i6 = i5;
                int i7 = this.A04;
                int length = A0B.length;
                int i8 = i7 + (length - i4);
                if (i8 < i5) {
                    i5 = i8;
                }
                while (true) {
                    int i9 = this.A04;
                    if (i9 >= i5) {
                        break;
                    }
                    int i10 = i9 + 1;
                    this.A04 = i10;
                    i2 = bArr2[i9] & 255;
                    if (i2 != 39 && iArr[i2] == 0) {
                        A0B[i4] = (char) i2;
                        i4++;
                    } else if (i2 != 39) {
                        this.A0N.A00 = i4;
                        return C13120hv.VALUE_STRING;
                    } else {
                        int i11 = iArr[i2];
                        if (i11 != 1) {
                            if (i11 == 2) {
                                i2 = A02(i2);
                            } else if (i11 == 3) {
                                i2 = i6 - i10 >= 2 ? A06(i2) : A05(i2);
                            } else if (i11 != 4) {
                                if (i2 < 32) {
                                    A11(i2, "string value");
                                }
                                A1Q(i2);
                            } else {
                                int A072 = A07(i2);
                                int i12 = i4 + 1;
                                A0B[i4] = (char) (55296 | (A072 >> 10));
                                if (i12 >= length) {
                                    A0B = this.A0N.A0D();
                                    i12 = 0;
                                }
                                i2 = 56320 | (A072 & 1023);
                                i4 = i12;
                            }
                        } else if (i2 != 34) {
                            i2 = A15();
                        }
                        if (i4 >= A0B.length) {
                            A0B = this.A0N.A0D();
                            i4 = 0;
                        }
                        A0B[i4] = (char) i2;
                        i4++;
                    }
                }
                if (i2 != 39) {
                }
            }
        }
        A10(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0091, code lost:
        if (r11 == 46) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        if (r11 == 101) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0099, code lost:
        if (r11 == 69) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009b, code lost:
        r14.A04 = r1 - 1;
     */
    public final C13120hv A1L(byte b) {
        int i;
        byte b2;
        int i2;
        char[] A0B = this.A0N.A0B();
        boolean z = false;
        if (b == 45) {
            z = true;
        }
        if (z) {
            A0B[0] = '-';
            if (this.A04 >= this.A03) {
                A1B();
            }
            byte[] bArr = this.A01;
            int i3 = this.A04;
            this.A04 = i3 + 1;
            b = bArr[i3] & 255;
            if (b < 48 || b > 57) {
                return A1M(b, true);
            }
            i = 1;
        } else {
            i = 0;
        }
        if (b == 48) {
            if ((this.A04 < this.A03 || A1I()) && (b = this.A01[this.A04] & 255) >= 48 && b <= 57) {
                if (!A0Q(Constants.A0u)) {
                    A12(AnonymousClass000.A0E("Invalid numeric value: ", "Leading zeroes not allowed"));
                }
                this.A04++;
                if (b == 48) {
                    while (true) {
                        if (this.A04 >= this.A03 && !A1I()) {
                            break;
                        }
                        byte[] bArr2 = this.A01;
                        int i4 = this.A04;
                        b = bArr2[i4] & 255;
                        if (b < 48 || b > 57) {
                            break;
                        }
                        this.A04 = i4 + 1;
                        if (b != 48) {
                            break;
                        }
                    }
                }
            }
            b = 48;
        }
        int i5 = i + 1;
        A0B[i] = (char) b;
        int length = this.A04 + A0B.length;
        int i6 = this.A03;
        if (length > i6) {
            length = i6;
        }
        int i7 = 1;
        while (true) {
            int i8 = this.A04;
            if (i8 >= length) {
                while (true) {
                    if (this.A04 >= this.A03 && !A1I()) {
                        break;
                    }
                    byte[] bArr3 = this.A01;
                    int i9 = this.A04;
                    int i10 = i9 + 1;
                    this.A04 = i10;
                    b2 = bArr3[i9] & 255;
                    if (b2 <= 57 && b2 >= 48) {
                        if (i5 >= A0B.length) {
                            A0B = this.A0N.A0D();
                            i5 = 0;
                        }
                        A0B[i5] = (char) b2;
                        i7++;
                        i5++;
                    }
                }
                this.A0N.A00 = i5;
                this.A0H = z;
                this.A05 = i7;
                this.A06 = 0;
                return C13120hv.VALUE_NUMBER_INT;
            }
            byte[] bArr4 = this.A01;
            i2 = i8 + 1;
            this.A04 = i2;
            b2 = bArr4[i8] & 255;
            if (b2 >= 48 && b2 <= 57) {
                i7++;
                if (i5 >= A0B.length) {
                    A0B = this.A0N.A0D();
                    i5 = 0;
                }
                A0B[i5] = (char) b2;
                i5++;
            }
        }
        if (!(b2 == 46 || b2 == 101 || b2 == 69)) {
            this.A04 = i2 - 1;
            this.A0N.A00 = i5;
            this.A0H = z;
            this.A05 = i7;
            this.A06 = 0;
            return C13120hv.VALUE_NUMBER_INT;
        }
        return A08(A0B, i5, b2, z, i7);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r4v0 ?, r4v1 ?, r4v2 ?, r4v3 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final p000X.C13120hv A1M(
/*
Method generation error in method: X.0hw.A1M(int, boolean):X.0hv, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1507)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    public final C13020hl A1N(int[] iArr, int i, int i2, int i3, int i4) {
        int[] iArr2 = A07;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    A11(i3, "name");
                } else {
                    i3 = A15();
                }
                if (i3 > 127) {
                    if (r10 >= 4) {
                        int length = iArr.length;
                        if (i >= length) {
                            iArr = A0F(iArr, length);
                            this.A02 = iArr;
                        }
                        iArr[i] = r8;
                        i++;
                        r8 = 0;
                        r10 = 0;
                    }
                    if (i3 < 2048) {
                        r8 = (r8 << 8) | (i3 >> 6) | 192;
                        r10++;
                    } else {
                        int i5 = (r8 << 8) | (i3 >> 12) | 224;
                        int i6 = r10 + 1;
                        if (i6 >= 4) {
                            int length2 = iArr.length;
                            if (i >= length2) {
                                iArr = A0F(iArr, length2);
                                this.A02 = iArr;
                            }
                            iArr[i] = i5;
                            i++;
                            i5 = 0;
                            i6 = 0;
                        }
                        r8 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        r10 = i6 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i4 = r10 + 1;
                i2 = (r8 << 8) | i3;
            } else {
                int length3 = iArr.length;
                if (i >= length3) {
                    iArr = A0F(iArr, length3);
                    this.A02 = iArr;
                }
                iArr[i] = r8;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.A04 >= this.A03 && !A1I()) {
                A13(" in field name");
            }
            byte[] bArr = this.A01;
            int i7 = this.A04;
            this.A04 = i7 + 1;
            i3 = bArr[i7] & 255;
        }
        if (r10 > 0) {
            int length4 = iArr.length;
            if (i >= length4) {
                iArr = A0F(iArr, length4);
                this.A02 = iArr;
            }
            iArr[i] = r8;
            i++;
        }
        C13020hl A022 = this.A06.A02(iArr, i);
        if (A022 == null) {
            return A0A(iArr, i, r10);
        }
        return A022;
    }

    public final void A1O() {
        int i = this.A04;
        if (i >= this.A03) {
            A1B();
            i = this.A04;
        }
        int i2 = 0;
        char[] A0B = this.A0N.A0B();
        int[] iArr = A08;
        int min = Math.min(this.A03, A0B.length + i);
        byte[] bArr = this.A01;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (iArr[b] == 0) {
                i++;
                A0B[i2] = (char) b;
                i2++;
            } else if (b == 34) {
                this.A04 = i + 1;
            }
        }
        this.A04 = i;
        while (true) {
            int i3 = this.A04;
            if (i3 >= this.A03) {
                A1B();
                i3 = this.A04;
            }
            if (i2 >= A0B.length) {
                A0B = this.A0N.A0D();
                i2 = 0;
            }
            int i4 = this.A03;
            int length = A0B.length;
            int min2 = Math.min(i4, (length - i2) + i3);
            while (true) {
                if (i3 >= min2) {
                    this.A04 = i3;
                    break;
                }
                int i5 = i3 + 1;
                int i6 = bArr[i3] & 255;
                int i7 = iArr[i6];
                if (i7 != 0) {
                    this.A04 = i5;
                    if (i6 == 34) {
                        break;
                    }
                    if (i7 == 1) {
                        i6 = A15();
                    } else if (i7 == 2) {
                        i6 = A02(i6);
                    } else if (i7 == 3) {
                        i6 = i4 - i5 >= 2 ? A06(i6) : A05(i6);
                    } else if (i7 == 4) {
                        int A072 = A07(i6);
                        int i8 = i2 + 1;
                        A0B[i2] = (char) (55296 | (A072 >> 10));
                        if (i8 >= length) {
                            A0B = this.A0N.A0D();
                            i8 = 0;
                        }
                        i6 = (A072 & 1023) | 56320;
                        i2 = i8;
                    } else if (i6 < 32) {
                        A11(i6, "string value");
                    } else {
                        A1Q(i6);
                    }
                    if (i2 >= A0B.length) {
                        A0B = this.A0N.A0D();
                        i2 = 0;
                    }
                    A0B[i2] = (char) i6;
                    i2++;
                } else {
                    A0B[i2] = (char) i6;
                    i3 = i5;
                    i2++;
                }
            }
        }
        this.A0N.A00 = i2;
    }

    public final void A1P() {
        if (this.A04 < this.A03 || A1I()) {
            byte[] bArr = this.A01;
            int i = this.A04;
            if (bArr[i] == 10) {
                this.A04 = i + 1;
            }
        }
        this.A01++;
        this.A02 = this.A04;
    }

    public final void A1Q(int i) {
        if (i < 32) {
            A0z(i);
        }
        A12(AnonymousClass000.A0E("Invalid UTF-8 start byte 0x", Integer.toHexString(i)));
    }

    public final void A1R(int i) {
        A12(AnonymousClass000.A0E("Invalid UTF-8 middle byte 0x", Integer.toHexString(i)));
    }

    public final void A1S(String str) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.A04 >= this.A03 && !A1I()) {
                break;
            }
            byte[] bArr = this.A01;
            int i = this.A04;
            this.A04 = i + 1;
            char A1J = (char) A1J(bArr[i]);
            if (!Character.isJavaIdentifierPart(A1J)) {
                break;
            }
            sb.append(A1J);
        }
        A12(AnonymousClass000.A0N("Unrecognized token '", sb.toString(), "': was expecting ", "'null', 'true', 'false' or NaN"));
    }

    public C13130hw(C13030hm r2, int i, InputStream inputStream, C3U c3u, C13000hj r6, byte[] bArr, int i2, int i3, boolean z) {
        super(r2, i);
        this.A04 = inputStream;
        this.A03 = c3u;
        this.A06 = r6;
        this.A01 = bArr;
        this.A04 = i2;
        this.A03 = i3;
        this.A05 = z;
    }

    public final void A1A() {
        byte[] bArr;
        super.A1A();
        if (this.A05 && (bArr = this.A01) != null) {
            this.A01 = null;
            this.A0O.A02(bArr);
        }
    }

    public final void A1T(String str, int i) {
        int i2;
        byte b;
        int length = str.length();
        do {
            if ((this.A04 >= this.A03 && !A1I()) || this.A01[this.A04] != str.charAt(i)) {
                A1S(str.substring(0, i));
            }
            i2 = this.A04 + 1;
            this.A04 = i2;
            i++;
        } while (i < length);
        if ((i2 < this.A03 || A1I()) && (b = this.A01[this.A04] & 255) >= 48 && b != 93 && b != 125 && Character.isJavaIdentifierPart((char) A1J(b))) {
            A1S(str.substring(0, i));
        }
    }

    public final void close() {
        super.close();
        C13000hj r4 = this.A06;
        C13000hj r5 = r4.A0C;
        if (r5 != null && (!r4.A06)) {
            C13010hk r2 = new C13010hk(r4);
            int i = r2.A02;
            C13010hk r3 = (C13010hk) r5.A0D.get();
            if (i > r3.A02) {
                if (i > 6000 || r2.A03 > 63) {
                    r2 = new C13010hk(new int[64], new C13020hl[64]);
                }
                r5.A0D.compareAndSet(r3, r2);
            }
            r4.A06 = true;
            r4.A07 = true;
            r4.A05 = true;
        }
    }
}
