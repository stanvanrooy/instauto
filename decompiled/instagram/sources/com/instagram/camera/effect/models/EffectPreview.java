package com.instagram.camera.effect.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductAREffectContainer;
import p000X.C33971dn;
import p000X.C43091tn;

public class EffectPreview implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(272);
    public AttributionUser A00;
    public EffectActionSheet A01;
    public ImageUrl A02;
    public ImageUrl A03;
    public C43091tn A04;
    public C33971dn A05;
    public ProductAREffectContainer A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A09);
        parcel.writeSerializable(this.A04);
    }

    public EffectPreview() {
    }

    public EffectPreview(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        Class<ImageUrl> cls = ImageUrl.class;
        this.A02 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        this.A0A = parcel.readString();
        this.A03 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        this.A00 = (AttributionUser) parcel.readParcelable(AttributionUser.class.getClassLoader());
        this.A0B = parcel.readString();
        this.A01 = (EffectActionSheet) parcel.readParcelable(EffectActionSheet.class.getClassLoader());
        this.A06 = (ProductAREffectContainer) parcel.readParcelable(ProductAREffectContainer.class.getClassLoader());
        this.A09 = parcel.readString();
        this.A04 = (C43091tn) parcel.readSerializable();
    }

    public EffectPreview(String str, String str2, ImageUrl imageUrl, C33971dn r4, String str3, ImageUrl imageUrl2, AttributionUser attributionUser, String str4, EffectActionSheet effectActionSheet, ProductAREffectContainer productAREffectContainer, C43091tn r11) {
        this.A07 = str;
        this.A08 = str2;
        this.A02 = imageUrl;
        this.A05 = r4;
        this.A0A = str3;
        this.A03 = imageUrl2;
        this.A00 = attributionUser;
        this.A0B = str4;
        this.A01 = effectActionSheet;
        this.A06 = productAREffectContainer;
        this.A04 = r11;
    }
}
