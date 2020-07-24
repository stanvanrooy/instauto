package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;

public class ProductCollectionDropsMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(370);
    public long A00;
    public boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProductCollectionDropsMetadata productCollectionDropsMetadata = (ProductCollectionDropsMetadata) obj;
            if (!(this.A00 == productCollectionDropsMetadata.A00 && this.A01 == productCollectionDropsMetadata.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), Boolean.valueOf(this.A01)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public ProductCollectionDropsMetadata() {
    }

    public ProductCollectionDropsMetadata(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readInt() != 1 ? false : true;
    }
}
