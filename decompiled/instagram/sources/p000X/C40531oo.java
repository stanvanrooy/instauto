package p000X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;

/* renamed from: X.1oo  reason: invalid class name and case insensitive filesystem */
public final class C40531oo {
    public final AnonymousClass00B A00;
    public final C40491ok A01;

    public final void A00(String str, String str2, String str3, int i, String str4, C45951yt r14) {
        String str5;
        if (this.A01.A00()) {
            int hashCode = str.hashCode();
            if (!this.A00.isMarkerOn(1900557, hashCode) && this.A01.A00()) {
                this.A00.markerStart(1900557, hashCode);
            }
            String A012 = C40451og.A01(r14);
            C37671k2 r6 = r14.A04;
            boolean z = r14.A0F;
            HashMap hashMap = new HashMap();
            hashMap.put("player_type", A012);
            hashMap.put("player_origin", str4);
            hashMap.put(TraceFieldType.VideoId, str);
            hashMap.put("original_play_reason", str2);
            hashMap.put("viewer_session_id", str3);
            hashMap.put("requested_playing_start_video_time_position_ms", Integer.toString(i));
            if (A012.equals(C43001tb.A00(Constants.A0N))) {
                str5 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str5 = "0";
            }
            hashMap.put("is_live_streaming", str5);
            if (r6 != null) {
                hashMap.put("streaming_format", C37671k2.A03(r6));
            }
            hashMap.put("is_sponsored", Boolean.toString(z));
            C40441of.A00(1900557, hashCode, hashMap);
        }
    }

    public C40531oo(AnonymousClass00B r1, C40491ok r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
