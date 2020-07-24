package p000X;

/* renamed from: X.1jm  reason: invalid class name and case insensitive filesystem */
public final class C37511jm {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r1 == r6.A01) goto L_0x0028;
     */
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37511jm) {
                C37511jm r6 = (C37511jm) obj;
                int i = this.A00;
                if (i == r6.A00) {
                    if (i == 8) {
                        int i2 = this.A01;
                        int i3 = this.A02;
                        if (Math.abs(i2 - i3) == 1) {
                            if (i2 == r6.A02) {
                            }
                        }
                    }
                    if (this.A01 == r6.A01 && this.A02 == r6.A02) {
                        Object obj2 = this.A03;
                        if (obj2 != null) {
                            if (!obj2.equals(r6.A03)) {
                                return false;
                            }
                        } else if (r6.A03 != null) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A02) * 31) + this.A01;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.A00;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i == 4) {
            str = "up";
        } else if (i != 8) {
            str = "??";
        } else {
            str = "mv";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.A02);
        sb.append("c:");
        sb.append(this.A01);
        sb.append(",p:");
        sb.append(this.A03);
        sb.append("]");
        return sb.toString();
    }

    public C37511jm(int i, int i2, int i3, Object obj) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = obj;
    }
}
