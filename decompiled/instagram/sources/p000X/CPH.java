package p000X;

import java.util.List;

/* renamed from: X.CPH */
public final class CPH {
    public final String A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public static /* synthetic */ CPH A00(CPH cph, String str, List list, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = cph.A00;
        }
        if ((i & 2) != 0) {
            list = cph.A01;
        }
        if ((i & 4) != 0) {
            z = cph.A03;
        }
        if ((i & 8) != 0) {
            z2 = cph.A02;
        }
        C13150hy.A02(str, "searchQuery");
        C13150hy.A02(list, "items");
        return new CPH(str, list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CPH)) {
            return false;
        }
        CPH cph = (CPH) obj;
        return C13150hy.A05(this.A00, cph.A00) && C13150hy.A05(this.A01, cph.A01) && this.A03 == cph.A03 && this.A02 == cph.A02;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.A01;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.A03;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.A02;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public final String toString() {
        return "CollectionSelectionState(searchQuery=" + this.A00 + ", items=" + this.A01 + ", isSearching=" + this.A03 + ", hasMoreItems=" + this.A02 + ")";
    }

    public CPH(String str, List list, boolean z, boolean z2) {
        C13150hy.A02(str, "searchQuery");
        C13150hy.A02(list, "items");
        this.A00 = str;
        this.A01 = list;
        this.A03 = z;
        this.A02 = z2;
    }
}
