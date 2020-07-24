package p000X;

import java.util.Arrays;

/* renamed from: X.0hh  reason: invalid class name and case insensitive filesystem */
public final class C12980hh {
    public static final C12980hh A0B = new C12980hh();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C12980hh A04;
    public boolean A05;
    public C12990hi[] A06;
    public String[] A07;
    public final int A08;
    public final boolean A09;
    public final boolean A0A;

    public final C12980hh A00(boolean z, boolean z2) {
        String[] strArr;
        C12990hi[] r5;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            strArr = this.A07;
            r5 = this.A06;
            i = this.A02;
            i2 = this.A08;
            i3 = this.A01;
        }
        return new C12980hh(this, z, z2, strArr, r5, i, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r3 == r9) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[LOOP:0: B:12:0x002c->B:15:0x0038, LOOP_START, PHI: r3 
      PHI: (r3v15 int) = (r3v14 int), (r3v17 int) binds: [B:11:0x002b, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050 A[LOOP:2: B:24:0x0050->B:27:0x005c, LOOP_START, PHI: r3 
      PHI: (r3v11 int) = (r3v10 int), (r3v13 int) binds: [B:23:0x004f, B:27:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    public final String A01(char[] cArr, int i, int i2, int i3) {
        int i4 = i2;
        if (i4 < 1) {
            return "";
        }
        int i5 = i;
        char[] cArr2 = cArr;
        if (!this.A09) {
            return new String(cArr2, i5, i4);
        }
        int i6 = (i3 + (i3 >>> 15)) & this.A00;
        String str = this.A07[i6];
        if (str != null) {
            if (str.length() == i4) {
                int i7 = 0;
                while (str.charAt(i7) == cArr[i + i7] && (i7 = i7 + 1) < i4) {
                    while (str.charAt(i7) == cArr[i + i7] && (i7 = i7 + 1) < i4) {
                    }
                }
            }
            C12990hi r0 = this.A06[i6 >> 1];
            if (r0 != null) {
                String str2 = r0.A01;
                C12990hi r7 = r0.A00;
                while (true) {
                    if (str2.length() == i4) {
                        int i8 = 0;
                        while (str2.charAt(i8) == cArr[i + i8] && (i8 = i8 + 1) < i4) {
                            while (str2.charAt(i8) == cArr[i + i8] && (i8 = i8 + 1) < i4) {
                            }
                        }
                        if (i8 == i4) {
                            break;
                        }
                    }
                    if (r7 == null) {
                        str2 = null;
                        break;
                    }
                    str2 = r7.A01;
                    r7 = r7.A00;
                }
                if (str2 != null) {
                    return str2;
                }
            }
        }
        if (!this.A05) {
            String[] strArr = this.A07;
            int length = strArr.length;
            String[] strArr2 = new String[length];
            this.A07 = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, length);
            C12990hi[] r3 = this.A06;
            int length2 = r3.length;
            C12990hi[] r02 = new C12990hi[length2];
            this.A06 = r02;
            System.arraycopy(r3, 0, r02, 0, length2);
            this.A05 = true;
        } else if (this.A02 >= this.A03) {
            String[] strArr3 = this.A07;
            int i9 = r4 + r4;
            if (i9 > 65536) {
                this.A02 = 0;
                Arrays.fill(strArr3, (Object) null);
                Arrays.fill(this.A06, (Object) null);
                this.A05 = true;
            } else {
                C12990hi[] r13 = this.A06;
                this.A07 = new String[i9];
                this.A06 = new C12990hi[(i9 >> 1)];
                this.A00 = i9 - 1;
                this.A03 = i9 - (i9 >> 2);
                int i10 = 0;
                int i11 = 0;
                for (String str3 : strArr3) {
                    if (str3 != null) {
                        i10++;
                        int length3 = str3.length();
                        int i12 = this.A08;
                        for (int i13 = 0; i13 < length3; i13++) {
                            i12 = (i12 * 33) + str3.charAt(i13);
                        }
                        if (i12 == 0) {
                            i12 = 1;
                        }
                        int i14 = (i12 + (i12 >>> 15)) & this.A00;
                        String[] strArr4 = this.A07;
                        if (strArr4[i14] == null) {
                            strArr4[i14] = str3;
                        } else {
                            int i15 = i14 >> 1;
                            C12990hi[] r1 = this.A06;
                            r1[i15] = new C12990hi(str3, r1[i15]);
                            i11 = Math.max(i11, 1);
                        }
                    }
                }
                int i16 = r4 >> 1;
                for (int i17 = 0; i17 < i16; i17++) {
                    for (C12990hi r4 = r13[i17]; r4 != null; r4 = r4.A00) {
                        i10++;
                        String str4 = r4.A01;
                        int length4 = str4.length();
                        int i18 = this.A08;
                        for (int i19 = 0; i19 < length4; i19++) {
                            i18 = (i18 * 33) + str4.charAt(i19);
                        }
                        if (i18 == 0) {
                            i18 = 1;
                        }
                        int i20 = (i18 + (i18 >>> 15)) & this.A00;
                        String[] strArr5 = this.A07;
                        if (strArr5[i20] == null) {
                            strArr5[i20] = str4;
                        } else {
                            int i21 = i20 >> 1;
                            C12990hi[] r12 = this.A06;
                            r12[i21] = new C12990hi(str4, r12[i21]);
                            i11 = Math.max(i11, 1);
                        }
                    }
                }
                this.A01 = i11;
                int i22 = this.A02;
                if (i10 != i22) {
                    throw new Error(AnonymousClass000.A08("Internal error on SymbolTable.rehash(): had ", i22, " entries; now have ", i10, "."));
                }
            }
            int i23 = this.A08;
            for (int i24 = 0; i24 < i4; i24++) {
                i23 = (i23 * 33) + cArr[i24];
            }
            if (i23 == 0) {
                i23 = 1;
            }
            i6 = (i23 + (i23 >>> 15)) & this.A00;
        }
        str = new String(cArr2, i5, i4);
        if (this.A0A) {
            str = C13190i2.A00.A00(str);
        }
        int i25 = this.A02 + 1;
        this.A02 = i25;
        String[] strArr6 = this.A07;
        if (strArr6[i6] == null) {
            strArr6[i6] = str;
            return str;
        }
        int i26 = i6 >> 1;
        C12990hi[] r14 = this.A06;
        r14[i26] = new C12990hi(str, r14[i26]);
        int max = Math.max(1, this.A01);
        this.A01 = max;
        if (max > 255) {
            throw new IllegalStateException(AnonymousClass000.A08("Longest collision chain in symbol table (of size ", i25, ") now exceeds maximum, ", 255, " -- suspect a DoS attack based on hash collisions"));
        }
        return str;
    }

    public C12980hh() {
        this.A09 = true;
        this.A0A = true;
        this.A05 = true;
        this.A08 = 0;
        this.A01 = 0;
        this.A07 = new String[64];
        this.A06 = new C12990hi[32];
        this.A00 = 63;
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = 48;
    }

    public C12980hh(C12980hh r3, boolean z, boolean z2, String[] strArr, C12990hi[] r7, int i, int i2, int i3) {
        this.A04 = r3;
        this.A09 = z;
        this.A0A = z2;
        this.A07 = strArr;
        this.A06 = r7;
        this.A02 = i;
        this.A08 = i2;
        int length = strArr.length;
        this.A03 = length - (length >> 2);
        this.A00 = length - 1;
        this.A01 = i3;
        this.A05 = false;
    }
}
