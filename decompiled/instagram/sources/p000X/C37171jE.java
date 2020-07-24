package p000X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1jE  reason: invalid class name and case insensitive filesystem */
public enum C37171jE {
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    CLOSE_FRIENDS("besties");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C37171jE r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C37171jE(String str) {
        this.A00 = str;
    }
}
