package com.facebook.businessextension.jscalls;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.common.collect.ImmutableMap;

public class SaveAutofillDataJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(35);
    public final ImmutableMap A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }

    public SaveAutofillDataJSBridgeCallData(Parcel parcel) {
        this.A00 = ImmutableMap.A01(parcel.readHashMap(SaveAutofillDataJSBridgeCallData.class.getClassLoader()));
    }

    public SaveAutofillDataJSBridgeCallData(ImmutableMap immutableMap) {
        this.A00 = immutableMap;
    }
}
