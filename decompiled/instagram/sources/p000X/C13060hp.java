package p000X;

import com.facebook.forker.Process;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.0hp  reason: invalid class name and case insensitive filesystem */
public abstract class C13060hp extends C13070hq {
    public static final BigDecimal A0P = new BigDecimal(A0T);
    public static final BigDecimal A0Q = new BigDecimal(A0U);
    public static final BigDecimal A0R = new BigDecimal(A0V);
    public static final BigDecimal A0S = new BigDecimal(A0W);
    public static final BigInteger A0T = BigInteger.valueOf(2147483647L);
    public static final BigInteger A0U = BigInteger.valueOf(Long.MAX_VALUE);
    public static final BigInteger A0V = BigInteger.valueOf(-2147483648L);
    public static final BigInteger A0W = BigInteger.valueOf(Long.MIN_VALUE);
    public double A00;
    public int A01 = 1;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05;
    public int A06 = 0;
    public int A07;
    public int A08 = 0;
    public int A09 = 1;
    public long A0A;
    public long A0B = 0;
    public C13120hv A0C;
    public C13100ht A0D;
    public BigDecimal A0E;
    public BigInteger A0F;
    public boolean A0G = false;
    public boolean A0H;
    public long A0I = 0;
    public BZR A0J = null;
    public boolean A0K;
    public byte[] A0L;
    public char[] A0M = null;
    public final C13090hs A0N;
    public final C13030hm A0O;

    public final Object A0Z() {
        return null;
    }

    public abstract void A1E();

    public abstract boolean A1I();

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0027  */
    public static final IllegalArgumentException A03(C25929Bcg bcg, int i, int i2, String str) {
        StringBuilder sb;
        String str2;
        if (i <= 32) {
            sb = new StringBuilder("Illegal white space character (code 0x");
            sb.append(Integer.toHexString(i));
            sb.append(") as character #");
            sb.append(i2 + 1);
            sb.append(" of 4-char base64 unit: can only used between units");
        } else {
            char c = bcg.A01;
            boolean z = false;
            if (i == c) {
                z = true;
            }
            if (z) {
                str2 = "Unexpected padding character ('" + c + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
                if (str != null) {
                    str2 = AnonymousClass000.A0J(str2, ": ", str);
                }
                return new IllegalArgumentException(str2);
            }
            if (!Character.isDefined(i) || Character.isISOControl(i)) {
                sb = new StringBuilder("Illegal character (code 0x");
            } else {
                sb = new StringBuilder("Illegal character '");
                sb.append((char) i);
                sb.append("' (code 0x");
            }
            sb.append(Integer.toHexString(i));
            sb.append(") in base64 content");
        }
        str2 = sb.toString();
        if (str != null) {
        }
        return new IllegalArgumentException(str2);
    }

    public final double A0R() {
        double doubleValue;
        int i = this.A06;
        if ((i & 8) == 0) {
            if (i == 0) {
                A1F(8);
            }
            int i2 = this.A06;
            if ((8 & i2) == 0) {
                if ((i2 & 16) != 0) {
                    doubleValue = this.A0E.doubleValue();
                } else if ((i2 & 4) != 0) {
                    doubleValue = this.A0F.doubleValue();
                } else {
                    if ((i2 & 2) != 0) {
                        this.A00 = (double) this.A0A;
                    } else if ((i2 & 1) != 0) {
                        this.A00 = (double) this.A07;
                    } else {
                        AnonymousClass2As.A03();
                    }
                    this.A06 |= 8;
                }
                this.A00 = doubleValue;
                this.A06 |= 8;
            }
        }
        return this.A00;
    }

    public final int A0T() {
        int intValue;
        int i = this.A06;
        if ((i & 1) == 0) {
            if (i == 0) {
                A1F(1);
            }
            int i2 = this.A06;
            if ((1 & i2) == 0) {
                if ((i2 & 2) != 0) {
                    long j = this.A0A;
                    int i3 = (int) j;
                    if (((long) i3) != j) {
                        A12(AnonymousClass000.A0J("Numeric value (", A0t(), ") out of range of int"));
                    }
                    this.A07 = i3;
                } else {
                    if ((i2 & 4) != 0) {
                        if (A0V.compareTo(this.A0F) > 0 || A0T.compareTo(this.A0F) < 0) {
                            A1C();
                        }
                        intValue = this.A0F.intValue();
                    } else if ((i2 & 8) != 0) {
                        double d = this.A00;
                        if (d < -2.147483648E9d || d > 2.147483647E9d) {
                            A1C();
                        }
                        this.A07 = (int) this.A00;
                    } else if ((i2 & 16) != 0) {
                        if (A0R.compareTo(this.A0E) > 0 || A0P.compareTo(this.A0E) < 0) {
                            A1C();
                        }
                        intValue = this.A0E.intValue();
                    } else {
                        AnonymousClass2As.A03();
                    }
                    this.A07 = intValue;
                }
                this.A06 |= 1;
            }
        }
        return this.A07;
    }

