package com.instagram.guides.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.guides.intf.model.MinimalGuide;
import p000X.AnonymousClass6VD;

public class GuideFragmentConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(338);
    public final AnonymousClass6VD A00;
    public final MinimalGuide A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A00.A00);
    }

    public GuideFragmentConfig(Parcel parcel) {
        this.A01 = (MinimalGuide) parcel.readParcelable(MinimalGuide.class.getClassLoader());
        this.A00 = (AnonymousClass6VD) AnonymousClass6VD.A01.get(parcel.readString());
    }

    public GuideFragmentConfig(MinimalGuide minimalGuide, AnonymousClass6VD r2) {
        this.A01 = minimalGuide;
        this.A00 = r2;
    }
}
