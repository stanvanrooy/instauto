package com.instagram.model.shopping.reels;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public enum ProductCollectionReviewStatus implements Parcelable {
    APPROVED("approved");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorEBaseShape1S0000000_I1(417);
    }

    /* access modifiers changed from: public */
    ProductCollectionReviewStatus(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
