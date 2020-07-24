package p000X;

import java.util.List;

/* renamed from: X.AM8 */
public final class AM8 {
    public int A00 = 0;
    public int A01 = 0;
    public C23334AIl A02 = null;
    public List A03;

    public AM8() {
        AnonymousClass10U r3 = AnonymousClass10U.A00;
        C13150hy.A02(r3, "likers");
        this.A03 = r3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AM8)) {
            return false;
        }
        AM8 am8 = (AM8) obj;
        return this.A00 == am8.A00 && this.A01 == am8.A01 && C13150hy.A05(this.A02, am8.A02) && C13150hy.A05(this.A03, am8.A03);
    }

    public final int hashCode() {
        int i = ((this.A00 * 31) + this.A01) * 31;
        C23334AIl aIl = this.A02;
        int i2 = 0;
        int hashCode = (i + (aIl != null ? aIl.hashCode() : 0)) * 31;
        List list = this.A03;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "IgLiveLikeCountBySupportTier(burstCount=" + this.A00 + ", likes=" + this.A01 + ", supportTier=" + this.A02 + ", likers=" + this.A03 + ")";
    }
}
