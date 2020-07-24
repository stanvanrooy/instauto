package com.instagram.model.shopping.reels;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass17M;

public class ProfileShopLink implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(419);
    public String A00;
    public String A01;
    public String A02;
    public HashMap A03 = new HashMap();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProfileShopLink profileShopLink = (ProfileShopLink) obj;
            if (!AnonymousClass17M.A00(this.A01, profileShopLink.A01) || !AnonymousClass17M.A00(this.A02, profileShopLink.A02) || !AnonymousClass17M.A00(this.A00, profileShopLink.A00) || !AnonymousClass17M.A00(this.A03, profileShopLink.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A00, this.A03});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeMap(this.A03);
    }

    public ProfileShopLink() {
    }

    public ProfileShopLink(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        parcel.readMap(this.A03, Map.class.getClassLoader());
    }

    public ProfileShopLink(String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
    }
}
