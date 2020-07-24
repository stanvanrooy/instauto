package com.facebook.common.payments.paymentmethods.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.HashMap;
import java.util.Map;
import p000X.C228399tA;

public class AdditionalFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(52);
    public final Map A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }

    public AdditionalFields(C228399tA r2) {
        this.A00 = r2.A00;
    }

    public AdditionalFields(Parcel parcel) {
        HashMap hashMap = new HashMap();
        parcel.readMap(hashMap, Map.class.getClassLoader());
        this.A00 = hashMap;
    }
}
