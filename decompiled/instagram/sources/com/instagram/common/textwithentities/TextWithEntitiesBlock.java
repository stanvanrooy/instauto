package com.instagram.common.textwithentities;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C25980BdZ;

public class TextWithEntitiesBlock implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(287);
    public int A00;
    public C25980BdZ A01;
    public TextWithEntities A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01.toString());
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
    }

    public TextWithEntitiesBlock() {
    }

    public TextWithEntitiesBlock(Parcel parcel) {
        this.A01 = (C25980BdZ) C25980BdZ.A01.get(parcel.readString());
        this.A00 = parcel.readInt();
        this.A02 = (TextWithEntities) parcel.readParcelable(TextWithEntities.class.getClassLoader());
    }
}
