package com.facebook.location.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.Constants;
import p000X.C50862Id;
import p000X.C50872Ie;

public class ParcelableFbLocationOperationParams extends C50872Ie implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(76);

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public ParcelableFbLocationOperationParams(Parcel parcel) {
        super(r2);
        Integer num;
        Long valueOf;
        String readString = parcel.readString();
        if (readString.equals("LOW_POWER")) {
            num = Constants.ZERO;
        } else if (readString.equals("BALANCED_POWER_AND_ACCURACY")) {
            num = Constants.ONE;
        } else if (readString.equals("HIGH_ACCURACY")) {
            num = Constants.A0C;
        } else {
            throw new IllegalArgumentException(readString);
        }
        C50862Id r2 = new C50862Id(num);
        r2.A02 = parcel.readLong();
        r2.A00 = parcel.readFloat();
        r2.A05 = parcel.readLong();
        Float f = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        r2.A07 = valueOf;
        r2.A06 = parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : f;
        r2.A04 = parcel.readLong();
        r2.A03 = parcel.readLong();
        r2.A01 = parcel.readFloat();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.A07.intValue()) {
            case 1:
                str = "BALANCED_POWER_AND_ACCURACY";
                break;
            case 2:
                str = "HIGH_ACCURACY";
                break;
            default:
                str = "LOW_POWER";
                break;
        }
        parcel.writeString(str);
        parcel.writeLong(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeLong(this.A05);
        int i2 = 1;
        int i3 = 0;
        if (this.A08 != null) {
            i3 = 1;
        }
        parcel.writeInt(i3);
        Long l = this.A08;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
        if (this.A06 == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        Float f = this.A06;
        if (f != null) {
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
        parcel.writeFloat(this.A01);
    }
}
