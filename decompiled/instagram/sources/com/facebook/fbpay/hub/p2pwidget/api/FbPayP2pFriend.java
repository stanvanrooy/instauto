package com.facebook.fbpay.hub.p2pwidget.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C26626Boi;

public class FbPayP2pFriend implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(70);
    public final Uri A00;
    public final Uri A01;
    public final Uri A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayP2pFriend) {
                FbPayP2pFriend fbPayP2pFriend = (FbPayP2pFriend) obj;
                if (!C26626Boi.A03(this.A03, fbPayP2pFriend.A03) || !C26626Boi.A03(this.A04, fbPayP2pFriend.A04) || !C26626Boi.A03(this.A00, fbPayP2pFriend.A00) || !C26626Boi.A03(this.A01, fbPayP2pFriend.A01) || !C26626Boi.A03(this.A02, fbPayP2pFriend.A02) || !C26626Boi.A03(this.A05, fbPayP2pFriend.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(1, this.A03), this.A04), this.A00), this.A01), this.A02), this.A05);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A03 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A03);
        }
        if (this.A04 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A04);
        }
        parcel.writeParcelable(this.A00, i);
        if (this.A01 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A01, i);
        }
        if (this.A02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A02, i);
        }
        parcel.writeString(this.A05);
    }

    public FbPayP2pFriend(Parcel parcel) {
        if (parcel.readInt() != 0) {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() != 0) {
            this.A04 = parcel.readString();
        }
        Class<Uri> cls = Uri.class;
        this.A00 = (Uri) parcel.readParcelable(cls.getClassLoader());
        if (parcel.readInt() != 0) {
            this.A01 = (Uri) parcel.readParcelable(cls.getClassLoader());
        }
        if (parcel.readInt() != 0) {
            this.A02 = (Uri) parcel.readParcelable(cls.getClassLoader());
        }
        this.A05 = parcel.readString();
    }
}
