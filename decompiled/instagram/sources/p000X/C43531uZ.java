package p000X;

import com.instagram.feed.media.EffectPreview;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1uZ  reason: invalid class name and case insensitive filesystem */
public final class C43531uZ {
    public int A00;
    public EffectPreview A01;
    public ProductCollectionLink A02;
    public ProfileShopLink A03;
    public ReelProductLink A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C43531uZ r5 = (C43531uZ) obj;
            if (this.A00 != r5.A00 || !AnonymousClass17M.A00(this.A09, r5.A09) || !AnonymousClass17M.A00(this.A05, r5.A05) || !AnonymousClass17M.A00(this.A06, r5.A06) || !AnonymousClass17M.A00(this.A07, r5.A07) || !AnonymousClass17M.A00(this.A08, r5.A08) || !AnonymousClass17M.A00(this.A01, r5.A01) || !AnonymousClass17M.A00(this.A03, r5.A03) || this.A0A != r5.A0A || !AnonymousClass17M.A00(this.A02, r5.A02) || !AnonymousClass17M.A00(this.A04, r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public final String A00() {
        if (AnonymousClass17M.A00("ar_effect", this.A08)) {
            return this.A07;
        }
        return null;
    }

    public final String A01() {
        String str = this.A06;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(95);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    public final String A02() {
        List list = this.A09;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return ((AnonymousClass1UP) this.A09.get(0)).A0A;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A09, Integer.valueOf(this.A00), this.A05, this.A06, this.A07, this.A08, this.A01, this.A03, Boolean.valueOf(this.A0A), this.A02, this.A04});
    }
}
