package com.instagram.discovery.mediamap.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.maps.model.LatLng;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.Venue;
import java.util.Arrays;
import p000X.C28786Cmh;

public class MediaMapPin implements Parcelable, C28786Cmh {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(325);
    public LatLng A00;
    public ImageUrl A01;
    public LocationPageInformation A02;
    public Venue A03;
    public Double A04;
    public Double A05;
    public String A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MediaMapPin mediaMapPin = (MediaMapPin) obj;
            if (!this.A03.equals(mediaMapPin.A03) || !this.A06.equals(mediaMapPin.A06)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A06});
    }

    public final LatLng ASM() {
        if (this.A00 == null) {
            this.A00 = new LatLng(this.A04.doubleValue(), this.A05.doubleValue());
        }
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public MediaMapPin() {
    }

    public MediaMapPin(Parcel parcel) {
        Venue venue = (Venue) parcel.readParcelable(Venue.class.getClassLoader());
        this.A03 = venue;
        this.A04 = venue.A00;
        this.A05 = venue.A01;
        this.A06 = parcel.readString();
        this.A01 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        this.A02 = (LocationPageInformation) parcel.readParcelable(LocationPageInformation.class.getClassLoader());
    }
}
