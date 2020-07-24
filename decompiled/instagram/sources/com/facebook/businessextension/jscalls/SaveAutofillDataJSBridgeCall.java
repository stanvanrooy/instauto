package com.facebook.businessextension.jscalls;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.ATK;
import p000X.C24099Ai4;
import p000X.C24100Ai7;

public class SaveAutofillDataJSBridgeCall extends BusinessExtensionJSBridgeCall {
    public static final C24100Ai7 CREATOR = new C24099Ai4();

    /* JADX WARNING: Illegal instructions before constructor call */
    public SaveAutofillDataJSBridgeCall(Context context, String str, Bundle bundle, String str2, JSONObject jSONObject) {
        super(context, str, bundle, "saveAutofillData", str2, r5);
        JSONObject jSONObject2 = jSONObject;
        Bundle bundle2 = new Bundle();
        bundle2.putString("callbackID", jSONObject2.getString("callbackID"));
        JSONObject jSONObject3 = jSONObject2.getJSONObject("raw_autofill_data");
        ImmutableMap immutableMap = null;
        if (jSONObject3 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    JSONArray jSONArray = jSONObject3.getJSONArray(next);
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    while (i < jSONArray.length()) {
                        Object obj = jSONArray.get(i);
                        if (obj instanceof String) {
                            arrayList.add((String) obj);
                            i++;
                        } else {
                            throw new JSONException("Value was not a String, was " + obj.getClass());
                        }
                    }
                    hashMap.put(next, arrayList);
                } catch (JSONException e) {
                    ATK.A02("SaveAutofillDataJSBridgeCall", e, "Failed to parse raw autofill data", e);
                }
            }
            immutableMap = ImmutableMap.A01(hashMap);
        }
        bundle2.putParcelable("saveAutofillDataData", new SaveAutofillDataJSBridgeCallData(immutableMap));
    }

    public SaveAutofillDataJSBridgeCall(Parcel parcel) {
        super(parcel);
    }
}
