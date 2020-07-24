package com.instagram.shopping.model.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.ShoppingDestinationTypeModel;

public class ShoppingExploreDeeplinkModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(464);
    public ExploreTopicCluster A00;
    public ShoppingDestinationTypeModel A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    public ShoppingExploreDeeplinkModel() {
    }

    public ShoppingExploreDeeplinkModel(Parcel parcel) {
        this.A01 = (ShoppingDestinationTypeModel) parcel.readParcelable(ShoppingDestinationTypeModel.class.getClassLoader());
        this.A00 = (ExploreTopicCluster) parcel.readParcelable(ExploreTopicCluster.class.getClassLoader());
    }
}
