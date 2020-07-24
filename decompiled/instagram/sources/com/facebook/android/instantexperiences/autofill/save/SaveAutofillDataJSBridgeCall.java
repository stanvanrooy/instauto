package com.facebook.android.instantexperiences.autofill.save;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass0DB;
import p000X.C229249xC;
import p000X.C25109B1d;

public class SaveAutofillDataJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(15);

    public final HashMap A04() {
        String valueOf = String.valueOf(A00("raw_autofill_data"));
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(valueOf);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj != null) {
                        arrayList.add(obj.toString());
                    }
                }
                hashMap.put(next, arrayList);
            }
            return hashMap;
        } catch (JSONException e) {
            AnonymousClass0DB.A0G("SaveAutofillDataJSBridgeCall", StringFormatUtil.formatStrLocaleSafe("Failed to getRawAutofillData."), e);
            return hashMap;
        }
    }

    public final void A02() {
        super.A02();
        if (!(A00("raw_autofill_data") instanceof String)) {
            throw new C229249xC(C25109B1d.INVALID_PARAM, String.format(Locale.US, "The raw autofill data must be a string", new Object[0]));
        }
    }

    public SaveAutofillDataJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public SaveAutofillDataJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }
}
