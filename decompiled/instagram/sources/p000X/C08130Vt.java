package p000X;

import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Vt  reason: invalid class name and case insensitive filesystem */
public final class C08130Vt {
    public List A00;
    public final int A01 = 10;
    public final C10980eE A02;
    public final String A03;
    public final TreeSet A04;

    public final synchronized C08140Vu A00(C08140Vu r4) {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            C08140Vu r1 = (C08140Vu) it.next();
            if (r1.equals(r4)) {
                return r1;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        if (r3.A00().isEmpty() != false) goto L_0x00ab;
     */
    public final synchronized TreeSet A01() {
        C10980eE r0;
        C08140Vu r3;
        boolean z;
        if (this.A04.isEmpty() && (r0 = this.A02) != null) {
            if (r0.A00.contains(this.A03)) {
                C10980eE r02 = this.A02;
                try {
                    JSONArray optJSONArray = new JSONObject(r02.A00.getString(this.A03, "")).optJSONArray("address_entries");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            String string = optJSONArray.getString(i);
                            if (TextUtils.isEmpty(string)) {
                                r3 = null;
                            } else {
                                JSONObject jSONObject = new JSONObject(string);
                                r3 = new C08140Vu("", (List) null, 0, 0);
                                r3.A02 = jSONObject.optString(TraceFieldType.HostName);
                                r3.A01 = jSONObject.optInt("priority");
                                r3.A00 = jSONObject.optInt("fail_count");
                                JSONArray optJSONArray2 = jSONObject.optJSONArray("address_list_data");
                                if (optJSONArray2 != null) {
                                    ArrayList arrayList = new ArrayList(optJSONArray2.length());
                                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                        if (!optJSONArray2.isNull(i2)) {
                                            arrayList.add(optJSONArray2.getString(i2));
                                        }
                                    }
                                    r3.A04 = arrayList;
                                }
                            }
                            List list = r3.A04;
                            if (list != null && !list.isEmpty()) {
                                z = true;
                            }
                            z = false;
                            if (z) {
                                A03(r3);
                            }
                        }
                    }
                } catch (JSONException e) {
                    AnonymousClass0DB.A0M("AddressEntries", e, "Cannot create JSONObject from rawJson");
                }
            }
        }
        return this.A04;
    }

    public final synchronized void A02() {
        synchronized (this) {
            this.A00.clear();
            Iterator it = A01().iterator();
            while (it.hasNext()) {
                this.A00.add((C08140Vu) it.next());
            }
        }
        C10980eE r0 = this.A02;
        if (r0 != null) {
            try {
                C11000eG A002 = r0.A00();
                String str = this.A03;
                JSONObject jSONObject = new JSONObject();
                if (this.A00 != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (C08140Vu r8 : this.A00) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt(TraceFieldType.HostName, r8.A02);
                        jSONObject2.put("priority", r8.A01);
                        jSONObject2.put("fail_count", r8.A00);
                        if (r8.A04 != null) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (String put : r8.A04) {
                                jSONArray2.put(put);
                            }
                            jSONObject2.put("address_list_data", jSONArray2);
                        }
                        jSONArray.put(jSONObject2.toString());
                    }
                    jSONObject.put("address_entries", jSONArray);
                }
                A002.A00.putString(str, jSONObject.toString());
                A002.A00.apply();
            } catch (JSONException e) {
                AnonymousClass0DB.A0M("AddressEntries", e, "Failed to save addressEntries");
            }
        }
        return;
    }

    public final synchronized void A03(C08140Vu r3) {
        if (this.A04.size() >= this.A01) {
            this.A04.pollLast();
        }
        this.A04.add(r3);
    }

    public final synchronized void A04(C08140Vu r2, C08140Vu r3) {
        this.A04.remove(r2);
        A03(r3);
    }

    public C08130Vt(C10980eE r3) {
        this.A02 = r3;
        this.A03 = "/settings_mqtt_address";
        this.A04 = new TreeSet(new C08120Vs(this));
        this.A00 = new ArrayList();
    }
}
