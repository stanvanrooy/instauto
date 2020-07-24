package com.facebook.android.instantexperiences.jscall;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass1BX;
import p000X.C25109B1d;

public abstract class InstantExperiencesCallResult implements Parcelable {
    public String A00;
    public String A01;
    public final C25109B1d A02;
    public final List A03;

    public int describeContents() {
        if ((this instanceof PaymentsCheckoutJSBridgeCallResult) || (this instanceof CanShowPaymentModuleJSBridgeCallResult) || (this instanceof CanMakePaymentJSBridgeCallResult) || (this instanceof InstantExperienceGenericErrorResult)) {
            return 0;
        }
        boolean z = this instanceof RequestAutofillJSBridgeCallResult;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList;
        List list = this.A03;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list);
        }
        parcel.writeSerializable(arrayList);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeSerializable(this.A02);
    }

    public InstantExperiencesCallResult(C25109B1d b1d, String str) {
        this.A03 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", Integer.toString(b1d.A00));
            if (!AnonymousClass1BX.A00(str)) {
                jSONObject.put("errorMessage", str);
            }
        } catch (JSONException e) {
            AnonymousClass0DB.A05(InstantExperiencesCallResult.class, "Failed to create error", e);
        }
        this.A03.add(jSONObject.toString());
        this.A02 = b1d;
    }

    public InstantExperiencesCallResult(Parcel parcel) {
        this.A03 = (ArrayList) parcel.readSerializable();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = (C25109B1d) parcel.readSerializable();
    }

    public InstantExperiencesCallResult(List list) {
        this.A03 = list;
        this.A02 = null;
    }
}
