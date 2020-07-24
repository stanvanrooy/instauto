package p000X;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.0hr  reason: invalid class name and case insensitive filesystem */
public abstract class C13080hr implements Closeable, C12910ha {
    public int A00;

    public int A0I() {
        return A0d(0);
    }

    public boolean A0O() {
        return A0m(false);
    }

    public abstract double A0R();

    public abstract float A0S();

    public abstract int A0T();

    public abstract long A0U();

    public abstract C116574zW A0V();

    public abstract C116574zW A0W();

    public abstract Integer A0X();

    public abstract Number A0Y();

    public abstract Object A0Z();

    public abstract BigDecimal A0a();

    public abstract BigInteger A0b();

    public double A0c(double d) {
        return d;
    }

    public int A0d(int i) {
        return i;
    }

    public long A0e(long j) {
        return j;
    }

    public abstract C13080hr A0f();

    public abstract C13120hv A0g();

    public abstract C13120hv A0h();

    public abstract String A0i();

    public abstract void A0j();

    public abstract boolean A0k();

    public abstract boolean A0l();

    public boolean A0m(boolean z) {
        return z;
    }

    public abstract int A0n();

    public abstract int A0o();

    public abstract C13120hv A0p();

    public abstract C3U A0q();

    public String A0r() {
        return A0u((String) null);
    }

    public abstract String A0t();

    public abstract String A0u(String str);

    public abstract byte[] A0v(C25929Bcg bcg);

    public abstract char[] A0w();

    public abstract AnonymousClass4UF Btl();

    public abstract void close();

    public double A0H() {
        return A0c(0.0d);
    }

    public long A0J() {
        return A0e(0);
    }

    public final C45361xk A0K(String str) {
        return new C45361xk(str, A0V());
    }

    public C13080hr A0L(Integer num) {
        this.A00 = (1 << num.intValue()) | this.A00;
        return this;
    }

    public boolean A0Q(Integer num) {
        if (((1 << num.intValue()) & this.A00) != 0) {
            return true;
        }
        return false;
    }

    public byte A0G() {
        int A0T = A0T();
        if (A0T >= -128 && A0T <= 255) {
            return (byte) A0T;
        }
        throw A0K(AnonymousClass000.A0J("Numeric value (", A0t(), ") out of range of Java byte"));
    }

    public short A0M() {
        int A0T = A0T();
        if (A0T >= -32768 && A0T <= 32767) {
            return (short) A0T;
        }
        throw A0K(AnonymousClass000.A0J("Numeric value (", A0t(), ") out of range of Java short"));
    }

    public boolean A0N() {
        C13120hv A0g = A0g();
        if (A0g == C13120hv.VALUE_TRUE) {
            return true;
        }
        if (A0g == C13120hv.VALUE_FALSE) {
            return false;
        }
        throw new C45361xk("Current token (" + A0g + ") not of boolean type", A0V());
    }

    public final boolean A0P() {
        if (A0g() == C13120hv.START_ARRAY) {
            return true;
        }
        return false;
    }

    public String A0s() {
        if (A0p() == C13120hv.VALUE_STRING) {
            return A0t();
        }
        return null;
    }

    public C13080hr() {
    }

    public C13080hr(int i) {
        this.A00 = 0;
    }
}
