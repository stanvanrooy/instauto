package p000X;

import com.facebook.common.dextricks.DalvikConstants;

/* renamed from: X.D04 */
public final class D04 {
    public static final D04 A03 = new D04(Integer.MAX_VALUE, true, true);
    public int A00;
    public boolean A01;
    public boolean A02;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D04)) {
            return false;
        }
        D04 d04 = (D04) obj;
        return this.A00 == d04.A00 && this.A02 == d04.A02 && this.A01 == d04.A01;
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = 0;
        int i3 = 0;
        if (this.A02) {
            i3 = 4194304;
        }
        int i4 = i ^ i3;
        if (this.A01) {
            i2 = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
        }
        return i4 ^ i2;
    }

    public D04(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }
}
