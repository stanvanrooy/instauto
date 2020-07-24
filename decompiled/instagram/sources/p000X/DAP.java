package p000X;

import android.util.Pair;

/* renamed from: X.DAP */
public final class DAP {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public DAM A04;
    public DAM A05;
    public DAM A06;
    public C29742D7o A07;
    public Object A08;
    public boolean A09;
    public final DAU A0A = new DAU();
    public final D7h A0B = new D7h();

    public static DAZ A03(DAP dap, DAZ daz, C29791DAa dAa) {
        long j;
        DAZ daz2 = daz;
        long j2 = daz.A03;
        long j3 = daz.A02;
        C29791DAa dAa2 = dAa;
        boolean A072 = dap.A07(dAa, j3);
        boolean A082 = dap.A08(dAa, A072);
        dap.A07.A05(dAa2.A02, dap.A0A, false);
        if (dAa2.A01()) {
            j = dap.A0A.A03(dAa2.A00, dAa2.A01);
        } else if (j3 == Long.MIN_VALUE) {
            j = dap.A0A.A00;
        } else {
            j = j3;
        }
        return new DAZ(dAa2, j2, j3, daz2.A00, j, A072, A082);
    }

    public static DAZ A04(DAP dap, C29791DAa dAa, long j, long j2) {
        DAP dap2 = dap;
        dap.A07.A05(dAa.A02, dap.A0A, false);
        if (dAa.A01()) {
            DAU dau = dap.A0A;
            int i = dAa.A00;
            int i2 = dAa.A01;
            if (!dau.A04(i, i2)) {
                return null;
            }
            return dap2.A00(dAa.A02, i, i2, j, dAa.A03);
        }
        return dap2.A01(dAa.A02, j2, dAa.A03);
    }

    public final boolean A0D(DAM dam) {
        boolean z = false;
        boolean z2 = false;
        if (dam != null) {
            z2 = true;
        }
        D6U.A03(z2);
        this.A04 = dam;
        while (true) {
            DAM dam2 = dam.A01;
            if (dam2 != null) {
                dam = dam2;
                if (dam2 == this.A06) {
                    this.A06 = this.A05;
                    z = true;
                }
                dam2.A03();
                this.A00--;
            } else {
                this.A04.A01 = null;
                return z;
            }
        }
    }

    private DAZ A00(int i, int i2, int i3, long j, long j2) {
        int i4 = i2;
        C29791DAa dAa = new C29791DAa(i, i4, i3, j2);
        boolean A072 = A07(dAa, Long.MIN_VALUE);
        boolean A082 = A08(dAa, A072);
        long A032 = this.A07.A05(dAa.A02, this.A0A, false).A03(dAa.A00, dAa.A01);
        int A002 = this.A0A.A00(i4);
        return new DAZ(dAa, 0, Long.MIN_VALUE, j, A032, A072, A082);
    }

