package p000X;

/* renamed from: X.0ht  reason: invalid class name and case insensitive filesystem */
public final class C13100ht extends C13110hu {
    public int A00;
    public int A01;
    public String A02;
    public C13100ht A03 = null;
    public final C13100ht A04;

    public final C13100ht A02(int i, int i2) {
        C13100ht r2 = this.A03;
        if (r2 == null) {
            C13100ht r0 = new C13100ht(this, 1, i, i2);
            this.A03 = r0;
            return r0;
        }
        r2.A01 = 1;
        r2.A00 = -1;
        r2.A01 = i;
        r2.A00 = i2;
        r2.A02 = null;
        return r2;
    }

    public final C13100ht A03(int i, int i2) {
        C13100ht r2 = this.A03;
        if (r2 == null) {
            C13100ht r0 = new C13100ht(this, 2, i, i2);
            this.A03 = r0;
            return r0;
        }
        r2.A01 = 2;
        r2.A00 = -1;
        r2.A01 = i;
        r2.A00 = i2;
        r2.A02 = null;
        return r2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.A01;
        if (i == 0) {
            sb.append("/");
        } else if (i == 1) {
            sb.append('[');
            int i2 = this.A00;
            if (i2 < 0) {
                i2 = 0;
            }
            sb.append(i2);
            sb.append(']');
        } else if (i == 2) {
            sb.append('{');
            String str = this.A02;
            if (str != null) {
                sb.append('\"');
                C13180i1.A00(sb, str);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        }
        return sb.toString();
    }

    public C13100ht(C13100ht r2, int i, int i2, int i3) {
        this.A01 = i;
        this.A04 = r2;
        this.A01 = i2;
        this.A00 = i3;
        this.A00 = -1;
    }
}
