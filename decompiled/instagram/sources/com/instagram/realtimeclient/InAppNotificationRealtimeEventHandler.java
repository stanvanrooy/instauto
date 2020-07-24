package com.instagram.realtimeclient;

import java.io.IOException;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0IY;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass6P8;
import p000X.AnonymousClass6P9;
import p000X.AnonymousClass6PA;
import p000X.AnonymousClass6PB;
import p000X.AnonymousClass6PE;
import p000X.C16980pU;
import p000X.C33251cc;
import p000X.C61432ln;
import p000X.C61442lo;

public class InAppNotificationRealtimeEventHandler extends GraphQLSubscriptionHandler {
    public static final Class TAG = InAppNotificationRealtimeEventHandler.class;
    public final AnonymousClass0C1 mUserSession;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r2.equals(com.instagram.realtimeclient.InAppNotificationDestinations.COMMENTS_V2) == false) goto L_0x0027;
     */
    private void displayInAppBanner(AnonymousClass6P9 r7) {
        char c;
        AnonymousClass6PE r5 = r7.A00;
        String str = r5.A05;
        C61432ln r4 = new C61432ln();
        r4.A05 = str;
        r4.A01 = r5.A01.ASv();
        String str2 = r5.A02;
        if (str2.hashCode() == 2104451239) {
            c = 0;
        }
        c = 65535;
        if (c == 0) {
            AnonymousClass6PB A03 = C16980pU.A00.A03(this.mUserSession);
            String str3 = (String) r5.A06.get("media_id");
            AnonymousClass0a4.A06(str3);
            r4.A03 = new AnonymousClass6P8(A03, str3, r7, (String) r7.A00.A06.get("target_comment_id"));
        }
        C33251cc.A01().A09(new C61442lo(r4));
    }

    public boolean canHandleRealtimeEvent(String str, String str2) {
        if (!RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) || str2 == null || !str2.equals(GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID)) {
            return false;
        }
        return true;
    }

    public void onRealtimeEventPayload(String str, String str2, String str3) {
        try {
            displayInAppBanner(AnonymousClass6PA.parseFromJson(AnonymousClass0IY.A00(this.mUserSession, str3)));
        } catch (IOException e) {
            throw new IllegalStateException("error parsing feedback like event from skywalker", e);
        }
    }

    public InAppNotificationRealtimeEventHandler(AnonymousClass0C1 r1) {
        this.mUserSession = r1;
    }
}
