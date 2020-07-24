package p000X;

/* renamed from: X.0ia  reason: invalid class name and case insensitive filesystem */
public final class C13470ia extends C13110hu {
    public String A00;
    public C13470ia A01 = null;
    public final C13470ia A02;

    public final int A02() {
        int i = this.A01;
        if (i == 2) {
            if (this.A00 == null) {
                return 5;
            }
            this.A00 = null;
            this.A00++;
            return 2;
        } else if (i == 1) {
            int i2 = this.A00;
            this.A00 = i2 + 1;
            if (i2 >= 0) {
                return 1;
            }
            return 0;
        } else {
            int i3 = this.A00 + 1;
            this.A00 = i3;
            if (i3 != 0) {
                return 3;
            }
            return 0;
        }
    }

    public final int A03(String str) {
        if (this.A01 != 2 || this.A00 != null) {
            return 4;
        }
        this.A00 = str;
        if (this.A00 < 0) {
            return 0;
        }
        return 1;
    }

    public final C13470ia A04() {
        C13470ia r2 = this.A01;
        if (r2 == null) {
            C13470ia r0 = new C13470ia(1, this);
            this.A01 = r0;
            return r0;
        }
        r2.A01 = 1;
        r2.A00 = -1;
        r2.A00 = null;
        return r2;
    }

    public final C13470ia A05() {
        C13470ia r2 = this.A01;
        if (r2 == null) {
            C13470ia r0 = new C13470ia(2, this);
            this.A01 = r0;
            return r0;
        }
        r2.A01 = 2;
        r2.A00 = -1;
        r2.A00 = null;
        return r2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.A01;
        if (i == 2) {
            sb.append('{');
            String str = this.A00;
            if (str != null) {
                sb.append('\"');
                sb.append(str);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else if (i == 1) {
            sb.append('[');
            int i2 = this.A00;
            if (i2 < 0) {
                i2 = 0;
            }
            sb.append(i2);
            sb.append(']');
        } else {
            sb.append("/");
        }
        return sb.toString();
    }

    public C13470ia(int i, C13470ia r3) {
        this.A01 = i;
        this.A02 = r3;
        this.A00 = -1;
    }
}
