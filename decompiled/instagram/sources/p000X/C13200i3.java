package p000X;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.0i3  reason: invalid class name and case insensitive filesystem */
public final class C13200i3 extends C13070hq {
    public int A00;
    public C116574zW A01 = null;
    public AnonymousClass29W A02;
    public C3U A03;
    public C13100ht A04;
    public boolean A05;
    public transient BZR A06;

    public C13200i3(AnonymousClass29W r5, C3U c3u) {
        super(0);
        this.A02 = r5;
        this.A00 = -1;
        this.A03 = c3u;
        this.A04 = new C13100ht((C13100ht) null, 0, -1, -1);
    }

    public final boolean A0l() {
        return false;
    }

    public final int A0o() {
        return 0;
    }

    public final int A0T() {
        Number A0Y;
        if (this.A00 == C13120hv.VALUE_NUMBER_INT) {
            AnonymousClass29W r0 = this.A02;
            A0Y = (Number) r0.A02[this.A00];
        } else {
            A0Y = A0Y();
        }
        return A0Y.intValue();
    }

    public final C116574zW A0V() {
        C116574zW r0 = this.A01;
        if (r0 == null) {
            return C116574zW.A05;
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r2 == p000X.C13120hv.VALUE_NUMBER_FLOAT) goto L_0x000d;
     */
    public final Number A0Y() {
        boolean z;
        C13120hv r2 = this.A00;
        if (r2 != null) {
            if (r2 != C13120hv.VALUE_NUMBER_INT) {
                z = false;
            }
            z = true;
            if (z) {
                AnonymousClass29W r0 = this.A02;
                Object obj = r0.A02[this.A00];
                if (obj instanceof Number) {
                    return (Number) obj;
                }
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.indexOf(46) >= 0) {
                        return Double.valueOf(Double.parseDouble(str));
                    }
                    return Long.valueOf(Long.parseLong(str));
                } else if (obj == null) {
                    return null;
                } else {
                    throw new IllegalStateException(AnonymousClass000.A0E("Internal error: entry should be a Number, but is of type ", obj.getClass().getName()));
                }
            }
        }
        throw A0K("Current token (" + r2 + ") not numeric, can not use numeric value accessors");
    }

    public final Object A0Z() {
        if (this.A00 != C13120hv.VALUE_EMBEDDED_OBJECT) {
            return null;
        }
        AnonymousClass29W r0 = this.A02;
        return r0.A02[this.A00];
    }

    public final String A0i() {
        return this.A04.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 == null) goto L_0x001c;
     */
    public final C13120hv A0p() {
        AnonymousClass29W r2;
        C13100ht A022;
        String obj;
        if (!this.A05 && (r2 = this.A02) != null) {
            int i = this.A00 + 1;
            this.A00 = i;
            if (i >= 16) {
                this.A00 = 0;
                AnonymousClass29W r0 = r2.A01;
                this.A02 = r0;
            }
            AnonymousClass29W r4 = this.A02;
            int i2 = this.A00;
            long j = r4.A00;
            if (i2 > 0) {
                j >>= i2 << 2;
            }
            C13120hv r22 = AnonymousClass29W.A03[((int) j) & 15];
            this.A00 = r22;
            if (r22 == C13120hv.FIELD_NAME) {
                Object obj2 = r4.A02[i2];
                if (obj2 instanceof String) {
                    obj = (String) obj2;
                } else {
                    obj = obj2.toString();
                }
                this.A04.A02 = obj;
            } else {
                if (r22 == C13120hv.START_OBJECT) {
                    A022 = this.A04.A03(-1, -1);
                } else if (r22 == C13120hv.START_ARRAY) {
                    A022 = this.A04.A02(-1, -1);
                } else if (r22 == C13120hv.END_OBJECT || r22 == C13120hv.END_ARRAY) {
                    C13100ht r02 = this.A04.A04;
                    this.A04 = r02;
                    if (r02 == null) {
                        this.A04 = new C13100ht((C13100ht) null, 0, -1, -1);
                    }
                }
                this.A04 = A022;
            }
            return this.A00;
        }
        return null;
    }

    public final C3U A0q() {
        return this.A03;
    }

    public final String A0t() {
        C13120hv r3 = this.A00;
        if (r3 == C13120hv.VALUE_STRING || r3 == C13120hv.FIELD_NAME) {
            AnonymousClass29W r0 = this.A02;
            Object obj = r0.A02[this.A00];
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } else if (r3 == null) {
            return null;
        } else {
            int i = AnonymousClass29X.A01[r3.ordinal()];
            if (i != 7 && i != 8) {
                return r3.A01;
            }
            AnonymousClass29W r02 = this.A02;
            Object obj2 = r02.A02[this.A00];
            if (obj2 != null) {
                return obj2.toString();
            }
            return null;
        }
    }

    public final byte[] A0v(C25929Bcg bcg) {
        C13120hv r2 = this.A00;
        if (r2 == C13120hv.VALUE_EMBEDDED_OBJECT) {
            AnonymousClass29W r0 = this.A02;
            Object obj = r0.A02[this.A00];
            if (obj instanceof byte[]) {
                return (byte[]) obj;
            }
        }
        if (r2 == C13120hv.VALUE_STRING) {
            String A0t = A0t();
            if (A0t == null) {
                return null;
            }
            BZR bzr = this.A06;
            if (bzr == null) {
                bzr = new BZR(100);
                this.A06 = bzr;
            } else {
                bzr.A01();
            }
            A14(A0t, bzr, bcg);
            return bzr.A05();
        }
        throw A0K("Current token (" + r2 + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary");
    }

    public final AnonymousClass4UF Btl() {
        return C3N.A00;
    }

    public final void close() {
        if (!this.A05) {
            this.A05 = true;
        }
    }

    public final double A0R() {
        return A0Y().doubleValue();
    }

    public final float A0S() {
        return A0Y().floatValue();
    }

    public final long A0U() {
        return A0Y().longValue();
    }

    public final C116574zW A0W() {
        return A0V();
    }

    public final Integer A0X() {
        Number A0Y = A0Y();
        if (!(A0Y instanceof Integer)) {
            if (A0Y instanceof Long) {
                return Constants.ONE;
            }
            if (A0Y instanceof Double) {
                return Constants.A0Y;
            }
            if (A0Y instanceof BigDecimal) {
                return Constants.A0j;
            }
            if (A0Y instanceof BigInteger) {
                return Constants.A0C;
            }
            if (A0Y instanceof Float) {
                return Constants.A0N;
            }
            if (!(A0Y instanceof Short)) {
                return null;
            }
        }
        return Constants.ZERO;
    }

    public final BigDecimal A0a() {
        Number A0Y = A0Y();
        if (A0Y instanceof BigDecimal) {
            return (BigDecimal) A0Y;
        }
        switch (A0X().intValue()) {
            case 0:
            case 1:
                return BigDecimal.valueOf(A0Y.longValue());
            case 2:
                return new BigDecimal((BigInteger) A0Y);
            default:
                return BigDecimal.valueOf(A0Y.doubleValue());
        }
    }

    public final BigInteger A0b() {
        Number A0Y = A0Y();
        if (A0Y instanceof BigInteger) {
            return (BigInteger) A0Y;
        }
        if (A0X() == Constants.A0j) {
            return ((BigDecimal) A0Y).toBigInteger();
        }
        return BigInteger.valueOf(A0Y.longValue());
    }

    public final int A0n() {
        String A0t = A0t();
        if (A0t == null) {
            return 0;
        }
        return A0t.length();
    }

    public final char[] A0w() {
        String A0t = A0t();
        if (A0t == null) {
            return null;
        }
        return A0t.toCharArray();
    }

    public final void A0x() {
        AnonymousClass2As.A03();
    }
}
