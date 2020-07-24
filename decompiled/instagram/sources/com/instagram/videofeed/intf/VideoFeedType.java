package com.instagram.videofeed.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public enum VideoFeedType implements Parcelable {
    EXPLORE_CHANNEL("discover_videos"),
    EXPLORE_MEDIA_VIDEO_CHAINING("video_chaining"),
    EXPLORE_IGTV_PREVIEW("igtv_preview"),
    KEYWORD_CHANNEL("serp_videos"),
    HASHTAG_CHANNEL("hashtag_videos");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorEBaseShape1S0000000_I1(481);
    }

    /* access modifiers changed from: public */
    VideoFeedType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
