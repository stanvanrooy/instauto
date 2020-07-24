package p000X;

/* renamed from: X.D58 */
public final class D58 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D58 d58 = (D58) obj;
            if (!C25948Bd0.A0D(this.A01, d58.A01) || !C25948Bd0.A0D(this.A02, d58.A02) || !C25948Bd0.A0D(this.A00, d58.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.A01;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.A00;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public D58(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
