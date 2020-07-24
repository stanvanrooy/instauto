package p000X;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.0ib  reason: invalid class name and case insensitive filesystem */
public final class C13480ib extends C13460iZ {
    public static final int A07 = C12920hb.A00();
    public AnonymousClass29W A00;
    public int A01;
    public int A02 = A07;
    public C3U A03;
    public C13470ia A04 = new C13470ia(0, (C13470ia) null);
    public AnonymousClass29W A05;
    public boolean A06;

    public final C13460iZ A0J() {
        return this;
    }

    public final void close() {
        this.A06 = true;
    }

    public final void flush() {
    }

    public final C13460iZ A0K(C12930hc r3) {
        this.A02 = (r3.A00 ^ -1) & this.A02;
        return this;
    }

    public final C13460iZ A0L(C12930hc r3) {
        this.A02 = r3.A00 | this.A02;
        return this;
    }

    public final void A0M(Object obj) {
        A0s(C13120hv.VALUE_EMBEDDED_OBJECT, obj);
    }

    public final void A0N(String str) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final boolean A0O() {
        return this.A06;
    }

    public final void A0P() {
        A0r(C13120hv.END_ARRAY);
        C13470ia r0 = this.A04.A02;
        if (r0 != null) {
            this.A04 = r0;
        }
    }

    public final void A0Q() {
        A0r(C13120hv.END_OBJECT);
        C13470ia r0 = this.A04.A02;
        if (r0 != null) {
            this.A04 = r0;
        }
    }

    public final void A0R() {
        A0r(C13120hv.VALUE_NULL);
    }

    public final void A0S() {
        A0r(C13120hv.START_ARRAY);
        this.A04 = this.A04.A04();
    }

    public final void A0T() {
        A0r(C13120hv.START_OBJECT);
        this.A04 = this.A04.A05();
    }

