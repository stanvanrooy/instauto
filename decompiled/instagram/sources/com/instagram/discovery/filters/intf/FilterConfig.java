package com.instagram.discovery.filters.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.discovery.refinement.model.Refinement;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p000X.AnonymousClass17M;

public class FilterConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(323);
    public final Map A00;
    public final Map A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterConfig)) {
            return false;
        }
        FilterConfig filterConfig = (FilterConfig) obj;
        return AnonymousClass17M.A00(this.A00, filterConfig.A00) && AnonymousClass17M.A00(this.A01, filterConfig.A01);
    }

    public final HashMap A00() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.A00);
        for (Map.Entry entry : this.A01.entrySet()) {
            hashMap.put(entry.getKey(), ((Boolean) entry.getValue()).toString());
        }
        return hashMap;
    }

    public final void A01(Refinement refinement) {
        if (refinement != null) {
            Map map = this.A00;
            HashMap hashMap = new HashMap();
            String str = refinement.A00.A03;
            if (str != null) {
                hashMap.put("category_id", str);
            }
            String str2 = refinement.A00.A02;
            String str3 = str2;
            if (str2 != null) {
                hashMap.put("category", str3);
            }
            map.putAll(hashMap);
            Map map2 = this.A01;
            HashMap hashMap2 = new HashMap();
            if (refinement.A00.A04) {
                hashMap2.put("on_sale", true);
            }
            map2.putAll(hashMap2);
        }
    }

    public final void A02(JSONObject jSONObject, String str) {
        Map map;
        if (this.A00.containsKey(str)) {
            map = this.A00;
        } else if (this.A01.containsKey(str)) {
            map = this.A01;
        } else {
            jSONObject.put(str, JSONObject.NULL);
            return;
        }
        jSONObject.put(str, map.get(str));
    }

    public final int hashCode() {
        int hashCode;
        Map map = this.A00;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = hashCode * 31;
        Map map2 = this.A01;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return i2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
        parcel.writeMap(this.A01);
    }

    public FilterConfig(Parcel parcel) {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        this.A01 = new HashMap();
        Class<Map> cls = Map.class;
        parcel.readMap(hashMap, cls.getClassLoader());
        parcel.readMap(this.A01, cls.getClassLoader());
    }

    public FilterConfig(HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = new HashMap();
        this.A00 = hashMap3;
        this.A01 = new HashMap();
        hashMap3.putAll(hashMap);
        this.A01.putAll(hashMap2);
    }

    public FilterConfig(Map map) {
        Map map2;
        Object key;
        boolean z;
        this.A00 = new HashMap();
        this.A01 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if ("true".equalsIgnoreCase((String) entry.getValue())) {
                map2 = this.A01;
                key = entry.getKey();
                z = true;
            } else if ("false".equalsIgnoreCase((String) entry.getValue())) {
                map2 = this.A01;
                key = entry.getKey();
                z = false;
            } else {
                this.A00.put(entry.getKey(), entry.getValue());
            }
            map2.put(key, Boolean.valueOf(z));
        }
    }
}
