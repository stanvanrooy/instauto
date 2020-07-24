package com.instagram.creation.capture.quickcapture.effectinfobottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.effect.AREffect;
import com.instagram.model.shopping.ProductAREffectContainer;
import p000X.C43091tn;

public class EffectInfoAttributionConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(298);
    public EffectAttribution A00;
    public EffectInfoBottomSheetMode A01;
    public C43091tn A02;
    public AREffect A03;
    public ProductAREffectContainer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public final int describeContents() {
        return 0;
    }

    public final boolean A00() {
        return this.A03.AhP();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A01, 0);
        parcel.writeSerializable(this.A02);
    }

    public EffectInfoAttributionConfiguration() {
    }

    public EffectInfoAttributionConfiguration(Parcel parcel) {
        this.A03 = (AREffect) parcel.readParcelable(AREffect.class.getClassLoader());
        this.A05 = parcel.readString();
        this.A00 = (EffectAttribution) parcel.readParcelable(EffectAttribution.class.getClassLoader());
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A06 = parcel.readString();
        this.A04 = (ProductAREffectContainer) parcel.readParcelable(ProductAREffectContainer.class.getClassLoader());
        this.A07 = parcel.readString();
        this.A01 = (EffectInfoBottomSheetMode) parcel.readParcelable(EffectInfoBottomSheetMode.class.getClassLoader());
        this.A02 = (C43091tn) parcel.readSerializable();
    }
}
