package p000X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Lk  reason: invalid class name and case insensitive filesystem */
public final class C05650Lk implements C17690qe {
    public final AnonymousClass13O A00;
    public final AnonymousClass0C1 A01;

    public final String ALm() {
        return ".json";
    }

    public final String AIl(Context context) {
        List list;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList<AnonymousClass41L> arrayList2 = new ArrayList<>();
            AnonymousClass0LQ r1 = AnonymousClass0LQ.A01;
            if (r1 != null) {
                AnonymousClass13O r4 = this.A00;
                switch (r4.ordinal()) {
                    case 0:
                        arrayList2.addAll(r1.A06().A01());
                        list = r1.A07(this.A01).A01();
                        break;
                    case 1:
                        arrayList2.addAll(r1.A06().A02.A01());
                        list = r1.A07(this.A01).A02.A01();
                        break;
                    default:
                        AnonymousClass0QD.A01("ConfigurationsValueLogger", "Attempted to get debug logs for unsupported type: " + r4);
                        break;
                }
                arrayList2.addAll(list);
            }
            for (AnonymousClass41L r42 : arrayList2) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("1. Name", r42.A00());
                jSONObject.put("2. Parameter", r42.A01());
                jSONObject.put("3. Value", r42.A02());
                jSONObject.put("4. Overridden", r42.A03());
                arrayList.add(jSONObject);
            }
            Collections.sort(arrayList, new C05670Lm(this));
            return arrayList.toString();
        } catch (JSONException e) {
            AnonymousClass0DB.A0G("ConfigurationsValueLogger", "Unable to create log", e);
            return "";
        }
    }

    public final String ALl() {
        AnonymousClass13O r2 = this.A00;
        switch (r2.ordinal()) {
            case 0:
                return "quick_experiments_list";
            case 1:
                return "launchers_list";
            default:
                AnonymousClass0QD.A01("ConfigurationsValueLogger", "Attempted to get debug logs for unsupported type: " + r2);
                return "unsupported_type";
        }
    }

    public C05650Lk(AnonymousClass0C1 r1, AnonymousClass13O r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
