package com.instagram.clips.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;

public enum ClipsViewerSource implements Parcelable {
    ACTIVITY_FEED_NOTIF("activity_feed_notif"),
    AR_EFFECT("effect_page"),
    DIRECT(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING),
    EXPLORE_POPULAR_MAJOR_UNIT("explore_popular_major_unit"),
    EXPLORE_POPULAR_MINOR_UNIT("explore_popular_minor_unit"),
    HASHTAG("hashtag"),
    PROFILE("clips_profile"),
    PUSH_NOTIF("push_notif"),
    REEL_VIEWER("reel_viewer"),
    SELF_PROFILE("self_clips_profile"),
    SONG("audio_page"),
    THIRD_PARTY_URL("third_party_url"),
    UNKNOWN(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorEBaseShape1S0000000_I1(278);
    }

    /* access modifiers changed from: public */
    ClipsViewerSource(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
