package p000X;

import android.content.Context;
import android.util.LruCache;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Lo  reason: invalid class name and case insensitive filesystem */
public final class C05690Lo extends GraphQLSubscriptionHandler {
    public AnonymousClass0L4 A00;
    public AnonymousClass0C1 A01;
    public int A02;
    public Context A03;
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Map A05 = Collections.synchronizedMap(new HashMap());

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        if (!RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) || !GraphQLSubscriptionID.CLIENT_CONFIG_UPDATE_QUERY_ID.equals(str2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r7.A04.isEmpty() == false) goto L_0x004f;
     */
    public final void onRealtimeEventPayload(String str, String str2, String str3) {
        String str4;
        boolean z;
        AnonymousClass0LQ r3 = AnonymousClass0LQ.A01;
        if (r3 != null) {
            try {
                C13080hr A0A = C12890hY.A00.A0A(str3);
                A0A.A0p();
                AnonymousClass0L2 r0 = C05540Ky.parseFromJson(A0A).A00;
                String str5 = r0.A02;
                String str6 = r0.A01;
                String str7 = r0.A00;
                if (str5 != null && str6 != null && str7 != null) {
                    LruCache lruCache = this.A00.A00;
                    if (lruCache == null) {
                        AnonymousClass0QD.A01("ClientConfigRealtimeUpdateSettings", "initCache must be called first");
                        str4 = null;
                    } else {
                        str4 = (String) lruCache.get(str6);
                    }
                    if (str4 == null || str5.compareTo(str4) > 0) {
                        if (this.A05.isEmpty()) {
                            z = true;
                        }
                        z = false;
                        if (str7.equals("QE")) {
                            this.A05.put(str6, str5);
                        } else if (str7.equals("LAUNCHER")) {
                            this.A04.put(str6, str5);
                        } else {
                            return;
                        }
                        if (z) {
                            C12810hQ.A04(new C05710Lq(this, r3), 310, 3, false, true, this.A02 * 1000);
                        }
                    }
                }
            } catch (IOException e) {
                AnonymousClass0QD.A05("ClientConfigUpdateRealtimeEventHandler", "Error while parsing client config update payload", e);
            }
        }
    }

    public C05690Lo(Context context, AnonymousClass0C1 r9) {
        this.A03 = context;
        this.A01 = r9;
        String string = C16180oA.A00(r9).A00.getString("client_config_realtime_update_settings", (String) null);
        try {
            this.A00 = new AnonymousClass0L4();
            if (string != null && !string.isEmpty()) {
                C13080hr A0A = C12890hY.A00.A0A(string);
                A0A.A0p();
                this.A00 = AnonymousClass0L3.parseFromJson(A0A);
            }
        } catch (IOException e) {
            AnonymousClass0QD.A05("ClientConfigUpdateRealtimeEventHandler", "Error while parsing client config update settings", e);
        }
        AnonymousClass0L4 r6 = this.A00;
        AnonymousClass0L7 r5 = AnonymousClass0L7.CLIENT_CONFIG_REALTIME_SUBSCRIPTION;
        r6.A00 = new LruCache(((Integer) AnonymousClass0L6.A02(r9, r5, "last_publish_cache_size", 50, (AnonymousClass04H) null)).intValue());
        for (Map.Entry entry : r6.A01.entrySet()) {
            r6.A00.put(entry.getKey(), entry.getValue());
        }
        this.A02 = ((Integer) AnonymousClass0L6.A02(r9, r5, "batch_delay_in_secs", 60, (AnonymousClass04H) null)).intValue();
    }
}
