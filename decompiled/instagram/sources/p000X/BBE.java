package p000X;

import java.util.Arrays;

/* renamed from: X.BBE */
public final class BBE {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BBE bbe = (BBE) obj;
            if (!BBD.A00(this.A02, bbe.A02) || !BBD.A00(this.A00, bbe.A00) || !BBD.A00(this.A01, bbe.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A01});
    }

    public BBE(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
