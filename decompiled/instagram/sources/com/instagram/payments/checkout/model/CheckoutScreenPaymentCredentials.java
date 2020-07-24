package com.instagram.payments.checkout.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.List;
import p000X.C29255Cug;
import p000X.DGa;

public class CheckoutScreenPaymentCredentials implements CheckoutScreenComponent {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(441);
    public final List A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeList(this.A00);
    }

    public CheckoutScreenPaymentCredentials(C29255Cug cug) {
        this.A01 = cug.A01;
        this.A00 = cug.A00;
    }

    public CheckoutScreenPaymentCredentials(Parcel parcel) {
        this.A01 = parcel.readInt() == 0 ? false : true;
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        parcel.readList(arrayList, DGa.class.getClassLoader());
    }
}
