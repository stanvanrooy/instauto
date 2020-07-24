package p000X;

/* renamed from: X.D5Z */
public final class D5Z {
    public final D5Y A00;
    public final D5Y A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D5Z d5z = (D5Z) obj;
            if (!this.A00.equals(d5z.A00) || !this.A01.equals(d5z.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.A00);
        D5Y d5y = this.A00;
        D5Y d5y2 = this.A01;
        if (d5y.equals(d5y2)) {
            str = "";
        } else {
            str = ", " + d5y2;
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public D5Z(D5Y d5y, D5Y d5y2) {
        D6U.A01(d5y);
        this.A00 = d5y;
        D6U.A01(d5y2);
        this.A01 = d5y2;
    }
}
