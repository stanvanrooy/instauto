package p000X;

import java.io.IOException;
import java.io.Reader;

/* renamed from: X.0ho  reason: invalid class name and case insensitive filesystem */
public final class C13050ho extends C13060hp {
    public boolean A00 = false;
    public char[] A01;
    public C3U A02;
    public Reader A03;
    public final int A04;
    public final C12980hh A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v86, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: char} */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0462, code lost:
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x062e, code lost:
        if (r2 == '\"') goto L_0x0630;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0491  */
    public final C13120hv A0p() {
        int i;
        C13120hv r0;
        char[] A0B;
        int i2;
        int i3;
        int i4;
        char A1J;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        char A1J2;
        char c;
        int i10;
        int i11;
        char[] cArr;
        int i12;
        char c2;
        int i13;
        int i14;
        int i15;
        String str;
        String str2;
        double d;
        int i16;
        int i17;
        char[] cArr2;
        int i18;
        String A012;
        boolean isJavaIdentifierPart;
        int i19;
        C13100ht A032;
        this.A06 = 0;
        if (this.A00 == C13120hv.FIELD_NAME) {
            this.A0G = false;
            C13120hv r3 = this.A0C;
            this.A0C = null;
            if (r3 == C13120hv.START_ARRAY) {
                A032 = this.A0D.A02(this.A09, this.A08);
            } else {
                if (r3 == C13120hv.START_OBJECT) {
                    A032 = this.A0D.A03(this.A09, this.A08);
                }
                this.A00 = r3;
                return r3;
            }
            this.A0D = A032;
            this.A00 = r3;
            return r3;
        }
        if (this.A00) {
            this.A00 = false;
            int i20 = this.A04;
            int i21 = this.A03;
            char[] cArr3 = this.A01;
            while (true) {
                if (i20 >= i21) {
                    this.A04 = i20;
                    if (!A1I()) {
                        A13(": was expecting closing quote for a string value");
                    }
                    i20 = this.A04;
                    i21 = this.A03;
                }
                i19 = i20 + 1;
                char c3 = cArr3[i20];
                if (c3 <= '\\') {
                    if (c3 == '\\') {
                        this.A04 = i19;
                        A15();
                        i20 = this.A04;
                        i21 = this.A03;
                    } else if (c3 <= '\"') {
                        if (c3 == '\"') {
                            break;
                        } else if (c3 < ' ') {
                            this.A04 = i19;
                            A11(c3, "string value");
                        }
                    }
                }
                i20 = i19;
            }
            this.A04 = i19;
        }
        while (true) {
            if (this.A04 >= this.A03 && !A1I()) {
                A0x();
                i = -1;
                break;
            }
            char[] cArr4 = this.A01;
            int i22 = this.A04;
            int i23 = i22 + 1;
            this.A04 = i23;
            char c4 = cArr4[i22];
            if (c4 > ' ') {
                if (c4 != '/') {
                    i = c4;
                    break;
                }
                A02();
            } else if (c4 != ' ') {
                if (c4 == 10) {
                    this.A01++;
                    this.A02 = i23;
                } else if (c4 == 13) {
                    A1M();
                } else if (c4 != 9) {
                    A0z(c4);
                }
            }
        }
        if (i < 0) {
            close();
            this.A00 = null;
            return null;
        }
        long j = this.A0I;
        int i24 = this.A04;
        this.A0B = (j + ((long) i24)) - 1;
        this.A09 = this.A01;
        this.A08 = (i24 - this.A02) - 1;
        this.A0L = null;
        if (i == 93) {
            boolean z2 = true;
            if (this.A0D.A01 != 1) {
                z2 = false;
            }
            if (!z2) {
                A1G(i, '}');
            }
            this.A0D = this.A0D.A04;
            r0 = C13120hv.END_ARRAY;
        } else if (i == 125) {
            if (!this.A0D.A01()) {
                A1G(i, ']');
            }
            this.A0D = this.A0D.A04;
            r0 = C13120hv.END_OBJECT;
        } else {
            C13100ht r4 = this.A0D;
            boolean z3 = true;
            int i25 = r4.A00 + 1;
            r4.A00 = i25;
            if (r4.A01 == 0 || i25 <= 0) {
                z3 = false;
            }
            if (z3) {
                if (i != 44) {
                    A10(i, AnonymousClass000.A0J("was expecting comma to separate ", r4.A00(), " entries"));
                }
                i = A00();
            }
            boolean A013 = this.A0D.A01();
            int i26 = i;
            if (A013) {
                if (i == 34) {
                    i16 = this.A04;
                    i17 = i16;
                    i18 = this.A04;
                    int i27 = this.A03;
                    if (i16 < i27) {
                        int[] iArr = C13180i1.A01;
                        int length = iArr.length;
                        while (true) {
                            cArr2 = this.A01;
                            char c5 = cArr2[i16];
                            if (c5 >= length || iArr[c5] == 0) {
                                i18 = (i18 * 33) + c5;
                                i16++;
                                if (i16 >= i27) {
                                    break;
                                }
                            }
                        }
                    }
                    this.A04 = i16;
                    A012 = A01(i17, i18, 34);
                } else if (i != 39 || !A0Q(Constants.A0N)) {
                    if (!A0Q(Constants.A0C)) {
                        A10(i, "was expecting double-quote to start field name");
                    }
                    int[] iArr2 = C13180i1.A03;
                    int length2 = iArr2.length;
                    if (i >= length2) {
                        isJavaIdentifierPart = Character.isJavaIdentifierPart((char) i);
                    } else if (iArr2[i] != 0 || (i >= 48 && i <= 57)) {
                        isJavaIdentifierPart = false;
                    } else {
                        isJavaIdentifierPart = true;
                    }
                    if (!isJavaIdentifierPart) {
                        A10(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                    }
                    int i28 = this.A04;
                    int i29 = this.A04;
                    int i30 = this.A03;
                    if (i28 < i30) {
                        while (true) {
                            char[] cArr5 = this.A01;
                            char c6 = cArr5[i28];
                            if (c6 >= length2) {
                                if (!Character.isJavaIdentifierPart((char) c6)) {
                                    int i31 = this.A04 - 1;
                                    this.A04 = i28;
                                    A012 = this.A05.A01(this.A01, i31, i28 - i31, i29);
                                    break;
                                }
                            } else if (iArr2[c6] != 0) {
                                int i32 = this.A04 - 1;
                                this.A04 = i28;
                                A012 = this.A05.A01(cArr5, i32, i28 - i32, i29);
                                break;
                            }
                            i29 = (i29 * 33) + c6;
                            i28++;
                            if (i28 >= i30) {
                                break;
                            }
                        }
                    } else {
                        int i33 = this.A04 - 1;
                        this.A04 = i28;
                        this.A0N.A09(this.A01, i33, i28 - i33);
                        char[] A0E = this.A0N.A0E();
                        int i34 = this.A0N.A00;
                        int length3 = iArr2.length;
                        while (true) {
                            if (this.A04 >= this.A03 && !A1I()) {
                                break;
                            }
                            char c7 = this.A01[this.A04];
                            if (c7 > length3) {
                                if (!Character.isJavaIdentifierPart(c7)) {
                                    break;
                                }
                            } else if (iArr2[c7] != 0) {
                                break;
                            }
                            this.A04++;
                            i29 = (i29 * 33) + c7;
                            int i35 = i34 + 1;
                            A0E[i34] = c7;
                            if (i35 >= A0E.length) {
                                A0E = this.A0N.A0D();
                                i34 = 0;
                            } else {
                                i34 = i35;
                            }
                        }
                        C13090hs r02 = this.A0N;
                        r02.A00 = i34;
                        char[] A0F = r02.A0F();
                        int i36 = r02.A02;
                        if (i36 < 0) {
                            i36 = 0;
                        }
                        A012 = this.A05.A01(A0F, i36, r02.A04(), i29);
                    }
                } else {
                    i16 = this.A04;
                    i17 = i16;
                    i18 = this.A04;
                    int i37 = this.A03;
                    if (i16 < i37) {
                        int[] iArr3 = C13180i1.A01;
                        int length4 = iArr3.length;
                        while (true) {
                            cArr2 = this.A01;
                            char c8 = cArr2[i16];
                            if (c8 != '\'') {
                                if (c8 < length4 && iArr3[c8] != 0) {
                                    break;
                                }
                                i18 = (i18 * 33) + c8;
                                i16++;
                                if (i16 >= i37) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        this.A04 = i16 + 1;
                        A012 = this.A05.A01(cArr2, i17, i16 - i17, i18);
                    }
                    this.A04 = i16;
                    A012 = A01(i17, i18, 39);
                }
                this.A0D.A02 = A012;
                this.A00 = C13120hv.FIELD_NAME;
                int A002 = A00();
                if (A002 != 58) {
                    A10(A002, "was expecting a colon to separate field name and value");
                }
                i26 = A00();
            }
            if (i26 != 34) {
                if (i26 != 45) {
                    if (i26 != 91) {
                        if (i26 != 93) {
                            if (i26 == 102) {
                                A1O("false", 1);
                                r0 = C13120hv.VALUE_FALSE;
                            } else if (i26 != 110) {
                                if (i26 != 116) {
                                    if (i26 != 123) {
                                        if (i26 != 125) {
                                            switch (i26) {
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
                                                    if (i26 != 39) {
                                                        if (i26 == 43) {
                                                            if (this.A04 >= this.A03 && !A1I()) {
                                                                A13(" in a value");
                                                            }
                                                            char[] cArr6 = this.A01;
                                                            int i38 = this.A04;
                                                            this.A04 = i38 + 1;
                                                            r0 = A1K(cArr6[i38], false);
                                                            break;
                                                        } else {
                                                            if (i26 == 73) {
                                                                str2 = "Infinity";
                                                                A1O(str2, 1);
                                                                if (A0Q(Constants.A12)) {
                                                                    d = Double.POSITIVE_INFINITY;
                                                                } else {
                                                                    str = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
                                                                    A12(str);
                                                                }
                                                            } else if (i26 == 78) {
                                                                str2 = "NaN";
                                                                A1O(str2, 1);
                                                                if (A0Q(Constants.A12)) {
                                                                    d = Double.NaN;
                                                                } else {
                                                                    str = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
                                                                    A12(str);
                                                                }
                                                            }
                                                            r0 = A18(str2, d);
                                                            break;
                                                        }
                                                    } else if (A0Q(Constants.A0N)) {
                                                        char[] A0B2 = this.A0N.A0B();
                                                        int i39 = this.A0N.A00;
                                                        while (true) {
                                                            if (this.A04 >= this.A03 && !A1I()) {
                                                                A13(": was expecting closing quote for a string value");
                                                            }
                                                            char[] cArr7 = this.A01;
                                                            int i40 = this.A04;
                                                            this.A04 = i40 + 1;
                                                            char c9 = cArr7[i40];
                                                            if (c9 <= '\\') {
                                                                if (c9 == '\\') {
                                                                    c9 = A15();
                                                                } else if (c9 <= '\'') {
                                                                    if (c9 == '\'') {
                                                                        this.A0N.A00 = i39;
                                                                        break;
                                                                    } else if (c9 < ' ') {
                                                                        A11(c9, "string value");
                                                                    }
                                                                }
                                                            }
                                                            if (i39 >= A0B2.length) {
                                                                A0B2 = this.A0N.A0D();
                                                                i39 = 0;
                                                            }
                                                            A0B2[i39] = c9;
                                                            i39++;
                                                        }
                                                    }
                                                    A10(i26, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
                                                    r0 = null;
                                                    break;
                                            }
                                        }
                                    } else {
                                        if (!A013) {
                                            this.A0D = this.A0D.A03(this.A09, this.A08);
                                        }
                                        r0 = C13120hv.START_OBJECT;
                                    }
                                }
                                A1O("true", 1);
                                r0 = C13120hv.VALUE_TRUE;
                            } else {
                                A1O("null", 1);
                                r0 = C13120hv.VALUE_NULL;
                            }
                        }
                        A10(i26, "expected a value");
                        A1O("true", 1);
                        r0 = C13120hv.VALUE_TRUE;
                    } else {
                        if (!A013) {
                            this.A0D = this.A0D.A02(this.A09, this.A08);
                        }
                        r0 = C13120hv.START_ARRAY;
                    }
                }
                int i41 = 0;
                int i42 = 1;
                boolean z4 = false;
                if (i26 == 45) {
                    z4 = true;
                }
                int i43 = this.A04;
                int i44 = i43 - 1;
                int i45 = this.A03;
                int i46 = i26;
                if (z4) {
                    if (i43 < i45) {
                        int i47 = i43 + 1;
                        char c10 = this.A01[i43];
                        if (c10 > '9' || c10 < '0') {
                            this.A04 = i47;
                            r0 = A1K(c10, true);
                        } else {
                            i43 = i47;
                            i46 = c10;
                        }
                    }
                    if (z4) {
                        i44++;
                    }
                    this.A04 = i44;
                    A0B = this.A0N.A0B();
                    i2 = 0;
                    if (!z4) {
                        A0B[0] = '-';
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    i4 = this.A04;
                    if (i4 >= this.A03) {
                        char[] cArr8 = this.A01;
                        this.A04 = i4 + 1;
                        A1J = cArr8[i4];
                    } else {
                        A1J = A1J("No digit following minus sign");
                    }
                    if (A1J == '0') {
                        if ((this.A04 < this.A03 || A1I()) && (A1J = this.A01[this.A04]) >= '0' && A1J <= '9') {
                            if (!A0Q(Constants.A0u)) {
                                A12(AnonymousClass000.A0E("Invalid numeric value: ", "Leading zeroes not allowed"));
                            }
                            this.A04++;
                            if (A1J == '0') {
                                while (true) {
                                    if (this.A04 < this.A03 || A1I()) {
                                        char[] cArr9 = this.A01;
                                        int i48 = this.A04;
                                        A1J = cArr9[i48];
                                        if (A1J >= '0' && A1J <= '9') {
                                            this.A04 = i48 + 1;
                                            if (A1J != '0') {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        A1J = '0';
                    }
                    i5 = 0;
                    while (true) {
                        if (A1J >= '0' || A1J > '9') {
                            z = false;
                        } else {
                            i5++;
                            if (i3 >= A0B.length) {
                                A0B = this.A0N.A0D();
                                i3 = 0;
                            }
                            i11 = i3 + 1;
                            A0B[i3] = A1J;
                            if (this.A04 < this.A03 || A1I()) {
                                char[] cArr10 = this.A01;
                                int i49 = this.A04;
                                this.A04 = i49 + 1;
                                A1J = cArr10[i49];
                                i3 = i11;
                            } else {
                                i3 = i11;
                                A1J = 0;
                                z = true;
                            }
                        }
                    }
                    z = false;
                    if (i5 == 0) {
                        A12(AnonymousClass000.A0E("Invalid numeric value: ", AnonymousClass000.A0J("Missing integer part (next char ", C13070hq.A04(A1J), ")")));
                    }
                    if (A1J != '.') {
                        int i50 = i3 + 1;
                        A0B[i3] = A1J;
                        i6 = 0;
                        while (true) {
                            if (this.A04 < this.A03 || A1I()) {
                                char[] cArr11 = this.A01;
                                int i51 = this.A04;
                                this.A04 = i51 + 1;
                                A1J = cArr11[i51];
                                if (A1J >= '0' && A1J <= '9') {
                                    i6++;
                                    if (i50 >= A0B.length) {
                                        A0B = this.A0N.A0D();
                                        i50 = 0;
                                    }
                                    A0B[i50] = A1J;
                                    i50++;
                                }
                            } else {
                                z = true;
                            }
                        }
                        if (i6 == 0) {
                            A1H(A1J, "Decimal point not followed by a digit");
                        }
                        i3 = i50;
                    } else {
                        i6 = 0;
                    }
                    if (A1J == 'e' || A1J == 'E') {
                        if (i7 >= A0B.length) {
                            A0B = this.A0N.A0D();
                            i7 = 0;
                        }
                        i8 = i7 + 1;
                        A0B[i7] = A1J;
                        i9 = this.A04;
                        if (i9 >= this.A03) {
                            char[] cArr12 = this.A01;
                            this.A04 = i9 + 1;
                            A1J2 = cArr12[i9];
                        } else {
                            A1J2 = A1J("expected a digit for number exponent");
                        }
                        if (c == '-' || c == '+') {
                            if (i8 >= A0B.length) {
                                A0B = this.A0N.A0D();
                                i8 = 0;
                            }
                            int i52 = i8 + 1;
                            A0B[i8] = c;
                            i10 = this.A04;
                            if (i10 >= this.A03) {
                                char[] cArr13 = this.A01;
                                this.A04 = i10 + 1;
                                c = cArr13[i10];
                            } else {
                                c = A1J("expected a digit for number exponent");
                            }
                            i8 = i52;
                        }
                        i2 = 0;
                        while (true) {
                            if (c <= '9' || c < '0') {
                                i7 = i8;
                            } else {
                                i2++;
                                if (i8 >= A0B.length) {
                                    A0B = this.A0N.A0D();
                                    i8 = 0;
                                }
                                i7 = i8 + 1;
                                A0B[i8] = c;
                                if (this.A04 < this.A03 || A1I()) {
                                    char[] cArr14 = this.A01;
                                    int i53 = this.A04;
                                    this.A04 = i53 + 1;
                                    c = cArr14[i53];
                                    i8 = i7;
                                } else {
                                    z = true;
                                }
                            }
                        }
                        i7 = i8;
                        if (i2 == 0) {
                            A1H(c, "Exponent indicator not followed by a digit");
                        }
                    }
                    if (!z) {
                        this.A04--;
                    }
                    this.A0N.A00 = i7;
                    if (i6 < 1 || i2 >= 1) {
                        this.A0H = z4;
                        this.A05 = i5;
                        this.A06 = 0;
                        r0 = C13120hv.VALUE_NUMBER_FLOAT;
                    } else {
                        this.A0H = z4;
                        this.A05 = i5;
                        this.A06 = 0;
                        r0 = C13120hv.VALUE_NUMBER_INT;
                    }
                }
                if (i46 != 48) {
                    while (true) {
                        if (i43 < i45) {
                            cArr = this.A01;
                            i12 = i43 + 1;
                            c2 = cArr[i43];
                            if (c2 >= '0' && c2 <= '9') {
                                i42++;
                                i43 = i12;
                            }
                        }
                    }
                    if (c2 == '.') {
                        i13 = 0;
                        while (true) {
                            if (i12 < i45) {
                                int i54 = i12 + 1;
                                c2 = cArr[i12];
                                if (c2 >= '0' && c2 <= '9') {
                                    i13++;
                                    i12 = i54;
                                } else if (i13 == 0) {
                                    A1H(c2, "Decimal point not followed by a digit");
                                }
                            }
                        }
                    } else {
                        i13 = 0;
                    }
                    if (c2 == 'e' || c2 == 'E') {
                        if (i14 < i45) {
                            char[] cArr15 = this.A01;
                            int i55 = i14 + 1;
                            char c11 = cArr15[i14];
                            if (c11 != '-' && c11 != '+') {
                                i14 = i55;
                            } else if (i55 < i45) {
                                i15 = i55 + 1;
                                c11 = cArr15[i55];
                                i14 = i15;
                            }
                            if (c11 > '9' && c11 >= '0') {
                                i41++;
                                if (i14 < i45) {
                                    i15 = i14 + 1;
                                    c11 = cArr15[i14];
                                    i14 = i15;
                                    if (c11 > '9') {
                                    }
                                    if (i41 == 0) {
                                    }
                                }
                            } else if (i41 == 0) {
                                A1H(c11, "Exponent indicator not followed by a digit");
                            }
                        }
                    }
                    int i56 = i14 - 1;
                    this.A04 = i56;
                    this.A0N.A09(this.A01, i44, i56 - i44);
                    if (i13 >= 1 || i41 >= 1) {
                        this.A0H = z4;
                        this.A05 = i42;
                        this.A06 = 0;
                        r0 = C13120hv.VALUE_NUMBER_FLOAT;
                    } else {
                        this.A0H = z4;
                        this.A05 = i42;
                        this.A06 = 0;
                        r0 = C13120hv.VALUE_NUMBER_INT;
                    }
                }
                if (z4) {
                }
                this.A04 = i44;
                A0B = this.A0N.A0B();
                i2 = 0;
                if (!z4) {
                }
                i4 = this.A04;
                if (i4 >= this.A03) {
                }
                if (A1J == '0') {
                }
                i5 = 0;
                while (true) {
                    if (A1J >= '0') {
                    }
                    char[] cArr102 = this.A01;
                    int i492 = this.A04;
                    this.A04 = i492 + 1;
                    A1J = cArr102[i492];
                    i3 = i11;
                }
                z = false;
                if (i5 == 0) {
                }
                if (A1J != '.') {
                }
                if (i7 >= A0B.length) {
                }
                i8 = i7 + 1;
                A0B[i7] = A1J;
                i9 = this.A04;
                if (i9 >= this.A03) {
                }
                if (i8 >= A0B.length) {
                }
                int i522 = i8 + 1;
                A0B[i8] = c;
                i10 = this.A04;
                if (i10 >= this.A03) {
                }
                i8 = i522;
                i2 = 0;
                while (true) {
                    if (c <= '9') {
                    }
                    char[] cArr142 = this.A01;
                    int i532 = this.A04;
                    this.A04 = i532 + 1;
                    c = cArr142[i532];
                    i8 = i7;
                }
                i7 = i8;
                if (i2 == 0) {
                }
                if (!z) {
                }
                this.A0N.A00 = i7;
                if (i6 < 1) {
                }
                this.A0H = z4;
                this.A05 = i5;
                this.A06 = 0;
                r0 = C13120hv.VALUE_NUMBER_FLOAT;
            } else {
                this.A00 = true;
                r0 = C13120hv.VALUE_STRING;
            }
            if (A013) {
                this.A0C = r0;
                return this.A00;
            }
        }
        this.A00 = r0;
        return r0;
    }

    private int A00() {
        while (true) {
            if (this.A04 < this.A03 || A1I()) {
                char[] cArr = this.A01;
                int i = this.A04;
                int i2 = i + 1;
                this.A04 = i2;
                char c = cArr[i];
                if (c > ' ') {
                    if (c != '/') {
                        return c;
                    }
                    A02();
                } else if (c != ' ') {
                    if (c == 10) {
                        this.A01++;
                        this.A02 = i2;
                    } else if (c == 13) {
                        A1M();
                    } else if (c != 9) {
                        A0z(c);
                    }
                }
            } else {
                throw A0K(AnonymousClass000.A0J("Unexpected end-of-input within/between ", this.A0D.A00(), " entries"));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    private String A01(int i, int i2, int i3) {
        char c;
        int i4;
        this.A0N.A09(this.A01, i, this.A04 - i);
        char[] A0E = this.A0N.A0E();
        int i5 = this.A0N.A00;
        while (true) {
            if (this.A04 >= this.A03 && !A1I()) {
                A13(AnonymousClass000.A03(": was expecting closing '", (char) i3, "' for name"));
            }
            char[] cArr = this.A01;
            int i6 = this.A04;
            this.A04 = i6 + 1;
            char c2 = cArr[i6];
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    c = A15();
                    i2 = (i2 * 33) + c2;
                    i4 = i5 + 1;
                    A0E[i5] = c;
                    if (i4 < A0E.length) {
                        A0E = this.A0N.A0D();
                        i5 = 0;
                    } else {
                        i5 = i4;
                    }
                } else if (c2 <= i3) {
                    if (c2 == i3) {
                        break;
                    } else if (c2 < ' ') {
                        A11(c2, "name");
                    }
                }
            }
            c = c2;
            i2 = (i2 * 33) + c2;
            i4 = i5 + 1;
            A0E[i5] = c;
            if (i4 < A0E.length) {
            }
        }
        C13090hs r0 = this.A0N;
        r0.A00 = i5;
        char[] A0F = r0.A0F();
        int i7 = r0.A02;
        if (i7 < 0) {
            i7 = 0;
        }
        return this.A05.A01(A0F, i7, r0.A04(), i2);
    }

    private void A02() {
        if (!A0Q(Constants.ONE)) {
            A10(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.A04 >= this.A03 && !A1I()) {
            A13(" in a comment");
        }
        char[] cArr = this.A01;
        int i = this.A04;
        this.A04 = i + 1;
        char c = cArr[i];
        if (c == '/') {
            while (true) {
                if (this.A04 < this.A03 || A1I()) {
                    char[] cArr2 = this.A01;
                    int i2 = this.A04;
                    int i3 = i2 + 1;
                    this.A04 = i3;
                    char c2 = cArr2[i2];
                    if (c2 < ' ') {
                        if (c2 == 10) {
                            this.A01++;
                            this.A02 = i3;
                            return;
                        } else if (c2 == 13) {
                            A1M();
                            return;
                        } else if (c2 != 9) {
                            A0z(c2);
                        }
                    }
                } else {
                    return;
                }
            }
        } else if (c == '*') {
            while (true) {
                if (this.A04 >= this.A03 && !A1I()) {
                    break;
                }
                char[] cArr3 = this.A01;
                int i4 = this.A04;
                int i5 = i4 + 1;
                this.A04 = i5;
                char c3 = cArr3[i4];
                if (c3 <= '*') {
                    if (c3 == '*') {
                        if (i5 >= this.A03 && !A1I()) {
                            break;
                        }
                        char[] cArr4 = this.A01;
                        int i6 = this.A04;
                        if (cArr4[i6] == '/') {
                            this.A04 = i6 + 1;
                            return;
                        }
                    } else if (c3 < ' ') {
                        if (c3 == 10) {
                            this.A01++;
                            this.A02 = i5;
                        } else if (c3 == 13) {
                            A1M();
                        } else if (c3 != 9) {
                            A0z(c3);
                        }
                    }
                }
            }
            A13(" in a comment");
        } else {
            A10(c, "was expecting either '*' or '/' for a comment");
        }
    }

    public final int A0n() {
        C13120hv r3 = this.A00;
        if (r3 == null) {
            return 0;
        }
        int i = C35921h9.A00[r3.ordinal()];
        if (i == 1) {
            return this.A0D.A02.length();
        }
        if (i != 2) {
            if (!(i == 3 || i == 4)) {
                return r3.A02.length;
            }
        } else if (this.A00) {
            this.A00 = false;
            A1L();
        }
        return this.A0N.A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r1 != 4) goto L_0x0019;
     */
    public final int A0o() {
        int i;
        C13120hv r0 = this.A00;
        if (!(r0 == null || (i = C35921h9.A00[r0.ordinal()]) == 1)) {
            if (i != 2) {
                if (i != 3) {
                }
            } else if (this.A00) {
                this.A00 = false;
                A1L();
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
        return this.A02;
    }

    public final String A0r() {
        if (this.A00 != C13120hv.VALUE_STRING) {
            return super.A0u((String) null);
        }
        if (this.A00) {
            this.A00 = false;
            A1L();
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
                    A1L();
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
                A1L();
            }
            return this.A0N.A05();
        } else if (r2 == null) {
            return null;
        } else {
            int i = C35921h9.A00[r2.ordinal()];
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
            A1L();
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
                    char[] cArr = this.A01;
                    int i = this.A04;
                    this.A04 = i + 1;
                    char c = cArr[i];
                    if (c > ' ') {
                        int A002 = bcg.A00(c);
                        if (A002 < 0) {
                            if (c == '\"') {
                                bArr = A19.A05();
                                break;
                            }
                            A002 = A16(bcg, c, 0);
                            if (A002 < 0) {
                            }
                        }
                        if (this.A04 >= this.A03) {
                            A1B();
                        }
                        char[] cArr2 = this.A01;
                        int i2 = this.A04;
                        this.A04 = i2 + 1;
                        char c2 = cArr2[i2];
                        int A003 = bcg.A00(c2);
                        if (A003 < 0) {
                            A003 = A16(bcg, c2, 1);
                        }
                        int i3 = (A002 << 6) | A003;
                        if (this.A04 >= this.A03) {
                            A1B();
                        }
                        char[] cArr3 = this.A01;
                        int i4 = this.A04;
                        this.A04 = i4 + 1;
                        char c3 = cArr3[i4];
                        int A004 = bcg.A00(c3);
                        if (A004 < 0) {
                            if (A004 != -2) {
                                if (c3 == '\"' && !bcg.A03) {
                                    A19.A02(i3 >> 4);
                                    bArr = A19.A05();
                                    break;
                                }
                                A004 = A16(bcg, c3, 2);
                            }
                            if (A004 == -2) {
                                if (this.A04 >= this.A03) {
                                    A1B();
                                }
                                char[] cArr4 = this.A01;
                                int i5 = this.A04;
                                this.A04 = i5 + 1;
                                char c4 = cArr4[i5];
                                char c5 = bcg.A01;
                                boolean z = false;
                                if (c4 == c5) {
                                    z = true;
                                }
                                if (z) {
                                    A19.A02(i3 >> 4);
                                } else {
                                    throw C13060hp.A03(bcg, c4, 3, AnonymousClass000.A03("expected padding character '", c5, "'"));
                                }
                            }
                        }
                        int i6 = (i3 << 6) | A004;
                        if (this.A04 >= this.A03) {
                            A1B();
                        }
                        char[] cArr5 = this.A01;
                        int i7 = this.A04;
                        this.A04 = i7 + 1;
                        char c6 = cArr5[i7];
                        int A005 = bcg.A00(c6);
                        if (A005 < 0) {
                            if (A005 != -2) {
                                if (c6 == '\"' && !bcg.A03) {
                                    A19.A04(i6 >> 2);
                                    bArr = A19.A05();
                                    break;
                                }
                                A005 = A16(bcg, c6, 3);
                            }
                            if (A005 == -2) {
                                A19.A04(i6 >> 2);
                            }
                        }
                        A19.A03((i6 << 6) | A005);
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
        int i = C35921h9.A00[r2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (!(i == 3 || i == 4)) {
                    return r2.A02;
                }
            } else if (this.A00) {
                this.A00 = false;
                A1L();
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
        char[] cArr = this.A01;
        int i2 = this.A04;
        this.A04 = i2 + 1;
        char c = cArr[i2];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return 8;
        }
        if (c == 'f') {
            return 12;
        }
        if (c == 'n') {
            return 10;
        }
        if (c == 'r') {
            return 13;
        }
        if (c == 't') {
            return 9;
        }
        if (c != 'u') {
            A0y(c);
            return c;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this.A04 >= this.A03 && !A1I()) {
                A13(" in character escape sequence");
            }
            char[] cArr2 = this.A01;
            int i5 = this.A04;
            this.A04 = i5 + 1;
            char c2 = cArr2[i5];
            if (c2 > 127) {
                i = -1;
            } else {
                i = C13180i1.A00[c2];
            }
            if (i < 0) {
                A10(c2, "expected a hex-digit for character escape sequence");
            }
            i3 = (i3 << 4) | i;
        }
        return (char) i3;
    }

    public final void A1E() {
        Reader reader = this.A03;
        if (reader != null) {
            if (this.A0O.A07 || A0Q(Constants.ZERO)) {
                reader.close();
            }
            this.A03 = null;
        }
    }

    public final boolean A1I() {
        long j = this.A0I;
        int i = this.A03;
        this.A0I = j + ((long) i);
        this.A02 -= i;
        Reader reader = this.A03;
        if (reader != null) {
            char[] cArr = this.A01;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this.A04 = 0;
                this.A03 = read;
                return true;
            }
            A1E();
            if (read == 0) {
                throw new IOException(AnonymousClass000.A05("Reader returned 0 characters when trying to read ", this.A03));
            }
        }
        return false;
    }

    public final char A1J(String str) {
        if (this.A04 >= this.A03 && !A1I()) {
            A13(str);
        }
        char[] cArr = this.A01;
        int i = this.A04;
        this.A04 = i + 1;
        return cArr[i];
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r8v0 ?, r8v1 ?, r8v2 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final p000X.C13120hv A1K(
/*
Method generation error in method: X.0ho.A1K(int, boolean):X.0hv, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ?
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

    public final void A1L() {
        int i = this.A04;
        int i2 = i;
        int i3 = this.A03;
        if (i < i3) {
            int[] iArr = C13180i1.A01;
            int length = iArr.length;
            while (true) {
                char[] cArr = this.A01;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i3) {
                        break;
                    }
                } else if (c == '\"') {
                    this.A0N.A09(cArr, i2, i - i2);
                    this.A04 = i + 1;
                    return;
                }
            }
        }
        C13090hs r5 = this.A0N;
        char[] cArr2 = this.A01;
        int i4 = i - i2;
        r5.A08 = null;
        r5.A02 = -1;
        r5.A01 = 0;
        r5.A04 = null;
        r5.A09 = null;
        if (r5.A06) {
            C13090hs.A00(r5);
        } else if (r5.A07 == null) {
            r5.A07 = C13090hs.A03(r5, i4);
        }
        r5.A03 = 0;
        r5.A00 = 0;
        r5.A08(cArr2, i2, i4);
        this.A04 = i;
        char[] A0E = this.A0N.A0E();
        int i5 = this.A0N.A00;
        while (true) {
            if (this.A04 >= this.A03 && !A1I()) {
                A13(": was expecting closing quote for a string value");
            }
            char[] cArr3 = this.A01;
            int i6 = this.A04;
            this.A04 = i6 + 1;
            char c2 = cArr3[i6];
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    c2 = A15();
                } else if (c2 <= '\"') {
                    if (c2 == '\"') {
                        this.A0N.A00 = i5;
                        return;
                    } else if (c2 < ' ') {
                        A11(c2, "string value");
                    }
                }
            }
            if (i5 >= A0E.length) {
                A0E = this.A0N.A0D();
                i5 = 0;
            }
            A0E[i5] = c2;
            i5++;
        }
    }

    public final void A1M() {
        if (this.A04 < this.A03 || A1I()) {
            char[] cArr = this.A01;
            int i = this.A04;
            if (cArr[i] == 10) {
                this.A04 = i + 1;
            }
        }
        this.A01++;
        this.A02 = this.A04;
    }

    public final void A1N(String str) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.A04 >= this.A03 && !A1I()) {
                break;
            }
            char c = this.A01[this.A04];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.A04++;
            sb.append(c);
        }
        A12(AnonymousClass000.A0J("Unrecognized token '", sb.toString(), "': was expecting "));
    }

    public C13050ho(C13030hm r4, int i, Reader reader, C3U c3u, C12980hh r8) {
        super(r4, i);
        this.A03 = reader;
        C13030hm.A00(r4.A04);
        char[] A012 = r4.A05.A01(Constants.ZERO, 0);
        r4.A04 = A012;
        this.A01 = A012;
        this.A02 = c3u;
        this.A05 = r8;
        this.A04 = r8.A08;
    }

    public final void A1A() {
        super.A1A();
        char[] cArr = this.A01;
        if (cArr != null) {
            this.A01 = null;
            C13030hm r1 = this.A0O;
            if (cArr != null) {
                C13030hm.A01(cArr, r1.A04);
                r1.A04 = null;
                r1.A05.A01[Constants.ZERO.intValue()] = cArr;
            }
        }
    }

    public final void A1O(String str, int i) {
        int i2;
        char c;
        int length = str.length();
        do {
            if (this.A04 >= this.A03 && !A1I()) {
                A1N(str.substring(0, i));
            }
            if (this.A01[this.A04] != str.charAt(i)) {
                A1N(str.substring(0, i));
            }
            i2 = this.A04 + 1;
            this.A04 = i2;
            i++;
        } while (i < length);
        if ((i2 < this.A03 || A1I()) && (c = this.A01[this.A04]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
            A1N(str.substring(0, i));
        }
    }

    public final void close() {
        C12980hh r2;
        super.close();
        C12980hh r3 = this.A05;
        if (r3.A05 && (r2 = r3.A04) != null) {
            int i = r3.A02;
            if (i > 12000 || r3.A01 > 63) {
                synchronized (r2) {
                    try {
                        r2.A07 = new String[64];
                        r2.A06 = new C12990hi[32];
                        r2.A00 = 63;
                        r2.A02 = 0;
                        r2.A01 = 0;
                        r2.A03 = 48;
                        r2.A05 = false;
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                        }
                    }
                }
            } else if (i > r2.A02) {
                synchronized (r2) {
                    try {
                        r2.A07 = r3.A07;
                        r2.A06 = r3.A06;
                        r2.A02 = r3.A02;
                        r2.A03 = r3.A03;
                        r2.A00 = r3.A00;
                        r2.A01 = r3.A01;
                        r2.A05 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            r3.A05 = false;
        }
    }
}
