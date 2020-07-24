package com.instagram.profile.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass6KD;
import p000X.C145496Jw;

public class AutoLaunchReelParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(447);
    public final C145496Jw A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public AutoLaunchReelParams(AnonymousClass6KD r2) {
        this.A00 = r2.A07;
        this.A04 = r2.A08;
        this.A03 = r2.A02;
        this.A05 = r2.A06;
        this.A02 = r2.A01;
        this.A01 = r2.A00;
        this.A07 = r2.A04;
        this.A08 = r2.A05;
        this.A06 = r2.A03;
    }

    public AutoLaunchReelParams(Parcel parcel) {
        this.A00 = (C145496Jw) parcel.readSerializable();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        boolean z = false;
        this.A05 = parcel.readInt() == 1;
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A07 = parcel.readInt() == 1;
        this.A08 = parcel.readInt() == 1;
        this.A06 = parcel.readInt() == 1 ? true : z;
    }
}
