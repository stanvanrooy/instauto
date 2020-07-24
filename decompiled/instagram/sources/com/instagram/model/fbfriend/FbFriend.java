package com.instagram.model.fbfriend;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.tagging.model.TaggableModel;
import p000X.C128925fW;

public class FbFriend implements C128925fW, TaggableModel {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(359);
    public Boolean A00;
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
            FbFriend fbFriend = (FbFriend) obj;
            if (!TextUtils.equals(this.A01, fbFriend.A01) || !TextUtils.equals(this.A02, fbFriend.A02) || !TextUtils.equals(this.A03, fbFriend.A03)) {
                return false;
            }
        }
        return true;
    }

    public final boolean AO0() {
        Boolean bool = this.A00;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int hashCode() {
        int i;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.A02;
        if (str2 != null) {
            i = (i * 31) + str2.hashCode();
        }
        String str3 = this.A03;
        if (str3 != null) {
            return (i * 31) + str3.hashCode();
        }
        return i;
    }

    public final String toString() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        return super.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(Boolean.TRUE.equals(this.A00) ? 1 : 0);
    }

    public final void Bhx(String str) {
        this.A01 = str;
    }

    public final void Bi9(boolean z) {
        this.A00 = Boolean.valueOf(z);
    }

    public final String getId() {
        return this.A01;
    }

    public FbFriend() {
    }

    public FbFriend(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = Boolean.valueOf(parcel.readInt() != 1 ? false : true);
    }
}
