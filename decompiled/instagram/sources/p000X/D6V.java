package p000X;

/* renamed from: X.D6V */
public final class D6V implements D7Z {
    public final D7Z[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r4 > r17) goto L_0x0025;
     */
    public final boolean A9i(long j) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long AQr = AQr();
            if (AQr == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (D7Z d7z : this.A00) {
                long AQr2 = d7z.AQr();
                long j2 = j;
                if (AQr2 != Long.MIN_VALUE) {
                    z2 = true;
                }
                z2 = false;
                if (AQr2 == AQr || z2) {
                    z |= d7z.A9i(j2);
                }
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    public final long AHH(long j) {
        D7Z[] d7zArr = this.A00;
        int length = d7zArr.length;
        int i = 0;
        long j2 = Long.MAX_VALUE;
        while (true) {
            if (i >= length) {
                break;
            }
            long AHH = d7zArr[i].AHH(j);
            if (AHH <= 0) {
                j2 = 0;
                break;
            }
            j2 = Math.min(j2, AHH);
            i++;
        }
        if (j2 == Long.MAX_VALUE) {
            return 0;
        }
        return j2;
    }

    public final long AHJ() {
        long j = Long.MAX_VALUE;
        for (D7Z AHJ : this.A00) {
            long AHJ2 = AHJ.AHJ();
            if (AHJ2 != Long.MIN_VALUE) {
                j = Math.min(j, AHJ2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long AQr() {
        long j = Long.MAX_VALUE;
        for (D7Z AQr : this.A00) {
            long AQr2 = AQr.AQr();
            if (AQr2 != Long.MIN_VALUE) {
                j = Math.min(j, AQr2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final void BZR(long j) {
        for (D7Z BZR : this.A00) {
            BZR.BZR(j);
        }
    }

    public final void BjU(boolean z) {
        for (D7Z BjU : this.A00) {
            BjU.BjU(z);
        }
    }

    public D6V(D7Z[] d7zArr) {
        this.A00 = d7zArr;
    }
}
