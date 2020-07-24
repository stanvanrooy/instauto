package p000X;

/* renamed from: X.07a  reason: invalid class name and case insensitive filesystem */
public final class C034507a {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.A07) {
            str = "ProcessCpu";
        } else {
            str = "ThreadCpu";
        }
        sb.append(str);
        sb.append(" Exceeded -> Time: ");
        sb.append((long) this.A00);
        sb.append(", Proc CPU: ");
        sb.append((long) this.A01);
        String str2 = this.A06;
        if (str2 != null) {
            sb.append(", Thread1: ");
            sb.append(str2);
            sb.append(", Thread1 CPU: ");
            sb.append((long) this.A03);
        }
        String str3 = this.A05;
        if (str3 != null) {
            sb.append(", Thread2: ");
            sb.append(str3);
            sb.append(", Thread2 CPU: ");
            sb.append((long) this.A02);
        }
        sb.append(", Streak: ");
        sb.append(this.A04);
        return sb.toString();
    }

    public C034507a(double d, int i, boolean z, double d2, String str, double d3, String str2, double d4) {
        this.A00 = d;
        this.A04 = i;
        this.A07 = z;
        this.A01 = d2;
        this.A06 = str;
        this.A03 = d3;
        this.A05 = str2;
        this.A02 = d4;
    }
}
