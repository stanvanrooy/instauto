package com.instagram.discovery.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.ArrayList;
import p000X.AnonymousClass2UU;

public class SectionPagination implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(34);
    public final String A00;
    public final String A01;
    public final ArrayList A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A02);
        parcel.writeString(this.A01);
    }

    public SectionPagination(AnonymousClass2UU r2) {
        this.A00 = r2.A00;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
    }

    public SectionPagination(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A02 = parcel.createStringArrayList();
        this.A01 = parcel.readString();
    }
}
