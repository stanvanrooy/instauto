package p000X;

import java.util.Arrays;

/* renamed from: X.BBD */
public final class BBD {
    public final BBE A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BBD bbd = (BBD) obj;
            if (!A00(this.A00, bbd.A00) || !A00(this.A01, bbd.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public static boolean A00(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public BBD(BBE bbe, String str) {
        this.A00 = bbe;
        this.A01 = str;
    }
}
