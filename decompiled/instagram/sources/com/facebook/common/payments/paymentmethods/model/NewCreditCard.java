package com.facebook.common.payments.paymentmethods.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000X.C229829yi;

public class NewCreditCard implements PaymentCredential {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(54);
    public final AdditionalFields A00;
    public final String A01;
    public final List A02;
    public final Set A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A02);
        Set set = this.A03;
        if (set == null) {
            parcel.writeList((List) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(set);
        parcel.writeList(arrayList);
    }

    public NewCreditCard(C229829yi r2) {
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
    }

    public NewCreditCard(Parcel parcel) {
        Set hashSet;
        this.A01 = parcel.readString();
        this.A00 = (AdditionalFields) parcel.readParcelable(AdditionalFields.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, ArrayList.class.getClassLoader());
        this.A02 = arrayList;
        ArrayList readArrayList = parcel.readArrayList(List.class.getClassLoader());
        if (readArrayList == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(readArrayList);
        }
        this.A03 = hashSet == null ? Collections.EMPTY_SET : hashSet;
    }
}
