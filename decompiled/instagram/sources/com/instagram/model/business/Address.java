package com.instagram.model.business;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class Address implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(351);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Address address = (Address) obj;
            if (!AnonymousClass17M.A00(this.A03, address.A03) || !AnonymousClass17M.A00(this.A01, address.A01) || !AnonymousClass17M.A00(this.A04, address.A04) || !AnonymousClass17M.A00(this.A00, address.A00) || !AnonymousClass17M.A00(this.A02, address.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A01, this.A04, this.A00, this.A02});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }

    public Address() {
    }

    public Address(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public Address(String str, String str2, String str3, String str4, String str5) {
        String trim;
        String str6 = null;
        if (str == null) {
            trim = null;
        } else {
            trim = str.trim();
        }
        this.A04 = trim;
        this.A01 = str2;
        this.A02 = str4 != null ? str4.trim() : str6;
        this.A00 = str3;
        this.A03 = str5;
    }
}
