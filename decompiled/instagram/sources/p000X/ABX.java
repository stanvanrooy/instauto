package p000X;

import com.facebook.react.bridge.Callback;
import java.util.List;

/* renamed from: X.ABX */
public abstract class ABX {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = -1;
    public List A03;

    public void A01() {
        String str;
        String num;
        if (this instanceof ABI) {
            ABI abi = (ABI) this;
            abi.A04.putDouble("toValue", ((ABP) ((ABX) abi.A03.A03.get(abi.A01))).A04());
            abi.A03.A03(abi.A00, abi.A02, abi.A04, (Callback) null);
        } else if (this instanceof C23169AAx) {
            C23169AAx aAx = (C23169AAx) this;
            int i = 0;
            while (true) {
                int[] iArr = aAx.A01;
                if (i < iArr.length) {
                    ABX abx = (ABX) aAx.A00.A03.get(iArr[i]);
                    if (abx != null && (abx instanceof ABP)) {
                        ABP abp = (ABP) abx;
                        double A04 = abp.A04();
                        if (i == 0) {
                            aAx.A01 = A04;
                        } else {
                            aAx.A01 -= abp.A04();
                        }
                        i++;
                    }
                } else {
                    return;
                }
            }
            throw new A0j("Illegal node ID set as an input for Animated.subtract node");
        } else if (this instanceof C23170AAy) {
            C23170AAy aAy = (C23170AAy) this;
            aAy.A01 = 1.0d;
            int i2 = 0;
            while (true) {
                int[] iArr2 = aAy.A01;
                if (i2 < iArr2.length) {
                    ABX abx2 = (ABX) aAy.A00.A03.get(iArr2[i2]);
                    if (abx2 != null && (abx2 instanceof ABP)) {
                        aAy.A01 *= ((ABP) abx2).A04();
                        i2++;
                    }
                } else {
                    return;
                }
            }
            throw new A0j("Illegal node ID set as an input for Animated.multiply node");
        } else if (this instanceof ABT) {
            ABT abt = (ABT) this;
            ABX abx3 = (ABX) abt.A02.A03.get(abt.A01);
            if (abx3 == null || !(abx3 instanceof ABP)) {
                throw new A0j("Illegal node ID set as an input for Animated.modulus node");
            }
            double A042 = ((ABP) abx3).A04();
            double d = abt.A00;
            abt.A01 = ((A042 % d) + d) % d;
        } else if (this instanceof C23158AAm) {
            C23158AAm aAm = (C23158AAm) this;
            ABP abp2 = aAm.A01;
            if (abp2 != null) {
                double A043 = abp2.A04();
                double A002 = C23158AAm.A00(A043, aAm.A09, aAm.A0A, aAm.A05, aAm.A06);
                aAm.A01 = A002;
                if (aAm.A08) {
                    if (aAm.A00 > 1) {
                        StringBuffer stringBuffer = new StringBuffer(aAm.A02.length());
                        aAm.A07.reset();
                        int i3 = 0;
                        while (aAm.A07.find()) {
                            int i4 = i3 + 1;
                            double A003 = C23158AAm.A00(A043, aAm.A09, aAm.A04[i3], aAm.A05, aAm.A06);
                            if (aAm.A03) {
                                boolean z = false;
                                if (i4 == 4) {
                                    z = true;
                                }
                                if (z) {
                                    A003 *= 1000.0d;
                                }
                                int round = (int) Math.round(A003);
                                if (z) {
                                    A003 = ((double) round) / 1000.0d;
                                } else {
                                    num = Integer.toString(round);
                                    aAm.A07.appendReplacement(stringBuffer, num);
                                    i3 = i4;
                                }
                            } else {
                                int i5 = (int) A003;
                                if (((double) i5) == A003) {
                                    num = Integer.toString(i5);
                                    aAm.A07.appendReplacement(stringBuffer, num);
                                    i3 = i4;
                                }
                            }
                            num = Double.toString(A003);
                            aAm.A07.appendReplacement(stringBuffer, num);
                            i3 = i4;
                        }
                        aAm.A07.appendTail(stringBuffer);
                        str = stringBuffer.toString();
                    } else {
                        str = aAm.A07.replaceFirst(String.valueOf(A002));
                    }
                    aAm.A03 = str;
                }
            }
        } else if (this instanceof AB0) {
            AB0 ab0 = (AB0) this;
            int i6 = 0;
            while (true) {
                int[] iArr3 = ab0.A01;
                if (i6 < iArr3.length) {
                    ABX abx4 = (ABX) ab0.A00.A03.get(iArr3[i6]);
                    if (abx4 != null && (abx4 instanceof ABP)) {
                        double A044 = ((ABP) abx4).A04();
                        if (i6 == 0) {
                            ab0.A01 = A044;
                        } else if (A044 != 0.0d) {
                            ab0.A01 /= A044;
                        } else {
                            throw new A0j(AnonymousClass000.A05("Detected a division by zero in Animated.divide node with Animated ID ", ab0.A02));
                        }
                        i6++;
                    }
                } else {
                    return;
                }
            }
            throw new A0j(AnonymousClass000.A05("Illegal node ID set as an input for Animated.divide node with Animated ID ", ab0.A02));
        } else if (this instanceof C23168AAw) {
            C23168AAw aAw = (C23168AAw) this;
            ABX abx5 = (ABX) aAw.A04.A03.get(aAw.A03);
            if (abx5 == null || !(abx5 instanceof ABP)) {
                throw new A0j("Illegal node ID set as an input for Animated.DiffClamp node");
            }
            double A045 = ((ABP) abx5).A04();
            double d2 = A045 - aAw.A00;
            aAw.A00 = A045;
            aAw.A01 = Math.min(Math.max(aAw.A01 + d2, aAw.A02), aAw.A01);
        } else if (this instanceof C23171AAz) {
            C23171AAz aAz = (C23171AAz) this;
            aAz.A01 = 0.0d;
            int i7 = 0;
            while (true) {
                int[] iArr4 = aAz.A01;
                if (i7 < iArr4.length) {
                    ABX abx6 = (ABX) aAz.A00.A03.get(iArr4[i7]);
                    if (abx6 != null && (abx6 instanceof ABP)) {
                        aAz.A01 += ((ABP) abx6).A04();
                        i7++;
                    }
                } else {
                    return;
                }
            }
            throw new A0j("Illegal node ID set as an input for Animated.Add node");
        }
    }

    public void A02(ABX abx) {
        if (this instanceof C23158AAm) {
            C23158AAm aAm = (C23158AAm) this;
            if (aAm.A01 != null) {
                throw new IllegalStateException("Parent already attached");
            } else if (abx instanceof ABP) {
                aAm.A01 = (ABP) abx;
            } else {
                throw new IllegalArgumentException("Parent is of an invalid type");
            }
        }
    }

    public void A03(ABX abx) {
        if (this instanceof C23158AAm) {
            C23158AAm aAm = (C23158AAm) this;
            if (abx == aAm.A01) {
                aAm.A01 = null;
                return;
            }
            throw new IllegalArgumentException("Invalid parent node provided");
        }
    }
}
