package com.facebook.cameracore.ardelivery.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.List;
import p000X.Constants;

public class ARRequestEffect implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(37);
    public Integer A00;
    public String A01;
    public final ARRequestAsset A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
        parcel.writeTypedList(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00.intValue());
    }

    public ARRequestEffect(Parcel parcel) {
        this.A02 = (ARRequestAsset) parcel.readParcelable(ARRequestAsset.class.getClassLoader());
        this.A03 = parcel.readString();
        this.A05 = parcel.createTypedArrayList(ARRequestAsset.CREATOR);
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = Constants.ZERO(2)[parcel.readInt()];
    }
}
