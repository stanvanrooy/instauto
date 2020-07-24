package com.instagram.realtimeclient;

import android.content.SharedPreferences;
import com.instagram.realtimeclient.C0142L;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.C06570Po;
import p000X.C11590fD;
import p000X.C14190ju;

public class PresenceSubscriptionIDStore implements C06570Po {
    public static final String PRESENCE_SUBSCRIPTION_ID_KEY = "presence_subscription_id_key";
    public final SharedPreferences mPreferences;
    public final AnonymousClass0C1 mUserSession;

    public void onUserSessionWillEnd(boolean z) {
    }

    public static PresenceSubscriptionIDStore getInstance(final AnonymousClass0C1 r2) {
        return (PresenceSubscriptionIDStore) r2.AVA(PresenceSubscriptionIDStore.class, new C11590fD() {
            public PresenceSubscriptionIDStore get() {
                return new PresenceSubscriptionIDStore(C14190ju.A01(AnonymousClass0C1.this).A03(Constants.A0x), AnonymousClass0C1.this);
            }
        });
    }

    public String getAppPresenceQueryId() {
        String string = this.mPreferences.getString(PRESENCE_SUBSCRIPTION_ID_KEY, GraphQLSubscriptionID.APP_PRESENCE_QUERY_ID);
        if (string == null) {
            return GraphQLSubscriptionID.APP_PRESENCE_QUERY_ID;
        }
        return string;
    }

    public String getAppPresenceQueryIdForSubscription() {
        String str;
        if (C0142L.ig_new_presence_subscription_id.is_enabled.getAndExpose(this.mUserSession).booleanValue()) {
            str = GraphQLSubscriptionID.APP_PRESENCE_QUERY_ID_V2;
        } else {
            str = GraphQLSubscriptionID.APP_PRESENCE_QUERY_ID;
        }
        this.mPreferences.edit().putString(PRESENCE_SUBSCRIPTION_ID_KEY, str).apply();
        return str;
    }

    public PresenceSubscriptionIDStore(SharedPreferences sharedPreferences, AnonymousClass0C1 r2) {
        this.mPreferences = sharedPreferences;
        this.mUserSession = r2;
    }
}
