package com.facebook.android.instantexperiences.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import org.json.JSONObject;

public class CanMakePaymentJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(18);

    public final String A01() {
        return "canMakePayment";
    }

    public CanMakePaymentJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public CanMakePaymentJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }
}