    public final void A0U(char c) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final void A0V(double d) {
        A0s(C13120hv.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    public final void A0W(float f) {
        A0s(C13120hv.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    public final void A0X(int i) {
        A0s(C13120hv.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    public final void A0Y(long j) {
        A0s(C13120hv.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    public final void A0Z(C25929Bcg bcg, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        A0M(bArr2);
    }

    public final void A0a(C12970hg r3) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final void A0b(C12970hg r3) {
        A0s(C13120hv.FIELD_NAME, r3);
        this.A04.A03(r3.getValue());
    }

    public final void A0c(C12970hg r2) {
        if (r2 == null) {
            A0R();
        } else {
            A0s(C13120hv.VALUE_STRING, r2);
        }
    }

    public final void A0d(String str) {
        A0s(C13120hv.FIELD_NAME, str);
        this.A04.A03(str);
    }

    public final void A0e(String str) {
        A0s(C13120hv.VALUE_NUMBER_FLOAT, str);
    }

    public final void A0f(String str) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final void A0g(String str) {
        if (str == null) {
            A0R();
        } else {
            A0s(C13120hv.VALUE_STRING, str);
        }
    }

    public final void A0h(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            A0R();
        } else {
            A0s(C13120hv.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    public final void A0i(BigInteger bigInteger) {
        if (bigInteger == null) {
            A0R();
        } else {
            A0s(C13120hv.VALUE_NUMBER_INT, bigInteger);
        }
    }

    public final void A0j(short s) {
        A0s(C13120hv.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    public final void A0k(boolean z) {
        C13120hv r0;
        if (z) {
            r0 = C13120hv.VALUE_TRUE;
        } else {
            r0 = C13120hv.VALUE_FALSE;
        }
        A0r(r0);
    }

    public final void A0l(char[] cArr, int i, int i2) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final void A0m(char[] cArr, int i, int i2) {
        A0g(new String(cArr, i, i2));
    }

    public final C13080hr A0n() {
        return new C13200i3(this.A00, this.A03);
    }

    public final C13080hr A0o(C13080hr r4) {
        C13200i3 r2 = new C13200i3(this.A00, r4.A0q());
        r2.A01 = r4.A0W();
        return r2;
    }

    public final void A0p(C13080hr r4) {
        switch (AnonymousClass29X.A01[r4.A0g().ordinal()]) {
            case 1:
                A0T();
                return;
            case 2:
                A0Q();
                return;
            case 3:
                A0S();
                return;
            case 4:
                A0P();
                return;
            case 5:
                A0d(r4.A0i());
                return;
            case 6:
                if (r4.A0l()) {
                    A0m(r4.A0w(), r4.A0o(), r4.A0n());
                    return;
                } else {
                    A0g(r4.A0t());
                    return;
                }
            case 7:
                switch (r4.A0X().intValue()) {
                    case 0:
                        A0X(r4.A0T());
                        return;
                    case 2:
                        A0i(r4.A0b());
                        return;
                    default:
                        A0Y(r4.A0U());
                        return;
                }
            case 8:
                switch (r4.A0X().intValue()) {
                    case 3:
                        A0W(r4.A0S());
                        return;
                    case 5:
                        A0h(r4.A0a());
                        return;
                    default:
                        A0V(r4.A0R());
                        return;
                }
            case 9:
                A0k(true);
                return;
            case 10:
                A0k(false);
                return;
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                A0R();
                return;
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                A0M(r4.A0Z());
                return;
            default:
                throw new RuntimeException("Internal error: should never end up through this code path");
        }
    }

    public final void A0r(C13120hv r8) {
        AnonymousClass29W r4;
        AnonymousClass29W r6 = this.A05;
        int i = this.A01;
        if (i < 16) {
            long ordinal = (long) r8.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            r6.A00 |= ordinal;
            r4 = null;
        } else {
            r4 = new AnonymousClass29W();
            r6.A01 = r4;
            r4.A00 |= (long) r8.ordinal();
        }
        if (r4 == null) {
            this.A01 = i + 1;
            return;
        }
        this.A05 = r4;
        this.A01 = 1;
    }

    public final void A0s(C13120hv r8, Object obj) {
        AnonymousClass29W r4;
        AnonymousClass29W r6 = this.A05;
        int i = this.A01;
        if (i < 16) {
            r6.A02[i] = obj;
            long ordinal = (long) r8.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            r6.A00 = ordinal | r6.A00;
            r4 = null;
        } else {
            r4 = new AnonymousClass29W();
            r6.A01 = r4;
            r4.A02[0] = obj;
            r4.A00 = ((long) r8.ordinal()) | r4.A00;
        }
        if (r4 == null) {
            this.A01 = i + 1;
            return;
        }
        this.A05 = r4;
        this.A01 = 1;
    }

    public final AnonymousClass4UF Btl() {
        return C3N.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[TokenBuffer: ");
        C13080hr A0n = A0n();
        int i = 0;
        while (true) {
            try {
                C13120hv A0p = A0n.A0p();
                if (A0p == null) {
                    break;
                }
                if (i < 100) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(A0p.toString());
                    if (A0p == C13120hv.FIELD_NAME) {
                        sb.append('(');
                        sb.append(A0n.A0i());
                        sb.append(')');
                    }
                }
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        if (i >= 100) {
            sb.append(" ... (truncated ");
            sb.append(i - 100);
            sb.append(" entries)");
        }
        sb.append(']');
        return sb.toString();
    }

    public C13480ib(C3U c3u) {
        this.A03 = c3u;
        AnonymousClass29W r0 = new AnonymousClass29W();
        this.A05 = r0;
        this.A00 = r0;
        this.A01 = 0;
    }

    public final void A0q(C13080hr r4) {
        C13120hv A0g = r4.A0g();
        if (A0g == C13120hv.FIELD_NAME) {
            A0d(r4.A0i());
            A0g = r4.A0p();
        }
        int i = AnonymousClass29X.A01[A0g.ordinal()];
        if (i == 1) {
            A0T();
            while (r4.A0p() != C13120hv.END_OBJECT) {
                A0q(r4);
            }
            A0Q();
        } else if (i != 3) {
            A0p(r4);
        } else {
            A0S();
            while (r4.A0p() != C13120hv.END_ARRAY) {
                A0q(r4);
            }
            A0P();
        }
    }
}
