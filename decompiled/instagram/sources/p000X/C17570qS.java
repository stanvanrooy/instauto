package p000X;

/* renamed from: X.0qS  reason: invalid class name and case insensitive filesystem */
public final class C17570qS {
    public final long A00;
    public final String A01;
    public final String A02;

    public final String toString() {
        StringBuilder sb;
        String str = this.A02;
        if (str == null) {
            sb = new StringBuilder();
            sb.append(this.A01);
            sb.append(" : ");
            sb.append(this.A00);
        } else {
            sb = new StringBuilder();
            sb.append(this.A01);
            sb.append(" : ");
            sb.append(this.A00);
            sb.append(" : ");
            sb.append(str);
        }
        return sb.toString();
    }

    public C17570qS(String str, long j, String str2) {
        this.A01 = str;
        this.A00 = j;
        this.A02 = str2;
    }
}
