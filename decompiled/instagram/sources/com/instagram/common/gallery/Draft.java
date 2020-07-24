package com.instagram.common.gallery;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.io.File;
import p000X.C76823Xl;
import p000X.C84653m5;

public class Draft implements C84653m5, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(279);
    public final String A00;
    public final boolean A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final int AUk() {
        return 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return this.A04.equals(((Draft) obj).AOA());
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public final boolean isValid() {
        String str = this.A00;
        if (str == null || str.isEmpty() || !new File(str).exists()) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final String AMI() {
        return this.A03;
    }

    public final String AOA() {
        return this.A04;
    }

    public final boolean Ae6() {
        return this.A05;
    }

    public final boolean AiO() {
        return this.A06;
    }

    public final int getDuration() {
        return this.A02;
    }

    public Draft(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A04 = parcel.readString();
        boolean z = false;
        this.A06 = parcel.readInt() == 1;
        this.A05 = parcel.readInt() == 1;
        this.A03 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt() == 1 ? true : z;
    }

    public Draft(String str, String str2, boolean z, boolean z2, int i, boolean z3) {
        this.A04 = str;
        this.A00 = str2;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = C76823Xl.A01(i);
        this.A02 = i;
        this.A01 = z3;
    }
}
