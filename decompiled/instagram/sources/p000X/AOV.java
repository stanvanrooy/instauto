package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.AOV */
public final class AOV {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public HashMap A07;
    public List A08;
    public boolean A09;

    public AOV() {
        this((String) null, (String) null, (String) null, false, (String) null, (String) null, (HashMap) null, (String) null, (List) null, (String) null, 1023, (AnonymousClass7BR) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AOV)) {
            return false;
        }
        AOV aov = (AOV) obj;
        return C13150hy.A05(this.A00, aov.A00) && C13150hy.A05(this.A01, aov.A01) && C13150hy.A05(this.A04, aov.A04) && this.A09 == aov.A09 && C13150hy.A05(this.A02, aov.A02) && C13150hy.A05(this.A03, aov.A03) && C13150hy.A05(this.A07, aov.A07) && C13150hy.A05(this.A05, aov.A05) && C13150hy.A05(this.A08, aov.A08) && C13150hy.A05(this.A06, aov.A06);
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A04;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.A09;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str4 = this.A02;
        int hashCode4 = (i2 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.A03;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        HashMap hashMap = this.A07;
        int hashCode6 = (hashCode5 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        String str6 = this.A05;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List list = this.A08;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        String str7 = this.A06;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "UserPayConsumptionSheetViewModel(description=" + this.A00 + ", digitalNonConsumableProductId=" + this.A01 + ", payeeId=" + this.A04 + ", isLoading=" + this.A09 + ", mediaId=" + this.A02 + ", mediaOwnerId=" + this.A03 + ", priceHashMap=" + this.A07 + ", privacyDisclaimer=" + this.A05 + ", tierInfos=" + this.A08 + ", title=" + this.A06 + ")";
    }

    public /* synthetic */ AOV(String str, String str2, String str3, boolean z, String str4, String str5, HashMap hashMap, String str6, List list, String str7, int i, AnonymousClass7BR r24) {
        HashMap hashMap2 = new HashMap();
        AnonymousClass10U r3 = AnonymousClass10U.A00;
        C13150hy.A02("", "description");
        C13150hy.A02("", "digitalNonConsumableProductId");
        C13150hy.A02("", "payeeId");
        C13150hy.A02("", "mediaId");
        C13150hy.A02("", "mediaOwnerId");
        C13150hy.A02(hashMap2, "priceHashMap");
        C13150hy.A02("", "privacyDisclaimer");
        C13150hy.A02(r3, "tierInfos");
        C13150hy.A02("", DialogModule.KEY_TITLE);
        this.A00 = "";
        this.A01 = "";
        this.A04 = "";
        this.A09 = false;
        this.A02 = "";
        this.A03 = "";
        this.A07 = hashMap2;
        this.A05 = "";
        this.A08 = r3;
        this.A06 = "";
    }
}
