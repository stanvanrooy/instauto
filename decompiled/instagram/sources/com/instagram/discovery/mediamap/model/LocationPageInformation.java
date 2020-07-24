package com.instagram.discovery.mediamap.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass6VO;
import p000X.C155166jx;

public class LocationPageInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(324);
    public C155166jx A00;
    public AnonymousClass6VO A01;
    public Integer A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.A03);
        Integer num = this.A02;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
    }

    public LocationPageInformation() {
    }

    public LocationPageInformation(Parcel parcel) {
        Integer valueOf;
        this.A03 = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(readInt);
        }
        this.A02 = valueOf;
    }
}
