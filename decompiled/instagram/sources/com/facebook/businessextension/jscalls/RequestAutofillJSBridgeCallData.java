package com.facebook.businessextension.jscalls;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RequestAutofillJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(34);
    public final String A00;
    public final LinkedHashSet A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeStringList(new ArrayList(this.A01));
    }

    public RequestAutofillJSBridgeCallData(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = new LinkedHashSet(parcel.createStringArrayList());
    }

    public RequestAutofillJSBridgeCallData(String str, LinkedHashSet linkedHashSet) {
        this.A00 = str;
        this.A01 = linkedHashSet;
    }
}
