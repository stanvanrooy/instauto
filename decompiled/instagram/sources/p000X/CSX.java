package p000X;

import java.util.List;
import java.util.Set;

/* renamed from: X.CSX */
public final class CSX {
    public final String A00;
    public final List A01;
    public final Set A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public static /* synthetic */ CSX A00(CSX csx, String str, List list, Set set, boolean z, boolean z2, boolean z3, int i) {
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        Set set2 = set;
        String str2 = str;
        List list2 = list;
        if ((i & 1) != 0) {
            str2 = csx.A00;
        }
        if ((i & 2) != 0) {
            list2 = csx.A01;
        }
        if ((i & 4) != 0) {
            set2 = csx.A02;
        }
        if ((i & 8) != 0) {
            z6 = csx.A04;
        }
        if ((i & 16) != 0) {
            z5 = csx.A05;
        }
        if ((i & 32) != 0) {
            z4 = csx.A03;
        }
        C13150hy.A02(str2, "searchQuery");
        C13150hy.A02(list2, "items");
        C13150hy.A02(set2, "hiddenItemSectionIds");
        return new CSX(str2, list2, set2, z6, z5, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CSX)) {
            return false;
        }
        CSX csx = (CSX) obj;
        return C13150hy.A05(this.A00, csx.A00) && C13150hy.A05(this.A01, csx.A01) && C13150hy.A05(this.A02, csx.A02) && this.A04 == csx.A04 && this.A05 == csx.A05 && this.A03 == csx.A03;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.A01;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Set set = this.A02;
        if (set != null) {
            i = set.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.A04;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A05;
        if (z2) {
            z2 = true;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A03;
        if (z3) {
            z3 = true;
        }
        return i4 + (z3 ? 1 : 0);
    }

    public final String toString() {
        return "ShopManagementEditCollectionState(searchQuery=" + this.A00 + ", items=" + this.A01 + ", hiddenItemSectionIds=" + this.A02 + ", isSearching=" + this.A04 + ", isError=" + this.A05 + ", hasMoreItems=" + this.A03 + ")";
    }

    public CSX(String str, List list, Set set, boolean z, boolean z2, boolean z3) {
        C13150hy.A02(str, "searchQuery");
        C13150hy.A02(list, "items");
        C13150hy.A02(set, "hiddenItemSectionIds");
        this.A00 = str;
        this.A01 = list;
        this.A02 = set;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = z3;
    }
}
