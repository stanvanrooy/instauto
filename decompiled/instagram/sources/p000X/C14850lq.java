package p000X;

import java.util.Arrays;

/* renamed from: X.0lq  reason: invalid class name and case insensitive filesystem */
public final class C14850lq {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C14850lq r5 = (C14850lq) obj;
            if (this.A00 != r5.A00) {
                return false;
            }
            String str = this.A02;
            String str2 = r5.A02;
            if (str != str2 && (str == null || !str.equals(str2))) {
                return false;
            }
            String str3 = this.A01;
            String str4 = r5.A01;
            return str3 == str4 || (str3 != null && str3.equals(str4));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A02, this.A01});
    }

    public C14850lq(int i, String str, String str2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }
}
