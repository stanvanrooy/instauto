package p000X;

import android.os.Build;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.AUZ */
public final class AUZ {
    public final C23548AQs A00;
    public volatile Boolean A01;
    public volatile String A02;
    public volatile String A03;

    public final void A00(String str, String str2, String str3, String str4) {
        C23618AUa aUa = new C23618AUa();
        aUa.A00("broadcast_transition_from", str);
        aUa.A00("broadcast_transition_to", str2);
        aUa.A00("broadcast_transition_reason", str3);
        if (str4 != null) {
            aUa.A00("facecast_event_extra", str4);
        }
        if (this.A01 != null) {
            Boolean bool = this.A01;
            StringBuilder sb = aUa.A00;
            if (sb.length() != 1) {
                sb.append(",");
            }
            C206138s3.A00(sb, "is_streaming_sdk");
            StringBuilder sb2 = aUa.A00;
            sb2.append(":");
            if ((bool instanceof Integer) || (bool instanceof Float) || (bool instanceof Long) || (bool instanceof Double) || (bool instanceof Boolean) || (bool instanceof Byte) || (bool instanceof Short)) {
                sb2.append(String.valueOf(bool));
            } else {
                C206138s3.A00(sb2, String.valueOf(bool));
            }
        }
        aUa.A00("base_system_version", Build.VERSION.RELEASE);
        if (this.A02 != null) {
            aUa.A00(TraceFieldType.BroadcastId, this.A02);
        }
        if (this.A03 != null) {
            aUa.A00(TraceFieldType.VideoId, this.A03);
        }
        C23548AQs aQs = this.A00;
        aQs.A00.logEvent("facecast_broadcaster_update", aUa.toString());
    }

    public AUZ(C23548AQs aQs) {
        this.A00 = aQs;
    }
}
