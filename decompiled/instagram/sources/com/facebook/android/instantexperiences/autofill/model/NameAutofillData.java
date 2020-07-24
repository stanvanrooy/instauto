package com.facebook.android.instantexperiences.autofill.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p000X.C25087Azl;

public class NameAutofillData extends BrowserExtensionsAutofillData {
    public static final Set A00 = new C25087Azl();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(13);

    public NameAutofillData(Parcel parcel) {
        super(parcel);
    }

    public NameAutofillData(Map map) {
        super(map);
    }

    public NameAutofillData(JSONObject jSONObject) {
        super(jSONObject);
    }
}
