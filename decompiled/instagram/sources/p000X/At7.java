package p000X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.At7 */
public final class At7 {
    public final ImageUrl A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof At7)) {
            return false;
        }
        At7 at7 = (At7) obj;
        return this.A02 == at7.A02 && this.A01 == at7.A01 && C13150hy.A05(this.A00, at7.A00);
    }

    public final int hashCode() {
        boolean z = this.A02;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        if (!this.A01) {
            i = 0;
        }
        int i3 = (i2 + i) * 31;
        ImageUrl imageUrl = this.A00;
        return i3 + (imageUrl != null ? imageUrl.hashCode() : 0);
    }

    public final String toString() {
        return "RtcCallMinimizedEndViewModel(show=" + this.A02 + ", requestUserFeedback=" + this.A01 + ", backgroundUrl=" + this.A00 + ")";
    }

    public At7(boolean z, boolean z2, ImageUrl imageUrl) {
        C13150hy.A02(imageUrl, "backgroundUrl");
        this.A02 = z;
        this.A01 = z2;
        this.A00 = imageUrl;
    }
}
