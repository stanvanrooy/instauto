package com.facebook.businessextension.jscalls;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.ATK;
import p000X.C24095Ahz;
import p000X.C24100Ai7;

public class RequestAutofillJSBridgeCall extends BusinessExtensionJSBridgeCall {
    public static final C24100Ai7 CREATOR = new C24095Ahz();

    public static Bundle A00(JSONObject jSONObject) {
        String str;
        LinkedHashSet linkedHashSet;
        Bundle bundle = new Bundle();
        bundle.putString("callbackID", jSONObject.getString("callbackID"));
        try {
            str = jSONObject.getString("selectedAutoCompleteTag");
        } catch (JSONException e) {
            ATK.A02("RequestAutofillJSBridgeCall", e, "Failed to get autofill tag", e);
            str = null;
        }
        try {
            JSONArray jSONArray = new JSONArray(jSONObject.getString("autofillFields"));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            Collections.sort(arrayList);
            linkedHashSet = new LinkedHashSet(arrayList);
        } catch (JSONException e2) {
            ATK.A02("RequestAutofillJSBridgeCall", e2, "Failed to parseRequestedFields", e2);
            linkedHashSet = null;
        }
        bundle.putParcelable("requestAutofillData", new RequestAutofillJSBridgeCallData(str, linkedHashSet));
        return bundle;
    }

    public final String A03() {
        Object obj;
        if (!this.A02.containsKey("requestAutofillData")) {
            obj = null;
        } else {
            obj = this.A02.get("requestAutofillData");
        }
        RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData = (RequestAutofillJSBridgeCallData) obj;
        if (requestAutofillJSBridgeCallData == null) {
            return null;
        }
        return requestAutofillJSBridgeCallData.A00;
    }

    public final LinkedHashSet A04() {
        Object obj;
        if (!this.A02.containsKey("requestAutofillData")) {
            obj = null;
        } else {
            obj = this.A02.get("requestAutofillData");
        }
        RequestAutofillJSBridgeCallData requestAutofillJSBridgeCallData = (RequestAutofillJSBridgeCallData) obj;
        if (requestAutofillJSBridgeCallData == null) {
            return null;
        }
        return requestAutofillJSBridgeCallData.A01;
    }

    public RequestAutofillJSBridgeCall(Context context, String str, Bundle bundle, String str2, Bundle bundle2) {
        super(context, str, bundle, "requestAutoFill", str2, bundle2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public RequestAutofillJSBridgeCall(Context context, String str, Bundle bundle, String str2, JSONObject jSONObject) {
        super(r1, str, r3, "requestAutoFill", str2, A00(jSONObject));
        Context context2 = context;
        Bundle bundle2 = bundle;
    }

    public RequestAutofillJSBridgeCall(Parcel parcel) {
        super(parcel);
    }
}
