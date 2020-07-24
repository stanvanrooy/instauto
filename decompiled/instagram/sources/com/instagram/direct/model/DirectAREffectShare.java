package com.instagram.direct.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ThumbnailImage;
import java.util.Collections;
import java.util.List;
import p000X.C103044ca;
import p000X.C103074ce;
import p000X.C103134ck;
import p000X.C103144cl;
import p000X.C103164cn;
import p000X.C33971dn;

public class DirectAREffectShare implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(318);
    public ImageUrl A00;
    public ImageUrl A01;
    public C103044ca A02;
    public C33971dn A03;
    public ProductAREffectContainer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09 = Collections.emptyList();
    public List A0A = Collections.emptyList();

    public final int describeContents() {
        return 0;
    }

    public final ImageUrl A00() {
        C103144cl r0;
        C103074ce r02;
        C103164cn r03;
        ThumbnailImage thumbnailImage;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer != null && (thumbnailImage = productAREffectContainer.A00.A01.A00) != null) {
            return thumbnailImage.A00;
        }
        ImageUrl imageUrl = this.A01;
        if (imageUrl != null) {
            return imageUrl;
        }
        C103044ca r04 = this.A02;
        if (r04 == null || (r0 = r04.A00) == null || (r02 = r0.A00) == null || (r03 = r02.A02) == null) {
            return null;
        }
        return new SimpleImageUrl(r03.A00);
    }

    public final String A01() {
        C103144cl r0;
        C103074ce r02;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer != null) {
            return productAREffectContainer.A00.A00.A02.A03;
        }
        String str = this.A06;
        if (str != null) {
            return str;
        }
        C103044ca r03 = this.A02;
        if (!(r03 == null || (r0 = r03.A00) == null || (r02 = r0.A00) == null)) {
            C103134ck r04 = r02.A00;
            if (r04 == null) {
                return "Instagram";
            }
            String str2 = r04.A02;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final String A02() {
        C103144cl r0;
        C103074ce r02;
        String str;
        String str2 = this.A07;
        if (str2 != null) {
            return str2;
        }
        C103044ca r03 = this.A02;
        if (r03 == null || (r0 = r03.A00) == null || (r02 = r0.A00) == null || (str = r02.A04) == null) {
            return "";
        }
        return str;
    }

    public final String A03() {
        C103144cl r0;
        C103074ce r02;
        String str;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer != null) {
            return productAREffectContainer.A00.A00.A0I;
        }
        String str2 = this.A08;
        if (str2 != null) {
            return str2;
        }
        C103044ca r03 = this.A02;
        if (r03 == null || (r0 = r03.A00) == null || (r02 = r0.A00) == null || (str = r02.A05) == null) {
            return "";
        }
        return str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
    }

    public DirectAREffectShare() {
    }

    public DirectAREffectShare(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        Class<ImageUrl> cls = ImageUrl.class;
        this.A01 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
    }

    public DirectAREffectShare(String str, String str2, ImageUrl imageUrl, String str3, ProductAREffectContainer productAREffectContainer) {
        this.A07 = str;
        this.A08 = str2;
        this.A01 = imageUrl;
        this.A06 = str3;
        this.A05 = null;
        this.A00 = null;
        this.A04 = productAREffectContainer;
    }
}
