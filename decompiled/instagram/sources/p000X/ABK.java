package p000X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableType;

/* renamed from: X.ABK */
public abstract class ABK {
    public int A00;
    public ABP A01;
    public Callback A02;
    public boolean A03 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c8, code lost:
        if ((r14 > 0.0d && ((r24 < r12 && r0 > r12) || (r24 > r12 && r0 < r12))) != false) goto L_0x01ca;
     */
    public void A01(long j) {
        double d;
        double d2;
        double d3;
        long j2 = j;
        if (this instanceof ABB) {
            ABB abb = (ABB) this;
            long j3 = j / 1000000;
            if (!abb.A0E) {
                if (abb.A0A == 0) {
                    ABB abb2 = abb;
                    abb2.A03 = abb.A01.A01;
                    abb2.A0A = 1;
                }
                ABB abb3 = abb;
                C23179ABh aBh = abb3.A0F;
                double d4 = abb3.A01.A01;
                aBh.A00 = d4;
                ABB abb4 = abb;
                abb4.A08 = d4;
                abb4.A0C = j3;
                abb4.A09 = 0.0d;
                abb4.A0E = true;
            }
            double d5 = ((double) (j3 - abb.A0C)) / 1000.0d;
            if (!ABB.A00(abb)) {
                double d6 = 0.064d;
                if (d5 <= 0.064d) {
                    d6 = d5;
                }
                ABB abb5 = abb;
                double d7 = abb5.A09 + d6;
                abb5.A09 = d7;
                double d8 = abb5.A05;
                double d9 = abb5.A06;
                ABB abb6 = abb;
                double d10 = abb6.A07;
                double d11 = -abb6.A02;
                double sqrt = d8 / (Math.sqrt(d10 * d9) * 2.0d);
                double sqrt2 = Math.sqrt(d10 / d9);
                double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
                ABB abb7 = abb;
                double d12 = abb7.A01;
                double d13 = abb7.A08;
                double d14 = d13;
                double d15 = d12 - d13;
                if (sqrt < 1.0d) {
                    double exp = Math.exp((-sqrt) * sqrt2 * d7);
                    double d16 = sqrt * sqrt2;
                    double d17 = d11 + (d16 * d15);
                    double d18 = d7 * sqrt3;
                    double sin = Math.sin(d18);
                    double cos = Math.cos(d18);
                    double d19 = cos * d15;
                    d = d12 - ((((d17 / sqrt3) * sin) + d19) * exp);
                    d2 = ((d16 * exp) * (((sin * d17) / sqrt3) + d19)) - (((cos * d17) - ((sqrt3 * d15) * sin)) * exp);
                } else {
                    double exp2 = Math.exp((-sqrt2) * d7);
                    d = d12 - (((((sqrt2 * d15) + d11) * d7) + d15) * exp2);
                    d2 = exp2 * ((d11 * ((d7 * sqrt2) - 1.0d)) + (d7 * d15 * sqrt2 * sqrt2));
                }
                ABB abb8 = abb;
                C23179ABh aBh2 = abb8.A0F;
                aBh2.A00 = d;
                aBh2.A01 = d2;
                if (!ABB.A00(abb8)) {
                    if (abb.A0D) {
                    }
                }
                if (d10 > 0.0d) {
                    abb.A08 = d12;
                    aBh2.A00 = d12;
                } else {
                    ABB abb9 = abb;
                    abb9.A01 = d;
                    abb9.A08 = d;
                }
                aBh2.A01 = 0.0d;
            }
            ABB abb10 = abb;
            abb10.A0C = j3;
            ABP abp = abb10.A01;
            abp.A01 = abb10.A0F.A00;
            if (ABB.A00(abb)) {
                int i = abb.A0B;
                if (i == -1 || abb.A0A < i) {
                    ABB abb11 = abb;
                    abb11.A0E = false;
                    abp.A01 = abb11.A03;
                    abb.A0A++;
                    return;
                }
                abb.A03 = true;
            }
        } else if (!(this instanceof AB9)) {
            ABH abh = (ABH) this;
            long j4 = j / 1000000;
            if (abh.A05 == -1) {
                abh.A05 = j4 - 16;
                double d20 = abh.A01;
                if (d20 == abh.A02) {
                    abh.A01 = abh.A01.A01;
                } else {
                    abh.A01.A01 = d20;
                }
                abh.A02 = abh.A01.A01;
            }
            double d21 = abh.A01;
            double d22 = abh.A06;
            double d23 = 1.0d - abh.A00;
            double exp3 = d21 + ((d22 / d23) * (1.0d - Math.exp((-d23) * ((double) (j4 - abh.A05)))));
            if (Math.abs(abh.A02 - exp3) < 0.1d) {
                int i2 = abh.A04;
                if (i2 == -1 || abh.A03 < i2) {
                    abh.A05 = -1;
                    abh.A03++;
                } else {
                    abh.A03 = true;
                    return;
                }
            }
            abh.A02 = exp3;
            abh.A01.A01 = exp3;
        } else {
            AB9 ab9 = (AB9) this;
            if (ab9.A04 < 0) {
                ab9.A04 = j2;
                if (ab9.A02 == 1) {
                    ab9.A00 = ab9.A01.A01;
                }
            }
            int round = (int) Math.round(((double) ((j - ab9.A04) / 1000000)) / 16.666666666666668d);
            if (round < 0) {
                throw new IllegalStateException("Calculated frame index should never be lower than 0");
            } else if (!ab9.A03) {
                double[] dArr = ab9.A05;
                if (round >= dArr.length - 1) {
                    d3 = ab9.A01;
                    int i3 = ab9.A03;
                    if (i3 == -1 || ab9.A02 < i3) {
                        ab9.A04 = -1;
                        ab9.A02++;
                    } else {
                        ab9.A03 = true;
                    }
                } else {
                    double d24 = ab9.A00;
                    d3 = d24 + (dArr[round] * (ab9.A01 - d24));
                }
                ab9.A01.A01 = d3;
            }
        }
    }

