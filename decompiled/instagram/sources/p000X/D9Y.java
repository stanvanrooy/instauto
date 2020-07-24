package p000X;

import java.util.ArrayDeque;

/* renamed from: X.D9Y */
public final class D9Y implements DA1 {
    public C29780D9o A00;
    public int A01;
    public int A02;
    public long A03;
    public final byte[] A04 = new byte[8];
    public final C29777D9l A05 = new C29777D9l();
    public final ArrayDeque A06 = new ArrayDeque();

    public final void reset() {
        this.A02 = 0;
        this.A06.clear();
        C29777D9l d9l = this.A05;
        d9l.A01 = 0;
        d9l.A00 = 0;
    }

    public final boolean BYy(C29778D9m d9m) {
        String str;
        double longBitsToDouble;
        int i;
        int A002;
        D6U.A01(this.A00);
        while (true) {
            if (this.A06.isEmpty() || d9m.ASL() < ((DAA) this.A06.peek()).A01) {
                if (this.A02 == 0) {
                    long A012 = this.A05.A01(d9m, true, false, 4);
                    if (A012 == -2) {
                        d9m.Bdd();
                        while (true) {
                            d9m.BX0(this.A04, 0, 4);
                            byte[] bArr = this.A04;
                            byte b = bArr[0];
                            int i2 = 0;
                            while (true) {
                                long[] jArr = C29777D9l.A03;
                                if (i2 >= jArr.length) {
                                    i = -1;
                                    break;
                                } else if ((jArr[i2] & ((long) b)) != 0) {
                                    i = i2 + 1;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            if (i != -1 && i <= 4) {
                                A002 = (int) C29777D9l.A00(bArr, i, false);
                                if (this.A00.AgA(A002)) {
                                    break;
                                }
                            }
                            d9m.Bos(1);
                        }
                        d9m.Bos(i);
                        A012 = (long) A002;
                    }
                    if (A012 == -1) {
                        return false;
                    }
                    this.A01 = (int) A012;
                    this.A02 = 1;
                }
                if (this.A02 == 1) {
                    this.A03 = this.A05.A01(d9m, false, true, 8);
                    this.A02 = 2;
                }
                C29780D9o d9o = this.A00;
                int i3 = this.A01;
                int AKx = d9o.AKx(i3);
                if (AKx != 0) {
                    if (AKx == 1) {
                        long ASL = d9m.ASL();
                        this.A06.push(new DAA(i3, this.A03 + ASL));
                        this.A00.Bpr(this.A01, ASL, this.A03);
                    } else if (AKx == 2) {
                        long j = this.A03;
                        if (j <= 8) {
                            int i4 = (int) j;
                            d9m.readFully(this.A04, 0, i4);
                            long j2 = 0;
                            for (int i5 = 0; i5 < i4; i5++) {
                                j2 = (j2 << 8) | ((long) (this.A04[i5] & 255));
                            }
                            d9o.Adl(i3, j2);
                        } else {
                            throw new C2101594l(AnonymousClass000.A0B("Invalid integer size: ", j));
                        }
                    } else if (AKx == 3) {
                        long j3 = this.A03;
                        if (j3 <= 2147483647L) {
                            int i6 = (int) j3;
                            if (i6 == 0) {
                                str = "";
                            } else {
                                byte[] bArr2 = new byte[i6];
                                d9m.readFully(bArr2, 0, i6);
                                while (i6 > 0) {
                                    int i7 = i6 - 1;
                                    if (bArr2[i7] != 0) {
                                        break;
                                    }
                                    i6 = i7;
                                }
                                str = new String(bArr2, 0, i6);
                            }
                            d9o.Bqe(i3, str);
                        } else {
                            throw new C2101594l(AnonymousClass000.A0B("String element size: ", j3));
                        }
                    } else if (AKx == 4) {
                        d9o.A6Q(i3, (int) this.A03, d9m);
                    } else if (AKx == 5) {
                        long j4 = this.A03;
                        if (j4 == 4 || j4 == 8) {
                            int i8 = (int) j4;
                            d9m.readFully(this.A04, 0, i8);
                            long j5 = 0;
                            for (int i9 = 0; i9 < i8; i9++) {
                                j5 = (j5 << 8) | ((long) (this.A04[i9] & 255));
                            }
                            if (i8 == 4) {
                                longBitsToDouble = (double) Float.intBitsToFloat((int) j5);
                            } else {
                                longBitsToDouble = Double.longBitsToDouble(j5);
                            }
                            d9o.AEa(i3, longBitsToDouble);
                        } else {
                            throw new C2101594l(AnonymousClass000.A0B("Invalid float size: ", j4));
                        }
                    } else {
                        throw new C2101594l(AnonymousClass000.A05("Invalid element type ", AKx));
                    }
                    this.A02 = 0;
                    return true;
                }
                d9m.Bos((int) this.A03);
                this.A02 = 0;
            } else {
                this.A00.ADD(((DAA) this.A06.pop()).A00);
                return true;
            }
        }
    }

    public final void AdI(C29780D9o d9o) {
        this.A00 = d9o;
    }
}
