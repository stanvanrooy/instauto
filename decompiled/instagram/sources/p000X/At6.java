package p000X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.At6 */
public final class At6 {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof At6)) {
            return false;
        }
        At6 at6 = (At6) obj;
        return this.A04 == at6.A04 && C13150hy.A05(this.A03, at6.A03) && C13150hy.A05(this.A02, at6.A02) && C13150hy.A05(this.A01, at6.A01) && this.A06 == at6.A06 && this.A05 == at6.A05 && C13150hy.A05(this.A00, at6.A00);
    }

    public final int hashCode() {
        boolean z = this.A04;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        List list = this.A03;
        int i3 = 0;
        int hashCode = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.A02;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.A01;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z2 = this.A06;
        if (z2) {
            z2 = true;
        }
        int i4 = (hashCode3 + (z2 ? 1 : 0)) * 31;
        if (!this.A05) {
            i = 0;
        }
        int i5 = (i4 + i) * 31;
        ImageUrl imageUrl = this.A00;
        if (imageUrl != null) {
            i3 = imageUrl.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        return "RtcCallEndViewModel(show=" + this.A04 + ", facepileUrls=" + this.A03 + ", title=" + this.A02 + ", subtitle=" + this.A01 + ", showUserFeedback=" + this.A06 + ", showCallAgainControls=" + this.A05 + ", backgroundUrl=" + this.A00 + ")";
    }

    public At6(boolean z, List list, String str, String str2, boolean z2, boolean z3, ImageUrl imageUrl) {
        C13150hy.A02(list, "facepileUrls");
        C13150hy.A02(imageUrl, "backgroundUrl");
        this.A04 = z;
        this.A03 = list;
        this.A02 = str;
        this.A01 = str2;
        this.A06 = z2;
        this.A05 = z3;
        this.A00 = imageUrl;
    }
}
