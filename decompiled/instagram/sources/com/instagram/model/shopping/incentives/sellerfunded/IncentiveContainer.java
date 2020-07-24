package com.instagram.model.shopping.incentives.sellerfunded;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass17M;

public class IncentiveContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(391);
    public List A00;

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AnonymousClass17M.A00(this.A00, ((IncentiveContainer) obj).A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
    }

    public IncentiveContainer() {
        this.A00 = new ArrayList();
    }

    public IncentiveContainer(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        parcel.readList(arrayList, Incentive.class.getClassLoader());
    }
}
