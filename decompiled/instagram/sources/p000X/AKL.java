package p000X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.AKL */
public final class AKL {
    public String A00 = null;
    public HashMap A01;
    public List A02 = null;

    public AKL() {
        HashMap hashMap = new HashMap();
        C13150hy.A02(hashMap, "supportersInComments");
        this.A01 = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKL)) {
            return false;
        }
        AKL akl = (AKL) obj;
        return C13150hy.A05(this.A01, akl.A01) && C13150hy.A05(this.A02, akl.A02) && C13150hy.A05(this.A00, akl.A00);
    }

    public final int hashCode() {
        HashMap hashMap = this.A01;
        int i = 0;
        int hashCode = (hashMap != null ? hashMap.hashCode() : 0) * 31;
        List list = this.A02;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "IgLiveUserPaySupportersInfo(supportersInComments=" + this.A01 + ", newSupporterComments=" + this.A02 + ", nextSupportersNextMinId=" + this.A00 + ")";
    }
}
