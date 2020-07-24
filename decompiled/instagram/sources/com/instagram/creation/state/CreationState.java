package com.instagram.creation.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public enum CreationState implements Parcelable {
    ACCESSIBILITY_SETTINGS,
    ADJUST,
    ADVANCED_SETTINGS,
    ALBUM_EDIT,
    BRANDED_CONTENT_TAG,
    BRANDED_CONTENT_TAGGED_BUSINESS_PARTNER,
    BRANDED_CONTENT_TAG_OPT_IN,
    CAPTURE,
    CROP,
    VIDEO_CROP,
    GALLERY_PICKER,
    INIT,
    LIMIT_LOCATIONS,
    LOCATION_TAG,
    MANAGE,
    MANAGE_DRAFTS,
    PHOTO_EDIT,
    SHARE,
    THUMBNAIL_VIEW,
    PREPARE_VIDEO_EDIT,
    VIDEO_EDIT;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorEBaseShape1S0000000_I1(314);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
