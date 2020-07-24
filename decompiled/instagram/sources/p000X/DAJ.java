package p000X;

import android.text.TextUtils;

/* renamed from: X.DAJ */
public final class DAJ {
    public final int A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DAJ daj = (DAJ) obj;
            if (!(this.A00 == daj.A00 && this.A01 == daj.A01 && TextUtils.equals(this.A02, daj.A02))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = ((this.A00 * 31) + this.A01) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public DAJ(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }
}
