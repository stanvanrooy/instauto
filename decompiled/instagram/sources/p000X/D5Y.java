package p000X;

/* renamed from: X.D5Y */
public final class D5Y {
    public static final D5Y A02 = new D5Y(0, 0);
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D5Y d5y = (D5Y) obj;
            if (!(this.A01 == d5y.A01 && this.A00 == d5y.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return "[timeUs=" + this.A01 + ", position=" + this.A00 + "]";
    }

    public D5Y(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
