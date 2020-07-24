package com.facebook.android.instantexperiences.jscall;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass1BX;
import p000X.C229249xC;
import p000X.C25109B1d;

public abstract class InstantExperiencesJSBridgeCall implements Parcelable {
    public InstantExperiencesCallResult A00;
    public final InstantExperiencesParameters A01;
    public final String A02;
    public final Bundle A03;
    public final String A04;
    public final String A05;

    public String A01() {
        return !(this instanceof PaymentsChargeRequestCall) ? !(this instanceof PaymentsCheckoutJSBridgeCall) ? !(this instanceof SaveAutofillDataJSBridgeCall) ? "requestAutoFill" : "saveAutofillData" : "paymentsCheckout" : "paymentsChargeRequst";
    }

    public final int describeContents() {
        return 0;
    }

    public final Object A00(String str) {
        if (!this.A03.containsKey(str)) {
            return null;
        }
        return this.A03.get(str);
    }

    public void A02() {
        Uri parse;
        String str = this.A02;
        if ((!this.A01.AFo().booleanValue()) && (AnonymousClass1BX.A00(str) || (parse = Uri.parse(str)) == null || parse.getHost() == null || parse.getScheme() == null || !parse.getScheme().equalsIgnoreCase("https") || (parse.getPort() != 443 && parse.getPort() != -1))) {
            throw new C229249xC(C25109B1d.URL_NOT_ALLOWED, (String) null);
        } else if (!this.A01.AiI(str)) {
            throw new C229249xC(C25109B1d.URL_NOT_ALLOWED, "This url cannot make this call");
        }
    }

    public final void A03(InstantExperiencesCallResult instantExperiencesCallResult) {
        this.A00 = instantExperiencesCallResult;
        instantExperiencesCallResult.A00 = this.A04;
        instantExperiencesCallResult.A01 = this.A05;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeBundle(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public InstantExperiencesJSBridgeCall(Parcel parcel) {
        this.A01 = (InstantExperiencesParameters) parcel.readParcelable(InstantExperiencesParameters.class.getClassLoader());
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readBundle();
        this.A00 = (InstantExperiencesCallResult) parcel.readParcelable(InstantExperiencesCallResult.class.getClassLoader());
    }

    public InstantExperiencesJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        this.A05 = str;
        this.A01 = instantExperiencesParameters;
        this.A02 = str2;
        this.A04 = jSONObject.getString("callbackID");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj != null) {
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                        bundle.putString(next, obj.toString());
                    } else if (obj == JSONObject.NULL) {
                        bundle.putString(next, (String) null);
                    }
                }
            } catch (JSONException e) {
                AnonymousClass0DB.A0G("InstantExperiencesJSBridgeCall", StringFormatUtil.formatStrLocaleSafe("JSONObject.keys() provided a problematic key : %s", (Object) next), e);
            }
        }
        this.A03 = bundle;
    }
}
