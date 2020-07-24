package com.instagram.model.reels;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.AnonymousClass2CK;

public class ReelChainingConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(63);
    public final AnonymousClass2CK A00;
    public final String A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public ReelChainingConfig(AnonymousClass2CK r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }

    public ReelChainingConfig(Parcel parcel) {
        AnonymousClass2CK r0;
        String readString = parcel.readString();
        if (readString != null) {
            r0 = (AnonymousClass2CK) AnonymousClass2CK.A01.get(readString);
        } else {
            r0 = null;
        }
        this.A00 = r0 == null ? AnonymousClass2CK.UNKNOWN : r0;
        this.A01 = parcel.readString();
        this.A02 = parcel.readInt() != 1 ? false : true;
    }
}
