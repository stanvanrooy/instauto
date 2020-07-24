package p000X;

import android.text.TextUtils;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1kV  reason: invalid class name and case insensitive filesystem */
public final class C37961kV {
    public final C15890nh A00(AnonymousClass0C1 r9, int i, Map map, C61482ls r12, Integer num) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            QuickPromotionSurface quickPromotionSurface = (QuickPromotionSurface) entry.getKey();
            JSONArray jSONArray = new JSONArray();
            for (Trigger trigger : (Set) entry.getValue()) {
                jSONArray.put(trigger.A00);
            }
            try {
                jSONObject.put(String.valueOf(quickPromotionSurface.A00), jSONArray);
            } catch (JSONException e) {
                AnonymousClass0DB.A0P("QuickPromotionApi", e, "Failed to create %s parameters", "surfaces_to_triggers");
            }
        }
        String jSONObject2 = jSONObject.toString();
        C15890nh r3 = new C15890nh(r9);
        r3.A09 = Constants.ONE;
        r3.A0C = "qp/batch_fetch/";
        Set<QuickPromotionSurface> keySet = map.keySet();
        JSONObject jSONObject3 = new JSONObject();
        try {
            for (QuickPromotionSurface quickPromotionSurface2 : keySet) {
                jSONObject3.put(Integer.toString(quickPromotionSurface2.A00), quickPromotionSurface2.A01);
            }
        } catch (JSONException e2) {
            AnonymousClass0DB.A0G("QuickPromotionApi", "Failed to create surfaces_to_queries parameters", e2);
        }
        r3.A09("surfaces_to_queries", jSONObject3.toString());
        r3.A09("vc_policy", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        r3.A09("version", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        r3.A09("surfaces_to_triggers", jSONObject2);
        r3.A09("scale", Integer.toString(i));
        if (r12 == null || r12.A00.isEmpty()) {
            Integer num2 = Constants.A0N;
            if (num == num2) {
                r3.A0B = AnonymousClass000.A0E("qp/batch_fetch/", jSONObject2);
                r3.A08 = num2;
                r3.A00 = C37951kU.A02;
            } else if (num != Constants.ZERO) {
                r3.A0B = AnonymousClass000.A0E("qp/batch_fetch/", jSONObject2);
                r3.A08 = num;
            }
        } else {
            r3.A09("trigger_context", new JSONObject(r12.A00).toString());
        }
        String string = C05770Lw.A00().A00.getString("qp_override_ip", (String) null);
        if (!TextUtils.isEmpty(string)) {
            r3.A09("qp_override_ip", string);
        }
        return r3;
    }
}