    private DAZ A01(int i, long j, long j2) {
        long j3;
        long j4;
        C29791DAa dAa = new C29791DAa(i, -1, -1, j2);
        this.A07.A05(dAa.A02, this.A0A, false);
        DAU dau = this.A0A;
        long j5 = j;
        int A012 = dau.A01(j5);
        if (A012 == -1) {
            j3 = Long.MIN_VALUE;
        } else {
            j3 = dau.A02.A01[A012];
        }
        boolean A072 = A07(dAa, j3);
        boolean A082 = A08(dAa, A072);
        if (j3 == Long.MIN_VALUE) {
            j4 = this.A0A.A00;
        } else {
            j4 = j3;
        }
        return new DAZ(dAa, j5, j3, -9223372036854775807L, j4, A072, A082);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    public static DAZ A02(DAP dap, DAM dam, long j) {
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        int i5;
        DAM dam2 = dam;
        DAZ daz = dam2.A02;
        DAP dap2 = dap;
        if (daz.A06) {
            int A022 = dap2.A07.A02(daz.A04.A02, dap2.A0A, dap2.A0B, dap2.A01);
            if (A022 != -1) {
                dap2.A07.A05(A022, dap2.A0A, true);
                Object obj = dap2.A0A.A04;
                long j3 = daz.A04.A03;
                dap2.A07.A06(0, dap2.A0B, false, 0);
                long j4 = 0;
                if (0 == A022) {
                    Pair A042 = dap2.A07.A04(dap2.A0B, dap2.A0A, 0, -9223372036854775807L, Math.max(0, (dam2.A00 + daz.A01) - j));
                    if (A042 != null) {
                        A022 = ((Integer) A042.first).intValue();
                        j4 = ((Long) A042.second).longValue();
                        DAM dam3 = dam2.A01;
                        if (dam3 == null || !dam3.A09.equals(obj)) {
                            j3 = dap2.A02;
                            dap2.A02 = 1 + j3;
                        } else {
                            j3 = dam2.A01.A02.A04.A03;
                        }
                    }
                }
                DAP dap3 = dap2;
                long j5 = j4;
                return A04(dap3, dap3.A05(A022, j5, j3), j5, j4);
            }
        } else {
            C29791DAa dAa = daz.A04;
            dap2.A07.A05(dAa.A02, dap2.A0A, false);
            if (dAa.A01()) {
                i = dAa.A00;
                DAU dau = dap2.A0A;
                C29793DAc dAc = dau.A02.A02[i];
                int i6 = dAc.A00;
                if (i6 != -1) {
                    i2 = dAa.A01 + 1;
                    while (true) {
                        int[] iArr = dAc.A01;
                        if (i2 < iArr.length && (i5 = iArr[i2]) != 0 && i5 != 1) {
                            i2++;
                        } else if (i2 < i6) {
                            i4 = dAa.A02;
                            j2 = daz.A00;
                        } else if (dau.A04(i, i2)) {
                            i3 = dAa.A02;
                            j2 = daz.A00;
                            return dap2.A00(i3, i, i2, j2, dAa.A03);
                        }
                    }
                    if (i2 < i6) {
                    }
                }
            } else {
                j2 = daz.A02;
                if (j2 != Long.MIN_VALUE) {
                    DAU dau2 = dap2.A0A;
                    i = dau2.A02(j2);
                    if (i == -1) {
                        i4 = dAa.A02;
                    } else {
                        i2 = dau2.A00(i);
                        if (dau2.A04(i, i2)) {
                            i3 = dAa.A02;
                            return dap2.A00(i3, i, i2, j2, dAa.A03);
                        }
                    }
                } else {
                    DAU dau3 = dap2.A0A;
                    C29794DAd dAd = dau3.A02;
                    int i7 = dAd.A00;
                    if (i7 != 0) {
                        int i8 = i7 - 1;
                        if (dAd.A01[i8] == Long.MIN_VALUE && !(!dAd.A02[i8].A00())) {
                            int A002 = dau3.A00(i8);
                            if (dau3.A04(i8, A002)) {
                                return dap2.A00(dAa.A02, i8, A002, dau3.A00, dAa.A03);
                            }
                        }
                    }
                }
            }
            return dap2.A01(i4, j2, dAa.A03);
        }
        return null;
    }

    private C29791DAa A05(int i, long j, long j2) {
        int i2 = i;
        this.A07.A05(i, this.A0A, false);
        DAU dau = this.A0A;
        int A022 = dau.A02(j);
        long j3 = j2;
        if (A022 == -1) {
            return new C29791DAa(i2, -1, -1, j3);
        }
        return new C29791DAa(i2, A022, dau.A00(A022), j3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r12.A01 != (r3 - 1)) goto L_0x0043;
     */
    private boolean A07(C29791DAa dAa, long j) {
        boolean z;
        int i = this.A07.A05(dAa.A02, this.A0A, false).A02.A00;
        if (i != 0) {
            int i2 = i - 1;
            boolean A012 = dAa.A01();
            DAU dau = this.A0A;
            C29794DAd dAd = dau.A02;
            if (dAd.A01[i2] == Long.MIN_VALUE) {
                int i3 = dAd.A02[i2].A00;
                if (i3 == -1) {
                    return false;
                }
                if (A012 && dAa.A00 == i2) {
                    z = true;
                }
                z = false;
                if (!z) {
                    if (A012 || dau.A00(i2) != i3) {
                        return false;
                    }
                    return true;
                }
            } else if (A012 || j != Long.MIN_VALUE) {
                return false;
            }
        }
        return true;
    }

    private boolean A08(C29791DAa dAa, boolean z) {
        this.A07.A05(dAa.A02, this.A0A, false);
        if (!this.A07.A06(0, this.A0B, false, 0).A04) {
            boolean z2 = false;
            if (this.A07.A02(dAa.A02, this.A0A, this.A0B, this.A01) == -1) {
                z2 = true;
            }
            if (!z2 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final DAM A09() {
        DAM dam = this.A05;
        if (dam != null) {
            if (dam == this.A06) {
                this.A06 = dam.A01;
            }
            dam.A03();
            this.A05 = this.A05.A01;
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                this.A04 = null;
            }
        } else {
            DAM dam2 = this.A04;
            this.A05 = dam2;
            this.A06 = dam2;
        }
        return this.A05;
    }

    public final DAM A0A() {
        DAM dam = this.A05;
        boolean z = false;
        if (dam != null) {
            z = true;
        }
        if (!z) {
            return this.A04;
        }
        return dam;
    }

    public final C29791DAa A0B(int i, long j) {
        long j2;
        DAZ daz;
        int A032;
        int i2 = i;
        Object obj = this.A07.A05(i, this.A0A, true).A04;
        Object obj2 = this.A08;
        if (obj2 == null || (A032 = this.A07.A03(obj2)) == -1) {
            DAM A0A2 = A0A();
            while (true) {
                if (A0A2 == null) {
                    DAM A0A3 = A0A();
                    while (A0A3 != null) {
                        int A033 = this.A07.A03(A0A3.A09);
                        if (A033 != -1) {
                            this.A07.A05(A033, this.A0A, false);
                            daz = A0A3.A02;
                        } else {
                            A0A3 = A0A3.A01;
                        }
                    }
                    j2 = this.A02;
                    this.A02 = 1 + j2;
                } else if (A0A2.A09.equals(obj)) {
                    daz = A0A2.A02;
                    break;
                } else {
                    A0A2 = A0A2.A01;
                }
            }
            j2 = daz.A04.A03;
        } else {
            this.A07.A05(A032, this.A0A, false);
            j2 = this.A03;
        }
        return A05(i2, j, j2);
    }

    public static boolean A06(DAP dap) {
        DAM dam;
        DAM A0A2 = dap.A0A();
        if (A0A2 != null) {
            while (true) {
                int A022 = dap.A07.A02(A0A2.A02.A04.A02, dap.A0A, dap.A0B, dap.A01);
                while (true) {
                    dam = A0A2.A01;
                    if (dam != null && !A0A2.A02.A06) {
                        A0A2 = dam;
                    }
                }
                if (A022 == -1 || dam == null || dam.A02.A04.A02 != A022) {
                    boolean A0D = dap.A0D(A0A2);
                    DAZ daz = A0A2.A02;
                    A0A2.A02 = A03(dap, daz, daz.A04);
                } else {
                    A0A2 = dam;
                }
            }
            boolean A0D2 = dap.A0D(A0A2);
            DAZ daz2 = A0A2.A02;
            A0A2.A02 = A03(dap, daz2, daz2.A04);
            if (A0D2) {
                boolean z = false;
                if (dap.A05 != null) {
                    z = true;
                }
                if (z) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void A0C(boolean z) {
        Object obj;
        DAM A0A2 = A0A();
        if (A0A2 != null) {
            if (z) {
                obj = A0A2.A09;
            } else {
                obj = null;
            }
            this.A08 = obj;
            this.A03 = A0A2.A02.A04.A03;
            A0A2.A03();
            A0D(A0A2);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }
}
