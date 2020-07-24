package com.instagram.realtimeclient;

import java.io.IOException;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass1CF;
import p000X.AnonymousClass1CH;
import p000X.C06570Po;
import p000X.C11590fD;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C16180oA;
import p000X.DYW;
import p000X.DYX;
import p000X.DYY;

public class ZeroProvisionRealtimeService extends GraphQLSubscriptionHandler implements C06570Po {
    public final AnonymousClass0C1 mUserSession;

    public void onUserSessionWillEnd(boolean z) {
    }

    public static ZeroProvisionRealtimeService getInstance(final AnonymousClass0C1 r2) {
        return (ZeroProvisionRealtimeService) r2.AVA(ZeroProvisionRealtimeService.class, new C11590fD() {
            public ZeroProvisionRealtimeService get() {
                return new ZeroProvisionRealtimeService(AnonymousClass0C1.this);
            }
        });
    }

    public boolean canHandleRealtimeEvent(String str, String str2) {
        if (!RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) || !GraphQLSubscriptionID.ZERO_PROVISION_QUERY_ID.equals(str2)) {
            return false;
        }
        return true;
    }

    public void onRealtimeEventPayload(String str, String str2, String str3) {
        String str4;
        try {
            C13080hr A0A = C12890hY.A00.A0A(str3);
            A0A.A0p();
            DYX parseFromJson = DYW.parseFromJson(A0A);
            if (parseFromJson != null && parseFromJson.A00() != null) {
                C16180oA A00 = C16180oA.A00(this.mUserSession);
                if (parseFromJson.A00().longValue() > A00.A00.getLong("zero_rating_provisioned_time", 0)) {
                    AnonymousClass1CH A002 = AnonymousClass1CF.A00(this.mUserSession);
                    DYY dyy = parseFromJson.A00;
                    if (dyy != null) {
                        str4 = dyy.A00;
                    } else {
                        str4 = "";
                    }
                    A002.AEg(AnonymousClass000.A0J(str4, "_", "mqtt_token_push"), false);
                    A00.A00.edit().putLong("zero_rating_provisioned_time", parseFromJson.A00().longValue()).apply();
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("error parsing zero provision event from skywalker", e);
        }
    }

    public ZeroProvisionRealtimeService(AnonymousClass0C1 r1) {
        this.mUserSession = r1;
    }
}
