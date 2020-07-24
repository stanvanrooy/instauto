package p000X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.Ac9 */
public final class Ac9 {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "viewer_list";
            case 2:
                return "invite_screen";
            case 3:
                return "comment_r2j";
            case 4:
                return "invite_screen_r2j";
            default:
                return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
        }
    }
}
