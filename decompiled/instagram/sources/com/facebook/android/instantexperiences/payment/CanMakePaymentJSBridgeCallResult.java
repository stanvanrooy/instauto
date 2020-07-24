package com.facebook.android.instantexperiences.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass0DB;

public final class CanMakePaymentJSBridgeCallResult extends InstantExperiencesCallResult {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(19);

    public CanMakePaymentJSBridgeCallResult(Parcel parcel) {
        super(parcel);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public CanMakePaymentJSBridgeCallResult(boolean z) {
        super(Arrays.asList(new String[]{r3.toString()}));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("canMakePayment", z);
        } catch (JSONException e) {
            AnonymousClass0DB.A0M("CanMakePaymentJSBridgeCallResult", e, "Exception serializing return params!");
        }
    }
}
