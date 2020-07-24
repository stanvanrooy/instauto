package com.facebook.android.instantexperiences.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import org.json.JSONObject;
import p000X.AnonymousClass1BX;
import p000X.C229249xC;
import p000X.C25109B1d;

public final class PaymentsCheckoutJSBridgeCall extends PaymentsJSBridgeCall {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(22);

    public final void A02() {
        super.A02();
        if (AnonymousClass1BX.A00(String.valueOf(A00("configuration")))) {
            throw new C229249xC(C25109B1d.INVALID_PARAM, "Checkout configuration object can not be null or empty");
        }
    }

    public PaymentsCheckoutJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public PaymentsCheckoutJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }
}
