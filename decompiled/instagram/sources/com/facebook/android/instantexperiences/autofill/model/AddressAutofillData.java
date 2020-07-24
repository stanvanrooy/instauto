package com.facebook.android.instantexperiences.autofill.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p000X.B0Q;

public class AddressAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A00 = new B0Q();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(11);

    public static boolean A00(StringBuilder sb, String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (sb.length() != 0) {
            sb.append(" ");
        }
        sb.append(str);
        return true;
    }

    public AddressAutofillData(Parcel parcel) {
        super(parcel);
    }

    public AddressAutofillData(Map map) {
        super(map);
    }

    public AddressAutofillData(JSONObject jSONObject) {
        super(jSONObject);
    }
}
