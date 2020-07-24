package com.instagram.model.hashtag;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.usertagentity.UserTagEntity;
import p000X.Constants;

public class Hashtag implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(57);
    public int A00;
    public int A01;
    public int A02;
    public ImageUrl A03;
    public UserTagEntity A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Integer A0H = Constants.A0C;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                String str = this.A0A;
                String str2 = ((Hashtag) obj).A0A;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer A00() {
        boolean z = true;
        if (!(this.A00 == 1 || this.A01 == 1)) {
            z = false;
        }
        if (!z) {
            return Constants.ZERO;
        }
        if (!z) {
            return Constants.A0C;
        }
        return Constants.ONE;
    }

    public final void A01(Integer num) {
        this.A0H = num;
        int i = 0;
        if (Constants.ONE.equals(num)) {
            i = 1;
        }
        this.A00 = i;
        this.A01 = i;
    }

    public final boolean A02() {
        return !TextUtils.isEmpty(this.A05);
    }

    public final int hashCode() {
        String str = this.A0A;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.A07;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        switch (this.A0H.intValue()) {
            case 1:
                str = "Following";
                break;
            case 2:
                str = "Unknown";
                break;
            default:
                str = "NotFollowing";
                break;
        }
        parcel.writeString(str);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeByte(this.A0F ? (byte) 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeByte(this.A0G ? (byte) 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A04, i);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
    }

    public Hashtag() {
    }

    public Hashtag(Parcel parcel) {
        Integer num;
        this.A0A = parcel.readString();
        this.A02 = parcel.readInt();
        this.A07 = parcel.readString();
        this.A03 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        boolean z = true;
        this.A0E = parcel.readByte() != 0;
        this.A00 = parcel.readInt();
        String readString = parcel.readString();
        if (readString.equals("NotFollowing")) {
            num = Constants.ZERO;
        } else if (readString.equals("Following")) {
            num = Constants.ONE;
        } else if (readString.equals("Unknown")) {
            num = Constants.A0C;
        } else {
            throw new IllegalArgumentException(readString);
        }
        this.A0H = num;
        this.A0B = parcel.readByte() != 0;
        this.A0C = parcel.readByte() != 0;
        this.A0F = parcel.readByte() != 0;
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0G = parcel.readByte() != 0;
        this.A05 = parcel.readString();
        this.A04 = (UserTagEntity) parcel.readParcelable(UserTagEntity.class.getClassLoader());
        this.A0D = parcel.readByte() == 0 ? false : z;
    }

    public Hashtag(Hashtag hashtag) {
        this.A07 = hashtag.A07;
        this.A0A = hashtag.A0A;
        this.A02 = hashtag.A02;
        this.A03 = hashtag.A03;
        this.A00 = hashtag.A00;
        this.A01 = hashtag.A01;
        this.A0B = hashtag.A0B;
        this.A0C = hashtag.A0C;
        this.A0E = hashtag.A0E;
        this.A0H = hashtag.A0H;
        this.A0F = hashtag.A0F;
        this.A08 = hashtag.A08;
        this.A09 = hashtag.A09;
        this.A0G = hashtag.A0G;
        this.A05 = hashtag.A05;
        this.A04 = hashtag.A04;
    }

    public Hashtag(String str) {
        this.A0A = str;
    }

    public Hashtag(String str, String str2) {
        this.A07 = str;
        this.A0A = str2;
    }
}
