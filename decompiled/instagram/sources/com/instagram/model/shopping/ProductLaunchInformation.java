package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class ProductLaunchInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(374);
    public long A00;
    public boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductLaunchInformation) {
            ProductLaunchInformation productLaunchInformation = (ProductLaunchInformation) obj;
            return this.A00 == productLaunchInformation.A00 && this.A01 == productLaunchInformation.A01;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A00;
        return (((int) (j ^ (j >>> 32))) * 31) + (this.A01 ? 1 : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public ProductLaunchInformation() {
    }

    public ProductLaunchInformation(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readInt() != 0;
    }
}
