package p000X;

import android.util.Log;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* renamed from: X.DAM */
public final class DAM {
    public long A00;
    public DAM A01;
    public DAZ A02;
    public TrackGroupArray A03;
    public DAL A04;
    public boolean A05;
    public boolean A06;
    public DAL A07;
    public final D6N A08;
    public final Object A09;
    public final C29804DAo[] A0A;
    public final D7Y[] A0B;
    public final boolean[] A0C;
    public final D6R A0D;
    public final DAf A0E;

    public final long A01(long j, boolean z, boolean[] zArr) {
        DAL dal;
        C29804DAo[] dAoArr;
        int i = 0;
        while (true) {
            dal = this.A04;
            boolean z2 = true;
            if (i >= dal.A00) {
                break;
            }
            boolean[] zArr2 = this.A0C;
            if (z || !dal.A00(this.A07, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        D7Y[] d7yArr = this.A0B;
        int i2 = 0;
        while (true) {
            C29804DAo[] dAoArr2 = this.A0A;
            if (i2 >= dAoArr2.length) {
                break;
            }
            if (dAoArr2[i2].AYr() == 6) {
                d7yArr[i2] = null;
            }
            i2++;
        }
        A00(dal);
        DAK dak = dal.A01;
        long Bf7 = this.A08.Bf7(dak.A00(), this.A0C, this.A0B, zArr, j);
        D7Y[] d7yArr2 = this.A0B;
        int i3 = 0;
        while (true) {
            dAoArr = this.A0A;
            if (i3 >= dAoArr.length) {
                break;
            }
            if (dAoArr[i3].AYr() == 6) {
                boolean z3 = false;
                if (this.A04.A03[i3] != null) {
                    z3 = true;
                }
                if (z3) {
                    d7yArr2[i3] = new C29738D7e();
                }
            }
            i3++;
        }
        this.A05 = false;
        for (int i4 = 0; i4 < d7yArr2.length; i4++) {
            if (d7yArr2[i4] != null) {
                boolean z4 = false;
                if (this.A04.A03[i4] != null) {
                    z4 = true;
                }
                D6U.A03(z4);
                if (dAoArr[i4].AYr() != 6) {
                    this.A05 = true;
                }
            } else {
                boolean z5 = false;
                if (dak.A02[i4] == null) {
                    z5 = true;
                }
                D6U.A03(z5);
            }
        }
        return Bf7;
    }

    public final void A03() {
        A00((DAL) null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0D.BaS(((D66) this.A08).A04);
            } else {
                this.A0D.BaS(this.A08);
            }
        } catch (RuntimeException e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    private void A00(DAL dal) {
        DAL dal2 = this.A07;
        if (dal2 != null) {
            for (int i = 0; i < dal2.A00; i++) {
            }
        }
        this.A07 = dal;
        if (dal != null) {
            for (int i2 = 0; i2 < dal.A00; i2++) {
            }
        }
    }

    public final long A02(boolean z) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long AHJ = this.A08.AHJ();
        if (AHJ != Long.MIN_VALUE || !z) {
            return AHJ;
        }
        return this.A02.A01;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    public final boolean A04() {
        boolean z;
        DAL A052 = this.A0E.A05(this.A0A, this.A03);
        DAL dal = this.A07;
        if (dal != null && dal.A01.A01 == A052.A01.A01) {
            int i = 0;
            while (true) {
                if (i < A052.A01.A01) {
                    if (!A052.A00(dal, i)) {
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.A04 = A052;
            for (int i2 = 0; i2 < A052.A01.A00().length; i2++) {
            }
            return true;
        }
        z = false;
        if (!z) {
        }
    }

    public DAM(C29804DAo[] dAoArr, long j, DAf dAf, C29736D7a d7a, D6R d6r, Object obj, DAZ daz) {
        D6N d6n;
        this.A0A = dAoArr;
        this.A00 = j - daz.A03;
        this.A0E = dAf;
        this.A0D = d6r;
        D6U.A01(obj);
        this.A09 = obj;
        this.A02 = daz;
        int length = dAoArr.length;
        this.A0B = new D7Y[length];
        this.A0C = new boolean[length];
        D6N AAq = d6r.AAq(daz.A04, d7a);
        long j2 = daz.A02;
        if (j2 != Long.MIN_VALUE) {
            d6n = new D66(AAq, j2);
        } else {
            d6n = AAq;
        }
        this.A08 = d6n;
    }
}
