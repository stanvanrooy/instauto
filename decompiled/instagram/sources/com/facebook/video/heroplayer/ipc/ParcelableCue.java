package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public final class ParcelableCue implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(91);
    public CharSequence A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.A00, parcel, 0);
    }

    public ParcelableCue() {
    }

    public ParcelableCue(Parcel parcel) {
        this.A00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public ParcelableCue(CharSequence charSequence) {
        this.A00 = charSequence;
    }
}
