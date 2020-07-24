package com.facebook.cellinfo.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C229039wb;
import p000X.C54492Xn;

public class ParcelableGeneralCellInfo extends C54492Xn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(43);

    public final int describeContents() {
        return 0;
    }

    public static ParcelableGeneralCellInfo A00(C54492Xn r21) {
        ParcelableCdmaCellInfo parcelableCdmaCellInfo;
        C54492Xn r0 = r21;
        if (r21 == null) {
            return null;
        }
        String str = r0.A05;
        String str2 = r0.A06;
        String str3 = r0.A07;
        String str4 = r0.A08;
        boolean z = r0.A09;
        String str5 = r0.A04;
        String str6 = r0.A01;
        String str7 = r0.A02;
        String str8 = r0.A03;
        boolean z2 = r0.A0A;
        C229039wb r02 = r0.A00;
        if (r02 == null) {
            parcelableCdmaCellInfo = null;
        } else {
            int i = r02.A01;
            int i2 = r02.A02;
            int i3 = r02.A00;
            int i4 = i3;
            int i5 = i2;
            int i6 = i;
            parcelableCdmaCellInfo = new ParcelableCdmaCellInfo(i6, i5, i4, r02.A03, r02.A04);
        }
        return new ParcelableGeneralCellInfo(str, str2, str3, str4, z, str5, str6, str7, str8, z2, parcelableCdmaCellInfo);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeParcelable((ParcelableCdmaCellInfo) this.A00, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParcelableGeneralCellInfo(Parcel parcel) {
        super(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readByte() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readByte() != 0, (ParcelableCdmaCellInfo) parcel.readParcelable(ParcelableCdmaCellInfo.class.getClassLoader()));
    }

    public ParcelableGeneralCellInfo(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, boolean z2, ParcelableCdmaCellInfo parcelableCdmaCellInfo) {
        super(str, str2, str3, str4, z, str5, str6, str7, str8, z2, parcelableCdmaCellInfo);
    }
}
