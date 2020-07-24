package com.instagram.location.contextualfeed.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import p000X.AnonymousClass11J;
import p000X.C221999hH;

public class LocationContextualFeedConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(346);
    public final EntityContextualFeedConfig A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public LocationContextualFeedConfig(C221999hH r2) {
        EntityContextualFeedConfig entityContextualFeedConfig = r2.A00;
        AnonymousClass11J.A00(entityContextualFeedConfig);
        this.A00 = entityContextualFeedConfig;
        String str = r2.A03;
        AnonymousClass11J.A00(str);
        this.A03 = str;
        String str2 = r2.A01;
        AnonymousClass11J.A00(str2);
        this.A01 = str2;
        String str3 = r2.A02;
        AnonymousClass11J.A00(str3);
        this.A02 = str3;
    }

    public LocationContextualFeedConfig(Parcel parcel) {
        this.A00 = (EntityContextualFeedConfig) parcel.readParcelable(EntityContextualFeedConfig.class.getClassLoader());
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
