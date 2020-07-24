package com.instagram.clips.audio.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public enum AudioPageModelType implements Parcelable {
    MUSIC_MODEL,
    ORIGINAL_SOUND_MODEL;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorEBaseShape1S0000000_I1(276);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
