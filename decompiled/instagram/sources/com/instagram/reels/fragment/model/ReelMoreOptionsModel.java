package com.instagram.reels.fragment.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.Arrays;
import p000X.AnonymousClass17M;
import p000X.C77693aR;

public class ReelMoreOptionsModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(80);
    public final InstagramShopLink A00;
    public final ProductCollectionLink A01;
    public final ProductCollectionLink A02;
    public final ProfileShopLink A03;
    public final ReelProductLink A04;
    public final BrandedContentTag A05;
    public final C77693aR A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ReelMoreOptionsModel reelMoreOptionsModel = (ReelMoreOptionsModel) obj;
            if (!AnonymousClass17M.A00(this.A06, reelMoreOptionsModel.A06) || !AnonymousClass17M.A00(this.A09, reelMoreOptionsModel.A09) || !AnonymousClass17M.A00(this.A08, reelMoreOptionsModel.A08) || !AnonymousClass17M.A00(this.A07, reelMoreOptionsModel.A07) || !AnonymousClass17M.A00(this.A03, reelMoreOptionsModel.A03) || !AnonymousClass17M.A00(this.A00, reelMoreOptionsModel.A00) || !AnonymousClass17M.A00(this.A01, reelMoreOptionsModel.A01) || !AnonymousClass17M.A00(this.A02, reelMoreOptionsModel.A02) || !AnonymousClass17M.A00(this.A04, reelMoreOptionsModel.A04) || !AnonymousClass17M.A00(this.A05, reelMoreOptionsModel.A05)) {
                return false;
            }
        }
        return true;
    }

    public final C77693aR A00() {
        C77693aR r0 = this.A06;
        if (r0 == null) {
            return C77693aR.NONE;
        }
        return r0;
    }

    public final String A01() {
        String str = this.A09;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final boolean A02() {
        if (!(!TextUtils.isEmpty(this.A09)) && !A04() && !A07()) {
            boolean z = false;
            if (this.A00 != null) {
                z = true;
            }
            if (!z && !A05() && !A06()) {
                boolean z2 = false;
                if (this.A04 != null) {
                    z2 = true;
                }
                if (!z2) {
                    boolean z3 = false;
                    if (this.A07 != null) {
                        z3 = true;
                    }
                    if (z3) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean A03() {
        if (this.A05 != null) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        if (this.A08 != null) {
            return true;
        }
        return false;
    }

    public final boolean A05() {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public final boolean A06() {
        if (this.A02 != null) {
            return true;
        }
        return false;
    }

    public final boolean A07() {
        if (this.A03 != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A09, this.A08, this.A07, this.A03, this.A00, this.A01, this.A02, this.A04, this.A05});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C77693aR r0 = this.A06;
        if (r0 != null) {
            str = r0.name();
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
    }

    public ReelMoreOptionsModel(C77693aR r1, String str, String str2, String str3, ProfileShopLink profileShopLink, InstagramShopLink instagramShopLink, ProductCollectionLink productCollectionLink, ProductCollectionLink productCollectionLink2, ReelProductLink reelProductLink, BrandedContentTag brandedContentTag) {
        this.A06 = r1;
        this.A09 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A03 = profileShopLink;
        this.A00 = instagramShopLink;
        this.A01 = productCollectionLink;
        this.A02 = productCollectionLink2;
        this.A04 = reelProductLink;
        this.A05 = brandedContentTag;
    }

    public ReelMoreOptionsModel(Parcel parcel) {
        C77693aR r0;
        String readString = parcel.readString();
        if (readString != null) {
            r0 = C77693aR.valueOf(readString);
        } else {
            r0 = null;
        }
        this.A06 = r0;
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        this.A03 = (ProfileShopLink) parcel.readParcelable(ProfileShopLink.class.getClassLoader());
        this.A00 = (InstagramShopLink) parcel.readParcelable(InstagramShopLink.class.getClassLoader());
        Class<ProductCollectionLink> cls = ProductCollectionLink.class;
        this.A01 = (ProductCollectionLink) parcel.readParcelable(cls.getClassLoader());
        this.A02 = (ProductCollectionLink) parcel.readParcelable(cls.getClassLoader());
        this.A04 = (ReelProductLink) parcel.readParcelable(ReelProductLink.class.getClassLoader());
        this.A05 = (BrandedContentTag) parcel.readParcelable(BrandedContentTag.class.getClassLoader());
    }
}
