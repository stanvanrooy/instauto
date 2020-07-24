package com.instagram.shopping.model.pdp.herocarousel;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.ProductArEffectMetadata;
import p000X.Constants;
import p000X.AnonymousClass9DH;
import p000X.AnonymousClass9DI;
import p000X.C13150hy;
import p000X.C211939Ce;
import p000X.C211979Ci;
import p000X.C211989Cj;
import p000X.C211999Ck;

public class HeroCarouselItemConverter$ParcelableHeroCarouselItemModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(468);
    public final ImageInfo A00;
    public final ProductArEffectMetadata A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(C211939Ce.A01(this.A02));
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A07);
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C211979Ci r2) {
        this.A05 = r2.A01();
        this.A02 = r2.A01;
        String id = r2.A00.getId();
        this.A09 = id;
        this.A08 = id;
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = r2.A01.getId();
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C211989Cj r2) {
        this.A05 = r2.A01();
        this.A02 = r2.A01;
        this.A09 = r2.A00.getId();
        this.A08 = null;
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = null;
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(C211999Ck r2) {
        this.A05 = r2.A01();
        this.A02 = r2.A01;
        this.A09 = r2.A01.getId();
        this.A08 = r2.A00.getId();
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = null;
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(AnonymousClass9DH r3) {
        this.A05 = r3.A01();
        this.A02 = r3.A01;
        this.A09 = null;
        this.A08 = null;
        this.A00 = r3.A00;
        this.A06 = r3.A03;
        this.A04 = r3.A05;
        this.A03 = r3.A04;
        this.A01 = r3.A01;
        this.A07 = null;
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(AnonymousClass9DI r3) {
        this.A05 = r3.A01();
        this.A02 = r3.A01;
        this.A09 = null;
        this.A08 = null;
        this.A00 = r3.A00;
        this.A06 = r3.A02;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A07 = null;
    }

    public HeroCarouselItemConverter$ParcelableHeroCarouselItemModel(Parcel parcel) {
        Integer num;
        this.A05 = parcel.readString();
        String readString = parcel.readString();
        C13150hy.A02(readString, "serverValue");
        Integer[] A002 = Constants.ZERO(6);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = null;
                break;
            }
            num = A002[i];
            if (C13150hy.A05(C211939Ce.A01(num), readString)) {
                break;
            }
            i++;
        }
        this.A02 = num;
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A00 = (ImageInfo) parcel.readParcelable(ImageInfo.class.getClassLoader());
        this.A06 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = (ProductArEffectMetadata) parcel.readParcelable(ProductArEffectMetadata.class.getClassLoader());
        this.A07 = parcel.readString();
    }
}
