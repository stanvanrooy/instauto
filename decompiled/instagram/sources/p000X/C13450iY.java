package p000X;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0iY  reason: invalid class name and case insensitive filesystem */
public abstract class C13450iY extends C13460iZ {
    public C13470ia A00 = new C13470ia(0, (C13470ia) null);
    public int A01;
    public C3U A02;
    public boolean A03;
    public boolean A04;

    public abstract void A0n(String str);

    public void close() {
        this.A04 = true;
    }

    public abstract void flush();

    public static final void A07(String str) {
        throw new AnonymousClass29Z(str);
    }

    public final C13460iZ A0J() {
        if (this.A00 != null) {
            return this;
        }
        this.A00 = new C12940hd();
        return this;
    }

    public final C13460iZ A0K(C12930hc r3) {
        this.A01 &= r3.A00 ^ -1;
        if (r3 == C12930hc.WRITE_NUMBERS_AS_STRINGS) {
            this.A03 = false;
        } else if (r3 == C12930hc.ESCAPE_NON_ASCII) {
            A0A(0);
            return this;
        }
        return this;
    }

    public final C13460iZ A0L(C12930hc r3) {
        this.A01 |= r3.A00;
        if (r3 == C12930hc.WRITE_NUMBERS_AS_STRINGS) {
            this.A03 = true;
        } else if (r3 == C12930hc.ESCAPE_NON_ASCII) {
            A0A(127);
            return this;
        }
        return this;
    }

    public final void A0M(Object obj) {
        if (obj != null) {
            C3U c3u = this.A02;
            if (c3u != null) {
                c3u.A00(this, obj);
                return;
            } else if (obj != null) {
                if (obj instanceof String) {
                    A0g((String) obj);
                    return;
                }
                if (obj instanceof Number) {
                    Number number = (Number) obj;
                    if (number instanceof Integer) {
                        A0X(number.intValue());
                        return;
                    } else if (number instanceof Long) {
                        A0Y(number.longValue());
                        return;
                    } else if (number instanceof Double) {
                        A0V(number.doubleValue());
                        return;
                    } else if (number instanceof Float) {
                        A0W(number.floatValue());
                        return;
                    } else if (number instanceof Short) {
                        A0j(number.shortValue());
                        return;
                    } else if (number instanceof Byte) {
                        A0j((short) number.byteValue());
                        return;
                    } else if (number instanceof BigInteger) {
                        A0i((BigInteger) number);
                        return;
                    } else if (number instanceof BigDecimal) {
                        A0h((BigDecimal) number);
                        return;
                    } else if (number instanceof AtomicInteger) {
                        A0X(((AtomicInteger) number).get());
                        return;
                    } else if (number instanceof AtomicLong) {
                        A0Y(((AtomicLong) number).get());
                        return;
                    }
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    A0Z(C25930Bch.A01, bArr, 0, bArr.length);
                    return;
                } else if (obj instanceof Boolean) {
                    A0k(((Boolean) obj).booleanValue());
                    return;
                } else if (obj instanceof AtomicBoolean) {
                    A0k(((AtomicBoolean) obj).get());
                    return;
                }
                throw new IllegalStateException(AnonymousClass000.A0J("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ", obj.getClass().getName(), ")"));
            }
        }
        A0R();
    }

    public final boolean A0O() {
        return this.A04;
    }

    public final boolean A0o(C12930hc r3) {
        if ((r3.A00 & this.A01) != 0) {
            return true;
        }
        return false;
    }

    public C13450iY(int i, C3U c3u) {
        this.A01 = i;
        this.A02 = c3u;
        this.A03 = A0o(C12930hc.WRITE_NUMBERS_AS_STRINGS);
    }

    public final void A0N(String str) {
        A0n("write raw value");
        A0f(str);
    }

    public void A0b(C12970hg r2) {
        A0d(r2.getValue());
    }

    public void A0c(C12970hg r2) {
        A0g(r2.getValue());
    }

    public AnonymousClass4UF Btl() {
        return AnonymousClass2As.A01(getClass());
    }
}
