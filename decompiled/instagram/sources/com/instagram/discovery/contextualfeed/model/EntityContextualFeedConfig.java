package com.instagram.discovery.contextualfeed.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.discovery.api.model.SectionPagination;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass2UT;
import p000X.AnonymousClass2UW;

public class EntityContextualFeedConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(35);
    public final int A00;
    public final int A01;
    public final SectionPagination A02;
    public final AnonymousClass2UW A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeSerializable(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public EntityContextualFeedConfig(AnonymousClass2UT r2) {
        SectionPagination sectionPagination = r2.A02;
        AnonymousClass11J.A00(sectionPagination);
        this.A02 = sectionPagination;
        this.A03 = r2.A03;
        this.A05 = r2.A05;
        this.A04 = r2.A04;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A06 = r2.A06;
    }

    public EntityContextualFeedConfig(Parcel parcel) {
        this.A02 = (SectionPagination) parcel.readParcelable(SectionPagination.class.getClassLoader());
        this.A03 = (AnonymousClass2UW) parcel.readSerializable();
        this.A01 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A06 = parcel.readInt() != 1 ? false : true;
    }
}
