package p000X;

/* renamed from: X.CY8 */
public final class CY8 {
    public static final CY8 A04;
    public static final CY8 A05;
    public final CY7 A00;
    public final CY7 A01;
    public final CY7 A02;
    public final CY7 A03;

    static {
        CY7 cy7 = CY7.A03;
        A05 = new CY8(cy7, cy7, cy7, cy7);
        CY7 cy72 = CY7.A02;
        A04 = new CY8(cy7, cy72, cy7, cy72);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(123);
        sb.append("left=");
        sb.append(this.A01);
        sb.append(", ");
        sb.append("top=");
        sb.append(this.A03);
        sb.append(", ");
        sb.append("right=");
        sb.append(this.A02);
        sb.append(", ");
        sb.append("bottom=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public CY8(CY7 cy7, CY7 cy72, CY7 cy73, CY7 cy74) {
        this.A01 = cy7;
        this.A03 = cy72;
        this.A02 = cy73;
        this.A00 = cy74;
    }
}
