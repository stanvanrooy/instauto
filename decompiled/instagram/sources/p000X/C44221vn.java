package p000X;

import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.1vn  reason: invalid class name and case insensitive filesystem */
public final class C44221vn {
    public static void A00(C06590Pq r3, String str, C17920r1 r5) {
        C15890nh r2 = new C15890nh(r3);
        r2.A09 = Constants.ONE;
        r2.A0C = "launcher/sync/";
        r2.A09("id", str);
        r2.A06(C44231vo.class, false);
        r2.A09("server_config_retrieval", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        r2.A0G = true;
        C17850qu A03 = r2.A03();
        A03.A00 = r5;
        C12810hQ.A03(A03, 237, 3, true, true);
    }
}
