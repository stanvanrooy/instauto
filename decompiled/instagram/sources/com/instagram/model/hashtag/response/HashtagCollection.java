package com.instagram.model.hashtag.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.List;
import p000X.C28691Ms;

public class HashtagCollection extends C28691Ms implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(360);
    public List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeList(this.A00);
    }

    public HashtagCollection() {
    }

    public HashtagCollection(Parcel parcel) {
        if (parcel.readByte() == 1) {
            ArrayList arrayList = new ArrayList();
            this.A00 = arrayList;
            parcel.readList(arrayList, Hashtag.class.getClassLoader());
            return;
        }
        this.A00 = null;
    }
}
