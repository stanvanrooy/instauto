package com.instagram.model.business;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class PublicPhoneContact implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(353);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PublicPhoneContact publicPhoneContact = (PublicPhoneContact) obj;
            if (!AnonymousClass17M.A00(this.A03, publicPhoneContact.A03) || !AnonymousClass17M.A00(this.A00, publicPhoneContact.A00) || !AnonymousClass17M.A00(this.A01, publicPhoneContact.A01) || !AnonymousClass17M.A00(this.A02, publicPhoneContact.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A00, this.A01, this.A02});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public PublicPhoneContact() {
    }

    public PublicPhoneContact(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public PublicPhoneContact(String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = str4;
    }
}
