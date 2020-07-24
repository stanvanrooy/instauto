package p000X;

import java.io.Serializable;

/* renamed from: X.1nl  reason: invalid class name and case insensitive filesystem */
public final class C39911nl implements Serializable {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C39911nl)) {
            return false;
        }
        C39911nl r4 = (C39911nl) obj;
        if (this.A00 == r4.A00 && this.A01 == r4.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C39911nl(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
