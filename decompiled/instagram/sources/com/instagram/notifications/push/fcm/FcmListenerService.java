package com.instagram.notifications.push.fcm;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.Map;
import p000X.C04450Ea;
import p000X.C16670oy;
import p000X.C41941rE;
import p000X.C42861tN;

public class FcmListenerService extends FirebaseMessagingService {
    public final void A04(RemoteMessage remoteMessage) {
        C42861tN r3;
        if (remoteMessage.A01 == null) {
            Bundle bundle = remoteMessage.A00;
            C04450Ea r32 = new C04450Ea();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        r32.put(str, str2);
                    }
                }
            }
            remoteMessage.A01 = r32;
        }
        Map map = remoteMessage.A01;
        map.get("data");
        if (map.containsKey("data")) {
            r3 = C42861tN.A00((String) map.get("data"), C41941rE.A00(PushChannelType.FCM));
        } else {
            r3 = null;
        }
        C16670oy.A01().A09(r3, (String) map.get("message_type"), PushChannelType.FCM);
    }
}
