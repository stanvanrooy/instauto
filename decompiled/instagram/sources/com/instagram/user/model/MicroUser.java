package com.instagram.user.model;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.typedurl.ImageUrl;
import p000X.C13300iJ;

public class MicroUser implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(89);
    public ImageUrl A00;
    public PasswordState A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;

    public enum PasswordState implements Parcelable {
        HAS_PASSWORD,
        HAS_NO_PASSWORD;
        
        public static final Parcelable.Creator CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        /* access modifiers changed from: public */
        static {
            CREATOR = new PCreatorEBaseShape0S0000000_I0(90);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A03.equals(((MicroUser) obj).A03);
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            parcel.writeBoolean(this.A05);
        } else {
            parcel.writeInt(this.A05 ? 1 : 0);
        }
    }

    public MicroUser() {
    }

    public MicroUser(C13300iJ r2) {
        this.A03 = r2.getId();
        this.A02 = r2.AMN();
        this.A04 = r2.AZn();
        this.A00 = r2.ASv();
        this.A05 = r2.A0d();
    }

    public MicroUser(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        this.A01 = (PasswordState) parcel.readParcelable(PasswordState.class.getClassLoader());
        if (Build.VERSION.SDK_INT >= 29) {
            this.A05 = parcel.readBoolean();
        } else {
            this.A05 = parcel.readInt() != 1 ? false : true;
        }
    }
}
