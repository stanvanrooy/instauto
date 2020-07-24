package com.instagram.save.contextualfeed.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.save.model.SavedCollection;
import p000X.AnonymousClass0a4;
import p000X.C195158Wx;

public class SavedContextualFeedNetworkConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(454);
    public SavedCollection A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public SavedContextualFeedNetworkConfig(C195158Wx r2) {
        SavedCollection savedCollection = r2.A00;
        AnonymousClass0a4.A06(savedCollection);
        this.A00 = savedCollection;
        this.A01 = r2.A01;
    }

    public SavedContextualFeedNetworkConfig(Parcel parcel) {
        this.A00 = (SavedCollection) parcel.readParcelable(SavedCollection.class.getClassLoader());
        this.A01 = parcel.readString();
    }
}
