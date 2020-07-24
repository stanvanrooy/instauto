package p000X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1zV  reason: invalid class name and case insensitive filesystem */
public final class C46291zV {
    public final int A00;
    public final int A01;
    public final C46251zQ A02;
    public final List A03;
    public final boolean A04;
    public final int[] A05;
    public final int[] A06;

    private void A01(int i, int i2, int i3, boolean z) {
        int i4 = i - 1;
        int i5 = i4;
        if (z) {
            i2--;
            i4 = i;
            i5 = i2;
        }
        while (i3 >= 0) {
            C46281zU r6 = (C46281zU) this.A03.get(i3);
            int i6 = r6.A01;
            int i7 = r6.A00;
            int i8 = i6 + i7;
            int i9 = r6.A02 + i7;
            int i10 = 8;
            if (z) {
                for (int i11 = i4 - 1; i11 >= i8; i11--) {
                    if (this.A02.A04(i11, i5)) {
                        if (!this.A02.A03(i11, i5)) {
                            i10 = 4;
                        }
                        this.A05[i5] = (i11 << 5) | 16;
                        this.A06[i11] = (i5 << 5) | i10;
                        return;
                    }
                }
                continue;
            } else {
                for (int i12 = i2 - 1; i12 >= i9; i12--) {
                    if (this.A02.A04(i5, i12)) {
                        if (!this.A02.A03(i5, i12)) {
                            i10 = 4;
                        }
                        int i13 = i - 1;
                        this.A06[i13] = (i12 << 5) | 16;
                        this.A05[i12] = (i13 << 5) | i10;
                        return;
                    }
                }
                continue;
            }
            i4 = r6.A01;
            i2 = r6.A02;
            i3--;
        }
    }

