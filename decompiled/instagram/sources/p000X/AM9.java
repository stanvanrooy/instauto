package p000X;

import java.util.List;

/* renamed from: X.AM9 */
public final class AM9 {
    public int A00 = 0;
    public int A01 = 0;
    public List A02;

    public AM9() {
        AnonymousClass10U r3 = AnonymousClass10U.A00;
        C13150hy.A02(r3, "likeCountBySupportTier");
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AM9)) {
            return false;
        }
        AM9 am9 = (AM9) obj;
        return C13150hy.A05(this.A02, am9.A02) && this.A01 == am9.A01 && this.A00 == am9.A00;
    }

    public final int hashCode() {
        List list = this.A02;
        return ((((list != null ? list.hashCode() : 0) * 31) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        return "IgLiveUserPayLikeSupporterInfo(likeCountBySupportTier=" + this.A02 + ", supporterTierLikes=" + this.A01 + ", supporterTierBurstLikes=" + this.A00 + ")";
    }
}
