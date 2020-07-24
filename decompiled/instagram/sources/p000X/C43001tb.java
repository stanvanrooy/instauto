package p000X;

import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.1tb  reason: invalid class name and case insensitive filesystem */
public final class C43001tb {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "stories";
            case 2:
                return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            case 3:
                return "live";
            case 4:
                return "live_replay";
            case 5:
                return "direct_audio";
            case 6:
                return "music";
            case 7:
                return "local";
            case 8:
                return "cowatch_local";
            default:
                return IgReactGeoGatingModule.SETTING_TYPE_FEED;
        }
    }
}
