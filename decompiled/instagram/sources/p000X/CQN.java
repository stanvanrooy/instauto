package p000X;

import com.instagram.model.shopping.ProductSource;
import java.util.List;
import java.util.Set;

/* renamed from: X.CQN */
public final class CQN {
    public final ProductSource A00;
    public final String A01;
    public final List A02;
    public final Set A03;
    public final Set A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public static /* synthetic */ CQN A00(CQN cqn, String str, List list, ProductSource productSource, Set set, Set set2, boolean z, boolean z2, boolean z3, int i) {
        boolean z4 = z3;
        boolean z5 = z2;
        int i2 = i;
        ProductSource productSource2 = productSource;
        boolean z6 = z;
        if ((i & 1) != 0) {
            str = cqn.A01;
        }
        if ((i & 2) != 0) {
            list = cqn.A02;
        }
        if ((i & 4) != 0) {
            productSource2 = cqn.A00;
        }
        if ((i & 8) != 0) {
            set = cqn.A03;
        }
        if ((i & 16) != 0) {
            set2 = cqn.A04;
        }
        if ((i & 32) != 0) {
            z6 = cqn.A06;
        }
        if ((i & 64) != 0) {
            z5 = cqn.A07;
        }
        if ((i2 & 128) != 0) {
            z4 = cqn.A05;
        }
        C13150hy.A02(str, "searchQuery");
        C13150hy.A02(list, "items");
        C13150hy.A02(set, "addedItemSectionIds");
        C13150hy.A02(set2, "addedProductIds");
        return new CQN(str, list, productSource2, set, set2, z6, z5, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CQN)) {
            return false;
        }
        CQN cqn = (CQN) obj;
        return C13150hy.A05(this.A01, cqn.A01) && C13150hy.A05(this.A02, cqn.A02) && C13150hy.A05(this.A00, cqn.A00) && C13150hy.A05(this.A03, cqn.A03) && C13150hy.A05(this.A04, cqn.A04) && this.A06 == cqn.A06 && this.A07 == cqn.A07 && this.A05 == cqn.A05;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.A02;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        ProductSource productSource = this.A00;
        int hashCode3 = (hashCode2 + (productSource != null ? productSource.hashCode() : 0)) * 31;
        Set set = this.A03;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.A04;
        if (set2 != null) {
            i = set2.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.A06;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A07;
        if (z2) {
            z2 = true;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A05;
        if (z3) {
            z3 = true;
        }
        return i4 + (z3 ? 1 : 0);
    }

    public final String toString() {
        return "PublishingAddProductState(searchQuery=" + this.A01 + ", items=" + this.A02 + ", productSource=" + this.A00 + ", addedItemSectionIds=" + this.A03 + ", addedProductIds=" + this.A04 + ", isSearching=" + this.A06 + ", isError=" + this.A07 + ", hasMoreItems=" + this.A05 + ")";
    }

    public CQN(String str, List list, ProductSource productSource, Set set, Set set2, boolean z, boolean z2, boolean z3) {
        C13150hy.A02(str, "searchQuery");
        C13150hy.A02(list, "items");
        C13150hy.A02(set, "addedItemSectionIds");
        C13150hy.A02(set2, "addedProductIds");
        this.A01 = str;
        this.A02 = list;
        this.A00 = productSource;
        this.A03 = set;
        this.A04 = set2;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = z3;
    }
}
