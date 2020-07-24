package p000X;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.D6K */
public abstract class D6K implements C29769D8w {
    public long A00;
    public long A01;
    public D6Z A02;
    public final ArrayDeque A03 = new ArrayDeque();
    public final ArrayDeque A04;
    public final PriorityQueue A05;

    public D8C A03() {
        C25987Bdg bdg = (C25987Bdg) this;
        List list = bdg.A06;
        bdg.A07 = list;
        return new C25988Bdh(list);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0154, code lost:
        if ((r5 & 192) != 64) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x018c, code lost:
        if (r1.A05.length() != 0) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01e3, code lost:
        if (r5 > 35) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01f9, code lost:
        if ((r5 & 240) != 32) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0243, code lost:
        if (r1.A05.length() != 0) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x027e, code lost:
        if (r0 != 3) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x029d, code lost:
        r3.A03 = r1;
        r3.A05.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r1[r2] == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00cd, code lost:
        if ((r5 & 240) != 48) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00f5, code lost:
        if ((r5 & 224) != 32) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0121, code lost:
        if ((r5 & 240) != 32) goto L_0x0123;
     */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0016 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0016 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a4  */
    public void A04(D8G d8g) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        boolean z9;
        boolean z10;
        byte b;
        int[] iArr;
        C25987Bdg bdg = (C25987Bdg) this;
        bdg.A0E.A0E(d8g.A01.array(), d8g.A01.limit());
        boolean z11 = false;
        while (true) {
            D9O d9o = bdg.A0E;
            int i2 = d9o.A00 - d9o.A01;
            int i3 = bdg.A0B;
            if (i2 >= i3) {
                byte A012 = i3 == 2 ? -4 : (byte) d9o.A01();
                int A013 = d9o.A01();
                int A014 = d9o.A01();
                if ((A012 & 2) == 0 && (A012 & 1) == bdg.A0D) {
                    byte b2 = (byte) (A013 & 127);
                    byte b3 = (byte) (A014 & 127);
                    if (b2 != 0 || b3 != 0) {
                        boolean z12 = bdg.A08;
                        if ((A012 & 4) == 4) {
                            boolean[] zArr = C25987Bdg.A0N;
                            if (zArr[A013]) {
                                z = true;
                            }
                        }
                        z = false;
                        bdg.A08 = z;
                        if (z) {
                            boolean z13 = false;
                            if ((b2 & 240) == 16) {
                                z13 = true;
                            }
                            if (z13) {
                                if (bdg.A0A && bdg.A00 == b2 && bdg.A01 == b3) {
                                    bdg.A0A = false;
                                    z2 = true;
                                    if (!z2) {
                                    }
                                } else {
                                    bdg.A0A = true;
                                    bdg.A00 = b2;
                                    bdg.A01 = b3;
                                    z2 = false;
                                    if (!z2) {
                                        if (z) {
                                            boolean z14 = true;
                                            if (1 > b2 || b2 > 15) {
                                                z14 = false;
                                            }
                                            if (!z14) {
                                                boolean z15 = false;
                                                if ((b2 & 247) == 20) {
                                                    z15 = true;
                                                }
                                                if (z15) {
                                                    if (!(b3 == 32 || b3 == 47)) {
                                                        switch (b3) {
                                                            case 37:
                                                            case 38:
                                                            case 39:
                                                                break;
                                                            default:
                                                                switch (b3) {
                                                                    case 41:
                                                                        break;
                                                                    case 42:
                                                                    case 43:
                                                                        break;
                                                                }
                                                        }
                                                    }
                                                    bdg.A09 = true;
                                                }
                                                if (!bdg.A09) {
                                                    byte b4 = b2 & 224;
                                                    boolean z16 = false;
                                                    if (b4 == 0) {
                                                        z16 = true;
                                                    }
                                                    if (z16) {
                                                        bdg.A04 = (b2 >> 3) & 1;
                                                    }
                                                    boolean z17 = false;
                                                    if (bdg.A04 == bdg.A0C) {
                                                        z17 = true;
                                                    }
                                                    if (z17) {
                                                        boolean z18 = false;
                                                        if (b4 == 0) {
                                                            z18 = true;
                                                        }
                                                        if (z18) {
                                                            byte b5 = b2 & 247;
                                                            if (b5 == 17) {
                                                                z3 = true;
                                                            }
                                                            z3 = false;
                                                            if (z3) {
                                                                bdg.A05.A05.append((char) C25987Bdg.A0J[b3 & 15]);
                                                            } else {
                                                                byte b6 = b2 & 246;
                                                                if (b6 == 18) {
                                                                    z4 = true;
                                                                }
                                                                z4 = false;
                                                                if (z4) {
                                                                    bdg.A05.A02();
                                                                    C25985Bde bde = bdg.A05;
                                                                    if ((b2 & 1) == 0) {
                                                                        b = b3 & 31;
                                                                        iArr = C25987Bdg.A0K;
                                                                    } else {
                                                                        b = b3 & 31;
                                                                        iArr = C25987Bdg.A0L;
                                                                    }
                                                                    bde.A05.append((char) iArr[b]);
                                                                } else {
                                                                    if (b5 == 17) {
                                                                        z5 = true;
                                                                    }
                                                                    z5 = false;
                                                                    if (z5) {
                                                                        C25985Bde bde2 = bdg.A05;
                                                                        StringBuilder sb = bde2.A05;
                                                                        sb.append(' ');
                                                                        boolean z19 = false;
                                                                        if ((b3 & 1) == 1) {
                                                                            z19 = true;
                                                                        }
                                                                        bde2.A06.add(new C25986Bdf((b3 >> 1) & 7, z19, sb.length()));
                                                                    } else {
                                                                        if ((b2 & 240) == 16) {
                                                                            z6 = true;
                                                                        }
                                                                        z6 = false;
                                                                        if (z6) {
                                                                            int i4 = C25987Bdg.A0I[b2 & 7];
                                                                            boolean z20 = false;
                                                                            boolean z21 = false;
                                                                            if ((b3 & 32) != 0) {
                                                                                z21 = true;
                                                                            }
                                                                            if (z21) {
                                                                                i4++;
                                                                            }
                                                                            C25985Bde bde3 = bdg.A05;
                                                                            if (i4 != bde3.A03) {
                                                                                if (bdg.A02 != 1) {
                                                                                    if (bde3.A06.isEmpty() && bde3.A07.isEmpty()) {
                                                                                        z10 = true;
                                                                                    }
                                                                                    z10 = false;
                                                                                    if (!z10) {
                                                                                        C25985Bde bde4 = new C25985Bde(bdg.A02, bdg.A03);
                                                                                        bdg.A05 = bde4;
                                                                                        bdg.A0F.add(bde4);
                                                                                    }
                                                                                }
                                                                                bdg.A05.A03 = i4;
                                                                            }
                                                                            boolean z22 = false;
                                                                            if ((b3 & 16) == 16) {
                                                                                z22 = true;
                                                                            }
                                                                            if ((b3 & 1) == 1) {
                                                                                z20 = true;
                                                                            }
                                                                            int i5 = (b3 >> 1) & 7;
                                                                            C25985Bde bde5 = bdg.A05;
                                                                            int i6 = i5;
                                                                            if (z22) {
                                                                                i6 = 8;
                                                                            }
                                                                            bde5.A06.add(new C25986Bdf(i6, z20, bde5.A05.length()));
                                                                            if (z22) {
                                                                                bdg.A05.A02 = C25987Bdg.A0H[i5];
                                                                            }
                                                                        } else {
                                                                            if (b5 == 23 && b3 >= 33) {
                                                                                z7 = true;
                                                                            }
                                                                            z7 = false;
                                                                            if (z7) {
                                                                                bdg.A05.A04 = b3 - 32;
                                                                            } else {
                                                                                if (b6 == 20) {
                                                                                    z8 = true;
                                                                                }
                                                                                z8 = false;
                                                                                if (z8) {
                                                                                    if (b3 == 32) {
                                                                                        C25987Bdg.A02(bdg, 2);
                                                                                    } else if (b3 != 41) {
                                                                                        switch (b3) {
                                                                                            case 37:
                                                                                                C25987Bdg.A02(bdg, 1);
                                                                                                i = 2;
                                                                                                break;
                                                                                            case 38:
                                                                                                C25987Bdg.A02(bdg, 1);
                                                                                                bdg.A03 = 3;
                                                                                                bdg.A05.A01 = 3;
                                                                                                break;
                                                                                            case 39:
                                                                                                C25987Bdg.A02(bdg, 1);
                                                                                                i = 4;
                                                                                                break;
                                                                                            default:
                                                                                                int i7 = bdg.A02;
                                                                                                if (i7 != 0) {
                                                                                                    if (b3 != 33) {
                                                                                                        if (b3 != 36) {
                                                                                                            switch (b3) {
                                                                                                                case 44:
                                                                                                                    bdg.A06 = Collections.emptyList();
                                                                                                                    int i8 = bdg.A02;
                                                                                                                    if (i8 != 1) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 45:
                                                                                                                    if (i7 == 1) {
                                                                                                                        C25985Bde bde6 = bdg.A05;
                                                                                                                        if (bde6.A06.isEmpty() && bde6.A07.isEmpty()) {
                                                                                                                            z9 = true;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        z9 = false;
                                                                                                                        if (!z9) {
                                                                                                                            C25985Bde bde7 = bdg.A05;
                                                                                                                            bde7.A07.add(C25985Bde.A00(bde7));
                                                                                                                            bde7.A05.setLength(0);
                                                                                                                            bde7.A06.clear();
                                                                                                                            int min = Math.min(bde7.A01, bde7.A03);
                                                                                                                            while (bde7.A07.size() >= min) {
                                                                                                                                bde7.A07.remove(0);
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 46:
                                                                                                                    C25987Bdg.A01(bdg);
                                                                                                                    break;
                                                                                                                case 47:
                                                                                                                    bdg.A06 = C25987Bdg.A00(bdg);
                                                                                                                    C25987Bdg.A01(bdg);
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        bdg.A05.A02();
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                    } else {
                                                                                        C25987Bdg.A02(bdg, 3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            C25985Bde bde8 = bdg.A05;
                                                            int[] iArr2 = C25987Bdg.A0G;
                                                            StringBuilder sb2 = bde8.A05;
                                                            sb2.append((char) iArr2[(b2 & Byte.MAX_VALUE) - 32]);
                                                            if ((b3 & 224) != 0) {
                                                                sb2.append((char) iArr2[(b3 & Byte.MAX_VALUE) - 32]);
                                                            }
                                                        }
                                                        z11 = true;
                                                        continue;
                                                    }
                                                }
                                            }
                                            bdg.A09 = false;
                                            if (!bdg.A09) {
                                            }
                                        } else if (!z12) {
                                        }
                                        C25987Bdg.A01(bdg);
                                        z11 = true;
                                        continue;
                                    }
                                }
                            }
                        }
                        bdg.A0A = false;
                        z2 = false;
                        if (!z2) {
                        }
                    }
                }
            } else if (z11) {
                int i9 = bdg.A02;
                if (i9 == 1 || i9 == 3) {
                    bdg.A06 = C25987Bdg.A00(bdg);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    public boolean A05() {
        C25987Bdg bdg = (C25987Bdg) this;
        return bdg.A06 != bdg.A07;
    }

    public void release() {
        boolean z = this instanceof C25987Bdg;
    }

    public final /* bridge */ /* synthetic */ Object ABg() {
        boolean z = false;
        if (this.A02 == null) {
            z = true;
        }
        D6U.A03(z);
        if (this.A03.isEmpty()) {
            return null;
        }
        D6Z d6z = (D6Z) this.A03.pollFirst();
        this.A02 = d6z;
        return d6z;
    }

    public final /* bridge */ /* synthetic */ Object ABj() {
        D6S d6s;
        if (!this.A04.isEmpty()) {
            while (!this.A05.isEmpty() && ((D6Z) this.A05.peek()).A00 <= this.A00) {
                D6Z d6z = (D6Z) this.A05.poll();
                if (d6z.A02()) {
                    d6s = (D6S) this.A04.pollFirst();
                    d6s.A00 = 4 | d6s.A00;
                } else {
                    A04(d6z);
                    if (A05()) {
                        D8C A032 = A03();
                        if (!d6z.A01()) {
                            d6s = (D6S) this.A04.pollFirst();
                            long j = d6z.A00;
                            d6s.A01 = j;
                            d6s.A01 = A032;
                            d6s.A00 = j;
                        }
                    }
                    d6z.A03();
                    this.A03.add(d6z);
                }
                d6z.A03();
                this.A03.add(d6z);
                return d6s;
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void BYr(Object obj) {
        D8G d8g = (D8G) obj;
        boolean z = false;
        if (d8g == this.A02) {
            z = true;
        }
        D6U.A02(z);
        if (d8g.A01()) {
            D6Z d6z = this.A02;
            d6z.A03();
            this.A03.add(d6z);
        } else {
            D6Z d6z2 = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            d6z2.A00 = j;
            this.A05.add(d6z2);
        }
        this.A02 = null;
    }

    public void flush() {
        this.A01 = 0;
        this.A00 = 0;
        while (!this.A05.isEmpty()) {
            D6Z d6z = (D6Z) this.A05.poll();
            d6z.A03();
            this.A03.add(d6z);
        }
        D6Z d6z2 = this.A02;
        if (d6z2 != null) {
            d6z2.A03();
            this.A03.add(d6z2);
            this.A02 = null;
        }
    }

    public D6K() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new D6Z());
        }
        this.A04 = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.A04.add(new D6Y(this));
        }
        this.A05 = new PriorityQueue();
    }

    public void Bjb(long j) {
        this.A00 = j;
    }
}