    public final void A02(C29241Pd r21) {
        C46351zb r9;
        C29241Pd r92 = r21;
        if (r92 instanceof C46351zb) {
            r9 = (C46351zb) r92;
        } else {
            r9 = new C46351zb(r92);
        }
        ArrayList<AnonymousClass22F> arrayList = new ArrayList<>();
        int i = this.A01;
        int i2 = this.A00;
        for (int size = this.A03.size() - 1; size >= 0; size--) {
            C46281zU r4 = (C46281zU) this.A03.get(size);
            int i3 = r4.A00;
            int i4 = r4.A01 + i3;
            int i5 = r4.A02 + i3;
            if (i4 < i) {
                int i6 = i - i4;
                if (!this.A04) {
                    r9.BIS(i4, i6);
                } else {
                    for (int i7 = i6 - 1; i7 >= 0; i7--) {
                        int i8 = i4 + i7;
                        int i9 = this.A06[i8];
                        int i10 = i9 & 31;
                        if (i10 == 0) {
                            r9.BIS(i8, 1);
                            for (AnonymousClass22F r5 : arrayList) {
                                r5.A02--;
                            }
                        } else if (i10 == 4 || i10 == 8) {
                            int i11 = i9 >> 5;
                            AnonymousClass22F A002 = A00(arrayList, i11, false);
                            r9.BBx(i8, A002.A02 - 1);
                            if (i10 == 4) {
                                r9.Auy(A002.A02 - 1, 1, this.A02.A02(i8, i11));
                            }
                        } else if (i10 == 16) {
                            arrayList.add(new AnonymousClass22F(i8, i8, true));
                        } else {
                            throw new IllegalStateException(AnonymousClass000.A0A("unknown flag for pos ", i8, " ", Long.toBinaryString((long) i10)));
                        }
                    }
                }
            }
            if (i5 < i2) {
                int i12 = i2 - i5;
                if (!this.A04) {
                    r9.B7Z(i4, i12);
                } else {
                    for (int i13 = i12 - 1; i13 >= 0; i13--) {
                        int i14 = i5 + i13;
                        int i15 = this.A05[i14];
                        int i16 = i15 & 31;
                        if (i16 == 0) {
                            r9.B7Z(i4, 1);
                            for (AnonymousClass22F r52 : arrayList) {
                                r52.A02++;
                            }
                        } else if (i16 == 4 || i16 == 8) {
                            int i17 = i15 >> 5;
                            r9.BBx(A00(arrayList, i17, true).A02, i4);
                            if (i16 == 4) {
                                r9.Auy(i4, 1, this.A02.A02(i17, i14));
                            }
                        } else if (i16 == 16) {
                            arrayList.add(new AnonymousClass22F(i14, i4, false));
                        } else {
                            throw new IllegalStateException(AnonymousClass000.A0A("unknown flag for pos ", i14, " ", Long.toBinaryString((long) i16)));
                        }
                    }
                }
            }
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                int[] iArr = this.A06;
                int i18 = r4.A01 + i3;
                if ((iArr[i18] & 31) == 2) {
                    r9.Auy(i18, 1, this.A02.A02(i18, r4.A02 + i3));
                }
            }
            i = r4.A01;
            i2 = r4.A02;
        }
        r9.A00();
    }

    public final void A03(AnonymousClass1PH r2) {
        A02(new C29231Pc(r2));
    }

    public C46291zV(C46251zQ r10, List list, int[] iArr, int[] iArr2, boolean z) {
        C46281zU r0;
        this.A03 = list;
        this.A06 = iArr;
        this.A05 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(this.A05, 0);
        this.A02 = r10;
        this.A01 = r10.A01();
        this.A00 = r10.A00();
        this.A04 = z;
        if (this.A03.isEmpty()) {
            r0 = null;
        } else {
            r0 = (C46281zU) this.A03.get(0);
        }
        if (!(r0 != null && r0.A01 == 0 && r0.A02 == 0)) {
            C46281zU r1 = new C46281zU();
            r1.A01 = 0;
            r1.A02 = 0;
            r1.A03 = false;
            r1.A00 = 0;
            r1.A04 = false;
            this.A03.add(0, r1);
        }
        int i = this.A01;
        int i2 = this.A00;
        for (int size = this.A03.size() - 1; size >= 0; size--) {
            C46281zU r6 = (C46281zU) this.A03.get(size);
            int i3 = r6.A01;
            int i4 = r6.A00;
            int i5 = i3 + i4;
            int i6 = r6.A02 + i4;
            if (this.A04) {
                while (i > i5) {
                    int i7 = i - 1;
                    if (this.A06[i7] == 0) {
                        A01(i, i2, size, false);
                    }
                    i = i7;
                }
                while (i2 > i6) {
                    int i8 = i2 - 1;
                    if (this.A05[i8] == 0) {
                        A01(i, i2, size, true);
                    }
                    i2 = i8;
                }
            }
            for (int i9 = 0; i9 < r6.A00; i9++) {
                int i10 = r6.A01 + i9;
                int i11 = r6.A02 + i9;
                int i12 = 2;
                if (this.A02.A03(i10, i11)) {
                    i12 = 1;
                }
                this.A06[i10] = (i11 << 5) | i12;
                this.A05[i11] = (i10 << 5) | i12;
            }
            i = r6.A01;
            i2 = r6.A02;
        }
    }

    public static AnonymousClass22F A00(List list, int i, boolean z) {
        int size = list.size() - 1;
        while (size >= 0) {
            AnonymousClass22F r3 = (AnonymousClass22F) list.get(size);
            if (r3.A00 == i && r3.A01 == z) {
                list.remove(size);
                while (size < list.size()) {
                    AnonymousClass22F r2 = (AnonymousClass22F) list.get(size);
                    int i2 = r2.A02;
                    int i3 = -1;
                    if (z) {
                        i3 = 1;
                    }
                    r2.A02 = i2 + i3;
                    size++;
                }
                return r3;
            }
            size--;
        }
        return null;
    }
}
