package p000X;

/* renamed from: X.0hl  reason: invalid class name and case insensitive filesystem */
public abstract class C13020hl {
    public final String A00;
    public final int A01;

    public abstract boolean A00(int i);

    public abstract boolean A01(int i, int i2);

    public abstract boolean A02(int[] iArr, int i);

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.A01;
    }

    public final String toString() {
        return this.A00;
    }

    public C13020hl(String str, int i) {
        this.A00 = str;
        this.A01 = i;
    }
}
