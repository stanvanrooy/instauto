package com.facebook.android.instantexperiences.autofill.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.B0X;

public class TelephoneAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A01 = new B0X();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(14);
    public final String A00;

    public final JSONObject A05() {
        JSONObject A05 = super.A05();
        A05.put("display_number", this.A00);
        return A05;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }

    public TelephoneAutofillData(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public TelephoneAutofillData(Map map, String str) {
        this.A00 = map;
        this.A00 = str;
    }

    public TelephoneAutofillData(JSONObject jSONObject) {
        super(jSONObject);
        String str;
        if (jSONObject != null) {
            try {
                str = jSONObject.getString("display_number");
            } catch (JSONException unused) {
                str = (String) this.A00.get("tel");
            }
        } else {
            str = null;
        }
        this.A00 = str;
    }
}
