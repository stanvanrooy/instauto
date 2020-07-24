package p000X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0hj  reason: invalid class name and case insensitive filesystem */
public final class C13000hj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public int[] A08;
    public C13730j8[] A09;
    public C13020hl[] A0A;
    public final int A0B;
    public final C13000hj A0C;
    public final AtomicReference A0D;
    public final boolean A0E;
    public transient boolean A0F;

    public final int A00(int[] iArr, int i) {
        if (i >= 3) {
            int i2 = iArr[0] ^ this.A0B;
            int i3 = (((i2 + (i2 >>> 9)) * 33) + iArr[1]) * 65599;
            int i4 = (i3 + (i3 >>> 15)) ^ iArr[2];
            int i5 = i4 + (i4 >>> 17);
            for (int i6 = 3; i6 < i; i6++) {
                int i7 = (i5 * 31) ^ iArr[i6];
                int i8 = i7 + (i7 >>> 3);
                i5 = i8 ^ (i8 << 7);
            }
            int i9 = i5 + (i5 >>> 15);
            return (i9 << 9) ^ i9;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 == 0) goto L_0x0033;
     */
    public final C13020hl A02(int[] iArr, int i) {
        C13730j8 r1;
        if (i < 3) {
            int i2 = 0;
            int i3 = iArr[0];
            if (i >= 2) {
                i2 = iArr[1];
            }
            return A01(i3, i2);
        }
        int A002 = A00(iArr, i);
        int i4 = this.A04 & A002;
        int i5 = this.A08[i4];
        if ((((i5 >> 8) ^ A002) << 8) == 0) {
            C13020hl r12 = this.A0A[i4];
            if (r12 == null || r12.A02(iArr, i)) {
                return r12;
            }
            int i6 = i5 & 255;
            if (i6 > 0 && (r1 = this.A09[i6 - 1]) != null) {
                do {
                    C13020hl r2 = r1.A01;
                    if (r2.hashCode() == A002 && r2.A02(iArr, i)) {
                        return r2;
                    }
                    r1 = r1.A00;
                } while (r1 != null);
                return null;
            }
        }
        return null;
    }

    public final C13020hl A01(int i, int i2) {
        int i3;
        C13730j8 r0;
        if (i2 == 0) {
            int i4 = i ^ this.A0B;
            int i5 = i4 + (i4 >>> 15);
            i3 = i5 ^ (i5 >>> 9);
        } else {
            int i6 = ((i ^ (i >>> 15)) + (i2 * 33)) ^ this.A0B;
            i3 = i6 + (i6 >>> 7);
        }
        int i7 = this.A04 & i3;
        int i8 = this.A08[i7];
        if ((((i8 >> 8) ^ i3) << 8) == 0) {
            C13020hl r2 = this.A0A[i7];
            if (r2 != null) {
                if (r2.A01(i, i2)) {
                    return r2;
                }
            }
            return null;
        } else if (i8 == 0) {
            return null;
        }
        int i9 = i8 & 255;
        if (i9 > 0 && (r0 = this.A09[i9 - 1]) != null) {
            return r0.A00(i3, i, i2);
        }
        return null;
    }

    public C13000hj(int i) {
        this.A0C = null;
        this.A0B = i;
        this.A0E = true;
        this.A0D = new AtomicReference(new C13010hk(new int[64], new C13020hl[64]));
    }

    public C13000hj(C13000hj r2, boolean z, int i, C13010hk r5) {
        this.A0C = r2;
        this.A0B = i;
        this.A0E = z;
        this.A0D = null;
        this.A02 = r5.A02;
        this.A04 = r5.A04;
        this.A08 = r5.A05;
        this.A0A = r5.A07;
        this.A09 = r5.A06;
        this.A00 = r5.A00;
        this.A01 = r5.A01;
        this.A03 = r5.A03;
        this.A0F = false;
        this.A06 = true;
        this.A07 = true;
        this.A05 = true;
    }
}
