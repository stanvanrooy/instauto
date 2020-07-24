package p000X;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.0nZ  reason: invalid class name and case insensitive filesystem */
public final class C15810nZ {
    public static C15880ng A00(Context context, C15780nW r12, AnonymousClass0MT r13, int i, AnonymousClass0C1 r15, int i2) {
        return A01(context, r12, (String) null, r13, i, Constants.ONE, new C15820na(StoredPreferences.A00, r15, true), r15, (Map) null, i2, UUID.randomUUID().toString());
    }

    public static C15880ng A01(Context context, C15780nW r14, String str, AnonymousClass0MT r16, int i, Integer num, C15830nb r19, AnonymousClass0C1 r20, Map map, int i2, String str2) {
        String str3;
        C16230oG r0;
        Location lastLocation;
        C15880ng r3 = new C15880ng(str2, num, i);
        String str4 = r3.A05;
        String str5 = r3.A06;
        Integer num2 = r3.A04;
        Map map2 = map;
        AnonymousClass0C1 r6 = r20;
        C15890nh r4 = new C15890nh(r6);
        r4.A09 = Constants.ONE;
        String str6 = "feed/timeline/";
        r4.A0C = str6;
        r4.A09("timezone_offset", Long.toString(C15960no.A00().longValue()));
        r4.A06 = new C16060ny(C16110o3.class, new AnonymousClass0IZ(r6), r19, i2);
        if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.LAUNCHER_MAIN_FEED_USE_REQUEST_CACHE, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            r4.A08 = Constants.ONE;
            if (str != null) {
                str6 = AnonymousClass000.A0E(str6, str);
            }
            r4.A0B = str6;
        }
        r4.A09(TraceFieldType.RequestID, str4);
        r4.A09("session_id", str5);
        r4.A09("reason", C16120o4.A00(num2));
        if (num2 == Constants.A0N) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        r4.A09("is_pull_to_refresh", str3);
        if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.NETWORK_STACK_CAP_API_REQUEST_2020_H1, "include_critical_api", false, (AnonymousClass04H) null)).booleanValue()) {
            r4.A03 = C15920nk.CriticalAPI;
        }
        r4.A09("bloks_versioning_id", "5da07fc1b20eb4c7d1b2e6146ee5f197072cbbd193d2d1eb3bb4e825d3c39e28");
        r4.A0A("feed_view_info", r16.A00);
        if (Boolean.FALSE.equals(Boolean.valueOf(C06100Nt.A01(context)))) {
            r4.A09("push_disabled", "true");
        }
        r4.A09("device_id", C05860Mt.A02.A04());
        boolean z = false;
        if (num2 != Constants.A12) {
            z = true;
        }
        if (z && C05770Lw.A00().A00.getBoolean("force_stories_in_feed_tray", false)) {
            r4.A09("inject_in_feed_stories_tray", "true");
        }
        C16160o8.A04(r4, str);
        String string = C16180oA.A00(r6).A00.getString("current_ad_id", (String) null);
        if (!TextUtils.isEmpty(string) && !C16180oA.A00(r6).A00.getBoolean("has_seen_current_ad", true)) {
            r4.A09("last_unseen_ad_id", string);
        }
        C17050pb.A04(context, r6, r4, r14);
        r4.A0I = true;
        if (map != null) {
            for (String str7 : map2.keySet()) {
                r4.A09(str7, (String) map2.get(str7));
            }
        }
        if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.REPLAY_SAFE, "feed_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            r4.A0H = true;
        }
        if (!(!((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.LOCATION_IN_MAIN_FEED_REQUEST, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() || (r0 = C16230oG.A00) == null || (lastLocation = r0.getLastLocation(r6)) == null)) {
            r4.A09("lat", Double.toString(lastLocation.getLatitude()));
            r4.A09("lng", Double.toString(lastLocation.getLongitude()));
        }
        r3.A00 = r4.A03();
        return r3;
    }
}
