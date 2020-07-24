package com.facebook.android.instantexperiences.payment.chargerequest;

import android.os.Parcel;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import java.util.Locale;
import org.json.JSONObject;
import p000X.AnonymousClass1BX;
import p000X.C229249xC;
import p000X.C25109B1d;

public abstract class PaymentsChargeRequestCall extends InstantExperiencesJSBridgeCall {
    public String A00;

    public final void A02() {
        super.A02();
        if (AnonymousClass1BX.A00(String.valueOf(A00("paymentId")))) {
            throw new C229249xC(C25109B1d.INVALID_PARAM, "Payment ID can not be null or empty");
        } else if (this.A01.AG1() == null) {
            throw new C229249xC(C25109B1d.MISSING_APP_ID, String.format(Locale.US, "An App ID must be set to use this call", new Object[0]));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }

    public PaymentsChargeRequestCall(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public PaymentsChargeRequestCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }
}
