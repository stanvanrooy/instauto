package p000X;

/* renamed from: X.0Hm  reason: invalid class name and case insensitive filesystem */
public abstract class C05010Hm {
    public long A00;
    public long A01;
    public final AnonymousClass0SM A02;
    public final AnonymousClass0IG[] A03;
    public final AnonymousClass0SM A04;
    public final C10910e4 A05;

    public int A02(AnonymousClass0IG r2) {
        return 0;
    }

    public abstract int[] A03(AnonymousClass0IG r1);

    public C05010Hm(AnonymousClass0IG[] r19, C10910e4 r20) {
        int length;
        AnonymousClass0IG[] r12 = r19;
        this.A03 = r12;
        this.A05 = r20;
        if (r19 == null || (length = r12.length) == 0) {
            this.A02 = null;
            this.A04 = null;
            this.A00 = 0;
            this.A01 = 0;
        } else if (length <= 64) {
            this.A02 = new C10810du(30);
            this.A04 = new C10810du(4);
            AnonymousClass0SM r10 = this.A02;
            long j = 0;
            long j2 = 0;
            long j3 = 1;
            int i = 0;
            long j4 = 0;
            while (i < length) {
                int[] A032 = A03(r19[i]);
                if (A032 != null) {
                    int length2 = A032.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        int i3 = A032[i2];
                        if (i3 == -1) {
                            j4 |= j3;
                        } else if (i3 != -2) {
                            r10.put(i3, r10.get(i3, j) | j3);
                            i2++;
                            j = 0;
                        }
                        j2 |= j3;
                        i2++;
                        j = 0;
                    }
                }
                i++;
                j3 <<= 1;
            }
            this.A00 = j4;
            this.A01 = j2;
            AnonymousClass0SM r7 = this.A04;
            long j5 = 1;
            int i4 = 0;
            while (i4 < length) {
                int A022 = A02(r19[i4]);
                if (A022 != 0) {
                    r7.put(A022, r7.get(A022, 0) | j5);
                }
                i4++;
                j5 <<= 1;
            }
        } else {
            throw new UnsupportedOperationException("We support up to 64 listeners");
        }
    }

    public final long A01(int i, int i2) {
        AnonymousClass0SM r4 = this.A02;
        if (r4 == null || this.A03 == null) {
            return 0;
        }
        return this.A04.get(i2, 0) | this.A00 | r4.get(i, 0);
    }
}
