package com.instagram.explore.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

public class ExploreFragmentConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(37);
    public final int A00;
    public final Refinement A01;
    public final ExploreTopicCluster A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
    }

    public ExploreFragmentConfig(Parcel parcel) {
        this.A04 = parcel.readByte() != 0;
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A02 = (ExploreTopicCluster) parcel.readParcelable(ExploreTopicCluster.class.getClassLoader());
        this.A01 = (Refinement) parcel.readParcelable(Refinement.class.getClassLoader());
    }

    public ExploreFragmentConfig(boolean z, int i, String str, ExploreTopicCluster exploreTopicCluster, Refinement refinement) {
        this.A04 = z;
        this.A00 = i;
        this.A03 = str;
        this.A02 = exploreTopicCluster;
        this.A01 = refinement;
    }
}
