package p000X;

import java.io.Serializable;

/* renamed from: X.10q  reason: invalid class name and case insensitive filesystem */
public final class C235010q implements Serializable {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C235010q)) {
            return false;
        }
        C235010q r3 = (C235010q) obj;
        return C13150hy.A05(this.A00, r3.A00) && C13150hy.A05(this.A01, r3.A01);
    }

    public final int hashCode() {
        Object obj = this.A00;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.A01;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "(" + this.A00 + ", " + this.A01 + ')';
    }

    public C235010q(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
