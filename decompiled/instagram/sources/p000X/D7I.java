package p000X;

import android.text.TextUtils;

/* renamed from: X.D7I */
public final class D7I {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != D7I.class) {
                return false;
            }
            D7I d7i = (D7I) obj;
            if (!(TextUtils.equals(this.A00, d7i.A00) && this.A01 == d7i.A01 && this.A02 == d7i.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.A00.hashCode() + 31) * 31;
        int i = 1231;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        int i3 = (hashCode + i2) * 31;
        if (!this.A02) {
            i = 1237;
        }
        return i3 + i;
    }

    public D7I(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }
}