    public final long A0U() {
        long longValue;
        int i = this.A06;
        if ((i & 2) == 0) {
            if (i == 0) {
                A1F(2);
            }
            int i2 = this.A06;
            if ((2 & i2) == 0) {
                if ((i2 & 1) != 0) {
                    this.A0A = (long) this.A07;
                } else {
                    if ((i2 & 4) != 0) {
                        if (A0W.compareTo(this.A0F) > 0 || A0U.compareTo(this.A0F) < 0) {
                            A1D();
                        }
                        longValue = this.A0F.longValue();
                    } else if ((i2 & 8) != 0) {
                        double d = this.A00;
                        if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                            A1D();
                        }
                        this.A0A = (long) this.A00;
                    } else if ((i2 & 16) != 0) {
                        if (A0S.compareTo(this.A0E) > 0 || A0Q.compareTo(this.A0E) < 0) {
                            A1D();
                        }
                        longValue = this.A0E.longValue();
                    } else {
                        AnonymousClass2As.A03();
                    }
                    this.A0A = longValue;
                }
                this.A06 |= 2;
            }
        }
        return this.A0A;
    }

    public final C116574zW A0V() {
        int i = this.A04;
        return new C116574zW(this.A0O.A06, -1, (this.A0I + ((long) i)) - 1, this.A01, (i - this.A02) + 1);
    }

    public final C116574zW A0W() {
        Object obj = this.A0O.A06;
        long j = this.A0B;
        int i = this.A09;
        int i2 = this.A08;
        if (i2 >= 0) {
            i2++;
        }
        return new C116574zW(obj, -1, j, i, i2);
    }

    public final Integer A0X() {
        if (this.A06 == 0) {
            A1F(0);
        }
        if (this.A00 == C13120hv.VALUE_NUMBER_INT) {
            int i = this.A06;
            if ((i & 1) != 0) {
                return Constants.ZERO;
            }
            if ((i & 2) != 0) {
                return Constants.ONE;
            }
            return Constants.A0C;
        } else if ((this.A06 & 16) != 0) {
            return Constants.A0j;
        } else {
            return Constants.A0Y;
        }
    }

    public final Number A0Y() {
        if (this.A06 == 0) {
            A1F(0);
        }
        if (this.A00 == C13120hv.VALUE_NUMBER_INT) {
            int i = this.A06;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.A07);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.A0A);
            }
            if ((i & 4) != 0) {
                return this.A0F;
            }
            return this.A0E;
        }
        int i2 = this.A06;
        if ((i2 & 16) != 0) {
            return this.A0E;
        }
        if ((i2 & 8) == 0) {
            AnonymousClass2As.A03();
        }
        return Double.valueOf(this.A00);
    }

    public final BigDecimal A0a() {
        long j;
        int i = this.A06;
        if ((i & 16) == 0) {
            if (i == 0) {
                A1F(16);
            }
            int i2 = this.A06;
            if ((16 & i2) == 0) {
                if ((i2 & 8) != 0) {
                    this.A0E = new BigDecimal(A0t());
                } else if ((i2 & 4) != 0) {
                    this.A0E = new BigDecimal(this.A0F);
                } else {
                    if ((i2 & 2) != 0) {
                        j = this.A0A;
                    } else if ((i2 & 1) != 0) {
                        j = (long) this.A07;
                    } else {
                        AnonymousClass2As.A03();
                    }
                    this.A0E = BigDecimal.valueOf(j);
                }
                this.A06 |= 16;
            }
        }
        return this.A0E;
    }

    public final BigInteger A0b() {
        BigDecimal valueOf;
        long j;
        BigInteger valueOf2;
        int i = this.A06;
        if ((i & 4) == 0) {
            if (i == 0) {
                A1F(4);
            }
            int i2 = this.A06;
            if ((4 & i2) == 0) {
                if ((i2 & 16) != 0) {
                    valueOf = this.A0E;
                } else {
                    if ((i2 & 2) != 0) {
                        j = this.A0A;
                    } else if ((i2 & 1) != 0) {
                        j = (long) this.A07;
                    } else if ((i2 & 8) != 0) {
                        valueOf = BigDecimal.valueOf(this.A00);
                    } else {
                        AnonymousClass2As.A03();
                        this.A06 |= 4;
                    }
                    valueOf2 = BigInteger.valueOf(j);
                    this.A0F = valueOf2;
                    this.A06 |= 4;
                }
                valueOf2 = valueOf.toBigInteger();
                this.A0F = valueOf2;
                this.A06 |= 4;
            }
        }
        return this.A0F;
    }

    public final String A0i() {
        C13100ht r0;
        C13120hv r1 = this.A00;
        if (r1 == C13120hv.START_OBJECT || r1 == C13120hv.START_ARRAY) {
            r0 = this.A0D.A04;
        } else {
            r0 = this.A0D;
        }
        return r0.A02;
    }

    public final boolean A0l() {
        C13120hv r1 = this.A00;
        if (r1 == C13120hv.VALUE_STRING) {
            return true;
        }
        if (r1 == C13120hv.FIELD_NAME) {
            return this.A0G;
        }
        return false;
    }

    public final void A0x() {
        C13100ht r2 = this.A0D;
        boolean z = false;
        if (r2.A01 == 0) {
            z = true;
        }
        if (!z) {
            A13(": expected close marker for " + r2.A00() + " (from " + new C116574zW(this.A0O.A06, -1, -1, r2.A01, r2.A00) + ")");
        }
    }

    public char A15() {
        throw new UnsupportedOperationException();
    }

    public final int A16(C25929Bcg bcg, char c, int i) {
        IllegalArgumentException illegalArgumentException;
        if (c == '\\') {
            char A15 = A15();
            if (A15 <= ' ' && i == 0) {
                return -1;
            }
            int A002 = bcg.A00(A15);
            if (A002 >= 0) {
                return A002;
            }
            illegalArgumentException = A03(bcg, A15, i, (String) null);
        } else {
            illegalArgumentException = A03(bcg, c, i, (String) null);
        }
        throw illegalArgumentException;
    }

    public final int A17(C25929Bcg bcg, int i, int i2) {
        IllegalArgumentException illegalArgumentException;
        if (i == 92) {
            char A15 = A15();
            if (A15 <= ' ' && i2 == 0) {
                return -1;
            }
            int A012 = bcg.A01(A15);
            if (A012 >= 0) {
                return A012;
            }
            illegalArgumentException = A03(bcg, A15, i2, (String) null);
        } else {
            illegalArgumentException = A03(bcg, i, i2, (String) null);
        }
        throw illegalArgumentException;
    }

    public final C13120hv A18(String str, double d) {
        C13090hs r3 = this.A0N;
        r3.A08 = null;
        r3.A02 = -1;
        r3.A01 = 0;
        r3.A04 = str;
        r3.A09 = null;
        if (r3.A06) {
            C13090hs.A00(r3);
        }
        r3.A00 = 0;
        this.A00 = d;
        this.A06 = 8;
        return C13120hv.VALUE_NUMBER_FLOAT;
    }

    public final BZR A19() {
        BZR bzr = this.A0J;
        if (bzr == null) {
            this.A0J = new BZR(500);
        } else {
            bzr.A01();
        }
        return this.A0J;
    }

    public void A1A() {
        this.A0N.A06();
        char[] cArr = this.A0M;
        if (cArr != null) {
            this.A0M = null;
            C13030hm r1 = this.A0O;
            if (cArr != null) {
                C13030hm.A01(cArr, r1.A03);
                r1.A03 = null;
                r1.A05.A01[Constants.A0N.intValue()] = cArr;
            }
        }
    }

    public final void A1C() {
        A12(AnonymousClass000.A0M("Numeric value (", A0t(), ") out of range of int (", Process.WAIT_RESULT_TIMEOUT, " - ", Integer.MAX_VALUE, ")"));
    }

    public final void A1D() {
        A12("Numeric value (" + A0t() + ") out of range of long (" + Long.MIN_VALUE + " - " + Long.MAX_VALUE + ")");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r1 < 0) goto L_0x008f;
     */
    public final void A1F(int i) {
        String str;
        BigDecimal bigDecimal;
        String str2;
        int i2;
        C13120hv r2 = this.A00;
        if (r2 == C13120hv.VALUE_NUMBER_INT) {
            char[] A0F2 = this.A0N.A0F();
            C13090hs r1 = this.A0N;
            int i3 = r1.A02;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = this.A05;
            boolean z = this.A0H;
            if (z) {
                i3++;
            }
            if (i4 <= 9) {
                i2 = C13230i7.A02(A0F2, i3, i4);
                if (z) {
                    i2 = -i2;
                }
            } else if (i4 <= 18) {
                int i5 = i4 - 9;
                long A022 = (((long) C13230i7.A02(A0F2, i3, i5)) * 1000000000) + ((long) C13230i7.A02(A0F2, i3 + i5, 9));
                if (z) {
                    A022 = -A022;
                }
                if (i4 != 10 || (!z ? A022 > 2147483647L : A022 < -2147483648L)) {
                    this.A0A = A022;
                    this.A06 = 2;
                    return;
                }
                i2 = (int) A022;
            } else {
                String A052 = r1.A05();
                try {
                    if (this.A0H) {
                        str2 = C13230i7.A00;
                    } else {
                        str2 = "9223372036854775807";
                    }
                    int length = str2.length();
                    boolean z2 = true;
                    if (i4 >= length) {
                        if (i4 <= length) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length) {
                                    break;
                                }
                                int charAt = A0F2[i3 + i6] - str2.charAt(i6);
                                if (charAt == 0) {
                                    i6++;
                                }
                            }
                        }
                        z2 = false;
                    }
                    if (z2) {
                        this.A0A = Long.parseLong(A052);
                        this.A06 = 2;
                        return;
                    }
                    this.A0F = new BigInteger(A052);
                    this.A06 = 4;
                    return;
                } catch (NumberFormatException e) {
                    e = e;
                    str = AnonymousClass000.A0J("Malformed numeric value '", A052, "'");
                    throw new C45361xk(str, A0V(), e);
                }
            }
            this.A07 = i2;
            this.A06 = 1;
        } else if (r2 != C13120hv.VALUE_NUMBER_FLOAT) {
            A12("Current token (" + r2 + ") not numeric, can not use numeric value accessors");
        } else if (i == 16) {
            try {
                C13090hs r4 = this.A0N;
                char[] cArr = r4.A09;
                if (cArr != null) {
                    bigDecimal = new BigDecimal(cArr);
                } else {
                    int i7 = r4.A02;
                    if (i7 >= 0) {
                        bigDecimal = new BigDecimal(r4.A08, i7, r4.A01);
                    } else if (r4.A03 == 0) {
                        bigDecimal = new BigDecimal(r4.A07, 0, r4.A00);
                    } else {
                        bigDecimal = new BigDecimal(r4.A0A());
                    }
                }
                this.A0E = bigDecimal;
                this.A06 = 16;
            } catch (NumberFormatException e2) {
                e = e2;
                str = AnonymousClass000.A0J("Malformed numeric value '", this.A0N.A05(), "'");
                throw new C45361xk(str, A0V(), e);
            }
        } else {
            this.A00 = C13230i7.A00(this.A0N.A05());
            this.A06 = 8;
        }
    }

    public final void A1G(int i, char c) {
        StringBuilder sb = new StringBuilder("");
        C13100ht r1 = this.A0D;
        sb.append(new C116574zW(this.A0O.A06, -1, -1, r1.A01, r1.A00));
        String sb2 = sb.toString();
        A12("Unexpected close marker '" + ((char) i) + "': expected '" + c + "' (for " + this.A0D.A00() + " starting at " + sb2 + ")");
    }

    public final void A1H(int i, String str) {
        String A0J2 = AnonymousClass000.A0J("Unexpected character (", C13070hq.A04(i), ") in numeric value");
        if (str != null) {
            A0J2 = AnonymousClass000.A0J(A0J2, ": ", str);
        }
        A12(A0J2);
    }

    public final AnonymousClass4UF Btl() {
        return C3O.A00;
    }

    public void close() {
        if (!this.A0K) {
            this.A0K = true;
            try {
                A1E();
            } finally {
                A1A();
            }
        }
    }

    public C13060hp(C13030hm r6, int i) {
        this.A00 = i;
        this.A0O = r6;
        this.A0N = new C13090hs(r6.A05);
        this.A0D = new C13100ht((C13100ht) null, 0, 1, 0);
    }

    public final float A0S() {
        return (float) A0R();
    }

    public final void A1B() {
        if (!A1I()) {
            A13(" in " + this.A00);
        }
    }
}
