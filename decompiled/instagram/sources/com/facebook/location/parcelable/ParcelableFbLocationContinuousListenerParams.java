package com.facebook.location.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.Constants;
import p000X.C176707gf;

public final class ParcelableFbLocationContinuousListenerParams extends C176707gf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(75);

    /* JADX WARNING: Illegal instructions before constructor call */
    public ParcelableFbLocationContinuousListenerParams(Parcel parcel) {
        super(r2, r3, r5, r7, r8, r10);
        Long valueOf;
        Integer num = Constants.ZERO(4)[parcel.readInt()];
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        float readFloat = parcel.readFloat();
        long readLong3 = parcel.readLong();
        if (parcel.readByte() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C176707gf)) {
            C176707gf r8 = (C176707gf) obj;
            if (this.A01 == r8.A01 && this.A03 == r8.A03 && Float.compare(r8.A00, this.A00) == 0 && this.A02 == r8.A02 && this.A04 == r8.A04) {
                Long l = this.A05;
                if (l != null) {
                    return l.equals(r8.A05);
                }
                return r8.A05 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str;
        Integer num = this.A04;
        int i3 = 0;
        if (num != null) {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "LOW_POWER";
                    break;
                case 2:
                    str = "BALANCED_POWER_AND_ACCURACY";
                    break;
                case 3:
                    str = "HIGH_ACCURACY";
                    break;
                default:
                    str = "NO_POWER";
                    break;
            }
            i = str.hashCode() + intValue;
        } else {
            i = 0;
        }
        long j = this.A01;
        long j2 = this.A03;
        int i4 = ((((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        float f = this.A00;
        if (f != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i2 = Float.floatToIntBits(f);
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        long j3 = this.A02;
        int i6 = (i5 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Long l = this.A05;
        if (l != null) {
            i3 = l.hashCode();
        }
        return i6 + i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04.intValue());
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeLong(this.A02);
        Long l = this.A05;
        if (l == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeLong(l.longValue());
    }
}
