package com.facebook.android.instantexperiences.autofill;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass1BX;
import p000X.C229249xC;
import p000X.C25109B1d;

public class RequestAutofillJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(9);
    public volatile LinkedHashSet A00 = null;

    public final Set A04() {
        if (this.A00 == null) {
            String str = (String) A00("autofillFields");
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            } catch (JSONException e) {
                AnonymousClass0DB.A0G("RequestAutofillJSBridgeCall", StringFormatUtil.formatStrLocaleSafe("Failed to getRequestedFields."), e);
            }
            Collections.sort(arrayList);
            this.A00 = new LinkedHashSet(arrayList);
        }
        return this.A00;
    }

    public final void A02() {
        super.A02();
        if (AnonymousClass1BX.A00(String.valueOf(A00("selectedAutoCompleteTag")))) {
            throw new C229249xC(C25109B1d.INVALID_PARAM, "Selected auto fill tag cannot be empty or null");
        } else if (AnonymousClass1BX.A00(String.valueOf(A00("autofillFields")))) {
            throw new C229249xC(C25109B1d.INVALID_PARAM, "Autofill fields cannot be empty or null");
        } else if (!this.A01.ALc().AeJ()) {
            throw new C229249xC(C25109B1d.FEATURE_UNAVAILABLE, "This feature is not available at this time");
        }
    }

    public RequestAutofillJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public RequestAutofillJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }
}