    public void A02(C23043A0y a0y) {
        int i;
        int i2;
        int i3;
        if (this instanceof ABB) {
            ABB abb = (ABB) this;
            abb.A07 = a0y.getDouble("stiffness");
            abb.A05 = a0y.getDouble("damping");
            abb.A06 = a0y.getDouble("mass");
            abb.A02 = abb.A0F.A01;
            abb.A01 = a0y.getDouble("toValue");
            abb.A04 = a0y.getDouble("restSpeedThreshold");
            abb.A00 = a0y.getDouble("restDisplacementThreshold");
            abb.A0D = a0y.getBoolean("overshootClamping");
            boolean z = true;
            if (a0y.hasKey("iterations")) {
                i = a0y.getInt("iterations");
            } else {
                i = 1;
            }
            abb.A0B = i;
            if (i != 0) {
                z = false;
            }
            abb.A03 = z;
            abb.A0A = 0;
            abb.A09 = 0.0d;
            abb.A0E = false;
        } else if (this instanceof AB9) {
            AB9 ab9 = (AB9) this;
            A1e array = a0y.getArray("frames");
            int size = array.size();
            double[] dArr = ab9.A05;
            if (dArr == null || dArr.length != size) {
                ab9.A05 = new double[size];
            }
            boolean z2 = false;
            for (int i4 = 0; i4 < size; i4++) {
                ab9.A05[i4] = array.getDouble(i4);
            }
            double d = 0.0d;
            if (a0y.hasKey("toValue") && a0y.getType("toValue") == ReadableType.Number) {
                d = a0y.getDouble("toValue");
            }
            ab9.A01 = d;
            if (a0y.hasKey("iterations")) {
                if (a0y.getType("iterations") == ReadableType.Number) {
                    i2 = a0y.getInt("iterations");
                } else {
                    i2 = 1;
                }
                ab9.A03 = i2;
            } else {
                ab9.A03 = 1;
            }
            ab9.A02 = 1;
            if (ab9.A03 == 0) {
                z2 = true;
            }
            ab9.A03 = z2;
            ab9.A04 = -1;
        } else if (!(this instanceof ABH)) {
            throw new A0j(AnonymousClass000.A0J("Animation config for ", getClass().getSimpleName(), " cannot be reset"));
        } else {
            ABH abh = (ABH) this;
            abh.A00 = a0y.getDouble("deceleration");
            boolean z3 = true;
            if (a0y.hasKey("iterations")) {
                i3 = a0y.getInt("iterations");
            } else {
                i3 = 1;
            }
            abh.A04 = i3;
            abh.A03 = 1;
            if (i3 != 0) {
                z3 = false;
            }
            abh.A03 = z3;
            abh.A05 = -1;
            abh.A01 = 0.0d;
            abh.A02 = 0.0d;
        }
    }
}
