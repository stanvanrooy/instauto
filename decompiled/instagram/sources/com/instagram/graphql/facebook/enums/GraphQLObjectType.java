package com.instagram.graphql.facebook.enums;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.DiW;

public class GraphQLObjectType implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(336);
    public int A00 = 0;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        if (this.A00 == 0 && (str = this.A01) != null) {
            this.A00 = DiW.A00(str);
        }
        return DiW.A01(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public GraphQLObjectType() {
    }

    public GraphQLObjectType(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A00 = readInt;
        this.A01 = DiW.A01(readInt);
    }
}
