package com.instagram.model.direct.gifs;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.AnonymousClass11J;
import p000X.C60142jO;
import p000X.C60262ja;

public class DirectAnimatedMedia implements Parcelable, C60142jO {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(55);
    public float A00;
    public float A01;
    public C60262ja A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    public final int describeContents() {
        return 0;
    }

    public static DirectAnimatedMedia A00(DirectAnimatedMedia directAnimatedMedia) {
        return new DirectAnimatedMedia(directAnimatedMedia.A03, directAnimatedMedia.A04, directAnimatedMedia.A01, directAnimatedMedia.A00, true, directAnimatedMedia.A06, directAnimatedMedia.A02);
    }

    public final C60262ja AZe() {
        return this.A02;
    }

    public final boolean Aht() {
        return this.A06;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
    }

    public DirectAnimatedMedia() {
    }

    public DirectAnimatedMedia(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
        boolean z = true;
        this.A05 = parcel.readByte() != 0;
        this.A06 = parcel.readByte() == 0 ? false : z;
    }

    public DirectAnimatedMedia(String str, String str2, float f, float f2, boolean z, boolean z2, C60262ja r7) {
        this.A03 = str;
        AnonymousClass11J.A00(str2);
        this.A04 = str2;
        this.A01 = f;
        this.A00 = f2;
        this.A05 = z;
        this.A06 = z2;
        this.A02 = r7;
    }
}
