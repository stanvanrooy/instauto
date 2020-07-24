package p000X;

import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1mi  reason: invalid class name and case insensitive filesystem */
public final class C39321mi extends GraphQLSubscriptionHandler implements C06570Po {
    public final AnonymousClass0C1 A00;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    public final void onUserSessionWillEnd(boolean z) {
    }

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        if (!RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) || !GraphQLSubscriptionID.FEEDBACK_LIKE_SUBSCRIBE_QUERY_ID.equals(str2)) {
            return false;
        }
        return true;
    }

    public final void onRealtimeEventPayload(String str, String str2, String str3) {
        C28698ClE clE;
        C28690Cl6 cl6;
        try {
            C13080hr A0A = C12890hY.A00.A0A(str3);
            A0A.A0p();
            C28699ClF parseFromJson = C28697ClD.parseFromJson(A0A);
            if (parseFromJson != null && (clE = parseFromJson.A00) != null && (cl6 = clE.A00) != null) {
                C12670hC.A04(new C28689Cl5(this, cl6));
            }
        } catch (IOException e) {
            throw new IllegalStateException("error parsing feedback like event from skywalker", e);
        }
    }

    public C39321mi(AnonymousClass0C1 r2) {
        this.A00 = r2;
    }
}
