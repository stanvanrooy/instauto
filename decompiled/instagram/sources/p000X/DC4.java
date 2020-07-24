package p000X;

import java.util.Deque;
import java.util.LinkedList;
import org.webrtc.MediaCodecVideoEncoder;

/* renamed from: X.DC4 */
public final class DC4 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A06;
    public D1O A07;
    public final BME A08;
    public final Deque A09 = new LinkedList();
    public final Deque A0A = new LinkedList();

    public static long A00(long j, long j2, long j3, long j4) {
        long j5 = j3;
        double pow = Math.pow((double) j2, 2.0d);
        if (j3 == 0) {
            return 0;
        }
        return (long) Math.sqrt(((((double) (j3 - 1)) * pow) / ((double) j5)) + (Math.pow((double) (j4 - j), 2.0d) / ((double) (j3 + 1))));
    }

    public static void A01(DC4 dc4) {
        long ACp = dc4.A08.ACp();
        while (dc4.A09.size() > 10 && ACp - ((DC9) dc4.A09.getFirst()).A00 > MediaCodecVideoEncoder.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS) {
            dc4.A09.removeFirst();
            dc4.A06 = true;
        }
        while (dc4.A0A.size() > 10 && ACp - ((DCA) dc4.A0A.getFirst()).A00 > MediaCodecVideoEncoder.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS) {
            dc4.A0A.removeFirst();
            dc4.A06 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0190, code lost:
        return r0;
     */
    public final synchronized D1O A02() {
        D1O d1o;
        synchronized (this) {
            try {
                A01(this);
                if (!this.A06) {
                    d1o = this.A07;
                } else if (this.A09.isEmpty() || this.A0A.isEmpty()) {
                    this.A07 = new D1O();
                    this.A06 = false;
                    d1o = this.A07;
                } else {
                    double[] dArr = new double[this.A0A.size()];
                    double[] dArr2 = new double[this.A09.size()];
                    long ACp = this.A08.ACp();
                    double d = 0.0d;
                    double d2 = 0.0d;
                    int i = 0;
                    for (DC9 dc9 : this.A09) {
                        double d3 = (double) (ACp - dc9.A00);
                        Double.isNaN(d3);
                        double exp = Math.exp((d3 / 1000.0d) * -0.1d);
                        double d4 = (double) dc9.A01;
                        Double.isNaN(d4);
                        double d5 = exp * d4;
                        d += Math.log((double) dc9.A00) * d5;
                        d2 += d5;
                        dArr2[i] = d5;
                        i++;
                    }
                    int i2 = 0;
                    double d6 = 0.0d;
                    double d7 = 0.0d;
                    for (DCA dca : this.A0A) {
                        double d8 = (double) (ACp - dca.A00);
                        Double.isNaN(d8);
                        double exp2 = Math.exp((d8 / 1000.0d) * -0.25d);
                        double d9 = (double) dca.A01;
                        Double.isNaN(d9);
                        double d10 = exp2 * d9;
                        d7 += Math.log((double) dca.A00) * d10;
                        d6 += d10;
                        dArr[i2] = d10;
                        i2++;
                    }
                    long exp3 = (long) Math.exp(d / d2);
                    long exp4 = (long) Math.exp(d7 / d6);
                    long j = -1;
                    int i3 = 0;
                    for (DC9 dc92 : this.A09) {
                        double d11 = (double) j;
                        Double.isNaN(d11);
                        j = (long) (d11 + ((dArr2[i3] * Math.pow((double) ((dc92.A00 - exp3) / 1000), 2.0d)) / d2));
                        i3++;
                    }
                    int i4 = 0;
                    long j2 = -1;
                    for (DCA dca2 : this.A0A) {
                        try {
                            double d12 = (double) j2;
                            Double.isNaN(d12);
                            j2 = (long) (d12 + ((dArr[i4] * Math.pow((double) (dca2.A00 - exp4), 2.0d)) / d6));
                            i4++;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    long sqrt = (long) Math.sqrt((double) j2);
                    long sqrt2 = ((long) Math.sqrt((double) j)) * 1000;
                    long j3 = (long) d6;
                    long j4 = (long) d2;
                    this.A07 = new D1O(exp4, j3, sqrt, exp3, j4, sqrt2, this.A04, this.A05, this.A02, this.A03, (this.A09.size() + this.A0A.size()) / 2, this.A01, this.A00);
                    this.A06 = false;
                    d1o = this.A07;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public DC4(BME bme) {
        this.A08 = bme;
        this.A07 = new D1O();
        this.A06 = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0;
    }
}
