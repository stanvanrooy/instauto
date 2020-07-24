package p000X;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.DC5 */
public class DC5 {
    public int A00 = 0;
    public long A01 = -1;
    public long A02 = 0;
    public DC4 A03 = new DC4(BME.A00);
    public DC6 A04 = new DC6();
    public int A05 = 0;

    public synchronized void A01() {
        this.A04 = new DC6();
        this.A01 = -1;
        this.A03 = new DC4(BME.A00);
        this.A02 = 0;
        this.A05 = 0;
        this.A00 = 0;
    }

    public synchronized void A02(DC7 dc7, boolean z, boolean z2) {
        int i;
        DCC dcc;
        float f;
        long j;
        synchronized (this) {
            this.A05++;
            DC7 dc72 = dc7;
            long j2 = dc72.A06;
            long j3 = 0;
            if (j2 > 0 && !dc72.A09 && !dc72.A0A) {
                long j4 = dc72.A05;
                long j5 = ((long) dc72.A00) - j4;
                long j6 = j5 + ((long) dc72.A02);
                long j7 = j4 + j2 + j6;
                if (j6 > 0) {
                    j3 = (((long) dc72.A03) * 8000) / j6;
                }
                int i2 = dc72.A03;
                if (i2 > 0) {
                    i = (int) Math.sqrt((double) i2);
                } else {
                    i = 0;
                }
                long j8 = (long) i2;
                long j9 = j8;
                DC4 dc4 = this.A03;
                long j10 = j8;
                long j11 = dc72.A07;
                long j12 = dc72.A04;
                synchronized (dc4) {
                    if (j5 > 0 && j6 > j5 && j9 > 0) {
                        if (z) {
                            try {
                                dc4.A0A.add(new DCA(j5, j10, dc4.A08.ACp()));
                                if (j11 > 0) {
                                    long j13 = j5 - j11;
                                    int i3 = dc4.A01;
                                    long min = Math.min(20, (long) i3);
                                    long j14 = dc4.A04;
                                    long A002 = DC4.A00(j14, dc4.A05, min, j13);
                                    dc4.A04 = ((j14 * min) + j13) / (min + 1);
                                    dc4.A05 = A002;
                                    dc4.A01 = i3 + 1;
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        if (z2) {
                            dc4.A09.add(new DC9(j5, j6, j10, dc4.A08.ACp()));
                            if (j12 >= 0) {
                                long j15 = ((8 * j9) / (j6 - j5)) - (j12 / 1000);
                                int i4 = dc4.A00;
                                long min2 = Math.min(20, (long) i4);
                                long j16 = dc4.A02 / 1000;
                                long j17 = ((j16 * min2) + j15) / (min2 + 1);
                                long A003 = DC4.A00(j16, dc4.A03 / 1000, min2, j15);
                                dc4.A02 = j17 * 1000;
                                dc4.A03 = A003 * 1000;
                                dc4.A00 = i4 + 1;
                            }
                        }
                        DC4.A01(dc4);
                        dc4.A06 = true;
                    }
                }
                if (z && z2) {
                    synchronized (this) {
                        try {
                            this.A02 = Math.max(this.A02, j7);
                            if (j3 > 0) {
                                DC6 dc6 = this.A04;
                                float f2 = (float) j3;
                                if (dc6.A00 != 1) {
                                    Collections.sort(dc6.A05, DC6.A07);
                                    dc6.A00 = 1;
                                }
                                int i5 = dc6.A03;
                                if (i5 > 0) {
                                    DCC[] dccArr = dc6.A06;
                                    int i6 = i5 - 1;
                                    dc6.A03 = i6;
                                    dcc = dccArr[i6];
                                } else {
                                    dcc = new DCC();
                                }
                                int i7 = dc6.A02;
                                dc6.A02 = i7 + 1;
                                dcc.A01 = i7;
                                dcc.A02 = i;
                                dcc.A00 = f2;
                                dc6.A05.add(dcc);
                                dc6.A04 += i;
                                while (dc6.A04 > dc6.A01 && !dc6.A05.isEmpty()) {
                                    int i8 = dc6.A04 - dc6.A01;
                                    DCC dcc2 = (DCC) dc6.A05.get(0);
                                    int i9 = dcc2.A02;
                                    if (i9 <= i8) {
                                        dc6.A04 -= i9;
                                        dc6.A05.remove(0);
                                        int i10 = dc6.A03;
                                        if (i10 < 5) {
                                            DCC[] dccArr2 = dc6.A06;
                                            dc6.A03 = i10 + 1;
                                            dccArr2[i10] = dcc2;
                                        }
                                    } else {
                                        dcc2.A02 = i9 - i8;
                                        dc6.A04 -= i8;
                                    }
                                }
                                DC6 dc62 = this.A04;
                                if (dc62.A00 != 0) {
                                    Collections.sort(dc62.A05, DC6.A08);
                                    dc62.A00 = 0;
                                }
                                float f3 = 0.5f * ((float) dc62.A04);
                                int i11 = 0;
                                int i12 = 0;
                                while (true) {
                                    if (i11 < dc62.A05.size()) {
                                        DCC dcc3 = (DCC) dc62.A05.get(i11);
                                        i12 += dcc3.A02;
                                        if (((float) i12) >= f3) {
                                            f = dcc3.A00;
                                            break;
                                        }
                                        i11++;
                                    } else if (dc62.A05.isEmpty()) {
                                        f = Float.NaN;
                                    } else {
                                        ArrayList arrayList = dc62.A05;
                                        f = ((DCC) arrayList.get(arrayList.size() - 1)).A00;
                                    }
                                }
                                if (Float.isNaN(f)) {
                                    j = -1;
                                } else {
                                    j = (long) f;
                                }
                                this.A01 = j;
                                this.A00++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
