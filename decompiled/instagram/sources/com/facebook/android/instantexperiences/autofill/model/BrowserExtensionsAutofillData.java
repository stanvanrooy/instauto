package com.facebook.android.instantexperiences.autofill.model;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p000X.AnonymousClass000;
import p000X.AnonymousClass1BX;

public abstract class BrowserExtensionsAutofillData implements FbAutofillData {
    public Map A00;

    public BrowserExtensionsAutofillData A01(Set set) {
        if (!(this instanceof TelephoneAutofillData)) {
            return !(this instanceof NameAutofillData) ? !(this instanceof EmailAutofillData) ? new AddressAutofillData(((AddressAutofillData) this).A04(set)) : new EmailAutofillData(((EmailAutofillData) this).A04(set)) : new NameAutofillData(((NameAutofillData) this).A04(set));
        }
        TelephoneAutofillData telephoneAutofillData = (TelephoneAutofillData) this;
        return new TelephoneAutofillData(telephoneAutofillData.A04(set), telephoneAutofillData.A00);
    }

    public String A02() {
        return !(this instanceof TelephoneAutofillData) ? !(this instanceof NameAutofillData) ? !(this instanceof EmailAutofillData) ? "address-autofill-data" : "email-autofill-data" : "name-autofill-data" : "telephone-autofill-data";
    }

    public String A03() {
        Object obj;
        if (this instanceof TelephoneAutofillData) {
            return ((TelephoneAutofillData) this).A00;
        }
        if (this instanceof NameAutofillData) {
            NameAutofillData nameAutofillData = (NameAutofillData) this;
            if (!AnonymousClass1BX.A00((String) nameAutofillData.A00.get("name"))) {
                obj = nameAutofillData.A00.get("name");
            } else {
                String str = (String) nameAutofillData.A00.get("given-name");
                if (str == null) {
                    str = "";
                }
                String str2 = (String) nameAutofillData.A00.get("family-name");
                if (str2 == null) {
                    str2 = "";
                }
                return AnonymousClass000.A0J(str, " ", str2).trim();
            }
        } else if (!(this instanceof EmailAutofillData)) {
            AddressAutofillData addressAutofillData = (AddressAutofillData) this;
            StringBuilder sb = new StringBuilder();
            if (!AddressAutofillData.A00(sb, (String) addressAutofillData.A00.get("street-address"))) {
                AddressAutofillData.A00(sb, (String) addressAutofillData.A00.get("address-line1"));
                AddressAutofillData.A00(sb, (String) addressAutofillData.A00.get("address-line2"));
                AddressAutofillData.A00(sb, (String) addressAutofillData.A00.get("address-line3"));
            }
            AddressAutofillData.A00(sb, (String) addressAutofillData.A00.get("address-level4"));
            AddressAutofillData.A00(sb, (String) addressAutofillData.A00.get("address-level3"));
            AddressAutofillData.A00(sb, (String) addressAutofillData.A00.get("address-level2"));
            AddressAutofillData.A00(sb, (String) addressAutofillData.A00.get("address-level1"));
            AddressAutofillData.A00(sb, (String) addressAutofillData.A00.get("postal-code"));
            if (!AddressAutofillData.A00(sb, (String) addressAutofillData.A00.get("country"))) {
                AddressAutofillData.A00(sb, (String) addressAutofillData.A00.get("country-name"));
            }
            return sb.toString();
        } else {
            Map map = ((EmailAutofillData) this).A00;
            obj = map.get((String) map.keySet().iterator().next());
        }
        return (String) obj;
    }

    public Map AGO() {
        if (this instanceof TelephoneAutofillData) {
            return new HashMap(((TelephoneAutofillData) this).A00);
        }
        if (!(this instanceof NameAutofillData)) {
            return !(this instanceof EmailAutofillData) ? new HashMap(((AddressAutofillData) this).A00) : new HashMap(((EmailAutofillData) this).A00);
        }
        HashMap hashMap = new HashMap(((NameAutofillData) this).A00);
        for (String str : new LinkedList(hashMap.keySet())) {
            String str2 = (String) hashMap.get(str);
            if (str2 == null || str2.isEmpty()) {
                hashMap.remove(str);
            }
        }
        return hashMap;
    }

    public final boolean Ahw(FbAutofillData fbAutofillData) {
        if (fbAutofillData != null && getClass().equals(fbAutofillData.getClass())) {
            BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) fbAutofillData;
            if (this.A00.size() <= browserExtensionsAutofillData.A00.size()) {
                for (Map.Entry entry : this.A00.entrySet()) {
                    String str = (String) entry.getValue();
                    String str2 = (String) browserExtensionsAutofillData.A00.get((String) entry.getKey());
                    if ((str == null || str2 != null) && (str == null || str2 == null || str.equals(str2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) obj;
            if (this.A00.size() == browserExtensionsAutofillData.A00.size()) {
                Iterator it = this.A00.entrySet().iterator();
                while (true) {
                    boolean z = true;
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getValue();
                        String str2 = (String) browserExtensionsAutofillData.A00.get((String) entry.getKey());
                        boolean z2 = false;
                        if (str != null) {
                            z2 = true;
                        }
                        if (str2 == null) {
                            z = false;
                        }
                        if ((z ^ z2) || (str != null && str2 != null && !str.equals(str2))) {
                            break;
                        }
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final Map A04(Set set) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.A00.entrySet()) {
            String str = (String) entry.getKey();
            if (set.contains(str)) {
                hashMap.put(str, entry.getValue());
            }
        }
        return hashMap;
    }

    public JSONObject A05() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : AGO().entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("autocomplete_data", jSONObject);
        return jSONObject2;
    }

    public /* bridge */ /* synthetic */ FbAutofillData A8r(Set set) {
        if (this instanceof TelephoneAutofillData) {
            TelephoneAutofillData telephoneAutofillData = (TelephoneAutofillData) this;
            return new TelephoneAutofillData(telephoneAutofillData.A04(set), telephoneAutofillData.A00);
        } else if (this instanceof NameAutofillData) {
            return new NameAutofillData(((NameAutofillData) this).A04(set));
        } else {
            if (this instanceof EmailAutofillData) {
                return new EmailAutofillData(((EmailAutofillData) this).A04(set));
            }
            if (!(this instanceof AddressAutofillData)) {
                return A01(set);
            }
            return new AddressAutofillData(((AddressAutofillData) this).A04(set));
        }
    }

    public final boolean A9c() {
        for (Map.Entry value : this.A00.entrySet()) {
            String str = (String) value.getValue();
            if (str != null && !str.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }

    public BrowserExtensionsAutofillData() {
        this.A00 = new HashMap();
    }

    public BrowserExtensionsAutofillData(Parcel parcel) {
        this.A00 = parcel.readHashMap(String.class.getClassLoader());
    }

    public BrowserExtensionsAutofillData(Map map) {
        this.A00 = map;
    }

    public BrowserExtensionsAutofillData(JSONObject jSONObject) {
        this();
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("autocomplete_data")) != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.A00.put(next, optJSONObject.optString(next));
            }
        }
    }
}
