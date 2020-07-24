package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.1kg  reason: invalid class name and case insensitive filesystem */
public enum C38071kg {
    ALL("all", "turn_on_all_live_notifications"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, "turn_on_some_live_notifications"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE, "turn_off_live_notifications");
    
    public final String A00;
    public final String A01;

    /* access modifiers changed from: public */
    C38071kg(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
