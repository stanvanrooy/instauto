package p000X;

import java.io.Serializable;

/* renamed from: X.0hf  reason: invalid class name and case insensitive filesystem */
public final class C12960hf implements C12970hg, Serializable {
    public byte[] A00;
    public byte[] A01;
    public char[] A02;
    public final String A03;

    public final int A5S(byte[] bArr, int i) {
        byte[] bArr2 = this.A00;
        if (bArr2 == null) {
            bArr2 = BZQ.A01().A03(this.A03);
            this.A00 = bArr2;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        return length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r14 = r2 + 1;
        r13 = r9.charAt(r2);
        r0 = r6[r13];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r0 >= 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r2 = r10.A02;
        r2[1] = 'u';
        r12 = p000X.BZQ.A04;
        r2[4] = r12[r13 >> 4];
        r2[5] = r12[r13 & 15];
        r12 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r2 = r11 + r12;
        r1 = r7.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (r2 <= r1) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        r1 = r1 - r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r1 <= 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        java.lang.System.arraycopy(r10.A02, 0, r7, r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        r7 = r8.A0D();
        r12 = r12 - r1;
        java.lang.System.arraycopy(r10.A02, r1, r7, 0, r12);
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        java.lang.System.arraycopy(r10.A02, 0, r7, r11, r12);
        r11 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        r10.A02[1] = (char) r0;
        r12 = 2;
     */
    public final char[] A5w() {
        char[] cArr = this.A02;
        if (cArr != null) {
            return cArr;
        }
        BZQ A012 = BZQ.A01();
        String str = this.A03;
        C13090hs r8 = A012.A01;
        if (r8 == null) {
            r8 = new C13090hs((C13040hn) null);
            A012.A01 = r8;
        }
        char[] A0B = r8.A0B();
        int[] iArr = C13180i1.A06;
        int length = iArr.length;
        int length2 = str.length();
        int i = 0;
        int i2 = 0;
        loop0:
        while (i < length2) {
            while (true) {
                char charAt = str.charAt(i);
                if (charAt < length && iArr[charAt] != 0) {
                    break;
                }
                if (i2 >= A0B.length) {
                    A0B = r8.A0D();
                    i2 = 0;
                }
                A0B[i2] = charAt;
                i++;
                i2++;
                if (i >= length2) {
                    break loop0;
                }
            }
        }
        r8.A00 = i2;
        char[] A0A = r8.A0A();
        this.A02 = A0A;
        return A0A;
    }

    public final byte[] A5x() {
        byte[] bArr = this.A00;
        if (bArr != null) {
            return bArr;
        }
        byte[] A032 = BZQ.A01().A03(this.A03);
        this.A00 = A032;
        return A032;
    }

    public final byte[] A5z() {
        int i;
        byte[] bArr = this.A01;
        if (bArr != null) {
            return bArr;
        }
        BZQ A012 = BZQ.A01();
        String str = this.A03;
        BZR bzr = A012.A00;
        if (bzr == null) {
            bzr = new BZR(500);
            A012.A00 = bzr;
        }
        int length = str.length();
        bzr.A01();
        byte[] bArr2 = bzr.A01;
        int length2 = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        loop0:
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i4 = i2 + 1;
            int charAt = str.charAt(i2);
            while (charAt <= 127) {
                if (i3 >= length2) {
                    BZR.A00(bzr);
                    bArr2 = bzr.A01;
                    length2 = bArr2.length;
                    i3 = 0;
                }
                int i5 = i3 + 1;
                bArr2[i3] = (byte) charAt;
                if (i4 >= length) {
                    i3 = i5;
                    break loop0;
                }
                charAt = str.charAt(i4);
                i4++;
                i3 = i5;
            }
            if (i3 >= length2) {
                BZR.A00(bzr);
                bArr2 = bzr.A01;
                length2 = bArr2.length;
                i3 = 0;
            }
            if (charAt < 2048) {
                i = i3 + 1;
                bArr2[i3] = (byte) ((charAt >> 6) | 192);
            } else if (charAt < 55296 || charAt > 57343) {
                int i6 = i3 + 1;
                bArr2[i3] = (byte) ((charAt >> 12) | 224);
                if (i6 >= length2) {
                    BZR.A00(bzr);
                    bArr2 = bzr.A01;
                    length2 = bArr2.length;
                    i6 = 0;
                }
                i = i6 + 1;
                bArr2[i6] = (byte) (((charAt >> 6) & 63) | 128);
            } else {
                if (charAt > 56319) {
                    BZQ.A02(charAt);
                }
                if (i4 >= length) {
                    BZQ.A02(charAt);
                }
                int i7 = i4 + 1;
                charAt = BZQ.A00(charAt, str.charAt(i4));
                if (charAt > 1114111) {
                    BZQ.A02(charAt);
                }
                int i8 = i3 + 1;
                bArr2[i3] = (byte) ((charAt >> 18) | 240);
                if (i8 >= length2) {
                    BZR.A00(bzr);
                    bArr2 = bzr.A01;
                    length2 = bArr2.length;
                    i8 = 0;
                }
                int i9 = i8 + 1;
                bArr2[i8] = (byte) (((charAt >> 12) & 63) | 128);
                if (i9 >= length2) {
                    BZR.A00(bzr);
                    bArr2 = bzr.A01;
                    length2 = bArr2.length;
                    i9 = 0;
                }
                i = i9 + 1;
                bArr2[i9] = (byte) (((charAt >> 6) & 63) | 128);
                i4 = i7;
            }
            if (i >= length2) {
                BZR.A00(bzr);
                bArr2 = bzr.A01;
                length2 = bArr2.length;
                i = 0;
            }
            i3 = i + 1;
            bArr2[i] = (byte) ((charAt & 63) | 128);
            i2 = i4;
        }
        BZR bzr2 = A012.A00;
        bzr2.A00 = i3;
        byte[] A05 = bzr2.A05();
        this.A01 = A05;
        return A05;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.A03.equals(((C12960hf) obj).A03);
    }

    public final String getValue() {
        return this.A03;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        return this.A03;
    }

    public C12960hf(String str) {
        if (str != null) {
            this.A03 = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }
}
