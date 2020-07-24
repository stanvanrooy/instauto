package com.instagram.common.textwithentities;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.List;
import p000X.C25972BdR;

public class TextWithEntities implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(286);
    public String A00;
    public List A01;
    public List A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        int i2 = 0;
        int i3 = 1;
        if (this.A01 == null) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        List list = this.A01;
        if (list != null) {
            parcel.writeList(list);
        }
        if (this.A02 != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        List list2 = this.A02;
        if (list2 != null) {
            parcel.writeList(list2);
        }
    }

    public TextWithEntities() {
    }

    public TextWithEntities(Parcel parcel) {
        this.A00 = parcel.readString();
        if (parcel.readInt() != 0) {
            ArrayList arrayList = new ArrayList();
            this.A01 = arrayList;
            parcel.readList(arrayList, C25972BdR.class.getClassLoader());
        }
        if (parcel.readInt() != 0) {
            ArrayList arrayList2 = new ArrayList();
            this.A02 = arrayList2;
            parcel.readList(arrayList2, Range.class.getClassLoader());
        }
    }
}
