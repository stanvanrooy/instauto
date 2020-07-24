package com.instagram.creation.capture.quickcapture.effectinfobottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

public class EffectInfoBottomSheetConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(299);
    public int A00;
    public ImmutableList A01;
    public String A02;
    public boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeString(this.A02);
    }

    public EffectInfoBottomSheetConfiguration() {
    }

    public EffectInfoBottomSheetConfiguration(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, EffectInfoAttributionConfiguration.CREATOR);
        this.A01 = ImmutableList.A09(arrayList);
        this.A00 = parcel.readInt();
        this.A03 = parcel.readByte() != 0;
        this.A02 = parcel.readString();
    }
}
