package com.instagram.pendingmedia.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.typedurl.ImageUrl;
import p000X.AnonymousClass17M;
import p000X.C13300iJ;
import p000X.C13320iL;
import p000X.C13390iS;

public class PendingRecipient implements C13320iL, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(76);
    public int A00 = 0;
    public ImageUrl A01;
    public C13390iS A02 = C13390iS.FollowStatusUnknown;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05 = Boolean.FALSE;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public final int describeContents() {
        return 0;
    }

    public final boolean A00() {
        Boolean bool = this.A08;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final String AMN() {
        return this.A09;
    }

    public final int ANw() {
        return this.A00;
    }

    public final ImageUrl ASv() {
        return this.A01;
    }

    public final String AZn() {
        return this.A0B;
    }

    public final boolean AeV() {
        Boolean bool = this.A04;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean AhI() {
        Boolean bool = this.A06;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AnonymousClass17M.A00(this.A0A, ((PendingRecipient) obj).A0A);
    }

    public final String getId() {
        return this.A0A;
    }

    public final int hashCode() {
        return this.A0A.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A09);
        parcel.writeValue(this.A08);
        parcel.writeValue(this.A06);
        parcel.writeValue(this.A03);
        parcel.writeValue(this.A07);
        parcel.writeValue(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeValue(this.A05);
        parcel.writeValue(this.A02);
        parcel.writeValue(Boolean.valueOf(this.A0C));
    }

    public PendingRecipient() {
    }

    public PendingRecipient(C13300iJ r3) {
        boolean z;
        this.A0A = r3.getId();
        this.A0B = r3.AZn();
        this.A01 = r3.ASv();
        this.A09 = r3.AMN();
        this.A08 = Boolean.valueOf(r3.A0s());
        this.A06 = Boolean.valueOf(r3.AhI());
        this.A03 = Boolean.valueOf(r3.A0e());
        Boolean bool = r3.A1K;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.A07 = Boolean.valueOf(z);
        this.A04 = Boolean.valueOf(r3.AeV());
        this.A00 = r3.ANw();
        this.A05 = Boolean.valueOf(r3.A34);
        this.A02 = r3.A0M;
        this.A0C = Boolean.TRUE.equals(r3.A0u);
    }

    public PendingRecipient(Parcel parcel) {
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A01 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        this.A09 = parcel.readString();
        Class<Boolean> cls = Boolean.class;
        this.A08 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.A06 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.A03 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.A07 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.A04 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.A00 = parcel.readInt();
        this.A05 = (Boolean) parcel.readValue(cls.getClassLoader());
        this.A02 = (C13390iS) parcel.readValue(C13390iS.class.getClassLoader());
        this.A0C = ((Boolean) parcel.readValue(cls.getClassLoader())).booleanValue();
    }

    public PendingRecipient(String str, String str2) {
        this.A0A = str;
        this.A0B = str2;
        this.A01 = null;
    }
}
