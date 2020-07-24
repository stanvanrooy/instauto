package com.facebook.android.instantexperiences.payment;

import android.os.Parcel;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import java.util.Locale;
import org.json.JSONObject;
import p000X.C229249xC;
import p000X.C25109B1d;

public abstract class PaymentsJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public void A02() {
        super.A02();
        if (this.A01.AG1() == null) {
            throw new C229249xC(C25109B1d.MISSING_APP_ID, String.format(Locale.US, "An App ID must be set to use this call", new Object[0]));
        }
    }

    public PaymentsJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public PaymentsJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }
}
