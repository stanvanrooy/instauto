package p000X;

import java.io.Closeable;
import java.io.Flushable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.0iZ  reason: invalid class name and case insensitive filesystem */
public abstract class C13460iZ implements Closeable, C12910ha, Flushable {
    public C12950he A00;

    public C13460iZ A0A(int i) {
        return this;
    }

    public abstract C13460iZ A0J();

    public abstract C13460iZ A0K(C12930hc r1);

    public abstract C13460iZ A0L(C12930hc r1);

    public abstract void A0M(Object obj);

    public abstract void A0N(String str);

    public abstract boolean A0O();

    public abstract void A0P();

    public abstract void A0Q();

    public abstract void A0R();

    public abstract void A0S();

    public abstract void A0T();

    public abstract void A0U(char c);

    public abstract void A0V(double d);

    public abstract void A0W(float f);

    public abstract void A0X(int i);

    public abstract void A0Y(long j);

    public abstract void A0Z(C25929Bcg bcg, byte[] bArr, int i, int i2);

    public abstract void A0b(C12970hg r1);

    public abstract void A0c(C12970hg r1);

    public abstract void A0d(String str);

    public abstract void A0e(String str);

    public abstract void A0f(String str);

    public abstract void A0g(String str);

    public abstract void A0h(BigDecimal bigDecimal);

    public abstract void A0i(BigInteger bigInteger);

    public abstract void A0k(boolean z);

    public abstract void A0l(char[] cArr, int i, int i2);

    public abstract void A0m(char[] cArr, int i, int i2);

    public abstract AnonymousClass4UF Btl();

    public abstract void close();

    public abstract void flush();

    public final void A0B(String str) {
        A0d(str);
        A0S();
    }

    public final void A0C(String str) {
        A0d(str);
        A0T();
    }

    public final void A0D(String str, double d) {
        A0d(str);
        A0V(d);
    }

    public final void A0E(String str, float f) {
        A0d(str);
        A0W(f);
    }

    public final void A0F(String str, int i) {
        A0d(str);
        A0X(i);
    }

    public final void A0G(String str, long j) {
        A0d(str);
        A0Y(j);
    }

    public void A0H(String str, String str2) {
        A0d(str);
        A0g(str2);
    }

    public final void A0I(String str, boolean z) {
        A0d(str);
        A0k(z);
    }

    public void A0a(C12970hg r2) {
        A0f(r2.getValue());
    }

    public void A0j(short s) {
        A0X(s);
    }
}
