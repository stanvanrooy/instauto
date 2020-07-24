package p000X;

/* renamed from: X.DAU */
public final class DAU {
    public long A00;
    public long A01;
    public C29794DAd A02;
    public Object A03;
    public Object A04;

    public final int A00(int i) {
        int i2;
        C29793DAc dAc = this.A02.A02[i];
        int i3 = 0;
        while (true) {
            int[] iArr = dAc.A01;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    public final int A01(long j) {
        int length;
        C29794DAd dAd = this.A02;
        int i = 0;
        while (true) {
            long[] jArr = dAd.A01;
            length = jArr.length;
            if (i >= length) {
                break;
            }
            long j2 = jArr[i];
            if (j2 == Long.MIN_VALUE || (j < j2 && dAd.A02[i].A00())) {
                break;
            }
            i++;
        }
        if (i >= length) {
            return -1;
        }
        return i;
    }

    public final int A02(long j) {
        C29794DAd dAd = this.A02;
        long[] jArr = dAd.A01;
        int length = jArr.length - 1;
        while (length >= 0) {
            long j2 = jArr[length];
            if (j2 != Long.MIN_VALUE && j2 <= j) {
                break;
            }
            length--;
        }
        if (length < 0 || !dAd.A02[length].A00()) {
            return -1;
        }
        return length;
    }

    public final long A03(int i, int i2) {
        C29793DAc dAc = this.A02.A02[i];
        if (dAc.A00 != -1) {
            return dAc.A02[i2];
        }
        return -9223372036854775807L;
    }

    public final boolean A04(int i, int i2) {
        C29793DAc dAc = this.A02.A02[i];
        if (dAc.A00 == -1 || dAc.A01[i2] == 0) {
            return false;
        }
        return true;
    }
}
