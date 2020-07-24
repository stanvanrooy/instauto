package com.facebook.blescan.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C229069wf;

public class ParcelableBleScanResult extends C229069wf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(30);

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r1.equals(r8.A03) == false) goto L_0x002e;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C229069wf)) {
            C229069wf r8 = (C229069wf) obj;
            if (this.A01 == r8.A01 && this.A02 == r8.A02 && this.A00 == r8.A00) {
                String str = this.A03;
                if (str == null) {
                    if (r8.A03 != null) {
                        return false;
                    }
                }
                String str2 = this.A04;
                if (str2 != null) {
                    return str2.equals(r8.A04);
                }
                return r8.A04 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.A01;
        long j2 = this.A02;
        int i2 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.A03;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (((i2 + i) * 31) + this.A00) * 31;
        String str2 = this.A04;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
    }

    public ParcelableBleScanResult(long j, long j2, String str, int i, String str2) {
        super(j, j2, str, i, str2);
    }

    public ParcelableBleScanResult(Parcel parcel) {
        super(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString());
    }
}
