package com.facebook.android.instantexperiences.autofill.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p000X.B0Z;

public class EmailAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A00 = new B0Z();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(12);

    public EmailAutofillData(Parcel parcel) {
        super(parcel);
    }

    public EmailAutofillData(String str, String str2) {
        this.A00.put(str, str2);
    }

    public EmailAutofillData(Map map) {
        super(map);
    }

    public EmailAutofillData(JSONObject jSONObject) {
        super(jSONObject);
    }
}
