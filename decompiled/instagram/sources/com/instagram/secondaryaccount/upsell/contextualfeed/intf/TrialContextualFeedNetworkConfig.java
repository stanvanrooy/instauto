package com.instagram.secondaryaccount.upsell.contextualfeed.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.LinkedList;
import java.util.List;
import p000X.C127135ca;

public class TrialContextualFeedNetworkConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(456);
    public List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A00);
    }

    public TrialContextualFeedNetworkConfig(C127135ca r3) {
        this.A00 = new LinkedList(r3.A00);
    }

    public TrialContextualFeedNetworkConfig(Parcel parcel) {
        LinkedList linkedList = new LinkedList();
        this.A00 = linkedList;
        parcel.readStringList(linkedList);
    }
}
