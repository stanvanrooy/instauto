package p000X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AOK */
public final class AOK {
    public List A00 = new ArrayList();
    public List A01 = new ArrayList();
    public List A02 = new ArrayList();
    public HashMap A03 = new HashMap();
    public boolean A04;

    public final C06270Ok A00() {
        C06270Ok A002 = C06270Ok.A00();
        String str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        A002.A09("supports_face_filters", "0");
        A002.A07("button_tap_count", 0);
        A002.A07("face_effect_off_tap_count", 0);
        if (!this.A04) {
            str = "0";
        }
        A002.A09("button_was_shown", str);
        A002.A07("num_effects_in_tray", 0);
        A002.A07("tray_dismissed_with_active_effect_count", 0);
        A002.A0A("visible_effect_id_list", this.A02);
        A002.A0A("visible_effect_fileid_list", this.A01);
        A002.A0A("selected_face_effect_session_ids", this.A00);
        C06270Ok A003 = C06270Ok.A00();
        Iterator it = this.A03.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
        A002.A03("selected_effect_usage_stats", A003);
        return A002;
    }
}
