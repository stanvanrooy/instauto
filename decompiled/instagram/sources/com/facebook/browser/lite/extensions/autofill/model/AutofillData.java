package com.facebook.browser.lite.extensions.autofill.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass08A;

public class AutofillData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass08A();
    public final Map A00;

    public final int describeContents() {
        return 0;
    }

    private void A00() {
        Iterator it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() == null) {
                it.remove();
            } else {
                entry.setValue(((String) entry.getValue()).trim());
            }
        }
        String str = (String) this.A00.get("given-name");
        String str2 = (String) this.A00.get("family-name");
        if (str == null && str2 == null) {
            String str3 = (String) this.A00.get("name");
            if (str3 != null) {
                int lastIndexOf = str3.lastIndexOf(32);
                if (lastIndexOf > 0) {
                    this.A00.put("given-name", str3.substring(0, lastIndexOf));
                    this.A00.put("family-name", str3.substring(lastIndexOf + 1));
                    return;
                }
                this.A00.put("given-name", str3);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.A00.containsKey("given-name")) {
            arrayList.add(this.A00.get("given-name"));
        }
        if (this.A00.containsKey("family-name")) {
            arrayList.add(this.A00.get("family-name"));
        }
        this.A00.put("name", TextUtils.join(" ", arrayList));
    }

    public final Map A01() {
        return Collections.unmodifiableMap(this.A00);
    }

    public final JSONObject A02() {
        JSONObject jSONObject = new JSONObject();
        Map A01 = A01();
        for (String str : A01.keySet()) {
            try {
                jSONObject.put(str, A01.get(str));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }

    public AutofillData(Parcel parcel) {
        this.A00 = parcel.readHashMap(String.class.getClassLoader());
        A00();
    }

    public AutofillData(Map map) {
        this.A00 = new HashMap(map);
        A00();
    }

    public AutofillData(JSONObject jSONObject) {
        this.A00 = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.A00.put(next, jSONObject.optString(next));
        }
        A00();
    }
}
