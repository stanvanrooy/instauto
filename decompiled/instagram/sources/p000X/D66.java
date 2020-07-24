package p000X;

import com.google.android.exoplayer2.source.TrackGroupArray;

/* renamed from: X.D66 */
public final class D66 implements D6N, C29770D8x {
    public long A00;
    public C29770D8x A01;
    public long A02 = 0;
    public D6P[] A03 = new D6P[0];
    public final D6N A04;

    public final long BXc(long j) {
        return 0;
    }

    public final void BeN(long j) {
    }

    public final boolean A00() {
        if (this.A02 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final boolean A9i(long j) {
        return this.A04.A9i(j);
    }

    public final void AC6(long j, boolean z) {
        this.A04.AC6(j, z);
    }

    public final long AFc(long j, C25949Bd1 bd1) {
        long j2;
        if (j == 0) {
            return 0;
        }
        long j3 = bd1.A01;
        long max = Math.max(0, Math.min(j3, j - 0));
        long j4 = bd1.A00;
        long j5 = this.A00;
        if (j5 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j5 - j;
        }
        long max2 = Math.max(0, Math.min(j4, j2));
        if (!(max == j3 && max2 == j4)) {
            bd1 = new C25949Bd1(max, max2);
        }
        return this.A04.AFc(j, bd1);
    }

    public final long AHH(long j) {
        return this.A04.AHH(j);
    }

    public final long AHJ() {
        long AHJ = this.A04.AHJ();
        if (AHJ != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || AHJ < j) {
                return AHJ;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long AQr() {
        long AQr = this.A04.AQr();
        if (AQr != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || AQr < j) {
                return AQr;
            }
        }
        return Long.MIN_VALUE;
    }

    public final TrackGroupArray AYp() {
        return this.A04.AYp();
    }

    public final void Ap1() {
        this.A04.Ap1();
    }

    public final /* bridge */ /* synthetic */ void AyM(D7Z d7z) {
        this.A01.AyM(this);
    }

    public final void BFJ(D6N d6n) {
        this.A01.BFJ(this);
    }

    public final void BXr(C29770D8x d8x, long j) {
        this.A01 = d8x;
        this.A04.BXr(this, j);
    }

    public final void BZR(long j) {
        this.A04.BZR(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r9 > r0) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    public final long Bf7(D4t[] d4tArr, boolean[] zArr, D7Y[] d7yArr, boolean[] zArr2, long j) {
        boolean z;
        int length = d7yArr.length;
        D6P[] d6pArr = new D6P[length];
        this.A03 = d6pArr;
        D7Y[] d7yArr2 = new D7Y[length];
        int i = 0;
        while (true) {
            D7Y d7y = null;
            if (i >= length) {
                break;
            }
            D6P d6p = d7yArr[i];
            d6pArr[i] = d6p;
            if (d6p != null) {
                d7y = d6p.A01;
            }
            d7yArr2[i] = d7y;
            i++;
        }
        long Bf7 = this.A04.Bf7(d4tArr, zArr, d7yArr2, zArr2, j);
        this.A02 = -9223372036854775807L;
        if (Bf7 != j) {
            if (Bf7 >= 0) {
                long j2 = this.A00;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            z = false;
            D6U.A03(z);
            for (int i2 = 0; i2 < length; i2++) {
                D7Y d7y2 = d7yArr2[i2];
                if (d7y2 == null) {
                    this.A03[i2] = null;
                } else if (d7yArr[i2] == null || this.A03[i2].A01 != d7y2) {
                    this.A03[i2] = new D6P(this, d7y2);
                }
                d7yArr[i2] = this.A03[i2];
            }
            return Bf7;
        }
        z = true;
        D6U.A03(z);
        while (i2 < length) {
        }
        return Bf7;
    }

    public final void BjU(boolean z) {
        this.A04.BjU(z);
    }

    public D66(D6N d6n, long j) {
        this.A04 = d6n;
        this.A00 = j;
    }

    public final long BZ0() {
        if (A00()) {
            long j = this.A02;
            this.A02 = -9223372036854775807L;
            long BZ0 = BZ0();
            if (BZ0 != -9223372036854775807L) {
                return BZ0;
            }
            return j;
        }
        long BZ02 = this.A04.BZ0();
        if (BZ02 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        boolean z2 = false;
        if (BZ02 >= 0) {
            z2 = true;
        }
        D6U.A03(z2);
        long j2 = this.A00;
        if (j2 != Long.MIN_VALUE && BZ02 > j2) {
            z = false;
        }
        D6U.A03(z);
        return BZ02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5 > r3) goto L_0x0034;
     */
    public final long Bf0(long j) {
        this.A02 = -9223372036854775807L;
        boolean z = false;
        for (D6P d6p : this.A03) {
            if (d6p != null) {
                d6p.A00 = false;
            }
        }
        long Bf0 = this.A04.Bf0(j);
        if (Bf0 != j) {
            if (Bf0 >= 0) {
                long j2 = this.A00;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            D6U.A03(z);
            return Bf0;
        }
        z = true;
        D6U.A03(z);
        return Bf0;
    }
}
