package p000X;

import java.util.Comparator;

/* renamed from: X.A8r */
public final class A8r {
    public static Comparator A02 = new A9G();
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        A8r a8r = (A8r) obj;
        return this.A00 == a8r.A00 && this.A01 == a8r.A01;
    }

    public final String toString() {
        return AnonymousClass000.A08("[", this.A01, ", ", this.A00, "]");
    }

    public A8r(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
