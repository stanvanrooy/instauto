package com.instagram.model.payments.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.payments.common.ProductItem;
import java.util.ArrayList;

public class CheckoutLaunchParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(363);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public ArrayList A05;
    public boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeList(this.A05);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public CheckoutLaunchParams() {
    }

    public CheckoutLaunchParams(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        parcel.readList(arrayList, ProductItem.class.getClassLoader());
        this.A02 = parcel.readString();
        this.A06 = parcel.readInt() != 1 ? false : true;
    }

    public CheckoutLaunchParams(String str, String str2, String str3, ArrayList arrayList, String str4, boolean z) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = str3;
        this.A01 = "IG_NMOR_SHOPPING";
        this.A05 = arrayList;
        this.A02 = str4;
        this.A06 = z;
    }
}
