package com.facebook.android.instantexperiences.payment.chargerequest;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import org.json.JSONObject;

public class PaymentsChargeRequestUnknownCall extends PaymentsChargeRequestCall {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(26);

    public PaymentsChargeRequestUnknownCall(Parcel parcel) {
        super(parcel);
    }

    public PaymentsChargeRequestUnknownCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
        this.A00 = "unknown";
    }
}
