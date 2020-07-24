package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import p000X.C216699We;
import p000X.C218489bT;

public class ShoppingDestinationTypeModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(379);
    public C218489bT A00;
    public C216699We A01;
    public String A02;
    public String A03;
    public boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01.toString());
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        int i2 = 1;
        int i3 = 0;
        if (this.A00 != null) {
            i3 = 1;
        }
        parcel.writeInt(i3);
        if (i3 != 0) {
            parcel.writeString(this.A00.A00);
            C218489bT r0 = this.A00;
            if (r0 == null || r0.A01 == null) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            if (i2 != 0) {
                parcel.writeStringList(this.A00.A01);
            }
        }
    }

    public ShoppingDestinationTypeModel() {
    }

    public ShoppingDestinationTypeModel(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = C216699We.A00(parcel.readString());
        this.A03 = parcel.readString();
        boolean z = false;
        this.A04 = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            C218489bT r1 = new C218489bT();
            this.A00 = r1;
            r1.A00 = parcel.readString();
            if (parcel.readInt() == 1 ? true : z) {
                C218489bT r12 = this.A00;
                ArrayList arrayList = new ArrayList();
                r12.A01 = arrayList;
                parcel.readStringList(arrayList);
            }
        }
    }

    public ShoppingDestinationTypeModel(String str, String str2, C216699We r3) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r3;
    }
}
